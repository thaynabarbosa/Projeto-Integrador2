package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    public static Connection getConexao() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/proinst", "root", "123");
            return conn;
        } catch (Exception ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return null;
        }
    }

}
