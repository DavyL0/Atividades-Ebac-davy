package org.example.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Project: exemplojdbc
 * Package: org.example.dao.jdbc
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 11/02/2025
 * Time: 13:42
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
                    "jdbc:postgresql://localhost:5432/vendas_online", "postgres", "admin"
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
