/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.brenervalladares.modelo;
/**
 *
 * @author Brener Valladares
 */
public class Usuario {
    private int id_usuario = 0;
    private int id_cliente = 0;
    private String usuario;
    private String password_usuario; 
    private String fecha_de_creacion;
    private boolean estado;
    public Usuario(){}
    public Usuario(int id_usuario,int id_cliente,String usuario,String password_usuario,boolean estado,String fecha_de_creacion){
        this.id_usuario = id_usuario;
        this.id_cliente = id_cliente;
        this.usuario = usuario;
        this.password_usuario = password_usuario;
        this.estado = estado;
        this.fecha_de_creacion = fecha_de_creacion;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword_usuario() {
        return password_usuario;
    }

    public void setPassword_usuario(String password_usuario) {
        this.password_usuario = password_usuario;
    }

    public boolean Estado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getFecha_de_creacion() {
        return fecha_de_creacion;
    }

    public void setFecha_de_creacion(String fecha_de_creacion) {
        this.fecha_de_creacion = fecha_de_creacion;
    }
    
}
