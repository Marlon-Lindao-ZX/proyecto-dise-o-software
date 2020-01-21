/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.quiosco;

import java.util.ArrayList;
import modelo.varios.Direccion;

/**
 *
 * @author CORE I7
 */
public class Quiosco {
    private String idQuiosco;
    private Direccion direccion;
    private ArrayList<String> telefonos;

    public Quiosco(String idQuiosco, Direccion direccion, ArrayList<String> telefonos) {
        this.idQuiosco = idQuiosco;
        this.direccion = direccion;
        this.telefonos = telefonos;
    }

    public String getIdQuiosco() {
        return idQuiosco;
    }

    public void setIdQuiosco(String idQuiosco) {
        this.idQuiosco = idQuiosco;
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
