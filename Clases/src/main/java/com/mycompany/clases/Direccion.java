package com.mycompany.clases;

public class Direccion {

    String nombreDireccion;
    int numero;
    int planta;
    String puerta;
    int postal;
    String ciudad;

    public Direccion(){

    }

    public Direccion(String nombreDireccion, int numero, int planta, String puerta, int postal) {

        this.nombreDireccion = nombreDireccion;
        this.numero = numero;
        this.planta = planta;
        this.puerta = puerta;
        this.postal = postal;

    }
    
    public boolean equals(Direccion a){
        if(this.nombreDireccion.equals(a.nombreDireccion)){
            return true;
        }
        
                
        return false;
    }

    public String toString() {

        return "Direccion: " + nombreDireccion + "\n" + "Numero: " + numero + "\n" + "Planta: " + planta
                + "\n" + "Puerta: " + puerta + "\n" + "Codigo Postal: " + postal + "\n" + "Ciudad: " + ciudad + "\n";

    }

    public void setciudad(String ciudad) {

        ciudad = ciudad;
    }

    public String getciudad() {

        return ciudad;
    }
}
