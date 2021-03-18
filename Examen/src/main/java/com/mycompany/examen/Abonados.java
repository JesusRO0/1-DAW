package com.mycompany.examen;

public abstract class Abonados {
    
    String nombreCompleto;
    String direccion;
    Factura[] factura;
    
    public Abonados(){
    
}
    
    public Abonados(String nombreCompleto, String direccion, Factura[] factura){
        
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.factura = factura;
    }

    @Override
    public String toString() {
        return "Nombre Completo: " + nombreCompleto + ", direccion: " + direccion + ", factura: " + factura+", ";
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Factura[] getFactura() {
        return factura;
    }

    public void setFactura(Factura[] factura) {
        this.factura = factura;
    }
    
    
}
