package Controlador;

import Modelo.UsuarioAdmin;
import Modelo.Usuarioempleado;
import Modelo.Usuariocliente;
import Modelo.ConsultasUsuario;
import Modelo.Usuario;
import Vista.Principal;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class ControladorUsuario implements ActionListener{
    
    Usuario modelo;
    Principal vista;
    ConsultasUsuario consultas;
    
    public ControladorUsuario(Usuario modelo, Principal vista, ConsultasUsuario consultas){
        
        this.modelo = modelo;
        this.vista = vista;
        this.consultas = consultas;
        this.vista.guardar.addActionListener(this);

    }
    
    
   @Override
    
public void actionPerformed(ActionEvent e) {
    if (e.getSource() == vista.guardar) {
        String opcion = (String) vista.combo.getSelectedItem();
        Usuario usuario = null;
        
        if ("admin".equals(opcion)) {
            UsuarioAdmin admin = new UsuarioAdmin();
            admin.setNombre(vista.cnombre.getText());
            admin.setApellido(vista.capellido.getText());
            admin.setEdad(Integer.parseInt(vista.cedad.getText()));
            admin.setContraseña(vista.ccontraseña.getText());
            admin.setCorreo(vista.ccorreo.getText());
            usuario = admin;
        } else if ("empleado".equals(opcion)) {
            Usuarioempleado emple = new Usuarioempleado();
            emple.setNombre(vista.cnombre.getText());
            emple.setApellido(vista.capellido.getText());
            emple.setEdad(Integer.parseInt(vista.cedad.getText()));
            emple.setContraseña(vista.ccontraseña.getText());
            emple.setCorreo(vista.ccorreo.getText());
            usuario = emple;
        } else if ("cliente".equals(opcion)) {
            Usuariocliente clien = new Usuariocliente();
            clien.setNombre(vista.cnombre.getText());
            clien.setApellido(vista.capellido.getText());
            clien.setEdad(Integer.parseInt(vista.cedad.getText()));
            clien.setContraseña(vista.ccontraseña.getText());
            clien.setCorreo(vista.ccorreo.getText());
            usuario = clien;
        }

        if (usuario != null && consultas.registrar(usuario)) {
            JOptionPane.showMessageDialog(null, "Registro Guardado");
            // limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Error de Guardado");
            // limpiar();
        }
    }
}

 public void inicio(){
        
        vista.setSize(100, 500);
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        
    }
}  
    
