/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.brenervalladares.db;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Brener Valladares
 */
public class Conexion {
    private Connection conexion;
    private static Conexion instancia;
    private Conexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_banco?useSSL=false", "root", "admin");
        }catch(Exception error){
            error.printStackTrace();
        }
    }
    public synchronized static Conexion getInstancia(){
        if(instancia==null)
            instancia = new Conexion();
        return instancia;
    }
    
    public Connection getConexion(){
        return conexion;
    }
    
     public void setConexion(Connection conexion){
        this.conexion = conexion;
    }
}
