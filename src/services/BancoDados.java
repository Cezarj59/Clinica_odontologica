
package services;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BancoDados {

    public static Connection conectar() {
        String host = "localhost";
        String port = "3306";
        String banco = "clinicaOdontologica";
        String url = "jdbc:mysql://" + host + ":" + port + "/" + banco;

        String user = "root";
        String pass = "";

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, pass);

        } catch (SQLException e) {
            System.err.println("ERRO AO CONECTAR: " + e);
        }
        return conn;
    }

    public static void fecha(Connection c) {
        try {
            c.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
}