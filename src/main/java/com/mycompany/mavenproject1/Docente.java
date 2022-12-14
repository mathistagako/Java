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
public class Docente implements RicercaGenerale{
    private String ID;
    private String nome;
    private String cognome;
    private String materia;

    public Docente(String ID, String nome, String cognome, String materia) {
        this.ID = ID;
        this.nome = nome;
        this.cognome = cognome;
        this.materia = materia;
    }

    public String getID() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getMateria() {
        return materia;
    }

    @Override
    public String toString() {
        return "Docente{" + "ID=" + ID + ", nome=" + nome + ", cognome=" + cognome + ", materia=" + materia + '}';
    }
    
    @Override
    public String ricerca(String p) {
        
        String risultato = "";
        
        if(ID.equalsIgnoreCase(p)){
            risultato = (ID + " " + nome + " " + cognome + " " + materia + "\n");
        }
        if(nome.equalsIgnoreCase(p)){
            risultato = (ID + " " + nome + " " + cognome + " " + materia + "\n");
        }
        if(cognome.equalsIgnoreCase(p)){
            risultato = (ID + " " + nome + " " + cognome + " " + materia + "\n");
        }
        if(materia.equalsIgnoreCase(p)){
            risultato = (ID + " " + nome + " " + cognome + " " + materia + "\n");
        }
        
        return risultato;
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
