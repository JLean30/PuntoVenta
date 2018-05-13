/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import modelo.Cliente;
import vista.FRM_Clientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author JeanC
 */
public class Controlador_FRM_Clientes implements ActionListener {
    
    private  FRM_Clientes frmClientes;
    private RegistroClientesJSON registroClientesJSON;
    
    public  MetodosCliente metodosCliente;


    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equals("Limpiar")){

                //Metodo que mantiene los botones en limpios sin poder ser editados
                this.frmClientes.estadoInicial();
        
       }
        if(e.getActionCommand().equals("Buscar")){
            
                Cliente temporal = null;
                temporal = this.metodosCliente.busqueda(this.frmClientes.getCedulaCliente());
        //En caso de que exista un producto puede Eliminarlo/Modificarlo ..... Si existe puede agregarlo 
                if(temporal != null){
                    
                    this.frmClientes.setCedulaCliente(temporal.getCedulaCliente());
                    this.frmClientes.setNombre(temporal.getNombre());
                    this.frmClientes.setPrimerApellido(temporal.getPrimerApellido());
                    this.frmClientes.setSegundoApellido((temporal.getSegundoApellido()));
                    this.frmClientes.setTelefono((temporal.getTelefono()));
                    this.frmClientes.setDireccion(temporal.getDireccion());
                    this.frmClientes.setEmail((temporal.getEmail()));
                    
                    this.frmClientes.habilitarModificarEliminar();

                }
                else{
                    this.frmClientes.habilitarAgregar();
                    this.frmClientes.habilitarAgregar();


                }
        }
        
        if(e.getActionCommand().equals("Registrar")){
                    Cliente cliente = null;
                    cliente = this.metodosCliente.obtenerInformacion(this.frmClientes);

                    this.metodosCliente.agregar(cliente);
                    String[] datos = new String[5];
                        datos[0] = cliente.getCedulaCliente();
                        datos[1] = cliente.getNombre()+""+cliente.getPrimerApellido()+""+cliente.getSegundoApellido();
                        datos[2] = cliente.getTelefono();
                        datos[3] = cliente.getDireccion();
                        datos[4]= cliente.getEmail();
                    this.frmClientes.agregarUsuarioTabla(datos);
                    this.frmClientes.mostrarMensaje("Cliente registrado correctamente");
                    this.frmClientes.estadoInicial();
        }
        
        if(e.getActionCommand().equals("Modificar")){
                    Cliente nuevoCliente = null;
                    nuevoCliente = this.metodosCliente.obtenerInformacion(this.frmClientes);
                    this.metodosCliente.modificar(nuevoCliente);
                    String[] datos = new String[5];
                        datos[0] = nuevoCliente.getCedulaCliente();
                        datos[1] = nuevoCliente.getNombre()+""+nuevoCliente.getPrimerApellido()+""+nuevoCliente.getSegundoApellido();
                        datos[2] = nuevoCliente.getTelefono();
                        datos[3] = nuevoCliente.getDireccion();
                        datos[4]= nuevoCliente.getEmail();
                    this.frmClientes.modificarUsuarioTabla(datos);
                    this.frmClientes.estadoInicial();
                    this.frmClientes.mostrarMensaje("Cliente modificado");
                }
        
        if(e.getActionCommand().equals("Eliminar")){
                    this.metodosCliente.eliminar(this.frmClientes.getCedulaCliente());
                    this.frmClientes.eliminarUsuarioTabla(this.frmClientes.getCedulaCliente());
                    this.frmClientes.estadoInicial();
                    this.frmClientes.mostrarMensaje("Cliente eliminado");
                }
    }
    public void inicioTabla(){
        for(Cliente item:this.metodosCliente.getArray()){
            if(item!=null){
                String[] datos=new String[5];
                datos[0] = item.getCedulaCliente();
                        datos[1] = item.getNombre()+""+item.getPrimerApellido()+""+item.getSegundoApellido();
                        datos[2] = item.getTelefono();
                        datos[3] = item.getDireccion();
                        datos[4]= item.getEmail();
                this.frmClientes.agregarUsuarioTabla(datos);
                
            }
        }
    }
    
    public void consolidarInformacion(){
        this.registroClientesJSON.setArray(this.metodosCliente.getArray());
        this.registroClientesJSON.escribirDatos();
    }
   
        public Controlador_FRM_Clientes(FRM_Clientes frm){//frm es la interfaz
            this.frmClientes = frm;
            this.registroClientesJSON=new RegistroClientesJSON();
            this.metodosCliente = new MetodosCliente(this.registroClientesJSON.getLista());

        }
    
}
