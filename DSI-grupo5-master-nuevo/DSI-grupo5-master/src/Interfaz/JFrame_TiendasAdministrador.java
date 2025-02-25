package Interfaz;

import CadenaDeResponsabilidad.ValidadorLink;
import CadenaDeResponsabilidad.ValidadorVacio;
import DAO.DAOtiendaImplementacion;
import Interfaces.Validador;
import Logica.Tienda;
import Main.WindowManager;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFrame_TiendasAdministrador extends javax.swing.JFrame {

    private int idAdministrador;

    public void setIdUsuario(int idUsuario) {
        this.idAdministrador = idUsuario;
    }

    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        if (visible) {
            this.idAdministrador = WindowManager.getIdUsuario(); // Obtener el ID del usuario actual
            this.MostrarTabla();
        }
    }

    public JFrame_TiendasAdministrador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Button_Regresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Text_IdTienda = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Text_Link = new javax.swing.JTextField();
        Button_Agregar = new javax.swing.JButton();
        Button_Eliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Tiendas = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        Text_Nombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153), 3, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(360, 480));

        jLabel1.setText("Administrar Tiendas");

        Button_Regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        Button_Regresar.setBorder(null);
        Button_Regresar.setBorderPainted(false);
        Button_Regresar.setContentAreaFilled(false);
        Button_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_RegresarActionPerformed(evt);
            }
        });

        jLabel2.setText("ID de tienda");

        Text_IdTienda.setText(" ");

        jLabel3.setText("Link");

        Text_Link.setText(" ");

        Button_Agregar.setBackground(new java.awt.Color(0, 153, 51));
        Button_Agregar.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        Button_Agregar.setForeground(new java.awt.Color(255, 255, 255));
        Button_Agregar.setText("Agregar");
        Button_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_AgregarActionPerformed(evt);
            }
        });

        Button_Eliminar.setBackground(new java.awt.Color(153, 0, 0));
        Button_Eliminar.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        Button_Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        Button_Eliminar.setText("Eliminar");
        Button_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_EliminarActionPerformed(evt);
            }
        });

        Table_Tiendas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Table_Tiendas);

        jScrollPane2.setViewportView(jScrollPane1);

        jLabel4.setText("Nombre");

        Text_Nombre.setText(" ");
        Text_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_NombreActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo-principal.png"))); // NOI18N
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Button_Regresar)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Text_Link, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Text_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Text_IdTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Button_Eliminar)
                                    .addComponent(Button_Agregar)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Button_Regresar)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Text_IdTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Text_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Text_Link, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(Button_Eliminar)
                        .addGap(18, 18, 18)
                        .addComponent(Button_Agregar)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_RegresarActionPerformed
        WindowManager.showWindow("framePrincipalAdministrador");
    }//GEN-LAST:event_Button_RegresarActionPerformed

    private void Text_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_NombreActionPerformed

    private void Button_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_AgregarActionPerformed
        this.AñadirTienda();
    }//GEN-LAST:event_Button_AgregarActionPerformed

    private void Button_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_EliminarActionPerformed
        this.EliminarTienda();
    }//GEN-LAST:event_Button_EliminarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_TiendasAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Agregar;
    private javax.swing.JButton Button_Eliminar;
    private javax.swing.JButton Button_Regresar;
    private javax.swing.JTable Table_Tiendas;
    private javax.swing.JTextField Text_IdTienda;
    private javax.swing.JTextField Text_Link;
    private javax.swing.JTextField Text_Nombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    public void MostrarTabla() {
        DAOtiendaImplementacion tiendaImpl = new DAOtiendaImplementacion();
        ArrayList<Tienda> tiendas = tiendaImpl.Seleccionar();

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Id Tienda");
        modelo.addColumn("Nombre");
        modelo.addColumn("Link");
        Table_Tiendas.setModel(modelo);

        String[] datos = new String[3];

        for (Tienda tienda : tiendas) {
            datos[0] = String.valueOf(tienda.getIdTienda());
            datos[1] = tienda.getNombre();
            datos[2] = tienda.getLink();
            modelo.addRow(datos);
        }
    }

    public void AñadirTienda() {
        Validador validadorNombre = new ValidadorVacio();
        Validador validadorLinkVacio = new ValidadorVacio();

        Validador validadorLink = new ValidadorLink();
        validadorLinkVacio.setSiguiente(validadorLink);

        try {
            validadorNombre.validar(Text_Nombre);
            validadorLinkVacio.validar(Text_Link);

            DAOtiendaImplementacion tiendaImpl = new DAOtiendaImplementacion();
            Tienda tienda = new Tienda();
            tienda.setIdAdministrador(idAdministrador);
            tienda.setNombre(Text_Nombre.getText());
            tienda.setLink(Text_Link.getText());

            if (tiendaImpl.Registrar(tienda) == true) {
                JOptionPane.showMessageDialog(null, "Tienda agregada con exito");
                this.MostrarTabla();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void EliminarTienda() {
        Validador validadorIdTienda = new ValidadorVacio();

        try {
            validadorIdTienda.validar(Text_IdTienda);

            DAOtiendaImplementacion tiendaImpl = new DAOtiendaImplementacion();

            if (tiendaImpl.Eliminar(Integer.parseInt(Text_IdTienda.getText())) == true) {
                JOptionPane.showMessageDialog(null, "Tienda eliminada");
                this.MostrarTabla();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
