package lojatelefonia.db.utils;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {

    public static void main(String[] args) throws SQLException {
        Connection connection = new ConnectionUtils().getConnection();
        System.out.println("Conexão aberta!");
        connection.close();
    }
}
