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
public class ProduitLegume extends ProduitAgricole{
    

 public  ProduitLegume(String saison, float quantite, int id, String libele) {
        super(saison, quantite,id, libele );
    }

    @Override
    public String toString() {
        return "ProduitLegume{" + '}' + super.toString();
    }
     @Override
    public boolean estFrais(String saison) {
      String[] mois={"Janvier","Février","Mars","Avril","Mai","Juin","Juillet","Aout","Septembre","Octobre","Novembre","Décembre"};
      int index=-1;
       for(int i=0;i<mois.length-1;i++){
           if(this.saison.equals(mois[i])){
               index=i;
            
           }
       
       }
      if(saison.equals(this.saison) || saison.equals(mois[index+1]))
         return true;
      else
       return false;
    }
}
    


