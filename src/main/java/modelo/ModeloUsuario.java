package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import conexion.Conexion;

public class ModeloUsuario {
	
	//dejamos las siguientes variables goblales que serviran para realizar la consulta al login y a los métodos del CRUD
		Connection con = null;
		Usuario usuario = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		int r; //se usa para el método de agregar
	
	public Usuario iniciarSesion(String user, String pass) {
				
		try {
			con = Conexion.conexion();
			String sql = "SELECT * FROM usuarios WHERE user = ? AND contraseña = ?";
			pstm = con.prepareStatement(sql);
			pstm.setString(1, user);
			pstm.setString(2, pass);
			rs = pstm.executeQuery();
			
			while (rs.next()) {
				usuario = new Usuario();
				usuario.setUser(rs.getString("user"));
				usuario.setPass(rs.getString("contraseña"));
				usuario.setEmail(rs.getString("email"));
				usuario.setNombre(rs.getString("nombre"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				
				if (pstm != null) {
					pstm.close();
				}
				
				if (con != null) {
					con.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return usuario;
	}
	
	//creamos las operaciones CRUD
	
	public int agregar(Usuario e){
		String sql="Insert into usuarios (cedula, user, nombre, contraseña, email) values (?,?,?,?,?)"; //se agregan solo 5 valores ya que el ID es autoincremental
		try {
			con = Conexion.conexion();
			pstm = con.prepareStatement(sql);
			pstm.setString(1, usuario.getCed());
			pstm.setString(2, usuario.getUser());
			pstm.setString(3, usuario.getNombre());
			pstm.setString(4, usuario.getPass());
			pstm.setString(5, usuario.getEmail());
			pstm.executeUpdate();
			
		} catch (Exception e2) {
			
		}
		return r;    
    }
	
	public List listar(){
		
		String sql="select * from usuarios";
		List<Usuario>lista = new ArrayList<>();
		try {
			con = Conexion.conexion();
			pstm = con.prepareStatement(sql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				usuario = new Usuario();
				usuario.setId(rs.getInt(1));
				usuario.setCed(rs.getString(2));
				usuario.setUser(rs.getString(3));
				usuario.setNombre(rs.getString(4));
				usuario.setPass(rs.getString(5));
				usuario.setEmail(rs.getString(6));
				lista.add(usuario);
			}
			
		} catch (Exception e) {
		}
		return lista;
	    
    }
	
	public Usuario listarId(int id) {
		usuario = new Usuario(); 
		String sql="SELECT * FROM usuarios WHERE idUsuario="+id;
		try {
			con = Conexion.conexion();
			pstm = con.prepareStatement(sql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				usuario.setCed(rs.getString(2)); // es el # de columna que tiene en la tabla mySQL
				usuario.setUser(rs.getString(3));
				usuario.setNombre(rs.getString(4));
				usuario.setPass(rs.getString("contraseña")); //se puede poner el nombre de la columa o su numero como en los anteriores
				usuario.setEmail(rs.getString("email"));
			}
			
			
		} catch (Exception e) {
			
		}
		return usuario;
		
		
	}
	
	
	public int modificar(Usuario e){
		String sql="Update usuarios set cedula=?, user=?, nombre=?, contraseña=?, email=? where idUsuario =?"; //se actualiza o modifica teniendo como referencia el ID de cada usuario
		try {
			con = Conexion.conexion();
			pstm = con.prepareStatement(sql);
			pstm.setString(1, usuario.getCed());
			pstm.setString(2, usuario.getUser());
			pstm.setString(3, usuario.getNombre());
			pstm.setString(4, usuario.getPass());
			pstm.setString(5, usuario.getEmail());
			pstm.setInt(6, usuario.getId()); //se agrega esta fila al tener un objeto de consulta adicional
			pstm.executeUpdate();
			
		} catch (Exception e2) {
			
		}
		return r;
	    
    }
	public void borrar(int id){
		String sql="Delete FROM usuarios WHERE idUsuario="+id; //se toma como referencia para borrar el id que tenemos como parametro en el método borrar
		try {
			con = Conexion.conexion();
			pstm = con.prepareStatement(sql);
			pstm.executeUpdate();
			
			
		} catch (Exception e) {
			
		}
	    
    }
	
	
}
