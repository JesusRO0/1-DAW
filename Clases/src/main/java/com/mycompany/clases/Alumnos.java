package com.mycompany.clases;

public class Alumnos{

    public static void main (String[] args){
        
        Direccion[] direcciones = new Direccion[3];
        Direccion direccion1 = new Direccion("Avn Valero", 2, 5, "3º Izquierda", 51002);
        Direccion direccion2 = new Direccion("ghjhgj", 0, 0, "a", 0);
        Direccion direccion3 = new Direccion("styyyyyy", 0, 0, "a", 0);
        
        direcciones[0] = direccion1;
        direcciones[1] = direccion2;
        direcciones[2] = direccion3;
        
        Alumno alumno1;
        alumno1 = new Alumno("Manolo", "Gonzalez", "lopez", "4516338Z", 2020, 956500345, 20, 2536753,
                "manololopez@gmail.com", "Manuel", "Gema", 634542708, 665432378, direcciones);
        
        //Matricula matricula;
        //matricula = new Matricula(1563 ,alumno1, estudio, turno, estado);
       
        Departamento departamento;
        departamento = new Departamento(98364, "Informática");
        
        Matricula matricula;
        matricula = new Matricula(9434, alumno1, estudio, turno, estado);
        
        
        Grupo grupo;
        grupo = new Grupo();
        
        Profesor[] profesores = new Profesor[3];
        Profesor profesor1 = new Profesor(2442, "4523546A", "José", "Pérez", "Gutierrez", departamento);
        Profesor profesor2 = new Profesor(7355, "4527356H", "Jesús", "Roca", "López", departamento);
        Profesor profesor3 = new Profesor(2442, "4526334L", "María", "Oliva", "Rodriguez", departamento);
        
        profesores[0] = profesor1;
        profesores[1] = profesor2;
        profesores[2] = profesor3;
        
       
       
        System.out.println(alumno1);
            //System.out.println(matricula);
                System.out.println("Direcciones del Alumno: \n");
                System.out.println(direccion1);
                    System.out.println(direccion2);
                        System.out.println(direccion3);
                   
            
        if(direccion1.equals(direccion2)){
            System.out.println("Error");
        }
        else if(direccion2.equals(direccion3)){
            System.out.println("Error");
        }else if(direccion3.equals(direccion1)){
            System.out.println("Error");
        }else{
            System.out.println("Datos Correctos"); 
        }
               
        
    }


}