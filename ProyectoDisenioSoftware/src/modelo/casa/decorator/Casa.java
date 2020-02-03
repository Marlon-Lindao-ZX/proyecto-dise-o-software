/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.casa.decorator;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.datos.singleton.Conexion;
import modelo.usuarios.Usuario;

/**
 *
 * @author CORE I7
 */
public class Casa implements CasaDisenio {
    private int numHabitaciones;
    private String nombre;
    private double tamPatio;
    private String orientacion;
    private double tamTerreno;
    private int numPlantas;
    private int numBaths;
    private boolean esquinera;
    private double precio;

    public Casa() {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

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
    
      public void insertEnBase() throws SQLException {
        Statement stm=Conexion.getConexion().getConnection().createStatement();
         ResultSet rs =stm.executeQuery("select casa_basica_id from casaBasica order by casa_basica_id desc limit 1");
         rs.next();
         Integer id=rs.getInt("casa_basica_id");
         id++;
         String id_casaBasica=id.toString();
         stm.executeUpdate("insert into casaBasica(casa_basica_id,nombre,numHabitaciones,tamTerreno,numeroPlanta,esEsquinera,orientacion,tamPatio,numBanos) values ("+id_casaBasica+",'"+nombre+"','"+numHabitaciones+",'"+tamTerreno+",'"+numPlantas+",'"+esquinera+",'"+orientacion+",'"+tamPatio+",'"+numBaths+"')");
     
    }

    @Override
    public double calculatePrice() {
        return precio;
    }
    
    
    
    
    
}
