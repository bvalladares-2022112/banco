/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.brenervalladares.vista;
import java.util.HashSet;
import java.util.Set;
import org.brenervalladares.modelo.Cliente;
import org.brenervalladares.controlador.ControlDeCliente;
/**
 *
 * @author Brener Valladares
 */
public class VistaCliente extends javax.swing.JInternalFrame {
    Cliente clienteActualizado = new Cliente();
    Cliente clienteAntiguo = new Cliente();
    ControlDeCliente controlador = new ControlDeCliente();
    /**
     * Creates new form VistaCliente
     */
    public VistaCliente() {
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtIdCliente = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblEmpresa = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        lblNacionalidad = new javax.swing.JLabel();
        lblIdentificacion = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        txtEmpresa = new javax.swing.JTextField();
        txtNacionalidad = new javax.swing.JTextField();
        txtIdentificacion = new javax.swing.JTextField();
        txtGenero = new javax.swing.JTextField();

        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        txtIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdClienteActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblId.setForeground(new java.awt.Color(0, 0, 0));
        lblId.setText("Id");

        lblApellidos.setForeground(new java.awt.Color(0, 0, 0));
        lblApellidos.setText("Apellidos");

        lblDireccion.setForeground(new java.awt.Color(0, 0, 0));
        lblDireccion.setText("Direccion");

        lblTelefono.setForeground(new java.awt.Color(0, 0, 0));
        lblTelefono.setText("Telefono");

        lblEmpresa.setForeground(new java.awt.Color(0, 0, 0));
        lblEmpresa.setText("Empresa de telefono");

        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("Nombres");

        lblGenero.setForeground(new java.awt.Color(0, 0, 0));
        lblGenero.setText("Genero");

        lblNacionalidad.setForeground(new java.awt.Color(0, 0, 0));
        lblNacionalidad.setText("Nacionalidad");

        lblIdentificacion.setForeground(new java.awt.Color(0, 0, 0));
        lblIdentificacion.setText("Numero de identificacion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEmpresa)
                                    .addComponent(lblTelefono)
                                    .addComponent(lblDireccion)
                                    .addComponent(lblApellidos)
                                    .addComponent(lblId)
                                    .addComponent(lblNombre)
                                    .addComponent(lblGenero)
                                    .addComponent(lblNacionalidad))
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblIdentificacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIdCliente)
                            .addComponent(txtApellidos)
                            .addComponent(txtDireccion)
                            .addComponent(txtTelefono)
                            .addComponent(txtEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtNombre)
                            .addComponent(txtNacionalidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtIdentificacion, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtGenero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnAgregar)
                        .addGap(57, 57, 57)
                        .addComponent(btnActualizar)
                        .addGap(60, 60, 60)
                        .addComponent(btnEliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidos)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDireccion))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpresa)
                    .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGenero)
                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNacionalidad)
                    .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdentificacion))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdClienteActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        clienteActualizado.setId_cliente(Integer.parseInt(txtIdCliente.getText()));
        clienteActualizado.setNombre(txtNombre.getText());
        clienteActualizado.setApellido(txtApellidos.getText());
        clienteActualizado.setDireccion(txtDireccion.getText());
        clienteActualizado.setTelefono(Integer.parseInt(txtTelefono.getText()));
        clienteActualizado.setEmpresa(txtEmpresa.getText());
        clienteActualizado.setSexo(txtGenero.getText());
        clienteActualizado.setNacionalidad(txtNacionalidad.getText());
        clienteActualizado.setIdentificacion(Integer.parseInt(txtIdentificacion.getText()));
        clienteActualizado.setEstado(true);
        controlador.actualizarCliente(clienteAntiguo, clienteActualizado);
        setVisible(false);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        Cliente clienteEliminado = new Cliente();
        clienteEliminado.setId_cliente(Integer.parseInt(txtIdCliente.getText()));
        controlador.eliminarCliente(clienteEliminado);
        setVisible(false);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        Cliente cliente = new Cliente();
        cliente.setId_cliente(Integer.parseInt(txtIdCliente.getText()));
        cliente.setNombre(txtNombre.getText());
        cliente.setApellido(txtApellidos.getText());
        cliente.setDireccion(txtDireccion.getText());
        cliente.setTelefono(Integer.parseInt(txtTelefono.getText()));
        cliente.setEmpresa(txtEmpresa.getText());
        cliente.setSexo(txtGenero.getText());
        cliente.setNacionalidad(txtNacionalidad.getText());
        cliente.setIdentificacion(Integer.parseInt(txtIdentificacion.getText()));
        cliente.setEstado(true);
        controlador.agregarCliente(cliente);
        txtIdCliente.setText("");
        txtNombre.setText("");
        txtApellidos.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtEmpresa.setText("");
        txtGenero.setText("");
        txtNacionalidad.setText("");
        txtIdentificacion.setText("");
        setVisible(false);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        clienteAntiguo = controlador.buscarCliente(Integer.parseInt(txtBuscar.getText()));
        txtIdCliente.setText(String.valueOf(clienteAntiguo.getId_cliente()));
        txtNombre.setText(clienteAntiguo.getNombre());
        txtApellidos.setText(clienteAntiguo.getApellido());
        txtDireccion.setText(clienteAntiguo.getDireccion());
        txtTelefono.setText(String.valueOf(clienteAntiguo.getTelefono()));
        txtEmpresa.setText(clienteAntiguo.getEmpresa());
        txtGenero.setText(clienteAntiguo.getSexo());
        txtNacionalidad.setText(clienteAntiguo.getNacionalidad());
        txtIdentificacion.setText(String.valueOf(clienteAntiguo.getIdentificacion()));
    }//GEN-LAST:event_btnBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblIdentificacion;
    private javax.swing.JLabel lblNacionalidad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
