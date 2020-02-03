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
import modelo.varios.DatosPersonales;
import modelo.varios.Direccion;
import modelo.varios.Telefono;

/**
 *
 * @author CORE I7
 */
public class Administrador extends Empleado{
    
    public Administrador(DatosPersonales datos, Direccion domicilio, ArrayList<Telefono> telefonos, String email) {
        super(datos, domicilio, telefonos, email);
    }

    @Override
    public int insertEnBase(String usuario, String contrasena, String quiosco) throws SQLException {
        Statement stm=Conexion.getConexion().getConnection().createStatement();
         Usuario user=new Usuario(this, usuario, contrasena);
         Integer idUser=user.insertEnBase(usuario, contrasena, quiosco);
         ResultSet rs =stm.executeQuery("select empleado_id from empleado order by empleado_id desc limit 1");
         rs.next();
         Integer id=rs.getInt("empleado_id");
         id++;
         String id_string=id.toString();
         stm.executeUpdate("Insert into empleado(empleado_id,user_id,quiosco_id,rol) values("+id_string+",'"+idUser+"',1,'Vendedor')");
         return id;
    }
    
    
}
