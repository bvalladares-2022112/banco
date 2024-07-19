/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.brenervalladares.vista;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import javax.swing.JPanel;
/**
 *
 * @author Brener Valladares
 */

public class VentanaPrincipal extends javax.swing.JFrame {
    private static VistaCuenta instanciaCuenta = null;
    private static VistaCliente instanciaCliente = null;
    private static VistaUsuario instanciaUsuario = null;
    private static VistaProveedor instanciaProveedor = null;
    private static VistaPagos instanciaPagos = null;
    private Image imagenDeFondo;
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
         public synchronized VistaCuenta getInstanciaCuenta(){
        if( instanciaCuenta == null){
            instanciaCuenta = new VistaCuenta();
            panel.add(instanciaCuenta);
        } else if( instanciaCuenta.isVisible() == false )
            instanciaCuenta.setVisible(true);
        instanciaCuenta.show();
        return instanciaCuenta;
    }
         
          public synchronized VistaCliente getInstanciaCliente(){
        if( instanciaCliente == null){
            instanciaCliente = new VistaCliente();
            panel.add(instanciaCliente);
        } else if( instanciaCliente.isVisible() == false )
            instanciaCliente.setVisible(true);
        instanciaCliente.show();
        return instanciaCliente;
    }
          
          public synchronized VistaUsuario getInstanciaUsuario() {
         if(instanciaUsuario == null){
            instanciaUsuario = new VistaUsuario();
            panel.add(instanciaUsuario);
        } else if( instanciaUsuario.isVisible() == false )
            instanciaUsuario.setVisible(true);
        instanciaUsuario.show();
        return instanciaUsuario;
    }
          
           public synchronized VistaProveedor getInstanciaProveedor() {
         if(instanciaProveedor == null){
            instanciaProveedor = new VistaProveedor();
            panel.add(instanciaProveedor);
        } else if( instanciaProveedor.isVisible() == false )
            instanciaProveedor.setVisible(true);
        instanciaProveedor.show();
        return instanciaProveedor;
    }
           
           public synchronized VistaPagos getInstanciaPagos() {
         if(instanciaPagos == null){
            instanciaPagos = new VistaPagos();
            panel.add(instanciaPagos);
        } else if( instanciaPagos.isVisible() == false )
            instanciaPagos.setVisible(true);
        instanciaPagos.show();
        return instanciaPagos;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        panel = new javax.swing.JDesktopPane();
        MenuPrincipal = new javax.swing.JMenuBar();
        MenuUsuario = new javax.swing.JMenu();
        Usuario = new javax.swing.JMenuItem();
        MenuCliente = new javax.swing.JMenu();
        Cliente = new javax.swing.JMenuItem();
        MenuCuenta = new javax.swing.JMenu();
        Cuenta = new javax.swing.JMenuItem();
        MenuProveedor = new javax.swing.JMenu();
        Proveedor = new javax.swing.JMenuItem();
        MenuPagos = new javax.swing.JMenu();
        Pagos = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 204, 0));

        panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 607, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 454, Short.MAX_VALUE)
        );

        MenuUsuario.setText("Menu Usuario");
        MenuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuUsuarioActionPerformed(evt);
            }
        });

        Usuario.setText("Menu de Usuario");
        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });
        MenuUsuario.add(Usuario);

        MenuPrincipal.add(MenuUsuario);

        MenuCliente.setText("Menu Cliente");
        MenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuClienteActionPerformed(evt);
            }
        });

        Cliente.setText("Menu de Cliente");
        Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteActionPerformed(evt);
            }
        });
        MenuCliente.add(Cliente);

        MenuPrincipal.add(MenuCliente);

        MenuCuenta.setText("Menu Cuenta");

        Cuenta.setText("Menu de cuenta");
        Cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuentaActionPerformed(evt);
            }
        });
        MenuCuenta.add(Cuenta);

        MenuPrincipal.add(MenuCuenta);

        MenuProveedor.setText("Menu Proveedor");

        Proveedor.setText("Menu de Proveedor");
        Proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProveedorActionPerformed(evt);
            }
        });
        MenuProveedor.add(Proveedor);

        MenuPrincipal.add(MenuProveedor);

        MenuPagos.setText("Menu Pago");

        Pagos.setText("Menu de pagos");
        Pagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagosActionPerformed(evt);
            }
        });
        MenuPagos.add(Pagos);

        MenuPrincipal.add(MenuPagos);

        setJMenuBar(MenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuentaActionPerformed
        // TODO add your handling code here:
        getInstanciaCuenta();
    }//GEN-LAST:event_CuentaActionPerformed

    private void MenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuClienteActionPerformed

    private void ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteActionPerformed
        // TODO add your handling code here:
        getInstanciaCliente();
    }//GEN-LAST:event_ClienteActionPerformed

    private void MenuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuUsuarioActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_MenuUsuarioActionPerformed

    private void UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioActionPerformed
        // TODO add your handling code here:
        getInstanciaUsuario();
    }//GEN-LAST:event_UsuarioActionPerformed

    private void ProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProveedorActionPerformed
        // TODO add your handling code here:
        getInstanciaProveedor();
    }//GEN-LAST:event_ProveedorActionPerformed

    private void PagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagosActionPerformed
        // TODO add your handling code here:
        getInstanciaPagos();
    }//GEN-LAST:event_PagosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Cliente;
    private javax.swing.JMenuItem Cuenta;
    private javax.swing.JMenu MenuCliente;
    private javax.swing.JMenu MenuCuenta;
    private javax.swing.JMenu MenuPagos;
    private javax.swing.JMenuBar MenuPrincipal;
    private javax.swing.JMenu MenuProveedor;
    private javax.swing.JMenu MenuUsuario;
    private javax.swing.JMenuItem Pagos;
    private javax.swing.JMenuItem Proveedor;
    private javax.swing.JMenuItem Usuario;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JDesktopPane panel;
    // End of variables declaration//GEN-END:variables
}