/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.Objects;
import model.Histoire;
/**
 *
 * @author user
 */
public class Test_histoire {
    
    public int id_test;
    private int id_histoire;
    private  String type_test;
    private String nom_test;
    private String contenu_test;
    private String couverture_test;
    private String correction;

    
    public Test_histoire(int id_test, int id_histoire, String type_test, String nom_test, String contenu_test, String couverture_test, String correction) {
        this.id_test = id_test;
        this.id_histoire = id_histoire;
        this.type_test = type_test;
        this.nom_test = nom_test;
        this.contenu_test = contenu_test;
        this.couverture_test = couverture_test;
        this.correction = correction;
    }

    public Test_histoire(int id_histoire, String type_test, String nom_test, String contenu_test, String couverture_test, String correction) {
        this.id_histoire = id_histoire;
        this.type_test = type_test;
        this.nom_test = nom_test;
        this.contenu_test = contenu_test;
        this.couverture_test = couverture_test;
        this.correction = correction;
    }

    
    
    public Test_histoire() {
    }

    public Test_histoire(int id_test) {
        this.id_test = id_test;
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

    public String getContenu_test() {
        return contenu_test;
    }

    public void setContenu_test(String contenu_test) {
        this.contenu_test = contenu_test;
    }

    public String getCouverture_test() {
        return couverture_test;
    }

    public void setCouverture_test(String couverture_test) {
        this.couverture_test = couverture_test;
    }

    public String getCorrection() {
        return correction;
    }

    public void setCorrection(String correction) {
        this.correction = correction;
    }

    @Override
    public String toString() {
        return "Test_histoire{" + "id_test=" + id_test + ", id_histoire=" + id_histoire + ", type_test=" + type_test + ", nom_test=" + nom_test + ", contenu_test=" + contenu_test + ", couverture_test=" + couverture_test + ", correction=" + correction + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.id_test;
        hash = 59 * hash + this.id_histoire;
        hash = 59 * hash + Objects.hashCode(this.type_test);
        hash = 59 * hash + Objects.hashCode(this.nom_test);
        hash = 59 * hash + Objects.hashCode(this.contenu_test);
        hash = 59 * hash + Objects.hashCode(this.couverture_test);
        hash = 59 * hash + Objects.hashCode(this.correction);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Test_histoire other = (Test_histoire) obj;
        if (this.id_test != other.id_test) {
            return false;
        }
        if (this.id_histoire != other.id_histoire) {
            return false;
        }
        if (!Objects.equals(this.type_test, other.type_test)) {
            return false;
        }
        if (!Objects.equals(this.nom_test, other.nom_test)) {
            return false;
        }
        if (!Objects.equals(this.contenu_test, other.contenu_test)) {
            return false;
        }
        if (!Objects.equals(this.couverture_test, other.couverture_test)) {
            return false;
        }
        if (!Objects.equals(this.correction, other.correction)) {
            return false;
        }
        return true;
    }
    
    

    

    
    
    
    
    
    
    
    
}
