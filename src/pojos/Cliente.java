
package pojos;


public class Cliente {
    //atributos
    private int idcliente;
    private String rfc;
    private String nombre;
    private String direccion;
    private String codpostal;
    private String telefono;
    private String email;
    
    //constructor

    public Cliente() {
    }
    
    //constructor que pasa parametros a los objetos

    public Cliente(int idcliente, String rfc, String nombre, String direccion, String codpostal, String telefono, String email) {
        this.idcliente = idcliente;
        this.rfc = rfc;
        this.nombre = nombre;
        this.direccion = direccion;
        this.codpostal = codpostal;
        this.telefono = telefono;
        this.email = email;
    }
    
    //metodos de acceso getter y setter

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodpostal() {
        return codpostal;
    }

    public void setCodpostal(String codpostal) {
        this.codpostal = codpostal;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
