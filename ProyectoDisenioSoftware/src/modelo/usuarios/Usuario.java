/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.usuarios;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.datos.singleton.Conexion;
import modelo.varios.Telefono;

/**
 *
 * @author CORE I7
 */
public class Usuario implements BaseDeDatos{
    public static Usuario usuarioRegistrado=new Usuario();
    private Persona persona;
    private String usuario;
    private String clave;

    public Usuario(){
        
    }
    public Usuario(Persona persona, String usuario, String clave) {
        this.persona = persona;
        this.usuario = usuario;
        this.clave = clave;
    }
    
    public boolean logIn(){
        return true;
    }
    
    public boolean logOut(){
        return true;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Usuario{" + "usuario=" + usuario + ", clave=" + clave + '}';
    }

    @Override
    public int insertEnBase(String usuario, String contrasena, String quiosco) throws SQLException {
        Statement stm=Conexion.getConexion().getConnection().createStatement();
         String celular = null;
         String telefono=null;
         for(Telefono t:persona.getTelefonos()){
             if(t.getTipo().equals("celular")) celular=t.getNumero();
             if(t.getTipo().equals("telefono")) telefono=t.getNumero();
         }
         ResultSet rs =stm.executeQuery("select id_user from user order by id_user desc limit 1");
         rs.next();
         Integer id=rs.getInt("id_user");
         id++;
         String id_string=id.toString();
         stm.executeUpdate("Insert into user(id_user,nombre,apellido,celular,cedula,pasaporte,email,domicilio,telefono,estadoCivil,usuario,contrasena) values("+id_string+",'"+persona.datos.getNombres()+"','"+persona.datos.getApellidos()+"','"+celular+"','"+persona.datos.getIdentificacion()+"','"+persona.datos.getIdentificacion()+"','"+persona.email+"','"+persona.domicilio.getDireccion()+"','"+telefono+"','"+persona.datos.getEstadoCivil()+"','"+usuario+"','"+contrasena+"')");
         return id;
    }
    
    
    
    
    
    
}
