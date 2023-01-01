package formulario;

import java.sql.*;
import javax.swing.*;
import prgs.conexion;

// para reportes
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.*;
import net.sf.jasperreports.engine.util.JRLoader;
import java.util.HashMap;
import java.net.URL;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
//////

public class informes_sev extends javax.swing.JFrame
{
    conexion conn =new conexion();//instanciamos    
    public informes_sev() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        nuevo = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        consultar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        recepcion = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        desde = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        hasta = new com.toedter.calendar.JDateChooser();

        popupMenu1.setLabel("popupMenu1");

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("INFORMES REFERENCIALES");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("        INF. SERVICIOS FDO 2022");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nuevo.setText("ELEGIR");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        cancelar.setText("CANCELAR");
        cancelar.setEnabled(false);
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        consultar.setText("MOSTRAR");
        consultar.setEnabled(false);
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });

        salir.setText("SALIR");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(salir, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "INFORME DE RECEPCION"));

        recepcion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        recepcion.setText("Recepcion");
        recepcion.setEnabled(false);
        recepcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recepcionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(recepcion)
                .addContainerGap(159, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(recepcion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("DESDE:");

        desde.setDateFormatString("dd-MM-yyyy");
        desde.setEnabled(false);
        desde.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        desde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                desdeMousePressed(evt);
            }
        });
        desde.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                desdeKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("HASTA:");

        hasta.setDateFormatString("dd-MM-yyyy");
        hasta.setEnabled(false);
        hasta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        hasta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hastaMousePressed(evt);
            }
        });
        hasta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                hastaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(desde, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(hasta, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(170, 170, 170)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(desde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                            .addComponent(hasta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(119, 119, 119))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 278, Short.MAX_VALUE)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(546, 434));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        des_boton();
        habilitar_opciones();
    }//GEN-LAST:event_nuevoActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        hab_boton();
        cls_txt();
    }//GEN-LAST:event_cancelarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
          int mensaje = JOptionPane.showConfirmDialog(this,"¿Deseas salir?","Salida",JOptionPane.YES_NO_OPTION);

	   if(mensaje == JOptionPane.YES_OPTION)
	   {
	   	dispose();
	   }
    }//GEN-LAST:event_salirActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
       generarreporte();
       verificar_fecha_desde();
    }//GEN-LAST:event_consultarActionPerformed

    private void recepcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recepcionActionPerformed
        opcion="recepcion";   
    }//GEN-LAST:event_recepcionActionPerformed

    private void desdeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desdeMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_desdeMousePressed

    private void desdeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_desdeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_desdeKeyPressed

    private void hastaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hastaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_hastaMousePressed

    private void hastaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hastaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_hastaKeyPressed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new informes_sev().setVisible(true);
            }
        });
    }
    
     public String opcion="";
     public String nomreporte="";      
     //public ResultSet resu;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JButton consultar;
    private com.toedter.calendar.JDateChooser desde;
    private com.toedter.calendar.JDateChooser hasta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JButton nuevo;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JCheckBox recepcion;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables

   private void des_boton()
   {
        cancelar.setEnabled(true);
   	nuevo.setEnabled(false);
        consultar.setEnabled(true);
        salir.setEnabled(false);
   }

    private void hab_boton()
   {
        cancelar.setEnabled(false);
	nuevo.setEnabled(true);
        consultar.setEnabled(false);
        salir.setEnabled(true);
        
    }
      
   private void habilitar_opciones()
   {      
       this.recepcion.setEnabled(true);
       desde.setEnabled(true);
       hasta.setEnabled(true);
       
       
     }
    
   private void cls_txt()
   {
        this.recepcion.setSelected(false);
        this.recepcion.setEnabled(false);
        desde.setEnabled(false);
        hasta.setEnabled(false);
 
     }
