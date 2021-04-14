package Empleados;

public abstract class Empleados {
    
    private String NombreCompleto;
    private String DNI;
    private int Edad;
    private String Estudio;
    private String Dirección;
    private double Sueldo;
    private Especialidad especialidad;
    private CV cv;
    
    public Empleados(){
        
    }

    public Empleados(String NombreCompleto, String DNI, int Edad, String Estudio, String Dirección, double Sueldo, Especialidad especialidad, CV cv) {
        this.NombreCompleto = NombreCompleto;
        this.DNI = DNI;
        this.Edad = Edad;
        this.Estudio = Estudio;
        this.Dirección = Dirección;
        this.Sueldo = Sueldo;
        this.especialidad = especialidad;
        this.cv = cv;
    }
    
    public abstract double CalcularSueldo();

    @Override
    public String toString() {
        return "NombreCompleto: " + NombreCompleto + ", DNI: " + DNI + ", Edad: " + Edad + ", Estudio: " + Estudio + ", Dirección: " + Dirección + ", Sueldo: " + Sueldo + ", especialidad: " + especialidad + "," + CV cv + "\n";
    }
    
    
    
}
