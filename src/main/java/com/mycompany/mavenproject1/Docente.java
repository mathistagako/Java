/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author mathis
 */
public class Docente {
    private String ID;
    private String nome;
    private String cognome;
    private Materia materia;

    public Docente(String ID, String nome, String cognome, Materia materia) {
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

    public Materia getMateria() {
        return materia;
    }

    @Override
    public String toString() {
        return "Docente{" + "ID=" + ID + ", nome=" + nome + ", cognome=" + cognome + ", materia=" + materia + '}';
    }
    
    
}
