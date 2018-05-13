/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import  controlador.Controlador_FRM_Login;
import controlador.MetodosUsuarios;
import javax.swing.JOptionPane;

import  modelo.Usuario;
/**
 *
 * @author Estudiante
 */
public class FRM_Login extends javax.swing.JFrame {

    //variable de interfaz  principal
    private FRM_Principal  frmPrincipal;
   
    //varible controlador para login
    public Controlador_FRM_Login  controlador;
    
    //objeto modelo usuario
    private Usuario  usuario;
    
    
    
    public FRM_Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public  FRM_Login(FRM_Principal  pFRMPrincipal, MetodosUsuarios metodos){
        //metodo para instanciar los  controles de interfaz 
        initComponents();
        
        //Se asigna la  referencia del formulario principal
        this.frmPrincipal = pFRMPrincipal;
        
        //se oculta  principal
        this.frmPrincipal.setVisible(false);
     
        //posicionamos  login en centro de la pantalla
        this.setLocationRelativeTo(null);
        
        //crear  instancia de controlador
        this.controlador = new Controlador_FRM_Login(this, this.frmPrincipal,metodos);
        
        //se asigna el controlador  a  los botones
        this.jb_Ingresar.addActionListener(this.controlador);
        this.jb_Cerrar.addActionListener(this.controlador);
        this.jt_Usuario.addKeyListener(this.controlador);
        this.jp_Contrasena.addKeyListener(this.controlador);
        
        
    }
    
    
    public  void  estadoInicial(){
        this.jt_Usuario.setText("");
        this.jp_Contrasena.setText("");
    }
    
    public  void  mostrarMensaje(String pMensaje){
        JOptionPane.showMessageDialog(null,pMensaje);
    }
    
    public Usuario obtenerIntentoLogeo(){
        this.usuario = new Usuario(this.jt_Usuario.getText(), 
                this.jp_Contrasena.getText(), "","");
        
        return this.usuario;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jt_Usuario = new javax.swing.JTextField();
        jp_Contrasena = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jb_Cerrar = new javax.swing.JButton();
        jb_Ingresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Autenticación de usuario");

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/login.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Contraseña");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Usuario");

        jt_Usuario.setBackground(new java.awt.Color(0, 153, 153));
        jt_Usuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jt_Usuario.setForeground(new java.awt.Color(255, 255, 255));

        jp_Contrasena.setBackground(new java.awt.Color(0, 153, 153));
        jp_Contrasena.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jp_Contrasena.setForeground(new java.awt.Color(255, 255, 255));
        jp_Contrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jp_ContrasenaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jp_Contrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .addComponent(jt_Usuario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jb_Cerrar.setBackground(new java.awt.Color(0, 153, 153));
        jb_Cerrar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jb_Cerrar.setForeground(new java.awt.Color(255, 255, 255));
        jb_Cerrar.setText("Cerrar");

        jb_Ingresar.setBackground(new java.awt.Color(0, 153, 153));
        jb_Ingresar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jb_Ingresar.setForeground(new java.awt.Color(255, 255, 255));
        jb_Ingresar.setText("Ingresar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(jb_Ingresar)
                .addGap(42, 42, 42)
                .addComponent(jb_Cerrar)
                .addGap(72, 72, 72))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_Cerrar)
                    .addComponent(jb_Ingresar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jp_ContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jp_ContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jp_ContrasenaActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jb_Cerrar;
    private javax.swing.JButton jb_Ingresar;
    private javax.swing.JPasswordField jp_Contrasena;
    private javax.swing.JTextField jt_Usuario;
    // End of variables declaration//GEN-END:variables
}
