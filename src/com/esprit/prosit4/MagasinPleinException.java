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
class MagasinPleinException extends Exception {
    public MagasinPleinException(){
        super();
    }
    
    public MagasinPleinException(String msg){
        super(msg);
    }
}
