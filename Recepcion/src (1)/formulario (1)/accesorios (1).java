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
 
public class accesorios extends javax.swing.JFrame {
  conexion  miconex = new conexion();
      javax.swing.table.DefaultTableModel cursor;// se crea el cursor     

   
    public accesorios() {
        initComponents();
        cursor = (javax.swing.table.DefaultTableModel)grilla_accesorios.getModel();      
        this.setLocationRelativeTo(null);//centrar 
        cargar_grilla();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tx_cod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jb_grabar = new javax.swing.JButton();
        tx_descri = new javax.swing.JTextField();
        jb_editar = new javax.swing.JButton();
        jb_borrar = new javax.swing.JButton();
        jb_agregar = new javax.swing.JButton();
        jb_cancelar = new javax.swing.JButton();
        jb_salir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        grilla_accesorios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tx_cod.setEnabled(false);
        tx_cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_codActionPerformed(evt);
            }
        });

        jLabel2.setText("DESCRIPCION");

        jLabel1.setText("CODIGO");

        jb_grabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficos/guardar.png"))); // NOI18N
        jb_grabar.setText("GRABAR");
        jb_grabar.setEnabled(false);
        jb_grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_grabarActionPerformed(evt);
            }
        });

        tx_descri.setEnabled(false);

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

        jb_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficos/cancelar.png"))); // NOI18N
        jb_cancelar.setText("CANCELAR");
        jb_cancelar.setEnabled(false);
        jb_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelarActionPerformed(evt);
            }
        });

        jb_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficos/salir1 (1).png"))); // NOI18N
        jb_salir.setText("SALIR");
        jb_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_salirActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setText("ACCESORIOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        grilla_accesorios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(grilla_accesorios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tx_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tx_descri, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jb_salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jb_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jb_borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jb_grabar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jb_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb_grabar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tx_cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                    .addGap(13, 13, 13)
                                    .addComponent(tx_descri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tx_codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_codActionPerformed
        buscar_cod();
    }//GEN-LAST:event_tx_codActionPerformed

    private void jb_grabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_grabarActionPerformed
        grabar();
        des_text();
        hab_botones();
        clear_text();
        cargar_grilla(); 
    }//GEN-LAST:event_jb_grabarActionPerformed

    private void jb_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelarActionPerformed
        des_text();
        hab_botones();
        clear_text();
    }//GEN-LAST:event_jb_cancelarActionPerformed

    private void jb_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salirActionPerformed
        dispose();
    }//GEN-LAST:event_jb_salirActionPerformed

    private void jb_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_editarActionPerformed
       operacion= "editar";
       
       des_botones();
        
       this.tx_cod.setEnabled(true);
       this.tx_cod.requestFocus();

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
       
       this.tx_cod.setEnabled(true);
       this.tx_cod.requestFocus();
    }//GEN-LAST:event_jb_borrarActionPerformed

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
            java.util.logging.Logger.getLogger(accesorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(accesorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(accesorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(accesorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new accesorios().setVisible(true);
            }
        });
    }
    //declarar mis variables
    //bandera para saber que operacion se esta realizando
      private String operacion= "";
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable grilla_accesorios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_agregar;
    private javax.swing.JButton jb_borrar;
    private javax.swing.JButton jb_cancelar;
    private javax.swing.JButton jb_editar;
    private javax.swing.JButton jb_grabar;
    private javax.swing.JButton jb_salir;
    private javax.swing.JTextField tx_cod;
    private javax.swing.JTextField tx_descri;
    // End of variables declaration//GEN-END:variables
private void hab_text()
{
     this.tx_descri.setEnabled(true);
     
     //habilta los demas text si hay
      this.tx_descri.requestFocus();
}
private void des_text()
{
     this.tx_descri.setEnabled(false);
     this.tx_cod.setEnabled(false);
}

private void des_botones()
{
     this.jb_grabar.setEnabled(true);
     this.jb_editar.setEnabled(false);
     this.jb_borrar.setEnabled(false);
     this.jb_agregar.setEnabled(false);
     this.jb_cancelar.setEnabled(true);
     this.jb_salir.setEnabled(false);
              
}

private void hab_botones()
{
     this.jb_grabar.setEnabled(false);
     this.jb_editar.setEnabled(true);
     this.jb_borrar.setEnabled(true);
     this.jb_agregar.setEnabled(true);
     this.jb_cancelar.setEnabled(false);
     this.jb_salir.setEnabled(true);
              
}

