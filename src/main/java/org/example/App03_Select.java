package org.example;

import java.sql.*;

public class App03_Select {

    public static final String URL="jdbc:mysql://localhost/adt3_ejemplo1";
    public static final String USER = "root";
    public static final String PWD = "";


    public static void main(String[] args) {

        try (Connection conexion = DriverManager.getConnection(URL, USER, PWD)) {


            metodoPrimero(conexion);

            metodoSegundo(conexion);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static void metodoSegundo(Connection conexion) throws SQLException {
        System.out.println("------------  METODO SEGUNDO  ------------------------");

        String sql="Select * " +
                "from articulos";

        Statement sentencia= conexion.createStatement();
        ResultSet filas = sentencia.executeQuery(sql);

        while (filas.next()){
            String nombre=filas.getString(2);
            float precio = filas.getFloat(3);
            int stock=filas.getInt("stock");

            System.out.println("Articulo: "+nombre+" "+precio+" "+stock);
        }

    }

    private static void metodoPrimero(Connection conexion) throws SQLException {
        String sql="Select Nombre,precio,stock " +
                "from articulos";

        Statement sentencia= conexion.createStatement();
        ResultSet filas = sentencia.executeQuery(sql);

        while (filas.next()){
            String nombre=filas.getString("nombre");
            float precio = filas.getFloat("precio");
            int stock=filas.getInt("stock");

            System.out.println("Articulo: "+nombre+" "+precio+" "+stock);
        }


    }
}
