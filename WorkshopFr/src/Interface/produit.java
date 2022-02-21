/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Model.Produit;
import java.util.List;

/**
 *
 * @author admin
 */
public interface produit
{
    public void ajouterProduit (Produit p);
    public List<Produit> afficher();
    public void modifier (int id_prod, String libelle, String reference, String categorie, int stock, String facture);
    public void supprimerSelonId(int id);
    public List<Produit>rechercheDynamique(String recherche);
    
}
