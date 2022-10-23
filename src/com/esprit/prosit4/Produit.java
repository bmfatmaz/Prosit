/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.prosit4;

import java.util.Date;

/**
 *
 * @author cercina
 */
public class Produit {
     private  String libelle;
   private String marque;
   private float prix;
   private int id;
   private float quantite;

    // SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 
    Date date;
    public Produit(){
  
  } 
     public Produit(int pId, String pLib, float quantite)
  {
   
    id = pId;
    libelle = pLib;
    this.quantite=quantite;
    
    
  }      
    public Produit(int pId, String pLib, String pMarq ,float prix )
  {
   
    id = pId;
    libelle = pLib;
    marque = pMarq;
    this.prix = prix;
    
    
  }         
    public void afficher() {
       
    System.out.println("id : " +id+ ", Libellé : " +libelle+ ", Marque : "+marque+ ", prix : "+prix+ ", quantite : "+quantite);
}
     public String determinerTypeProduit() {
         if(this instanceof ProduitFruit) 
           return "Fruit";  
         else if(this instanceof ProduitLegume)
           return "Legume";  
         else
             return "autre";

     }

    @Override
    public String toString() {
        return "Produit{" + "libelle=" + libelle + ", marque=" + marque + ", prix=" + prix + ", id=" + id + ", date=" + date +  ", quantite=" + quantite +'}';
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }
     public float getQt() {
        return quantite;
    }

    public void setQt(float quantite) {
        this.quantite = quantite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
}
