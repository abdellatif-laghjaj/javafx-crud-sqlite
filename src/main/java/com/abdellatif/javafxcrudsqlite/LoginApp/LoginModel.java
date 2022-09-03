package com.abdellatif.javafxcrudsqlite.LoginApp;

import com.abdellatif.javafxcrudsqlite.DbUtil.DbConnection;

import java.sql.Connection;

public class LoginModel {
    Connection connection;

    public LoginModel() {
        try {
            this.connection = DbConnection.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if(this.connection == null){
            System.exit(1);
        }
    }
}
