/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.brenervalladares.modelo;

/**
 * Clase modelo de la clase Cuenta
 * @author Brener Valladares
 * @version 1.8
 */
public class Cuenta {
    private int id_cuenta = 0;
    private String nombre;
    private int numero = 0;
    private String tipo;
    private String moneda;
    private int saldo = 0;
    private boolean estado;
    public Cuenta() {}
    public Cuenta(int id_cuenta,String nombre ,int numero, String tipo, String moneda, int saldo, boolean estado ){
        this.id_cuenta = id_cuenta;
        this.nombre = nombre;
        this.numero = numero;
        this.tipo = tipo;
        this.moneda = moneda;
        this.saldo = saldo;
        this.estado = estado;
    }

    public int getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(int id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public boolean Estado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
