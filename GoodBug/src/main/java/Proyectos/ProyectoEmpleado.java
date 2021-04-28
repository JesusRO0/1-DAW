package Proyectos;

import java.util.Date;

public class ProyectoEmpleado extends Proyectos{
    
    private int idEmpleado;
    
    public ProyectoEmpleado(){
        
    }

    public ProyectoEmpleado(int idEmpleado, String NombreJuego, String Categoria, Date fechaSalida, int horasTrabajo, double Precio, boolean Estado, boolean Tipo) {
        super(NombreJuego, Categoria, fechaSalida, horasTrabajo, Precio, Estado, Tipo);
        this.idEmpleado = idEmpleado;
    }
    
    public boolean equals(ProyectoEmpleado a){
        if(this.idEmpleado == a.idEmpleado){
            return true;
        }return false;
    }
    
    public String toString() {
        return super.toString()+"idEmpleado: " + idEmpleado+"\n";
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
   
}
