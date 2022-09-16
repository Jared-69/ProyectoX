package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
<<<<<<< HEAD
    Connection conexion;
    
    
    public Connection Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql//localhost:3306/DB_ProyectoX?userSSL=false", "root", "andersson2004");
=======
    Connection con;
    
    
    public Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DB_ProyectoX?useSSL=false", "root", "27012004estuardoS");
>>>>>>> jrodas-2021418
        }catch(Exception e){
            e.printStackTrace();
            System.out.print("La conexion no se pudo establecer" + e.getMessage());
        }
<<<<<<< HEAD
        return conexion;
=======
        return con;
>>>>>>> jrodas-2021418
    }
}
