/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.brenervalladares.controlador;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import org.brenervalladares.modelo.Cuenta;
import org.brenervalladares.db.Conexion;
/**
 *
 * @author Brener Valladares
 */
public class ControlDeCuenta {
    private static ControlDeCuenta instanciaUnica;
    private static ArrayList<Cuenta> cuentas;
    public ControlDeCuenta() {
        cuentas = new ArrayList<Cuenta>();
    }
    public static ControlDeCuenta getInstancia() {
        if(instanciaUnica == null){
			instanciaUnica = new ControlDeCuenta();
		} return instanciaUnica;
    }
    public ArrayList<Cuenta> mostrarCuentas() {
        return cuentas;
    }
    public int ListaDeCuentas() {
        return cuentas.size();
    }
    public void agregarCuenta(Cuenta cuenta){
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call agregarCuenta(?,?,?,?,?,?)");
            sentencia.setInt(1, cuenta.getNumero() );
            sentencia.setString(2, cuenta.getNombre());
            sentencia.setString(3, cuenta.getTipo());
            sentencia.setString(4, cuenta.getMoneda());
            sentencia.setInt(5, cuenta.getSaldo());
            sentencia.setBoolean(6, true);
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Dato enviado.");
        } catch(Exception error){
            error.printStackTrace();
        }
        cuentas.add(cuenta);
    }
    
    public void actualizarCuenta(Cuenta cuentaAntigua, Cuenta cuentaActualizada) {
        
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call actualizarCuenta(?,?,?,?,?,?,?)");
            sentencia.setInt(1, cuentaActualizada.getId_cuenta());
            sentencia.setInt(3, cuentaActualizada.getNumero() );
            sentencia.setString(2, cuentaActualizada.getNombre());
            sentencia.setString(4, cuentaActualizada.getTipo());
            sentencia.setString(5, cuentaActualizada.getMoneda());
            sentencia.setInt(6, cuentaActualizada.getSaldo());
            sentencia.setBoolean(7, true);
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Dato actualizado.");
        }catch(Exception error){
            error.printStackTrace();
        }
        int auxiliar = cuentas.indexOf(cuentaAntigua);
        cuentas.set(auxiliar,cuentaActualizada);
    }
    
    public Cuenta buscarCuenta(int id) {
        Cuenta cuentaEncontrada = new Cuenta();
            for(Cuenta cuenta : cuentas){
			if( cuenta.getId_cuenta() == id ){
				cuentaEncontrada = cuenta;
				break;
			}//if
		}//for
		return cuentaEncontrada;
    }
    
    public void eliminarCuenta(Cuenta cuentaEliminada) {
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call eliminarCuenta(?)");
            sentencia.setInt(1, cuentaEliminada.getId_cuenta());
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Dato eliminado.");
        }catch(Exception error){
            error.printStackTrace();
        }
    }
}

