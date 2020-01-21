/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.varios;

/**
 *
 * @author CORE I7
 */
public class Direccion {
    private String country;
    private String state;
    private String city;
    private String direccion;

    public Direccion(String country, String state, String city, String direccion) {
        this.country = country;
        this.state = state;
        this.city = city;
        this.direccion = direccion;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
    
}
