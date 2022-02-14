/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetedumaster;
import interfaces.cours;
import interfaces.video;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import model.Cours;
import model.Video;
import services.Cours_implementation;
import java.util.Date;
import services.Video_Implementation;

/**
 *
 * @author dell
 */
public class ProjetEduMaster {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // service 
        cours ci= new Cours_implementation(); //utilite de l'interface , lezem nhot de type cours non pas cours_implementation
        //cours 
        Cours c=new Cours(1,"ikadh");
        Cours c1=new Cours(2,"francais");
          Cours c2=new Cours(20,"aarbi");
          //SimpleDateFormat sf= new SimpleDateFormat("yyyy-mm-dd");
          LocalDateTime l = LocalDateTime.now();
        //Date date1 = (Date)
        System.err.println(l);
          //Video v1=new Video(1,"aarabeya",date1,"rhbfjhevjhevjgvsjgvjgevgvsevegj");
        //insert , ajout du cours dans service 
        //ci.ajouterCours(c);
        //ci.ajouterCours(c1);
        //ci.ajouterCours(c2);
       // ci.ModifierCours(5,"maram");
       //ci.SupprimerParId(1);
        
       //affichage
        //System.out.println(ci.afficher());
          //suppression
          //ci.SupprimerParId(3);
          //ci.ModifierCours(1,"mahfoudhat");
          // video vi= new Video_Implementation();
          // vi.ajouterVideo(v1);
          //  vi.ModifierVideo(1,"anglizeya",date1,"maman123");
          //vi.SupprimerParId(3);
   //ci.rechercherParId(1);
  // vi.SupprimerParId(v1);
        /*String dd = null;
        String yyyy = null;
        String mm = null;*/
   /*DateTimeFormatter d= DateTimeFormatter.ofPattern("dd/mm/yyyy HH:mm:ss"); 
   LocalDateTime now= LocalDateTime.now();
   Video v2= new Video(2,"maram",d.format(now),"hbkrejhfjerivejbhjervvesgjvs");*/ //sauf si date est de type String!!!!! 
}
    }