package Empresa;

import Empleados.Programador;
import Empleados.Sonido;
import Empleados.Traductor;
import Proyectos.ProyectoEmpleado;
import Proyectos.ProyectoEmpresa;
import java.util.Date;

public class Principal {

    public static void main(String[] args) {
        
        Date date1 = new Date();
        
        ProyectoEmpleado[] proyectoProgramador = new ProyectoEmpleado[3];
        ProyectoEmpleado proyectoProgramador1 = new ProyectoEmpleado(023, "Mario Brus", "Aventura", date1, 122, 60.0, true, true);
        ProyectoEmpleado proyectoProgramador2 = new ProyectoEmpleado(574, "Call of Sea", "Puzzles", date1, 206, 35.0, true, false);
        ProyectoEmpleado proyectoProgramador3 = new ProyectoEmpleado(153, "Guns", "Acción", date1, 42, 60.0, false , true);
        
        proyectoProgramador[0] = proyectoProgramador1;
        proyectoProgramador[1] = proyectoProgramador2;
        proyectoProgramador[2] = proyectoProgramador3;
        
        Programador programador;
        programador = new Programador("PHP, JAVA, C++", proyectoProgramador, "Javier Rodirguez Ramirez", "452643D",26,"Programador Senior", "Avn. Los Patos", 2200.0);
        
        ProyectoEmpleado[] Sonido = new ProyectoEmpleado[4];
        ProyectoEmpleado Sonido1 = new ProyectoEmpleado(241, "Nier", "Acción, Aventura", date1, 230, 60.0, true, true);
        ProyectoEmpleado Sonido2 = new ProyectoEmpleado(875, "Final Fantasy XII", "Fantasía, RPG", date1, 250, 60.0, true , true);
        ProyectoEmpleado Sonido3 = new ProyectoEmpleado(453, "Voice", "Drama", date1, 60, 30.0, true , false);
        ProyectoEmpleado Sonido4 = new ProyectoEmpleado(023, "New City", "shooter MMO", date1, 412, 60.0, false , true);
        
        Sonido[0] = Sonido1;
        Sonido[1] = Sonido2;
        Sonido[2] = Sonido3;
        Sonido[3] = Sonido4;
        
        Sonido sonidista;
        sonidista = new Sonido("Rock, Pop, Blue","4 Composiciones", Sonido, "Maria Ordoñez Fernandez", "45124549Z",32,"Titulo audiovisual", "Avn. Plaza Reyes", 1350.0);
        
        ProyectoEmpleado[] Traductor = new ProyectoEmpleado[2];
        ProyectoEmpleado Traductor1 = new ProyectoEmpleado(023, "Mario Brus", "Aventura", date1, 122, 60.0, true, true);
        ProyectoEmpleado Traductor2 = new ProyectoEmpleado(574, "Call of Sea", "Puzzles", date1, 206, 35.0, true, false);
        
        Traductor[0] = Traductor1;
        Traductor[1] = Traductor2;
        
        Traductor traductor;
        traductor = new Traductor("Español, Ingles, Aleman, Chino", proyectoProgramador, "Raúl Navarro López", "45150977M",22,"Título Traductor-Intérprete", "Calle de las Manzánas", 2600.0);
        
        ProyectoEmpresa[] Proyecto = new ProyectoEmpresa[3];
        ProyectoEmpresa Proyecto1 = new ProyectoEmpresa(312, 20300.40, 30500.700, "Black Mountain", "Acción, Aventura", date1, 1500, 60.0, true, true);
        ProyectoEmpresa Proyecto2 = new ProyectoEmpresa(312, 14000.66, 23670.18, "Magic World", "MMORPG", date1, 2300, 60.0, true, true);
        ProyectoEmpresa Proyecto3 = new ProyectoEmpresa(312, 3899.90, 0.0, "Street Punch", "Lucha", date1, 600, 35.0, false, false);
        
        Proyecto[0] = Proyecto1;
        Proyecto[1] = Proyecto2;
        Proyecto[2] = Proyecto3;
        
        Empresa empresa;
        empresa = new Empresa("GoodBug","45124566A","Madrid", date1, Proyecto);
        
        System.out.println("Datos del Programador:"+ "\n");
        System.out.println(programador);
            System.out.println("Datos del Sonidista:"+ "\n");
            System.out.println(sonidista);
                System.out.println("Datos del Traductor:"+ "\n");
                System.out.println(traductor);
                    System.out.println("Datos de la Empresa:"+ "\n");
                    System.out.println(empresa);

    }
    
}
