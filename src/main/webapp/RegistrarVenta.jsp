<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	<div class="d-flex">
		<div class="col-sm-5">
			<div class="card">
				<form action="Controlador" method="post">
					<div class="card-body">
					<div class="form-group">
						<label>Datos del cliente</label>
					</div>
					<div class="form-group d-flex">
						<div class="col-sm-4 d-flex">
							<input type="text" name="codigocliente" class="form-control col-sm-4" placeholder="codigo">
						</div>
						<div class="col-sm-2">
							<input type="submit" name="accion" value="Buscar" class="btn btn-outline-dark">
						</div>
						<div class="col-sm-6">
							<input type="text" name="nombrescliente" placeholder="Datos del cliente" class="form-control">
						</div>	
					</div>
					<br>
					<div class="form-group">
						<label>Datos Producto</label>
					</div>
					<div class="form-group d-flex">
						<div class="col-sm-4 d-flex">
							<input type="text" name="codigoproducto" class="form-control col-sm-4" placeholder="codigo">
						</div>
						<div class="col-sm-2">
							<input type="submit" name="accion" value="Buscar" class="btn btn-outline-dark">
						</div>
						<div class="col-sm-6">
							<input type="text" name="nombreproducto" placeholder="Datos del producto" class="form-control">
						</div>	
					</div>
					<br>
					<div class="form-group d-flex">
						<div class="col-sm-6 d-flex">
							<input type="text" name="precio" class="form-control col-sm-4" placeholder="$/.0.00">
						</div>
						<div class="col-sm-3">
							<input type="number" name="cant" placeholder="" class="form-control">
						</div>
						<div class="col-sm-3">
							<input type="text" name="stock" placeholder="Stock" class="form-control">
						</div>	
					</div>
					<div class="form-group">
						<input type="submit" name="accion" value="Agregar" class="btn btn-outline-dark">
					</div>	
					</div>
				</form>
			</div>
		</div>
		<div class="col-sm-7">
			<div class="card">
				<div class="card-body">
					<div class="d-flex col-sm-5 ml-auto">
						<label>Numero de serie</label>
						<input type="text" name="NroSerie" placeholder="N° de serie" class="form-control">
					</div>
					<br>
					<table class="table table-hover">
						<thead>
							<tr>
								<th>Nro</th>
								<th>Codigo</th>
								<th>Descripcion</th>
								<th>Precio</th>
								<th>Cantidad</th>
								<th>Subtotal</th>
								<th>IVA</th>
								<th>Total</th>
								<th>Acciones</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
							</tr>
						</tbody>
					</table>
				</div>
				<div class="card-footer">
					<div>
						<input type="submit" name="accion" value="Generar Venta" class="btn btn-success">
						<input type="submit" name="accion" value="Cancelar" class="btn btn-danger">
					</div>
				</div>
			</div>	
		</div>
	</div>
	
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
</body>
</html>