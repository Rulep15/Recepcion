/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import prgs.conexion;

/**
 *
 * @author utic
 */
public class empleado extends javax.swing.JFrame {
     conexion  miconex = new conexion();
       javax.swing.table.DefaultTableModel cursor;// se crea el cursor  

    public empleado() {
          initComponents();
        this.setLocationRelativeTo(null);
        cursor = (javax.swing.table.DefaultTableModel)grilla_empleado.getModel();      
        this.setLocationRelativeTo(null);//centrar 
        cargar_grilla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tx_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tx_codigo = new javax.swing.JTextField();
        tx_apellido = new javax.swing.JTextField();
        tx_ci = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tx_pass = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tx_user = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tx_nivel = new javax.swing.JTextField();
        jb_cancelar2 = new javax.swing.JButton();
        jb_salir = new javax.swing.JButton();
        jb_grabar = new javax.swing.JButton();
        jb_editar = new javax.swing.JButton();
        jb_borrar = new javax.swing.JButton();
        jb_agregar = new javax.swing.JButton();
        jb_estado = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        grilla_empleado = new javax.swing.JTable();
        combo_estado = new javax.swing.JComboBox<>();
        tx_estado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("CODIGO");

        tx_nombre.setEnabled(false);

        jLabel3.setText("APELLIDO");

        jLabel2.setText("NOMBRE");

        tx_codigo.setEnabled(false);
        tx_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_codigoActionPerformed(evt);
            }
        });

        tx_apellido.setEnabled(false);

        tx_ci.setEnabled(false);
        tx_ci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_ciActionPerformed(evt);
            }
        });

        jLabel4.setText("C.I");

        tx_pass.setEnabled(false);

        jLabel7.setText("USER");

        jLabel8.setText("PASS");

        tx_user.setEnabled(false);
        tx_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_userActionPerformed(evt);
            }
        });

        jLabel9.setText("NIVEL");

        tx_nivel.setEnabled(false);
        tx_nivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_nivelActionPerformed(evt);
            }
        });

        jb_cancelar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficos/cancelar.png"))); // NOI18N
        jb_cancelar2.setText("CANCELAR");
        jb_cancelar2.setEnabled(false);
        jb_cancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelar2ActionPerformed(evt);
            }
        });

        jb_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficos/salir1 (1).png"))); // NOI18N
        jb_salir.setText("SALIR");
        jb_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_salirActionPerformed(evt);
            }
        });

        jb_grabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficos/guardar.png"))); // NOI18N
        jb_grabar.setText("GRABAR");
        jb_grabar.setEnabled(false);
        jb_grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_grabarActionPerformed(evt);
            }
        });

        jb_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficos/editar.png"))); // NOI18N
        jb_editar.setText("EDITAR");
        jb_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_editarActionPerformed(evt);
            }
        });

        jb_borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficos/borrar.png"))); // NOI18N
        jb_borrar.setText("BORRAR");
        jb_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_borrarActionPerformed(evt);
            }
        });

        jb_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficos/agregar.png"))); // NOI18N
        jb_agregar.setText("AGREGAR");
        jb_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_agregarActionPerformed(evt);
            }
        });

        jb_estado.setText("ESTADO");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setText("EMPLEADOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(266, 266, 266))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        grilla_empleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "APELLIDO", "CI", "USER", "PASS", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(grilla_empleado);

        combo_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACTIVO", "INACTIVO", "BLOQUEADO" }));
        combo_estado.setEnabled(false);
        combo_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_estadoActionPerformed(evt);
            }
        });

        tx_estado.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tx_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tx_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tx_apellido, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tx_ci, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jb_estado))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tx_pass)
                            .addComponent(tx_user)
                            .addComponent(tx_nivel)
                            .addComponent(combo_estado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tx_estado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jb_cancelar2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jb_salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_grabar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jb_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_grabar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tx_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tx_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tx_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tx_ci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tx_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tx_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tx_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jb_estado)
                            .addComponent(combo_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tx_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jb_cancelar2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tx_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_codigoActionPerformed
        buscar_cod();
    }//GEN-LAST:event_tx_codigoActionPerformed

    private void tx_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_userActionPerformed

    private void tx_nivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_nivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_nivelActionPerformed

    private void tx_ciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_ciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_ciActionPerformed

    private void jb_cancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelar2ActionPerformed
        des_text();
        hab_botones();
        clear_text();
    }//GEN-LAST:event_jb_cancelar2ActionPerformed

    private void jb_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salirActionPerformed
        dispose();
    }//GEN-LAST:event_jb_salirActionPerformed

    private void jb_grabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_grabarActionPerformed
        grabar();
        des_text();
        hab_botones();
        clear_text();
        cargar_grilla();
    }//GEN-LAST:event_jb_grabarActionPerformed

    private void jb_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_editarActionPerformed
       operacion= "editar";
       
       des_botones();
        
       this.tx_codigo.setEnabled(true);
       this.tx_codigo.requestFocus();
    }//GEN-LAST:event_jb_editarActionPerformed

    private void jb_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_agregarActionPerformed
       operacion= "agregar";
       generar_id();
       hab_text();
       des_botones();
    }//GEN-LAST:event_jb_agregarActionPerformed

    private void jb_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_borrarActionPerformed
       operacion="borrar";
       
       des_botones();
       
       this.tx_codigo.setEnabled(true);
       this.tx_codigo.requestFocus();
    }//GEN-LAST:event_jb_borrarActionPerformed

    private void combo_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_estadoActionPerformed
        this.tx_estado.setText(this.combo_estado.getSelectedItem().toString());

        //
    }//GEN-LAST:event_combo_estadoActionPerformed

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
            java.util.logging.Logger.getLogger(empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new empleado().setVisible(true);
            }
        });
    }
    //declarar mis variables
    //bandera para saber que operacion se esta realizando
      private String operacion= "";
      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo_estado;
    private javax.swing.JTable grilla_empleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_agregar;
    private javax.swing.JButton jb_borrar;
    private javax.swing.JButton jb_cancelar2;
    private javax.swing.JButton jb_editar;
    private javax.swing.JLabel jb_estado;
    private javax.swing.JButton jb_grabar;
    private javax.swing.JButton jb_salir;
    private javax.swing.JTextField tx_apellido;
    private javax.swing.JTextField tx_ci;
    private javax.swing.JTextField tx_codigo;
    private javax.swing.JTextField tx_estado;
    private javax.swing.JTextField tx_nivel;
    private javax.swing.JTextField tx_nombre;
    private javax.swing.JTextField tx_pass;
    private javax.swing.JTextField tx_user;
    // End of variables declaration//GEN-END:variables
