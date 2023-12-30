
package pojos;


public class Usuario {//inicia clase
    //atributos
    private int idUsuario;
    private String usuario;
    private String password;
    
    //constructor

    public Usuario() {
    }

    //constructor que pasa parametros a los objetos
    public Usuario(int idUsuario, String usuario, String password) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.password = password;
    }
    
    //metodos de acceso getter y setter

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}//termina clase
