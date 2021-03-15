package com.mycompany.herencias2;

public abstract class Figura {
    
    String nombre;
    int grosorBorde;
    int color;
    
    public Figura(){
        
    }
    
    public Figura(String nombre, int grosorBorde, int color){
        
        this.nombre = nombre;
        this.grosorBorde = grosorBorde;
        this.color = color;
    }
    
    public abstract void dibujar();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGrosorBorde() {
        return grosorBorde;
    }

    public void setGrosorBorde(int grosorBorde) {
        this.grosorBorde = grosorBorde;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
    
    
}
