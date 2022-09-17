<%-- 
    Document   : Articulo
    Created on : 15/09/2022, 11:30:02 PM
    Author     : rodas
--%>

<%@page import="java.sql.Statement"%>
<%@page import="config.Conexion"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.util.Iterator"%>
<%@page import="modelo.Articulo"%>
<%@page import="modelo.ArticuloDAO"%>
<%@page import="java.util.List"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Articulos</title>
        <h1>Articulos</h1>
    </head>
    <body>
       
        
        
        
        
        
        <center>
            <div>
                <form action="controlador" method="POST">  
                </form>
                <table border="1">
                    <thead>
                        <tr>
                            <th>IdArticulo</th>
                            <th>IdCategoria</th>
                            <th>Nombre</th>
                            <th>Precio</th>
                            <th>stock</th>
                            <th>descripcion</th>
                            
                        </tr>
                    </thead>
                  <%
                  ArticuloDAO dao = new ArticuloDAO();
                  List<Articulo> list = dao.listar();
                  Iterator<Articulo> iterator = list.iterator();
                  Articulo a = null;
                  while (iterator.hasNext()){
                      a = iterator.next();
                  %>
                    
                  <tbody>
                         <tr>
                            <td><%=a.getIdArticulo()%></td>
                            <td><%=a.getIdCategoria()%></td>
                            <td><%=a.getNombre()%></td>
                            <td><%=a.getPrecio_venta()%></td>
                            <td><%=a.getStock()%></td>
                            <td><%=a.getDescripcion()%></td>
                           
                            
                            
                          <td>
                        <form action="controlador" method="POST">
                        <input type="submit" name="accion" value="Agregar al Carrito">
                        
                   </form>
                         </td>
                        </tr>
                        <%}%>  
                </table>
            </div>
        </center>
    </tbody>            
    </body>
</html>

