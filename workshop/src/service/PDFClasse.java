/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.itextpdf.text.pdf.*;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import model.Resultat_test_histoire;
import static service.Test_HistoireI.cnx;

/**
 *
 * @author user
 */
public class PDFClasse {

    public void lireHistoire(Resultat_test_histoire r) {

        int i = r.getLigne_histoire() + 1;

        try {
            PdfReader pdf = new PdfReader("C:\\Users\\user\\Desktop\\PI DEV\\conte.pdf");
            int nbrPages = pdf.getNumberOfPages();
            if (r.getLigne_histoire() >= nbrPages) {
                System.out.println("histoire termine");
                return;
            }

            if (i < nbrPages) {
                while (i < nbrPages) {
                    String content = PdfTextExtractor.getTextFromPage(pdf, i);
                    System.out.println("Contenu du page " + i + ":\n" + content + "\n");

                    Scanner sc = new Scanner(System.in);
                    System.out.println("Voulez vous continuer à lire ? (Oui|Non) : ");
                    String reponse = sc.nextLine();

                    if ("NON".equals(reponse.toUpperCase())) {
                        try {
                            String requette = " UPDATE `resultat_test_histoire` SET `ligne_histoire` =  '" + i + "'   WHERE `id_resultat`= '" + r.getId_resultat() + "'";
                            Statement stm = cnx.createStatement();
                            stm.executeUpdate(requette);
                        } catch (SQLException ex) {
                            System.out.println(ex.getMessage());
                        }
                        System.out.println("vous etes arrete a la page " + i);

                        break;
                    } else {
                        i++;
                    }
                }

            }
            if (i >= nbrPages) {
                String content = PdfTextExtractor.getTextFromPage(pdf, i);
                System.out.println("Contenu du page " + i + ":\n" + content + "\n");
                r.setLigne_histoire(nbrPages);
                try {
                    String requette = " UPDATE `resultat_test_histoire` SET `ligne_histoire` =  '" + i + "'   WHERE `id_resultat`=  '" + r.getId_resultat() + "' ";
                    Statement stm = cnx.createStatement();
                    stm.executeUpdate(requette);
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }

            pdf.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
