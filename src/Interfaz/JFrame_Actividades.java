package Interfaz;

import DAO.DAOactividadImplementacion;
import Logica.Actividad;
import Main.WindowManager;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class JFrame_Actividades extends javax.swing.JFrame {

    private int idUsuario;

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        if (visible) {
            this.MostrarTabla();
        }
    }

    public JFrame_Actividades() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Button_CrearActividad = new javax.swing.JButton();
        Button_Regresar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Actividades = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(360, 480));

        Button_CrearActividad.setText("Crear Actividad");
        Button_CrearActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CrearActividadActionPerformed(evt);
            }
        });

        Button_Regresar.setText("Regresar");
        Button_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_RegresarActionPerformed(evt);
            }
        });

        Table_Actividades.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Table_Actividades);

        jScrollPane2.setViewportView(jScrollPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Regresar))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(Button_CrearActividad)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Button_Regresar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Button_CrearActividad)
                .addContainerGap(53, Short.MAX_VALUE))
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
        WindowManager.showWindow("framePrincipal");
    }//GEN-LAST:event_Button_RegresarActionPerformed

    private void Button_CrearActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CrearActividadActionPerformed
        WindowManager.showWindow("frameGenerarActividad");
    }//GEN-LAST:event_Button_CrearActividadActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Actividades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_CrearActividad;
    private javax.swing.JButton Button_Regresar;
    private javax.swing.JTable Table_Actividades;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    public void MostrarTabla() {
        DAOactividadImplementacion actividadImpl = new DAOactividadImplementacion();
        ArrayList<Actividad> actividades = actividadImpl.Seleccionar();
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Titulo");
        modelo.addColumn("Descripción");
        modelo.addColumn("Distrito");
        modelo.addColumn("fecha");
        Table_Actividades.setModel(modelo);

        String[] datos = new String[4];

        for (Actividad actividad : actividades) {
            if (actividad.isAceptado()) {
                datos[0] = actividad.getTitulo();
                datos[1] = actividad.getDescripcion();
                datos[2] = actividad.getDistrito();
                datos[3] = actividad.getFecha();
                modelo.addRow(datos);
            }
        }
    }
}
