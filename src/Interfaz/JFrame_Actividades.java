package Interfaz;

import DAO.DAOactividadImplementacion;
import DAO.DAOclienteactividadImplementacion;
import Interfaz.JFrame_Componentes.Editor;
import Interfaz.JFrame_Componentes.Render;
import Logica.Actividad;
import Main.WindowManager;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
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
            this.idUsuario = WindowManager.getIdUsuario();
            try {
                this.MostrarTabla();
            } catch (Exception ex) {
                Logger.getLogger(JFrame_Actividades.class.getName()).log(Level.SEVERE, null, ex);
            }
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
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153), 3, true));
        jPanel1.setDoubleBuffered(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(360, 480));

        Button_CrearActividad.setBackground(new java.awt.Color(0, 51, 153));
        Button_CrearActividad.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        Button_CrearActividad.setForeground(new java.awt.Color(255, 255, 255));
        Button_CrearActividad.setText("Crear Actividad");
        Button_CrearActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CrearActividadActionPerformed(evt);
            }
        });

        Button_Regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        Button_Regresar.setBorder(null);
        Button_Regresar.setBorderPainted(false);
        Button_Regresar.setContentAreaFilled(false);
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

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo-principal.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Button_Regresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(Button_CrearActividad)))
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button_Regresar)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Button_CrearActividad)
                .addContainerGap(23, Short.MAX_VALUE))
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    public void MostrarTabla() throws Exception {
        // Definir las columnas y el tipo de datos correcto para la última columna
        DefaultTableModel modelo = new DefaultTableModel(
                new String[]{"Id Actividad", "Titulo", "Descripción", "Distrito", "Fecha", "Asistir"}, 0
        ) {
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 5 ? Boolean.class : String.class; // La última columna es un checkbox
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 5; // Solo la columna de "Asistir" es editable
            }
        };

        DAOactividadImplementacion actividadImpl = new DAOactividadImplementacion();
        ArrayList<Actividad> actividades = actividadImpl.Seleccionar();

        for (Actividad actividad : actividades) {
            if (actividad.isAceptado()) {
                DAOclienteactividadImplementacion clienteactividadimpl = new DAOclienteactividadImplementacion();

                Object[] datos = {
                    actividad.getIdActividad(),
                    actividad.getTitulo(),
                    actividad.getDescripcion(),
                    actividad.getDistrito(),
                    actividad.getFecha(),};
                modelo.addRow(datos);
            }
        }

        // Asignar el modelo corregido a la tabla
        Table_Actividades.setModel(modelo);
        Table_Actividades.getColumnModel().getColumn(5).setCellRenderer(new Render());
        Table_Actividades.getColumnModel().getColumn(5).setCellEditor(new Editor(new JCheckBox(), "frameMostrarActividad"));
    
    }
}
