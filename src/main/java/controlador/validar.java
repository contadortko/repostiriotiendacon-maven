package controlador;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Usuario;
import modelo.ModeloUsuario;


public class validar extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
    public validar() {
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(jakarta.servlet.http.HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
			
			String accion = request.getParameter("accion");
			
			if (accion.equalsIgnoreCase("Ingresar")) {
				String user=request.getParameter("txtuser"); //con esta linea de codigo se recibe el user
				String pass=request.getParameter("txtpass"); //con esta linea de codigo se recibe la contraseña
				ModeloUsuario udao = new ModeloUsuario(); // instanciamos la entidad bd_usuariosDAO
				Usuario usuario = udao.iniciarSesion(user,pass);
				
				if (usuario !=null) {
					request.setAttribute("user", usuario);// para que en el login aparezca el nombre del usuario y demas datos, tomas los atributos de la tabla sql
					request.getRequestDispatcher("Controlador?menu=principal").forward(request, response);
				
				}else {
					request.getRequestDispatcher("index.jsp").forward(request, response);
				}	
			}else{
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
		
			
	}
}
