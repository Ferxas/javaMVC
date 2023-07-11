/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author andres
 */
public class UsuarioModelo {
    protected   String nombre;
    protected   String apellido;
    protected   int edad;
    protected   int codigo;
     protected   String contraseña;
     protected   String correo;
     public UsuarioModelo(){
       
      nombre = "";
      apellido = "";
      edad = 0;
      codigo = 0;
      contraseña ="";
      correo = "";
      
     }
     
    public UsuarioModelo(String nombre,String apellido,String contraseña,String correo, int edad, int codigo){
         
      this.nombre=nombre;
      this.codigo=codigo;
      this.apellido=apellido;
      this.edad=edad;
      this.contraseña=contraseña;
      this.correo=correo;
    
}

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}