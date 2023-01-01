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
import java.util.logging.Level;
import java.util.logging.Logger;
//////

public class informes_ref extends javax.swing.JFrame
{
    conexion conn =new conexion();//instanciamos    
    public informes_ref() 
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
        marcas = new javax.swing.JCheckBox();
        nacionalidad = new javax.swing.JCheckBox();
        color = new javax.swing.JCheckBox();
        camion = new javax.swing.JCheckBox();
        MODELOS = new javax.swing.JCheckBox();
        Accesorios = new javax.swing.JCheckBox();
        clientes = new javax.swing.JCheckBox();
        empleados = new javax.swing.JCheckBox();

        popupMenu1.setLabel("popupMenu1");

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("INFORMES REFERENCIALES");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("        INF. REFERENCIALES FDO 2022");
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

        marcas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        marcas.setText("MARCAS");
        marcas.setEnabled(false);
        marcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcasActionPerformed(evt);
            }
        });

        nacionalidad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nacionalidad.setText("NACIONALIDAD");
        nacionalidad.setEnabled(false);
        nacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nacionalidadActionPerformed(evt);
            }
        });

        color.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        color.setText("COLOR");
        color.setEnabled(false);
        color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorActionPerformed(evt);
            }
        });

        camion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        camion.setText("CAMION");
        camion.setEnabled(false);
        camion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camionActionPerformed(evt);
            }
        });

        MODELOS.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        MODELOS.setText("MODELOS");
        MODELOS.setEnabled(false);
        MODELOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MODELOSActionPerformed(evt);
            }
        });

        Accesorios.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Accesorios.setText("ACCESORIOS");
        Accesorios.setEnabled(false);
        Accesorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccesoriosActionPerformed(evt);
            }
        });

        clientes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        clientes.setText("CLIENTES");
        clientes.setEnabled(false);
        clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesActionPerformed(evt);
            }
        });

        empleados.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        empleados.setText("EMPLEADOS");
        empleados.setEnabled(false);
        empleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empleadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nacionalidad)
                    .addComponent(color)
                    .addComponent(marcas)
                    .addComponent(camion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                            .addComponent(clientes)
                            .addGap(24, 24, 24))
                        .addComponent(Accesorios, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(MODELOS))
                    .addComponent(empleados))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(marcas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nacionalidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(color))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(clientes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Accesorios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MODELOS)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(camion)
                    .addComponent(empleados))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(170, 170, 170)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addGap(51, 51, 51))
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
    }//GEN-LAST:event_consultarActionPerformed

    private void camionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camionActionPerformed
        opcion="camion";
        this.nacionalidad.setSelected(false);  
        this.color.setSelected(false);
        this.marcas.setSelected(false);
        this.MODELOS.setSelected(false);
        this.Accesorios.setSelected(false);
        this.clientes.setSelected(false);
        this.empleados.setSelected(false);
    }//GEN-LAST:event_camionActionPerformed

    private void colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorActionPerformed
        opcion="color";
        this.nacionalidad.setSelected(false);  
        this.marcas.setSelected(false);
        this.camion.setSelected(false);
        this.Accesorios.setSelected(false);
        this.MODELOS.setSelected(false);
        this.clientes.setSelected(false);
        this.MODELOS.setSelected(false);
        this.empleados.setSelected(false);
        
    }//GEN-LAST:event_colorActionPerformed

    private void nacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nacionalidadActionPerformed
        opcion="nacionalidad";
        this.marcas.setSelected(false);  
        this.color.setSelected(false);
        this.camion.setSelected(false);
        this.Accesorios.setSelected(false);
        this.MODELOS.setSelected(false);
        this.clientes.setSelected(false);
        this.empleados.setSelected(false);
    }//GEN-LAST:event_nacionalidadActionPerformed

    private void marcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcasActionPerformed
        opcion="marca";
        this.nacionalidad.setSelected(false);  
        this.color.setSelected(false);
        this.camion.setSelected(false);
        this.MODELOS.setSelected(false);
        this.Accesorios.setSelected(false);
        this.clientes.setSelected(false);
        this.empleados.setSelected(false);
    }//GEN-LAST:event_marcasActionPerformed

    private void MODELOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MODELOSActionPerformed
        opcion="modelo";
        this.nacionalidad.setSelected(false);  
        this.color.setSelected(false);
        this.camion.setSelected(false);
        this.Accesorios.setSelected(false);
        this.marcas.setSelected(false);
        this.clientes.setSelected(false);
        this.empleados.setSelected(false);
    }//GEN-LAST:event_MODELOSActionPerformed

    private void AccesoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccesoriosActionPerformed
        opcion="accesorios";
        this.nacionalidad.setSelected(false);  
        this.color.setSelected(false);
        this.camion.setSelected(false);
        this.marcas.setSelected(false);
        this.MODELOS.setSelected(false);
        this.clientes.setSelected(false);
        this.empleados.setSelected(false);
        
    }//GEN-LAST:event_AccesoriosActionPerformed

    private void clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesActionPerformed
         opcion="clientes";
        this.nacionalidad.setSelected(false);  
        this.color.setSelected(false);
        this.camion.setSelected(false);
        this.marcas.setSelected(false);
        this.MODELOS.setSelected(false);
        this.Accesorios.setSelected(false);
        this.empleados.setSelected(false);
    }//GEN-LAST:event_clientesActionPerformed

    private void empleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empleadosActionPerformed
         opcion="empleados";
        this.nacionalidad.setSelected(false);  
        this.color.setSelected(false);
        this.camion.setSelected(false);
        this.marcas.setSelected(false);
        this.MODELOS.setSelected(false);
        this.Accesorios.setSelected(false);
        this.clientes.setSelected(false);
    }//GEN-LAST:event_empleadosActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new informes_ref().setVisible(true);
            }
        });
    }
    
     public String opcion="";
     public String nomreporte="";      
     //public ResultSet resu;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Accesorios;
    private javax.swing.JCheckBox MODELOS;
    private javax.swing.JCheckBox camion;
    private javax.swing.JButton cancelar;
    private javax.swing.JCheckBox clientes;
    private javax.swing.JCheckBox color;
    private javax.swing.JButton consultar;
    private javax.swing.JCheckBox empleados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JCheckBox marcas;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JCheckBox nacionalidad;
    private javax.swing.JButton nuevo;
    private java.awt.PopupMenu popupMenu1;
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
       this.marcas.setEnabled(true);
       this.nacionalidad.setEnabled(true);
       this.color.setEnabled(true);
       this.camion.setEnabled(true);
       this.MODELOS.setEnabled(true);
       this.Accesorios.setEnabled(true);
       this.clientes.setEnabled(true);
       this.empleados.setEnabled(true);
       
       
     }
    
   private void cls_txt()
   {
        this.marcas.setSelected(false);
        this.nacionalidad.setSelected(false);
        this.color.setSelected(false);  
        this.camion.setSelected(false);  
        this.MODELOS.setSelected(false);  
        this.Accesorios.setSelected(false);  
        this.clientes.setSelected(false);  
        this.empleados.setSelected(false);  
        
        this.marcas.setEnabled(false);
        this.nacionalidad.setEnabled(false);    
        this.color.setEnabled(false);
        this.camion.setEnabled(false);
        this.MODELOS.setEnabled(false);
        this.Accesorios.setEnabled(false);
        this.empleados.setEnabled(false);
        this.clientes.setEnabled(false);
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
            if(opcion.equals("marca"))
            {
                conn.sentencia = conn.conexion.createStatement();
                conn.resultado = conn.sentencia.executeQuery("select * from marca");//OJO LE PASO LA SENTENCIA
                nomreporte = "informes/marcas.jasper";              
            }
            
            if(opcion.equals("nacionalidad"))
            {
                conn.sentencia = conn.conexion.createStatement();
                conn.resultado = conn.sentencia.executeQuery("select * from nacionalidad");//OJO LE PASO LA SENTENCIA
                nomreporte = "informes/nacionalidad.jasper";              
            }
            
             if(opcion.equals("color"))
            {
                conn.sentencia = conn.conexion.createStatement();
                conn.resultado = conn.sentencia.executeQuery("SELECT * FROM color");//OJO LE PASO LA SENTENCIA
                nomreporte = "informes/color.jasper";              
            }
            
            if(opcion.equals("camion"))
            {
                conn.sentencia = conn.conexion.createStatement();
                conn.resultado = conn.sentencia.executeQuery("SELECT * FROM camion");//OJO LE PASO LA SENTENCIA
                nomreporte = "informes/camion.jasper";              
            }
            if(opcion.equals("modelo"))
            {
                conn.sentencia = conn.conexion.createStatement();
                conn.resultado = conn.sentencia.executeQuery("select * from modelo");//OJO LE PASO LA SENTENCIA
                nomreporte = "informes/modelos.jasper";              
            }
            if(opcion.equals("accesorios"))
            {
                conn.sentencia = conn.conexion.createStatement();
                conn.resultado = conn.sentencia.executeQuery("select * from accesorios");//OJO LE PASO LA SENTENCIA
                nomreporte = "informes/accesorios.jasper";              
            }
               if(opcion.equals("clientes"))
            {
                conn.sentencia = conn.conexion.createStatement();
                conn.resultado = conn.sentencia.executeQuery("select * from cliente");//OJO LE PASO LA SENTENCIA
                nomreporte = "informes/clientes.jasper";              
            }
               if(opcion.equals("empleados"))
            {
                conn.sentencia = conn.conexion.createStatement();
                conn.resultado = conn.sentencia.executeQuery("select * from empleado_user");//OJO LE PASO LA SENTENCIA
                nomreporte = "informes/empleados.jasper";              
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
                Logger.getLogger(informes_ref.class.getName()).log(Level.SEVERE, null, ex);
            }
            JasperPrint masterPrint = null;
            try {
                masterPrint = JasperFillManager.fillReport(masterReport, parameters,jrRS);
            } catch (JRException ex) {
                Logger.getLogger(informes_ref.class.getName()).log(Level.SEVERE, null, ex);
            }

            JasperViewer ventana = new JasperViewer(masterPrint,false);
            ventana.setTitle("Vista Previa");
            ventana.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(informes_ref.class.getName()).log(Level.SEVERE, null, ex);
        }
   }       
}

}
