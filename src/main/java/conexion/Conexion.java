package conexion;

import java.sql.*;

public class Conexion {
	
	//creamos un atributo que no cambie su valor
	private static final String CONTROLADOR = "com.mysql.cj.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/tiendavirtual";
	private static final String user = "root";
	private static final String pass = "";
	
	static {
        try {
            Class.forName(CONTROLADOR);
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el controlador");
            e.printStackTrace();
        }
    }
	
	//creamos un método de conexión reutilizable
	public static Connection conexion() {
		Connection con = null;
		try {
			Class.forName(CONTROLADOR);
			con = DriverManager.getConnection(url, user, pass);
			System.out.println("Conexión exitosa a la ruta "+url);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Error en el fichero" + e);
			
		}
		
		return con;
	}
	

 }
	
	

