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
public class Empleado extends Persona implements BaseDeDatos{
    
    protected boolean isActive;
  
    public Empleado(DatosPersonales datos, Direccion domicilio, ArrayList<Telefono> telefonos, String email) {
        super(datos, domicilio, telefonos, email);
        isActive = true;
        
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public int insertEnBase(String usuario, String contrasena, String quiosco) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
}
