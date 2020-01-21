/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.varios;

import java.util.ArrayList;

/**
 *
 * @author CORE I7
 */
public class Empresa {
    
    private String nombre;
    private Direccion direccion;
    private ArrayList<String> telefonos;

    public Empresa(String nombre, Direccion direccion, ArrayList<String> telefonos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefonos = telefonos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public ArrayList<String> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(ArrayList<String> telefonos) {
        this.telefonos = telefonos;
    }
    
    
}
