/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop; 

import interfaces.HistoireService;
import model.Histoire;
import model.Test_histoire;
import service.HistoireI;

/**
 *
 * @author user
 */
public class Workshop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //service
       HistoireI hs = new HistoireI();
        //histoire
        //Histoire h2 = new Histoire(25, "arabe", "la belle ");
        //insert
        //hs.AjouterHistoire(h2);
        //select
        //System.out.println(hs.afficherhistoire());

        // hs.SupprimerHistoire(22);
        
        // System.out.println(hs.afficherhistoire());
      // hs.ModifierHistoire( h2);
       //**//
       // if (hs.ModifierHistoire (new Histoire(18))) {
         //   System.out.println("histoire modifié avec succes.");
       // } else {
         //   System.out.println("Erreur de modification.");
        //}
        //**//
        
        //Test_histoire t1 = new Test_histoire(18,"quizz","refresh");
        //hs.AjouterTest_histoire(t1);
        //hs.SupprimerTest_histoire(1);
       //System.out.println(hs.afficherTest_histoire());
    }

}
