/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.SQLException;
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
                if (i.getID().equals(subjectCode))
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
    
    //RICERCA GENERALE INTERFACCIA
    
    public String ricercaGenerale(String val){
        
        String risultato = "";
        
        for(Studente s: studentsList){
                risultato = (risultato + s.ricerca(val));
        }
        
        for(Docente d: teachersList){
            risultato = (risultato + d.ricerca(val));
        }
        
        for(Materia m: subjectsList){
            risultato = (risultato + m.ricerca(val));
        }
        
        return risultato;
        
    }
    
    //RICERCA GENERALE AVANZATO
    
    public ArrayList<String> generalSearch(String input) throws IllegalAccessException {
        
        ArrayList<String> objects = new ArrayList<String>();  
        
        for(int i=0;i<studentsList.size();i++){
            if(studentsList.get(i).checkMatch(input)){
                System.out.println(studentsList.get(i).toString());
                objects.add(studentsList.get(i).getID());
            }
        }
        
        for(int i=0;i<teachersList.size();i++){
            if(teachersList.get(i).checkMatch(input)){
                System.out.println(teachersList.get(i).toString());
                objects.add(teachersList.get(i).getID());
            }
        }
        
        for(int i=0;i<subjectsList.size();i++){
            if(subjectsList.get(i).checkMatch(input)){
                System.out.println(subjectsList.get(i).toString());
                objects.add(subjectsList.get(i).getID());
            }
        }
        
        return objects;
    }
    
    private void initializeObjects(){
        
    //DATABASE CONNECTION
    
    String url = "jdbc:mysql://localhost:3306/registro_elettronico";
    String user = "java";
    String password = "java";
    String queries[] = {"select * from studenti","select * from docenti","select * from materie"} ;
    
    
    try{
 
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement st = connection.createStatement(); 
        
        
        try {
            for (String q : queries) { 
              ResultSet rset = st.executeQuery(q);
              try {
                while(rset.next()){
                    if(q.equals("select * from studenti")){
                        studentsList.add( new Studente(rset.getString("ID"),rset.getString("nome"),rset.getString("cognome"),rset.getString("classe")) );
                    }
                    if(q.equals("select * from docenti")){
                        teachersList.add( new Docente(rset.getString("ID"),rset.getString("nome"),rset.getString("cognome"),rset.getString("materia")) );
                    }
                    if(q.equals("select * from materie")){
                        subjectsList.add( new Materia(rset.getString("ID"),rset.getString("nome"),rset.getString("oreSettimanali")) );
                    }
                }
              } finally {
                rset.close();
              }
            }
          } finally {
            st.close();
          }
    }
    catch (Exception e) {  
        System.out.println(e.toString());  
    }  
    
        
        
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
        
        InterfacciaRegistroElettronico n = new InterfacciaRegistroElettronico(p);
        n.setVisible(true);
        
    }
}