package com.abdellatif.javafxcrudsqlite.LoginApp;

import com.abdellatif.javafxcrudsqlite.DbUtil.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginModel {
    Connection connection;

    public LoginModel() {
        try {
            this.connection = DbConnection.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (this.connection == null) {
            System.exit(1);
        }
    }

    public boolean isConnected() {
        return this.connection != null;
    }

    public boolean isLogin(String user, String password, String option) throws Exception {
        PreparedStatement pr = null;
        ResultSet rs = null;

        String sql = "select * from login where username = ? and password = ? and division = ?";

        try {
            pr = this.connection.prepareStatement(sql);
            pr.setString(1, user);
            pr.setString(2, password);
            pr.setString(3, option);
            pr.setString(4, option);

            rs = pr.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            pr.close();
            rs.close();
        }
        return rs.next();
    }
}
