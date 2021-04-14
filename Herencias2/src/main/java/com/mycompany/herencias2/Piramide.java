package com.mycompany.herencias2;

public class Piramide extends Figura3D{
    
    private Triangulo triangulo;
    
    public Piramide(){
        
    }

    public Piramide(Triangulo triangulo, String nombre, int grosorBorde, int color) {
        super(nombre, grosorBorde, color);
        this.triangulo = triangulo;
    }
    
    @Override
    public void dibujar() {
        System.out.println("Dibujar Piramide");
    }

    @Override
    public int calcularVolumen() {
        int volumen;
        volumen = triangulo.getBase()+triangulo.getAltura();
        return volumen;
        
    }
    
    public boolean equals(Piramide a){
        if(this.nombre.equals(a.triangulo)){
            return true;
        }return false;
        
    }

    @Override
    public String toString() {
        return super.toString() + "triangulo; " + triangulo;
    }

    public Triangulo getTriangulo() {
        return triangulo;
    }

    public void setTriangulo(Triangulo triangulo) {
        this.triangulo = triangulo;
    }
   
}
