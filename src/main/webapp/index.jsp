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
<body style="background-image: url(https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse2.mm.bing.net%2Fth%3Fid%3DOIP.4wOKZvewAi9C7dG7zDGlugHaHK%26pid%3DApi&f=1); background-size:10rem;">
	<div class="container mt-4 col-lg-4">
		<div class="card col-sm-10"> <!-- modifica la presentación del LOGO y el mensaje de bienvenida -->
			<div class="card-body">
				<form class="form-sign" action="validar" method="POST">
					<div class="form-group text-center">
						<h3>Login Tienda Virtual</h3>
							<img src="img/logo virtual store.jpg" alt="100" width="270"/>
							<label><b>Bienvenidos al sistema</b></label>
					</div>
					<div class="form-group">
						<label>Usuario:</label>
						<input type="text" name="txtuser" class="form-control">
					</div>
					<div class="form-group">
						<label>Password:</label>
						<input type="password" name="txtpass" class="form-control">
					</div>
					<input type="submit" name="accion" value="Ingresar" class="btn btn-primary btn-block">
				</form>
			</div>
		</div>
	</div>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
	
</body>
</html>