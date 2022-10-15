/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author 34085
 */
public class Studente {
   private String ID;
   private String nome;
   private String cognome;
   private Classe classe;

    public Studente(String ID, String nome, String cognome) {
        this.ID = ID;
        this.nome = nome;
        this.cognome = cognome;
    }

    @Override
    public String toString() {
        return "Studente{" + "ID=" + ID + ", nome=" + nome + ", cognome=" + cognome + '}';
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

    public Classe getClasse() {
        return classe;
    }

    
   
}
