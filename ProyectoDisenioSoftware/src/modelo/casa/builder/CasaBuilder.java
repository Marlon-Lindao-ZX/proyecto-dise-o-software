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
public abstract class CasaBuilder{
    
    protected Casa casa;


    public abstract void aplanarTerreno();
    public abstract void construirPlantas();
    public abstract void construirHabitaciones();
    public abstract void construirPatio();
    public abstract void definirSentido(); 

    public Casa getCasa() {
        return casa;
    }
    
    
}
