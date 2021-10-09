package controlador;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.ModeloUsuario;
import modelo.Usuario;



public class Controlador extends HttpServlet {
	
	Usuario usuario = new Usuario(); //instanciamos la clase Usuario creando el objeto usuario
	ModeloUsuario udao = new ModeloUsuario(); //instanciamos la clase ModeloUsuario creando el objeto udao, la cual tiene los metodos del CRUD
	
	
	
	private static final long serialVersionUID = 1L;

    
    public Controlador() {
    	super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		//Menu para el CRUD
				String menu = request.getParameter("menu");
				String accion = request.getParameter("accion");
				
				switch (menu) {
				case "principal": 
					request.getRequestDispatcher("/principal.jsp").forward(request, response);
					break;
				case "Empleado": 
					request.getRequestDispatcher("/Empleado.jsp").forward(request, response);
					break;
				case "Clientes": 
					request.getRequestDispatcher("/Clientes.jsp").forward(request, response);
					break;
				case "Producto": 
					request.getRequestDispatcher("/Producto.jsp").forward(request, response);
					break;
				case "RegistrarVenta": 
					request.getRequestDispatcher("/RegistrarVenta.jsp").forward(request, response);
					break;
					
					
					
					
				default:
					throw new IllegalArgumentException("Unexpected value: " + menu);
				}
				
				
				
				
				
				
				
				
				
				/*if (menu.equals("Empleado")) {
					request.getRequestDispatcher("/Empleado.jsp").forward(request, response);
					switch (accion) {
					case "Listar":
						List lista = udao.listar();
						request.setAttribute("usuarios", lista);
						break;
					case "Agregar":
						String ced = request.getParameter("txtCedula");
						String user = request.getParameter("txtUsuario");
						String nombre = request.getParameter("txtNombre");
						String pass = request.getParameter("txtClave");
						String email = request.getParameter("txtEmail");
						usuario.setCed(ced);
						usuario.setUser(user);
						usuario.setNombre(nombre);
						usuario.setPass(pass);
						usuario.setEmail(email);
						udao.agregar(usuario);
						request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
						
						break;
					case "Modificar":
						
						
						break;
					case "Borrar":
			
			
						break;
						
						
					
					default:
						throw new IllegalArgumentException("Unexpected value: " + accion);
					}
						
				
						
						
						
						
				}*/
				
				
				
				
				
				
				/*if (menu.equals("Empleado")) {
					request.getRequestDispatcher("Empleado.jsp").forward(request, response);
					switch (accion) {
					case "Listar":
						List lista = udao.listar();
						request.setAttribute("usuarios", lista);
						
						
						break;
					case "Agregar":
						String ced = request.getParameter("txtCedula");
						String user = request.getParameter("txtUsuario");
						String nombre = request.getParameter("txtNombre");
						String pass = request.getParameter("txtClave");
						String email = request.getParameter("txtEmail");
						usuario.setCed(ced);
						usuario.setUser(user);
						usuario.setNombre(nombre);
						usuario.setPass(pass);
						usuario.setEmail(email);
						udao.agregar(usuario);
						request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
						
						break;
					case "Modificar":
						
						
						break;
					case "Borrar":
			
			
						break;
						
						
					
					default:
						throw new IllegalArgumentException("Unexpected value: " + accion);
					}
					
				}*/
				
				
			}
	
	//Menu para el CRUD
}
