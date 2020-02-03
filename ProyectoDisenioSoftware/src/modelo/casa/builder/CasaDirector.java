/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.casa.builder;

import modelo.casa.decorator.Casa;

/**
 *
 * @author CORE I7
 */
public class CasaDirector {
    public CasaBuilder builder;
    
    public void build(){
        builder.aplanarTerreno();
        builder.construirPlantas();
        builder.construirHabitaciones();
        builder. construirPatio();
        builder.definirSentido(); 
        builder. agregarElementos();
    }
    
    public Casa getCasa(){
        return builder.getCasa();
    }
    
}
