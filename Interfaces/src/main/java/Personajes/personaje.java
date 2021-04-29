package Personajes;

public abstract class personaje {
    
    private String Nombrepersonaje;
    private String Pueblonatal;
    private int Nivel;
    private String Tipoequipamiento;
    
    public personaje(){
        
    }

    public personaje(String Nombrepersonaje, String Pueblonatal, int Nivel, String Tipoequipamiento) {
        this.Nombrepersonaje = Nombrepersonaje;
        this.Pueblonatal = Pueblonatal;
        this.Nivel = Nivel;
        this.Tipoequipamiento = Tipoequipamiento;
    }

    public String toString() {
        return "Nombre Personaje: " + Nombrepersonaje + ", Pueblonatal: " + Pueblonatal + ", Nivel: " + Nivel + ", Tipoequipamiento: " + Tipoequipamiento;
    }
    
    public boolean equals(personaje a){
        if(this.Nombrepersonaje.equals(a.Nombrepersonaje)){
            return true;
        }return false;
    }

    public String getNombrepersonaje() {
        return Nombrepersonaje;
    }

    public void setNombrepersonaje(String Nombrepersonaje) {
        this.Nombrepersonaje = Nombrepersonaje;
    }

    public String getPueblonatal() {
        return Pueblonatal;
    }

    public void setPueblonatal(String Pueblonatal) {
        this.Pueblonatal = Pueblonatal;
    }

    public int getNivel() {
        return Nivel;
    }

    public void setNivel(int Nivel) {
        this.Nivel = Nivel;
    }

    public String getTipoequipamiento() {
        return Tipoequipamiento;
    }

    public void setTipoequipamiento(String Tipoequipamiento) {
        this.Tipoequipamiento = Tipoequipamiento;
    }
    
    
}
