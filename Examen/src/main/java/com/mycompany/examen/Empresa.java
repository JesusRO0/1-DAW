package com.mycompany.examen;


public class Empresa extends Abonados{
    
    String CIF;
    
    public Empresa(){
    
}

    public Empresa(String CIF, String nombreCompleto, String direccion, Factura[] factura) {
        super(nombreCompleto, direccion, factura);
        this.CIF = CIF;
    }
    
    public boolean equals(Empresa a){
        if(this.CIF.equals(a.CIF)){
            return true;
        }return false;
    }
    
    public String toString(){
        return super.toString()+"CIF de la Empresa: "+ CIF;
    }

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }
    
    
}
