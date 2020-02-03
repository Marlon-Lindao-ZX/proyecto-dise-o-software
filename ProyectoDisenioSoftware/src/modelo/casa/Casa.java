/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.casa;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import modelo.datos.singleton.Conexion;
import modelo.usuarios.BaseDeDatos;
import modelo.usuarios.Usuario;
import modelo.varios.Telefono;

/**
 *
 * @author CORE I7
 */
public class Casa {
    private int numHabitaciones;
    private String nombre;
    private double tamPatio;
    private String orientacion;
    private double tamTerreno;
    private int numPlantas;
    private int numBaths;
    private boolean esquinera;
    private double precio;
    private ArrayList<ElementoAdicional> adicionales = new ArrayList<>();

    public Casa() {}

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
         List<String> adicionalesList=getAdicionalesString();
         String precioFinal=adicionalesList.get(0);
         String adiString=adicionalesList.get(1);
         ResultSet rs =stm.executeQuery("select casa_basica_id from casaBasica where nombre='"+nombre+"'");
         rs.next();
         Integer id=rs.getInt("casa_basica_id");
         id++;
         String id_casaBasica=id.toString();
         String usuarioRegistrado=Usuario.usuarioRegistrado.getUsuario();
         ResultSet rs2=stm.executeQuery("select id_user from user where usuario='"+usuarioRegistrado+"'");
         rs2.next();
         Integer id_usuario=rs2.getInt("id_user");
         stm.executeUpdate("insert into diseno(casa_basica_id,acabados,cliente_id,quiosco_id,precio) values ("+id_casaBasica+",'"+id_usuario+"','"+adiString+"',1,'"+precioFinal+"'");
     
    }
    
    public List<String> getAdicionalesString(){
        LinkedList<String> adicionalesPrecio=new LinkedList<>();
        Double precioFinal=precio;
        StringBuilder sb=new StringBuilder();
        for(ElementoAdicional ele: adicionales){
            precioFinal+=ele.getPrecio();
            sb.append(ele.getName()).append(" ");
        }
        adicionalesPrecio.add(precioFinal.toString());
        adicionalesPrecio.add(sb.toString());
        return adicionalesPrecio;
    }
    
    
    
    
}
