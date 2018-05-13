/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Producto;
import java.util.ArrayList;

/**
 *
 * @author Melber
 */
public class MetodosProducto {
    private ArrayList<Producto> productos;
    
    public MetodosProducto(){
        this.productos = new ArrayList<>();
    }
    
    public void agregar(Producto pProduc){
        this.productos.add(pProduc);
    }
    public void modificar(Producto pProduc){
        for(Producto pItem:this.productos){
            if(pItem.getCodigo().equals(pProduc.getCodigo())){
                this.productos.remove(pItem);
                this.productos.add(pProduc);
            }
        }
    }
    public void eliminar(String pCodigo){
        for(Producto pItem:this.productos){
            if(pItem.getCodigo().equals(pCodigo)){
                this.productos.remove(pItem);
                break;
            }
        }
    }
    
    public Producto buscar(String pCod){
        Producto temporal=null;
        for(Producto pItem:this.productos){
            if(pItem.getCodigo().equals(pCod)){
                temporal = pItem;
                }
        }
        return temporal;
    }
    
    public Producto obtenerInformacion(vista.FRM_Productos frm){
          Producto temporal = null;
          
            
          
            temporal = new modelo.Producto(frm.getCodigo(),
                    frm.getDescripcion(), 
                    frm.getPrecioCompra(), 
                    frm.getPorDescuento(), 
                    frm.getPorImpuesto(), 
                    frm.getFechaRegistro()); 
            
            return temporal;
    }
    public ArrayList<Producto> getArray(){
        return this.productos;
    }
}
