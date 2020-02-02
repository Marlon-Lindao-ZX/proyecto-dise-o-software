/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.casa.decorator;

import java.util.ArrayList;

/**
 *
 * @author CORE I7
 */
public class Casa implements CasaDisenio {
    private int numHabitaciones;
    private double tamPatio;
    private String orientacion;
    private double tamTerreno;
    private int numPlantas;
    private int numBaths;
    private boolean esquinera;
    private double precio;

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

    public int getNumPlantas() {
        return numPlantas;
    }

    public void setNumPlantas(int numPlantas) {
        this.numPlantas = numPlantas;
    }

    public int getNumBaths() {
        return numBaths;
    }

    public void setNumBaths(int numBaths) {
        this.numBaths = numBaths;
    }

    public boolean isEsquinera() {
        return esquinera;
    }

    public void setEsquinera(boolean esquinera) {
        this.esquinera = esquinera;
    }

    @Override
    public double calculatePrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
