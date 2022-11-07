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
public class Materia implements RicercaGenerale{
    
    private String ID;
    private String nome;
    private String oreSettimanali;

    public Materia(String ID, String nome, String oreSettimanali) {
        this.ID = ID;
        this.nome = nome;
        this.oreSettimanali = oreSettimanali;
    }

    @Override
    public String toString() {
        return "Materia{" + "ID="+ ID + "nome=" + nome + ", oreSettimanali=" + oreSettimanali + '}';
    }

    public String getID() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    public String getOreSettimanali() {
        return oreSettimanali;
    }
    
    //METODO RICERCA GENERALE INTERFACCIA
    
    @Override
    public String ricerca(String p) {
        
        String risultato = "";
        
        if(ID.equalsIgnoreCase(p)){
            risultato = (ID + " " + nome + " " + oreSettimanali +"\n");
        }
        if(nome.equalsIgnoreCase(p)){
            risultato = (ID + " " + nome + " " + oreSettimanali +"\n");
        }
        if(oreSettimanali.equalsIgnoreCase(p)){
            risultato = (ID + " " + nome + " " + oreSettimanali +"\n");
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
