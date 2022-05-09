package com.revature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionFactory {
    private static Connection connection = null;

    private ConnectionFactory(){
        this.connection = ConnectionFactory.getConnection();

    }

    public static Connection getConnection(){
        if (connection == null){
            ResourceBundle bundle = ResourceBundle.getBundle("com/revature/dbConfig");
            String url = bundle.getString("url");
            String username = bundle.getString("user");
            String password = bundle.getString("password");
            try {
                connection = DriverManager.getConnection(url,username,password);
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
            return connection;
    }
    public static void closeConnection() throws SQLException {
        connection.close();
    }

}
