/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.awt.event.ActionEvent;
import  java.awt.event.ActionListener;
import vista.FRM_Productos;


/**
 *
 * @author Melber
 */
public class Controlador_FRM_productos implements ActionListener {

    private FRM_Productos frmProductos;
    public MetodosProducto  metodosProductos;
    private RegistroProductoJSON archivoJSON;
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
         if(e.getActionCommand().equals("Limpiar")){
           this.frmProductos.estadoInicial();
        }
        
        if(e.getActionCommand().equals("Buscar")){
            modelo.Producto temporal = null;
            
            temporal= this.metodosProductos.buscar(this.frmProductos.getCodigo());
            this.frmProductos.habilitarAgregar();
            
            if( temporal !=null){
                
                this.frmProductos.jP_Botones1.habilitarModificarEliminar();
                
                             
                this.frmProductos.txtDescripcion.setText(temporal.getDescripcion());
                this.frmProductos.txtPrecioCompra.setText(String.valueOf(temporal.getPrecioCompra()));
                this.frmProductos.txtPorDescuento.setText(String.valueOf(temporal.getPorDescuento()));
                this.frmProductos.txtPorImpuesto.setText(String.valueOf(temporal.getPorImpuesto()));
                this.frmProductos.txtFechaRegistro.setText(temporal.getFechaRegistro());
                this.frmProductos.txtPrecioVenta.setText(String.valueOf(temporal.precioVenta()));
                
            }
            else{
                this.frmProductos.jP_Botones1.habilitarAgregar();
              }
        }
        if(e.getActionCommand().equals("Registrar")){
             modelo.Producto producto = null;
             producto = this.metodosProductos.obtenerInformacion(this.frmProductos);
           
                this.metodosProductos.agregar(producto);
                this.frmProductos.mostrarMensaje("Producto Registrado");
                this.frmProductos.estadoInicial();
            
            
        }
        if(e.getActionCommand().equals("Modificar")){
            
            this.metodosProductos.modificar(
                    this.metodosProductos.obtenerInformacion(this.frmProductos));
                    this.frmProductos.estadoInicial();
                    this.frmProductos.mostrarMensaje("Producto modificado de forma correcta");
        }
        if(e.getActionCommand().equals("Eliminar")){
            this.metodosProductos.eliminar(this.frmProductos.txtCodigo.getText());
            this.frmProductos.estadoInicial();
            this.frmProductos.mostrarMensaje("Producto eliminado de forma correcta");
        }
    }
    
    public void consolidarInformacion(){
        this.archivoJSON.setArray(this.metodosProductos.getArray());
        this.archivoJSON.escribirDatos();
    }
    
    public Controlador_FRM_productos(FRM_Productos frm){
        this.frmProductos=frm;
        this.archivoJSON=new RegistroProductoJSON();
        this.metodosProductos = new MetodosProducto(this.archivoJSON.getLista());
    }
    
    
}
