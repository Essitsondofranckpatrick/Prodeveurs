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
public class Produit 
{
    private int id_prod;
    private String libelle;
    private String reference;
    private String categorie;
    private int stock;
    public String facture;

    public Produit(int id_prod, String libelle, String reference, String categorie, int stock,String facture) {
        this.id_prod = id_prod;
        this.libelle = libelle;
        this.reference = reference;
        this.categorie = categorie;
        this.stock = stock;
        this.facture = facture;
        
    }

    public String getFacture() {
        return facture;
    }

    public void setFacture(String facture) {
        this.facture = facture;
    }


    public Produit(String libelle, String reference, String categorie, int stock, String facture) {
        this.libelle = libelle;
        this.reference = reference;
        this.categorie = categorie;
        this.stock = stock;
        this.facture = facture;
    }

    public int getId_prod() {
        return id_prod;
    }

    public void setId_prod(int id_prod) {
        this.id_prod = id_prod;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Produit{" + "id_prod=" + id_prod + ", libelle=" + libelle + ", reference=" + reference + ", categorie=" + categorie + ", stock=" + stock + ", facture=" + facture + '}';
    }

    
    
    
}
