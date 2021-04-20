package Proyectos;

import java.util.Date;

public abstract class Proyectos{
    
    private String NombreJuego;
    private String Categoria;
    private Date fechaSalida;
    private int horasTrabajo;
    private double Precio;
    private boolean Estado;
    private boolean Tipo;
    
    public Proyectos(){
        
    }

    public Proyectos(String NombreJuego, String Categoria, Date fechaSalida , int horasTrabajo, double Precio, boolean Estado, boolean Tipo) {
        this.NombreJuego = NombreJuego;
        this.Categoria = Categoria;
        this.horasTrabajo = horasTrabajo;
        this.Precio = Precio;
        this.Estado = Estado;
        this.Tipo = Tipo;
    }

    public String toString() {
        return "Nombre Juego" + NombreJuego + ", Categoria: " + Categoria + ", Fecha Salida:" + fechaSalida + ", horasTrabajo: " + horasTrabajo + ", Precio: " + Precio + ", Estado: " + Estado + ", Tipo: " + Tipo +"\n"; 
    }
    
    public boolean equals(Proyectos a){
        if(this.NombreJuego.equals(a.NombreJuego)){
            return true;
        }return false;
    }

    public String getNombreJuego() {
        return NombreJuego;
    }

    public void setNombreJuego(String NombreJuego) {
        this.NombreJuego = NombreJuego;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getHorasTrabajo() {
        return horasTrabajo;
    }

    public void setHorasTrabajo(int horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public boolean isTipo() {
        return Tipo;
    }

    public void setTipo(boolean Tipo) {
        this.Tipo = Tipo;
    }
    
    
}
