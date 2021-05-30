package Vehiculos;

import Interface.funBasico;


public class cisterna extends maquinaria implements funBasico{
    
    private double dimensiones;
    
    public cisterna(){
        
    }

    public cisterna(double dimensiones, int matricula, String marca, double peso, int capacidad) {
        super(matricula, marca, peso, capacidad);
        this.dimensiones = dimensiones;
    }

    @Override
    public String toString() {
        return super.toString()+ "dimensiones=" + dimensiones + '}';
    }
    
    public boolean equals(cisterna a){
        if(this.dimensiones == a.dimensiones){
            return true;
        }return false;
    }

    public double getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(double dimensiones) {
        this.dimensiones = dimensiones;
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
