package org.example;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App03_Procedures {

    public static final String URL = "jdbc:mysql://localhost/adt3_ejemplo1";
    public static final String USER = "root";
    public static final String PWD = "";

    public static void main(String[] args) {



        try (Connection conexion = DriverManager.getConnection(URL, USER, PWD)) {

            //eliminarTodosLosArticulos(conexion);
            //cargarTabla(conexion);
           // eliminarArticulo(conexion, "reloj 2");





        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static void eliminarArticulo(Connection conexion, String valor) throws SQLException {

        String sentencia="call eliminar_articulo(?)";
        CallableStatement procedimiento= conexion.prepareCall(sentencia);
        procedimiento.setString(1,valor);
        procedimiento.execute();
        System.out.println("articulo eliminado");

    }

    private static void cargarTabla(Connection conexion) throws SQLException {
        String sentencia = "call cargar_tabla";
        CallableStatement procedimiento = conexion.prepareCall(sentencia);
        procedimiento.execute();
        System.out.println("Procedimiento ejecutado, tabla cargada");

    }

    private static void eliminarTodosLosArticulos(Connection conexion) throws SQLException {
        String sentenciaSql = "call eliminar_todos_los_productos";
        CallableStatement procedimiento = conexion.prepareCall(sentenciaSql);
        procedimiento.execute();
        System.out.println("Procedimiento ejecutado, articulos borrados");
    }
}
