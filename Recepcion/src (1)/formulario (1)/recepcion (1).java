package formulario;

//import form.buscadorgenerico;
import java.awt.event.KeyEvent;
import java.net.URL;
import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

import prgs.conexion;

public class recepcion extends javax.swing.JFrame
{
   conexion miconex =new conexion();

    public static int Bban=0;
    public String anular="";
    public String opcion="";
    public String fechacompra="";
    String Buscar;
    int facod;

    javax.swing.table.DefaultTableModel cursor;    
    public recepcion()
    {
        initComponents();
        this.usu_cod.setText(acceso.usucodigo); 
        this.Lusuario.setText(acceso.usunombre);
         
         

         //pers2.setText(acceso.usuwork);
         //pers1.setText(acceso.sucursal);

        cursor = (javax.swing.table.DefaultTableModel)grilla.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        grilla = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        acc_id = new javax.swing.JTextField();
        txt_acc = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txobs = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        num_recep = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        num = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        nuevo = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        grabar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        fun = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        cliente = new javax.swing.JLabel();
        cam_cod = new javax.swing.JTextField();
        camion = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Lusuario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        usu_cod = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        grilla.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        grilla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD", "ACCESORIOS", "CANTIDAD", "OBS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grilla.setGridColor(new java.awt.Color(153, 153, 153));
        grilla.setPreferredSize(new java.awt.Dimension(50, 224));
        grilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grillaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(grilla);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "ITEMS"));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("COD-ACC-F5:");

        acc_id.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        acc_id.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        acc_id.setEnabled(false);
        acc_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acc_idActionPerformed(evt);
            }
        });
        acc_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                acc_idKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                acc_idKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                acc_idKeyTyped(evt);
            }
        });

        txt_acc.setBackground(new java.awt.Color(240, 240, 240));
        txt_acc.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt_acc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_acc.setEnabled(false);
        txt_acc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_accActionPerformed(evt);
            }
        });
        txt_acc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_accKeyPressed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("CANT:");

        txtcantidad.setBackground(new java.awt.Color(240, 240, 240));
        txtcantidad.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtcantidad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtcantidad.setEnabled(false);
        txtcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidadActionPerformed(evt);
            }
        });
        txtcantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcantidadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcantidadKeyTyped(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("OBS:");

        txobs.setBackground(new java.awt.Color(240, 240, 240));
        txobs.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txobs.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txobs.setEnabled(false);
        txobs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txobsActionPerformed(evt);
            }
        });
        txobs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txobsKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txobsKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(acc_id, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_acc, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txobs))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(acc_id, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_acc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(txobs, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setText("Nº RECEPCION:");

        num_recep.setBackground(new java.awt.Color(240, 240, 240));
        num_recep.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        num_recep.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        num_recep.setEnabled(false);
        num_recep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_recepActionPerformed(evt);
            }
        });
        num_recep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                num_recepKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num_recepKeyTyped(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel34.setText("FECHA");

        num.setBackground(new java.awt.Color(240, 240, 240));
        num.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        num.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        num.setEnabled(false);
        num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformed(evt);
            }
        });
        num.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                numKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addGap(18, 18, 18)
                .addComponent(num_recep, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(num_recep, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 102, 102), null, null));

        nuevo.setText("AGREGAR");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        modificar.setText("ANULAR");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        cancelar.setText("CANCELAR");
        cancelar.setEnabled(false);
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        grabar.setText("GRABAR");
        grabar.setEnabled(false);
        grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grabarActionPerformed(evt);
            }
        });

        salir.setText("SALIR");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        borrar.setText("BORRAR ITEM");
        borrar.setEnabled(false);
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(grabar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grabar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(borrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("RECEPCION");
        jLabel2.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        fun.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        fun.setText("PRESIONE -TECLA FIN-- PARA GRABAR");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel27.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel27.setText("CAMION-F5:");

        cliente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cliente.setText("CLIENTE");

        cam_cod.setBackground(new java.awt.Color(240, 240, 240));
        cam_cod.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cam_cod.setToolTipText("escriba el codigo del cliente");
        cam_cod.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        cam_cod.setEnabled(false);
        cam_cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cam_codActionPerformed(evt);
            }
        });
        cam_cod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cam_codKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cam_codKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cam_codKeyTyped(evt);
            }
        });

        camion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        camion.setText("CAMION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addGap(18, 18, 18)
                .addComponent(cam_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(camion, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(cliente)
                    .addComponent(cam_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(camion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("USUARIO:");

        Lusuario.setBackground(new java.awt.Color(1, 1, 1));
        Lusuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Lusuario.setForeground(new java.awt.Color(1, 1, 1));
        Lusuario.setText("USUARIO");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("CODIGO");

        usu_cod.setBackground(new java.awt.Color(15, 15, 15));
        usu_cod.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        usu_cod.setForeground(new java.awt.Color(1, 1, 1));
        usu_cod.setText("USUARIO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(368, 368, 368)
                .addComponent(fun, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usu_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addGap(248, 248, 248))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(usu_cod)
                        .addComponent(jLabel3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(Lusuario)))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fun)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );

        setSize(new java.awt.Dimension(1217, 671));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_accActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_accActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txt_accActionPerformed

    private void txt_accKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_accKeyPressed

}//GEN-LAST:event_txt_accKeyPressed

    private void acc_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acc_idActionPerformed
      buscar_accesorios();
    }//GEN-LAST:event_acc_idActionPerformed

    private void acc_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_acc_idKeyPressed
    if(evt.getKeyCode()==116) // F5
        { // presiona F5
            JTextField[] tfParam = new JTextField[2];

            tfParam[0] = this.acc_id;
            tfParam[1] = this.txt_acc;

            String sql = "SELECT acc_id AS codigo,acc_descri AS Accesorios FROM accesorios WHERE  acc_descri like ";
            Buscador pp = new Buscador(sql , new String[]{"Codigo", "Accesorios"},2, tfParam);
            pp.setTitle("Buscar Accesorios");
            pp.setVisible(true);
        }
    if (evt.getKeyCode() == 35)//Fin
    {
         grabar.setEnabled(true);
    }

 //Bban = 0;
    }//GEN-LAST:event_acc_idKeyPressed

    private void acc_idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_acc_idKeyReleased
        // TODO add your handling code here:
}//GEN-LAST:event_acc_idKeyReleased

    private void txtcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadActionPerformed

    }//GEN-LAST:event_txtcantidadActionPerformed

    private void txtcantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidadKeyPressed

    }//GEN-LAST:event_txtcantidadKeyPressed

    private void num_recepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_recepActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_num_recepActionPerformed

    private void num_recepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num_recepKeyPressed
        
      

}//GEN-LAST:event_num_recepKeyPressed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        anular="NO";
        generacod();
        this.des_botones();

        cam_cod.setEnabled(true);
        cam_cod.requestFocus();
        
    }//GEN-LAST:event_nuevoActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
     cursor.removeRow(grilla.getSelectedRow());
     //caltotales();
     acc_id.requestFocus();
    }//GEN-LAST:event_borrarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        anular="SI";
        this.des_botones();
        num_recep.setEnabled(true);
        num_recep.requestFocus();
}//GEN-LAST:event_modificarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
                limpiar_text();
                cancelar();
                bloq_text();
}//GEN-LAST:event_cancelarActionPerformed

    private void grabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grabarActionPerformed
    int contar=grilla.getRowCount();
    if(contar>0)
    {
        grabar();
    }
    else
    {
        JOptionPane.showMessageDialog(this,"No puede grabar por que no ha cargado datos");
        acc_id.requestFocus();
    }
}//GEN-LAST:event_grabarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
      salir();
}//GEN-LAST:event_salirActionPerformed

    private void num_recepKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num_recepKeyTyped
