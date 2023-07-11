/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectomvc;

import Controlador.ControladorUsuario;
import Modelo.ConsultasUsuario;
import Vista.Principal;
import Modelo.Usuario;

/**
 *
 * @author Xray
 */
public class ProyectoMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Usuario modelo = new Usuario();
        Principal vista = new Principal();
        ConsultasUsuario consultas = new ConsultasUsuario();
        
        ControladorUsuario cu = new ControladorUsuario(modelo, vista,consultas);
        cu.inicio();
    }
    
}
