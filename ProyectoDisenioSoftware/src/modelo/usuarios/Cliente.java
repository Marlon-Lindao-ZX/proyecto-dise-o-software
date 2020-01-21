/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.usuarios;

import java.util.ArrayList;
import modelo.casa.Casa;
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
    private ArrayList<Casa> casasDiseniadas = new ArrayList<>();
    
    public Cliente(DatosPersonales datos, Direccion domicilio, ArrayList<Telefono> telefonos, String email,
                    Empresa empresa, String cargo, int cantHijos) {
        super(datos, domicilio, telefonos, email);
        this.empresa = empresa;
        this.cargo = cargo;
        this.cantHijos = cantHijos;
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

    public ArrayList<Casa> getCasasDiseniadas() {
        return casasDiseniadas;
    }

    public void setCasasDiseniadas(ArrayList<Casa> casasDiseniadas) {
        this.casasDiseniadas = casasDiseniadas;
    }
    
    
    
    
    
    
}
