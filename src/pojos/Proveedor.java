/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pojos;

/**
 *
 * @author ivis3
 */
public class Proveedor {
    //atributos
    private int idProve;
    private String rfcProve;
    private String nombrePro;
    private String dirProve;
    private String codposProve;
    private String telProve;
    private String mailProve;   

//constructor
    
    public Proveedor (){
} 

//constructor con parametros

    public Proveedor(int idProve, String rfcProve, String nombrePro, String dirProve, String codposProve, String telProve, String mailProve) {
        this.idProve = idProve;
        this.rfcProve = rfcProve;
        this.nombrePro = nombrePro;
        this.dirProve = dirProve;
        this.codposProve = codposProve;
        this.telProve = telProve;
        this.mailProve = mailProve;
    }
    
    
    //metodos de acceso getter y setter

    public int getIdProve() {
        return idProve;
    }

    public void setIdProve(int idProve) {
        this.idProve = idProve;
    }

    public String getRfcProve() {
        return rfcProve;
    }

    public void setRfcProve(String rfcProve) {
        this.rfcProve = rfcProve;
    }

    public String getNombrePro() {
        return nombrePro;
    }

    public void setNombrePro(String nombrePro) {
        this.nombrePro = nombrePro;
    }

    public String getDirProve() {
        return dirProve;
    }

    public void setDirProve(String dirProve) {
        this.dirProve = dirProve;
    }

    public String getCodposProve() {
        return codposProve;
    }

    public void setCodposProve(String codposProve) {
        this.codposProve = codposProve;
    }

    public String getTelProve() {
        return telProve;
    }

    public void setTelProve(String telProve) {
        this.telProve = telProve;
    }

    public String getMailProve() {
        return mailProve;
    }

    public void setMailProve(String mailProve) {
        this.mailProve = mailProve;
    }
    
    


    
    
    
    
    
    
    



}


