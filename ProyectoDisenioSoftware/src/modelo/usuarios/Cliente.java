/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.usuarios;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.casa.Casa;
import modelo.datos.singleton.Conexion;
import modelo.varios.Direccion;
import modelo.varios.Empresa;
import modelo.varios.Telefono;

/**
 *
 * @author CORE I7
 */
public class Cliente extends Persona implements BaseDeDatos{
    
    private Empresa empresa;
    private String cargo;
    private Integer cantHijos;
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

    @Override
    public String toString() {
        return "Cliente{ nombre="+datos.getNombres() + "empresa=" + empresa + ", cargo=" + cargo + ", cantHijos=" + cantHijos + '}';
    }

    @Override
    public void insertEnBase(String usuario, String contrasena, String quiosco) throws SQLException {
        Statement stm=Conexion.getConexion().getConnection().createStatement();
         String celular = null;
         String telefono=null;
         for(Telefono t:this.getTelefonos()){
             if(t.getTipo().equals("celular")) celular=t.getNumero();
             if(t.getTipo().equals("telefono")) telefono=t.getNumero();
         }
         ResultSet rs2 =stm.executeQuery("select id_user from user order by id_user desc limit 1");
         rs2.next();
         Integer userId=rs2.getInt("id_user");
         userId++;
         String id_user=userId.toString();
         ResultSet rs =stm.executeQuery("select cliente_id from cliente order by cliente_id desc limit 1");
         rs.next();
         Integer clienteId=rs.getInt("cliente_id");
         clienteId++;
         String id_cliente=clienteId.toString();
         stm.executeUpdate("Insert into user(id_user,nombre,apellido,celular,cedula,pasaporte,email,domicilio,telefono,estadoCivil,usuario,contrasena,cargo) values("+id_user+",'"+this.datos.getNombres()+"','"+this.datos.getApellidos()+"','"+celular+"','"+this.datos.getIdentificacion()+"','"+this.datos.getIdentificacion()+"','"+this.email+"','"+this.domicilio.getDireccion()+"','"+telefono+"','"+this.datos.getEstadoCivil()+"','"+usuario+"','"+contrasena+"','"+this.cargo+"')");
         stm.executeUpdate("Insert into cliente(cliente_id,user_id,empresa,numeroHijos) values("+id_cliente+","+id_user+",'"+this.empresa.getNombre()+"','"+this.cantHijos.toString()+"')");
     
    }
    
    
    
    
    
    
    
}
