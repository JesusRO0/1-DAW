package com.mycompany.clases;

public class Departamento {
    
    int identificador ;
    String nombre;

    public Departamento(int identidficador, String nombre){
        
        this.identificador=identificador;
        this.nombre=nombre;
    }
    
    Departamento(){
        
    }
    
    public String toString(){
        
       return "Identificador del Dep: "+identificador+"\n"+"Nombre del Departamento: "
               +nombre+ "\n";
               
   }
    
}