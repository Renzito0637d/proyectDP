/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

/**
 *
 * @author Renzo
 */
public class VistaListaEmpleados extends javax.swing.JPanel {

    /**
     * Creates new form VistaListaEmpleados
     */
    public VistaListaEmpleados() {
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
        jpListaEmpleados = new javax.swing.JPanel();
        pnlHeadEmpleado = new javax.swing.JPanel();
        labTituloEmpleado = new javax.swing.JLabel();
        pnlBuscarUsuario2 = new javax.swing.JPanel();
        labBuscarUsuario2 = new javax.swing.JLabel();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 0), new java.awt.Dimension(55, 0), new java.awt.Dimension(15, 32767));
        txtBuscarUsuarioEmpleado = new javax.swing.JTextField();
        pnlBuscarDepartamento = new javax.swing.JPanel();
        labBuscarDepartamento = new javax.swing.JLabel();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        cbxBuscarDepartamento = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        btnBuscarEmpleado = new javax.swing.JButton();
        pnlTablaEmpleado = new javax.swing.JPanel();
        scrlTablaEmpleado = new javax.swing.JScrollPane();
        tbEmpleados = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        labInfo3 = new javax.swing.JLabel();
        labInfo4 = new javax.swing.JLabel();
        pnlBotonesEmpleado = new javax.swing.JPanel();
        btnSalirEmpleado = new javax.swing.JButton();

        jpListaEmpleados.setPreferredSize(new java.awt.Dimension(400, 500));
        jpListaEmpleados.setLayout(new java.awt.BorderLayout(5, 5));

        pnlHeadEmpleado.setPreferredSize(new java.awt.Dimension(193, 135));
        pnlHeadEmpleado.setLayout(new java.awt.GridLayout(4, 0, 0, 5));

        labTituloEmpleado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labTituloEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTituloEmpleado.setText("Listado de Empleados");
        labTituloEmpleado.setPreferredSize(new java.awt.Dimension(168, 20));
        pnlHeadEmpleado.add(labTituloEmpleado);

        pnlBuscarUsuario2.setPreferredSize(new java.awt.Dimension(200, 40));
        pnlBuscarUsuario2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        labBuscarUsuario2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labBuscarUsuario2.setText("Buscar por Usuario: ");
        pnlBuscarUsuario2.add(labBuscarUsuario2);
        pnlBuscarUsuario2.add(filler6);

        txtBuscarUsuarioEmpleado.setPreferredSize(new java.awt.Dimension(150, 35));
        pnlBuscarUsuario2.add(txtBuscarUsuarioEmpleado);

        pnlHeadEmpleado.add(pnlBuscarUsuario2);

        pnlBuscarDepartamento.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 3));

        labBuscarDepartamento.setText("Buscar por Departamento: ");
        pnlBuscarDepartamento.add(labBuscarDepartamento);
        pnlBuscarDepartamento.add(filler7);

        cbxBuscarDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Atención al Cliente", "Calidad", "Ventas", "Gerencia", "Contabilidad y Finanzas" }));
        pnlBuscarDepartamento.add(cbxBuscarDepartamento);

        pnlHeadEmpleado.add(pnlBuscarDepartamento);

        btnBuscarEmpleado.setText("BUSCAR");
        jPanel7.add(btnBuscarEmpleado);

        pnlHeadEmpleado.add(jPanel7);

        jpListaEmpleados.add(pnlHeadEmpleado, java.awt.BorderLayout.PAGE_START);

        pnlTablaEmpleado.setMaximumSize(new java.awt.Dimension(2147483647, 180));
        pnlTablaEmpleado.setPreferredSize(new java.awt.Dimension(579, 400));
        pnlTablaEmpleado.setRequestFocusEnabled(false);
        pnlTablaEmpleado.setLayout(new java.awt.BorderLayout());

        scrlTablaEmpleado.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrlTablaEmpleado.setMaximumSize(new java.awt.Dimension(32767, 370));
        scrlTablaEmpleado.setPreferredSize(new java.awt.Dimension(452, 300));

        tbEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Apellidos", "E-mail", "Teléfono", "Usuario", "Departamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbEmpleados.setMaximumSize(new java.awt.Dimension(450, 300));
        tbEmpleados.setPreferredSize(new java.awt.Dimension(450, 350));
        tbEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbEmpleadosMouseClicked(evt);
            }
        });
        scrlTablaEmpleado.setViewportView(tbEmpleados);

        pnlTablaEmpleado.add(scrlTablaEmpleado, java.awt.BorderLayout.PAGE_START);

        jPanel18.setLayout(new java.awt.GridLayout(2, 0));

        labInfo3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        labInfo3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labInfo3.setText("Seleccione una fila para eliminar al Empleado correspondiente.");
        labInfo3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        labInfo3.setMaximumSize(new java.awt.Dimension(411, 20));
        labInfo3.setPreferredSize(new java.awt.Dimension(411, 20));
        jPanel18.add(labInfo3);

        labInfo4.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        labInfo4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labInfo4.setText("NOTA: No puede eliminar empleados que han realizado alguna evaluación en el sistema");
        labInfo4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        labInfo4.setMaximumSize(new java.awt.Dimension(411, 20));
        labInfo4.setPreferredSize(new java.awt.Dimension(411, 20));
        jPanel18.add(labInfo4);

        pnlTablaEmpleado.add(jPanel18, java.awt.BorderLayout.PAGE_END);

        jpListaEmpleados.add(pnlTablaEmpleado, java.awt.BorderLayout.CENTER);

        pnlBotonesEmpleado.setPreferredSize(new java.awt.Dimension(82, 35));

        btnSalirEmpleado.setText("Salir");
        pnlBotonesEmpleado.add(btnSalirEmpleado);

        jpListaEmpleados.add(pnlBotonesEmpleado, java.awt.BorderLayout.PAGE_END);

        jScrollPane1.setViewportView(jpListaEmpleados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbEmpleadosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbEmpleadosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBuscarEmpleado;
    public javax.swing.JButton btnSalirEmpleado;
    public javax.swing.JComboBox<String> cbxBuscarDepartamento;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpListaEmpleados;
    private javax.swing.JLabel labBuscarDepartamento;
    private javax.swing.JLabel labBuscarUsuario2;
    private javax.swing.JLabel labInfo3;
    private javax.swing.JLabel labInfo4;
    private javax.swing.JLabel labTituloEmpleado;
    private javax.swing.JPanel pnlBotonesEmpleado;
    private javax.swing.JPanel pnlBuscarDepartamento;
    private javax.swing.JPanel pnlBuscarUsuario2;
    private javax.swing.JPanel pnlHeadEmpleado;
    private javax.swing.JPanel pnlTablaEmpleado;
    private javax.swing.JScrollPane scrlTablaEmpleado;
    public javax.swing.JTable tbEmpleados;
    public javax.swing.JTextField txtBuscarUsuarioEmpleado;
    // End of variables declaration//GEN-END:variables
}
