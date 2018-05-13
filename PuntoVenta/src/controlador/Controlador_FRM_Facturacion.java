/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import vista.FRM_Facturacion;
import modelo.Producto;
/**
 *
 * @author JeanC
 */
public class Controlador_FRM_Facturacion implements ActionListener {
    private FRM_Facturacion frmFacturacion;
    private MetodosCliente metodosC;
    private MetodosProducto metodosP;
    private int cont=0;
    
    public Controlador_FRM_Facturacion(FRM_Facturacion frmFacturacion,
            MetodosCliente metodosC,
            MetodosProducto metodosP){
        
        this.frmFacturacion=frmFacturacion;
        this.metodosC=metodosC;
        this.metodosP=metodosP;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("BuscarCliente")){
            if(this.metodosC.busqueda(this.frmFacturacion.getCedula())!=null){
                this.frmFacturacion.mostrarNombreCliente(this.metodosC.busqueda(this.frmFacturacion.getCedula()).getNombre());
            }else{
                this.frmFacturacion.mostrarMensaje("No existe el cliente");
            
        }
        }
        if(e.getActionCommand().equals("BuscarProductos")){
            Producto temporal=null;
            temporal=this.metodosP.buscar(this.frmFacturacion.getCodigoProducto());
            if(temporal!=null){
                this.frmFacturacion.mostarNombreProducto(temporal.getDescripcion());
                this.frmFacturacion.estadoBotonesBuscar();
            }else{
                this.frmFacturacion.mostrarMensaje("No Existe el producto");
            }
            
        }
        if(e.getActionCommand().equals("AgregarProducto")){
            Producto temporal=null;
            temporal=this.metodosP.buscar(this.frmFacturacion.getCodigoProducto());
            if(temporal!=null){
                String[] datos=new String[5];
                datos[0]=temporal.getCodigo();
                datos[1]=temporal.getDescripcion();
                datos[2]=String.valueOf(temporal.getPrecioCompra());
                datos[3]=""+ this.frmFacturacion.getCantidadProducto();
                datos[4]=""+(Double.parseDouble(datos[3]))*temporal.getPrecioCompra();
                this.frmFacturacion.agregarProductoTabla(datos);
                this.frmFacturacion.total();
                this.frmFacturacion.estadoBotonesAgregar();
            }else{
                this.frmFacturacion.mostrarMensaje("No Existe el producto");
            }
        }
        if(e.getActionCommand().equals("EliminarProducto")){
            this.frmFacturacion.eliminarProductoTabla(this.frmFacturacion.getCodigoProducto());
            this.frmFacturacion.total();
        }
        if(e.getActionCommand().equals("Pagar")){
            
            cont++;
            String num= "FT"+String.valueOf(cont);
            this.frmFacturacion.setJtxNumero(num);
            this.frmFacturacion.mostrarMensaje("Su pago de "+this.frmFacturacion.getJtxTotal()+" Colones ha sido exitoso por medio de pago en "+this.frmFacturacion.getEleccionPago());
            this.frmFacturacion.estadoInicial();
            this.frmFacturacion.estadoBotonesInicio();
            this.frmFacturacion.eliminarRegistroTabla();
        }
    }
    
}
