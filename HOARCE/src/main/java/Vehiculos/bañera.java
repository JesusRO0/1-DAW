
package Vehiculos;

import Interface.funBasico;


public class bañera extends maquinaria implements funBasico{
    
    private int tamaño;
    
    public bañera(){
        
    }

    public bañera(int tamaño, int matricula, String marca, double peso, int capacidad) {
        super(matricula, marca, peso, capacidad);
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return super.toString()+ "Tamaño=" + tamaño;
    }

    public boolean equals(bañera a){
        if(this.tamaño == a.tamaño){
            return true;
        }return false;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
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
