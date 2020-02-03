/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.singleton.database;

/**
 *
 * @author CORE I7
 */
public class Conector {
    private static Conector conector;
    
    private Conector(){
        
    }
    
    public static Conector getConector(){
        if(Conector.conector == null)
            conector = new Conector();
        return Conector.conector;
    }
}
