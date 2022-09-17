package modelo;

public class Usuario {
    private int idUsuario;
    private String nombre;
    private String email;
    private String clave;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombre, String email, String clave) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.email = email;
        this.clave = clave;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
}
