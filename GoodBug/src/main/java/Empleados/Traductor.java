package Empleados;

import Proyectos.ProyectoEmpleado;
import java.util.Arrays;

public class Traductor extends Empleado{
    
    private String Idiomas;
    private ProyectoEmpleado[] proyectoTraductor;
    
    public Traductor(){
        
    }

    public Traductor(String Idiomas, ProyectoEmpleado[] proyectoTraductor, String NombreCompleto, String DNI, int Edad, String Estudio, String Dirección, double Sueldo) {
        super(NombreCompleto, DNI, Edad, Estudio, Dirección, Sueldo);
        this.Idiomas = Idiomas;
        this.proyectoTraductor = proyectoTraductor;
    }

    public double calcularSueldo() {
        double sueldoBase;
        sueldoBase = getSueldo() + 120.20;
        return sueldoBase;
    }

    public String toString() {
        return super.toString()+ "Idiomas: "+ Idiomas + Arrays.toString(proyectoTraductor);
    }
    
    public boolean equals(Traductor a){
        if(this.Idiomas.equals(a.Idiomas)){
            return true;
        }return false;
    }

    public String getIdiomas() {
        return Idiomas;
    }

    public void setIdiomas(String Idiomas) {
        this.Idiomas = Idiomas;
    }

    public ProyectoEmpleado[] getProyectoTraductor() {
        return proyectoTraductor;
    }

    public void setProyectoTraductor(ProyectoEmpleado[] proyectoTraductor) {
        this.proyectoTraductor = proyectoTraductor;
    }
    
    
}
