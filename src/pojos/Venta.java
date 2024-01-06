
package pojos;


public class Venta {
    
    private int idVenta;
    private String formaPago;
    private double totalPagar;
    private String fechaVenta;

    public Venta() {
    }

    public Venta(int idVenta, String formaPago, double totalPagar, String fechaVenta) {
        this.idVenta = idVenta;
        this.formaPago = formaPago;
        this.totalPagar = totalPagar;
        this.fechaVenta = fechaVenta;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
    
    
    
    
}
