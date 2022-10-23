/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.prosit4;

import java.util.Vector;

/**
 *
 * @author cercina
 */
public class Magasin {
    
   private int id;
   private String nom;
   private String adr;
    
   private int cap;
   private int nbr_employe;
    private Produit[] produits;
    
private Employe[] employes;
        
    
     public Magasin(){
         
  } 

    public Magasin(int id, String adr, int cap, Produit p) {
        this.id = id;
        this.adr = adr;
        this.cap = cap;
      this.produits= new Produit[50];
      this.employes= new Employe[20];

      
    }
    
    
    
      public Magasin(int id, String nom, String adr) {
        this.id = id;
        this.nom = nom;
        this.adr = adr;
        this.produits= new Produit[50];
        this.employes= new Employe[20];


    }
      
      
     public void ajouterEmploye (Employe e){
    if (this.nbr_employe<20){
    
    //tab[i]=2;    
    employes[this.nbr_employe]=e;
    this.nbr_employe++;
    }else 
    {
        System.out.println("Tableau pleint .....");
    }
}

   public void ajouterProduit (Produit p){
    if (this.cap<50){
    
    //tab[i]=2;    
    produits[this.cap]=p;
    this.cap++;
    }else 
    {
        System.out.println("Tableau pleint .....");
    }
}

    @Override
   public String toString (){
    String str ="";
    String str2 ="";

    for (int i =0 ; i<this.cap;i++){
        //str=str+"7ajja"
        str+="\n nom:  "+produits[i].getLibelle()+"  Prix:  "+produits[i].getPrix();
    }
     for (int i =0 ; i<this.nbr_employe;i++){
        //str=str+"7ajja"
        str2+="\n nom:  "+employes[i].getNom()+"  nombre d'heures:  "+employes[i].getNbr_h();
    }
    
    
    return "le magansin  id :"+this.id+"\n nom :  "+this.nom+"\nadresse "+this.adr+"\n capacité "+this.cap+"\n Produits: "+str+"\n Employés"+str2;
}
   public float calculStock (){
              float stock=0.0f;

    for (int i =0 ; i<this.cap;i++){
        //str=str+"7ajja"
        if (this.produits[i] instanceof ProduitFruit)
            stock=stock+produits[i].getQt();
       
    }
    return stock;
   }
    
     
    
  
}
