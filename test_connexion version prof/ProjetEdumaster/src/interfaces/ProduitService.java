/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import model.Produit;

/**
 *
 * @author admin
 */
public interface ProduitService 
{
    public void ajouterProduit(Produit P);//add ajouter
    public List<Produit> afficher(); //afficher, select
   public void SupprimerParId(int id);
   public void ModifierProduit(int id,String nom);
}
