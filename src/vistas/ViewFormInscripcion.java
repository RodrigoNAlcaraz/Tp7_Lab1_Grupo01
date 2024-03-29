/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.util.HashSet;
import tp7_lab1_grupo01.Alumno;
import tp7_lab1_grupo01.Materia;

/**
 *
 * @author nico
 */
public class ViewFormInscripcion extends javax.swing.JInternalFrame {

    private HashSet<Materia> mat;
    private HashSet<Alumno> alum;

    /**
     * Creates new form ViewFormInscripcion
     *
     * @param mat
     * @param alum
     */
    public ViewFormInscripcion(HashSet<Materia> mat, HashSet<Alumno> alum) {

        initComponents();
        this.mat = mat;
        this.alum = alum;

        for (Alumno alumno : alum) {
            comBoxMAlumno.addItem(alumno);
        }

        for (Materia materia : mat) {
            comBoxMateria.addItem(materia);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFormInscripcion = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnInscribir = new javax.swing.JButton();
        lblElijMateria = new javax.swing.JLabel();
        lblElijAlumno = new javax.swing.JLabel();
        comBoxMateria = new javax.swing.JComboBox<>();
        comBoxMAlumno = new javax.swing.JComboBox<>();

        lblFormInscripcion.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        lblFormInscripcion.setForeground(new java.awt.Color(0, 0, 255));
        lblFormInscripcion.setText("Formulario de Inscripción");

        btnSalir.setBackground(new java.awt.Color(250, 0, 0));
        btnSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setAutoscrolls(true);
        btnSalir.setPreferredSize(new java.awt.Dimension(75, 35));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnInscribir.setBackground(new java.awt.Color(0, 225, 0));
        btnInscribir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnInscribir.setText("Inscribir");
        btnInscribir.setPreferredSize(new java.awt.Dimension(75, 35));
        btnInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscribirActionPerformed(evt);
            }
        });

        lblElijMateria.setFont(new java.awt.Font("Sitka Display", 0, 14)); // NOI18N
        lblElijMateria.setForeground(new java.awt.Color(0, 0, 255));
        lblElijMateria.setText("ELIJA UNA MATERIA:");

        lblElijAlumno.setFont(new java.awt.Font("Sitka Display", 0, 14)); // NOI18N
        lblElijAlumno.setForeground(new java.awt.Color(0, 0, 255));
        lblElijAlumno.setText("ELIJA UN ALUMNO:");

        comBoxMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comBoxMateriaActionPerformed(evt);
            }
        });

        comBoxMAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comBoxMAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblElijMateria)
                    .addComponent(lblElijAlumno))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comBoxMAlumno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(58, 58, 58))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comBoxMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(158, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblFormInscripcion)
                        .addGap(174, 174, 174))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFormInscripcion)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblElijMateria)
                    .addComponent(comBoxMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblElijAlumno)
                    .addComponent(comBoxMAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comBoxMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comBoxMateriaActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_comBoxMateriaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void comBoxMAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comBoxMAlumnoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_comBoxMAlumnoActionPerformed

    private void btnInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirActionPerformed
        // TODO add your handling code here:
        Materia materiaSelec = (Materia) comBoxMateria.getSelectedItem();
        Alumno alumSelec = (Alumno) comBoxMAlumno.getSelectedItem();

        alumSelec.agregarMateria(materiaSelec);
    }//GEN-LAST:event_btnInscribirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInscribir;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<Alumno> comBoxMAlumno;
    private javax.swing.JComboBox<Materia> comBoxMateria;
    private javax.swing.JLabel lblElijAlumno;
    private javax.swing.JLabel lblElijMateria;
    private javax.swing.JLabel lblFormInscripcion;
    // End of variables declaration//GEN-END:variables
}
