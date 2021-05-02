package Personajes;

import java.util.logging.Logger;

public class Maga extends personaje implements Mágica{
    
    private String pasiva;
    
    public Maga(){
        
    }

    public Maga(String pasiva, String Nombrepersonaje, String Pueblonatal, int Nivel, String Tipoequipamiento) {
        super(Nombrepersonaje, Pueblonatal, Nivel, Tipoequipamiento);
        this.pasiva = pasiva;
    }

    public void proyectarMagia() {
        System.out.println("La maga utiliza su vara con la que proyecta magia elemental");
    }

    
    public void proteccion() {
        System.out.println("Con la magia la maga puede obtener escudos de protección"); 
    }

    
    public void mana() {
        System.out.println("La maga utiliza maná para utilizar sus hechizos"); 
    }

    
    public void poderes() {
        System.out.println("La maga utiliza poderes de fuego, agua, tierra y viento"); 
    }

    
    public String toString() {
        return super.toString()+"Pasiva única: " + pasiva+"\n";
    }
    
    public boolean equals(Maga a){
        if(this.pasiva.equals(a.pasiva)){
            return true;
        }return false;
    }

    public String getPasiva() {
        return pasiva;
    }

    public void setPasiva(String pasiva) {
        this.pasiva = pasiva;
    }
    
}
