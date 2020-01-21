/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.casa;

import java.util.ArrayList;

/**
 *
 * @author CORE I7
 */
public class Casa {
    private int numHabitaciones;
    private double tamPatio;
    private String orientacion;
    private double tamTerreno;
    private int numPlantas;
    private double precio;
    private ArrayList<ElementoAdicional> adicionales = new ArrayList<>();

    public Casa() {}

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public double getTamPatio() {
        return tamPatio;
    }

    public void setTamPatio(double tamPatio) {
        this.tamPatio = tamPatio;
    }

    public String getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }

    public double getTamTerreno() {
        return tamTerreno;
    }

    public void setTamTerreno(double tamTerreno) {
        this.tamTerreno = tamTerreno;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<ElementoAdicional> getAdicionales() {
        return adicionales;
    }

    public void setAdicionales(ArrayList<ElementoAdicional> adicionales) {
        this.adicionales = adicionales;
    }
    
    
}
