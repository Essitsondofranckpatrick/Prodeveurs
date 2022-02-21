/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import Interface.produit;
import Model.Produit;
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
public class Produit_implementation implements produit
{
      java.sql.Connection cnx= MaConnexion.getInstance().getCnx();
    
    @Override
    public void ajouterProduit(Produit p) 
    {
        String req= "INSERT INTO `produit`(`libelle`, `reference`, `categorie`, `stock`, `facture`) VALUES('" + p.getLibelle() + "','" + p.getReference() + "',  '"+p.getCategorie()+"', '"+p.getStock()+"','"+p.getFacture()+"')";
        
        try
        {
            Statement st= cnx.createStatement();
            st.execute(req,0);
            System.out.println("Produit ajouter avec succés");
            
        }catch(SQLException ex)
        {
            ex.printStackTrace();
        }
    }

    @Override
    public List<Produit> afficher() 
    {
        List<Produit> produit = new ArrayList<>();
        String req="SELECT * FROM `produit`";
        
        try
        {
            Statement st=cnx.createStatement();
            ResultSet rs= st.executeQuery(req);
            while(rs.next())
            {
                produit.add(new Produit(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getInt(5), rs.getString(6)));
            }
        
        }catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return produit;
    }

    @Override
    public void modifier(int id, String libelle, String reference, String categorie, int stock, String facture) 
    {
        String req ="UPDATE produit SET libelle=?, reference=?, categorie=?, stock=?, facture=?  WHERE id_prod=? ";
      try {
      PreparedStatement preparedStmt = cnx.prepareStatement(req);
      preparedStmt.setString(1, libelle);
      preparedStmt.setString(2, reference);
      preparedStmt.setString(3, categorie);
      preparedStmt.setInt(4, stock);
       preparedStmt.setString(5, facture);
      preparedStmt.setInt(6, id);
      preparedStmt.executeUpdate();
      System.out.println("Produit modifié avec succes");

      } catch (SQLException ex) {
          ex.printStackTrace();
        }
    }

    @Override
    public void supprimerSelonId(int id) 
    {
         String req = "DELETE FROM produit " +
            "WHERE id_prod = ?";
         try {
      PreparedStatement preparedStmt = cnx.prepareStatement(req);
      preparedStmt.setInt(1, id);
      preparedStmt.executeUpdate();
      System.out.println("Produit supprimé avec succes");

      } catch (SQLException ex) {
          ex.printStackTrace();
        }
    }

    @Override
    public List<Produit> rechercheDynamique(String recherche) 
    {
        List<Produit> produit =new ArrayList<>();
        String req="SELECT * FROM produit WHERE reference LIKE '"+recherche+"%'";
        
        try {
            Statement st=cnx.createStatement();
            ResultSet rs=st.executeQuery(req);
            while(rs.next()){
                produit.add(new Produit(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6)));
            }
            
        } catch (SQLException ex) {
          ex.printStackTrace();
        }
        return produit;
    
    }
    
}
