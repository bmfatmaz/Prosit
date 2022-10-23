/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.prosit4;

/**
 *
 * @author Administrateur
 */
public abstract class ProduitAgricole extends Produit implements Critere{
    public String saison;
    public ProduitAgricole (String saison, float quantite, int id, String libele){
    
    super(id,libele,quantite);
    this.saison=saison;
    
    }
    
    
}
