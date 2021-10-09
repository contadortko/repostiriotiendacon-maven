package modelo;

public class Usuario {
	int id;
	String ced, user, nombre, pass, email;
	public Usuario(int id, String ced, String user, String nombre, String pass, String email) {
		super();
		this.id = id;
		this.ced = ced;
		this.user = user;
		this.nombre = nombre;
		this.pass = pass;
		this.email = email;
		
	}
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCed() {
		return ced;
	}
	public void setCed(String ced) {
		this.ced = ced;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}


