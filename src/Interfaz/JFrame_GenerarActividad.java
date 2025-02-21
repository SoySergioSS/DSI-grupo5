package Interfaz;

import CadenaDeResponsabilidad.ValidadorFecha;
import CadenaDeResponsabilidad.ValidadorVacio;
import DAO.DAOactividadImplementacion;
import Interfaces.Validador;
import Main.WindowManager;
import javax.swing.JOptionPane;

public class JFrame_GenerarActividad extends javax.swing.JFrame {

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

    public JFrame_GenerarActividad() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Text_Titulo = new javax.swing.JTextField();
        Text_Distrito = new javax.swing.JTextField();
        Text_Fecha = new javax.swing.JTextField();
        Text_Descripción = new javax.swing.JTextField();
        Button_SolicitarRevision = new javax.swing.JButton();
        Button_Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Proponer Actividad");

        jLabel2.setText("Título");

        jLabel3.setText("Distrito");

        jLabel4.setText("Fecha");

        jLabel6.setText("Descripción");

        Text_Titulo.setText(" ");

        Text_Distrito.setText(" ");

        Text_Fecha.setText(" ");

        Text_Descripción.setText(" ");

        Button_SolicitarRevision.setText("Soliciar Revision");
        Button_SolicitarRevision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SolicitarRevisionActionPerformed(evt);
            }
        });

        Button_Cancelar.setText("Cancelar");
        Button_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Text_Distrito, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Text_Fecha)
                                    .addComponent(Text_Titulo)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Button_Cancelar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(Text_Descripción))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel1)
                        .addGap(0, 128, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(Button_SolicitarRevision)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Button_Cancelar)
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(114, 114, 114)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Text_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Text_Distrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Text_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Text_Descripción, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(Button_SolicitarRevision)
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
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

    private void Button_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CancelarActionPerformed
        Text_Titulo.setText("");
        Text_Distrito.setText("");
        Text_Fecha.setText("");
        Text_Descripción.setText("");
        
        WindowManager.showWindow("frameActividades");
    }//GEN-LAST:event_Button_CancelarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_GenerarActividad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Cancelar;
    private javax.swing.JButton Button_SolicitarRevision;
    private javax.swing.JTextField Text_Descripción;
    private javax.swing.JTextField Text_Distrito;
    private javax.swing.JTextField Text_Fecha;
    private javax.swing.JTextField Text_Titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
