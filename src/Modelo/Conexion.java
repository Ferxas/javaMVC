/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Xray
 */

import java.sql.*;

public class Conexion {
    
    Connection con = null;
    String url = "jdbc:mysql://localhost:3306/usersmvcjava";
    String user = "root";
    String password = "";
    
    public Connection getConexion(){
        
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            
        }catch(ClassNotFoundException | SQLException e){
             System.err.println(e);
        }
                
        return con;
       
    }
    
}
