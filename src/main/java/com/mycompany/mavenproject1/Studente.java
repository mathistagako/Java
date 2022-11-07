/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.lang.reflect.Field;

/**
 *
 * @author 34085
 */
public class Studente implements RicercaGenerale{
   private String ID;
   private String nome;
   private String cognome;
   private String classe;

    public Studente(String ID, String nome, String cognome, String classe) {
        this.ID = ID;
        this.nome = nome;
        this.cognome = cognome;
        this.classe = classe;
    }

    @Override
    public String toString() {
        return "Studente{" + "ID=" + ID + ", nome=" + nome + ", cognome=" + cognome + ", classe="+ classe + '}';
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

    public String getClasse() {
        return classe;
    }
    
    //METODO RICERCA GENERALE INTERFACCIA

    @Override
    public String ricerca(String p) {
        
        String risultato = "";
        
        if(ID.equalsIgnoreCase(p)){
            risultato = (ID + " " + nome + " " + cognome + " " + classe + "\n");
        }
        if(nome.equalsIgnoreCase(p)){
            risultato = (ID + " " + nome + " " + cognome + " " + classe + "\n");
        }
        if(cognome.equalsIgnoreCase(p)){
            risultato = (ID + " " + nome + " " + cognome + " " + classe + "\n");
        }
        if(classe.equalsIgnoreCase(p)){
            risultato = (ID + " " + nome + " " + cognome + " " + classe + "\n");
        }
        
        return risultato;
    }
    
    //METODO RICERCA GENERALE AVANZATO

    public boolean checkMatch(String keyword) throws IllegalAccessException {
    for(Field field: this.getClass().getDeclaredFields()){
        String value = (String) field.get(this);
        if(value.equalsIgnoreCase(keyword))
            return true;
    }
   return false;
}
   
}
