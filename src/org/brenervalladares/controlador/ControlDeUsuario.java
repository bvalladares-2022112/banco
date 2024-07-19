/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.brenervalladares.controlador;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import org.brenervalladares.modelo.Usuario;
import org.brenervalladares.db.Conexion;
/**
 *
 * @author Brener Valladares
 */
public class ControlDeUsuario {
    private static ControlDeUsuario instancia;
    private static ArrayList<Usuario> usuarios;
    public ControlDeUsuario() {
        usuarios = new ArrayList<Usuario>();
    }
    
    public static ControlDeUsuario getInstancia() {
        if(instancia == null){
		instancia = new ControlDeUsuario();
	} return instancia;
    }
    
    public ArrayList<Usuario> mostrarUsuarios() {
       return usuarios;
    }
    
    public int ListaDeUsuarios() {
        return usuarios.size();
    }
    
    public void agregarUsuario(Usuario usuario) {
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call agregarUsuario(?,?,?,?,?)");
            sentencia.setInt(1, usuario.getId_cliente());
            sentencia.setString(2, usuario.getUsuario());
            sentencia.setString(3, usuario.getPassword_usuario());
            sentencia.setString(4, usuario.getFecha_de_creacion());
            sentencia.setBoolean(5, true);
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Dato enviado.");
        }catch(Exception error){
            error.printStackTrace();
        }
        usuarios.add(usuario);
    }
    
    public void actualizarUsuario(Usuario usuarioAntiguo, Usuario usuarioActualizado) {
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call actualizarUsuario(?,?,?,?,?,?)");
            sentencia.setInt(1, usuarioActualizado.getId_usuario());
            sentencia.setInt(2, usuarioActualizado.getId_cliente());
            sentencia.setString(3, usuarioActualizado.getUsuario());
            sentencia.setString(4, usuarioActualizado.getPassword_usuario());
            sentencia.setString(5, usuarioActualizado.getFecha_de_creacion());
            sentencia.setBoolean(6, true);
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Dato actualizado.");
        }catch(Exception error){
            error.printStackTrace();
        }
         int auxiliar = usuarios.indexOf(usuarioAntiguo);
         usuarios.set(auxiliar,usuarioActualizado );
    }
    
    public Usuario buscarUsuario(int id) {
        Usuario usuarioEncontrado = new Usuario();
           for(Usuario usuario : usuarios){
		if( usuario.getId_usuario()== id ){
			usuarioEncontrado = usuario;
			break;
		}//if
	}//for
	return usuarioEncontrado;
    }
    
    public void eliminarUsuario(Usuario usuarioEliminado) {
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call eliminarUsuario(?)");
            sentencia.setInt(1, usuarioEliminado.getId_usuario());
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Dato eliminado.");
        }catch(Exception error){
            error.printStackTrace();
        }
    }
}
