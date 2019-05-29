/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.de.persistencia;

/**
 *
 * @author Estudiante
 */
import java.io.*;
public class GestionDePersistencia {

  
    public static void main(String[] args) {
       File f=new File ("a.txt");
       
               if(f.exists()==true){
                   System.out.println("Existe");
                   System.err.println(f.length());
               }else{
                   System.out.println("No existe");
               }
             
               File X =new File("X");
    if(X.isDirectory()){
        System.out.println("Es directorio");
        listarArchivos(X);
        
}else{
        System.out.println("No es directorio");
}
    }
  public static void listarArchivos(File archivo){
      if(archivo.isDirectory()==true){
        String[] carpetas=archivo.list();
        for(String archivos:carpetas){
            File f=new File(archivo+"//"+archivos);
            listarArchivos(f);
        }
      }else{
        System.out.println(archivo);
      }
  }  
}
