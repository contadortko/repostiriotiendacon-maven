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
	int ide;
	
	
	private static final long serialVersionUID = 1L;

    
    public Controlador() {
    	super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//Menu para el CRUD
		String menu = request.getParameter("menu");
		String accion = request.getParameter("accion");
		if(menu.equals("principal")) {
			request.getRequestDispatcher("principal.jsp").forward(request, response);
		}
		
		if (menu.equals("Empleado")) {
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
				ide=Integer.parseInt(request.getParameter("id"));
				Usuario e = udao.listarId(ide);
				request.setAttribute("Empleado", e);
				request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
				break;
			case "Actualizar":
				String ced1 = request.getParameter("txtCedula");
				String user1 = request.getParameter("txtUsuario");
				String nombre1 = request.getParameter("txtNombre");
				String pass1 = request.getParameter("txtClave");
				String email1 = request.getParameter("txtEmail");
				usuario.setCed(ced1);
				usuario.setUser(user1);
				usuario.setNombre(nombre1);
				usuario.setPass(pass1);
				usuario.setEmail(email1);
				usuario.setId(ide);
				udao.modificar(usuario);
				request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
				break;
			case "Borrar":
				ide=Integer.parseInt(request.getParameter("id"));
				udao.borrar(ide);
				request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
				break;
				
				
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + accion);
			}
		}
		
		if (menu.equals("Clientes")) {
			request.getRequestDispatcher("Clientes.jsp").forward(request, response);
		}
		
		if (menu.equals("Producto")) {
			request.getRequestDispatcher("Producto.jsp").forward(request, response);
		}
		
		if (menu.equals("RegistrarVenta")) {
			request.getRequestDispatcher("RegistrarVenta.jsp").forward(request, response);
		}
		
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
}
