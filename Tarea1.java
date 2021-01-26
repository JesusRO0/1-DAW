package com.mycompany.tarea1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
*
* @author Gaby Nieva
*/
public class Tarea1 {
    

public static void main(String[] args) throws IOException {
// Declaración de variables
int x, y,z;
float a, b, c;
String nombre;
BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
String entrada;

    System.out.println("Escribe el valor de x: ");
    entrada = bufer.readLine();
    x= Integer.parseInt(entrada);
    System.out.println("Escribe el valor de y: ");
        entrada = bufer.readLine();
        y = Integer.parseInt(entrada);
        z = y / x;
    System.out.println("El residuo de dividir y (" + y + ") entre x ("+x +") es: " + z);
    System.out.println("Escribe el valor de a: ");
    entrada = bufer.readLine();
        a = Float.parseFloat(entrada);
    System.out.println("Escribe el valor de b: ");
    entrada = bufer.readLine();
        b = Float.parseFloat(entrada);
        c = a * b ;
    System.out.println("El resultado de multiplicar a por b es:" + c);


    System.out.println("Escribe tu nombre: ");
    entrada = bufer.readLine();
    nombre = entrada;
    System.out.println("El nombre que escribiste es: " + nombre);
}
}