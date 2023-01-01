package formulario;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.jvnet.substance.SubstanceLookAndFeel;
//import org.jvnet.substance.SubstanceLookAndFeel;


import prgs.conexion;


public class acceso extends javax.swing.JFrame {

   // conexion conn =new conexion();//instanciamos

   int movi = 0;
   int contador = 0;
   
   
    /** Creates new form Contrase */
    public acceso() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
          
        initComponents();   
        //menu.setDefaultLookAndFeelDecorated(true);
        //SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.GreenMagicSkin"); //GreenMagic
       
           this.setLocationRelativeTo(null);//centrar
     }

private void verificar_datos() 
    {
        try //throws IllegalAccessException,ClassNotFoundException,InstantiationException
        {
            String Contra_cargado_x_usuario = "";
            String Contra_de_bd = "";
            
            conexion conn =new conexion();//instanciamos
            conn.sentencia = conn.conexion.createStatement();
                        
            conn.resultado = conn.sentencia.executeQuery("select *,CURDATE() AS fechasistema from empleado_user WHERE emp_user = '" + txtUsuario.getText() + "'"); //OJO LE PASO LA SENTENCIA
            //conn.resultado.next();// ir al primer registro
            
            String  encontrouser = "no";
            
            while(conn.resultado.next()==true)
            {
                encontrouser = "si";  
              
                Contra_cargado_x_usuario = new String(JPContraseña.getPassword());// lo q cargo el operador
                Contra_de_bd = conn.resultado.getString("emp_pass");
            
                // variables que se van a usar en el menu principal       
                usunivel = conn.resultado.getString("emp_nivel");
                usunombre = conn.resultado.getString("emp_nombre");
                usuapellido = conn.resultado.getString("emp_apellido");
                fechasistema = conn.resultado.getString("fechasistema");
                usuestado = conn.resultado.getString("emp_estado");
                usucodigo = conn.resultado.getString("emp_id");
                
              
            }
            
            if (encontrouser.trim().equals("si"))
            {
                //preguntar si el usuario se encuentra activo
                if (!usuestado.trim().equals("ACTIVO"))
                    if (usuestado.trim().equals("BLOQUEADO"))
                    {
                        JOptionPane.showMessageDialog(null, "SU USUARIO SE ENCUENTRA BLOQUEADO.", "Acceso Denegado", JOptionPane.ERROR_MESSAGE);
                        System.exit(0);
                    }else
                    {
                        System.exit(0);
                    }else {
                   
                    if (Contra_cargado_x_usuario.trim().equals(Contra_de_bd.trim()))
                    {
                        new menu().setVisible(true);
                        this.setVisible(false);
                         
                    } else //mal el password
                    {
                        JOptionPane.showMessageDialog(null, "CONTRASEÑA INCORRECTA.");
                        contador++;

                        //System.out.println(contador);
                        if (contador == 3)
                        {
                            ///bloquear el usuario(update)
                            conn.sentencia.executeUpdate("UPDATE empleado_user SET emp_estado = 'BLOQUEADO' WHERE emp_user = '"+txtUsuario.getText()+"'");
                            JOptionPane.showMessageDialog(null, "SE HAN REALIZADO MUCHOS INTENTOS FALLIDOS DE INICIO DE SESIÓN.", "Atención", JOptionPane.WARNING_MESSAGE);
                            System.exit(0);
                        } else
                        {
                            JPContraseña.requestFocus();
                        }
                        Limpiar();
                    }//fin comparacion
                }
            }else 
            {
                JOptionPane.showMessageDialog(null, "USUARIO INCORRECTO");
                txtUsuario.requestFocus();
            }    
        } catch (SQLException ex) {
            Logger.getLogger(acceso.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
  

public void Limpiar()
{
    txtUsuario.setText("");
    JPContraseña.setText("");
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPContraseña = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        btnAcepta = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pas = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        host = new javax.swing.JTextField();
        bd = new javax.swing.JTextField();
        user = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ACCESO AL SISTEMA");
        setBounds(new java.awt.Rectangle(250, 300, 0, 0));

        JPContraseña.setText("123");
        JPContraseña.setEnabled(false);
        JPContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPContraseñaActionPerformed(evt);
            }
        });

        txtUsuario.setText("admin");
        txtUsuario.setEnabled(false);
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        btnAcepta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAcepta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficos/aceptar (1).png"))); // NOI18N
        btnAcepta.setText("ACEPTAR");
        btnAcepta.setEnabled(false);
        btnAcepta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptaActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficos/salir1 (1).png"))); // NOI18N
        btnCancelar.setText("SALIR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("LOGIN");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("PASSWORD");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("HOST --->");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("USER --->");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("B. D. --->");

        pas.setText("123");
        pas.setEnabled(false);
        pas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("PASS --->");

        host.setText("localhost");
        host.setEnabled(false);

        bd.setText("recepcion");
        bd.setEnabled(false);
        bd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdActionPerformed(evt);
            }
        });

        user.setText("root");
        user.setEnabled(false);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficos/conectar.png"))); // NOI18N
        jButton1.setText("CONECTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficos/Configuracion (1).png"))); // NOI18N
        jButton2.setText("Configuracion");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setForeground(new java.awt.Color(0, 51, 255));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel4.setText("ACCESO AL SISTEMA");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 408, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(175, 175, 175))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .add(jLabel4)
                .add(35, 35, 35))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficos/Mi proyecto.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .add(0, 0, Short.MAX_VALUE)
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 425, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 145, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(layout.createSequentialGroup()
                        .add(jLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 92, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(host))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 92, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel10)
                            .add(jLabel11))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, bd)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, pas)
                            .add(user, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 210, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(jButton2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 143, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 147, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(btnAcepta, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 122, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(36, 36, 36)
                        .add(btnCancelar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 129, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(layout.createSequentialGroup()
                                .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 64, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(46, 46, 46))
                            .add(layout.createSequentialGroup()
                                .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 92, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)))
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, txtUsuario)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, JPContraseña, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 176, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .add(31, 31, 31))
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(28, 28, 28)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jLabel7)
                            .add(host, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(21, 21, 21)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel8)
                            .add(user, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(21, 21, 21)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel10)
                            .add(bd, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel11)
                            .add(pas, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel5)
                            .add(layout.createSequentialGroup()
                                .add(txtUsuario, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(10, 10, 10)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(JPContraseña, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jLabel6))))
                        .add(28, 28, 28)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(btnAcepta, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(btnCancelar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 155, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JPContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JPContraseñaActionPerformed

    private void btnAceptaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptaActionPerformed

        verificar_datos();
    }//GEN-LAST:event_btnAceptaActionPerformed

    private void bdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bdActionPerformed

    private void pasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.host.setEnabled(true);
        this.user.setEnabled(true);
        this.bd.setEnabled(true);
        this.pas.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        vhost = this.host.getText();
        vuser = this.user.getText();
        vbd   = this.bd.getText();
        vpas  = new String(pas.getPassword());

        //instanciamos y pasamos los parametros
        conexion conn = new conexion();

        btnAcepta.setEnabled(true);
        JPContraseña.setEnabled(true);
        txtUsuario.setEnabled(true);
        txtUsuario.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // buscar usuario
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void hostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hostActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                   new acceso().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(acceso.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(acceso.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(acceso.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
  
  public static String usuapellido = "";
  public static String usunivel = "";
  public static String usunombre = "";
  public static String fechasistema = "";
  public static String usuestado = "";
  public static String usucodigo = "";
  
  public static String vhost,vuser,vbd,vpas;
  public static String inicial2 = "si";
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField JPContraseña;
    private javax.swing.JTextField bd;
    private javax.swing.JButton btnAcepta;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JTextField host;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField pas;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables

}
