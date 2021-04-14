
package com.mycompany.clases;


    public class Matricula {
    
        int identificador;
        Alumno alumno;
        String estudio;
        String estado;
        String fecha;
        String Diurno;
        String Vesperino;
        String ALTA;
        String BAJA;
    
   public Matricula(int id, Alumno alumno, String estudio, String diurno, String vesperino, String ALTA, String BAJA, String estado){
       
       this.identificador = id;
       this.alumno = alumno;
       this.estudio = estudio;
       this.Diurno = diurno;
       this.Vesperino = vesperino;
       this.ALTA = ALTA;
       this.BAJA = BAJA;

   } 
   
   public Matricula(){
       
   }
   
   public String toString(){
        
       return "Numero identificador de la Matrícula: "+ identificador+ "\n"+ "Alumno: "+alumno+ "\n"+
               "Estudios del alumno: "+estudio+ "\n"+ "Estado de la Matrícula: "+estado+ "\n"
               + "Fecha de Matriculación: " +fecha+ "\n"+ "Turno: "+Diurno+"\n"+"Estado: "+ALTA;
               
   }
   
   public void setfecha(String fecha){
            
            fecha = fecha;
        }
    
    public String getfecha(){
            
            return fecha;
        }
}
