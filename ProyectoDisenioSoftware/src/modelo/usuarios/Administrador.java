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
import modelo.datos.singleton.Conexion;
import modelo.varios.Direccion;
import modelo.varios.Telefono;

/**
 *
 * @author CORE I7
 */
public class Administrador extends Persona implements BaseDeDatos{
    
    public Administrador(DatosPersonales datos, Direccion domicilio, ArrayList<Telefono> telefonos, String email) {
        super(datos, domicilio, telefonos, email);
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
         ResultSet rs =stm.executeQuery("select id_user from user order by id_user desc limit 1");
         rs.next();
         Integer id=rs.getInt("id_user");
         id++;
         String id_string=id.toString();
         stm.executeUpdate("Insert into user(id_user,nombre,apellido,celular,cedula,pasaporte,email,domicilio,telefono,estadoCivil,cargo,usuario,contrasena) values("+id_string+",'"+this.datos.getNombres()+"','"+this.datos.getApellidos()+"','"+celular+"','"+this.datos.getIdentificacion()+"','"+this.datos.getIdentificacion()+"','"+this.email+"','"+this.domicilio.getDireccion()+"','"+telefono+"','"+this.datos.getEstadoCivil()+"','Administador','"+usuario+"','"+contrasena+"')");
     
    }
    
    
}
