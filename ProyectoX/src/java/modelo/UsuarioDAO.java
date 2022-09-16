package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAO {
        Conexion cn = new Conexion();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        
        public Usuario validar(String nombre, String clave){
            //instancimos un objeto de la entidad usuario
            Usuario usuario = new Usuario();
            //Agregar una variable de tipo String para que muestre nuestra consulta SQL
            //Select * from Usuario where usuario = "" and DPIEmpleado = "";
            String sql = "select * from Usuario where nombre = ? and clave = ?";
            try{
<<<<<<< HEAD
                con = cn.Conexion();
=======
                con = cn.getConnection();
>>>>>>> jrodas-2021418
                ps = con.prepareStatement(sql);
                ps.setString(1, nombre);
                ps.setString(2, clave);
                rs = ps.executeQuery();
                while(rs.next()){
                    usuario.setIdUsuario(rs.getInt("idUsuario"));
                    usuario.setNombre(rs.getString("nombre"));
                    usuario.setEmail(rs.getString("email"));
                    usuario.setClave("clave");
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        
        return usuario;         //usuario encontrado
    }
}
