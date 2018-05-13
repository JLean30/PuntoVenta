/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import modelo.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class MetodosUsuarios {
    private   ArrayList<Usuario> usuarios;
    private String usuarioLogueo;

    public   MetodosUsuarios(ArrayList<Usuario> array){
        this.usuarios =array;
       
        
    }
    
    //Se carga de agregar usuarios en la lista
    public  void agregar(Usuario pUsuario){
        this.usuarios.add(pUsuario);
    }
    public void modificar(Usuario pUsuario){
        for(Usuario item:this.usuarios){
            if(item.getUsuario().equals(pUsuario.getUsuario())){
                item.setContrasena(pUsuario.getContrasena());
                item.setNombreCompleto(pUsuario.getNombreCompleto());
                item.setTipo(pUsuario.getTipo());
                break;
            }
        }
    }
    public void eliminar(String  pUsuario){
        for(Usuario  item:this.usuarios){
            if(item.getUsuario().equals(pUsuario)){
                this.usuarios.remove(item);
                break;
            }
        }
        
    }
    
    public  boolean buscar(Usuario pUsuario){
        boolean  encontrado = false;
        
        for(Usuario  item:this.usuarios){
            //se valida que el usuario  y contraseña sean correctos
            if(item.getUsuario().equals(pUsuario.getUsuario()) && 
                    item.getContrasena().equals(pUsuario.getContrasena())){
                        encontrado = true;
                        break;
            }
        }
        return encontrado;
    }
    
    public Usuario buscarPerfil(Usuario pUsuario) {
        Usuario temporal = null;
          for(Usuario item:this.usuarios) {
              if(item!=null){
            if(item.getUsuario().equals(pUsuario.getUsuario())) {
                temporal = item;
                break;
            }
              }
        }
       return temporal;
    }

    public String getUsuarioLogueo() {
        return this.usuarioLogueo;
    }

    public void setUsuarioLogueo(String usuarioLogueo) {
        this.usuarioLogueo = usuarioLogueo;
    }

    public ArrayList<Usuario> getUsuarios() {
        return this.usuarios;
    }
    

    
    
    
    
    public String obtenerInformacionArray(){
        String lista="Lista usuario\n";
        for(Usuario item:this.usuarios){
            if(item!=null){
                lista+=item.getUsuario();
            }
        }
        return lista;
    }
    
}
