/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojatelefonia.db.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import lojatelefonia.db.utils.ConnectionUtils;

/**
 *
 * @author matheus.esanto1
 */
public class SqlTest {

    private static Connection con = null;

    public static void main(String[] args) {
        try {
            //Obtem conexão com o banco.
            con = ConnectionUtils.getConnection();
            //insert();
            //listAll();
            //update();
            //delete();
            System.out.println("Sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void insert() throws SQLException {
        String sql = "INSERT INTO cliente values (0, 'Maria', 22)";

        Statement stmt = con.createStatement();

        stmt.execute(sql);
    }

    private static void listAll() throws SQLException {
        String sql = "SELECT * FROM cliente";

        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            System.out.println(rs.getString("nome") + " "
                    + rs.getInt("idade"));
        }
    }

    private static void delete() throws SQLException {
        String sql = "DELETE FROM cliente WHERE id = 0";

        Statement stmt = con.createStatement();

        stmt.execute(sql);
    }

    private static void update() throws SQLException {
        String sql = "UPDATE cliente set nome = 'Jose', idade =55 WHERE id = 0";

        Statement stmt = con.createStatement();

        stmt.execute(sql);
    }
}
