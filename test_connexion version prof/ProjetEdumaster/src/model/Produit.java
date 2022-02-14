/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author admin
 */
public class Produit 
{
    private int id_produit;
    private String nom_produit;
//constructeur par def
   
   
   
//contucteur parametre
//test   
   

    public Produit(int id_produit, String nom_produit) {
        this.id_produit = id_produit;
        this.nom_produit = nom_produit;
    }

    
    
    public Produit( String nom_produit) {

        this.nom_produit = nom_produit;
    }
    
    public Produit() {
    }
   
   
    //getters & setters
    public int getId_produit() {
        return id_produit;
    }

    public void setId_produit(int id_produit) {
        this.id_produit = id_produit;
    }

 

    public void setNom_produit(String nom_produit) {
        this.nom_produit = nom_produit;
    }
   
   
    // toString

    @Override
    public String toString() {
        return "Produit{" + "id_produit=" + id_produit + ", nom_produit=" + nom_produit + '}';
    }

    public String getNom_produit() {
        return nom_produit;
    }

   
   
}
