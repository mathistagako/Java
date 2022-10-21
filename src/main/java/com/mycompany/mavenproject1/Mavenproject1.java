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
    static ArrayList<Docente> teachersList = new ArrayList<Docente>();
    static ArrayList<Materia> subjectsList = new ArrayList<Materia>();
    static ArrayList<Voto> gradesList = new ArrayList<Voto>();
    
    //FUNZIONI ASSEGNAZIONE 
    
    public Studente findStudent(String studentCode){
            // Goes through the List of students.
            for (Studente i : studentsList)
            {
                if (i.getID().equals(studentCode))
                {
                    return i;   
                }   
            }
            return null;
    }
    
    public Docente findTeacher(String teacherCode){
        
        for (Docente i : teachersList)
            {
                if (i.getID().equals(teacherCode))
                {
                    return i;   
                }
            }
        return null;
    }
    
    public Materia findSubject(String subjectCode){
        
        for (Materia i : subjectsList)
            {
                if (i.getNome().equals(subjectCode))
                {
                    return i;   
                }
            }
        return null;
    }
    
    //FINE ASSEGNAZIONI
    
    //RICERCA
    
    public ArrayList<Studente> searchName(String input){
        
        Boolean studentFound = false;
        ArrayList<Studente> studentsFound = new ArrayList<Studente>();
        
        for(int i=0;i<studentsList.size();i++){
            if(studentsList.get(i).getNome().equals(input)){
               studentFound = true;
               studentsFound.add(new Studente(studentsList.get(i).getID(),studentsList.get(i).getNome(),studentsList.get(i).getCognome(),studentsList.get(i).getClasse()));
               System.out.println(studentsList.get(i).toString());
            }
        }
        if(!studentFound){
            System.out.println("Studente non trovato");
        }
        return studentsFound;
    }
    
    
    
    public void generalSearch(String input) throws IllegalAccessException {
        
        for(int i=0;i<studentsList.size();i++){
            if(studentsList.get(i).checkMatch(input)){
                System.out.println(studentsList.get(i).toString());
            }
        }
        for(int i=0;i<teachersList.size();i++){
            if(teachersList.get(i).checkMatch(input)){
                System.out.println(teachersList.get(i).toString());
            }
        }
        for(int i=0;i<subjectsList.size();i++){
            if(subjectsList.get(i).checkMatch(input)){
                System.out.println(subjectsList.get(i).toString());
            }
        }
    }
    
    public void initializeObjects(){
        
        subjectsList.add(new Materia("TPS","3"));
        teachersList.add(new Docente("001","Lorenzo","Drusin",findSubject("TPS").getNome()));
        
        studentsList.add( new Studente("34085","Mathis", "Tagako","5TELA") );
        studentsList.add( new Studente("34010","Carlo", "Macinati","5TELA") );
        studentsList.add( new Studente("34056","Joel", "Embiid","5TELA") );
        studentsList.add( new Studente("34000","Carlo", "Devastati","5TELA") );
        
        Voto votoTPS1 = new Voto(findStudent("34085"),findSubject("TPS"),findTeacher("001"),8);
        
//        System.out.println(votoTPS1.toString());
//        Materia [] Lunedi = new Materia[5];
//        
//        Lunedi[0] = new Materia("Matematica",4);
//        Lunedi[1] = new Materia("Informatica",3);
//        Lunedi[2] = new Materia("GPO",3);
//        Lunedi[3] = new Materia("Inglese",3);
//        Lunedi[4] = new Materia("TPS",3);
//        
//        System.out.print("Lunedi: ");
//        
//        for(int i = 0;i<Lunedi.length;i++){
//            System.out.print(Lunedi[i].getNome());
//            if(i<Lunedi.length-1){
//                System.out.print(", ");
//            }else{
//                System.out.println("");
//            }
//        }
    }

    public static void main(String[] args) {
        
        Mavenproject1 p = new Mavenproject1();
        p.initializeObjects(); //Inizializza oggetti
        //System.out.println(studentsList.get(0).toString()); Stampa studente specifico
        
        //PROVA
        
//        try{
//        p.generalSearch("5TELA");
//        } catch (IllegalAccessException e) {
//           System.out.println("Non è andato un tubo");
//        }
        
        InterfacciaRegistroElettronico n = new InterfacciaRegistroElettronico(p);
        n.setVisible(true);
        
    }
}