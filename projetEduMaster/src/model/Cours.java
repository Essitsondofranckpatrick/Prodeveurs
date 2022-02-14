/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author dell
 */
public class Cours {
    private int id_cours;
    private String nom_cours;

    
    
    
//contucteur parametre
    
    
//constructeur parametre
    public Cours(int id_cours, String nom_cours) {
        this.id_cours = id_cours;
        this.nom_cours = nom_cours;
    }
//constructeur par defaut 
    public Cours() {
    }

    
    
    //constructeur parametre SANS ID 
    public Cours(String nom_cours) {
        this.nom_cours = nom_cours;
    }
    
    
   
    
    //getters & setters
    public int getId_cours() {
        return id_cours;
    }

    public void setId_cours(int id_cours) {
        this.id_cours = id_cours;
    }

    public String getNom_cours() {
        return nom_cours;
        
    }

    public void setNom_cours(String nom_cours) {
        this.nom_cours = nom_cours;
    }
    
    
    // toString

    @Override
    public String toString() {
        return "Cours{" + "id_cours=" + id_cours + ", nom_cours=" + nom_cours + '}';
    }
    
    
    
    
    
    
}
