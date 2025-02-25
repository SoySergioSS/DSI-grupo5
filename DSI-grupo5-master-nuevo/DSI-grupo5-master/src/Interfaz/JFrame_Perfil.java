package Interfaz;

import CadenaDeResponsabilidad.*;
import DAO.DAOclienteImplementacion;
import Interfaces.Validador;
import Main.WindowManager;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JFrame_Perfil extends javax.swing.JFrame {

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
                DAOclienteImplementacion clientImpl = new DAOclienteImplementacion();
                Logica.Cliente cliente = clientImpl.SeleccionarD(idUsuario);

                if (cliente != null) {
                    Text_Nombres.setText(cliente.getNombre());
                    Text_Usuario.setText(cliente.getUsuario());
                    Text_Correo.setText(cliente.getCorreo());
                    Text_Telefono.setText(cliente.getTelefono());

                    // Establecer el distrito en el JComboBox
                    Text_Distrito.setSelectedItem(cliente.getDistrito());

                    Text_Contraseña.setText(cliente.getPassword());
                } else {
                    System.out.println("No se encontró el usuario con ID: " + idUsuario);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }


    public JFrame_Perfil() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Button_Regresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Text_Correo = new javax.swing.JTextField();
        Text_Telefono = new javax.swing.JTextField();
        Text_Usuario = new javax.swing.JTextField();
        Text_Nombres = new javax.swing.JTextField();
        Button_Actualizar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Text_Distrito = new javax.swing.JComboBox<>();
        Text_Contraseña = new javax.swing.JPasswordField();
        noVisible = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153), 3, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(360, 480));

        Button_Regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        Button_Regresar.setBorder(null);
        Button_Regresar.setBorderPainted(false);
        Button_Regresar.setContentAreaFilled(false);
        Button_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_RegresarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel1.setText("Nombres");

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel2.setText("Usuario");

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel3.setText("Telefono");

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel4.setText("Distrito");

        jLabel5.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel5.setText("Correo");

        jLabel6.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel6.setText("Contraseña");

        Text_Correo.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        Text_Correo.setText(" ");
        Text_Correo.setPreferredSize(new java.awt.Dimension(166, 21));

        Text_Telefono.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        Text_Telefono.setText(" ");
        Text_Telefono.setPreferredSize(new java.awt.Dimension(166, 21));

        Text_Usuario.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        Text_Usuario.setText(" ");
        Text_Usuario.setPreferredSize(new java.awt.Dimension(166, 21));

        Text_Nombres.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        Text_Nombres.setText(" ");
        Text_Nombres.setPreferredSize(new java.awt.Dimension(166, 21));
        Text_Nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_NombresActionPerformed(evt);
            }
        });

        Button_Actualizar.setBackground(new java.awt.Color(0, 51, 153));
        Button_Actualizar.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        Button_Actualizar.setForeground(new java.awt.Color(255, 255, 255));
        Button_Actualizar.setText("Actualizar");
        Button_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ActualizarActionPerformed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario-cliente.png"))); // NOI18N
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Text_Distrito.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        Text_Distrito.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Lima", "Ancón", "Ate", "Barranco", "Breña", "Callao", "Carabayllo", "Chaclacayo", "Chorrilos", "Cieneguilla", "Comas", "El Agustino", "Independencia", "Jesús María", "La Molina", "La Victoria", "Lince", "Los Olivos", "Lurigancho-Chosica", "Lurín", "Magdalena del Mar", "Miraflores", "Pachacámac", "Pucusana", "Pueblo Libre", "Puente Piedra", "Punta Hermosa", "Punta Negra", "Rímac", "San Bartolo", "San Borja", "San Isidro", "San Juan de Lurigancho", "San Juan de Miraflores", "San Luis", "San Martín de Porres", "San Miguel", "Santa Anita", "Santa María del Mar", "Santa Rosa", "Santiago de Surco", "Surquillo", "Villa El Salvador", "Villa María del Triunfo", "Barranca", "Paramonga", "Pativilca", "Supe", "Supe Puerto", "Cajatambo", "Copa", "Gorgor", "Huancapón", "Manás", "Canta", "Arahuay", "Huamantanga", "Huaros", "Lachaqui", "San Buenaventura", "Santa Rosa de Quives", "San Vicente de Cañete", "Asia", "Calango", "Cerro Azul", "Chilca", "Coayllo", "Imperial", "Lunahuaná", "Mala", "Nuevo Imperial", "Pacarán", "Quilmaná", "San Antonio", "San Luis", "Santa Cruz de Flores", "Zúñiga", "Huaral", "Atavillos Alto", "Atavillos Bajo", "Aucallama", "Chancay", "Ihuarí", "Lampián", "Pacaraos", "San Miguel de Acos", "Santa Cruz de Andamarca", "Sumbilca", "Veintisiete de Noviembre", "Matucana", "Antioquía", "Callahuanca", "Carampoma", "Chicla", "Cuenca", "Huachupampa", "Huanza", "Huarochirí", "Lahuaytambo", "Langa", "Laraos", "Mariatana", "Ricardo Palma", "San Andrés de Tupicocha", "San Antonio de Chaclla", "San Bartolomé", "San Damián", "San Juan de Iris", "San Juan de Tantaranche", "San Lorenzo de Quinti", "San Mateo", "San Mateo de Otao", "San Pedro de Casta", "San Pedro de Huancayre", "Sangallaya", "Santa Cruz de Cocachacra", "Santa Eulalia", "Santiago de Anchucaya", "Santiago de Tuna", "Santo Domingo de los Olleros", "San Antonio de Chaclla", "Surco", "Huacho", "Ámbar", "Caleta de Carquín", "Checras", "Hualmay", "Huaura", "Leoncio Prado", "Paccho", "Santa Leonor", "Santa María", "Sayán", "Végueta", "Oyón", "Andajes", "Caujul", "Cochamarca", "Naván", "Pachangara", "Yauyos", "Alis", "Ayauca", "Ayaviri", "Azángaro", "Cacra", "Carania", "Catahuasi", "Chocos", "Cochas", "Colonia", "Hongos", "Huampará", "Huancaya", "Huangáscar", "Huantán", "Huáñec", "Laraos", "Lincha", "Madeán", "Miraflores", "Omas", "Putinza", "Quinches", "Quinocay", "San Joaquín", "San Pedro de Pilas", "Tanta", "Tauripampa", "Tomas", "Tupe", "Víñac", "Vitis" }));
        Text_Distrito.setMinimumSize(new java.awt.Dimension(64, 21));
        Text_Distrito.setPreferredSize(new java.awt.Dimension(166, 21));

        Text_Contraseña.setMinimumSize(new java.awt.Dimension(64, 21));
        Text_Contraseña.setPreferredSize(new java.awt.Dimension(166, 21));

        noVisible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/novisible.png"))); // NOI18N
        noVisible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                noVisibleMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                noVisibleMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Button_Regresar)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Button_Actualizar)
                            .addComponent(Text_Correo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Text_Telefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Text_Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Text_Nombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Text_Distrito, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Text_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noVisible)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(Button_Regresar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Text_Nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Text_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Text_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Text_Distrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Text_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Text_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(noVisible, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(Button_Actualizar)
                .addContainerGap(32, Short.MAX_VALUE))
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

    private void Button_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ActualizarActionPerformed
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
            String seleccionado = (String) Text_Distrito.getSelectedItem();
            Distrito.setText(seleccionado);
            validadorNombre.validar(Text_Nombres);
            validadorUser.validar(Text_Usuario);
            validadorCorreoVacio.validar(Text_Correo);
            validadorTelefonoVacio.validar(Text_Telefono);
            validadorDistritoVacio.validar(Distrito);
            validadorContraseñaVacio.validar(Text_Contraseña);
            
            Logica.Cliente cliente = new Logica.Cliente();
            cliente.setNombre(Text_Nombres.getText().trim());
            cliente.setUsuario(Text_Usuario.getText().trim());
            cliente.setCorreo(Text_Correo.getText().trim());
            cliente.setTelefono(Text_Telefono.getText().trim());

            // Obtener el distrito seleccionado del JComboBox
            cliente.setDistrito(Text_Distrito.getSelectedItem().toString().trim());

            cliente.setPassword(Text_Contraseña.getText().trim());
            cliente.setIdCliente(idUsuario);

            DAOclienteImplementacion clientImpl = new DAOclienteImplementacion();
            if (clientImpl.Modificar(cliente) == true) {
                JOptionPane.showMessageDialog(null, "Modificacion correcta");
                
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar usuario");
            }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_Button_ActualizarActionPerformed

    private void Button_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_RegresarActionPerformed
        Text_Nombres.setText("");
        Text_Usuario.setText("");
        Text_Correo.setText("");
        Text_Telefono.setText("");
        Text_Distrito.setSelectedItem(0);
        Text_Contraseña.setText("");
        WindowManager.showWindow("framePrincipal");
    }//GEN-LAST:event_Button_RegresarActionPerformed

    private void Text_NombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_NombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_NombresActionPerformed

    private void noVisibleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noVisibleMousePressed

        noVisible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/visible.png")));
        Text_Contraseña.setEchoChar((char)0);

    }//GEN-LAST:event_noVisibleMousePressed

    private void noVisibleMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noVisibleMouseReleased
        noVisible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/novisible.png")));
        Text_Contraseña.setEchoChar('•');  // Usa puntos
    }//GEN-LAST:event_noVisibleMouseReleased

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Perfil().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Actualizar;
    private javax.swing.JButton Button_Regresar;
    private javax.swing.JPasswordField Text_Contraseña;
    private javax.swing.JTextField Text_Correo;
    private javax.swing.JComboBox<String> Text_Distrito;
    private javax.swing.JTextField Text_Nombres;
    private javax.swing.JTextField Text_Telefono;
    private javax.swing.JTextField Text_Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel noVisible;
    // End of variables declaration//GEN-END:variables
}
