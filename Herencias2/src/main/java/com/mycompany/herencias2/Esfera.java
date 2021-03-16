
package com.mycompany.herencias2;

public class Esfera extends Figura3D{
    
    private int radio;
    
    public Esfera(){
        
    }
    
    public Esfera(int radio, String nombre, int grosorBorde, int color) {
        super(nombre, grosorBorde, color);
        this.radio = radio;
    }
    
    public int calcularVolumen() {
        System.out.println("El Volumen es... " +Math.PI*Math.pow(radio,2));
        return 0;
    }
    
    public void dibujar(){
        System.out.println("Dibujar Esfera");  
    }

    public boolean equals(Esfera a){
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
