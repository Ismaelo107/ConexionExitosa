package com.example.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection c =null;

    public static final String URL = "jdbc:mysql://localhost/bdalumno";
    public static final String USERNAME = "useralu";
    public static final String PASSWORD = "12345678";


    public static Connection getConnection() {
        try {
            c = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            System.out.println("Conexion exitosa");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return c;
    }

}
