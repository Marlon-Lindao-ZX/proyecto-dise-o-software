/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.usuarios;

import java.util.ArrayList;
import modelo.varios.Direccion;

/**
 *
 * @author CORE I7
 */
public class Empleado extends Persona{
    
    public Empleado(String nombres, String apellidos, String identificacion, Direccion domicilio, ArrayList<String> telefonos, String email, String estadoCivil) {
        super(nombres, apellidos, identificacion, domicilio, telefonos, email, estadoCivil);
    }
    
}
