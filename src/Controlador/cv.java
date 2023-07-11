


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ConsultasUsuario;
import Modelo.Usuario;
import Vista.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author andres
 */
public class cv implements ActionListener{
    
    Usuario modelo;
    Principal vista;
    ConsultasUsuario consultas;
    
    public cv(Usuario modelo, Principal vista, ConsultasUsuario consultas){
        
        this.modelo = modelo;
        this.vista = vista;
        this.consultas = consultas;
    
        this.vista.validar.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
if (e.getSource() == vista.validar) {
            // Obtener los valores de los campos de texto
            modelo.setB(vista.vplacahsms.getText());
           
           

            if (consultas.vehiculo(modelo)) {
                JOptionPane.showMessageDialog(null, "Registro Guardado");
              // limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error de Guardado");
               // limpiar();
            }    }
    }
    
}
