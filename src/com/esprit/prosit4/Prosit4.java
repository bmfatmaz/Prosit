/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.prosit4;

/**
 *
 * @author cercina
 */
public class Prosit4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Magasin mag = new Magasin(1, "carrefour", "centre-ville");
        Magasin mag2 = new Magasin(2, "Monoprix", "menzah 6");
        
        Caissier c1 = new Caissier(1, "Mohamed", "Tunis", 24, 15);
        Caissier c2 = new Caissier(2, "Mustapha", "Mestir", 24, 12);
        Vendeur v1 = new Vendeur(1, "Omar", "tunis", 25, 20);
        Responsable r1 = new Responsable(1, "Imed", "Boumhel", 12, 40.0);
        
        Caissier c3 = new Caissier(1, "Aziz", "Rades", 24, 11);
        Vendeur v2 = new Vendeur(2, "Ahmed", "H.Lif", 25, 20);
        Vendeur v3 = new Vendeur(3, "Oussema", "Ariana", 25, 21);
        Vendeur v4 = new Vendeur(4, "Hsan", "tunis", 25, 20);
        Responsable r2 = new Responsable(11, "Salah", "Madina Jadida", 161, 30.0);
       
       mag.ajouterEmploye(c1);
       mag.ajouterEmploye(c2);
       mag.ajouterEmploye(v1);
       mag.ajouterEmploye(r1);
       
       mag2.ajouterEmploye(c3);
       mag2.ajouterEmploye(v2);
       mag2.ajouterEmploye(v3);
       mag2.ajouterEmploye(v4);
       mag2.ajouterEmploye(r2);
      System.out.println(c1.toString());
      System.out.println(c2.toString());
      System.out.println(v1.toString());
      System.out.println(r1.toString());
      System.out.println(c3.toString());
      System.out.println(v2.toString());
      System.out.println(v3.toString());
      System.out.println(v4.toString());
      System.out.println(r2.toString());
       Produit p =new Produit(1022, "lait", "delice", 1200);
       Produit p1 =new Produit(1022, "yaourt", "delice", 400);
       Produit p2 =new Produit(1022, "cake", "saida", 1500);
       Produit p3 =new Produit(1022, "jus", "delice", 2000);
       mag.ajouterProduit(p);
       mag.ajouterProduit(p1);
       mag2.ajouterProduit(p2);
       mag2.ajouterProduit(p3);
       System.out.println(mag.toString());
       System.out.println(mag2.toString());

        c1.salaire();
        c2.salaire();  
        c3.salaire();
        v1.salaire();
        v2.salaire();
        v3.salaire();
        v4.salaire();
        r1.salaire();
        r2.salaire();
        Produit produit1= new ProduitFruit("Mars",12.3f,1254,"Fraise");
        Produit produit2= new ProduitFruit("Juin",50,1224,"Pastèque");
        Produit produit3= new ProduitFruit("Décembre ",25.6f,7896,"Mandarine ");
        Produit produit4= new ProduitLegume("Janvier",14,8521,"Artichauts");
         mag.ajouterProduit(produit1);
       mag.ajouterProduit(produit2);
       mag.ajouterProduit(produit3);
       mag.ajouterProduit(produit4);
       System.out.println(mag.toString());
       System.out.println(produit4.determinerTypeProduit());
       System.out.println(p.determinerTypeProduit());
       System.out.println(mag.calculStock());
       
       System.out.println(((ProduitFruit)produit1).estFrais("Mars"));
        System.out.println(((ProduitLegume)produit4).estFrais("Avril"));


        
    }
    
}
