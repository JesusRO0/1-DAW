package SercvicioProduccion;

import Interface.funcionamiento;


public class servicioProduccion {
    
    public void servicioProduccion(funcionamiento [] vehiculos){
        
        for(int i=0; i< vehiculos.length; i++){
            System.out.println("Transportar" + vehiculos[i].transportar());
            System.out.println("Transportar" + vehiculos[i].recoger());
            System.out.println("Transportar" + vehiculos[i].cargar());

        }
    }
    
}
