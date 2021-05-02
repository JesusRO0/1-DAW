
package Personajes;

public class Arquero extends personaje implements Hibrido{
    
    private String pasiva;
    
    public Arquero(){
        
    }

    public Arquero(String pasiva, String Nombrepersonaje, String Pueblonatal, int Nivel, String Tipoequipamiento) {
        super(Nombrepersonaje, Pueblonatal, Nivel, Tipoequipamiento);
        this.pasiva = pasiva;
    }

    public void podermagico() {
        System.out.println("El arquero tiene un poder mágico de invocar lobos");
    }
    
    public void atacar() {
        System.out.println("El arquero puede atacar a distamcia con su arco y flechas");    
    }

    public void defender() {
        System.out.println("El arquero tiene poca defensa pero una gran movilidad");
    }

    public void energia() {
        System.out.println("Para usar su movilidad y poderes gasta la energía");
    }

    public void talentos() {
        System.out.println("Los talentos van orientados a la maestria del arco y superviviencia");
    }

    public String toString() {
        return super.toString() + "Pasiva única: " + pasiva+"\n";
    }
    
    public boolean equals(Arquero a){
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
