package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PracticaStatement {
    public static void main(String[] args) {

        try (Connection conexion = DriverManager.getConnection(App01.URL, App01.USER, App01.PWD)) {


          //insertarValor(conexion);
          //  modificarValor(conexion);
             borrarValor(conexion);


        } catch (SQLException e) {
            System.out.println("Error en la base "+e);
        }
    }

    private static void borrarValor(Connection conexion) throws SQLException {
        String valor= "Delete from articulos where id='b15'";

        Statement sentencia=conexion.createStatement();

        int filas = sentencia.executeUpdate(valor);
        System.out.println("Se borraron "+filas+((filas>1)?" filas":" fila"));
    }

    private static void modificarValor(Connection conexion) throws SQLException {
        String valor = "UPDATE articulos SET " +
                "id = 'b15', nombre = 'Entrada2', precio = 150.00, stock = 2, " +
                "imagen = NULL, descripcion = 'ValorModificado' " +
                "WHERE id = 'b12';";

        Statement sentencia= conexion.createStatement();

        int filas = sentencia.executeUpdate(valor);

        System.out.println("Se modifico "+filas+((filas>1)?" filas":" fila"));

    }

    private static void insertarValor(Connection conexion) throws SQLException {
        String valor= "INSERT INTO articulos " +
                "(id=12 nombre Modificacion precio = stock, imagen, descripcion)" +
                "VALUES('b12', 'Entrada', 550.00, 5, NULL, 'ValorNuevo');";
        Statement sentencia = conexion.createStatement();
        int filas = sentencia.executeUpdate(valor);
        System.out.println("Se introdujeron "+filas+((filas>1)?" filas":" fila"));
    }
}
