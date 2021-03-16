package com.mycompany.herencias2;


public class Cuadrado extends Figura{
    
    private int lado;
    
    public Cuadrado(){
        
    }

    public Cuadrado(int lado, String nombre, int grosorBorde, int color) {
        super(nombre, grosorBorde, color);
        this.lado = lado;
    }
    
    public int cambiarTamaño(){
        int tamaño;
        tamaño = lado+lado+lado;
        return tamaño;
        
    }
    
    @Override
    public void dibujar() {
        System.out.println("Dibujar Cuadrado");
    }
    
    public int calcularArea(){
        int area;
        area = lado*lado;
        return area;
    }
    
    public int calcularPerimetro(){
        int perimetro;
        perimetro = lado*lado*lado*lado;
        return perimetro;
        
    }
    
      @Override
    public String toString() {
        return super.toString()+ "lado: " + lado;
    }
    
    public boolean equals(Cuadrado a){
        if(this.nombre.equals(a.lado)){
            return true;
        }return false;
        
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
}
