
package modelo;

/**
 *
 * @author rodas
 */
public class Articulo {
    
     private int idArticulo;
    private int idCategoria;
    private String nombre;
    private Double precio_venta;
    private int stock;
    private String descripcion;
    

    public Articulo() {
        
    }

    public Articulo(int idArticulo, int idCategoria, String nombre, Double precio_venta, int stock, String descripcion) {
        this.idArticulo = idArticulo;
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.precio_venta = precio_venta;
        this.stock = stock;
        this.descripcion = descripcion;
       
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(Double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

   
    
    
    
}

    

