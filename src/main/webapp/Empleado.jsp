<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<title>Tienda Virtual/Empleado</title>
</head>
<body>
	<div class="d-flex ">
		<div class="card col-sm-4">
		<div class="card-body">
			<form action="Controlador?menu=Empleado" method="POST">
				<div class="form-group">
					<label>Cedula</label>
					<input type="text" value="${em.getCed()}" name="txtCedula" class="form-control">
				</div>
				<div class="form-group">
					<label>Usuario</label>
					<input type="text" value="${em.getUser()}" name="txtUsuario" class="form-control">
				</div>
				<div class="form-group">
					<label>Nombre Completo</label>
					<input type="text" value="${em.getNombre()}" name="txtNombre" class="form-control">
				</div>
				<div class="form-group">
					<label>Clave</label>
					<input type="text" value="${em.getPass()}" name="txtClave" class="form-control">
				</div>
				<div class="form-group">
					<label>Email</label>
					<input type="text" value="${em.getEmail()}"name="txtEmail" class="form-control">
				</div>
				<input type="submit" name="accion" value="Agregar" class="btn btn-dark">
				<input type="submit" name="accion" value="Actualizar" class="btn btn-success">
				
			</form>
		</div >
	</div>
	<div class="col-sm-8">
		<table class="table table-hover" style="border:solid;">
			<thead>
				<tr>
					<th>CEDULA</th>
					<th>USUARIO</th>
					<th>NOMBRE COMPLETO</th>
					<th>CLAVE</th>
					<th>EMAIL</th>
					<th>ACCIONES</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="em" items="${usuarios}">
					<tr>
						<td>${em.getId()}</td>
						<td>${em.getCed()}</td>
						<td>${em.getUser()}</td>
						<td>${em.getNombre()}</td>
						<td>${em.getPass()}</td>
						<td>${em.getEmail()}</td>
						<td>
							<a class="btn btn-warning" href="Controlador?menu=Empleado&accion=Modificar&id=${em.getId()}">Editar</a> <!-- pendiente colocar los botones --> 
							<a class="btn btn-danger" href="Controlador?menu=Empleado&accion=Borrar&id=${em.getId()}">Borrar</a> <!-- pendiente colocar los botones --> 
						</td>
					</tr>
				</c:forEach>
					
				
			</tbody>
		</table>
	</div>
	</div>
	
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
</body>
</html>