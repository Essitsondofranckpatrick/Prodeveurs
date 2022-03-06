/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetedumaster;
import interfaces.cours;
import interfaces.video;
import java.text.SimpleDateFormat;
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
        
//COURS




// service 
        cours ci= new Cours_implementation(); //utilite de l'interface , lezem nhot de type cours non pas cours_implementation
        //cours 
       Cours c=new Cours("Francais", "Bonjour chers eleves",30, 2);
          ci.ajouterCours(c);
//ci.ModifierCours(c);
//ci.SupprimerParId(c);
//System.out.println(ci.afficher();
         
        






//VIDEO
        
          
        
         video vi= new Video_Implementation();
      Video v1=new Video("maths", "18/02/2022","ce cours est tres compliqueeee","1:30:23");
         //vi.ajouterVideo(v1);
         Video v2=new Video(16,"mathematiques","19/02/2022","blablabla", "1:00:00");
         //vi.afficher();
           vi.ModifierVideo(v2);
          //vi.SupprimerParId(3);
   //ci.rechercherParId(c);
 
        

}
    }