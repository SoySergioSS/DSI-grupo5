package Interfaz;

import DAO.DAOactividadImplementacion;
import DAO.DAOactividadfavoritoImplementacion;
import DAO.DAOarticulofavoritoImplementacion;
import DAO.DAOclienteactividadImplementacion;
import Logica.Actividad;
import Main.WindowManager;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class JFrame_MostrarActividad extends javax.swing.JFrame {

    private int idActividad;
    private int idUsuario;

    public int getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(int idActividad) {
        this.idActividad = idActividad;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        if (visible) {
            this.idActividad = WindowManager.getIdActividad();
            this.idUsuario = WindowManager.getIdUsuario();
            try {
                MostrarActividad();
            } catch (Exception ex) {
                Logger.getLogger(JFrame_MostrarArticulo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public JFrame_MostrarActividad() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Button_Regresar = new javax.swing.JButton();
        Text_Titulo = new javax.swing.JLabel();
        Text_Fecha = new javax.swing.JLabel();
        Text_Distrito = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Text_Descripcion = new javax.swing.JTextArea();
        Text_Usuario = new javax.swing.JLabel();
        Button_Asistencia = new javax.swing.JButton();
        Button_Favorito = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo-principal.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Button_Regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        Button_Regresar.setBorder(null);
        Button_Regresar.setBorderPainted(false);
        Button_Regresar.setContentAreaFilled(false);
        Button_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_RegresarActionPerformed(evt);
            }
        });

        Text_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Text_Titulo.setText("Titulo");

        Text_Fecha.setText("Fecha");

        Text_Distrito.setText("Distrito");

        Text_Descripcion.setColumns(20);
        Text_Descripcion.setRows(5);
        jScrollPane2.setViewportView(Text_Descripcion);

        Text_Usuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Text_Usuario.setText("Autor");

        Button_Asistencia.setText("Asistencia");
        Button_Asistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_AsistenciaActionPerformed(evt);
            }
        });

        Button_Favorito.setText("Favoritos");
        Button_Favorito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_FavoritoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Text_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(Button_Regresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(Text_Distrito, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Text_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Text_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(Button_Asistencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Button_Favorito)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Button_Regresar)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(Text_Titulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_Fecha)
                    .addComponent(Text_Distrito))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Text_Usuario)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Asistencia)
                    .addComponent(Button_Favorito))
                .addContainerGap(17, Short.MAX_VALUE))
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
        this.dispose();
        WindowManager.showWindow("frameActividades");
    }//GEN-LAST:event_Button_RegresarActionPerformed

    private void Button_AsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_AsistenciaActionPerformed
        DAOclienteactividadImplementacion asistencia = new DAOclienteactividadImplementacion();
        try {
            boolean asitencia = !asistencia.Buscar(idActividad, idUsuario);
            asistencia.Modificar(asitencia, idActividad, idUsuario);
            if(asitencia){
                JOptionPane.showMessageDialog(null, "Asistencia confirmada");
            }else{
                JOptionPane.showMessageDialog(null, "Asistencia eliminada");
            }
            MostrarActividad();
        } catch (Exception ex) {
            Logger.getLogger(JFrame_MostrarArticulo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Button_AsistenciaActionPerformed

    private void Button_FavoritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_FavoritoActionPerformed
        DAOactividadfavoritoImplementacion actividadFav = new DAOactividadfavoritoImplementacion();
        try {
            boolean favorito = !actividadFav.Buscar(idActividad, idUsuario);
            actividadFav.Modificar(favorito, idActividad, idUsuario);
            if(favorito){
                JOptionPane.showMessageDialog(null, "Agregado a favoritos");
            }else{
                JOptionPane.showMessageDialog(null, "Eliminado de favoritos");
            }
            MostrarActividad();
        } catch (Exception ex) {
            Logger.getLogger(JFrame_MostrarArticulo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Button_FavoritoActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame_MostrarActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_MostrarActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_MostrarActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_MostrarActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_MostrarActividad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Asistencia;
    private javax.swing.JButton Button_Favorito;
    private javax.swing.JButton Button_Regresar;
    private javax.swing.JTextArea Text_Descripcion;
    private javax.swing.JLabel Text_Distrito;
    private javax.swing.JLabel Text_Fecha;
    private javax.swing.JLabel Text_Titulo;
    private javax.swing.JLabel Text_Usuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void MostrarActividad() throws Exception {
        try {
            DAOactividadImplementacion actividadImpl = new DAOactividadImplementacion();

            // Obtener el artículo desde la base de datos
            Actividad actividad = actividadImpl.SeleccionarD(this.idActividad);

            // Mostrar los datos en los componentes de la ventana
            if (actividad != null) {
                Text_Titulo.setText("Título: " + actividad.getTitulo());
                Text_Descripcion.setText(actividad.getDescripcion());
                Text_Fecha.setText("Fecha: " + actividad.getFecha());
                Text_Distrito.setText("Distrito: " + actividad.getDistrito());
                Text_Usuario.setText("Autor: " + actividad.getNombreCliente());
            } else {
                System.out.println("Actividad no encontrado.");
            }
        } catch (Exception e) {
            System.err.println("Error al mostrar actividad: " + e.getMessage());
        }

        DAOactividadfavoritoImplementacion actividadFav = new DAOactividadfavoritoImplementacion();
        if (actividadFav.Buscar(idActividad, idUsuario)) {
            Button_Favorito.setBackground(Color.yellow);
            Button_Favorito.setText("Eliminar de favoritos");
        } else {
            Button_Favorito.setBackground(Color.white);
            Button_Favorito.setText("Agregar a favoritos");
        }
        
        DAOclienteactividadImplementacion asistencia = new DAOclienteactividadImplementacion();
        if(asistencia.Buscar(idActividad, idUsuario)){
            Button_Asistencia.setBackground(Color.green);
            Button_Asistencia.setText("Eliminar asistencia");
        }else{
            Button_Asistencia.setBackground(Color.red);
            Button_Asistencia.setText("Confirmar asistencia");
        }
    }
}
