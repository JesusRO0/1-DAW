package Empresa;

import Proyectos.ProyectoEmpresa;
import java.util.Arrays;
import java.util.Date;


public class Empresa {
    
    private String Nombre;
    private String CIF;
    private String Localización;
    private Date fecha;
    private ProyectoEmpresa[] proyecto;
    
    public Empresa(){
        
    }

    public Empresa(String Nombre, String CIF, String Localización, Date fecha, ProyectoEmpresa[] proyecto) {
        this.Nombre = Nombre;
        this.CIF = CIF;
        this.Localización = Localización;
        this.fecha = fecha;
        this.proyecto = proyecto;
    }

    

    public String toString() {
        return "Nombre: " + Nombre + ", CIF: " + CIF + ", Localización: " + Localización + ", fecha: " + fecha + Arrays.toString(proyecto);
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

    public ProyectoEmpresa[] getProyecto() {
        return proyecto;
    }

    public void setProyecto(ProyectoEmpresa[] proyecto) {
        this.proyecto = proyecto;
    }

}
