/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import model.Resultat_test_histoire;
import model.Test_histoire;
import static service.Test_HistoireI.cnx;

/**
 *
 * @author user
 */
public class Resultat_test_histoireI {

    public void comparerCorrection(Resultat_test_histoire r) {

        String req = "SELECT `correction` FROM test_histoire WHERE `id_test`='" + r.getId_test() + "'";
        String correction = "";
        try {
            //exec
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(req);
            while (rs.next()) {
                correction = rs.getString("correction");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez votre réponse : ");
        String reponse = sc.nextLine();
       
        //controle saisie
        if (reponse.equals("")){
            System.out.println("veuillez entrer une réponse!!!  ");
        }

        if (reponse.equals(correction)) {
            System.out.println("reponse vraie");
            try {
                String requette = " UPDATE `user` SET `score_testHistoire` =  `score_testHistoire`+ 20   WHERE `id_user`= '" + r.getId_user() + "' ";
                Statement stm = cnx.createStatement();
                stm.executeUpdate(requette);
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }

        } else {
            System.out.println("reponse fausse");
        }
    }
}
