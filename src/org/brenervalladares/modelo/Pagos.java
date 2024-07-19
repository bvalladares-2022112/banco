/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.brenervalladares.modelo;

/**
 *
 * @author informatica
 */
public class Pagos {
    private int id_pago = 0;
    private int id_cliente = 0;
    private int id_proveedor = 0;
    private int monto = 0;
    private boolean estado;
    public Pagos() {}
    public Pagos(int id_pago, int id_cliente, int id_proveedor, int monto, boolean estado){
        this.id_pago = id_pago;
        this.id_cliente = id_cliente;
        this.id_proveedor = id_proveedor;
        this.monto = monto;
        this.estado = estado;
    }
    
    public int getId_pago() {
        return id_pago;
    }

    public void setId_pago(int id_pago) {
        this.id_pago = id_pago;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
