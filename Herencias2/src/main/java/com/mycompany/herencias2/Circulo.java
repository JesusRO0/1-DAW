package com.mycompany.herencias2;

public class Circulo extends Figura2D{
    
    private int radio;
    
    public Circulo(){
        
    }

    public Circulo(int radio, String nombre, int grosorBorde, int color) {
        super(nombre, grosorBorde, color);
        this.radio = radio;
    }
    
     @Override
    public int calcularArea() {
    
        System.out.println("El area es... " + Math.PI*Math.pow(radio,2));
        return 0;
        
    }

    @Override
    public int calcularPerimetro() {
        int perimetro;
        perimetro = radio=2;
        return perimetro;
     
    }
    
    public int cambiarTamaño(){
        int tamaño;
        tamaño = radio+radio;
        return tamaño;
        
    }

    @Override
    public void dibujar() {
       System.out.println("Dibujar Circulo");
    }
    
    
    public boolean equals(Circulo a){
        if(this.nombre.equals(a.radio)){
            return true;
        }return false;
        
    }

    @Override
    public String toString() {
        return super.toString() + "radio: " + radio;
    }
   
    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    
    
    
}
