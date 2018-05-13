/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista;
import controlador.Controlador_FRM_Principal;
/**
 *
 * @author Melber
 */
public class FRM_Principal extends javax.swing.JFrame {
    
private Controlador_FRM_Principal controlador;

/** Creates new form FRM_Principal */
    public FRM_Principal() {
        initComponents();
        this.controlador = new Controlador_FRM_Principal(this);
        this.jmiSalir.addActionListener(controlador);
        this.jmiProductos.addActionListener(controlador);
        //se asigna el controlador a cerrar sesion
        this.jmi_CerrarSesion.addActionListener(controlador);        
        //se asigna el controlador al item menu formulario de usuarios
        this.jmiUsuarios.addActionListener(controlador);
        this.jmi_Facturacion.addActionListener(controlador);
        this.jmi_Proveedores.addActionListener(controlador);
        this.jmi_Clientes.addActionListener(controlador);
        this.jmiBancoInformacion.addActionListener(controlador); 
        //se construye una instancia de interfaz login y recibe el contexto de principal
       // this.frmLogin = new FRM_Login(this);
        
        //se muestra  la muestra  la interfaz de login blalla
       // this.frmLogin.setVisible(true);  
    }
    
    public  void  CerrarSesion(){
        System.exit(0);
    }
    
    
    
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmi_Archivo = new javax.swing.JMenu();
        jmiBancoInformacion = new javax.swing.JMenuItem();
        jmi_CerrarSesion = new javax.swing.JMenuItem();
        jmiSalir = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmiProductos = new javax.swing.JMenuItem();
        jmiUsuarios = new javax.swing.JMenuItem();
        jmi_Clientes = new javax.swing.JMenuItem();
        jmi_Proveedores = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jmi_Facturacion = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Facturación");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Fondo.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 102, 102));
        jMenuBar1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N

        jmi_Archivo.setBackground(new java.awt.Color(0, 102, 102));
        jmi_Archivo.setText("Archivo");
        jmi_Archivo.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N

        jmiBancoInformacion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jmiBancoInformacion.setText("Banco de Información");
        jmiBancoInformacion.setActionCommand("BancoInformacion");
        jmi_Archivo.add(jmiBancoInformacion);

        jmi_CerrarSesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jmi_CerrarSesion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jmi_CerrarSesion.setText("Cerrar Sesión");
        jmi_CerrarSesion.setActionCommand("CerrarSesion");
        jmi_CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_CerrarSesionActionPerformed(evt);
            }
        });
        jmi_Archivo.add(jmi_CerrarSesion);

        jmiSalir.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jmiSalir.setText("Salir");
        jmi_Archivo.add(jmiSalir);

        jMenuBar1.add(jmi_Archivo);

        jMenu4.setBackground(new java.awt.Color(0, 102, 102));
        jMenu4.setText("Catálogos");
        jMenu4.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N

        jmiProductos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        jmiProductos.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jmiProductos.setText("Productos");
        jMenu4.add(jmiProductos);

        jmiUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        jmiUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jmiUsuarios.setText("Perfiles de Usuarios");
        jMenu4.add(jmiUsuarios);

        jmi_Clientes.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jmi_Clientes.setText("Clientes");
        jMenu4.add(jmi_Clientes);

        jmi_Proveedores.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jmi_Proveedores.setText("Proveedores");
        jmi_Proveedores.setActionCommand("Provedores");
        jMenu4.add(jmi_Proveedores);

        jMenuBar1.add(jMenu4);

        jMenu5.setBackground(new java.awt.Color(0, 102, 102));
        jMenu5.setText("Consultas");
        jMenu5.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jMenuBar1.add(jMenu5);

        jMenu7.setText("Procesos");
        jMenu7.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N

        jmi_Facturacion.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jmi_Facturacion.setText("Facturación");
        jmi_Facturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_FacturacionActionPerformed(evt);
            }
        });
        jMenu7.add(jmi_Facturacion);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_FacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_FacturacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_FacturacionActionPerformed

    private void jmi_CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_CerrarSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_CerrarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(FRM_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_Principal();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem jmiBancoInformacion;
    private javax.swing.JMenuItem jmiProductos;
    private javax.swing.JMenuItem jmiSalir;
    private javax.swing.JMenuItem jmiUsuarios;
    private javax.swing.JMenu jmi_Archivo;
    private javax.swing.JMenuItem jmi_CerrarSesion;
    private javax.swing.JMenuItem jmi_Clientes;
    private javax.swing.JMenuItem jmi_Facturacion;
    private javax.swing.JMenuItem jmi_Proveedores;
    // End of variables declaration//GEN-END:variables

}
