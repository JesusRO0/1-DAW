package com.mycompany.herencias2;

public class Herencias2 {

    public static void main(String[] args) {
        
        int Volumen;
        int Area;
        int Perimetro;
        
        Esfera esfera; 
        esfera = new Esfera(2,"Esfera",223,4);
        
        Cuadrado cuadrado;
        cuadrado = new Cuadrado(2, "Cuadrado", 3, 13);
        
        Cubo cubo;
        cubo = new Cubo(cuadrado, "Cubo", 5, 45);
        
        Triangulo triangulo;
        triangulo = new Triangulo(4, 6,"Triangulo", 4, 80);
        
        Piramide piramide;
        piramide = new Piramide(triangulo, "Triangulo", 2, 40);
        
        Circulo circulo;
        circulo = new Circulo(4, "Circulo", 1, 300);
        
        Volumen = esfera.calcularVolumen()+cubo.calcularVolumen()+piramide.calcularVolumen();
        Area = cuadrado.calcularArea()+circulo.calcularArea()+triangulo.calcularArea();
        Perimetro = cuadrado.calcularPerimetro()+circulo.calcularPerimetro()+triangulo.calcularPerimetro();
        
        esfera.dibujar();
        System.out.println(esfera);
        
        cubo.dibujar();
        System.out.println(cubo);
        
        triangulo.dibujar();
        System.out.println(triangulo);
        
        piramide.dibujar();
        System.out.println(piramide);
        
        cuadrado.dibujar();
        System.out.println(cuadrado);
        
        circulo.dibujar();
        System.out.println(circulo);
        
        triangulo.dibujar();
        System.out.println(triangulo);
     
        System.out.println("El volumen de la figura 3D es: "+Volumen);
        System.out.println("El Área de la figura 2D es: "+Area);
        System.out.println("El Perimetro de la figura 2D es: "+Perimetro);
        
        
    }
    
}
