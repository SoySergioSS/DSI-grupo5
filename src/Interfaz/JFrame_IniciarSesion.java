package Interfaz;

import CadenaDeResponsabilidad.ValidadorVacio;
import DAO.DAOadministradorImplementacion;
import DAO.DAOclienteImplementacion;
import Interfaces.Validador;
import Main.WindowManager;
import java.awt.Color;
import javax.swing.JOptionPane;

public class JFrame_IniciarSesion extends javax.swing.JFrame {

    public JFrame_IniciarSesion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        background = new javax.swing.JPanel();
        jlblSesion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxtUsuario = new javax.swing.JTextField();
        jsptrUsuario = new javax.swing.JSeparator();
        jlblContraseña = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jtxtContraseña = new javax.swing.JPasswordField();
        jbtnEntrar = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setLocationByPlatform(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(440, 560));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblSesion.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jlblSesion.setText("INICIAR SESION");
        background.add(jlblSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel2.setText("USUARIO");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jtxtUsuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jtxtUsuario.setForeground(new java.awt.Color(204, 204, 204));
        jtxtUsuario.setText("Ingrese su nombre de usuario");
        jtxtUsuario.setBorder(null);
        jtxtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtxtUsuarioMousePressed(evt);
            }
        });
        jtxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtUsuarioActionPerformed(evt);
            }
        });
        background.add(jtxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 300, 30));
        background.add(jsptrUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 330, 10));

        jlblContraseña.setText("CONTRASEÑA");
        background.add(jlblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));
        background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 330, 10));

        jtxtContraseña.setForeground(new java.awt.Color(204, 204, 204));
        jtxtContraseña.setText("********");
        jtxtContraseña.setBorder(null);
        jtxtContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpwdContraseñaMousePressed(evt);
            }
        });
        background.add(jtxtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 330, 30));

        jbtnEntrar.setText("Iniciar Sesion");
        jbtnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEntrarActionPerformed(evt);
            }
        });
        background.add(jbtnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints( (440 - jbtnEntrar.getPreferredSize().width) / 2, 490, -1, -1));
        
        jbtnSalir.setText("Salir");
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });
        background.add(jbtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints( (440 - jbtnSalir.getPreferredSize().width) / 2, 530, -1, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo-EcoVida.png"))); // NOI18N
        jLabel3.setToolTipText("");
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 320, 290));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jbtnEntrarActionPerformed(java.awt.event.ActionEvent evt) {
        int[] idCliente = new int[1];
        int[] idAdministrador = new int[1];
        idCliente[0] = -1; //el id solo cambiara si el que inicia sesion es cliente
        idAdministrador[0] = -1;//el id solo cambiara si el que inicia sesion es administrador

        Validador validadorUser = new ValidadorVacio();
        Validador validadorPassword = new ValidadorVacio();

        try {
            validadorUser.validar(jtxtUsuario);
            validadorPassword.validar(jtxtContraseña);

            Logica.Usuario usuario = new Logica.Usuario();
            usuario.setUsuario(jtxtUsuario.getText().trim());
            usuario.setPassword(jtxtContraseña.getText().trim());

            DAOadministradorImplementacion adminImpl = new DAOadministradorImplementacion();

            if (adminImpl.Seleccionar(usuario) != -1) {
                idAdministrador[0] = adminImpl.Seleccionar(usuario);
                JOptionPane.showMessageDialog(null, "Bienvenido, administrador " + usuario.getUsuario());
                WindowManager.setIdUsuario(idAdministrador[0]);

                jtxtUsuario.setText("Ingrese su nombre de usuario");
                jtxtUsuario.setForeground(Color.gray);
                jtxtContraseña.setText("********");

                WindowManager.showWindow("framePrincipalAdministrador");
            } else {
                DAOclienteImplementacion clientImpl = new DAOclienteImplementacion();
                if (clientImpl.Seleccionar(usuario) != -1) {
                    idCliente[0] = clientImpl.Seleccionar(usuario);
                    JOptionPane.showMessageDialog(null, "Bienvenido, " + usuario.getUsuario());
                    WindowManager.setIdUsuario(idCliente[0]);

                    jtxtUsuario.setText("Ingrese su nombre de usuario");
                    jtxtUsuario.setForeground(Color.gray);
                    jtxtContraseña.setText("********");

                    WindowManager.showWindow("framePrincipal");
                } else {
                    throw new Exception("Usuario no registrado en el sistema");
                }
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }
    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {
    WindowManager.showWindow("frameInicioApp");

    }

    private void jpwdContraseñaMousePressed(java.awt.event.MouseEvent evt) {
        if (jtxtContraseña.getText().equals("********")) {
            jtxtContraseña.setText("");
        }

        if (jtxtUsuario.getText().isEmpty()) {
            jtxtUsuario.setText("Ingrese su nombre de usuario");
            jtxtUsuario.setForeground(Color.gray);
        }
    }

    private void jtxtUsuarioMousePressed(java.awt.event.MouseEvent evt) {
        if (jtxtUsuario.getText().equals("Ingrese su nombre de usuario")) {
            jtxtUsuario.setText("");
            jtxtUsuario.setForeground(Color.black);
        }
        if (jtxtContraseña.getText().isEmpty()) {
            jtxtContraseña.setText("********");
            jtxtContraseña.setForeground(Color.gray);
        }
    }

    private void jtxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame_IniciarSesion frame = new JFrame_IniciarSesion();
                frame.setVisible(true);
//                frame.toFront();  // Lleva la ventana al frente
//                frame.requestFocus(); // Asegura que reciba el foco
//                frame.setState(java.awt.Frame.NORMAL); // Restaura si está minimizado
//                frame.setAlwaysOnTop(true);
//                frame.setAlwaysOnTop(false); // Lo devuelve a su estado normal
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel background;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtnEntrar;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JLabel jlblContraseña;
    private javax.swing.JLabel jlblSesion;
    private javax.swing.JTextField jtxtContraseña;
    private javax.swing.JSeparator jsptrUsuario;
    private javax.swing.JTextField jtxtUsuario;
    // End of variables declaration                   
}
