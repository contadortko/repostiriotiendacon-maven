<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<title>Tienda Virtual Equipo 7</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-dark">  <!-- barra de etiquetas y color -->	   
    	   <div class="collapse navbar-collapse" id="navbarSupportedContent">
      			<ul class="navbar-nav me-auto mb-2 mb-lg-0">
        			<li class="nav-item">
          				<a style="margin-left: 10px; border:none" class="btn btn-outline-light" href="Controlador?menu=principal" target="myFrame">Home</a>
        			</li>
        			<li class="nav-item">
          				<a style="margin-left: 10px; border:none" class="btn btn-outline-light" href="Controlador?menu=Producto" target="myFrame">Producto</a>
        			</li>
        			<li class="nav-item">
          				<a style="margin-left: 10px; border:none" class="btn btn-outline-light" href="Controlador?menu=Empleado&Listar" target="myFrame">Empleados</a>
        			</li>
        			<li class="nav-item">
          				<a style="margin-left: 10px; border:none" class="btn btn-outline-light" href="Controlador?menu=Clientes" target="myFrame">Clientes</a> 
        			</li>
        			<li class="nav-item">
          				<a style="margin-left: 10px; border:none" class="btn btn-outline-light" href="Controlador?menu=RegistrarVenta" target="myFrame">Nueva Venta</a>
        			</li>
      			</ul>
      			<form class="d-flex">
        			<input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        			<button class="btn btn-outline-success" type="submit">Search</button>
      			</form>
      			<div class="dropdown">
				  <button style="border:none; width:6.5cm; text-align:right" class="btn btn-outline-light dropdown-toggle" type="button" id="dropdownMenuButton1" data-bs-toggle="dropdown" aria-expanded="false">
				    ${user.getNombre()}
				  </button>
				  <div class="dropdown-menu text-center">
				    <a class="dropdown-item" href="#">
				    	<img src="img/logo user.jpg" alt="60" width="60" />
				    </a>
				    <a class="dropdown-item" href="#">${user.getUser()}</a>
				    <a class="dropdown-item" href="#">${user.getEmail()}</a>
				    <div class="dropdown-divider"> </div>
				    <form action="validar" method="POST">
				    	<button name="accion" value="Salir"class="dropdown-item" href="#">Salir</button> <!-- boton para salir de la web app -->
				    </form>
				  </div>
				</div>		
   			</div>
	</nav>
				<div class="m-4" style="height: 550px;">
		<iframe name="myFrame" style="height: 100%; width: 100%; border: solid"></iframe> <!-- no he logrado que se quite el borde de la tabla T.T -->
	</div>
	
	
	
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
	
</body>
</html>