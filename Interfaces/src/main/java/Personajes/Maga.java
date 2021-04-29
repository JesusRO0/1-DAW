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
            
    }

    @Override
    public void proteccion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mana() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void poderes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
