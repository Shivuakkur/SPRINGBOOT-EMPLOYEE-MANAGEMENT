<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>

<head>
  <title>Employee List</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container">
  <div class="card">
    <div class="card-header bg-primary text-white text-center">
      <h3>Employee List</h3>
    </div>
    <div class="card-body">
      <table class="table table-hover">
        <thead class="bg-info text-white">
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Salary</th>
            <th>OPERATIONS</th>
          </tr>
        </thead>
        <tbody>
          <c:forEach var="employee" items="${list}">
            <tr>
                <td>${employee.empId}</td>
                <td>${employee.empName}</td>
                <td>${employee.empSal}</td>
              <td>
                <a href="/employee/delete/${employee.empId}" class="btn btn-danger">DELETE</a> |
                <a href="/employee/edit/${employee.empId}" class="btn btn-warning">EDIT</a>
              </td>
            </tr>
          </c:forEach>
        </tbody>
      </table>
    </div>
  </div>
</div>
</body>
</html>
