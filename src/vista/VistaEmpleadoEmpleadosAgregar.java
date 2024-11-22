/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

/**
 *
 * @author Renzo
 */
public class VistaEmpleadoEmpleadosAgregar extends javax.swing.JPanel {

    /**
     * Creates new form VistaEmpleadoSolicitudesLista
     */
    public VistaEmpleadoEmpleadosAgregar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jpRegistroEmpleados = new javax.swing.JPanel();
        labTituloEmpleado1 = new javax.swing.JLabel();
        pnlBody = new javax.swing.JPanel();
        pnlDatosPersonales = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        labSubTitulo5 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        pnlGrid = new javax.swing.JPanel();
        labNombre = new javax.swing.JLabel();
        labApellido = new javax.swing.JLabel();
        txtNombreRE = new javax.swing.JTextField();
        txtApellidoRE = new javax.swing.JTextField();
        labEmail = new javax.swing.JLabel();
        labTelefono = new javax.swing.JLabel();
        txtEmailRE = new javax.swing.JTextField();
        txtTelefonoRE = new javax.swing.JTextField();
        pnlDepartamento = new javax.swing.JPanel();
        labDepartamento = new javax.swing.JLabel();
        cbxDepartamentoRE = new javax.swing.JComboBox<>();
        pnlDatosCuenta = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        labSubTitulo6 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        pnlUsuario = new javax.swing.JPanel();
        labUsuario = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        txtUsuarioRE = new javax.swing.JTextField();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        btnAutoGenerarUsuario = new javax.swing.JButton();
        pnlGrid1 = new javax.swing.JPanel();
        labClave = new javax.swing.JLabel();
        labClaveRepetida = new javax.swing.JLabel();
        txtClaveRE = new javax.swing.JPasswordField();
        txtClaveRepetidaRE = new javax.swing.JPasswordField();
        chkVerClaveRE = new javax.swing.JCheckBox();
        chkVerClaveRepetidaRE = new javax.swing.JCheckBox();
        pnlBotonesEmpleadoRE = new javax.swing.JPanel();
        btnRegistrarRE = new javax.swing.JButton();
        btnLimpiarRE = new javax.swing.JButton();
        btnSalirRE = new javax.swing.JButton();

        jScrollPane1.setBorder(null);

        jpRegistroEmpleados.setMaximumSize(new java.awt.Dimension(2147483647, 400));
        jpRegistroEmpleados.setLayout(new java.awt.BorderLayout());

        labTituloEmpleado1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labTituloEmpleado1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTituloEmpleado1.setText("Registro de Empleado");
        labTituloEmpleado1.setPreferredSize(new java.awt.Dimension(168, 30));
        jpRegistroEmpleados.add(labTituloEmpleado1, java.awt.BorderLayout.PAGE_START);

        pnlBody.setLayout(new java.awt.BorderLayout(0, 20));

        pnlDatosPersonales.setLayout(new java.awt.CardLayout());

        jPanel8.setLayout(new java.awt.BorderLayout());

        labSubTitulo5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labSubTitulo5.setText("Datos Personales y Laborales");
        labSubTitulo5.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        labSubTitulo5.setMaximumSize(new java.awt.Dimension(198, 20));
        labSubTitulo5.setMinimumSize(new java.awt.Dimension(198, 20));
        labSubTitulo5.setPreferredSize(new java.awt.Dimension(198, 20));
        jPanel8.add(labSubTitulo5, java.awt.BorderLayout.PAGE_START);

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel13.setLayout(new java.awt.CardLayout(5, 5));

        jPanel9.setLayout(new java.awt.BorderLayout());

        pnlGrid.setLayout(new java.awt.GridLayout(4, 2, 10, 3));

        labNombre.setText("Nombres");
        pnlGrid.add(labNombre);

        labApellido.setText("Apellidos");
        pnlGrid.add(labApellido);
        pnlGrid.add(txtNombreRE);
        pnlGrid.add(txtApellidoRE);

