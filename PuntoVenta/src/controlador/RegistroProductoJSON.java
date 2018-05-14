/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import modelo.Producto;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author JeanC
 */
public class RegistroProductoJSON {
     private ArrayList<Producto> productos;
    
    public RegistroProductoJSON(){
        this.productos=new ArrayList<Producto>();
        File file=new File("registroProducto.json");
        if(file.exists()){
            this.extraerInformacion();
        }
    }
    
    public void extraerInformacion(){
        JSONParser parser=new JSONParser();
        
        try{
            Object obj=parser.parse(new FileReader("registroProducto.json"));
            
            JSONObject objJSON=(JSONObject) obj;
            
            JSONArray productoJSON=(JSONArray) objJSON.get("ListaProducto");
            
            for(Object cl:productoJSON){
                Producto producto=new Producto();
                
                JSONObject objProductoJSON=(JSONObject) cl;
                
                producto.setCodigo(objProductoJSON.get("codigo").toString());
                producto.setDescripcion(objProductoJSON.get("descrip").toString());
                producto.setFechaRegistro(objProductoJSON.get("fechaR").toString());
                producto.setPrecioCompra(Double.parseDouble(objProductoJSON.get("precioC").toString()));
                producto.setPorImpuesto(Double.parseDouble(objProductoJSON.get("impuesto").toString()));
                producto.setPorDescuento(Double.parseDouble(objProductoJSON.get("descuento").toString()));
          
                
                this.productos.add(producto);
            }
            
        }
        catch(FileNotFoundException ex){
            
        }
        catch(IOException ex){
            
        }
        catch(ParseException ex){
            
       }
    }
    
    public void escribirDatos(){
        JSONObject productoJSON=new JSONObject();
        JSONArray arrayJSON=new JSONArray();
  
        for(Producto item:this.productos){
            JSONObject jsonObj=new JSONObject();
            
            jsonObj.put("codigo", item.getCodigo());
            jsonObj.put("descrip", item.getDescripcion());
            jsonObj.put("fechaR", item.getFechaRegistro());
            jsonObj.put("precioC", String.valueOf(item.getPrecioCompra()));
            jsonObj.put("impuesto", String.valueOf(item.getPorImpuesto()));
            jsonObj.put("descuento", String.valueOf(item.getPorDescuento()));
          
            arrayJSON.add(jsonObj);
        }
        productoJSON.put("ListaProducto",arrayJSON);
        
        try{
            FileWriter file=new FileWriter("registroProducto.json");
            file.write(productoJSON.toString());
            file.flush();
        }catch(IOException ex){
            
        }
        
    }
    
    public ArrayList<Producto> getLista(){
        return this.productos;
    }
    
    public void setArray(ArrayList<Producto> array){
        this.productos=array;
    }
}
