/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

/**
 *
 * @author Renzo
 */
public class VistaEmpleadoClientesLista extends javax.swing.JPanel {

    /**
     * Creates new form VistaEmpleadoSolicitudesLista
     */
    public VistaEmpleadoClientesLista() {
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
        jpListaClientes = new javax.swing.JPanel();
        pnlHeadCliente = new javax.swing.JPanel();
        labTituloCliente = new javax.swing.JLabel();
        pnlBuscarUsuario1 = new javax.swing.JPanel();
        labBuscarUsuario1 = new javax.swing.JLabel();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 32767));
        txtBuscarUsuarioCliente = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        btnBuscarCliente = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();

        jScrollPane1.setBorder(null);

        jpListaClientes.setPreferredSize(new java.awt.Dimension(400, 500));
        jpListaClientes.setLayout(new java.awt.BorderLayout(5, 5));

        pnlHeadCliente.setPreferredSize(new java.awt.Dimension(193, 100));
        pnlHeadCliente.setLayout(new java.awt.GridLayout(3, 0, 0, 5));

        labTituloCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labTituloCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTituloCliente.setText("Listado de Clientes");
        labTituloCliente.setPreferredSize(new java.awt.Dimension(168, 20));
        pnlHeadCliente.add(labTituloCliente);

        pnlBuscarUsuario1.setPreferredSize(new java.awt.Dimension(200, 40));
        pnlBuscarUsuario1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        labBuscarUsuario1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labBuscarUsuario1.setText("Buscar por Usuario: ");
        pnlBuscarUsuario1.add(labBuscarUsuario1);
        pnlBuscarUsuario1.add(filler5);

        txtBuscarUsuarioCliente.setPreferredSize(new java.awt.Dimension(150, 35));
        pnlBuscarUsuario1.add(txtBuscarUsuarioCliente);

        pnlHeadCliente.add(pnlBuscarUsuario1);

        btnBuscarCliente.setText("BUSCAR");
        jPanel6.add(btnBuscarCliente);

        pnlHeadCliente.add(jPanel6);

        jpListaClientes.add(pnlHeadCliente, java.awt.BorderLayout.PAGE_START);

        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nómbres", "Apellidos", "E-mail", "Teléfono", "Usuario", "Dirreción"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbClientes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jpListaClientes.add(jPanel1, java.awt.BorderLayout.CENTER);

        jScrollPane1.setViewportView(jpListaClientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBuscarCliente;
    private javax.swing.Box.Filler filler5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpListaClientes;
    private javax.swing.JLabel labBuscarUsuario1;
    private javax.swing.JLabel labTituloCliente;
    private javax.swing.JPanel pnlBuscarUsuario1;
    private javax.swing.JPanel pnlHeadCliente;
    private javax.swing.JTable tbClientes;
    public javax.swing.JTextField txtBuscarUsuarioCliente;
    // End of variables declaration//GEN-END:variables
}
