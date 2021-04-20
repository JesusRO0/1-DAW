package Empleados;

import Proyectos.ProyectoEmpleado;
import java.util.Arrays;


public class Programador extends Empleado{
    
    private String Tipocodigo;
    private ProyectoEmpleado[] proyectoProgramador;
   
    public Programador(){
        
    }

    public Programador(String Tipocodigo, ProyectoEmpleado[] proyectoProgramador, String NombreCompleto, String DNI, int Edad, String Estudio, String Dirección, double Sueldo) {
        super(NombreCompleto, DNI, Edad, Estudio, Dirección, Sueldo);
        this.Tipocodigo = Tipocodigo;
        this.proyectoProgramador = proyectoProgramador;
    }

    public double calcularSueldo() {
        double sueldoBase;
        sueldoBase = getSueldo() + 150.30;
        return sueldoBase;
    }

    public String toString() {
        return super.toString() + "Tipocodigo: " + Tipocodigo + Arrays.toString(proyectoProgramador);
    }

    public String getTipocodigo() {
        return Tipocodigo;
    }

    public void setTipocodigo(String Tipocodigo) {
        this.Tipocodigo = Tipocodigo;
    }

    public ProyectoEmpleado[] getProyectoProgramador() {
        return proyectoProgramador;
    }

    public void setProyectoProgramador(ProyectoEmpleado[] proyectoProgramador) {
        this.proyectoProgramador = proyectoProgramador;
    }

   
    
}
