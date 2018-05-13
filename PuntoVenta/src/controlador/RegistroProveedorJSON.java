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
import modelo.Provedor;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author JeanC
 */
public class RegistroProveedorJSON {
     private ArrayList<Provedor> proveedores;
    
    public RegistroProveedorJSON(){
        this.proveedores=new ArrayList<Provedor>();
        File file=new File("registroProveedor.json");
        if(file.exists()){
            this.extraerInformacion();
        }
    }
    
    public void extraerInformacion(){
        JSONParser parser=new JSONParser();
        
        try{
            Object obj=parser.parse(new FileReader("registroProveedor.json"));
            
            JSONObject objJSON=(JSONObject) obj;
            
            JSONArray proveedorJSON=(JSONArray) objJSON.get("ListaProveedor");
            
            for(Object pProveedor:proveedorJSON){
                Provedor proveedor=new Provedor();
                
                JSONObject objProveedorJSON=(JSONObject) pProveedor;
                
                proveedor.setCedulaJuridica(objProveedorJSON.get("cedulaJ").toString());
                proveedor.setNombreComercial(objProveedorJSON.get("nombreC").toString());
                proveedor.setContacto(objProveedorJSON.get("contacto").toString());
                proveedor.setDireccion(objProveedorJSON.get("direccion").toString());
                proveedor.setMontoCredito(objProveedorJSON.get("montoCredito").toString());
                proveedor.setDiasCredito(Double.parseDouble(objProveedorJSON.get("diasC").toString()));
                proveedor.setMoneda(objProveedorJSON.get("moneda").toString());
                
                this.proveedores.add(proveedor);
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
        JSONObject proveedorJSON=new JSONObject();
        JSONArray arrayJSON=new JSONArray();
        if(this.proveedores.size()>0){
        for(Provedor item:this.proveedores){
            JSONObject jsonObj=new JSONObject();
            
            jsonObj.put("cedulaJ", item.getCedulaJuridica());
            jsonObj.put("nombreC", item.getNombreComercial());
            jsonObj.put("contacto", item.getContacto());
            jsonObj.put("direccion", item.getDireccion());
            jsonObj.put("montoCredito", item.getMontoCredito());
            jsonObj.put("diasC", String.valueOf(item.getDiasCredito()));
            jsonObj.put("moneda", item.getMoneda());
          
            arrayJSON.add(jsonObj);
        }
        proveedorJSON.put("ListaProveedor",arrayJSON);
        
        try{
            FileWriter file=new FileWriter("registroProveedor.json");
            file.write(proveedorJSON.toString());
            file.flush();
        }catch(IOException ex){
            
        }
        }
    }
    
    public ArrayList<Provedor> getLista(){
        return this.proveedores;
    }
    
    public void setArray(ArrayList<Provedor> array){
        this.proveedores=array;
    }
    
}
