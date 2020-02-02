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
public class GriferiaEstandarDecorator extends CasaDecorator{

    public GriferiaEstandarDecorator(CasaDisenio wrapee) {
        super(wrapee);
    }

    @Override
    public double getOwnPrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calculatePrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
