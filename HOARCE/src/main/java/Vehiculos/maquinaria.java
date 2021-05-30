package Vehiculos;


public abstract class maquinaria {
    
    private int matricula;
    private String marca;
    private double peso;
    private int capacidad;
    
    public maquinaria(){
        
    }

    public maquinaria(int matricula, String marca, double peso, int capacidad) {
        this.matricula = matricula;
        this.marca = marca;
        this.peso = peso;
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "matricula=" + matricula + ", marca=" + marca + ", peso=" + peso + ", capacidad=" + capacidad;
    }

    public boolean equals(maquinaria a){
        if(this.marca.equals(a.marca)){
            return true;
        }return false;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

   
    
}
