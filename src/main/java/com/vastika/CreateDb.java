package com.vastika;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDb {
    public static final String DRIVER =  "com.mysql.cj.jdbc.Driver";
    public static final String URL =  "jdbc:mysql://localhost:3306/";
    public static final String USER_NAME =  "root";
    public static final String PASSWORD =  "toor";
    public static final String SQL =  "create database akc_db";

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;

        try {
            //register the driver
            Class.forName(DRIVER);
            //obtain the connection object
            con= DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            //obtain the statement object
            st = con.createStatement();
            //execute the query
            st.executeUpdate(SQL);
            System.out.println("DB Created");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            try {
                //Close the connection
                con.close();
                st.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
