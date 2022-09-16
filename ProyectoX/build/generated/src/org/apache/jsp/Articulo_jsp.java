package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import config.Conexion;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Iterator;
import modelo.Articulo;
import modelo.ArticuloDAO;
import java.util.List;

public final class Articulo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Articulos</title>\n");
      out.write("        <h1>Articulos</h1>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <center>\n");
      out.write("            <div>\n");
      out.write("                <form action=\"controlador\" method=\"POST\">  \n");
      out.write("                </form>\n");
      out.write("                <table border=\"1\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>IdArticulo</th>\n");
      out.write("                            <th>IdCategoria</th>\n");
      out.write("                            <th>Nombre</th>\n");
      out.write("                            <th>Precio</th>\n");
      out.write("                            <th>stock</th>\n");
      out.write("                            <th>descripcion</th>\n");
      out.write("                            \n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                  ");

                  ArticuloDAO dao = new ArticuloDAO();
                  List<Articulo> list = dao.listar();
                  Iterator<Articulo> iterator = list.iterator();
                  Articulo a = null;
                  while (iterator.hasNext()){
                      a = iterator.next();
                  
      out.write("\n");
      out.write("                    \n");
      out.write("                  <tbody>\n");
      out.write("                         <tr>\n");
      out.write("                            <td>");
      out.print(a.getIdArticulo());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(a.getIdCategoria());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(a.getNombre());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(a.getPrecio_venta());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(a.getStock());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(a.getDescripcion());
      out.write("</td>\n");
      out.write("                           \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                          <td>\n");
      out.write("                        <form action=\"controlador\" method=\"POST\">\n");
      out.write("                        <input type=\"submit\" name=\"accion\" value=\"Agregar al Carrito\">\n");
      out.write("                        \n");
      out.write("                   </form>\n");
      out.write("                         </td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
}
      out.write("  \n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </center>\n");
      out.write("    </tbody>            \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
