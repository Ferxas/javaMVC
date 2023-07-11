/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author andres
 */
public class UsuarioAdmin extends UsuarioModelo{
    
    public UsuarioAdmin(){
      super ();
      
    }
   public UsuarioAdmin (String nombre,String apellido,String contrasena,String correo,int edad, int codigo){
       super(nombre, apellido,contrasena,correo, edad,  codigo);
       
   }
}