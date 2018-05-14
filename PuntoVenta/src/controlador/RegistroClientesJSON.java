/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.util.ArrayList;
import modelo.Cliente;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author JeanC
 */

//clase JSON para Clientes 
public class RegistroClientesJSON {
    private ArrayList<Cliente> clientes;
    
    public RegistroClientesJSON(){
        this.clientes=new ArrayList<Cliente>();
        File file=new File("registroClientes.json");
        if(file.exists()){
            this.extraerInformacion();
        }
    }
    
    public void extraerInformacion(){
        JSONParser parser=new JSONParser();
        
        try{
            Object obj=parser.parse(new FileReader("registroClientes.json"));
            
            JSONObject objJSON=(JSONObject) obj;
            
            JSONArray clientesJSON=(JSONArray) objJSON.get("ListaClientes");
            
            for(Object cl:clientesJSON){
                Cliente cliente=new Cliente();
                
                JSONObject objClienteJSON=(JSONObject) cl;
                
                cliente.setCedula(objClienteJSON.get("cedula").toString());
                cliente.setNombre(objClienteJSON.get("nombre").toString());
                cliente.setPrimerApellido(objClienteJSON.get("primerAP").toString());
                cliente.setSegundoApellido(objClienteJSON.get("segundoAP").toString());
                cliente.setTelefono(objClienteJSON.get("telefono").toString());
                cliente.setDireccion(objClienteJSON.get("direccion").toString());
                cliente.setEmail(objClienteJSON.get("email").toString());
                
                this.clientes.add(cliente);
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
        JSONObject clienteJSON=new JSONObject();
        JSONArray arrayJSON=new JSONArray();
      
        for(Cliente item:this.clientes){
            JSONObject jsonObj=new JSONObject();
            
            jsonObj.put("cedula", item.getCedulaCliente());
            jsonObj.put("nombre", item.getNombre());
            jsonObj.put("primerAP", item.getPrimerApellido());
            jsonObj.put("segundoAP", item.getSegundoApellido());
            jsonObj.put("telefono", item.getTelefono());
            jsonObj.put("direccion", item.getDireccion());
            jsonObj.put("email", item.getEmail());
            arrayJSON.add(jsonObj);
        }
        clienteJSON.put("ListaClientes",arrayJSON);
        
        try{
            FileWriter file=new FileWriter("registroClientes.json");
            file.write(clienteJSON.toString());
            file.flush();
        }catch(IOException ex){
            
        }
        
    }
    
    public ArrayList<Cliente> getLista(){
        return this.clientes;
    }
    
    public void setArray(ArrayList<Cliente> array){
        this.clientes=array;
    }
    
}
