/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import modelo.Provedor;
import java.util.ArrayList;

/**
 *
 * @author JeanC
 */
public class MetodosProvedor {
    //Declarar ArrayList
    private ArrayList<Provedor> provedor;

    public MetodosProvedor() {
        //Instanciar ArrayList
        this.provedor = new ArrayList<>();
    }
    //Metodo de agregar objeto al ArrayList
    public void agregar(Provedor pProv){
        this.provedor.add(pProv);
    }
    //Método encargado de modificar productos en la lista
    public void modificar(Provedor pProv){
        //Uso del forEach para recorrer listas de objetos
        for(Provedor pItem:this.provedor){
            if(pItem.getCedulaJuridica().equals(pProv.getCedulaJuridica())){
                
                pItem.setCedulaJuridica(pProv.getCedulaJuridica());
                pItem.setNombreComercial(pProv.getNombreComercial());
                pItem.setContacto(pProv.getContacto());
                pItem.setDireccion(pProv.getDireccion());
                pItem.setDireccion(pProv.getDireccion());
                pItem.setMontoCredito(pProv.getMontoCredito());
                pItem.setDiasCredito(pProv.getDiasCredito());
                pItem.setMoneda(pProv.getMoneda());
                
            }
            break;
        }
        
    }
    
    //Metodo para eliminar obejtos del ArraList
    public void eliminar(String cedula){
        for(Provedor pItem:this.provedor){
            if(pItem.getCedulaJuridica().equals(cedula)){
                this.provedor.remove(pItem);
                break;
                
            }
        }
    }
    
    //Método encargado para buscar un producto en la lista
    public Provedor busqueda(String cedula){
        Provedor  temporal = null;
        
        for(Provedor  pItem:this.provedor){
            
            if(pItem.getCedulaJuridica().equals(cedula)){
                temporal =pItem;
            }
            
        }
        return  temporal;
    } 
    
    //Metodo que se encarga de leer la informacion que se ingresa y a su vez generar un objeto tipo Provedor 
    
    public Provedor obtenerInformacion(vista.FRM_Provedores frm){
        
        Provedor temporal = null;
        temporal = new Provedor(frm.getCedula(),
                frm.getNombreComercial(),
                frm.getContacto(),
                frm.getDireccion(),
                frm.getMontoCredito(),
                frm.getDiasCredito(),
                frm.getMoneda());
        
        return temporal;
        
        
        
    }
    
    public ArrayList <Provedor> getArray(){
        return this.provedor;
    }
    
    
    
    
    
    
    
}
