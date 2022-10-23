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
public class ProduitFruit extends ProduitAgricole {

    public ProduitFruit(String saison, float quantite, int id, String libele) {
        super(saison, quantite,id, libele );
    }

 
    @Override
    public String toString() {
        return "ProduitFruit{" + '}' + super.toString();
    }
    @Override
    public boolean estFrais(String saison) {
        return this.saison.equals(saison);
    }
}