        labEmail.setText("E-mail de contacto");
        pnlGrid.add(labEmail);

        labTelefono.setText("Teléfono móvil");
        pnlGrid.add(labTelefono);
        pnlGrid.add(txtEmailRE);
        pnlGrid.add(txtTelefonoRE);

        jPanel9.add(pnlGrid, java.awt.BorderLayout.PAGE_START);

        pnlDepartamento.setLayout(new java.awt.BorderLayout(0, 5));

        labDepartamento.setText("Departamento de la empresa");
        pnlDepartamento.add(labDepartamento, java.awt.BorderLayout.PAGE_START);

        cbxDepartamentoRE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Atención al Cliente", "Calidad", "Ventas", "Gerencia", "Contabilidad y Finanzas" }));
        pnlDepartamento.add(cbxDepartamentoRE, java.awt.BorderLayout.CENTER);

        jPanel9.add(pnlDepartamento, java.awt.BorderLayout.CENTER);

        jPanel13.add(jPanel9, "card2");

        jPanel8.add(jPanel13, java.awt.BorderLayout.CENTER);

        pnlDatosPersonales.add(jPanel8, "card2");

        pnlBody.add(pnlDatosPersonales, java.awt.BorderLayout.PAGE_START);

        pnlDatosCuenta.setPreferredSize(new java.awt.Dimension(393, 200));
        pnlDatosCuenta.setLayout(new java.awt.CardLayout());

        jPanel10.setLayout(new java.awt.BorderLayout());

        labSubTitulo6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labSubTitulo6.setText("Datos de la cuenta");
        labSubTitulo6.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        labSubTitulo6.setMaximumSize(new java.awt.Dimension(198, 20));
        labSubTitulo6.setMinimumSize(new java.awt.Dimension(198, 20));
        labSubTitulo6.setPreferredSize(new java.awt.Dimension(198, 20));
        jPanel10.add(labSubTitulo6, java.awt.BorderLayout.PAGE_START);

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel14.setPreferredSize(new java.awt.Dimension(383, 200));
        jPanel14.setLayout(new java.awt.CardLayout(5, 5));

        jPanel11.setLayout(new java.awt.BorderLayout());

        pnlUsuario.setLayout(new java.awt.BorderLayout(0, 5));

        labUsuario.setText("Nombre de Usuario");
        pnlUsuario.add(labUsuario, java.awt.BorderLayout.PAGE_START);

