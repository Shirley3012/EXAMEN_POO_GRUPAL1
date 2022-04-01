/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author PC
 */
public class Conexion {
    private static Connection conexion;
    
    public static Connection getConnection(String bddName,String user,String Password){
        try {
            conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+bddName,user,Password);
            System.out.println("Conexion exitosa");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conexion;
    }
     public static void closeConexion (String bddName,String user,String Password){
        try {
            getConnection(bddName,user,Password).close();
            System.out.println("Conexion cerrada exitosamente");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
     }
    
    
   
    
   
    
}
