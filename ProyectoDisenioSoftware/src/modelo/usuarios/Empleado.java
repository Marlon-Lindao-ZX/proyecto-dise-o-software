/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.usuarios;

import modelo.varios.DatosPersonales;
import java.util.ArrayList;
import modelo.varios.Direccion;
import modelo.varios.Telefono;

/**
 *
 * @author CORE I7
 */
public class Empleado extends Persona{
    
    protected boolean isActive;
  
    public Empleado(DatosPersonales datos, Direccion domicilio, ArrayList<Telefono> telefonos, String email) {
        super(datos, domicilio, telefonos, email);
        isActive = true;
        
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
     
}
