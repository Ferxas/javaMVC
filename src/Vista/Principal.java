/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.*;
import javax.swing.*;

public class Principal extends JFrame {

    public JTextField ccodigo, cnombre, capellido, cedad, chora, cvalor, ctotal,vplacahsms;
    JLabel lnivel, lnombre, lapellido, ledad, lhora, lvalor, ltotal,lvplacahsms,lcontraseña,lcorreo;
    public JButton guardar,actualizar, eliminar, buscar,validar;
    JTextField lista;
    public JTextField ccontraseña,ccorreo;
 public   JComboBox <String>combo;
     String[] opciones = {"admin","empleado","cliente"};
    public Principal() {
       combo= new JComboBox<>(opciones);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        vplacahsms = new JTextField(10);
        ccodigo = new JTextField(10);
        lnivel = new JLabel("Nivel");
        lnombre = new JLabel("Nombre");
        cnombre = new JTextField(10);
        lapellido = new JLabel("Apellido");
        capellido = new JTextField(10);
        cedad = new JTextField(10);
        ledad = new JLabel("Edad");
        lhora = new JLabel("Horas");
        lvalor = new JLabel("Valor");
        ltotal = new JLabel("Total");
        lvplacahsms = new JLabel("lvplacahsms");
        chora = new JTextField(10);
        cvalor = new JTextField(10);
        ctotal = new JTextField(10);
        ccontraseña = new JTextField(10);
        lcontraseña = new JLabel("Contraseña");
        ccorreo = new JTextField(10);
        lcorreo = new JLabel("correo");
        guardar = new JButton("Guardar"); // Create the button instance
        actualizar = new JButton("Actualizar");
        eliminar = new JButton("Eliminar");
        buscar = new JButton("Buscar");
         validar = new JButton("validar");

         lista = new JTextField(10);
        String listas[] = {"Admin"," cliente","empleado"};
        
         JTextArea usus;
        JScrollPane sc;

        usus= new JTextArea(10, 20);
        sc = new JScrollPane(usus, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        c.add(usus);
        c.add(lnivel);
        c.add(combo);
        
        //c.add(ccodigo);
        c.add(lnombre);
        c.add(cnombre);
        c.add(lapellido);
        c.add(capellido);
        c.add(ledad);
        c.add(cedad);
        c.add(lcontraseña);
        c.add(ccontraseña);
        c.add(lcorreo);
        c.add(ccorreo);
        c.add(guardar);
       /* c.add(lhora);
        c.add(chora);
        c.add(lvalor);
        c.add(cvalor);
        c.add(ltotal);
        c.add(ctotal);
        c.add(lvplacahsms);
        c.add(vplacahsms);
        c.add(guardar); // Add the button to the container
 c.add(actualizar);
        c.add(eliminar);
        c.add(buscar);
        c.add(validar);*/
        
    }
 public JTextField getCvalor() {
        return cvalor;
    }
    public static void main(String[] args) {
        Principal p = new Principal();
        p.setSize(300, 500); // Increase the width to accommodate the components
        p.setLocationRelativeTo(null);
        p.setVisible(true);
    }
}

