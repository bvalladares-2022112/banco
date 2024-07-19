/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.brenervalladares.controlador;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import org.brenervalladares.db.Conexion;
import org.brenervalladares.modelo.Pagos;
/**
 *
 * @author Brener Valladares
 */
public class ControlDePago {
    private static ControlDePago instanciaUnica;
    private static ArrayList<Pagos> pagos;
    public ControlDePago() {
        pagos = new ArrayList<Pagos>();
    }
    
    public static ControlDePago getInstancia() {
        if(instanciaUnica == null){
			instanciaUnica = new ControlDePago();
		} return instanciaUnica;
    }
    
    public ArrayList<Pagos> mostrarPagos() {
        return pagos;
    }
    
    public int ListaDePagos() {
        return pagos.size();
    }
    
    public void agregarPago(Pagos pago) {
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call agregarPago(?,?,?,?)");
            sentencia.setInt(1, pago.getId_cliente());
            sentencia.setInt(2, pago.getId_proveedor());
            sentencia.setInt(3, pago.getMonto());
            sentencia.setBoolean(4, true);
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Dato enviado.");
        }catch(Exception error){
            error.printStackTrace();
        }
        pagos.add(pago);
    }
    
    public void actualizarPago (Pagos pagoAntiguo, Pagos pagoActualizado) {
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call actualizarPago(?,?,?,?,?)");
            sentencia.setInt(1, pagoActualizado.getId_pago());
            sentencia.setInt(2, pagoActualizado.getId_cliente());
            sentencia.setInt(3, pagoActualizado.getId_proveedor());
            sentencia.setInt(4, pagoActualizado.getMonto());
            sentencia.setBoolean(5, true);
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Dato actualizado.");
        }catch(Exception error){
            error.printStackTrace();
        }
        int auxiliar = pagos.indexOf(pagoActualizado);
        pagos.set(auxiliar,pagoActualizado);
    }
    
    public Pagos buscarPago(int id) {
        Pagos pagoEncontrado = new Pagos();
            for(Pagos pago : pagos){
			if( pago.getId_pago()== id ){
				pagoEncontrado = pago;
				break;
			}//if
		}//for
		return pagoEncontrado;
    }
    
     public void eliminarPago(Pagos pagoEliminado) {
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call eliminarPago(?)");
            sentencia.setInt(1, pagoEliminado.getId_pago());
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Dato eliminado.");
        }catch(Exception error){
            error.printStackTrace();
        }
    }
}
