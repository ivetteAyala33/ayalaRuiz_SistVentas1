
package pojos;


public class Producto {
    
    private int idProd;
    private String codigo;
    private String descrip;
    private String proveedor;
    private int stock;
    private float precio;

    //constructor
    public Producto() {
    }
    
    //constructor con parametros

    public Producto(int idProd, String codigo, String descrip, String proveedor, int stock, float precio) {
        this.idProd = idProd;
        this.codigo = codigo;
        this.descrip = descrip;
        this.proveedor = proveedor;
        this.stock = stock;
        this.precio = precio;
    }
    
    
    //metodos getter y setter

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
    
    
   
            
    
}
