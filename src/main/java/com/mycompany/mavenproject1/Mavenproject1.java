/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;
import java.util.ArrayList;

/**
 *
 * @author 34085
 */
public class Mavenproject1 {
    
    static ArrayList<Studente> studentsList = new ArrayList<Studente>();
    
    public ArrayList<Studente> searchName(String input){
        
        Boolean studentFound = false;
        ArrayList<Studente> studentsFound = new ArrayList<Studente>();
        
        for(int i=0;i<studentsList.size();i++){
            if(studentsList.get(i).getNome().equals(input)){
               studentFound = true;
               studentsFound.add(new Studente(studentsList.get(i).getID(),studentsList.get(i).getNome(),studentsList.get(i).getCognome()));
               System.out.println(studentsList.get(i).toString());
            }
        }
        if(!studentFound){
            System.out.println("Studente non trovato");
        }
        return studentsFound;
    }
    
    public void initializeDays(){
        
        Materia [] Lunedi = new Materia[5];
        
        Lunedi[0] = new Materia("Matematica",4);
        Lunedi[1] = new Materia("Informatica",3);
        Lunedi[2] = new Materia("GPO",3);
        Lunedi[3] = new Materia("Inglese",3);
        Lunedi[4] = new Materia("TPS",3);
        
        System.out.print("Lunedi: ");
        
        for(int i = 0;i<Lunedi.length;i++){
            System.out.print(Lunedi[i].getNome());
            if(i<Lunedi.length-1){
                System.out.print(", ");
            }else{
                System.out.println("");
            }
        }
        
    }
    
    public void avvia(){
        
        studentsList.add( new Studente("34085","Mathis", "Tagako") );
        studentsList.add( new Studente("34010","Carlo", "Macinati") );
        studentsList.add( new Studente("34056","Joel", "Embiid") );
        studentsList.add( new Studente("34000","Carlo", "Devastati") );
        }

    public static void main(String[] args) {
        
        Mavenproject1 p = new Mavenproject1();
        p.initializeDays(); //Inizializza le materie
        p.avvia();  //Inizializza gli studenti
        //InterfacciaRegistroElettronico n = new InterfacciaRegistroElettronico(p);
        //n.setVisible(true);
        
    }
}