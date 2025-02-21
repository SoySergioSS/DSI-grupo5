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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Administrar Tiendas");

        Button_Regresar.setText("Regresar");
        Button_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_RegresarActionPerformed(evt);
            }
        });

        jLabel2.setText("ID de tienda");

        Text_IdTienda.setText(" ");

        jLabel3.setText("Link");

        Text_Link.setText(" ");

        Button_Agregar.setText("Agregar");
        Button_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_AgregarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(Button_Regresar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Text_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Text_Link, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Text_IdTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button_Agregar)
                            .addComponent(Button_Eliminar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(Button_Regresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Text_IdTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Button_Eliminar)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Text_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Text_Link, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button_Agregar)
                        .addGap(43, 43, 43))))
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
