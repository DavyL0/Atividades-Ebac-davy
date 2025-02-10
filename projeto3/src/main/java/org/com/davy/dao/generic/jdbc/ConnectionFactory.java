package org.com.davy.dao.generic.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Project: projeto3
 * Package: org.com.davy.dao.generic.jdbc.dao
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 10/02/2025
 * Time: 10:56
 * <p>
 */
public class ConnectionFactory {

    private static Connection connection;

    private ConnectionFactory(Connection connection) {
    }

    public static Connection getConnection() {
        if (connection == null) {
            connection = initConnection();
        }
        return connection;
    }

    private static Connection initConnection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/venda_online", "postgres", "admin"
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
