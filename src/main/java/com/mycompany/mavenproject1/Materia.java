/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author mathis
 */
public class Materia {
    
    private String nome;
    private int oreSettimanali;

    public Materia(String nome, int oreSettimanali) {
        this.nome = nome;
        this.oreSettimanali = oreSettimanali;
    }

    public String getNome() {
        return nome;
    }

    public int getOreSettimanali() {
        return oreSettimanali;
    }
    
}
