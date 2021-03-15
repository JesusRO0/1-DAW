
package com.mycompany.herencias2;

public abstract class Figura2D extends Figura{
    
    public Figura2D(){
        
    }
    
    public Figura2D(String nombre, int grosorBorde, int color){
        super(nombre, grosorBorde, color);
    }

    public abstract int calcularArea();
    
    public abstract int calcularParametro();
  
}
