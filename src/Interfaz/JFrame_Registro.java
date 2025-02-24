package Interfaz;

import CadenaDeResponsabilidad.*;
import DAO.DAOclienteImplementacion;
import Interfaces.Validador;
import Main.WindowManager;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



public class JFrame_Registro extends javax.swing.JFrame {

    public JFrame_Registro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        descripcion = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtDistrito = new javax.swing.JComboBox<>();
        txtContraseña = new javax.swing.JPasswordField();
        noVisible = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153), 3, true));

        descripcion.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        descripcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descripcion.setText("Digita los datos para el registro");

        titulo.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("BIENVENIDO");

        txtNombre.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(204, 204, 204));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNombre.setText("Nombre completo");
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMousePressed(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtUser.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtUser.setForeground(new java.awt.Color(204, 204, 204));
        txtUser.setText("Nombre de usuario");
        txtUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUserMousePressed(evt);
            }
        });
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        txtCorreo.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(204, 204, 204));
        txtCorreo.setText("Correo");
        txtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCorreoMousePressed(evt);
            }
        });
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        txtTelefono.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(204, 204, 204));
        txtTelefono.setText("Telefono");
        txtTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTelefonoMousePressed(evt);
            }
        });
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(0, 153, 51));
        btnRegistrar.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
        });
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(153, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtDistrito.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtDistrito.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Lima", "Ancón", "Ate", "Barranco", "Breña", "Carabayllo", "Chaclacayo", "Chorrilos", "Cieneguilla", "Comas", "El Agustino", "Independencia", "Jesús María", "La Molina", "La Victoria", "Lince", "Los Olivos", "Lurigancho-Chosica", "Lurín", "Magdalena del Mar", "Miraflores", "Pachacámac", "Pucusana", "Pueblo Libre", "Puente Piedra", "Punta Hermosa", "Punta Negra", "Rímac", "San Bartolo", "San Borja", "San Isidro", "San Juan de Lurigancho", "San Juan de Miraflores", "San Luis", "San Martín de Porres", "San Miguel", "Santa Anita", "Santa María del Mar", "Santa Rosa", "Santiago de Surco", "Surquillo", "Villa El Salvador", "Villa María del Triunfo", "Barranca", "Paramonga", "Pativilca", "Supe", "Supe Puerto", "Cajatambo", "Copa", "Gorgor", "Huancapón", "Manás", "Canta", "Arahuay", "Huamantanga", "Huaros", "Lachaqui", "San Buenaventura", "Santa Rosa de Quives", "San Vicente de Cañete", "Asia", "Calango", "Cerro Azul", "Chilca", "Coayllo", "Imperial", "Lunahuaná", "Mala", "Nuevo Imperial", "Pacarán", "Quilmaná", "San Antonio", "San Luis", "Santa Cruz de Flores", "Zúñiga", "Huaral", "Atavillos Alto", "Atavillos Bajo", "Aucallama", "Chancay", "Ihuarí", "Lampián", "Pacaraos", "San Miguel de Acos", "Santa Cruz de Andamarca", "Sumbilca", "Veintisiete de Noviembre", "Matucana", "Antioquía", "Callahuanca", "Carampoma", "Chicla", "Cuenca", "Huachupampa", "Huanza", "Huarochirí", "Lahuaytambo", "Langa", "Laraos", "Mariatana", "Ricardo Palma", "San Andrés de Tupicocha", "San Antonio de Chaclla", "San Bartolomé", "San Damián", "San Juan de Iris", "San Juan de Tantaranche", "San Lorenzo de Quinti", "San Mateo", "San Mateo de Otao", "San Pedro de Casta", "San Pedro de Huancayre", "Sangallaya", "Santa Cruz de Cocachacra", "Santa Eulalia", "Santiago de Anchucaya", "Santiago de Tuna", "Santo Domingo de los Olleros", "San Antonio de Chaclla", "Surco", "Huacho", "Ámbar", "Caleta de Carquín", "Checras", "Hualmay", "Huaura", "Leoncio Prado", "Paccho", "Santa Leonor", "Santa María", "Sayán", "Végueta", "Oyón", "Andajes", "Caujul", "Cochamarca", "Naván", "Pachangara", "Yauyos", "Alis", "Ayauca", "Ayaviri", "Azángaro", "Cacra", "Carania", "Catahuasi", "Chocos", "Cochas", "Colonia", "Hongos", "Huampará", "Huancaya", "Huangáscar", "Huantán", "Huáñec", "Laraos", "Lincha", "Madeán", "Miraflores", "Omas", "Putinza", "Quinches", "Quinocay", "San Joaquín", "San Pedro de Pilas", "Tanta", "Tauripampa", "Tomas", "Tupe", "Víñac", "Vitis" }));

        txtContraseña.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });

        noVisible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/novisible.png"))); // NOI18N
        noVisible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                noVisibleMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                noVisibleMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noVisible)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(descripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noVisible, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        Validador validadorNombre = new ValidadorVacio();
        Validador validadorUser = new ValidadorVacio();
        Validador validadorCorreoVacio = new ValidadorVacio();
        Validador validadorTelefonoVacio = new ValidadorVacio();
        Validador validadorDistritoVacio = new ValidadorVacio();
        Validador validadorContraseñaVacio = new ValidadorVacio();
        
        Validador validadorCorreo = new ValidadorCorreo();
        validadorCorreoVacio.setSiguiente(validadorCorreo);
        
        Validador validadorTelefono = new ValidadorTelefono();
        validadorTelefonoVacio.setSiguiente(validadorTelefono);
        
        try{
            JTextField Distrito = new JTextField();
            String seleccionado = (String) txtDistrito.getSelectedItem();
            Distrito.setText(seleccionado);
            validadorNombre.validar(txtNombre);
            validadorUser.validar(txtUser);
            validadorCorreoVacio.validar(txtCorreo);
            validadorTelefonoVacio.validar(txtTelefono);
            validadorDistritoVacio.validar(Distrito);
            validadorContraseñaVacio.validar(txtContraseña);
            
            Logica.Cliente cliente = new Logica.Cliente();
            cliente.setNombre(txtNombre.getText().trim());
            cliente.setUsuario(txtUser.getText().trim());
            cliente.setCorreo(txtCorreo.getText().trim());
            cliente.setTelefono(txtTelefono.getText().trim());

            // Obtener el distrito seleccionado del JComboBox
            cliente.setDistrito(txtDistrito.getSelectedItem().toString().trim());

            cliente.setPassword(txtContraseña.getText().trim());

            DAOclienteImplementacion clientImpl = new DAOclienteImplementacion();
            if (clientImpl.Registrar(cliente)) {
                JOptionPane.showMessageDialog(null, "Registro correcto");
                WindowManager.setIdUsuario(clientImpl.Seleccionar(cliente));

                // Limpiar campos de texto
                txtNombre.setText("");
                txtUser.setText("");
                txtCorreo.setText("");
                txtTelefono.setText("");
                txtContraseña.setText("");

                // Resetear el JComboBox al primer elemento
                txtDistrito.setSelectedIndex(0);

                
                WindowManager.showWindow("framePrincipal");
            }else{
                JOptionPane.showMessageDialog(null, "Error al registrar usuario");
            }
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        
    }//GEN-LAST:event_btnRegistrarMouseClicked

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        WindowManager.showWindow("frameInicioApp");
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed
        if (txtNombre.getText().equals("Nombre completo")) {
            txtNombre.setText("");
            txtNombre.setForeground(Color.black);
        }
        if (txtUser.getText().isEmpty()) {
            txtUser.setText("Nombre de usuario");
            txtUser.setForeground(Color.gray);
        }
        if (txtTelefono.getText().isEmpty()) {
            txtTelefono.setText("Telefono");
            txtTelefono.setForeground(Color.gray);
        }
        if (txtCorreo.getText().isEmpty()) {
            txtCorreo.setText("Correo");
            txtCorreo.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtNombreMousePressed

    private void txtUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserMousePressed
        if (txtUser.getText().equals("Nombre de usuario")) {
            txtUser.setText("");
            txtUser.setForeground(Color.black);
        }
        if (txtNombre.getText().isEmpty()) {
            txtNombre.setText("Nombre completo");
            txtNombre.setForeground(Color.gray);
        }
        if (txtTelefono.getText().isEmpty()) {
            txtTelefono.setText("Telefono");
            txtTelefono.setForeground(Color.gray);
        }
        if (txtCorreo.getText().isEmpty()) {
            txtCorreo.setText("Correo");
            txtCorreo.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtUserMousePressed

    private void txtTelefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTelefonoMousePressed
        if (txtTelefono.getText().equals("Telefono")) {
            txtTelefono.setText("");
            txtTelefono.setForeground(Color.black);
        }
        if (txtNombre.getText().isEmpty()) {
            txtNombre.setText("Nombre completo");
            txtNombre.setForeground(Color.gray);
        }
        if (txtUser.getText().isEmpty()) {
            txtUser.setText("Nombre de usuario");
            txtUser.setForeground(Color.gray);
        }
        if (txtCorreo.getText().isEmpty()) {
            txtCorreo.setText("Correo");
            txtCorreo.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtTelefonoMousePressed

    private void txtCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMousePressed
        if (txtCorreo.getText().equals("Correo")) {
            txtCorreo.setText("");
            txtCorreo.setForeground(Color.black);
        }
        if (txtNombre.getText().isEmpty()) {
            txtNombre.setText("Nombre completo");
            txtNombre.setForeground(Color.gray);
        }
        if (txtUser.getText().isEmpty()) {
            txtUser.setText("Nombre de usuario");
            txtUser.setForeground(Color.gray);
        }
        if (txtTelefono.getText().isEmpty()) {
            txtTelefono.setText("Telefono");
            txtTelefono.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtCorreoMousePressed

    private void noVisibleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noVisibleMousePressed
        
        noVisible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/visible.png")));
        txtContraseña.setEchoChar((char)0);
        
    }//GEN-LAST:event_noVisibleMousePressed

    private void noVisibleMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noVisibleMouseReleased
        noVisible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/novisible.png")));
        txtContraseña.setEchoChar('•');  // Usa puntos
    }//GEN-LAST:event_noVisibleMouseReleased

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel descripcion;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel noVisible;
    private javax.swing.JLabel titulo;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JComboBox<String> txtDistrito;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
