/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.usuarios;

/**
 *
 * @author CORE I7
 */
public class Usuario {
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
    
    
    
    
    
}
