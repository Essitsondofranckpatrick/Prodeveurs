/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Produit;
import util.MaConnexion;

/**
 *
 * @author admin
 */
public class ProduitService extends Produit  
{
       java.sql.Connection cnx= MaConnexion.getInstance().getCnx();
       
    public void ajouterProduit(Produit p) {
        String req= "INSERT INTO `produit`(`nom_produit`) VALUES ('"+p.getNom_produit()+"')";  //pas d'id car il est auto increment
     
        try {
             //insert
            Statement st = cnx.createStatement();
            st.executeUpdate(req,0);
            System.out.println("produit ajoute avec succes");
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }  
    }

   
    public List<Produit> afficher() {
        List<Produit> cour =new ArrayList<>();
        //request
        String req="SELECT * FROM produit"; //cours c'est le nom de la table dans la bd
       
       
        try {
            Statement st=cnx.createStatement();
             ResultSet rs = st.executeQuery(req);
            while(rs.next()){
        cour.add(new Produit(rs.getInt(1),rs.getString(2)));
        }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return cour;
       
    }

    public void SupprimerParId(int id_produit) {
       
        String req="DELETE FROM produit WHERE id_produit="+id_produit;
        try{
              Statement st=cnx.createStatement();
              st.executeUpdate(req);
              System.out.println("produit supprime avec succes");
           
        }
        catch(SQLException ex){  
         ex.printStackTrace();
        }
     
    }

    public void ModifierProduit(int id_produit,String nom) {
     try{      
      String req="UPDATE produit SET nom_produit='"+nom+"' WHERE id_produit=" +id_produit;
       Statement st=cnx.createStatement();
       st.executeUpdate(req);
        System.out.println("produit modifie avec succes");
   
     }
     catch(SQLException ex){
         ex.printStackTrace();
     }
    }

}
