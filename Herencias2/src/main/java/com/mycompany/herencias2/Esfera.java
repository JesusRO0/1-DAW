
package com.mycompany.herencias2;

public abstract class Esfera extends Figura{
    
    private int radio;
    
    public Esfera(){
        
    }

    public Esfera(int radio) {
        this.radio = radio;
    }

    public Esfera(int radio, String nombre, int grosorBorde, int color) {
        super(nombre, grosorBorde, color);
        this.radio = radio;
    }
    
    public double calcularVolumen() {
        System.out.println("El Volumen es... " +Math.PI*Math.pow(radio,2));
        return 0;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    
}
