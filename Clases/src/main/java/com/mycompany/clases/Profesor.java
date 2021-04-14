
package com.mycompany.clases;

import java.util.Arrays;

public class Profesor {
    
    int identificador;
    String dni;
    String nombre;
    String apellido1;
    String apellido2;
    String departamento;
    
    
public Profesor(int idProfesor, String dniProfesor, String nombreProfesor, String apellido1Prof, String apellido2Prof, String despartamento){
    
    this.identificador = idProfesor;
    this.dni = dniProfesor;
    this.nombre = nombreProfesor;
    this.apellido1 = apellido1Prof;
    this.apellido2 = apellido2Prof;
    this.departamento = departamento;
    
}

Profesor(){
    
}

public String toString(){
        
       return "idProfesor: "+ identificador + "\n"+ "dni: "+ dni+ "\n"+ "Nombre del Profesor: "+nombre+ "\n"+"Primer apellido del Profesor: "+
               apellido1+"\n"+ "Segundo apellido del Profesor :" +apellido2+"\n"+ "Departamento: "+departamento+"\n";
}
}