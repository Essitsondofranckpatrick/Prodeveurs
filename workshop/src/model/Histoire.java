/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *                                                      
 * @author user
 */
public class Histoire {
    
    //att
    private int id_histoire;
    private int age;
    private String langue;
    private String nom_histoire;
    
    
    //constructor

    public Histoire( int age, String langue,String nom_histoire) {
        this.age = age;
        this.langue = langue;
        this.nom_histoire= nom_histoire;
    }
    
    //constructor_pardefaut
    public Histoire(){
        
    }
    
    //getters&setters

    public int getId() {
        return id_histoire;
    }

    public void setId(int id) {
        this.id_histoire = id_histoire;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public String getNom_histoire() {
        return nom_histoire;
    }

    public void setNom_histoire(String nom_histoire) {
        this.nom_histoire = nom_histoire;
    }
    
    //afficher

    @Override
    public String toString() {
        return "Histoire{" + "id_histoire=" + id_histoire + ", age=" + age + ", langue=" + langue + ", nom_histoire=" + nom_histoire + '}';
    }

    
    
}
