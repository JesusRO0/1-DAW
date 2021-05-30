
package Vehiculos;

import Interface.funBasico;


public class palas extends maquinaria implements funBasico{
    
    private int carga;
    private int elevacion;
    
    public palas(){
        
    }

    public palas(int carga, int elevacion, int matricula, String marca, double peso, int capacidad) {
        super(matricula, marca, peso, capacidad);
        this.carga = carga;
        this.elevacion = elevacion;
    }

    @Override
    public String toString() {
        return super.toString()+ "carga=" + carga + ", elevacion=" + elevacion;
    }

    
    public boolean equals(palas a){
        if(this.carga == a.carga){
            return true;
        }return false;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int getElevacion() {
        return elevacion;
    }

    public void setElevacion(int elevacion) {
        this.elevacion = elevacion;
    }

    @Override
    public String movimiento() {
        return " ";
    }

    @Override
    public String descargar() {
        return " ";
    }
    
    
}
