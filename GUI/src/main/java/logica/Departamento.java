/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.logica;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * //@author francisco
 */
//@Entity

public class Departamento implements Serializable {
    //@Id 
    private String nom ;
    private String desc,url;
    
    //getters
    public String getNom(){
        return nom;
    }
    public String getDesc(){
        return desc;
    }
    public String getUrl(){
        return url;
    }
    //setters
    public void setNom(String s){
        nom=s;
    }
    public void setDesc(String s){
        desc=s;
    }
    public void setUrl(String s){
        url=s;
    }
    
}
