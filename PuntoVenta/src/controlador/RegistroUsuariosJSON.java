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
import modelo.Usuario;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author JeanC
 */
public class RegistroUsuariosJSON {
        private ArrayList<Usuario> usuarios;
    
    public RegistroUsuariosJSON(){
        this.usuarios=new ArrayList<Usuario>();
        File file=new File("registroUsuarios.json");
        if(file.exists()){
            this.extraerInformacion();
        }
    }
    
    public void extraerInformacion(){
        JSONParser parser=new JSONParser();
        
        try{
            Object obj=parser.parse(new FileReader("registroUsuarios.json"));
            
            JSONObject objJSON=(JSONObject) obj;
            
            JSONArray usuariosJSON=(JSONArray) objJSON.get("ListaUsuarios");
            
            for(Object usuario:usuariosJSON){
                Usuario usr=new Usuario();
                
                JSONObject objUserJSON=(JSONObject) usuario;
                
                usr.setUsuario(objUserJSON.get("usuario").toString());
                usr.setContrasena(objUserJSON.get("contraseña").toString());
                usr.setNombreCompleto(objUserJSON.get("nombreC").toString());
                usr.setTipo(objUserJSON.get("tipo").toString());
                
                
                this.usuarios.add(usr);
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
        JSONObject usuarioJSON=new JSONObject();
        JSONArray arrayJSON=new JSONArray();
        
        for(Usuario item:this.usuarios){
            JSONObject jsonObj=new JSONObject();
            
            jsonObj.put("usuario", item.getUsuario());
            jsonObj.put("contraseña", item.getContrasena());
            jsonObj.put("nombreC", item.getNombreCompleto());
            jsonObj.put("tipo", item.getTipo());
            
            arrayJSON.add(jsonObj);
        }
        usuarioJSON.put("ListaUsuarios",arrayJSON);
        
        try{
            FileWriter file=new FileWriter("registroUsuarios.json");
            file.write(usuarioJSON.toString());
            file.flush();
        }catch(IOException ex){
            
        }
        
    }
    
    public ArrayList<Usuario> getLista(){
        return this.usuarios;
    }
    
    public void setArray(ArrayList<Usuario> array){
        this.usuarios=array;
    }
    
}