public void generarreporte() 
{
   if(opcion.equals(""))
   {
        JOptionPane.showMessageDialog(null, "Debe Marcar Una De Las Opciones.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
   }
   else
   {    
        try 
        {  
              /////
               Calendar cal = Calendar.getInstance();

                cal.setTime(desde.getDate());
                int dia = cal.get(Calendar.DAY_OF_MONTH);
                int mes = cal.get(Calendar.MONTH) + 1;
                String sDia = "";
                String sMes = "";
                if (dia < 10) {
                    sDia = "0";
                }
                sDia += dia;
                if (mes < 10) {
                    sMes = "0";
                }
                sMes += mes;

                String fecha = cal.get(Calendar.YEAR) + "-" + sMes + "-" + sDia;
                
      /////////////////////////////////////////
                Calendar cale = Calendar.getInstance();
                cale.setTime(hasta.getDate());
                int dias = cale.get(Calendar.DAY_OF_MONTH);
                int mess = cale.get(Calendar.MONTH) + 1;
                String sDias = "";
                String sMess = "";
                if (dia < 10) {
                    sDias = "0";
                }
                sDias += dias;
                if (mess < 10) {
                    sMess = "0";
                }
                sMess += mess;
                String fecha2 = cale.get(Calendar.YEAR) + "-" + sMess + "-" + sDias;
            /////
                
            if(opcion.equals("recepcion"))//asignacion
            {
                conn.sentencia = conn.conexion.createStatement();
                //conn.resultado = conn.sentencia.executeQuery("SELECT * FROM ventas");//OJO LE PASO LA SENTENCIA
                conn.resultado = conn.sentencia.executeQuery("SELECT * FROM recepcion where rec_fecha BETWEEN '"+fecha+"' AND '"+fecha2+"'");//OJO LE PASO LA SENTENCIA
                nomreporte = "informes/informe_recepcion.jasper";              
            }
            
             
            JRResultSetDataSource jrRS = new JRResultSetDataSource(conn.resultado);
            HashMap parameters = new HashMap();
            //Map parameters = new HashMap();

            URL urlMaestro = getClass().getClassLoader().getResource(nomreporte);
            // Cargamos el reporte
            JasperReport masterReport = null;
            try {
                masterReport = (JasperReport) JRLoader.loadObject(urlMaestro);
            } catch (JRException ex) {
                Logger.getLogger(informes_sev.class.getName()).log(Level.SEVERE, null, ex);
            }
            JasperPrint masterPrint = null;
            try {
                masterPrint = JasperFillManager.fillReport(masterReport, parameters,jrRS);
            } catch (JRException ex) {
                Logger.getLogger(informes_sev.class.getName()).log(Level.SEVERE, null, ex);
            }

            JasperViewer ventana = new JasperViewer(masterPrint,false);
            ventana.setTitle("Vista Previa");
            ventana.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(informes_sev.class.getName()).log(Level.SEVERE, null, ex);
        }
   }       
}

////
private void verificar_fecha_desde()
{
           try {
                Calendar cal = Calendar.getInstance();
                cal.setTime(desde.getDate());
                int dia = cal.get(Calendar.DAY_OF_MONTH);
                int mes = cal.get(Calendar.MONTH) + 1;
                String sDia = "";
                String sMes = "";
                if (dia < 10) {
                    sDia = "0";
                }
                sDia += dia;
                if (mes < 10) {
                    sMes = "0";
                }
                sMes += mes;
                String fecha = cal.get(Calendar.YEAR) + "-" + sMes + "-" + sDia;
               /////////////////////////////////////////////////////////////////
                conexion conn =new conexion();//instanciamos
                conn.sentencia = conn.conexion.createStatement();
                conn.resultado = conn.sentencia.executeQuery("CALL validar_fecha(curdate(), '"+fecha+"')");

                boolean encontro = conn.resultado.next();
            if (encontro == true) {
            if (conn.resultado.getString("re").equals("falso")) 
            {

                JOptionPane.showMessageDialog(null, "La Fecha Desde No Puede Ser Mayor que la Actual", "Atencion", JOptionPane.INFORMATION_MESSAGE);

                } else {

                  verificar_fecha_hasta();

                }
            }else{
               JOptionPane.showMessageDialog(null, "No Esta Verificando", "Atencion", JOptionPane.INFORMATION_MESSAGE);
            }
            } catch (SQLException ex) {
                //Logger.getLogger(ciudad.class.getName()).log(Level.SEVERE, null, ex);
            }
}
     private void verificar_fecha_hasta()
     {
           try {
                Calendar cal = Calendar.getInstance();
                cal.setTime(hasta.getDate());
                int dia = cal.get(Calendar.DAY_OF_MONTH);
                int mes = cal.get(Calendar.MONTH) + 1;
                String sDia = "";
                String sMes = "";
                if (dia < 10) {
                    sDia = "0";
                }
                sDia += dia;
                if (mes < 10) {
                    sMes = "0";
                }
                sMes += mes;
                String fecha2 = cal.get(Calendar.YEAR) + "-" + sMes + "-" + sDia;

                conexion conn =new conexion();//instanciamos
                conn.sentencia = conn.conexion.createStatement();
                conn.resultado = conn.sentencia.executeQuery("CALL validar_fecha(curdate(), '"+fecha2+"')");

                boolean encontro = conn.resultado.next();
                if (encontro == true)
                {
                    if (conn.resultado.getString("re").equals("verdadero")) 
                    {
                        JOptionPane.showMessageDialog(null, "La Fecha Hasta No Puede Ser Mayor que la Actual", "Atencion", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                       verificar_fechas();
                    }
                }
                else
                {
                   JOptionPane.showMessageDialog(null, "No Esta Verificando", "Atencion", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            catch (SQLException ex) 
            {
                //Logger.getLogger(ciudad.class.getName()).log(Level.SEVERE, null, ex);
            }
      }
      private void verificar_fechas()
      {
           try {
                Calendar cal = Calendar.getInstance();
                cal.setTime(desde.getDate());
                int dia = cal.get(Calendar.DAY_OF_MONTH);
                int mes = cal.get(Calendar.MONTH) + 1;
                String sDia = "";
                String sMes = "";
                if (dia < 10) {
                    sDia = "0";
                }
                sDia += dia;
                if (mes < 10) {
                    sMes = "0";
                }
                sMes += mes;
                String fecha = cal.get(Calendar.YEAR) + "-" + sMes + "-" + sDia;
        ///////////////////////////////////////////////////////////////////////////
            cal.setTime(hasta.getDate());
            int dia1 = cal.get(Calendar.DAY_OF_MONTH);
            int mes1 = cal.get(Calendar.MONTH) + 1;
            String sDia1 = "";
            String sMes1 = "";
            if (dia1 < 10) {
                sDia1 = "0";
            }
            sDia1 += dia1;
            if (mes1 < 10) {
                sMes1 = "0";
            }
            sMes1 += mes1;
            String fecha2 = cal.get(Calendar.YEAR) + "-" + sMes1 + "-" + sDia1;

                conexion conn =new conexion();//instanciamos
                conn.sentencia = conn.conexion.createStatement();
                conn.resultado = conn.sentencia.executeQuery("CALL verificar_fecha('"+fecha2+"', '"+fecha+"')");

                boolean encontro = conn.resultado.next();
                if (encontro == true)
                {
                    if (conn.resultado.getString("re").equals("verdadero")) 
                    {
                      JOptionPane.showMessageDialog(null, "La Fecha Hasta No Puede Ser Menor que la Fecha Desde", "Atencion", JOptionPane.INFORMATION_MESSAGE);
                      
                    } 
                    else 
                    {
                          generarreporte();
                     }
                }
                else
                {
                   JOptionPane.showMessageDialog(null, "No Esta Verificando", "Atencion", JOptionPane.INFORMATION_MESSAGE);
                }
            } 
           catch (SQLException ex)
           {
                //Logger.getLogger(ciudad.class.getName()).log(Level.SEVERE, null, ex);
            }
      }
}
