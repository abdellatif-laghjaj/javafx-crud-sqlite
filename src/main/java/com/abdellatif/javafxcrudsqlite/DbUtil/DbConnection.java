package com.abdellatif.javafxcrudsqlite.DbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "123456";
    private static final String CONN = "jdbc:sqlite:data_db.sqlite";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection(CONN);
        } catch (ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }
}
