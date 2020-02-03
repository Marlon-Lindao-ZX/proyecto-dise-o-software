/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.usuarios;

import java.sql.SQLException;

/**
 *
 * @author davidmendozaloor
 */
public interface BaseDeDatos {
    public void insertEnBase(String usuario, String contrasena,String quiosco) throws SQLException;
    
}
