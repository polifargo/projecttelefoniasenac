/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojatelefonia.services.utils;

import lojatelefonia.db.utils.ConnectionUtils;
import java.sql.Connection;

/**
 *
 * @author ffreire
 */
public class ServiceUtils {

    public static boolean checkConnection() {
        boolean validConnection = false;
        Connection connection = null;
        try {
            connection = ConnectionUtils.getConnection();
            if (connection != null && connection.isValid(1000)) {
                validConnection = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return validConnection;
    }
}
