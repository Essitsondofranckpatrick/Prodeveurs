/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Model.Fournisseur;
import java.util.List;

/**
 *
 * @author admin
 */
public interface fournisseur 
{
    public void ajouterFournisseur (Fournisseur f);
    public List<Fournisseur> afficher();
    public void modifier(int id_fournisseur, String nom_fournisseur, String email_fournisseur, String type_fournisseur);
    public void supprimerSelonId(int id);
}