private void clear_text()
{
    tx_cod.setText("");
    tx_descri.setText(""); 
}
 private void generar_id()
   {     
       
        try 
        {
            miconex.sentencia = miconex.conexion.createStatement();
            miconex.resultado = miconex.sentencia.executeQuery("SELECT IFNULL(MAX(acc_id),0) + 1  AS nuevo FROM accesorios");
            
            //etraer los datos de la variable
            while(miconex.resultado.next()==true)
            {
                this.tx_cod.setText(miconex.resultado.getString("nuevo"));
            }
        } ///fin generar id
        catch (SQLException ex) {
            Logger.getLogger(accesorios.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   
   private void grabar()
   {    
       if(operacion.equals("agregar"))      
        try {
            miconex.sentencia = miconex.conexion.createStatement();
            miconex.sentencia.executeUpdate("INSERT INTO accesorios(acc_id,acc_descri) VALUES("+this.tx_cod.getText()+",'"+this.tx_descri.getText()+"')");
            
            JOptionPane.showMessageDialog(null, "El registro se ha insertado satisfactoriamente.", "CONFIRMACION", JOptionPane.INFORMATION_MESSAGE);         
        } catch (SQLException ex) {
            Logger.getLogger(accesorios.class.getName()).log(Level.SEVERE, null, ex);
        }
     
   
       //ENVIAR UPDATE
        if(operacion.equals("editar")) 
        { 
           try 
            {
                miconex.sentencia = miconex.conexion.createStatement();
                //miconex.sentencia.executeUpdate("UPDATE grupos SET gru_descri = '"+this.txt_nombre.getText()+"',con_cod="+this.txt_con_cod.getText()+" WHERE pai_cod ="+this.txt_cod.getText());
                miconex.sentencia.executeUpdate("UPDATE accesorios SET acc_descri = '"+this.tx_descri.getText()+"' WHERE acc_id ="+this.tx_cod.getText());

                JOptionPane.showMessageDialog(null, "El registro se ha modificado satisfactoriamente.", "CONFIRMACION", JOptionPane.INFORMATION_MESSAGE);
            } 
            catch (SQLException ex)
            {
                Logger.getLogger(accesorios.class.getName()).log(Level.SEVERE, null, ex);
            }           
        } // fin editar
   
   }
    private void buscar_cod()
    { 
        try {
            boolean encontro = false;
            
            miconex.sentencia = miconex.conexion.createStatement();
            miconex.resultado = miconex.sentencia.executeQuery("SELECT * FROM accesorios WHERE acc_id ="+this.tx_cod.getText());
            
            //etraer los datos de la variable
            while(miconex.resultado.next()==true)
            {
                this.tx_descri.setText(miconex.resultado.getString("acc_descri"));
                //aca los demas atributos
                //this.txt_con_cod.setText(miconex.resultado.getString("xxx"));
                    
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
                        miconex.sentencia.executeUpdate("DELETE FROM accesorios WHERE acc_id ="+this.tx_cod.getText());

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
                     this.tx_descri.setEnabled(true);
                     
                     
                     this.tx_descri.requestFocus();
                 }
            } 
            else
            {
                JOptionPane.showMessageDialog(null, "No existe un registro con este codigo!", "Atencion", JOptionPane.ERROR_MESSAGE);
                this.tx_cod.setText("");
                this.tx_cod.requestFocus();
            }      
        } catch (SQLException ex) {
            Logger.getLogger(accesorios.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    private void cargar_grilla()
   {
       limpiar_grilla();
       
       try 
        {
          miconex.sentencia = miconex.conexion.createStatement();
          miconex.resultado = miconex.sentencia.executeQuery("SELECT * FROM accesorios");
           //boolean encontro = false;
            
           //etraer los datos de la variable
           while(miconex.resultado.next()==true)
            {
               //tirar a la grilla 
                Object registro[] = new Object[] {miconex.resultado.getString("acc_id"),miconex.resultado.getString("acc_descri")};
                cursor.addRow(registro);
            }
            
        } catch (SQLException ex) 
        {
            Logger.getLogger(accesorios.class.getName()).log(Level.SEVERE, null, ex);
        }
   }// fin carga grilla

  private void limpiar_grilla()
   { 
     for (int posic = grilla_accesorios.getRowCount() -1; posic >= 0; posic--)
     {
          cursor.removeRow(posic);
     }  
   }// fin limpiar grilla   
   
    
}

