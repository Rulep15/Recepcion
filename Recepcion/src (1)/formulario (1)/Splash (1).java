/******************************************************************************/
/*****************************CONTRESPACE**************************************/
/******************TUTORIAL SPLASH SCREEN by CONTRE17**************************/
/******************************************************************************/
package formulario;


import java.util.logging.Level;
import java.util.logging.Logger;
import prgs.Hilo;
//import prgs.conexion;


public class Splash extends javax.swing.JFrame implements Runnable {

    int num = 0;
    Thread t;

    public Splash() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void Llena_Barra() {
        if (Barra.getValue() <= 100) {
            num += 10;//Valor con el que se va llenar el ProgressBar. Se llenará de 3 en 3
            //Le podemos dar un valor mas alto para que se llene mas rapido o un valor mas bajo
            //para que se llene mas lento
            Barra.setValue(num);
            Barra.setStringPainted(true);
        } else {
            Barra.setValue(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Barra = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BIENVENIDO--ACCEDIENDO AL SISTEMA");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 37, 400, 20));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, 50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficos/camion_carga.gif"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 130, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Hilo hl = new Hilo(this);
        hl.start();
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Splash().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Barra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public void run() 
    {    
       
            try {    
                
                this.setLocationRelativeTo(null);
                this.setVisible(true);
                try {
                    t.sleep(3000);//Tiempo que deseamos que se muestre nuestro Splash: 6000 milisegundos = 6 segundos
                } catch (InterruptedException ex) {
                    Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
                }
                //Debemos ajustarlo bien para que nuestro Splash desaparezaca justo cuando el ProgressBar
                //acabe de llenarse.
                this.dispose();
                
                
                // menuprincipal p = new menuprincipal();
                acceso p = new acceso();
                p.setLocationRelativeTo(null);
                p.setVisible(true);
                    
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
            Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
       
               
    }
}
