package formulario;


import prgs.ModeloTabla;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.*;
import prgs.conexion;


public class Buscador extends javax.swing.JFrame {
    ResultSet rest,recur2;
    
    int col;
    String[] nom;
    ArrayList<String[]> val = new ArrayList<String[]>();
    String query;
    String des;
    int cod;
    Object[] tfParam;
    
    
public Buscador(String _sql, String[] nomColu, int canColu, Object[] retorno) 
{
        initComponents();
        this.setLocationRelativeTo(null);
        query      = _sql;
        nom        = nomColu;
        col        = canColu;
        tfParam    = retorno;      
      
        Buscado();
        ConfigurarGrilla();
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnlBuscar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtValorBusqueda = new javax.swing.JTextField();
        jscrllDetalleBusqueda = new javax.swing.JScrollPane();
        grilla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jpnlBuscar.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Descripcion:");

        txtValorBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtValorBusquedaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtValorBusquedaKeyReleased(evt);
            }
        });

        grilla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        grilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grillaMouseClicked(evt);
            }
        });
        grilla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                grillaKeyPressed(evt);
            }
        });
        jscrllDetalleBusqueda.setViewportView(grilla);

        javax.swing.GroupLayout jpnlBuscarLayout = new javax.swing.GroupLayout(jpnlBuscar);
        jpnlBuscar.setLayout(jpnlBuscarLayout);
        jpnlBuscarLayout.setHorizontalGroup(
            jpnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpnlBuscarLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorBusqueda))
                    .addComponent(jscrllDetalleBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jpnlBuscarLayout.setVerticalGroup(
            jpnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(14, 14, 14)
                .addComponent(jscrllDetalleBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void Buscado() {
     try {
          conexion conn = new conexion();
          conn.sentencia = conn.conexion.createStatement();
                
          conn.resultado = conn.sentencia.executeQuery(query+" upper('%"+this.txtValorBusqueda.getText().toString()+"%')");
          val = new ArrayList<String[]>();
          while (conn.resultado.next()) 
          {                
               String[] aux = new String[col];
               for (int i = 0; i < aux.length; i++) 
               {
                  aux[i] = String.valueOf(conn.resultado.getObject(i+1));                        
               }
                  val.add(aux);                  
          }
          
           grilla.setModel(new ModeloTabla(col, nom, val));
          ConfigurarGrilla();
          } catch (SQLException ex) 
          {
                ex.printStackTrace();
          }
    }
private void grillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grillaMouseClicked
    
    for (int i = 0; i < tfParam.length; i++) {
        if(grilla.getValueAt(grilla.getSelectedRow(),i) != null) {
            if ( tfParam[i] instanceof JTextField ) 
            {
                ((JTextField)tfParam[i]).setText(grilla.getValueAt(grilla.getSelectedRow(),i).toString());
            }
            else if(tfParam[i] instanceof JComboBox)
            {
                int indice =Integer.parseInt(grilla.getValueAt(grilla.getSelectedRow(),i).toString());
            
                ((JComboBox)tfParam[i]).setSelectedIndex(indice);               
            }
            
        }
            //tfParam[i].setText(jtblDetalleBusqueda.getValueAt(jtblDetalleBusqueda.getSelectedRow(),i).toString());
    }//Cierre del for
}//GEN-LAST:event_grillaMouseClicked

private void txtValorBusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorBusquedaKeyPressed
//   Buscado();
    if(evt.getKeyCode()==27){
        this.dispose();
   }
}//GEN-LAST:event_txtValorBusquedaKeyPressed

private void txtValorBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorBusquedaKeyReleased
     Buscado();
    txtValorBusqueda.setText(txtValorBusqueda.getText().toUpperCase());
}//GEN-LAST:event_txtValorBusquedaKeyReleased

private void grillaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grillaKeyPressed
    // if(evt.getKeyCode()==27)
    if (evt.getKeyChar() == KeyEvent.VK_ESCAPE || evt.getKeyChar() == KeyEvent.VK_ENTER)     
    {
        this.dispose();
   }
}//GEN-LAST:event_grillaKeyPressed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
 //               new VentanaBuscar("select id, rsocial, telefono from proveedores where rsocial like '", new String[]{"CODIGO","DESCRIPCION","TELEFONO"},3).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable grilla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jpnlBuscar;
    private javax.swing.JScrollPane jscrllDetalleBusqueda;
    private javax.swing.JTextField txtValorBusqueda;
    // End of variables declaration//GEN-END:variables

    private void ConfigurarGrilla() {
     //   grilla.getColumnModel().getColumn(0).setPreferredWidth(5);
     //   grilla.getColumnModel().getColumn(1).setPreferredWidth(250);
    }

}