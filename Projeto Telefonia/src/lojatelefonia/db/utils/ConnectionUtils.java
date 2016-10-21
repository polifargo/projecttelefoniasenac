/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojatelefonia.db.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author matheus.esanto1
 */
public class ConnectionUtils {

    private static Connection connection = null;

    public static Connection getConnection() throws SQLException {
        //Só tenta abrir uma conexão se não existe uma aberta.
        if (connection == null || connection.isClosed()) {
            //Endereço de conexão com o banco.
            String dbURL = "jdbc:derby://localhost:1527/jdbc_test";

            //Propriedades para armazenamento de usuário e senha.
            Properties properties = new Properties();
            properties.put("user", "utest");
            properties.put("password", "test");
            //Realiza a conexão com o banco.
            connection = DriverManager.getConnection(dbURL, properties);
        }
        //Retorna conexão.
        return connection;
    }

}
