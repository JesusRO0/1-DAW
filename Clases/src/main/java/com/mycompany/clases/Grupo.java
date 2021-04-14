
package com.mycompany.clases;


public class Grupo {
    
    int identificador;
    int código;
    String estudio;
    String turno;
    String curso;
    String tutor;
    int matriculas;
    String profesores;
    
    
    public Grupo (int idGrupo, int codGrupo, String estudioGrupo, String turnoGrupo, String cursoGrupo, String tutor, int matriculas, String profesores){
        
        this.identificador = idGrupo;
        this.código = codGrupo;
        this.estudio = estudio;
        this.turno = turnoGrupo;
        this.curso = cursoGrupo;
        this.tutor = tutor;
        this.matriculas = matriculas;
        this.profesores = profesores;
    }
    
    Grupo(){
    }
    
    
 
    }
