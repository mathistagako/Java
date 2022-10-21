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
public class Materia {
    
    private String nome;
    private String oreSettimanali;

    public Materia(String nome, String oreSettimanali) {
        this.nome = nome;
        this.oreSettimanali = oreSettimanali;
    }

    @Override
    public String toString() {
        return "Materia{" + "nome=" + nome + ", oreSettimanali=" + oreSettimanali + '}';
    }
    
    

    public String getNome() {
        return nome;
    }

    public String getOreSettimanali() {
        return oreSettimanali;
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
