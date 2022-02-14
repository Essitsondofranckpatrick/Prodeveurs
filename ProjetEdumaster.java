/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetedumaster;

import model.Produit;
import service.ProduitService;

/**
 *
 * @author admin
 */
public class ProjetEdumaster {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ProduitService ps = new ProduitService();
        Produit p1 = new Produit("wissal");
       // ps.ajouterProduit(p1);
      // System.out.println(ps.afficher());
        
       ps.ModifierProduit(6, "Monde");
       
       //ps.SupprimerParId(5);
       
       
        
    }
    
}
