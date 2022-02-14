/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author dell
 */
public class Video {
     private int id_video;
     private String nom_video ;
     private Date date;
     private String description;

    public Video() {
    }

    public Video(String nom_video, Date date, String description) {
        this.nom_video = nom_video;
        this.date = date;
        this.description = description;
    }

    
    
    
    
    public Video(int id_video, String nom_video, Date date, String description) {
        this.id_video = id_video;
        this.nom_video = nom_video;
        this.date = date;
        this.description = description;
    }

    public int getId_video() {
        return id_video;
    }

    public void setId_video(int id_video) {
        this.id_video = id_video;
    }

    public String getNom_video() {
        return nom_video;
    }

    public void setNom_video(String nom_video) {
        this.nom_video = nom_video;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Video{" + "id_video=" + id_video + ", nom_video=" + nom_video + ", date=" + date + ", description=" + description + '}';
    }
     
     
     
 
}
