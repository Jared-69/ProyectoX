/*
  Aqui debo trabajar 
/*
*/
package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rodas
 */
public class ArticuloDAO implements Metodos {
        Connection con;
        Conexion conect=new Conexion();
        PreparedStatement ps;
        ResultSet rs;
        Articulo aArticulo = new Articulo();

    @Override
    public List listar() {
        ArrayList<Articulo>list= new ArrayList<>();
        String sql = "select * from  Articulo";
        try{
            con=conect.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Articulo nuevoArticulo=new Articulo();
                nuevoArticulo.setIdArticulo(rs.getInt("idArticulo"));
                nuevoArticulo.setIdCategoria(rs.getInt("idCategoria"));
                nuevoArticulo.setNombre(rs.getString("nombre"));
                nuevoArticulo.setPrecio_venta(rs.getDouble("precio_venta"));
                nuevoArticulo.setStock(rs.getInt("stock"));
                nuevoArticulo.setDescripcion(rs.getString("descripcion"));
                list.add(nuevoArticulo);
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
  

    @Override
    public Articulo list(int id) {
         String sql="select * from Articulo where codigoArticulo="+ id;
            try{
                  con = conect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                aArticulo.setIdArticulo(rs.getInt("idArticulo"));
                aArticulo.setIdCategoria(rs.getInt("idCategoria"));
                aArticulo.setNombre(rs.getString("nombre"));
                aArticulo.setPrecio_venta(rs.getDouble("precio_venta"));
                aArticulo.setStock(rs.getInt("stock"));
                aArticulo.setDescripcion(rs.getString("descripcion"));
                
            }
            }catch(Exception e){
                e.printStackTrace();
            }
            return aArticulo;
    }
}
