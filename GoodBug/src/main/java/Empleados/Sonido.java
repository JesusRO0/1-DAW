package Empleados;

import Proyectos.ProyectoEmpleado;
import java.util.Arrays;

public class Sonido extends Empleado{
    
    private String tipodemusica;
    private String composiciones;
    private ProyectoEmpleado[] proyectoSonido;
    
    public Sonido(){
        
    }

    public Sonido(String tipodemusica, String composiciones, ProyectoEmpleado[] proyectoSonido, String NombreCompleto, String DNI, int Edad, String Estudio, String Dirección, double Sueldo) {
        super(NombreCompleto, DNI, Edad, Estudio, Dirección, Sueldo);
        this.tipodemusica = tipodemusica;
        this.composiciones = composiciones;
        this.proyectoSonido = proyectoSonido;
    }
    
    public double calcularSueldo() {
        double sueldoBase;
        sueldoBase = getSueldo() + 55.60;
        return sueldoBase;
    }

    public String toString() {
        return super.toString() + "tipodemusica: " + tipodemusica + ", composiciones: " + composiciones + Arrays.toString(proyectoSonido)+"\n";
    }

    public boolean equals(Sonido a){
        if(this.tipodemusica.equals(a.tipodemusica)){
            return true;
        }return false;
    }

    public String getTipodemusica() {
        return tipodemusica;
    }

    public void setTipodemusica(String tipodemusica) {
        this.tipodemusica = tipodemusica;
    }

    public String getComposiciones() {
        return composiciones;
    }

    public void setComposiciones(String composiciones) {
        this.composiciones = composiciones;
    }

    public ProyectoEmpleado[] getproyectoSonido() {
        return proyectoSonido;
    }

    public void setproyectoSonido(ProyectoEmpleado[] proyectoSonido) {
        this.proyectoSonido = proyectoSonido;
    }
    
    
}
