package Interfaz;

import Main.WindowManager;

public class JFrame_Principal extends javax.swing.JFrame {

    
    
    public JFrame_Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Button_CerrarSesion = new javax.swing.JButton();
        Button_Perfil = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Button_VerTiendas = new javax.swing.JButton();
        Button_VerActividades = new javax.swing.JButton();
        Button_VerArticulos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_CerrarSesion.setText("Cerrar Sesion");
        Button_CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CerrarSesionActionPerformed(evt);
            }
        });

        Button_Perfil.setText("Perfil");
        Button_Perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_PerfilActionPerformed(evt);
            }
        });

        Button_VerTiendas.setText("Ver Tiendas");
        Button_VerTiendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_VerTiendasActionPerformed(evt);
            }
        });

        Button_VerActividades.setText("Ver Actividades");
        Button_VerActividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_VerActividadesActionPerformed(evt);
            }
        });

        Button_VerArticulos.setText("Ver Articulos");
        Button_VerArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_VerArticulosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Button_VerArticulos)
                    .addComponent(Button_VerActividades)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Button_VerTiendas)
                        .addGap(7, 7, 7)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(Button_VerActividades)
                .addGap(37, 37, 37)
                .addComponent(Button_VerArticulos)
                .addGap(36, 36, 36)
                .addComponent(Button_VerTiendas)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(Button_CerrarSesion)
                .addGap(54, 54, 54)
                .addComponent(Button_Perfil)
                .addGap(73, 73, 73))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Perfil)
                    .addComponent(Button_CerrarSesion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
