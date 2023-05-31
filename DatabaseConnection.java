package com.example.tpc_9_plutoplanetnine;
import java.sql.Connection;
import java.sql.DriverManager;
public class DatabaseConnection {
    public Connection databaseLink;

    public Connection getConnection(){
        String databaseName = "pocbase";
        String databaseUser ="root";
        String databasePassword = "Ricky2003";
        String url ="jdbc:mysql://localhost/" + databaseName;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url,databaseUser,databasePassword);
        }catch (Exception e){
            e.printStackTrace();
        }
        return databaseLink;
    }
}
