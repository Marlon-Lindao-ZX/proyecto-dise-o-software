/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.usuarios;

import java.util.ArrayList;
import modelo.varios.Direccion;
import modelo.varios.Telefono;

/**
 *
 * @author CORE I7
 */
public class Empleado extends Persona{
    
    private String cargo;
    
    public Empleado(DatosPersonales datos, Direccion domicilio, ArrayList<Telefono> telefonos, String email, String cargo) {
        super(datos, domicilio, telefonos, email);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
    
}
