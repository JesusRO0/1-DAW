package Personajes;

public class Guerrero extends personaje implements Fisico{
    
    private String pasiva;
    
    public Guerrero(){
        
    }

    public Guerrero(String pasiva, String Nombrepersonaje, String Pueblonatal, int Nivel, String Tipoequipamiento) {
        super(Nombrepersonaje, Pueblonatal, Nivel, Tipoequipamiento);
        this.pasiva = pasiva;
    }

    public void atacar() {
        System.out.println("El guerrero ataca a melee on una espada o un hacha");
    }

    public void defender() {
        System.out.println("El guerrero se puede defender con un escudo");
    }

    public void energia() {
        System.out.println("El guerrero gasta la energia en sus golpes fuertes y en aguntar con el escudo");
    }

    public void talentos() {
        System.out.println("");
    }
    
    
}
