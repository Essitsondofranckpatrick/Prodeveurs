/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import interfaces.HistoireService;
import java.sql.Date;
import java.time.LocalDate;
import model.Histoire;
import model.Resultat_test_histoire;
import model.Test_histoire;
import service.HistoireI;
import service.PDFClasse;
import service.Resultat_test_histoireI;
import service.Test_HistoireI;

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
        Test_HistoireI ts = new Test_HistoireI();
        Test_histoire t1 = new Test_histoire(20, "quizzs", "azerty", "querty", "hi", "ABC");
//       
        Resultat_test_histoireI resultat = new Resultat_test_histoireI();
        // resultat.comparerCorrection(new Resultat_test_histoire(1, 1, 3, 0, Date.valueOf(LocalDate.now())));
//        

        // System.out.println(hs.rechercherHistoire("laeila w dhib")); 
        // ts.AjouterTest_histoire(t1);
        // if (ts.id_test != t1.id_test){
        //  System.out.println("histoire existe");
        //}
        //System.out.println(ts.afficherTest_histoire());
        //histoire
        //Histoire h2 = new Histoire(25, "arabe", "la belle ");
        //insert
        //hs.AjouterHistoire(h2);
        //select
        // hs.SupprimerHistoire(22);
        // System.out.println(hs.afficherhistoire());
        // hs.ModifierHistoire( h2);
        //**
        // if (hs.ModifierHistoire (new Histoire(18))) {
        //   System.out.println("histoire modifié avec succes.");
        // } else {
        //   System.out.println("Erreur de modification.");
        //}
        //**
        //Test_histoire t1 = new Test_histoire(18,"quizz","refresh");
        //hs.AjouterTest_histoire(t1);
        //hs.SupprimerTest_histoire(1);
        //System.out.println(hs.afficherTest_histoire());
        //manipulation pdf
        PDFClasse pdf = new PDFClasse();
        Resultat_test_histoire x = resultat.afficher()
                .stream()
                .filter(e -> e.getId_resultat() == 1)
                .findAny()
                .orElse(null);
        pdf.lireHistoire(x);
    }

}
