/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import interfaces.HistoireService;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Histoire;
import model.Test_histoire;
import util.MaConnexion;

/**
 *
 * @author user
 */
public class HistoireServiceI implements HistoireService {

    //var 
    static java.sql.Connection cnx = MaConnexion.getInstance().getCnx();

    @Override
    public void AjouterHistoire(Histoire h) {
        //request                                           
        String req = "INSERT INTO `histoire`( `age`, `langue`, `nom_histoire`) VALUES ('" + h.getAge() + "','" + h.getLangue() + "',  '"+h.getNom_histoire()+"')";

        try {
            //insert
            Statement st = cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("histoire ajoutee avec succes");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public List<Histoire> afficherhistoire() {
        //var
        List<Histoire> histoires = new ArrayList<>();
        //request
        String req = "SELECT * FROM histoire";

        try {
            //exec

            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(req);

            while (rs.next()) {

                histoires.add(new Histoire(rs.getInt(1), rs.getString(2), rs.getString(3)));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return histoires;
    }

    public void SupprimerHistoire(int id_histoire) {
        try {
            String req = "DELETE FROM histoire where id_histoire=" + id_histoire;
            Statement st = cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("histoire est supprime");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void ModifierHistoire(int id, int age, String langue, String nom_histoire) {
        try {
            String req = "UPDATE `histoire` SET `age`='" + age + "',`langue`='" + langue + "',`nom_histoire`='" + nom_histoire + "' WHERE id_histoire= "+id ;
            Statement st = cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("histoire est modifier");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    //////////////////////////////////
    
    @Override
    public void AjouterTest_histoire(Test_histoire t) {
//request                                           
        String req = "INSERT INTO `test_histoire` ( `id_histoire`, `type_test`, `nom_test`) VALUES ('" + t.getId_histoire() + "','" + t.getType_test() + "', '" +t.getNom_test() +"')";

        try {
            //insert
            Statement st = cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("test ajoutee avec succes");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }    }

    @Override
    public List<Test_histoire> afficherTest_histoire() {
        //var
        List<Test_histoire> tests = new ArrayList<>();
        //request
        String req = "SELECT * FROM test_histoire";

        try {
        //exec
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(req);

            while (rs.next()) {

                tests.add(new Test_histoire( rs.getInt(2),  rs.getString(3), rs.getString(4)));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return tests;    
    }

    @Override
    public void SupprimerTest_histoire(int id_test) {
try {
            String req = "DELETE FROM test_histoire where id_test=" + id_test;
            Statement st = cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("test est supprime");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }    }

    @Override
    public void ModifierTest_histoire(int id_test, int id_histoire, String type_test, String nom_test) {
 try {
     
            String req = "UPDATE `test_histoire` SET `id_test`='" + id_histoire + "',`type_test`='" + type_test + "',`nom_test`='" + nom_test + "' WHERE id_test= "+id_test ;
            Statement st = cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("test est modifié");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }    }

}