char caracter = evt.getKeyChar();
      int k = (int) evt.getKeyChar();
        if(((caracter < '0') || (caracter > '9')) && (k!=10)&& (caracter != KeyEvent.VK_BACK_SPACE))
        {
        JOptionPane.showMessageDialog(null,"No Puede Ingresar Letras");
        evt.consume();
        }

      else
      {
         if(k == 10)
         {
//

            if(num_recep.getText().equals("")==false)
            {
                buscar_oc();
            }
            else
            {
                num_recep.setText("");
            }

         }
      }
}//GEN-LAST:event_num_recepKeyTyped

    private void txtcantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidadKeyTyped
char caracter = evt.getKeyChar();
      int k = (int) evt.getKeyChar();
        if(((caracter < '0') || (caracter > '9')) && (k!=10)&& (caracter != KeyEvent.VK_BACK_SPACE))
        {
        JOptionPane.showMessageDialog(null,"No Puede Ingresar Letras");
        evt.consume();
        }

      else
      {
         if(k == 10)
         {
//

            if(num_recep.getText().equals("")==false)
            {
                //buscar_oc();
            }
            else
            {
                num_recep.setText("");
            }

         }
      }
    }//GEN-LAST:event_txtcantidadKeyTyped

    private void grillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grillaMouseClicked
       habilitar_borrar();
       //caltotales();
    }//GEN-LAST:event_grillaMouseClicked

    private void fecha_compraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fecha_compraKeyPressed
         if (evt.getKeyCode() == 10)
         {

           if(anular.equals("SI"))
           {            
                num_recep.setEnabled(true);
                num_recep.requestFocus();
            }
           else
           {
                try
                {
                    verificar_fecha();
                } catch (ClassNotFoundException ex) {
                Logger.getLogger(recepcion.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                Logger.getLogger(recepcion.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                Logger.getLogger(recepcion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
         }
    }//GEN-LAST:event_fecha_compraKeyPressed

    private void numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_numActionPerformed

    private void numKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numKeyPressed


    }//GEN-LAST:event_numKeyPressed

    private void numKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numKeyTyped
       
}//GEN-LAST:event_numKeyTyped

    private void acc_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_acc_idKeyTyped
         char caracter = evt.getKeyChar();
      int k = (int) evt.getKeyChar();
        if(((caracter < '0') || (caracter > '9')) && (k!=10)&& (caracter != KeyEvent.VK_BACK_SPACE))
        {
        JOptionPane.showMessageDialog(null,"No Puede Ingresar Letras");
        evt.consume();
        }
    }//GEN-LAST:event_acc_idKeyTyped

    private void cam_codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cam_codActionPerformed
        buscar_camion();
    }//GEN-LAST:event_cam_codActionPerformed

    private void cam_codKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cam_codKeyPressed
      if(evt.getKeyCode()==116) // F5
        { // presiona F5
            JTextField[] tfParam = new JTextField[2];

            tfParam[0] = this.cam_cod;
            //tfParam[1] = this.proveedor_nombre1;

            String sql = "SELECT cam_id AS codigo, cam_chapa AS camion FROM camion WHERE  cam_chapa like ";
            Buscador pp = new Buscador(sql , new String[]{"Codigo", "Camion"},2, tfParam);
            pp.setTitle("Buscar Camion");
            pp.setVisible(true);
        }
    }//GEN-LAST:event_cam_codKeyPressed

    private void cam_codKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cam_codKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cam_codKeyReleased

    private void cam_codKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cam_codKeyTyped
         char caracter = evt.getKeyChar();
      int k = (int) evt.getKeyChar();
        if(((caracter < '0') || (caracter > '9')) && (k!=10)&& (caracter != KeyEvent.VK_BACK_SPACE))
        {
        JOptionPane.showMessageDialog(null,"No Puede Ingresar Letras");
        evt.consume();
        }
    }//GEN-LAST:event_cam_codKeyTyped

    private void txobsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txobsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txobsActionPerformed

    private void txobsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txobsKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txobsKeyPressed

    private void txobsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txobsKeyTyped
      char caracter = evt.getKeyChar();
      int k = (int) evt.getKeyChar();
        if (k > 47 && k < 58) 
    {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            getToolkit().beep();///el sonido del error
            evt.consume();////mantiene el pulsor al presionar espacio
            JOptionPane.showMessageDialog(null,"No puede Ingresar Numeros");
            txobs.requestFocus();
        }
        /*if(((caracter < '0') || (caracter > '9')) && (k!=10)&& (caracter != KeyEvent.VK_BACK_SPACE))
        {
            JOptionPane.showMessageDialog(null,"No puede Ingresar Letras");
            evt.consume();
        }
     else*/
      {
         if(k == 10)//enter
         {
            if(txtcantidad.getText().equals("")==false)
            {
                if(txtcantidad.getText().equals("0"))
                { 
                   JOptionPane.showMessageDialog(null,"No Puede Cargar Cero");
                   txtcantidad.requestFocus();  
                }
                else
                {
                    for(int a=0;a<grilla.getRowCount();a++)
                    {
                        if(acc_id.getText().equals(grilla.getValueAt(a,0).toString()))
                        {
                           cursor.removeRow(a);
                        }
                    }
                     try
                     {
                          cargarGrilladetalle();
                     } catch (Exception ex) {
                             Logger.getLogger(recepcion.class.getName()).log(Level.SEVERE, null, ex);
                     }
                     //caltotales();
                     //limpiar();
                     txtcantidad.setEnabled(false);
                     limpiar();
                     acc_id.setEnabled(true);
                     acc_id.requestFocus();
                 }
                
           }
           else
           {
              JOptionPane.showMessageDialog(null,"No Puede Dejar El Campo Vacio");
              txtcantidad.requestFocus();
           }
         }
     }
    }//GEN-LAST:event_txobsKeyTyped

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new recepcion().setVisible(true);
            }
        });
    }

   
     // public int total,totaliva5,totaliva10,ban,total_iva;
     // public String tipo="";
     // public String tiporeporte="";
     // public ResultSet resu;
     // public ResultSet rss;
     // public String estado="";      public String tipo="";
     // public String tiporeporte="";
     // public ResultSet resu;
     // public ResultSet rss;
     // public String estado="";
     // public String pedido="";
     // public String stock_actual="";
     // String valor="";


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lusuario;
    private javax.swing.JTextField acc_id;
    private javax.swing.JButton borrar;
    private javax.swing.JTextField cam_cod;
    private javax.swing.JLabel camion;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel cliente;
    private javax.swing.JLabel fun;
    private javax.swing.JButton grabar;
    private javax.swing.JTable grilla;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton modificar;
    private javax.swing.JButton nuevo;
    private javax.swing.JTextField num;
    private javax.swing.JTextField num_recep;
    private javax.swing.JButton salir;
    private javax.swing.JTextField txobs;
    private javax.swing.JTextField txt_acc;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JLabel usu_cod;
    // End of variables declaration//GEN-END:variables

 
   private void verificar_fecha()throws ClassNotFoundException, InstantiationException, IllegalAccessException{
           try
           {
               
               // String fecha = new SimpleDateFormat("yyyy-MM-dd").format(fecha_compra.getDate());
               // fechacompra=fecha;
    
                miconex.sentencia = miconex.conexion.createStatement();
              //  miconex.resultado = miconex.sentencia.executeQuery("CALL verfica_fecha('"+fecha+"', CURDATE())");
                boolean encontro = miconex.resultado.next();
                if (encontro == true)
                {
                   if (miconex.resultado.getString("re").equals("verdadero"))
                   {
                        //fecha_compra.setEnabled(false);
                        num_recep.setEnabled(true);
                        num_recep.requestFocus();
                   }
                   else
                   {
                       JOptionPane.showMessageDialog(null, "La Fecha Seleccionada No Correponde", "Atencion", JOptionPane.INFORMATION_MESSAGE);
                   }
                }
                else
                {
                   JOptionPane.showMessageDialog(null, "Fecha No es Valida", "Atencion", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(recepcion.class.getName()).log(Level.SEVERE, null, ex);
            }
      }
    

    /*public void cargar_combo_cuotas()throws Exception
    {

                    combocuot.removeAllItems();
                    String items[]=new String[]{"1"};
                    javax.swing.DefaultComboBoxModel jcbm= new javax.swing.DefaultComboBoxModel(items);
                    combocuot.setModel(jcbm);
                    combocuot.setEnabled(false);
    
}
public void cargar_combo_intervalo()throws Exception{

                    combointer.removeAllItems();
                    String items[]=new String[]{"0"};
                    javax.swing.DefaultComboBoxModel jcbm= new javax.swing.DefaultComboBoxModel(items);
                    combointer.setModel(jcbm);
                    combointer.setEnabled(false);

}*/

   

   /* private void caltotales()
    {
       int aux = 0;
       int acu = 0;
       int acu_iva5= 0;
       int acu_iva10= 0;
       int iva5 = 0;
       int iva10 = 0;
        for(int a=0;a<grilla.getRowCount();a++)
        {
               aux = Integer.parseInt(grilla.getValueAt(a,4).toString()) + Integer.parseInt(grilla.getValueAt(a,5).toString()) + Integer.parseInt(grilla.getValueAt(a,6).toString());
               acu = acu + aux;

               iva5 = (Integer.parseInt(grilla.getValueAt(a,5).toString())/21);
               acu_iva5 = acu_iva5 + iva5;

               iva10 = (Integer.parseInt(grilla.getValueAt(a,6).toString())/11);
               acu_iva10 = acu_iva10 + iva10;          
        }
       
         this.txttotal.setText(String.valueOf(acu));
         this.to_iva5.setText(String.valueOf(acu_iva5));
         this.grava.setText(String.valueOf(acu_iva10));

          //total iva
         total_iva = Integer.parseInt(to_iva5.getText()) + Integer.parseInt(grava.getText());
         this.totaliva.setText(String.valueOf(total_iva));
         habilitar_borrar();          
    }*/
   
    private void habilitar_borrar()
    {
     int b=grilla.getRowCount();
        {
     if(b>0){
         borrar.setEnabled(true);
     }else{
          borrar.setEnabled(false);
       }

 }
    }
    private void buscar_oc()
{
        try {
            int vcd = Integer.parseInt(num_recep.getText());
  //HACER
            miconex.sentencia = miconex.conexion.createStatement();
            String sql = "SELECT a.cli_id, CONCAT (a.cli_nombre, ' ',a.cli_apellido) AS Cliente, b.rec_estado, b.rec_fecha, c.cam_chapa, c.cam_id FROM cliente a, recepcion b, camion c WHERE a.cli_id= c.cli_id  AND b.cam_id=c.cam_id AND rec_id = " + vcd;
             
            miconex.resultado = miconex.sentencia.executeQuery(sql);
            boolean encontro = miconex.resultado.next();
            if (encontro == true)//encontro
            {
               if (miconex.resultado.getString("rec_estado").equals("PENDIENTE"))
               {
                    cam_cod.setText(miconex.resultado.getString("cam_id"));
                    camion.setText(miconex.resultado.getString("cam_chapa"));
                    cliente.setText(miconex.resultado.getString("Cliente"));
                    num.setText(miconex.resultado.getString("rec_fecha"));
                    
                            
                            try
                    {
                        limpiargrilla();
                        cargarGrilla();
                        num_recep.setEnabled(false);
                        anular();
                    }
                    catch (Exception ex)
                    {
                        Logger.getLogger(recepcion.class.getName()).log(Level.SEVERE, null, ex);
                    }
              }//fin pendiente

              if (miconex.resultado.getString("rec_estado").equals("ANULADO"))
              {
                    JOptionPane.showMessageDialog(null, "Esta Recepcion fue Anulada", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
                    num_recep.setEnabled(true);
                    num_recep.requestFocus();
              }
              if (miconex.resultado.getString("rec_estado").equals("CANCELADO"))
              {
                  JOptionPane.showMessageDialog(null, "Este Numero de Recepcion fue cancelado", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
                  num_recep.setEnabled(true);
                  num_recep.requestFocus();
              }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Numero de Recepcion No Existe", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);

                num_recep.setEnabled(true);
                num_recep.requestFocus();
            }
        } catch (SQLException ex)
        {
            Logger.getLogger(recepcion.class.getName()).log(Level.SEVERE, null, ex);
        }

 }
    public void cargarGrilla()throws Exception
    {
    try
    {
        conexion miconex1 =new conexion();
        miconex1.sentencia = miconex1.conexion.createStatement();
         String consultaSQL=("SELECT a.acc_id, b.acc_descri, a.dr_obs, a.dr_cantidad FROM detalle_recepcion a, accesorios b WHERE a.acc_id = b.acc_id AND a.rec_id= "+num_recep.getText());
         miconex1.resultado =miconex1.sentencia.executeQuery(consultaSQL);
         while ( miconex1.resultado.next())
         {
              
                  Object datos[] = new Object[] {miconex1.resultado.getString("acc_id"), miconex1.resultado.getString("acc_descri"), miconex1.resultado.getString("dr_cantidad"), miconex1.resultado.getString("dr_obs"),true};
                  cursor.addRow(datos);
  
                  //String consultaSQL=("SELECT b.mat_cod,concat(a.tm_descri, ' ', b.mat_descri) AS descripcion, c.mat_cant, c.mat_preuni FROM detalle_pres c, tipo_mat a, material b WHERE c.mat_cod = b.mat_cod AND a.tm_cod = b.tm_cod AND c.pres_nro="+txt_nro.getText());

         }
    
          //caltotales();
         }
        catch (SQLException ex)
        {
            javax.swing.JDialog.setDefaultLookAndFeelDecorated(true);
            javax.swing.JOptionPane.showMessageDialog(this,ex.getMessage(),
            "Aviso",javax.swing.JOptionPane.INFORMATION_MESSAGE);
         }
 }
public void cargarGrilladetalle()throws Exception{
        try{
         miconex.sentencia = miconex.conexion.createStatement();
        
         miconex.sentencia = miconex.conexion.createStatement();
         String consultaSQL=("select * from accesorios where acc_id= "+acc_id.getText());
         miconex.resultado = miconex.sentencia.executeQuery(consultaSQL);

         Object datos[] = new Object[] {acc_id.getText(),txt_acc.getText(),txtcantidad.getText(),txobs.getText(),true};
         cursor.addRow(datos);
            
  
           // caltotales();
         }catch (SQLException ex){
            javax.swing.JDialog.setDefaultLookAndFeelDecorated(true);
            javax.swing.JOptionPane.showMessageDialog(this,ex.getMessage(),
            "Aviso",javax.swing.JOptionPane.INFORMATION_MESSAGE);
         }
 }

  
    private void salir()
	{
	   int mensaje = JOptionPane.showConfirmDialog(this,"¿Deseas salir?","Salida",JOptionPane.YES_NO_OPTION);

	   if(mensaje == JOptionPane.YES_OPTION)
	   {
	   	//System.exit(0);
	   	dispose();
	   }
	}

 

 
     //private void habilitar_condicion()
	/*{
	    credito.setEnabled(true);
            contado.setEnabled(true);
            combocuot.setEnabled(false);
            combointer.setEnabled(false);
	}*/
  
    
  
private void generacod()
{
        try
        {
                miconex.sentencia = miconex.conexion.createStatement();
                miconex.resultado = miconex.sentencia.executeQuery("SELECT IFNULL(MAX(rec_id),0)+1 AS newcod,curdate() as fecha FROM recepcion");
                miconex.resultado.next();
                num_recep.setText(miconex.resultado.getString("newcod"));
                num.setText(miconex.resultado.getString("fecha"));
        }
        catch (SQLException exceptionSql)
        {
                JOptionPane.showMessageDialog(null, exceptionSql.getMessage(), "Error de Conexion con la Base de Datos", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
        }
}//fin generar

  private void limpiar_text()
{
          // fecha_compra.setCalendar(null);
           cam_cod.setText("");
           camion.setText("");
           cliente.setText("");
           num_recep.setText("");
           num.setText("");
           txtcantidad.setText("");
           acc_id.setText("");
           txt_acc.setText("");
           txobs.setText("");
         //  fecha_compra.setCalendar(null);
           num.setText("");
           
           for (int i = grilla.getRowCount() -1; i >= 0; i--)
           {
               cursor.removeRow(i);
            }
         

 }
private void limpiar()
{

           acc_id.setText("");
           txt_acc.setText("");
           txobs.setText("");
           txtcantidad.setText("");
//           stock.setText("");


 }

    private void cancelar()
{
           anular="";
           nuevo.setEnabled(true);
           modificar.setEnabled(true);
           borrar.setEnabled(false);
           cancelar.setEnabled(false);
           grabar.setEnabled(false);
           salir.setEnabled(true);
           
           nuevo.requestFocus();
           //fecha_compra.setEnabled(false);
           cam_cod.setEnabled(false);
           num_recep.setEnabled(false);
           num.setEnabled(false);
           txobs.setEnabled(false);
           
           acc_id.setEnabled(false);

           for (int i = grilla.getRowCount() -1; i >= 0; i--)
           {
               cursor.removeRow(i);
           }
}
     private void limpiargrilla()
{
       for (int i = grilla.getRowCount() -1; i >= 0; i--)
       {
           cursor.removeRow(i);
       }
}





 private void anular()
 {
              //  String fecha = new SimpleDateFormat("yyyy-MM-dd").format(fecha_compra.getDate());
                //fechacompra=fecha;

                javax.swing.JDialog.setDefaultLookAndFeelDecorated(true);
                int resp = javax.swing.JOptionPane.showOptionDialog(this,
                "Desea Anular La Recepción?",
                "Aviso",javax.swing.JOptionPane.OK_CANCEL_OPTION,
                javax.swing.JOptionPane.WARNING_MESSAGE,null,

                new Object[] { "Si", "No"},"Si");
                if (resp == javax.swing.JOptionPane.OK_OPTION)
                {
                    try
                    {
                        miconex.sentencia = miconex.conexion.createStatement();
                        miconex.sentencia.executeUpdate("UPDATE recepcion SET rec_estado = 'ANULADO' WHERE rec_id = "+num_recep.getText());

                        JOptionPane.showMessageDialog(null, "La Recepcion Ha Sido Anulada", "Atencion", JOptionPane.ERROR_MESSAGE);
                        this.cancelar.doClick();
                        } catch (SQLException ex) {
                            Logger.getLogger(recepcion.class.getName()).log(Level.SEVERE, null, ex);
                        }
                }//finsi anular
                else
                {
                     JOptionPane.showMessageDialog(null, "Operacion Cancelada", "Atencion", JOptionPane.ERROR_MESSAGE);
                     this.cancelar.doClick();
                }
       }
   private void hab_botones()
{

           nuevo.setEnabled(true);
           borrar.setEnabled(true);
           modificar.setEnabled(true);
           cancelar.setEnabled(false);
           grabar.setEnabled(false);
           salir.setEnabled(true);

}

    private void des_botones()
{

           nuevo.setEnabled(false);
           modificar.setEnabled(false);
           borrar.setEnabled(false);
           cancelar.setEnabled(true);
           grabar.setEnabled(false);
           salir.setEnabled(false);

}
    private void bloq_text()
{
           num.setEnabled(false);
           cam_cod.setEnabled(false);
           acc_id.setEnabled(false);
           txtcantidad.setEnabled(false);
           salir.setEnabled(true);;
           num_recep.requestFocus();
           txobs.setEnabled(false);
         //  btn_pro.setEnabled(false);
          // combo.setEnabled(false);
}
  

 private void grabar()
  {
        int res = javax.swing.JOptionPane.showOptionDialog(this,
        "Desea Grabar La Recepcion?","Confirmar",javax.swing.JOptionPane.OK_CANCEL_OPTION,
        javax.swing.JOptionPane.QUESTION_MESSAGE,null,
        new Object[] { "Si", "No"},"Si");
        if (res == javax.swing.JOptionPane.OK_OPTION)
        {
            try {
               // String fecha = new SimpleDateFormat("yyyy-MM-dd").format(fecha_compra.getDate());

                miconex.sentencia = miconex.conexion.createStatement();
                
                 String insercionSQL="insert into recepcion(rec_id,rec_obs,rec_estado,rec_fecha,cam_id,emp_id) values ("+num_recep.getText()+",'"+txobs.getText()+"','PENDIENTE','"+num.getText()+"',"+cam_cod.getText()+","+usu_cod.getText()+")";
                 miconex.sentencia.executeUpdate(insercionSQL);//
                
            
              
                //graba en el detalle
                for (int fila = 0; fila < grilla.getRowCount(); fila++)
                {
                  miconex.sentencia = miconex.conexion.createStatement();
                  miconex.sentencia.executeUpdate("insert into detalle_recepcion(acc_id,rec_id,dr_cantidad,dr_obs) values("+grilla.getValueAt(fila,0)+","+num_recep.getText()+","+grilla.getValueAt(fila, 2)+",'"+grilla.getValueAt(fila, 3)+"')");

                   //miconex.sentencia = miconex.conexion.createStatement();
                   //String insercionSQL7="update productos set prd_stock = prd_stock - "+grilla.getValueAt(fila, 2)+" where Prd_codigo = "+grilla.getValueAt(fila, 0);
                   //miconex.sentencia.executeUpdate(insercionSQL7);   
                } //fin grabacion en detalle
                
                         
               JOptionPane.showMessageDialog(null, "La Recepcion Se Ha Grabado Correctamente.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                impresion();
            } catch (SQLException ex) {
                Logger.getLogger(recepcion.class.getName()).log(Level.SEVERE, null, ex);
            }         
       }
       else
       {
           JOptionPane.showMessageDialog(null, "Operacion Cancelada", "Atencion", JOptionPane.ERROR_MESSAGE);
            this.cancelar.doClick();
       }
    }///fin de grabar*/



 ////IMPRESION
    private void impresion()
    {
     try {
            miconex.sentencia = miconex.conexion.createStatement();
            String sql="SELECT a.rec_id, a.rec_fecha, b.cam_chapa, c.cli_nombre, c.cli_apellido, d.acc_id, d.acc_descri, e.dr_cantidad, e.dr_obs "+
                       "FROM recepcion a, camion b, cliente c, accesorios d, detalle_recepcion e "+
                       "WHERE b.cam_id= a.cam_id AND c.cli_id= b.cli_id AND d.acc_id= e.acc_id AND a.rec_id= e.rec_id AND a.rec_id= "+num_recep.getText();
             
             
            
            miconex.resultado = miconex.sentencia.executeQuery(sql);

        } catch (Exception ex) {
           System.exit(0);
        }

        this.cancelar.doClick();

        JRResultSetDataSource jrRS = new JRResultSetDataSource(miconex.resultado);
        HashMap parameters = new HashMap();
        //Map parameters = new HashMap();

        try{
            URL urlMaestro = getClass().getClassLoader().getResource("impresiones/recepcion.jasper");
            // Cargamos el reporte
            JasperReport masterReport = null;
            masterReport = (JasperReport) JRLoader.loadObject(urlMaestro);
            JasperPrint masterPrint = null;
            masterPrint = JasperFillManager.fillReport(masterReport, parameters,jrRS);

            JasperViewer ventana = new JasperViewer(masterPrint,false);
            ventana.setTitle("Vista Previa");
            ventana.setVisible(true);

            ////
           // JDialog viewer = new JDialog(new JFrame(),"Vista previa del reporte", true);
           // viewer.setSize(800,600);
           // viewer.setLocationRelativeTo(null);
           // JRViewer jrv = new JRViewer(urlMaestro);
           // viewer.getContentPane().add(jrv);
           // viewer.setVisible(true);
            ///
        }catch(JRException e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error "+e.toString(),"ATENCION ", JOptionPane.INFORMATION_MESSAGE);
        }

    }
 ////FIN IMPRESION

 private void buscar_accesorios()
 {
    try
    {
                miconex.sentencia = miconex.conexion.createStatement();
                String sql = "select * from accesorios where acc_id = " + acc_id.getText();
                miconex.resultado = miconex.sentencia.executeQuery(sql);
                //
                boolean seguir = miconex.resultado.next();
                if (seguir)
                {
                    //txtcantidad.setText(miconex.resultado.getString("dr_cantidad"));
                    txt_acc.setText(miconex.resultado.getString("acc_descri"));

                    this.acc_id.setEnabled(false);
                    txtcantidad.setEnabled(true);
                    txtcantidad.requestFocus();
                    txobs.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(null, "CODIGO DE PRODUCTO NO EXISTE", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
                    acc_id.setText("");
 
                    acc_id.setEnabled(true);
                    acc_id.requestFocus();
                }

    }
    catch (SQLException ex)
    {
                Logger.getLogger(recepcion.class.getName()).log(Level.SEVERE, null, ex);
    }
 }

 private void buscar_camion()
 {
        try {
            int codbuscado = Integer.parseInt(cam_cod.getText());
            miconex.sentencia = miconex.conexion.createStatement();
            String sql = "SELECT a.cam_chapa, concat(b.cli_nombre, ' ', b.cli_apellido) AS cliente FROM camion a, cliente b WHERE a.cli_id = b.cli_id AND cam_id =" + codbuscado;
            miconex.resultado = miconex.sentencia.executeQuery(sql);
            boolean encontr = miconex.resultado.next();
            if (encontr == true)
            {
                camion.setText( miconex.resultado.getString("cam_chapa"));
                cliente.setText( miconex.resultado.getString("cliente"));
                acc_id.setEnabled(true);
                acc_id.requestFocus();
               // habilitar_condicion();
                
               
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Codigo Invalido!", "Atencion", JOptionPane.ERROR_MESSAGE);
                cam_cod.setText("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(recepcion.class.getName()).log(Level.SEVERE, null, ex);
        }

}//fin de busca cliente

}
