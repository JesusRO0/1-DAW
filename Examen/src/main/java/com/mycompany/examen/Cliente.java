package com.mycompany.examen;

public class Cliente extends Abonados{
    
    String dni;
    
    public Cliente(){
    
}

    public Cliente(String dni, Cliente , String nombreCompleto, String direccion, Factura[] factura) {
        super(nombreCompleto, direccion, factura);
        this.dni = dni;
    }
    
    public boolean equals(Cliente a){
        if(this.dni.equals(a.dni)){
            return true;
        }return false;
    }

    @Override
    public String toString() {
        return super.toString()+"dni: " + dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
}
