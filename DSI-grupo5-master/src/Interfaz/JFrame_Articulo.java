
package Interfaz;

import DAO.DAOarticuloImplementacion;
import DAO.DAOclientearticuloImplementacion;
import Interfaz.JFrame_Componentes.Editor;
import Interfaz.JFrame_Componentes.Render;
import Logica.Articulo;
import Main.WindowManager;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;

public class JFrame_Articulo extends javax.swing.JFrame {

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
                Logger.getLogger(JFrame_Articulo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public JFrame_Articulo() {
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

        jPanel1 = new javax.swing.JPanel();
        Button_CrearArticulo = new javax.swing.JButton();
        Button_Regresar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Articulo = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153), 3, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(360, 480));

        Button_CrearArticulo.setBackground(new java.awt.Color(0, 51, 153));
        Button_CrearArticulo.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        Button_CrearArticulo.setForeground(new java.awt.Color(255, 255, 255));
        Button_CrearArticulo.setText("Crear Articulo");
        Button_CrearArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CrearArticuloActionPerformed(evt);
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

        Table_Articulo.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Table_Articulo);

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
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(Button_CrearArticulo)))
                        .addGap(0, 18, Short.MAX_VALUE)))
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Button_CrearArticulo)
                .addContainerGap(43, Short.MAX_VALUE))
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

    private void Button_CrearArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CrearArticuloActionPerformed
        WindowManager.showWindow("frameGenerarArticulo");
    }//GEN-LAST:event_Button_CrearArticuloActionPerformed

    private void Button_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_RegresarActionPerformed
        WindowManager.showWindow("framePrincipal");
    }//GEN-LAST:event_Button_RegresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame_Articulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Articulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Articulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Articulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Articulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_CrearArticulo;
    private javax.swing.JButton Button_Regresar;
    private javax.swing.JTable Table_Articulo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
        public void MostrarTabla() throws Exception {
            // Definir las columnas y el tipo de datos correcto para la última columna
            DefaultTableModel modelo = new DefaultTableModel(
                new String[]{"Id Articulo", "Titulo", "Descripción", "Favorito"}, 0
            ) {
                @Override
                public Class<?> getColumnClass(int columnIndex) {
                    return columnIndex == 3 ? Boolean.class : String.class; // La última columna es un checkbox
                }

                @Override
                public boolean isCellEditable(int row, int column) {
                    return column == 3; // Solo la columna de "Asistir" es editable
                }
            };

            DAOarticuloImplementacion articuloImpl = new DAOarticuloImplementacion();
            ArrayList<Articulo> articulos = articuloImpl.Seleccionar();

            for (Articulo articulo : articulos) {
                if (articulo.isAceptado()) {
                    DAOclientearticuloImplementacion clientearticuloimpl = new DAOclientearticuloImplementacion();
                    boolean favoritoMarcado = clientearticuloimpl.Buscar(articulo.getIdArticulo(), idUsuario);

                    Object[] datos = {
                        articulo.getIdArticulo(),
                        articulo.getTitulo(),
                        articulo.getDescripcion(),
                        favoritoMarcado
                    };
                    modelo.addRow(datos);
                }
            }

            // Asignar el modelo corregido a la tabla
            Table_Articulo.setModel(modelo);

            Table_Articulo.getColumnModel().getColumn(3).setCellRenderer(Table_Articulo.getDefaultRenderer(Boolean.class));
            Table_Articulo.getColumnModel().getColumn(3).setCellEditor(Table_Articulo.getDefaultEditor(Boolean.class));

            // Agregar listener para detectar cambios en el checkbox
            modelo.addTableModelListener((TableModelEvent e) -> {
                if (e.getType() == TableModelEvent.UPDATE) {
                    int row = e.getFirstRow();
                    int column = e.getColumn();


                    if (column == 3) { // Solo cuando cambie el checkbox
                        int idArticulo = (int) modelo.getValueAt(row, 0);
                        boolean favorito = (boolean) modelo.getValueAt(row, 3);

                        // Guardar en la base de datos
                        DAOclientearticuloImplementacion clientearticuloimpl = new DAOclientearticuloImplementacion();
                        try {
                            if(!clientearticuloimpl.Modificar(favorito, idArticulo, idUsuario)){
                                JOptionPane.showMessageDialog(null, "Modificacion fallida");
                            }
                        } catch (Exception ex) {
                            Logger.getLogger(JFrame_Actividades.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            });

    }

}
