/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import Interface.fournisseur;
import Model.Fournisseur;
import Util.MaConnexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author admin
 */
public class Fournisseur_implementation implements fournisseur
{
    java.sql.Connection cnx= MaConnexion.getInstance().getCnx();

    @Override
    public void ajouterFournisseur(Fournisseur f) 
    {
         String req= "INSERT INTO `fournisseur` ( `nom_fournisseur`, `email_fournisseur`, `type_fournisseur`) VALUES ('" + f.getNom_fournisseur() + "','" + f.getEmail_fournisseur() + "',  '"+f.getType_fournisseur()+"')";
         
         try
         {
             Statement st= cnx.createStatement();
             st.execute(req,0);
             System.out.println("Fournisseur ajouter avec succés");
             
         }
         catch(SQLException ex)
         {
             ex.printStackTrace();
         }
         
    }

    @Override
    public List<Fournisseur> afficher() 
    {
        List<Fournisseur> fournisseur = new ArrayList<>();
        String req="SELECT * FROM `fournisseur`";
        
        try
        {
            Statement st=cnx.createStatement();
            ResultSet rs= st.executeQuery(req);
            while(rs.next())
            {
                fournisseur.add(new Fournisseur(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
            }
        
        }catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return fournisseur;
        
    }

    @Override
    public void modifier(int id, String nom_fournisseur, String email_fournisseur, String type_fournisseur) 
    {
         String req ="UPDATE fournisseur SET nom_fournisseur=?, email_fournisseur=?, type_fournisseur=? WHERE id_fournisseur =? ";
      try {
      PreparedStatement preparedStmt = cnx.prepareStatement(req);
      preparedStmt.setString(1, nom_fournisseur);
      preparedStmt.setString(2, email_fournisseur);
      preparedStmt.setString(3, type_fournisseur);
      preparedStmt.setInt(4, id);
      preparedStmt.executeUpdate();
      System.out.println("article modifié avec succes");

      } catch (SQLException ex) {
          ex.printStackTrace();
        }
      
    }

    @Override
    public void supprimerSelonId(int id) 
    {
        String req = "DELETE FROM fournisseur " +
            "WHERE id_fournisseur = ?";
         try {
      PreparedStatement preparedStmt = cnx.prepareStatement(req);
      preparedStmt.setInt(1, id);
      preparedStmt.executeUpdate();
      System.out.println("Fournisseur supprimé avec succes");

      } catch (SQLException ex) {
          ex.printStackTrace();
        }
    }
    
}
