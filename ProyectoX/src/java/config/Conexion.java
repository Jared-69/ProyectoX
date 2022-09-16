package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection con;
    
    
    public Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DB_ProyectoX?useSSL=false", "root", "27012004estuardoS");
        }catch(Exception e){
            e.printStackTrace();
            System.out.print("La conexion no se pudo establecer" + e.getMessage());
        }
        return con;
    }
}
