package Empresa;

import java.util.Date;


public class Empresa {
    
    private String Nombre;
    private String CIF;
    private String Localización;
    private Date fecha;
    private Proyectos proyecto;
    
    public Empresa(){
        
    }

    public Empresa(String Nombre, String CIF, String Localización, Date fecha, Proyectos proyecto) {
        this.Nombre = Nombre;
        this.CIF = CIF;
        this.Localización = Localización;
        this.fecha = fecha;
        this.proyecto = proyecto;
    }

    public String toString() {
        return "Nombre: " + Nombre + ", CIF: " + CIF + ", Localización: " + Localización + ", fecha: " + fecha + Proyectos proyecto+ "\n";
    }
    
    public boolean equals(Empresa a){
        if(this.CIF.equals(a.CIF)){
            return true;
        }return false;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public String getLocalización() {
        return Localización;
    }

    public void setLocalización(String Localización) {
        this.Localización = Localización;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Proyectos getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyectos proyecto) {
        this.proyecto = proyecto;
    }
    
    

}
