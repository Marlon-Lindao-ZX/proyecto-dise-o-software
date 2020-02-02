/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.usuarios;

import modelo.varios.DatosPersonales;
import java.util.ArrayList;
import modelo.casa.decorator.Casa;
import modelo.varios.Direccion;
import modelo.varios.Telefono;

/**
 *
 * @author CORE I7
 */
public class Vendedor extends Empleado{
    
    private ArrayList<Casa> casasDiseniadas = new ArrayList<>();
    
    public Vendedor(DatosPersonales datos, Direccion domicilio, ArrayList<Telefono> telefonos, String email) {
        super(datos, domicilio, telefonos, email);
    }

    public ArrayList<Casa> getCasasDiseniadas() {
        return casasDiseniadas;
    }

    public void setCasasDiseniadas(ArrayList<Casa> casasDiseniadas) {
        this.casasDiseniadas = casasDiseniadas;
    }
    
    
    
}
