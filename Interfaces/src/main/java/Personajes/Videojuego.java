package Personajes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Videojuego {

    public static void main(String[] args) {
        
        personaje Arquero;
        Arquero = new Arquero("Poder de la Naturaleza", "Arwin", "Kamasilvya", 1, "Arco y flechas");
        
        personaje Guerrero;
        Guerrero = new Guerrero("Inquebrantable", "Mort", "Heidel", 10, "Espada y escudo");
        
        personaje Maga;
        Maga = new Maga("Poder de los cuatro elementos", "Megumin", "Tarif", 36, "Vara y daga");
        
        boolean salir= false;
        int opcion;
        Scanner sc = new Scanner(System.in);
            
            
        while (!salir) {
 
            System.out.println("1.Arquero");
            System.out.println("2.Guerrero");
            System.out.println("3.Maga");
            System.out.println("4. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sc.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado Arquero");
                        System.out.println(Arquero);
                        
                        break;
                    case 2:
                        System.out.println("Has seleccionado Guerrero");
                        System.out.println(Guerrero);
                        
                        break;
                    case 3:
                        System.out.println("Has seleccionado Maga");
                        System.out.println(Maga);
                        
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sc.next();
            }
        }     
        
    }

    
}
