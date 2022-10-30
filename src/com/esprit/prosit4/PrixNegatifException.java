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
class PrixNegatifException extends Exception {
     public PrixNegatifException(){
        super();
    }
    
    public PrixNegatifException(String msg){
        super(msg);
    }
}
