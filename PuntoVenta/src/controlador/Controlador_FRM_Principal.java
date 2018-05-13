/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.awt.event.ActionEvent;
import  java.awt.event.ActionListener;
import  vista.FRM_Productos;
import  vista.FRM_Login;
import  vista.FRM_Principal;
import  vista.FRM_Usuarios;
import vista.FRM_Clientes;
import vista.FRM_Provedores;
import vista.FRM_Facturacion;






/**
 *
 * @author Melber
 */
public class Controlador_FRM_Principal implements ActionListener {

    //Formulario de productos
    private FRM_Productos frmProductos;
 //formulario de login
    public  FRM_Login  frmLogin;
    
    //formulario  principal
    public  FRM_Principal frmPrincipal;
    private FRM_Provedores frmProvedores;
    private FRM_Clientes frmClientes;

    //formulario de usuarios
    private FRM_Usuarios frmUsuarios;
    private FRM_Facturacion frmFacturacion;

  
    
    
    public Controlador_FRM_Principal(FRM_Principal pFRMPrincipal){
      
        
        
        //instancia de formulario productos
        this.frmProductos = new FRM_Productos();

        //instancia de formulario de usuarios Version Clase08
        this.frmUsuarios  = new FRM_Usuarios();
        
        ///referencia de formulario principal
        this.frmPrincipal = pFRMPrincipal;
        
        //intancia de formulario login
        this.frmLogin = new FRM_Login(this.frmPrincipal,this.frmUsuarios.controlador.metodosUsuarios);
        this.frmProvedores = new FRM_Provedores();
        this.frmClientes = new FRM_Clientes();
        this.frmFacturacion=new FRM_Facturacion(this.frmClientes.controlador.metodosCliente,this.frmProductos.controlador.metodosProductos);
        this.frmPrincipal.setVisible(false);
        this.frmLogin.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equals("Salir")){
            System.exit(0);
        }
        
        if(e.getActionCommand().equals("Productos")){
            this.frmProductos.setVisible(true);
        }
        if(e.getActionCommand().equals("Provedores")){
                    this.frmProvedores.setVisible(true);
                    
                }
                
                if(e.getActionCommand().equals("Clientes")){
                    this.frmClientes.setVisible(true);
                }
                if(e.getActionCommand().equals("Facturación")){
                    this.frmFacturacion.setJTUsuario(this.frmUsuarios.controlador.metodosUsuarios.getUsuarioLogueo());
                    this.frmFacturacion.setVisible(true);
                }
        
        if(e.getActionCommand().equals("CerrarSesion")){
            //cerrar el principal
            this.frmPrincipal.setVisible(false);
    
            //se asigna la referencia del formulario principal
            //this.frmLogin = new FRM_Login(this.frmPrincipal);
            this.frmLogin.estadoInicial();
            //Se muestra  el formulario de login
            this.frmLogin.setVisible(true);
            
        
            
        }
        
        if(e.getActionCommand().equals("Perfiles de Usuarios")){
            this.frmUsuarios.setVisible(true);
        }
        if(e.getActionCommand().equals("BancoInformacion")){
         
        }
        
    }
    //Metodos para los distintos bancos de informacion
    
    
    
    
}//cierra clase
