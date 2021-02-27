package Model;

import java.sql.*;

public class Connect {
    protected Connection connection;

    public Connection connect() {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:banco_dados/login.db");
            System.out.println("Conexão efetuada com sucesso !!");
            return connection;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public Connection desconnect(){
        try {
            if(connection != null){
                connection.close();
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

}


