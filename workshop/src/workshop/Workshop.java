/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop; 

import model.Histoire;
import model.Test_histoire;
import service.HistoireServiceI;

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
        HistoireServiceI hs = new HistoireServiceI();
        //histoire
        Histoire h2 = new Histoire(20, "ar", "la belle et le roi");
        //insert
        //hs.AjouterHistoire(h2);
        //select
        System.out.println(hs.afficherhistoire());

        // hs.SupprimerHistoire(19);
        // System.out.println(hs.afficherhistoire());
       //hs.ModifierHistoire( 20,22, "fr", "la belle et la bete");
        
        //Test_histoire t1 = new Test_histoire(18,"quizz","refresh");
        //hs.AjouterTest_histoire(t1);
        //hs.SupprimerTest_histoire(1);
       //System.out.println(hs.afficherTest_histoire());
    }

}
