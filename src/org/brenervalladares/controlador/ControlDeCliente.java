/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.brenervalladares.controlador;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import org.brenervalladares.modelo.Cliente;
import org.brenervalladares.db.Conexion;
import org.brenervalladares.modelo.Cuenta;
/**
 * Controlador para Cliente
 * @author Brener Valladares
 * @version 1.8
 */
public class ControlDeCliente {
    
    private static ControlDeCliente instancia;
    private static ArrayList<Cliente> clientes;
    public ControlDeCliente() {
        clientes = new ArrayList<Cliente>();
    }
    
    public static ControlDeCliente getInstancia() {
        if(instancia == null){
			instancia = new ControlDeCliente();
		} return instancia;
    }
    
     public ArrayList<Cliente> mostrarClientes() {
        return clientes;
    }
    
    public int ListaDeClientes() {
        return clientes.size();
    }
    
    public void agregarCliente(Cliente cliente) {
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call agregarCliente(?,?,?,?,?,?,?,?,?)");
            sentencia.setString(1, cliente.getNombre());
            sentencia.setString(2, cliente.getApellido());
            sentencia.setString(3, cliente.getDireccion());
            sentencia.setInt(4, cliente.getTelefono());
            sentencia.setString(5, cliente.getEmpresa());
            sentencia.setString(6, cliente.getSexo());
            sentencia.setString(7, cliente.getNacionalidad());
            sentencia.setInt(8, cliente.getIdentificacion());
            sentencia.setBoolean(9, true);
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Dato enviado.");           
        }catch(Exception error){
            error.printStackTrace();
        }
        clientes.add(cliente);
    }
    
    public void actualizarCliente(Cliente clienteAntiguo, Cliente clienteActualizado) {
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call actualizarCliente(?,?,?,?,?,?,?,?,?,?)");
            sentencia.setInt(1, clienteActualizado.getId_cliente());
            sentencia.setString(2, clienteActualizado.getNombre());
            sentencia.setString(3, clienteActualizado.getApellido());
            sentencia.setString(4, clienteActualizado.getDireccion());
            sentencia.setInt(5, clienteActualizado.getTelefono());
            sentencia.setString(6, clienteActualizado.getEmpresa());
            sentencia.setString(7, clienteActualizado.getSexo());
            sentencia.setString(8, clienteActualizado.getNacionalidad());
            sentencia.setInt(9, clienteActualizado.getIdentificacion());
            sentencia.setBoolean(10, true);
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Dato actualizado."); 
        }catch(Exception error){
            error.printStackTrace();
        }
        int auxiliar = clientes.indexOf(clienteAntiguo);
        clientes.set(auxiliar,clienteActualizado );
    }
    
    public Cliente buscarCliente(int id) {
        Cliente clienteEncontrado = new Cliente();
            for(Cliente cliente : clientes){
			if( cliente.getId_cliente() == id ){
				clienteEncontrado = cliente;
				break;
			}//if
		}//for
		return clienteEncontrado;
    }
    
    public void eliminarCliente(Cliente clienteEliminado) {      
        try{
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call eliminarCliente(?)");
            sentencia.setInt(1, clienteEliminado.getId_cliente());
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Dato eliminado.");
        }catch(Exception error){
            error.printStackTrace();
        }
    }
}

