package com.inspector.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class Conexion {

    private Connection cn;
    Connection getConexion() {
        try {
            if (cn == null || !cn.isClosed()) {
                cn = DriverManager.getConnection("jdbc:postgresql://173.82.106.196:5432/desadb", "ccadmin","ccadmin");
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener conexion");
        }
        return cn;
    }

    void cerrar() {
        if (cn != null) {
            try {
                cn.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar conexion");
            }
        }
    }

}
