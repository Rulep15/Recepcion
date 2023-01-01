package prgs;

//import formularios.menuprincipal;
import java.sql.*;
import javax.swing.*;

public class conexion
{
    public static String poreljar = "si";
     
    public String user = "root";
    public String pass = "123";
    public String bd   = "recepcion";
       
    /////los nuevos
    public final String host = "jdbc:mysql://localhost/";
    public Connection conexion = null; //el mas importante
    
    public Statement sentencia;
    public ResultSet resultado;
    ////
    public conexion()// constructor
    {
        try  // todo bien if 
        {
            Class.forName("com.mysql.jdbc.Driver");//Se registra el Driver jdbc de MySQL
            conexion = DriverManager.getConnection(host+bd,user,pass);
            
             if(poreljar.equals("si"))
             { 
                  JOptionPane.showMessageDialog(null, "YA ESTAS CONECTADO  A LA BASE DE DATOS","Bienvenidos",JOptionPane.INFORMATION_MESSAGE);                        
                                
                  poreljar= "no";          
             }
             
             
           
                //
                // SubstanceLookAndFeel.setCurrentTheme("org.jvnet.substance.theme.SubstanceSteelBlueTheme");           
               // SubstanceLookAndFeel.setCurrentWatermark("org.jvnet.substance.watermark.SubstanceLatchWatermark");     
       
              
          sentencia = conexion.createStatement(); 
          /*resultado = sentencia.executeQuery("SELECT * from nacionalidad");
       
          
           while(resultado.next()==true)
           {
               System.out.print(resultado.getString("nac_id")+"-");
               System.out.println(resultado.getString("nac_descri"));         
           } // fin mientras*/
            
     //sentencia.executeUpdate("insert into nacionalidad(nac_id,nac_descri) values(5,'Mexicano')");
     //sentencia.executeUpdate("delete from  nacionalidad where  nac_id= 0");
     //sentencia.executeUpdate("update nacionalidad set nac_descri= 'Paraguaya' where nac_id = 1");

            
        }//fin todo bien
         catch (Exception e) // error de conexion else
        {
             JOptionPane.showMessageDialog(null, "Problemas con la Sintaxis SQL o Parametros de Conexion" , "Verifiquelo",JOptionPane.INFORMATION_MESSAGE);
             System.exit(0);//salir
        }
    }//fin del constructor

    public static void main(String[] args) // programa principal
    {
		new conexion();// llama al constructor
    }
 }

