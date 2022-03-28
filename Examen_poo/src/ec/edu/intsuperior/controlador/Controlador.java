/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;
import ec.edu.intsuperior.vista.Loggin;
import ec.edu.intsuperior.vista.Administrador;
import ec.edu.intsuperior.vista.Docente;
import ec.edu.intsuperior.vista.Estudiante;

/**
 *
 * @author PC
 */
public class Controlador {
    Loggin loggin = new Loggin(this);
    Administrador administrador = new Administrador(this);
    Docente docente=new Docente(this);
    Estudiante estudiante=new Estudiante(this);
    
public void showLoggin(){
    loggin.setVisible(true);
} 
public void showAdministrador(){
        administrador.setVisible(true);
    }
public void showDocente(){
        docente.setVisible(true);
    }
public void showEstudiante(){
    
    estudiante.setVisible(true);
}
}
