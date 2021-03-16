package com.mycompany.herencias2;

public class Cubo extends Figura3D{
    
    private Cuadrado cuadrado;
    
    public Cubo(){
        
    }

    public Cubo(Cuadrado cuadrado , String nombre, int grosorBorde, int color) {
        super(nombre, grosorBorde, color);
        this.cuadrado = cuadrado;
    }

    @Override
    public void dibujar() {
            System.out.println("Dibujar Cubo");
    }

    @Override
    public int calcularVolumen() {
        int volumen;
        volumen = cuadrado.getLado()+cuadrado.getLado()+cuadrado.getLado()+cuadrado.getLado();
        return volumen;
        
    }

    @Override
    public String toString() {
        return super.toString() + "cuadrado: " + cuadrado;
    }
    
    public Cuadrado getCuadrado() {
        return cuadrado;
    }

    public void setCuadrado(Cuadrado cuadrado) {
        this.cuadrado = cuadrado;
    }
 
}
