package Interfaz;

import DAO.DAOadministradorImplementacion;
import Main.WindowManager;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JFrame_PrincipalAdministrador extends javax.swing.JFrame {

    private int idUsuario;

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
   @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        if (visible) {
            this.idUsuario = WindowManager.getIdUsuario(); // Obtener el ID del usuario actual

            try {
                // Crear la implementación del DAO y buscar el administrador
                DAOadministradorImplementacion adminImpl = new DAOadministradorImplementacion();
                Logica.Administrador admin = adminImpl.SeleccionarD(idUsuario);

                if (admin != null) { 
                    IdUsuario1.setText(admin.getUsuario()); // Mostrar el usuario en el label
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontró el usuario con ID: " + idUsuario, "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al cargar usuario: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    
    public JFrame_PrincipalAdministrador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Button_Actividades = new javax.swing.JButton();
        Button_Articulos = new javax.swing.JButton();
        Button_Tiendas = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        Button_CerrarSesion1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        IdUsuario1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(360, 480));
        setPreferredSize(new java.awt.Dimension(376, 519));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153), 3, true));
        jPanel2.setDoubleBuffered(false);
        jPanel2.setMinimumSize(new java.awt.Dimension(360, 480));
        jPanel2.setPreferredSize(new java.awt.Dimension(360, 480));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 247));

        Button_Actividades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actividad.png"))); // NOI18N
        Button_Actividades.setText("Ver Actividades");
        Button_Actividades.setBorder(null);
        Button_Actividades.setContentAreaFilled(false);
        Button_Actividades.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Actividades.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Button_Actividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ActividadesActionPerformed(evt);
            }
        });

        Button_Articulos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/articulo.png"))); // NOI18N
        Button_Articulos.setText("Ver Articulos");
        Button_Articulos.setBorder(null);
        Button_Articulos.setContentAreaFilled(false);
        Button_Articulos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Articulos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Button_Articulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ArticulosActionPerformed(evt);
            }
        });

        Button_Tiendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tienda.png"))); // NOI18N
        Button_Tiendas.setText("Ver Tiendas");
        Button_Tiendas.setBorder(null);
        Button_Tiendas.setContentAreaFilled(false);
        Button_Tiendas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Tiendas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Button_Tiendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_TiendasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Button_Actividades, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(Button_Articulos, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Button_Tiendas, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Button_Actividades, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Button_Articulos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Button_Tiendas)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 153, 102));
        jPanel4.setPreferredSize(new java.awt.Dimension(350, 215));

        Button_CerrarSesion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar-sesion.png"))); // NOI18N
        Button_CerrarSesion1.setBorder(null);
        Button_CerrarSesion1.setBorderPainted(false);
        Button_CerrarSesion1.setContentAreaFilled(false);
        Button_CerrarSesion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CerrarSesion1ActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/perfil-admin.png"))); // NOI18N
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        IdUsuario1.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        IdUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        IdUsuario1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IdUsuario1.setText("jLabel2");
        IdUsuario1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo-principal.png"))); // NOI18N
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IdUsuario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(Button_CerrarSesion1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                        .addGap(56, 56, 56)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Button_CerrarSesion1))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IdUsuario1)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_ActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ActividadesActionPerformed
        WindowManager.showWindow("frameActividadesAdministrador");
    }//GEN-LAST:event_Button_ActividadesActionPerformed

    private void Button_ArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ArticulosActionPerformed
        WindowManager.showWindow("frameArticulosAdministrador");
    }//GEN-LAST:event_Button_ArticulosActionPerformed

    private void Button_TiendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_TiendasActionPerformed
        WindowManager.showWindow("frameTiendasAdministrador");
    }//GEN-LAST:event_Button_TiendasActionPerformed

    private void Button_CerrarSesion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CerrarSesion1ActionPerformed
        WindowManager.showWindow("frameInicioApp");
    }//GEN-LAST:event_Button_CerrarSesion1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_PrincipalAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Actividades;
    private javax.swing.JButton Button_Articulos;
    private javax.swing.JButton Button_CerrarSesion1;
    private javax.swing.JButton Button_Tiendas;
    private javax.swing.JLabel IdUsuario1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
