package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection conexion;
    public Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql//localhost:3306/DB_ProyectoX?userSSL=false", "root", "admin");
        }catch(Exception e){
            e.printStackTrace();
            System.out.print("La conexion no se pudo establecer" + e.getMessage());
        }
        
    }
    
    public Connection getConnection(){
        return conexion;
    }
}