private void hab_text()
{
     this.tx_nombre.setEnabled(true);
     this.tx_apellido.setEnabled(true);
     this.tx_ci.setEnabled(true);
     this.tx_user.setEnabled(true);
     this.tx_pass.setEnabled(true);
     this.tx_nivel.setEnabled(true);
     this.tx_estado.setEnabled(false);
     this.combo_estado.setEnabled(true);
     //habilta los demas text si hay
     this.tx_nombre.requestFocus();
    
     
}
private void des_text()
{
     this.tx_nombre.setEnabled(false);
     this.tx_apellido.setEnabled(false);
     this.tx_ci.setEnabled(false);
     this.tx_user.setEnabled(false);
     this.tx_pass.setEnabled(false);
     this.tx_nivel.setEnabled(false);
     this.tx_codigo.setEnabled(false);
     this.tx_estado.setEnabled(false);
     this.combo_estado.setEnabled(false);
     
}

private void des_botones()
{
     this.jb_grabar.setEnabled(true);
     this.jb_editar.setEnabled(false);
     this.jb_borrar.setEnabled(false);
     this.jb_agregar.setEnabled(false);
     this.jb_cancelar2.setEnabled(true);
     this.jb_salir.setEnabled(false);
              
}

private void hab_botones()
{
     this.jb_grabar.setEnabled(false);
     this.jb_editar.setEnabled(true);
     this.jb_borrar.setEnabled(true);
     this.jb_agregar.setEnabled(true);
     this.jb_cancelar2.setEnabled(false);
     this.jb_salir.setEnabled(true);

     
              
}

