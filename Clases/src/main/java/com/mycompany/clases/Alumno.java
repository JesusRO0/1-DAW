
package com.mycompany.clases;

import java.util.Arrays;

public class Alumno {
    
    String nombre;
    String apellido1;
    String apellido2;
    int edad;
    int telefono;
    String dni;
    int expediente;
    String correo;
    String nombrePadre;
    String nombreMadre;
    int tlfMadre;
    int tlfPadre;
    Direccion[] direcciones;
    int anno;

    public Alumno(String nombre, String apellido1, String apellido2, String dni,int anno, int telefono, int edad, int expediente, String correo, String nombrePadre, String nombreMadre, int tlfPadre, int tlfMadre, Direccion[] direcciones){
    
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.correo = correo;
        this.dni = dni;
        this.expediente = expediente;
        this.telefono = telefono;
        this.edad = edad;
        this.nombrePadre = nombrePadre;
        this.nombreMadre = nombreMadre;
        this.tlfPadre = tlfPadre;
        this.tlfMadre = tlfMadre;
        this.direcciones = direcciones;
        
}

    Alumno() {
     
    }
    

    public String toString(){
        
       return "Nombre: "+nombre+ "\n"+"Apellidos: " +apellido1+" "+apellido2+ "\n"+"Correo: "+correo+
               "\n"+ "dni: "+dni+ "\n"+ "Número de Expediente: "+expediente+ "\n"+ "Teléfono: " +telefono+ 
               "\n"+ "Edad: " +edad+ "\n"+ "Nombre del Padre: " +nombrePadre+ "\n"+ "Nombre de la Madre: " +nombreMadre+ "\n"+
               "Telefono del Padre: "+tlfPadre+ "\n"+ "Teléfono de la Madre: "+ tlfMadre+ "\n"+ "Direcciónes: " +Arrays.toString(direcciones)+ "\n"
               +"Año del curso: "+anno+ "\n";

}
    public void setAnno(int anno){
            
            this.anno = anno;
        }
    
    public int getAnno(){
            
            return anno;
        }
}
 