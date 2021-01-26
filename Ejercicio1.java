/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea1;
import java.util.Scanner;
/**
 *
 * @author jesus
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1;
        int num2;
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Escribe el primer número: ");
        num1 = sc.nextInt();
        
        System.out.println("Escribe el segundo número: ");
        num2 = sc.nextInt();
        
        if(num1==num2){
            System.out.println("Los dos números son iguales.");
        }else if(num1 > num2){
            System.out.println("El numero "+num1+" es mayor.");
        }else if(num2 > num1){
            System.out.println("El número "+num2+" es mayor.");
        }
    }
    
}
