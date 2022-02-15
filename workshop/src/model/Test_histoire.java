/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import model.Histoire;
/**
 *
 * @author user
 */
public class Test_histoire {
    
    private int id_test;
    private int id_histoire;
    private  String type_test;
    private String nom_test;

    
    
    
    public Test_histoire( int id_histoire, String type_test, String nom_test) {
       
        this.id_histoire = id_histoire;
        this.type_test = type_test;
        this.nom_test = nom_test;
    }

    public Test_histoire() {
    }

    public int getId_test() {
        return id_test;
    }

    public void setId_test(int id_test) {
        this.id_test = id_test;
    }

    public int getId_histoire() {
        return id_histoire;
    }

    public void setId_histoire(int id_histoire) {
        this.id_histoire = id_histoire;
    }

    public String getType_test() {
        return type_test;
    }

    public void setType_test(String type_test) {
        this.type_test = type_test;
    }

    public String getNom_test() {
        return nom_test;
    }

    public void setNom_test(String nom_test) {
        this.nom_test = nom_test;
    }

    @Override
    public String toString() {
        return "Test_histoire{ id_histoire=" + id_histoire + ", type_test=" + type_test + ", nom_test=" + nom_test + '}';
    }
    
    
    
}