        jPanel12.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 5));

        txtUsuarioRE.setMinimumSize(new java.awt.Dimension(64, 30));
        txtUsuarioRE.setPreferredSize(new java.awt.Dimension(300, 30));
        jPanel12.add(txtUsuarioRE);
        jPanel12.add(filler8);

        btnAutoGenerarUsuario.setText("Autogenerar");
        jPanel12.add(btnAutoGenerarUsuario);

        pnlUsuario.add(jPanel12, java.awt.BorderLayout.CENTER);

        jPanel11.add(pnlUsuario, java.awt.BorderLayout.PAGE_START);

        pnlGrid1.setLayout(new java.awt.GridLayout(3, 2, 10, 3));

        labClave.setText("Contraseña");
        pnlGrid1.add(labClave);

        labClaveRepetida.setText("Repetir Contraseña");
        pnlGrid1.add(labClaveRepetida);
        pnlGrid1.add(txtClaveRE);
        pnlGrid1.add(txtClaveRepetidaRE);

        chkVerClaveRE.setText("Ver");
        chkVerClaveRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkVerClaveREActionPerformed(evt);
            }
        });
        pnlGrid1.add(chkVerClaveRE);

        chkVerClaveRepetidaRE.setText("Ver");
        chkVerClaveRepetidaRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkVerClaveRepetidaREActionPerformed(evt);
            }
        });
        pnlGrid1.add(chkVerClaveRepetidaRE);

        jPanel11.add(pnlGrid1, java.awt.BorderLayout.CENTER);

        jPanel14.add(jPanel11, "card2");

        jPanel10.add(jPanel14, java.awt.BorderLayout.CENTER);

        pnlDatosCuenta.add(jPanel10, "card2");

        pnlBody.add(pnlDatosCuenta, java.awt.BorderLayout.CENTER);

        jpRegistroEmpleados.add(pnlBody, java.awt.BorderLayout.CENTER);

        pnlBotonesEmpleadoRE.setPreferredSize(new java.awt.Dimension(82, 200));

        btnRegistrarRE.setText("Registrar");
        pnlBotonesEmpleadoRE.add(btnRegistrarRE);

        btnLimpiarRE.setText("Limpiar");
        pnlBotonesEmpleadoRE.add(btnLimpiarRE);

        btnSalirRE.setText("Salir");
        pnlBotonesEmpleadoRE.add(btnSalirRE);

        jpRegistroEmpleados.add(pnlBotonesEmpleadoRE, java.awt.BorderLayout.PAGE_END);

        jScrollPane1.setViewportView(jpRegistroEmpleados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void chkVerClaveREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkVerClaveREActionPerformed
        if (chkVerClaveRE.isSelected()) {
            txtClaveRE.setEchoChar((char) 0); //password = JPasswordField
        } else {
            txtClaveRE.setEchoChar('\u2022');
        }
    }//GEN-LAST:event_chkVerClaveREActionPerformed

    private void chkVerClaveRepetidaREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkVerClaveRepetidaREActionPerformed
        if (chkVerClaveRepetidaRE.isSelected()) {
            txtClaveRepetidaRE.setEchoChar((char) 0); //password = JPasswordField
        } else {
            txtClaveRepetidaRE.setEchoChar('\u2022');
        }
    }//GEN-LAST:event_chkVerClaveRepetidaREActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAutoGenerarUsuario;
    public javax.swing.JButton btnLimpiarRE;
    public javax.swing.JButton btnRegistrarRE;
    public javax.swing.JButton btnSalirRE;
    public javax.swing.JComboBox<String> cbxDepartamentoRE;
    public javax.swing.JCheckBox chkVerClaveRE;
    public javax.swing.JCheckBox chkVerClaveRepetidaRE;
    private javax.swing.Box.Filler filler8;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpRegistroEmpleados;
    private javax.swing.JLabel labApellido;
    private javax.swing.JLabel labClave;
    private javax.swing.JLabel labClaveRepetida;
    private javax.swing.JLabel labDepartamento;
    private javax.swing.JLabel labEmail;
    private javax.swing.JLabel labNombre;
    private javax.swing.JLabel labSubTitulo5;
    private javax.swing.JLabel labSubTitulo6;
    private javax.swing.JLabel labTelefono;
    private javax.swing.JLabel labTituloEmpleado1;
    private javax.swing.JLabel labUsuario;
    private javax.swing.JPanel pnlBody;
    private javax.swing.JPanel pnlBotonesEmpleadoRE;
    private javax.swing.JPanel pnlDatosCuenta;
    private javax.swing.JPanel pnlDatosPersonales;
    private javax.swing.JPanel pnlDepartamento;
    private javax.swing.JPanel pnlGrid;
    private javax.swing.JPanel pnlGrid1;
    private javax.swing.JPanel pnlUsuario;
    public javax.swing.JTextField txtApellidoRE;
    public javax.swing.JPasswordField txtClaveRE;
    public javax.swing.JPasswordField txtClaveRepetidaRE;
    public javax.swing.JTextField txtEmailRE;
    public javax.swing.JTextField txtNombreRE;
    public javax.swing.JTextField txtTelefonoRE;
    public javax.swing.JTextField txtUsuarioRE;
    // End of variables declaration//GEN-END:variables
}
