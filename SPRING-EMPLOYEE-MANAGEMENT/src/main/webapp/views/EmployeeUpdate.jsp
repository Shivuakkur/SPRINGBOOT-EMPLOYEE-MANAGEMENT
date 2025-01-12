<!DOCTYPE html>
<html>
<head>
  <title>Employee Update</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container">
  <div class="card">
    <div class="card-header bg-primary text-white text-center">
      <h3>Employee Update</h3>
    </div>
    <div class="card-body">
	<form action="update" method="POST">
	  <div class="form-group">
	    <label for="empId">Employee ID:</label>
	    <input type="text" class="form-control" id="empId" name="empId">
	  </div>
	  <div class="form-group">
	    <label for="name">Name:</label>
	    <input type="text" class="form-control" id="name" name="name">
	  </div>
	  <div class="form-group">
	    <label for="salary">Salary:</label>
	    <input type="text" class="form-control" id="salary" name="salary">
	  </div>
	  <button type="submit" class="btn btn-success">Update</button>
	</form>

    </div>
    <div class="card-footer bg-info text-white">
      <h3>${message}</h3>
    </div>
  </div>
</div>
</body>
</html>
