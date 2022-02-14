/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;
//ay import logger a eliminer!!!!! 
import interfaces.cours;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Cours;
import util.MaConnexion;


/**
 *
 * @author dell
 */
public class Cours_implementation implements cours {
  
    //var elle sert a .......
    java.sql.Connection cnx= MaConnexion.getInstance().getCnx(); 


      @Override
    public void ajouterCours(Cours c) {
        String req= "INSERT INTO `cours`(`nom_cours`) VALUES ('"+c.getNom_cours()+"')";  //pas d'id car il est auto increment 
      
        try {
             //insert
            Statement st = cnx.createStatement();
            st.executeUpdate(req,0);
            System.out.println("cours ajoute avec succes!!");
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        }  
    }

   
    @Override
    public List<Cours> afficher() {
        List<Cours> cour =new ArrayList<>();
        //request
        String req="SELECT * FROM cours"; //cours c'est le nom de la table dans la bd
        
        
        try {
            Statement st=cnx.createStatement();
             ResultSet rs = st.executeQuery(req);
            while(rs.next()){
        cour.add(new Cours(rs.getInt(1),rs.getString(2)));
        }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return cour;
        
    } 

    @Override
    public void SupprimerParId(Cours c) {
        
        String req="DELETE FROM cours WHERE id_cours="+c.getId_cours();
        try{
              Statement st=cnx.createStatement();
              st.executeUpdate(req);
              System.out.println("cours supprime avec succes!!");
            
        }
        catch(SQLException ex){  
         ex.printStackTrace();
        }
      
    }

    @Override
    public void ModifierCours(Cours c) {
     try{       
      String req="UPDATE cours SET nom_cours='"+c.getNom_cours()+"' WHERE id_cours=" +c.getId_cours();
       Statement st=cnx.createStatement();
       st.executeUpdate(req);
        System.out.println("cours modifie avec succes!!");
   
     }
     catch(SQLException ex){
         ex.printStackTrace();
     }
    }

    @Override
    public void rechercherParId(Cours c) {
        try{
           String req="SELECT * FROM `cours` WHERE id_cours="+c.getId_cours(); 
           Statement st=cnx.createStatement();
           ResultSet rs=st.executeQuery(req);
           rs.last();
           int row=rs.getRow();
           if(row==1){
               System.out.println("Cours trouve!!!");
              // System.out.println(afficher());
               
           }
           else{
               System.out.println("Ce cours n'est pas disponible");
               
           }
        }
       catch(SQLException ex){
         ex.printStackTrace();
}
        
        
        
        
        
    }

    
    
    }

   

   
    
    

