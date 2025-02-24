package Interfaz;

import CadenaDeResponsabilidad.ValidadorFecha;
import CadenaDeResponsabilidad.ValidadorVacio;
import DAO.DAOactividadImplementacion;
import Interfaces.Validador;
import Main.WindowManager;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

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
        Text_Descripción = new javax.swing.JTextField();
        Button_SolicitarRevision = new javax.swing.JButton();
        Button_Cancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Text_Distrito = new javax.swing.JComboBox<>();
        Text_Fecha = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153), 3, true));

        jLabel1.setText("Proponer Actividad");

        jLabel2.setText("Título");

        jLabel3.setText("Distrito");

        jLabel4.setText("Fecha");

        jLabel6.setText("Descripción");

        Text_Titulo.setText(" ");

        Text_Descripción.setText(" ");

        Button_SolicitarRevision.setBackground(new java.awt.Color(0, 51, 153));
        Button_SolicitarRevision.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        Button_SolicitarRevision.setForeground(new java.awt.Color(255, 255, 255));
        Button_SolicitarRevision.setText("Soliciar Revision");
        Button_SolicitarRevision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SolicitarRevisionActionPerformed(evt);
            }
        });

        Button_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        Button_Cancelar.setBorder(null);
        Button_Cancelar.setBorderPainted(false);
        Button_Cancelar.setContentAreaFilled(false);
        Button_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CancelarActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo-principal.png"))); // NOI18N
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Text_Distrito.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        Text_Distrito.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Lima", "Ancón", "Ate", "Barranco", "Breña", "Carabayllo", "Chaclacayo", "Chorrilos", "Cieneguilla", "Comas", "El Agustino", "Independencia", "Jesús María", "La Molina", "La Victoria", "Lince", "Los Olivos", "Lurigancho-Chosica", "Lurín", "Magdalena del Mar", "Miraflores", "Pachacámac", "Pucusana", "Pueblo Libre", "Puente Piedra", "Punta Hermosa", "Punta Negra", "Rímac", "San Bartolo", "San Borja", "San Isidro", "San Juan de Lurigancho", "San Juan de Miraflores", "San Luis", "San Martín de Porres", "San Miguel", "Santa Anita", "Santa María del Mar", "Santa Rosa", "Santiago de Surco", "Surquillo", "Villa El Salvador", "Villa María del Triunfo", "Barranca", "Paramonga", "Pativilca", "Supe", "Supe Puerto", "Cajatambo", "Copa", "Gorgor", "Huancapón", "Manás", "Canta", "Arahuay", "Huamantanga", "Huaros", "Lachaqui", "San Buenaventura", "Santa Rosa de Quives", "San Vicente de Cañete", "Asia", "Calango", "Cerro Azul", "Chilca", "Coayllo", "Imperial", "Lunahuaná", "Mala", "Nuevo Imperial", "Pacarán", "Quilmaná", "San Antonio", "San Luis", "Santa Cruz de Flores", "Zúñiga", "Huaral", "Atavillos Alto", "Atavillos Bajo", "Aucallama", "Chancay", "Ihuarí", "Lampián", "Pacaraos", "San Miguel de Acos", "Santa Cruz de Andamarca", "Sumbilca", "Veintisiete de Noviembre", "Matucana", "Antioquía", "Callahuanca", "Carampoma", "Chicla", "Cuenca", "Huachupampa", "Huanza", "Huarochirí", "Lahuaytambo", "Langa", "Laraos", "Mariatana", "Ricardo Palma", "San Andrés de Tupicocha", "San Antonio de Chaclla", "San Bartolomé", "San Damián", "San Juan de Iris", "San Juan de Tantaranche", "San Lorenzo de Quinti", "San Mateo", "San Mateo de Otao", "San Pedro de Casta", "San Pedro de Huancayre", "Sangallaya", "Santa Cruz de Cocachacra", "Santa Eulalia", "Santiago de Anchucaya", "Santiago de Tuna", "Santo Domingo de los Olleros", "San Antonio de Chaclla", "Surco", "Huacho", "Ámbar", "Caleta de Carquín", "Checras", "Hualmay", "Huaura", "Leoncio Prado", "Paccho", "Santa Leonor", "Santa María", "Sayán", "Végueta", "Oyón", "Andajes", "Caujul", "Cochamarca", "Naván", "Pachangara", "Yauyos", "Alis", "Ayauca", "Ayaviri", "Azángaro", "Cacra", "Carania", "Catahuasi", "Chocos", "Cochas", "Colonia", "Hongos", "Huampará", "Huancaya", "Huangáscar", "Huantán", "Huáñec", "Laraos", "Lincha", "Madeán", "Miraflores", "Omas", "Putinza", "Quinches", "Quinocay", "San Joaquín", "San Pedro de Pilas", "Tanta", "Tauripampa", "Tomas", "Tupe", "Víñac", "Vitis" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Button_Cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Text_Descripción, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Text_Titulo)
                            .addComponent(Text_Distrito, 0, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(Button_SolicitarRevision)
                                .addGap(0, 95, Short.MAX_VALUE))
                            .addComponent(Text_Fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button_Cancelar)
                    .addComponent(jLabel5))
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Text_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(Text_Distrito, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(158, 158, 158))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Text_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(Text_Descripción, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(Button_SolicitarRevision)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            
            JTextField Distrito = new JTextField();
            String seleccionado = (String) Text_Distrito.getSelectedItem();
            Distrito.setText(seleccionado);
            
            JTextField Fecha = new JTextField();
            Date fechaSeleccionada =  Text_Fecha.getDate();
            
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            String fechaFormateada = formato.format(fechaSeleccionada);
                   
            validarTitulo.validar(Text_Titulo);
            validarDistrito.validar(Distrito);
            validarFechaVacia.validar(new JTextField(fechaFormateada));

            DAOactividadImplementacion actividadImpl = new DAOactividadImplementacion();
            Logica.Actividad actividad = new Logica.Actividad();
            
            actividad.setTitulo(Text_Titulo.getText().trim());
            actividad.setDistrito(Text_Distrito.getSelectedItem().toString().trim());
            actividad.setFecha(fechaFormateada);
            actividad.setDescripcion(Text_Descripción.getText().trim());
            actividad.setIdCliente(idUsuario);

            if (actividadImpl.Registrar(actividad) == true) {
                UIManager.put("Panel.background", Color.WHITE);
                UIManager.put("OptionPane.background", Color.WHITE);
                ImageIcon icono = new ImageIcon("src/Imagenes/enviado.gif"); // Ruta de la imagen
                JOptionPane.showMessageDialog(rootPane, "Actividad enviada a revisión!", "Solicitud enviada",JOptionPane.PLAIN_MESSAGE, icono);
                Text_Titulo.setText("");
                Text_Distrito.setSelectedIndex(0);
                Text_Fecha.setDate(null);
                Text_Descripción.setText("");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_Button_SolicitarRevisionActionPerformed

    private void Button_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CancelarActionPerformed
        Text_Titulo.setText("");
        Text_Distrito.setSelectedIndex(0);
        Text_Fecha.setDate(null);
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
    private javax.swing.JComboBox<String> Text_Distrito;
    private com.toedter.calendar.JDateChooser Text_Fecha;
    private javax.swing.JTextField Text_Titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
