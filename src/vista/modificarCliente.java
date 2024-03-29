/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.Controlador;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.TSexo;

/**
 *
 * @author dark1
 */
public class modificarCliente extends javax.swing.JDialog {
     private static Cliente cliente;
    /**
     * Creates new form modificarCliente
     */
    public modificarCliente(java.awt.Frame parent, boolean modal, Cliente cliente) {
        super(parent, modal);
        this.cliente = cliente;
        initComponents();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        txt_identificador.setText(String.valueOf(cliente.getId()));
        txt_nombre.setText(cliente.getNombre());
        txt_telefono.setText(String.valueOf(cliente.getTelefono()));
        txt_correo.setText(cliente.getCorreo());
        txt_direccion.setText(cliente.getDireccion());
        txt_fechaNacimiento.setText(formatter.format(cliente.getFechaNacimiento()));
        txt_identificador.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txt_correo = new rojeru_san.RSMTextFull();
        txt_telefono = new rojeru_san.RSMTextFull();
        txt_identificador = new rojeru_san.RSMTextFull();
        lbl_creacionCounter = new javax.swing.JLabel();
        txt_fechaNacimiento = new rojeru_san.RSMTextFull();
        txt_nombre = new rojeru_san.RSMTextFull();
        txt_direccion = new rojeru_san.RSMTextFull();
        cb_sexo = new rojerusan.RSComboMetro();
        lbl_error = new javax.swing.JLabel();
        btn_modificarCliente = new rojeru_san.RSButtonRiple();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 112, 192));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        txt_correo.setPlaceholder("correo@ejemplo.com");
        txt_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_correoActionPerformed(evt);
            }
        });

        txt_telefono.setPlaceholder("Teléfono");

        txt_identificador.setPlaceholder("Identificador");

        lbl_creacionCounter.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_creacionCounter.setForeground(new java.awt.Color(0, 112, 192));
        lbl_creacionCounter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_creacionCounter.setText("Modificar Cliente");

        txt_fechaNacimiento.setPlaceholder("dd/mm/yyyy");

        txt_nombre.setPlaceholder("Nombre");

        txt_direccion.setPlaceholder("Dirección");

        cb_sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino", "Otro", "Prefiero no especificar" }));

        btn_modificarCliente.setText("Modificar Cliente");
        btn_modificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_creacionCounter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_correo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_identificador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addComponent(cb_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(btn_modificarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lbl_creacionCounter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_identificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(cb_sexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_error, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_modificarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_correoActionPerformed

    private void btn_modificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarClienteActionPerformed

        boolean error = false;
        String mensajeError = "";
        lbl_error.setText("");
        ArrayList<String> listaDatos = new ArrayList<>();
        listaDatos.add(txt_correo.getText());
        listaDatos.add(txt_direccion.getText());
        listaDatos.add(txt_fechaNacimiento.getText());
        listaDatos.add(txt_identificador.getText());
        listaDatos.add(txt_nombre.getText());
        listaDatos.add(txt_telefono.getText());
        listaDatos.add((String)cb_sexo.getSelectedItem());
        
        if (!Controlador.getSingletonInstance().getGestorCliente().validarDatoVacio(listaDatos)) {
            mensajeError += "No se debe dejar espacios en blanco.\n";
            lbl_error.setText(mensajeError);
        }else{
        
            if (!Controlador.getSingletonInstance().validarDigitosEnteros(txt_identificador.getText())) {
                mensajeError += "El identificador debe ser un dígito mayor a 0.\n";
                lbl_error.setText(mensajeError);
                error = true;
            }
            if (!Controlador.getSingletonInstance().getGestorCliente().validarTelefono(txt_telefono.getText())) {
                mensajeError += "El teléfono debe contener 8 dígitos.\n";
                error = true;
            }
            if (!Controlador.getSingletonInstance().getGestorCliente().validarCorreo(txt_correo.getText())) {
                mensajeError += "El correo no es válido.\n";
                lbl_error.setText(mensajeError);
                error = true;
            }
            Date fechaNacimiento = Controlador.getSingletonInstance().getGestorCliente().validarFechaNacimiento(txt_fechaNacimiento.getText());
            if (fechaNacimiento == null) {
                mensajeError += "La fecha de nacimiento no es válida.\n";
                error = true;
            }


            if (!error) {
                Controlador.getSingletonInstance().getGestorCliente().modificarCliente(
                        txt_identificador.getText(), txt_nombre.getText(), txt_correo.getText(),
            txt_telefono.getText(), txt_direccion.getText(), (String)cb_sexo.getSelectedItem(), fechaNacimiento, cliente);
                JOptionPane.showMessageDialog(this, "Se ha modificado correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            }
        }
    }//GEN-LAST:event_btn_modificarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(modificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                modificarCliente dialog = new modificarCliente(new javax.swing.JFrame(), true, cliente);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple btn_modificarCliente;
    private rojerusan.RSComboMetro cb_sexo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_creacionCounter;
    private javax.swing.JLabel lbl_error;
    private rojeru_san.RSMTextFull txt_correo;
    private rojeru_san.RSMTextFull txt_direccion;
    private rojeru_san.RSMTextFull txt_fechaNacimiento;
    private rojeru_san.RSMTextFull txt_identificador;
    private rojeru_san.RSMTextFull txt_nombre;
    private rojeru_san.RSMTextFull txt_telefono;
    // End of variables declaration//GEN-END:variables
}
