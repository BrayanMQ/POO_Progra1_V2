
package vista;

import control.Controlador;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Casillero;
import modelo.Cliente;
import modelo.Entregable;
import modelo.IConstants;
import modelo.TSexo;
import modelo.WebService.Cambio;
import vista.modificarCliente;

public class PantallaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PantallaPrincipal
     */
    public PantallaPrincipal() {
        initComponents();
        Cambio TipoCambio = new Cambio();
        lbl_Compra.setText("Compra: " + TipoCambio.getCompra());
        lbl_Venta.setText("Venta: " + TipoCambio.getVenta());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSPanelShadow1 = new rojeru_san.RSPanelShadow();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btn_registrarCliente = new rojeru_san.RSButtonRiple();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_recepcionArticulos = new rojeru_san.RSButtonRiple();
        btn_consultarCliente = new rojeru_san.RSButtonRiple();
        btn_modificarCliente = new rojeru_san.RSButtonRiple();
        btn_eliminarCliente = new rojeru_san.RSButtonRiple();
        btn_retiroArticulos = new rojeru_san.RSButtonRiple();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_Compra = new javax.swing.JLabel();
        lbl_Venta = new javax.swing.JLabel();
        menu_menuPrincipal = new javax.swing.JMenuBar();
        subMenu_clientes = new javax.swing.JMenu();
        menuItem_obtenerListaClienteConPendientes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 112, 192));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btn_registrarCliente.setText("Registrar Cliente");
        btn_registrarCliente.setFocusPainted(false);
        btn_registrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarClienteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 112, 192));
        jLabel2.setText("Clientes");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 112, 192));
        jLabel3.setText("Artículos");

        btn_recepcionArticulos.setText("Recepcion de Artículos");
        btn_recepcionArticulos.setFocusPainted(false);
        btn_recepcionArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_recepcionArticulosActionPerformed(evt);
            }
        });

        btn_consultarCliente.setText("Consultar Cliente");
        btn_consultarCliente.setFocusPainted(false);
        btn_consultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarClienteActionPerformed(evt);
            }
        });

        btn_modificarCliente.setText("Modificar Cliente");
        btn_modificarCliente.setFocusPainted(false);
        btn_modificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarClienteActionPerformed(evt);
            }
        });

        btn_eliminarCliente.setText("Eliminar Cliente");
        btn_eliminarCliente.setFocusPainted(false);
        btn_eliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarClienteActionPerformed(evt);
            }
        });

        btn_retiroArticulos.setText("Retiro de Artículos");
        btn_retiroArticulos.setFocusPainted(false);
        btn_retiroArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_retiroArticulosActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 112, 192));
        jLabel1.setText("Tipo de Cambio");

        lbl_Compra.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_Compra.setForeground(new java.awt.Color(0, 112, 192));
        lbl_Compra.setText("Compra:");

        lbl_Venta.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_Venta.setForeground(new java.awt.Color(0, 112, 192));
        lbl_Venta.setText("Venta:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lbl_Compra)
                    .addComponent(lbl_Venta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Compra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Venta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_registrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btn_modificarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_consultarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_recepcionArticulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(btn_retiroArticulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(btn_registrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_modificarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(btn_recepcionArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_retiroArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_consultarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_eliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        subMenu_clientes.setText("Clientes");

        menuItem_obtenerListaClienteConPendientes.setText("Lista de clientes con pendientes");
        menuItem_obtenerListaClienteConPendientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_obtenerListaClienteConPendientesActionPerformed(evt);
            }
        });
        subMenu_clientes.add(menuItem_obtenerListaClienteConPendientes);

        menu_menuPrincipal.add(subMenu_clientes);

        setJMenuBar(menu_menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItem_obtenerListaClienteConPendientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_obtenerListaClienteConPendientesActionPerformed

        ArrayList<Cliente> listaClientes = Controlador.getSingletonInstance().getCounter().getListaClientes();
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        for (Cliente cliente : listaClientes) {
            if (cliente.getCantidadEntregablesPendientes() != 0) {
                JOptionPane.showMessageDialog(this, "Identificador: " + cliente.getId()+ "\n" + 
                        "Nombre: " + cliente.getNombre() + "\n" + 
                        "Teléfono: " + cliente.getTelefono() + "\n" +
                        "Correo: " + cliente.getCorreo()+ "\n" +
                        "Cantidad de entregables pendientes: " + cliente.getCantidadEntregablesPendientes()+ "\n",
                        "Consultar cliente", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_menuItem_obtenerListaClienteConPendientesActionPerformed

    private void btn_registrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarClienteActionPerformed
        new registrarCliente(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_btn_registrarClienteActionPerformed

    private void btn_modificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarClienteActionPerformed
        String id = JOptionPane.showInputDialog(this, "Indique el identificador de la persona que desea modificar.", "Modificar cliente", JOptionPane.QUESTION_MESSAGE);

        if (id != null ) {//Si no le da al botón cancelar
             int index = Controlador.getSingletonInstance().getGestorCliente().buscarCliente(id);

            if (index >= 0) {
                Cliente cliente = Controlador.getSingletonInstance().getGestorCliente().consultarDatosCliente(index);
                new modificarCliente(this, rootPaneCheckingEnabled, cliente).setVisible(true);
            } else {

            JOptionPane.showMessageDialog(this, "No se ha encontrado el cliente con id " + id + ".", "Modificar cliente", JOptionPane.INFORMATION_MESSAGE);

            }
        }
    }//GEN-LAST:event_btn_modificarClienteActionPerformed

    private void btn_consultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarClienteActionPerformed
        String id = JOptionPane.showInputDialog(this, "Indique el identificador de la persona que desea consultar.", "Consultar cliente", JOptionPane.QUESTION_MESSAGE);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        if (id != null ) {//Si no le da al botón cancelar

            int index = Controlador.getSingletonInstance().getGestorCliente().buscarCliente(id);

            if (index >= 0) {
                Cliente cliente = Controlador.getSingletonInstance().getGestorCliente().consultarDatosCliente(index);
                JOptionPane.showMessageDialog(this, "Identificador: " + cliente.getId()+ "\n" + 
                        "Nombre: " + cliente.getNombre() + "\n" + 
                        "Correo: " + cliente.getCorreo()+ "\n" + 
                        "Teléfono: " + cliente.getTelefono() + "\n" +
                        "Dirección: " + cliente.getDireccion()+ "\n" +
                        "Sexo: " + cliente.getSexo().toString()+ "\n" +
                        "Fecha de nacimiento: " + formatter.format(cliente.getFechaNacimiento()), "Consultar cliente", JOptionPane.INFORMATION_MESSAGE);
            } else {

            JOptionPane.showMessageDialog(this, "No se ha encontrado el cliente con id " + id + ".", "Consultar cliente", JOptionPane.INFORMATION_MESSAGE);

            }

        }
    }//GEN-LAST:event_btn_consultarClienteActionPerformed

    private void btn_eliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarClienteActionPerformed
       String id = JOptionPane.showInputDialog(this, "Indique el identificador de la persona que desea eliminar.", "Eliminar cliente", JOptionPane.QUESTION_MESSAGE);

        if (id != null ) {//Si no le da al botón cancelar

            int index = Controlador.getSingletonInstance().getGestorCliente().buscarCliente(id);

            if (index >= 0) {
                Controlador.getSingletonInstance().getGestorCliente().eliminarCliente(id);
                JOptionPane.showMessageDialog(this, "Se ha eliminado con éxito al cliente con el id: " + id + ".", "Eliminar cliente", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No se ha encontrado el cliente con id " + id + ".", "Eliminar cliente", JOptionPane.INFORMATION_MESSAGE);
            }

        }
    }//GEN-LAST:event_btn_eliminarClienteActionPerformed

    private void btn_recepcionArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_recepcionArticulosActionPerformed
        String idCasillero = JOptionPane.showInputDialog(this, 
                    "Digite el número de casillero al que desea enviar el entregable.", 
                    "Registrar artículos", JOptionPane.QUESTION_MESSAGE);

            if (idCasillero != null) {//Si no le da al botón cancelar

                //Obtenermos el casillero
                Casillero casillero  = Controlador.getSingletonInstance().getGestorCasillero().buscarCasillero(idCasillero);

                if (casillero != null) { //Si el casillero no es nulo
                    Object opcion = JOptionPane.showInputDialog(null,"Selecciona un tipo "
                    + "de paquete", "Elegir tipo de paquete",
                    JOptionPane.QUESTION_MESSAGE,null,
                    IConstants.TIPOS_ENTREGABLE_COMBOBOX, 
                    IConstants.TIPOS_ENTREGABLE_COMBOBOX[0]);

                    if (opcion != null) { //Si no le da al botón cancelar

                        if (opcion.toString().equalsIgnoreCase("Sobre")) {
                            new crearSobre(this, rootPaneCheckingEnabled, casillero).setVisible(true);
                        } else if (opcion.toString().equalsIgnoreCase("Paquete")) {
                            new crearPaquete(this, rootPaneCheckingEnabled, casillero).setVisible(true);
                        } else if (opcion.toString().equalsIgnoreCase("Revista")) {
                            new crearRevista(this, rootPaneCheckingEnabled, casillero).setVisible(true);
                        } 
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "No se ha encontrado el casillero con id " + idCasillero + ".", "Recepción de artículos", JOptionPane.INFORMATION_MESSAGE);
                }
            }
    }//GEN-LAST:event_btn_recepcionArticulosActionPerformed

    private void btn_retiroArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_retiroArticulosActionPerformed
       String idCliente = JOptionPane.showInputDialog(this, 
                "Digite el identificador del cliente que desea buscar.", 
                "Retirar artículos", JOptionPane.QUESTION_MESSAGE);
        int index = Controlador.getSingletonInstance().getGestorCliente().buscarCliente(idCliente);

            if (index >= 0) {
                Cliente cliente = Controlador.getSingletonInstance().getGestorCliente().consultarDatosCliente(index);
                new retiroArticulos(this, rootPaneCheckingEnabled, cliente).setVisible(true);
            }else{
                JOptionPane.showMessageDialog(this, "No se ha encontrado el cliente con id " + idCliente + ".", "Retiro de artículos", JOptionPane.INFORMATION_MESSAGE);
            }
    }//GEN-LAST:event_btn_retiroArticulosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple btn_consultarCliente;
    private rojeru_san.RSButtonRiple btn_eliminarCliente;
    private rojeru_san.RSButtonRiple btn_modificarCliente;
    private rojeru_san.RSButtonRiple btn_recepcionArticulos;
    private rojeru_san.RSButtonRiple btn_registrarCliente;
    private rojeru_san.RSButtonRiple btn_retiroArticulos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_Compra;
    private javax.swing.JLabel lbl_Venta;
    private javax.swing.JMenuItem menuItem_obtenerListaClienteConPendientes;
    private javax.swing.JMenuBar menu_menuPrincipal;
    private rojeru_san.RSPanelShadow rSPanelShadow1;
    private javax.swing.JMenu subMenu_clientes;
    // End of variables declaration//GEN-END:variables
}
