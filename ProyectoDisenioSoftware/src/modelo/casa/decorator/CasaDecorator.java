/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.casa.decorator;

/**
 *
 * @author CORE I7
 */
public abstract class CasaDecorator implements CasaDisenio{
    protected CasaDisenio wrapee;
    
    public CasaDecorator(CasaDisenio wrapee){
        this.wrapee = wrapee;
    }
    
    public double calculatePrecio(){
        return wrapee.calculatePrice() + getOwnPrice();
    }
    
    public abstract double getOwnPrice();
    
    
    
    
}
