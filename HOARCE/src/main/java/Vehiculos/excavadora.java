package Vehiculos;

import Interface.funBasico;

public class excavadora extends maquinaria implements funBasico{
    
    private int rotacion;
    
    public excavadora(){
        
    }

    public excavadora(int rotacion, int matricula, String marca, double peso, int capacidad) {
        super(matricula, marca, peso, capacidad);
        this.rotacion = rotacion;
    }

    @Override
    public String toString() {
        return "excavadora{" + "rotacion=" + rotacion + '}';
    }
    
    public boolean equals(excavadora a){
        if(this.rotacion == a.rotacion){
            return true;
        }return false;
    }

    public int getRotacion() {
        return rotacion;
    }

    public void setRotacion(int rotacion) {
        this.rotacion = rotacion;
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
