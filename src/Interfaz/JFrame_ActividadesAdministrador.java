package Interfaz;

import CadenaDeResponsabilidad.ValidadorVacio;
import DAO.DAOactividadImplementacion;
import Interfaces.Validador;
import Interfaz.JFrame_Componentes.ButtonEditor;
import Interfaz.JFrame_Componentes.ButtonRenderer;
import Logica.Actividad;
import Main.WindowManager;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class JFrame_ActividadesAdministrador extends javax.swing.JFrame {

    public JFrame_ActividadesAdministrador() {
        initComponents();
    }

    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        if (visible) {
            this.MostrarTabla();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Button_Regresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Text_IdActividad = new javax.swing.JTextField();
        Button_Agregar = new javax.swing.JButton();
        Button_Rechazar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_AdministrarActividades = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153), 3, true));

        Button_Regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        Button_Regresar.setBorder(null);
        Button_Regresar.setBorderPainted(false);
        Button_Regresar.setContentAreaFilled(false);
        Button_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_RegresarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel1.setText("ID Actividad");

        Text_IdActividad.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        Text_IdActividad.setText("                       ");

        Button_Agregar.setBackground(new java.awt.Color(0, 153, 51));
        Button_Agregar.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        Button_Agregar.setForeground(new java.awt.Color(255, 255, 255));
        Button_Agregar.setText("Agregar");
        Button_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_AgregarActionPerformed(evt);
            }
        });

        Button_Rechazar.setBackground(new java.awt.Color(153, 0, 0));
        Button_Rechazar.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        Button_Rechazar.setForeground(new java.awt.Color(255, 255, 255));
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
        jScrollPane1.setViewportView(Table_AdministrarActividades);

        jScrollPane2.setViewportView(jScrollPane1);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo-principal.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addComponent(Text_IdActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(Button_Agregar)
                        .addGap(91, 91, 91)
                        .addComponent(Button_Rechazar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Button_Regresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button_Regresar)
                    .addComponent(jLabel2))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_IdActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Rechazar)
                    .addComponent(Button_Agregar))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_RegresarActionPerformed
        WindowManager.showWindow("framePrincipalAdministrador");
    }//GEN-LAST:event_Button_RegresarActionPerformed

    private void Button_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_AgregarActionPerformed
        Validador validarIdActividad = new ValidadorVacio();

        try {
            validarIdActividad.validar(Text_IdActividad);

            DAOactividadImplementacion actividadImpl = new DAOactividadImplementacion();
            actividadImpl.Modificar(Integer.parseInt(Text_IdActividad.getText().trim()));

            this.MostrarTabla();

            UIManager.put("Panel.background", Color.WHITE);
            UIManager.put("OptionPane.background", Color.WHITE);
            ImageIcon icono = new ImageIcon("src/Imagenes/enviado.gif"); // Ruta de la imagen
            JOptionPane.showMessageDialog(rootPane, "Actividad Aceptada", "Solicitud Aceptada", JOptionPane.PLAIN_MESSAGE, icono);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_Button_AgregarActionPerformed

    private void Button_RechazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_RechazarActionPerformed
        Validador validarIdActividad = new ValidadorVacio();

        try {
            validarIdActividad.validar(Text_IdActividad);

            DAOactividadImplementacion actividadImpl = new DAOactividadImplementacion();
            if (actividadImpl.Eliminar(Integer.parseInt(Text_IdActividad.getText().trim())) == false) {
                JOptionPane.showMessageDialog(null, "El ID de esa actividad no existe");
            } else {
                this.MostrarTabla();
                
                UIManager.put("Panel.background", Color.WHITE);
            UIManager.put("OptionPane.background", Color.WHITE);
            ImageIcon icono = new ImageIcon("src/Imagenes/enviado.gif"); // Ruta de la imagen
            JOptionPane.showMessageDialog(rootPane, "Actividad Eliminada", "Solicitud Eliminada", JOptionPane.PLAIN_MESSAGE, icono);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_Button_RechazarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_ActividadesAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Agregar;
    private javax.swing.JButton Button_Rechazar;
    private javax.swing.JButton Button_Regresar;
    private javax.swing.JTable Table_AdministrarActividades;
    public static javax.swing.JTextField Text_IdActividad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

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
        modelo.addColumn("Aceptado");
        modelo.addColumn("Asistencias");  
        Table_AdministrarActividades.setModel(modelo);

        String[] datos = new String[8];

        for (Actividad actividad : actividades) {

            datos[0] = String.valueOf(actividad.getIdActividad());
            datos[1] = actividad.getTitulo();
            datos[2] = actividad.getDescripcion();
            datos[3] = actividad.getDistrito();
            datos[4] = actividad.getFecha();
            datos[5] = String.valueOf(actividad.getIdCliente());
            datos[6] = (actividad.isAceptado() == false) ? "No" : "Si";
            if ("Si".equals(datos[6])) {
                modelo.addRow(new Object[]{datos[0], datos[1], datos[2], datos[3], datos[4], datos[5], datos[6], "Ver"});
            } else {
                modelo.addRow(new Object[]{datos[0], datos[1], datos[2], datos[3], datos[4], datos[5], datos[6], "-"});
            }

            Table_AdministrarActividades.getColumn("Asistencias").setCellRenderer(new ButtonRenderer());
            Table_AdministrarActividades.getColumn("Asistencias").setCellEditor(new ButtonEditor(new JCheckBox()));
        }
    }

}
