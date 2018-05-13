/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import modelo.Cliente;
import java.util.ArrayList;

/**
 *
 * @author JeanC
 */
public class MetodosCliente {
    
    //Declara ArrayList 
    private ArrayList<Cliente> clientes;

    public MetodosCliente(ArrayList <Cliente> arrayC) {
        //Instancia del ArrayList
        this.clientes = arrayC;
        
    }
    
    public void agregar(Cliente pProv){
        this.clientes.add(pProv);
    }
    
    public ArrayList <Cliente> getArray(){
        return this.clientes;
    }
    
    public void modificar(Cliente pProv){
        //Uso del forEach para recorrer listas de objetos
        for(Cliente pItem:this.clientes){
            if(pItem.getCedulaCliente().equals(pProv.getCedulaCliente())){
                
                pItem.setCedula(pProv.getCedulaCliente());
                pItem.setNombre(pProv.getNombre());
                pItem.setPrimerApellido(pProv.getPrimerApellido());
                pItem.setSegundoApellido(pProv.getSegundoApellido());
                pItem.setTelefono(pProv.getTelefono());
                pItem.setDireccion(pProv.getDireccion());
                pItem.setEmail(pProv.getEmail());
            
            }
        }
    }
    
    public void eliminar(String cedula){
        for(Cliente pItem:this.clientes){
            if(pItem.getCedulaCliente().equals(cedula)){
                this.clientes.remove(pItem);
                break;
            }
        }
    }
    
    public Cliente busqueda(String cedula){
        Cliente  temporal = null;
        
        for(Cliente  pItem:this.clientes){
            if(pItem.getCedulaCliente().equals(cedula)){
                temporal =pItem;
            }
        }
        return  temporal;
    }
    
    //Metodo con parametros 
    public Cliente obtenerInformacion(vista.FRM_Clientes frm){
        
        Cliente temporal = null;
        temporal = new Cliente(frm.getCedulaCliente(),
                frm.getNombre(),
                frm.getPrimerApellido(),
                frm.getSegundoApellido(),
                frm.getTelefono(),
                frm.getDireccion(),
                frm.getEmail());
        
        return temporal;
        
        
        
    }
    
    
            
            
            
            
                
            
    
    
    
    
}
