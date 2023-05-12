/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

/**
 *
 * @author nico
 */
public class ViewFormMaterias extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewFormMaterias
     */
    public ViewFormMaterias() {
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

        lblFormMaterias = new javax.swing.JLabel();
        lblCodMateria = new javax.swing.JLabel();
        lblNombreMa = new javax.swing.JLabel();
        lblAnio = new javax.swing.JLabel();
        txtCodMateria = new javax.swing.JTextField();
        txtNombreMa = new javax.swing.JTextField();
        txtAnio = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        lblFormMaterias.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        lblFormMaterias.setForeground(new java.awt.Color(0, 0, 255));
        lblFormMaterias.setText("Formulario de Materias");

        lblCodMateria.setFont(new java.awt.Font("Sitka Display", 0, 14)); // NOI18N
        lblCodMateria.setForeground(new java.awt.Color(0, 0, 255));
        lblCodMateria.setText("CODIGO DE MATERIA:");

        lblNombreMa.setFont(new java.awt.Font("Sitka Display", 0, 14)); // NOI18N
        lblNombreMa.setForeground(new java.awt.Color(0, 0, 255));
        lblNombreMa.setText("NOMBRE DE LA MATERIA:");

        lblAnio.setFont(new java.awt.Font("Sitka Display", 0, 14)); // NOI18N
        lblAnio.setForeground(new java.awt.Color(0, 0, 255));
        lblAnio.setText("AÑO AL QUE PERTENECE:");

        txtCodMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodMateriaActionPerformed(evt);
            }
        });

        txtNombreMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreMaActionPerformed(evt);
            }
        });

        txtAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnioActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(250, 0, 0));
        btnSalir.setText("Salir");
        btnSalir.setAutoscrolls(true);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreMa)
                    .addComponent(lblCodMateria))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNombreMa)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCodMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(lblFormMaterias)
                .addGap(0, 117, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAnio)
                .addGap(18, 18, 18)
                .addComponent(txtAnio)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFormMaterias)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodMateria)
                    .addComponent(txtCodMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreMa)
                    .addComponent(txtNombreMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnio)
                    .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnSalir)
                    .addComponent(btnGuardar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodMateriaActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_txtCodMateriaActionPerformed

    private void txtNombreMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreMaActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_txtNombreMaActionPerformed

    private void txtAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnioActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtAnioActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:

        txtAnio.setText("");
        txtCodMateria.setText("");
        txtNombreMa.setText("");
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(txtCodMateria.getText());
        int anio = Integer.parseInt(txtCodMateria.getText());
        String nombre = txtNombreMa.getText();

        ViewMenuPpal.mat.setNombre(nombre);
        ViewMenuPpal.mat.setAnio(anio);
        ViewMenuPpal.mat.setIdMateria(id);
        
        txtAnio.setText("");
        txtCodMateria.setText("");
        txtNombreMa.setText("");
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblAnio;
    private javax.swing.JLabel lblCodMateria;
    private javax.swing.JLabel lblFormMaterias;
    private javax.swing.JLabel lblNombreMa;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtCodMateria;
    private javax.swing.JTextField txtNombreMa;
    // End of variables declaration//GEN-END:variables
}
