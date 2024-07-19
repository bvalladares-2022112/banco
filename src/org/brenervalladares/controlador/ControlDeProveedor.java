/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.brenervalladares.controlador;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import org.brenervalladares.db.Conexion;
import org.brenervalladares.modelo.Proveedor;
/**
 *
 * @author Brener Valladares
 */
public class ControlDeProveedor {
    private static ControlDeProveedor instancia;
    private static ArrayList<Proveedor> proveedores;
    public ControlDeProveedor() {
        proveedores = new ArrayList<Proveedor>();
    }
    
    public static ControlDeProveedor getInstancia() {
        if(instancia == null){
		instancia = new ControlDeProveedor();
	} return instancia;
    }
    
    public ArrayList<Proveedor> mostrarProveedores() {
     return proveedores;
    }
    
    public int ListaDeProveedores() {
        return proveedores.size();
    }
    
    public void agregarProveedor(Proveedor proveedor) {
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call agregarProveedor(?,?,?)");
            sentencia.setString(1, proveedor.getNombre());
            sentencia.setString(2, proveedor.getIdentificador());
            sentencia.setBoolean(3, true);
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Dato enviado.");
        }catch(Exception error){
            error.printStackTrace();
        }
        proveedores.add(proveedor);
    }
    
    public void actualizarProveedor(Proveedor proveedorAntiguo, Proveedor proveedorActualizado) {
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call actualizarProveedor(?,?,?,?)");
            sentencia.setInt(1, proveedorActualizado.getId_proveedor());
            sentencia.setString(2, proveedorActualizado.getNombre());
            sentencia.setString(3, proveedorActualizado.getIdentificador());
            sentencia.setBoolean(4, true);
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Dato actualizado.");
        }catch(Exception error){
            error.printStackTrace();
        }
        int auxiliar = proveedores.indexOf(proveedorAntiguo);
        proveedores.set(auxiliar,proveedorActualizado );
    }
    
    public Proveedor buscarProveedor(int id) {
        Proveedor proveedorEncontrado = new Proveedor();
           for(Proveedor proveedor : proveedores ){
		if( proveedor.getId_proveedor()== id ){
		proveedorEncontrado = proveedor;
		break;
		}//if
	}//for
        return proveedorEncontrado;
    }
    
    public void eliminarProveedor(Proveedor proveedorEliminado) {
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call eliminarProveedor(?)");
            sentencia.setInt(1, proveedorEliminado.getId_proveedor());
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Dato eliminado.");
        }catch(Exception error){
            error.printStackTrace();
        }
    }
}
