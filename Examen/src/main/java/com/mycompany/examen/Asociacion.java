package com.mycompany.examen;

public class Asociacion extends Abonados{
    
    String CA;
    
    public Abonados(){
        
    }

    public Asociacion(String CA, String nombreCompleto, String direccion, Factura[] factura) {
        super(nombreCompleto, direccion, factura);
        this.CA = CA;
    }
    
    public boolean equals(Asociacion a){
        if(this.CA.equals(a.CA)){
            return true;
        }return false;
    }

    @Override
    public String toString() {
        return super.toString()+ "Codigo Asociación:" + CA;
    }
    
    
}