private void clear_text()
{
    tx_codigo.setText("");
    tx_nombre.setText(""); 
    tx_apellido.setText(""); 
    tx_ci.setText(""); 
    tx_user.setText(""); 
    tx_pass.setText(""); 
    tx_nivel.setText(""); 
    tx_estado.setText(""); 
}
private void generar_id()
   {     
       
        try 
        {
            miconex.sentencia = miconex.conexion.createStatement();
            miconex.resultado = miconex.sentencia.executeQuery("SELECT IFNULL(MAX(emp_id),0) + 1  AS nuevo FROM empleado_user");
            
            //etraer los datos de la variable
            while(miconex.resultado.next()==true)
            {
                this.tx_codigo.setText(miconex.resultado.getString("nuevo"));
            }
        } ///fin generar id
        catch (SQLException ex) {
            Logger.getLogger(empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   
   private void grabar()
   {    if(operacion.equals("agregar"))           
        try {
            miconex.sentencia = miconex.conexion.createStatement();
            miconex.sentencia.executeUpdate("INSERT INTO empleado_user(emp_id,emp_nombre,emp_apellido,emp_CI,emp_user,emp_pass,emp_estado,emp_nivel)VALUES("+this.tx_codigo.getText()+",'"+this.tx_nombre.getText()+"','"+this.tx_apellido.getText()+"','"+this.tx_ci.getText()+"','"+this.tx_user.getText()+"','"+this.tx_pass.getText()+"','"+this.tx_estado.getText()+"',"+this.tx_nivel.getText()+")");
            
            JOptionPane.showMessageDialog(null, "El registro se ha insertado satisfactoriamente.", "CONFIRMACION", JOptionPane.INFORMATION_MESSAGE);         
        } catch (SQLException ex) {
            Logger.getLogger(empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
     //ENVIAR UPDATE
        if(operacion.equals("editar")) 
        { 
           try 
            {
                miconex.sentencia = miconex.conexion.createStatement();
                miconex.sentencia.executeUpdate("UPDATE empleado_user SET emp_nombre= '"+this.tx_nombre.getText()+"',emp_apellido='"+this.tx_apellido.getText()+"',emp_CI='"+this.tx_ci.getText()+"',emp_user='"+this.tx_user.getText()+"',emp_pass='"+this.tx_pass.getText()+"',emp_estado='"+this.tx_estado.getText()+"',emp_nivel="+this.tx_nivel.getText()+" WHERE emp_id ="+this.tx_codigo.getText());
                //miconex.sentencia.executeUpdate("UPDATE marca SET mar_descri = '"+this.tx_marca.getText()+"' WHERE mar_id ="+this.tx_codigo.getText());

                JOptionPane.showMessageDialog(null, "El registro se ha modificado satisfactoriamente.", "CONFIRMACION", JOptionPane.INFORMATION_MESSAGE);
            } 
            catch (SQLException ex)
            {
                Logger.getLogger(empleado.class.getName()).log(Level.SEVERE, null, ex);
            }           
        } // fin editar
   
   }
    private void buscar_cod()
    { 
        try {
            boolean encontro = false;
            
            miconex.sentencia = miconex.conexion.createStatement();
            miconex.resultado = miconex.sentencia.executeQuery("SELECT * FROM empleado_user WHERE emp_id ="+this.tx_codigo.getText());
            
            //etraer los datos de la variable
            while(miconex.resultado.next()==true)
            {
                this.tx_nombre.setText(miconex.resultado.getString("emp_nombre"));
                this.tx_apellido.setText(miconex.resultado.getString("emp_apellido"));
                this.tx_ci.setText(miconex.resultado.getString("emp_CI"));
                this.tx_user.setText(miconex.resultado.getString("emp_user"));
                this.tx_pass.setText(miconex.resultado.getString("emp_pass"));
                this.tx_nivel.setText(miconex.resultado.getString("emp_nivel"));
                this.tx_estado.setText(miconex.resultado.getString("emp_estado"));
                    
                encontro = true;
            }
            
            if(encontro==true)
            {
                if(operacion.equals("borrar"))
                {    
                    int respuesta = JOptionPane.showConfirmDialog(this,"Deseas Borrar el Registro?","Confirmar",JOptionPane.YES_NO_OPTION);
                    if(respuesta == JOptionPane.YES_OPTION)
                    {
                        //borrar
                        miconex.sentencia = miconex.conexion.createStatement();
                        miconex.sentencia.executeUpdate("DELETE FROM empleado_user WHERE emp_id ="+this.tx_codigo.getText());

                        JOptionPane.showMessageDialog(null, "El registro se ha borrado satisfactoriamente.", "Demosys", JOptionPane.INFORMATION_MESSAGE);

                        hab_botones();
                        des_text();
                        clear_text();
                        cargar_grilla();
                    }
                    else
                    {
                        hab_botones();
                        des_text();
                        clear_text();

                        //this.btn_cancelar.doClick();
                    }
                }// fin borrar    
                
                //caso de editar
                 if(operacion.equals("editar"))
                 { 
                      //habilitar los text
                     this.tx_nombre.setEnabled(true);
                     this.tx_apellido.setEnabled(true);
                     this.tx_ci.setEnabled(true);
                     this.tx_user.setEnabled(true);
                     this.tx_pass.setEnabled(true);
                     this.tx_nivel.setEnabled(true);
                     this.combo_estado.setEnabled(true);
                  
                     
                     
                     this.tx_nombre.requestFocus();
                 }
            } 
            else
            {
                JOptionPane.showMessageDialog(null, "No existe un registro con este codigo!", "Atencion", JOptionPane.ERROR_MESSAGE);
                this.tx_codigo.setText("");
                this.tx_codigo.requestFocus();
            }      
        } catch (SQLException ex) {
            Logger.getLogger(empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    private void cargar_grilla()
   {
       limpiar_grilla();
       
       try 
        {
          miconex.sentencia = miconex.conexion.createStatement();
          miconex.resultado = miconex.sentencia.executeQuery("SELECT * FROM empleado_user");
           //boolean encontro = false;
            
           //etraer los datos de la variable
           while(miconex.resultado.next()==true)
            {
               //tirar a la grilla 
               Object registro[] = new Object[] {miconex.resultado.getString("emp_id"),miconex.resultado.getString("emp_nombre"),miconex.resultado.getString("emp_apellido"),miconex.resultado.getString("emp_CI"),miconex.resultado.getString("emp_user"),miconex.resultado.getString("emp_pass"),miconex.resultado.getString("emp_estado"),miconex.resultado.getString("emp_nivel")};
               cursor.addRow(registro);
            }
            
        } catch (SQLException ex) 
        {
            Logger.getLogger(empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
   }// fin carga grilla

  private void limpiar_grilla()
   { 
     for (int posic = grilla_empleado.getRowCount() -1; posic >= 0; posic--)
     {
          cursor.removeRow(posic);
     }  
   }// fin limpiar grilla 
}


