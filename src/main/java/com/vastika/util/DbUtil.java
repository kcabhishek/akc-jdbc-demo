package com.vastika.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
    public static final String DRIVER =  "com.mysql.cj.jdbc.Driver";
    public static final String URL =  "jdbc:mysql://localhost:3306/akc_db";
    public static final String USER_NAME =  "root";
    public static final String PASSWORD =  "toor";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER);
        return DriverManager.getConnection(URL,USER_NAME,PASSWORD);
    }
}
