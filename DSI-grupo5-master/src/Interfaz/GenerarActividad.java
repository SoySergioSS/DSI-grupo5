/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaz;

import CadenaDeResponsabilidad.ValidadorFecha;
import CadenaDeResponsabilidad.ValidadorVacio;
import DAO.DAOactividadImplementacion;
import Interfaces.Validador;
import Main.WindowManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Kojiro
 */
public class GenerarActividad extends javax.swing.JPanel {

    private int idUsuario;

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        if (visible) {
            this.idUsuario = WindowManager.getIdUsuario(); // Obtener el ID del usuario actual
            System.out.println(idUsuario);
        }
    }

    public GenerarActividad() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Text_Titulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Text_Distrito = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Text_Fecha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Text_Descripción = new javax.swing.JTextField();
        Button_SolicitarRevision = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setText("Generar Actividad");

        jLabel2.setText("Nombre de la Actividad");

        Text_Titulo.setText("Nombre");

        jLabel3.setText("Distrito a realizar");

        Text_Distrito.setText("Distrito");

        jLabel5.setText("Fecha");

        Text_Fecha.setText("00/00/00");

        jLabel6.setText("Información relacionada");

        Button_SolicitarRevision.setText("Solicitar Revisión");
        Button_SolicitarRevision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SolicitarRevisionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(Text_Descripción, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                            .addComponent(Text_Fecha)
                            .addComponent(Text_Distrito)
                            .addComponent(Text_Titulo))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 189, Short.MAX_VALUE)
                .addComponent(Button_SolicitarRevision)
                .addGap(187, 187, 187))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Text_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Text_Distrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Text_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Text_Descripción, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(Button_SolicitarRevision)
                .addContainerGap(92, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Button_SolicitarRevisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SolicitarRevisionActionPerformed
       Validador validarTitulo = new ValidadorVacio();
        Validador validarDistrito = new ValidadorVacio();
        Validador validarFechaVacia = new ValidadorVacio();

        Validador validarFecha = new ValidadorFecha();
        validarFechaVacia.setSiguiente(validarFecha);

        try {
            validarTitulo.validar(Text_Titulo);
            validarDistrito.validar(Text_Distrito);
            validarFechaVacia.validar(Text_Fecha);

            DAOactividadImplementacion actividadImpl = new DAOactividadImplementacion();
            Logica.Actividad actividad = new Logica.Actividad();
            actividad.setTitulo(Text_Titulo.getText().trim());
            actividad.setDistrito(Text_Distrito.getText().trim());
            actividad.setFecha(Text_Fecha.getText().trim());
            actividad.setDescripcion(Text_Descripción.getText().trim());
            actividad.setIdCliente(idUsuario);

            if (actividadImpl.Registrar(actividad) == true) {
                JOptionPane.showMessageDialog(null, "Actividad enviada a revisión!");
                Text_Titulo.setText("");
                Text_Distrito.setText("");
                Text_Fecha.setText("");
                Text_Descripción.setText("");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }     
    }//GEN-LAST:event_Button_SolicitarRevisionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Button_SolicitarRevision;
    private javax.swing.JTextField Text_Descripción;
    private javax.swing.JTextField Text_Distrito;
    private javax.swing.JTextField Text_Fecha;
    private javax.swing.JTextField Text_Titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
