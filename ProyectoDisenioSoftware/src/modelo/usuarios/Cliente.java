/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.usuarios;

import java.util.ArrayList;
import modelo.varios.Direccion;
import modelo.varios.Empresa;
import modelo.varios.Telefono;

/**
 *
 * @author CORE I7
 */
public class Cliente extends Persona{
    
    private Empresa empresa;
    private String cargo;
    private int cantHijos;
    
    public Cliente(String nombres, String apellidos, String identificacion, Direccion domicilio, ArrayList<Telefono> telefonos, String email, String estadoCivil) {
        super(nombres, apellidos, identificacion, domicilio, telefonos, email, estadoCivil);
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getCantHijos() {
        return cantHijos;
    }

    public void setCantHijos(int cantHijos) {
        this.cantHijos = cantHijos;
    }
    
    
    
    
}
