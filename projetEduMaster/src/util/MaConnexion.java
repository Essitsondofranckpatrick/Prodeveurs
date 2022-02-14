/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import static java.time.Clock.system;


/**
 *
 * @author dell
 */
public class MaConnexion {

   // BD credentials 
    final static String URL="jdbc:mysql://127.0.0.1:3306/edumaster"; //chemin mtaa l bd mteei 
    final static String USERNAME="root";
    final static String PWD="";
       //attribut
    private Connection cnx;
    //singleton : 1ere etape ,initialisation
    static MaConnexion instance=null;
    
    //constructor
    //singleton 2

    public MaConnexion() {
        try{
            cnx=DriverManager.getConnection(URL, USERNAME, PWD);
            System.out.println("connexion etablie avec succes");
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    //getters setters zeyda

    public Connection getCnx() {
        return cnx;
    }
    
    //singleton 3 get instance de MaConnexion
    public static MaConnexion getInstance(){
        if (instance==null){
            instance=new MaConnexion();
        }
        return instance;
    }
    
    
    
    
    
}
