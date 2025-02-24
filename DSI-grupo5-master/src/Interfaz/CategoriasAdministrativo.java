/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaz;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Kojiro
 */
public class CategoriasAdministrativo extends javax.swing.JPanel {

    private Principal p;
    public CategoriasAdministrativo(Principal p) {
        this.p=p;
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

        jLabel1 = new javax.swing.JLabel();
        Button_Tiendas = new javax.swing.JButton();
        Button_Actividades = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setText("EcoVida");

        Button_Tiendas.setText("Modificar Tiendas");
        Button_Tiendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_TiendasActionPerformed(evt);
            }
        });

        Button_Actividades.setText("Modificar Actividades");
        Button_Actividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ActividadesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(230, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(223, 223, 223))
            .addComponent(Button_Actividades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Button_Tiendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(185, 185, 185)
                .addComponent(Button_Actividades, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Button_Tiendas, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(314, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Button_ActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ActividadesActionPerformed
        ActividadAdministrativo act=new ActividadAdministrativo(p);
        p.MostrarPanel(act);    }//GEN-LAST:event_Button_ActividadesActionPerformed

    private void Button_TiendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_TiendasActionPerformed
        TiendasAdministrativo tad=new TiendasAdministrativo(p);
        p.MostrarPanel(tad);
    }//GEN-LAST:event_Button_TiendasActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Actividades;
    private javax.swing.JButton Button_Tiendas;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
