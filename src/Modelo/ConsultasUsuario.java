package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ConsultasUsuario extends Conexion {
    // methods
    
    
    public boolean registrar(Usuario usu) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO usuarios(nombre, apellido, edad, correo, contrasena) VALUES (?, ?, ?, ?, ?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usu.getNombre());
            ps.setString(2, usu.getApellido());
            ps.setInt(3, usu.getEdad());
            ps.setString(4, usu.getCorreo());
            ps.setString(5, usu.getContrasena());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
             if (ps != null) {
                 ps.close();
             }
             if (con != null) {
                 con.close();
             }
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    public boolean actualizar(Usuario usu) {
        PreparedStatement ps = null;
        Connection con = null;
        String sql = "UPDATE usuarios SET nombre=?, apellido=?, edad=?, correo=?, contrasena=?";
        
        try {
            con = getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, usu.getNombre());
            ps.setString(2, usu.getApellido());
            ps.setInt(3, usu.getEdad());
            ps.setString(4, usu.getCorreo());
            ps.setString(5, usu.getContrasena());
            ps.setInt(6, usu.getCodigo());
            ps.executeQuery();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.err.println(e);       
            }
        }
    }
    
    public boolean eliminar(Usuario usu) {
        PreparedStatement ps = null;
        Connection con = null;
        String sql = "DELETE FROM usuarios WHERE codigo =?";
        
        try {
            con = getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.executeUpdate();
            return true;
            
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    public Usuario buscar(int codigo) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = null;
        String sql = "SELECT * FROM usuarios WHERE codigo=?";
        
        try {
            con = getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setCodigo(rs.getInt("codigo"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setEdad(rs.getInt("edad"));
                usuario.setCorreo(rs.getString("correo"));
                usuario.setContrasena(rs.getString("contrasena"));
                return usuario;
            }
            return null;
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
}