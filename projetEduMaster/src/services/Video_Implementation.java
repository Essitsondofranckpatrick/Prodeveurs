/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import interfaces.video;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Video;
import util.MaConnexion;
import java.sql.Date;
//import java.util.Date;

/**
 *
 * @author dell
 */
public class Video_Implementation implements video {
       java.sql.Connection cnx= MaConnexion.getInstance().getCnx(); 
       
       
       @Override
    public void ajouterVideo(Video v) {
        String req="INSERT INTO `video`(`nom_video`, `date`, `description`) VALUES ('"+v.getNom_video()+"','"+v.getDate()+"','"+v.getDescription()+"')";
         try {
             //insert
            Statement st = cnx.createStatement();
            st.executeUpdate(req,0); 
            System.out.println("video ajoutee avec succes!");
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        }  
       
    }

   
    @Override
    public List<Video> afficher() {
        List<Video> videos= new ArrayList<>();
          String req="SELECT * FROM `video`";
        try {
            Statement st=cnx.createStatement();
             ResultSet rs = st.executeQuery(req);
            while(rs.next()){
        videos.add(new Video(rs.getInt(1),rs.getString(2),rs.getDate(3),rs.getString(4)));
        }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return videos;
        
    }

   
    @Override
    public void SupprimerParId(Video v) {
       String req="DELETE FROM `video` WHERE id_video="+v.getId_video();
        try{
              Statement st=cnx.createStatement();
              st.executeUpdate(req);
              System.out.println("video supprimee avec succes!");
            
        }
        catch(SQLException ex){  
         ex.printStackTrace();
        }
        
    }

   
    

    @Override
    public void ModifierVideo(Video v) {
        
        try{
            String req="UPDATE `video` SET`nom_video`='"+v.getNom_video()+"',`date`='"+v.getDate()+"',`description`='"+v.getDescription()+"' WHERE id_video="+v.getId_video();
            Statement st=cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("video modifiee avec succes!");
        }
        catch(SQLException ex){
            ex.printStackTrace();
            
        }
        
    }

   
    
}
