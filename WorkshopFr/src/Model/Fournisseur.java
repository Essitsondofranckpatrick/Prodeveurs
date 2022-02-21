/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author admin
 */
public class Fournisseur 
{
    private int id_fournisseur;
    private String nom_fournisseur;
    private String email_fournisseur;
    private String type_fournisseur;

    public Fournisseur(int id_fournisseur, String nom_fournisseur, String email_fournisseur, String type_fournisseur) {
        this.id_fournisseur = id_fournisseur;
        this.nom_fournisseur = nom_fournisseur;
        this.email_fournisseur = email_fournisseur;
        this.type_fournisseur = type_fournisseur;
    }

    public Fournisseur(String nom_fournisseur, String email_fournisseur, String type_fournisseur) {
        this.nom_fournisseur = nom_fournisseur;
        this.email_fournisseur = email_fournisseur;
        this.type_fournisseur = type_fournisseur;
    }

    public int getId_fournisseur() {
        return id_fournisseur;
    }

    public void setId_fournisseur(int id_fournisseur) {
        this.id_fournisseur = id_fournisseur;
    }

    public String getNom_fournisseur() {
        return nom_fournisseur;
    }

    public void setNom_fournisseur(String nom_fournisseur) {
        this.nom_fournisseur = nom_fournisseur;
    }

    public String getEmail_fournisseur() {
        return email_fournisseur;
    }

    public void setEmail_fournisseur(String email_fournisseur) {
        this.email_fournisseur = email_fournisseur;
    }

    public String getType_fournisseur() {
        return type_fournisseur;
    }

    public void setType_fournisseur(String type_fournisseur) {
        this.type_fournisseur = type_fournisseur;
    }

    @Override
    public String toString() {
        return "Fournisseur{" + "id_fournisseur=" + id_fournisseur + ", nom_fournisseur=" + nom_fournisseur + ", email_fournisseur=" + email_fournisseur + ", type_fournisseur=" + type_fournisseur + '}';
    }
    
    
    
}
