
package Vehiculos;

public class hormigonera extends maquinaria{
    
    private String tipoMotor;
    
    
    public hormigonera(){
        
    }

    public hormigonera(String tipoMotor, int matricula, String marca, double peso, int capacidad) {
        super(matricula, marca, peso, capacidad);
        this.tipoMotor = tipoMotor;
    }

    @Override
    public String toString() {
        return super.toString()+ "tipoMotor=" + tipoMotor;
    }
    
    public boolean equals(hormigonera a){
        if(this.tipoMotor.equals(a.tipoMotor)){
            return true;
        }return false;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

}
