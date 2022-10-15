/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author mathis
 */
public class Voto {
    private Studente studente;
    private Materia materia;
    private Docente docente;
    private int voto;

    public Voto(Studente studente, Materia materia, Docente docente, int voto) {
        this.studente = studente;
        this.materia = materia;
        this.docente = docente;
        this.voto = voto;
    }

    public Studente getStudente() {
        return studente;
    }

    public Materia getMateria() {
        return materia;
    }

    public Docente getDocente() {
        return docente;
    }

    public int getVoto() {
        return voto;
    }
    
    
}
