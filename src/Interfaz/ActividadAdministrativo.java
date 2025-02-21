/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaz;

import CadenaDeResponsabilidad.ValidadorVacio;
import DAO.DAOactividadImplementacion;
import Interfaces.Validador;
import Logica.Actividad;
import Main.WindowManager;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kojiro
 */
public class ActividadAdministrativo extends javax.swing.JPanel {

    /**
     * Creates new form ActividadAmbiental
     */
    Principal p;
    public ActividadAdministrativo(Principal p) {
        this.p=p;
        initComponents();
    }
    
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        if (visible) {
            this.MostrarTabla();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Text_IdActividad = new javax.swing.JTextField();
        Button_Agregar = new javax.swing.JButton();
        Button_Rechazar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table_AdministrarActividades = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setText("Actividad Ambiental");

        jLabel2.setText("ID Actividad");

        Text_IdActividad.setText("                       ");

        Button_Agregar.setText("Agregar");
        Button_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_AgregarActionPerformed(evt);
            }
        });

        Button_Rechazar.setText("Rechazar");
        Button_Rechazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_RechazarActionPerformed(evt);
            }
        });

        Table_AdministrarActividades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(Table_AdministrarActividades);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(Button_Agregar)
                        .addGap(116, 116, 116)
                        .addComponent(Button_Rechazar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel2)
                        .addGap(38, 38, 38)
                        .addComponent(Text_IdActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(75, 75, 75)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_IdActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Agregar)
                    .addComponent(Button_Rechazar))
                .addGap(59, 59, 59))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Button_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_AgregarActionPerformed
        Validador validarIdActividad = new ValidadorVacio();

        try{
            validarIdActividad.validar(Text_IdActividad);

            DAOactividadImplementacion actividadImpl = new DAOactividadImplementacion();
            actividadImpl.Modificar(Integer.parseInt(Text_IdActividad.getText().trim()));

            this.MostrarTabla();

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_Button_AgregarActionPerformed

    private void Button_RechazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_RechazarActionPerformed
        Validador validarIdActividad = new ValidadorVacio();

        try{
            validarIdActividad.validar(Text_IdActividad);

            DAOactividadImplementacion actividadImpl = new DAOactividadImplementacion();
            if(actividadImpl.Eliminar(Integer.parseInt(Text_IdActividad.getText().trim())) == false){
                JOptionPane.showMessageDialog(null, "El ID de esa actividad no existe");
            }else{
                this.MostrarTabla();
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_Button_RechazarActionPerformed
public void MostrarTabla() {
        DAOactividadImplementacion actividadImpl = new DAOactividadImplementacion();
        ArrayList<Actividad> actividades = actividadImpl.Seleccionar();

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("ID");
        modelo.addColumn("Titulo");
        modelo.addColumn("Descripción");
        modelo.addColumn("Distrito");
        modelo.addColumn("fecha");
        modelo.addColumn("Usuario");
        Table_AdministrarActividades.setModel(modelo);

        String[] datos = new String[6];

        for (Actividad actividad : actividades) {
            datos[0] = String.valueOf(actividad.getIdActividad());
            datos[1] = actividad.getTitulo();
            datos[2] = actividad.getDescripcion();
            datos[3] = actividad.getDistrito();
            datos[4] = actividad.getFecha();
            datos[5] = String.valueOf(actividad.getIdCliente());
            modelo.addRow(datos);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Agregar;
    private javax.swing.JButton Button_Rechazar;
    private javax.swing.JTable Table_AdministrarActividades;
    public static javax.swing.JTextField Text_IdActividad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
