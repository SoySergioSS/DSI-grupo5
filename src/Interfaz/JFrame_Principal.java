package Interfaz;

import DAO.DAOclienteImplementacion;
import Main.WindowManager;
import javax.swing.JOptionPane;

public class JFrame_Principal extends javax.swing.JFrame {

    private int idUsuario;

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        if (visible) {
            this.idUsuario = WindowManager.getIdUsuario(); // Obtener el ID del usuario actual
             try{
            
            DAOclienteImplementacion clientImpl = new DAOclienteImplementacion();
            Logica.Cliente cliente = clientImpl.SeleccionarD(idUsuario);

                if (cliente != null) { 
                    IdUsuario.setText(cliente.getUsuario());
                } else {
                    System.out.println("No se encontró el usuario con ID: " + idUsuario);
                }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        }
    }
    public JFrame_Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Button_Perfil = new javax.swing.JButton();
        Button_CerrarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        IdUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Button_VerActividades = new javax.swing.JButton();
        Button_VerArticulos = new javax.swing.JButton();
        Button_VerTiendas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153), 3, true));
        jPanel2.setDoubleBuffered(false);

        jPanel3.setBackground(new java.awt.Color(0, 153, 102));
        jPanel3.setPreferredSize(new java.awt.Dimension(350, 233));

        Button_Perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver-perfil.png"))); // NOI18N
        Button_Perfil.setBorder(null);
        Button_Perfil.setBorderPainted(false);
        Button_Perfil.setContentAreaFilled(false);
        Button_Perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_PerfilActionPerformed(evt);
            }
        });

        Button_CerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar-sesion.png"))); // NOI18N
        Button_CerrarSesion.setBorder(null);
        Button_CerrarSesion.setBorderPainted(false);
        Button_CerrarSesion.setContentAreaFilled(false);
        Button_CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CerrarSesionActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/perfil-principal.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        IdUsuario.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        IdUsuario.setForeground(new java.awt.Color(255, 255, 255));
        IdUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IdUsuario.setText("jLabel2");
        IdUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo-principal.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IdUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(Button_CerrarSesion)
                        .addGap(94, 94, 94)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addComponent(Button_Perfil)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button_CerrarSesion)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Button_Perfil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IdUsuario)
                .addGap(14, 14, 14))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 274));

        Button_VerActividades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actividad.png"))); // NOI18N
        Button_VerActividades.setText("Ver Actividades");
        Button_VerActividades.setBorder(null);
        Button_VerActividades.setContentAreaFilled(false);
        Button_VerActividades.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_VerActividades.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Button_VerActividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_VerActividadesActionPerformed(evt);
            }
        });

        Button_VerArticulos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/articulo.png"))); // NOI18N
        Button_VerArticulos.setText("Ver Articulos");
        Button_VerArticulos.setBorder(null);
        Button_VerArticulos.setContentAreaFilled(false);
        Button_VerArticulos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_VerArticulos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Button_VerArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_VerArticulosActionPerformed(evt);
            }
        });

        Button_VerTiendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tienda.png"))); // NOI18N
        Button_VerTiendas.setText("Ver Tiendas");
        Button_VerTiendas.setBorder(null);
        Button_VerTiendas.setContentAreaFilled(false);
        Button_VerTiendas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_VerTiendas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Button_VerTiendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_VerTiendasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button_VerTiendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Button_VerActividades, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Button_VerArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Button_VerActividades, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Button_VerArticulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Button_VerTiendas)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CerrarSesionActionPerformed
        WindowManager.showWindow("frameInicioApp");
    }//GEN-LAST:event_Button_CerrarSesionActionPerformed

    private void Button_PerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_PerfilActionPerformed
        WindowManager.showWindow("framePerfil");
    }//GEN-LAST:event_Button_PerfilActionPerformed

    private void Button_VerActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_VerActividadesActionPerformed
        WindowManager.showWindow("frameActividades");
    }//GEN-LAST:event_Button_VerActividadesActionPerformed

    private void Button_VerTiendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_VerTiendasActionPerformed
        WindowManager.showWindow("frameTiendas");
    }//GEN-LAST:event_Button_VerTiendasActionPerformed

    private void Button_VerArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_VerArticulosActionPerformed
        WindowManager.showWindow("frameArticulo");
    }//GEN-LAST:event_Button_VerArticulosActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Principal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_CerrarSesion;
    private javax.swing.JButton Button_Perfil;
    private javax.swing.JButton Button_VerActividades;
    private javax.swing.JButton Button_VerArticulos;
    private javax.swing.JButton Button_VerTiendas;
    private javax.swing.JLabel IdUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
