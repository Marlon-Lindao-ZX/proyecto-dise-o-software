/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.casa.decorator;

import modelo.datos.singleton.Conexion;

/**
 *
 * @author CORE I7
 */
public class PisoPorcelanatoNacionalDecorator extends CasaDecorator {

    public PisoPorcelanatoNacionalDecorator(CasaDisenio wrapee) {
        super(wrapee);
    }

    @Override
    public double getOwnPrice() {
        Conexion conexion = Conexion.getConexion();
        return Double.parseDouble(conexion.getQueryResult("select  from "));
    }

    @Override
    public double calculatePrice() {
        return super.calculatePrecio() + getOwnPrice();
    }
    
}
