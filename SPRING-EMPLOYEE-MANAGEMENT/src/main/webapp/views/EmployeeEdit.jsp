<html>

 <head>

  <title>Document</title>

  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">

	<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.min.js"></script>

	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>

 </head>

 <body>

 <div class="container">

		<div class="card">

		<div class="card-header bg-primary text-white text-center">

				<h3>WELCOME TO EMPLOYEE EDIT PAGE </h3>

			</div>

	<div class="card-body"> 

	<form action="/employee/update" method="POST">


	 <pre>+

		
		<input type="hidden" name="empId" value="${emp.empId }">
		
		NAME  : <input type="text" name="empName" value="${emp.empName }" class="form-control"/>

		SALARY: <input type="text" name="empSal" value="${emp.empSal }"  class="form-control"/>

			<button type="submit" class="btn btn-success">Update</button>

	  </pre>

	</form>

	</div>

	<div class="card-footer bg-info text-white">

				<h3>	${message} </h3> 

			</div>

	

</div>

</div>

 </body>

</html>