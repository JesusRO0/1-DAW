package Empleados;

public abstract class Empleado {
    
    private String NombreCompleto;
    private String DNI;
    private int Edad;
    private String Estudio;
    private String Dirección;
    private double Sueldo;
    
    public Empleado(){
        
    }

    public Empleado(String NombreCompleto, String DNI, int Edad, String Estudio, String Dirección, double Sueldo) {
        this.NombreCompleto = NombreCompleto;
        this.DNI = DNI;
        this.Edad = Edad;
        this.Estudio = Estudio;
        this.Dirección = Dirección;
        this.Sueldo = Sueldo;
    }
    
    public abstract double calcularSueldo();

    public String toString() {
        return "NombreCompleto: " + NombreCompleto + ", DNI: " + DNI + ", Edad: " + Edad + ", Estudio: " + Estudio + ", Dirección: " + Dirección + ", Sueldo: " + Sueldo + "\n";
    }
    
    public boolean equals(Empleado a){
        if(this.DNI.equals(a.DNI)){
            return true;
        }return false;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getEstudio() {
        return Estudio;
    }

    public void setEstudio(String Estudio) {
        this.Estudio = Estudio;
    }

    public String getDirección() {
        return Dirección;
    }

    public void setDirección(String Dirección) {
        this.Dirección = Dirección;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    
}
