package Interfaz;

import Main.WindowManager;

public class JFrame_PrincipalAdministrador extends javax.swing.JFrame {

    
    
    public JFrame_PrincipalAdministrador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button_CerrarSesion = new javax.swing.JButton();
        Button_Actividades = new javax.swing.JButton();
        Button_Tiendas = new javax.swing.JButton();
        Button_Tiendas1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Button_CerrarSesion.setText("Cerrar Sesion");
        Button_CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CerrarSesionActionPerformed(evt);
            }
        });

        Button_Actividades.setText("Gestionar Actividades");
        Button_Actividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ActividadesActionPerformed(evt);
            }
        });

        Button_Tiendas.setText("Gestionar Tiendas");
        Button_Tiendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_TiendasActionPerformed(evt);
            }
        });

        Button_Tiendas1.setText("Gestionar Artículos");
        Button_Tiendas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Tiendas1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(Button_CerrarSesion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button_Actividades)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Button_Tiendas1)
                                    .addComponent(Button_Tiendas))))))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Button_CerrarSesion)
                .addGap(171, 171, 171)
                .addComponent(Button_Actividades)
                .addGap(43, 43, 43)
                .addComponent(Button_Tiendas1)
                .addGap(44, 44, 44)
                .addComponent(Button_Tiendas)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CerrarSesionActionPerformed
        WindowManager.showWindow("frameInicioApp");
    }//GEN-LAST:event_Button_CerrarSesionActionPerformed

    private void Button_ActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ActividadesActionPerformed
        WindowManager.showWindow("frameActividadesAdministrador");
    }//GEN-LAST:event_Button_ActividadesActionPerformed

    private void Button_TiendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_TiendasActionPerformed
        WindowManager.showWindow("frameTiendasAdministrador");
    }//GEN-LAST:event_Button_TiendasActionPerformed

    private void Button_Tiendas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Tiendas1ActionPerformed
        WindowManager.showWindow("frameArticulosAdministrador");
    }//GEN-LAST:event_Button_Tiendas1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_PrincipalAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Actividades;
    private javax.swing.JButton Button_CerrarSesion;
    private javax.swing.JButton Button_Tiendas;
    private javax.swing.JButton Button_Tiendas1;
    // End of variables declaration//GEN-END:variables
}
