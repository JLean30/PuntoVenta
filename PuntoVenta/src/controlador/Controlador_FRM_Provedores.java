/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import modelo.Provedor;
import vista.FRM_Provedores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author JeanC
 */
public class Controlador_FRM_Provedores implements ActionListener{
    
    private  FRM_Provedores frmProvedores;
    private RegistroProveedorJSON archivoJSON;
    public  MetodosProvedor metodosProvedor;

    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equals("Limpiar")){

                //Metodo que mantiene los botones en limpios sin poder ser editados
                this.frmProvedores.estadoInicial();
        
       }
        if(e.getActionCommand().equals("Buscar")){
            
                Provedor temporal = null;
                temporal = this.metodosProvedor.busqueda(this.frmProvedores.getCedula());
        //En caso de que exista un producto puede Eliminarlo/Modificarlo ..... Si existe puede agregarlo 
                if(temporal != null){
                    
                    this.frmProvedores.setCedulaJuridica(temporal.getCedulaJuridica());
                    this.frmProvedores.setNombreComercial(temporal.getNombreComercial());
                    this.frmProvedores.setContacto(temporal.getContacto());
                    this.frmProvedores.setDireccion((temporal.getDireccion()));
                    this.frmProvedores.setMontoCredito((temporal.getMontoCredito()));
                    this.frmProvedores.setDiasCredito(temporal.getDiasCredito());
                    this.frmProvedores.setMoneda((temporal.getMoneda()));
                    
                    this.frmProvedores.habilitarModificarEliminar();

                }
                else{
                    this.frmProvedores.habilitarAgregar();
                    this.frmProvedores.habilitarAgregar();


                }
        }
        
        if(e.getActionCommand().equals("Registrar")){
                    Provedor provedor = null;
                    provedor = this.metodosProvedor.obtenerInformacion(this.frmProvedores);
                    this.metodosProvedor.agregar(provedor);
                    String[] datos = new String[7];
                        datos[0] = provedor.getCedulaJuridica();
                        datos[1] = provedor.getNombreComercial();
                        datos[2] = provedor.getContacto();
                        datos[3] = provedor.getDireccion();
                        datos[4] = provedor.getMontoCredito();
                        datos[5] = String.valueOf(provedor.getDiasCredito());
                        datos[6] = provedor.getMoneda();
                    this.frmProvedores.agregarUsuarioTabla(datos);
                    this.frmProvedores.mostrarMensaje("Provedor registrado correctamente");
                    this.frmProvedores.estadoInicial();
        }
        
        if(e.getActionCommand().equals("Modificar")){
                    Provedor Provedor = null;
                    Provedor = this.metodosProvedor.obtenerInformacion(this.frmProvedores);
                    this.metodosProvedor.modificar(Provedor);
                    String[] datos = new String[7];
                        datos[0] = Provedor.getCedulaJuridica();
                        datos[1] = Provedor.getNombreComercial();
                        datos[2] = Provedor.getContacto();
                        datos[3] = Provedor.getDireccion();
                        datos[4] = Provedor.getMontoCredito();
                        datos[5] = String.valueOf(Provedor.getDiasCredito());
                        datos[6] = Provedor.getMoneda();
                    this.frmProvedores.modificarUsuarioTabla(datos);
                    this.frmProvedores.estadoInicial();
                    this.frmProvedores.mostrarMensaje("Provedor modificado");
                }
        
        if(e.getActionCommand().equals("Eliminar")){
                    this.metodosProvedor.eliminar(this.frmProvedores.getCedula());
                    this.frmProvedores.eliminarUsuarioTabla(this.frmProvedores.getCedula());
                    this.frmProvedores.estadoInicial();
                    this.frmProvedores.mostrarMensaje("Provedor eliminado");
                }
            
        
        
        
        
        
    }

    public void inicioTabla(){
        for(Provedor item:this.metodosProvedor.getArray()){
            if(item!=null){
                String[] datos = new String[7];
                        datos[0] = item.getCedulaJuridica();
                        datos[1] = item.getNombreComercial();
                        datos[2] = item.getContacto();
                        datos[3] = item.getDireccion();
                        datos[4] = item.getMontoCredito();
                        datos[5] = String.valueOf(item.getDiasCredito());
                        datos[6] = item.getMoneda();
                this.frmProvedores.agregarUsuarioTabla(datos);
                
            }
        }
    }
    
    public void consolidarInformacion(){
        this.archivoJSON.setArray(this.metodosProvedor.getArray());
        this.archivoJSON.escribirDatos();
    }
    public Controlador_FRM_Provedores(FRM_Provedores frm){//frm es la interfaz
            this.frmProvedores = frm;
            this.archivoJSON=new RegistroProveedorJSON();
            this.metodosProvedor=new MetodosProvedor(this.archivoJSON.getLista());
            

        }
    
}
