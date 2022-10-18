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
public class Classe {
    
    private int classe;
    private String sezione;
    private String indirizzo;

    public Classe(int classe, String sezione, String indirizzo) {
        this.classe = classe;
        this.sezione = sezione;
        this.indirizzo = indirizzo;
    }

    public int getClasse() {
        return classe;
    }

    public String getSezione() {
        return sezione;
    }

    public String getIndirizzo() {
        return indirizzo;
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
