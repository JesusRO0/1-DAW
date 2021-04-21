package Empresa;

import Proyectos.ProyectoEmpleado;
import java.util.Date;

public class Principal {

    public static void main(String[] args) {
        
        Date date1 = new Date();
        
        ProyectoEmpleado[] Programador = new ProyectoEmpleado[3];
        ProyectoEmpleado Programador1 = new ProyectoEmpleado(023, "Mario Brus", "Aventura", date1, 122, 60.0, true, true);
        ProyectoEmpleado Programador2 = new ProyectoEmpleado(574, "Call of Sea", "Puzzles", date1, 206, 35.0, true, false);
        ProyectoEmpleado Programador3 = new ProyectoEmpleado(153, "Guns", "Acción", date1, 42, 60.0, false , true);
        
        Programador[0] = Programador1;
        Programador[1] = Programador2;
        Programador[2] = Programador3;
        
        ProyectoEmpleado[] Sonido = new ProyectoEmpleado[4];
        ProyectoEmpleado Sonido1 = new ProyectoEmpleado(241, "Nier", "Acción, Aventura", date1, 230, 60.0, true, true);
        ProyectoEmpleado Sonido2 = new ProyectoEmpleado(875, "Final Fantasy XII", "Fantasía, RPG", date1, 250, 60.0, true , true);
        ProyectoEmpleado Sonido3 = new ProyectoEmpleado(453, "Voice", "Drama", date1, 60, 30.0, true , false);
        ProyectoEmpleado Sonido4 = new ProyectoEmpleado(023, "New City", "shooter MMO", date1, 412, 60.0, false , true);
        
        Sonido[0] = Sonido1;
        Sonido[1] = Sonido2;
        Sonido[2] = Sonido3;
        Sonido[3] = Sonido4;
        
        ProyectoEmpleado[] Traductor = new ProyectoEmpleado[2];
        ProyectoEmpleado Traductor1 = new ProyectoEmpleado(023, "Mario Brus", "Aventura", date1, 122, 60.0, true, true);
        ProyectoEmpleado Traductor2 = new ProyectoEmpleado(574, "Call of Sea", "Puzzles", date1, 206, 35.0, true, false);
        
        Traductor[0] = Traductor1;
        Traductor[1] = Traductor2;
        
        
    }
    
}
