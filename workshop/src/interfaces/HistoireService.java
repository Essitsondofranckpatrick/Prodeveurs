/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import model.Histoire;
import model.Test_histoire;
/**
 *
 * @author user
 */
public interface HistoireService {
    
    //add
    public void AjouterHistoire(Histoire h);
    //select
    public List<Histoire> afficherhistoire();
    //delete
    public void SupprimerHistoire(int id_histoire);
    //update
    public void ModifierHistoire (int id,int age,String langue,String nom_histoire); 
    
    ////////////////////////
    
    public void AjouterTest_histoire(Test_histoire t);
    //select
    public List<Test_histoire> afficherTest_histoire();
    //delete
    public void SupprimerTest_histoire(int id_test);
    //update
    public void ModifierTest_histoire(int id_test,int id_histoire,String type_test,String nom_test); 
    
    
    
}
