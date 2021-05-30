package Main;

import Interface.funcionamiento;
import Vehiculos.bañera;
import Vehiculos.cisterna;
import Vehiculos.excavadora;
import Vehiculos.hormigonera;
import Vehiculos.maquinaria;
import Vehiculos.palas;

public class Produccion {

    public static void main(String[] args) {
        
        maquinaria[] bañera = new bañera[2];
        bañera bañera1 = new bañera();
        bañera bañera2 = new bañera();

        bañera[0] = bañera1;
        bañera[1] = bañera2;

        maquinaria[] hormigonera = new hormigonera[2];
        hormigonera hormigonera1 = new hormigonera();
        hormigonera hormigonera2 = new hormigonera();

        hormigonera[0] = hormigonera1;
        hormigonera[1] = hormigonera2;
        
        maquinaria[] palas = new palas[2];
        palas palas1 = new palas();
        palas palas2 = new palas();

        palas[0] = palas1;
        palas[1] = palas2;
        
        maquinaria cisterna;
        cisterna = new cisterna();
        
        maquinaria excavadora;
        excavadora = new excavadora();

        funcionamiento fun = new funcionamiento();
            
 
}
}
