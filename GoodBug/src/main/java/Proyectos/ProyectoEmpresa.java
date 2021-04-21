package Proyectos;

import java.util.Date;

public class ProyectoEmpresa extends Proyectos {
    
    private int idEmpresa;
    private double gastoProyecto;
    private double ganancia;
    
    public ProyectoEmpresa(){
        
    }

    public ProyectoEmpresa(int idEmpresa, double gastoProyecto, double ganancia, String NombreJuego, String Categoria, Date fechaSalida, int horasTrabajo, double Precio, boolean Estado, boolean Tipo) {
        super(NombreJuego, Categoria, fechaSalida, horasTrabajo, Precio, Estado, Tipo);
        this.idEmpresa = idEmpresa;
        this.gastoProyecto = gastoProyecto;
        this.ganancia = ganancia;
    }

    public double Beneficio(){
        double beneficio;
        beneficio = ganancia - gastoProyecto;
        return beneficio;
    }

    public String toString() {
        return super.toString() + "idEmpresa: " + idEmpresa + "Gastos del proyecto: "+ gastoProyecto+ "Ganancias: "+ ganancia;
    }
    
    public boolean equals(ProyectoEmpresa a){
        if(this.idEmpresa == idEmpresa){
            return true;
        }return false;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public double getGastoProyecto() {
        return gastoProyecto;
    }

    public void setGastoProyecto(double gastoProyecto) {
        this.gastoProyecto = gastoProyecto;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }

    
}
