/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.lang.reflect.Field;
/**
 *
 * @author mathis
 */
public class Voto {
    private String ID;
    private Studente studente;
    private Materia materia;
    private Docente docente;
    private int voto;

    public Voto(String ID,Studente studente, Materia materia, Docente docente, int voto) {
        this.ID = ID;
        this.studente = studente;
        this.materia = materia;
        this.docente = docente;
        this.voto = voto;
    }

    @Override
    public String toString() {
        return "Voto{" + "studente=" + studente.getCognome() + " " + studente.getNome() + ", materia=" + materia.getNome() + ", docente=" + docente.getCognome() + ", voto=" + voto + '}';
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
    
    public boolean checkMatch(String keyword) throws IllegalAccessException {
    for(Field field: this.getClass().getDeclaredFields()){
        String value = (String) field.get(this);
        if(value.equalsIgnoreCase(keyword))
            return true;
    }
   return false;
}
   
}
