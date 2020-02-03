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
public class Persona {
    
    protected DatosPersonales datos;
    protected Direccion domicilio;
    protected ArrayList<Telefono> telefonos=new ArrayList<>();
    protected String email;
    

    public Persona(DatosPersonales datos, Direccion domicilio, ArrayList<Telefono> telefonos, String email) {
        this.datos = datos;
        this.domicilio = domicilio;
        this.telefonos = telefonos;
        this.email = email;
        
    }

    public DatosPersonales getDatos() {
        return datos;
    }

    public void setDatos(DatosPersonales datos) {
        this.datos = datos;
    }
    
    

    public Direccion getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Direccion domicilio) {
        this.domicilio = domicilio;
    }

    public ArrayList<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(ArrayList<Telefono> telefonos) {
        this.telefonos = telefonos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" + "datos=" + datos.getNombres() + ", domicilio=" + domicilio.getDireccion() + ", email=" + email + '}';
    }
    
}
