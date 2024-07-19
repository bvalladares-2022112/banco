/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.brenervalladares.modelo;
/**
 *
 * @author Brener Valladares
 */
public class Proveedor {
    private int id_proveedor = 0;
    private String nombre;
    private String identificador;
    private boolean estado;
    public Proveedor() {}
    public Proveedor(int id_proveedor,String nombre,String identificador, boolean estado){
        this.id_proveedor = id_proveedor;
        this.nombre = nombre;
        this.identificador = identificador;
        this.estado = estado;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
}
