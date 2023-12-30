/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package conexion;

//librerias de conexion
import java.sql.Connection;//conexion a BD
import java.sql.DriverManager;//driver de conexion
import java.sql.ResultSet;//resultado final de datos
import java.sql.ResultSetMetaData;//resultado de metadatos
import java.sql.SQLException;//Tratamiento de Errros de BD SQL
import java.sql.Statement;//Generador de sentencias SQL
import javax.swing.JOptionPane;//ventanas emergentes

public class ConexionBD {//inicia lcase
    //clases de conexion y sus objetos
public Connection cn;//conexion a BD
public Statement stmt;//Generador de sentencias SQL
public ResultSet rs;//resultado final de datos
   
     //metodo para conectar a base de datos
public void conectarBase(){
    try{ //inicia try
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost/sistemaventas","ubdis","udl123");
            JOptionPane.showMessageDialog(null, "Conexion a BD OK\n\nAYALA");
            stmt=cn.createStatement();//genera sentencias sobre objetos de base de datos
    }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error de base de datos 1: \n"+ ex);
    }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error de base de datos 2:"+ e);
    }
}//termina metodo conectar
   
   //Para realizar prueba de conexion simple a base de datos
     public static void main(String[] args) {
           ConexionBD pruebaBD = new ConexionBD();
           pruebaBD.conectarBase();
    }//termina main
   
}//termina clase