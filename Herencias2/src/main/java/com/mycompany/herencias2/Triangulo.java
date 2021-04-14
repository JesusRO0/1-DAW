package com.mycompany.herencias2;

public class Triangulo extends Figura2D{
    
    private int base;
    private int altura;
    
    
    public Triangulo(){
        
    }

    public Triangulo(int base, int altura, String nombre, int grosorBorde, int color) {
        super(nombre, grosorBorde, color);
        this.base = base;
        this.altura = altura;
    }
    
    public int calcularPerimetro() {
        int perimetro;
        perimetro = base+altura;
        return perimetro;    
    }

    @Override
    public void dibujar() {
      System.out.println("Dibujar Triangulo");
    }
    
    @Override
    public int calcularArea(){
        System.out.println("el área es ..."+ (base*altura)/2);
        return 0;
    }
    
    public boolean equals(Triangulo a){
        if(this.nombre.equals(a.base)){
            return true;
        }return false;
        
    }

    @Override
    public String toString() {
        return super.toString() + "base: " + base + ", altura: " + altura;
    }
    
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }


    
}
