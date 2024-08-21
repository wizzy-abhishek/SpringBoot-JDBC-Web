<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
<title>Create Account</title>
<link href="WEBSITE_LOGO.png" rel="icon" type="image/x-icon">
<style>
  .full-height {
    height: 100vh;
  }
  .form-container {
    margin-top: 10px;
  }
</style>
</head>
<body>
<div class="container d-flex flex-column justify-content-center align-items-center full-height">
  <div class="header text-center">
    <img src="Batman.png" alt="Website Logo" height="250" width="250">
  </div>

  <div class="d-flex flex-column justify-content-center align-items-center form-container">
    <div class="form-container text-center">
      <form action="creating">
        <h2>Your Details are SAFE with US </h2>

        <div class="mb-3">
          <input name="name" type="text" class="form-control" id="text" placeholder="Buddy Your Name" required style="width: 250px; margin: 0 auto;">
        </div>

		<div class="mb-3 position-relative">
          <input name="mobile" type="text" class="form-control" id="text" placeholder="Mobile Number" required style="width: 250px; margin: 0 auto;">
        </div>

        <button type="submit" class="btn btn-primary btn-sm mx-auto" style="width: 250px; height: 40px ; margin: 0 auto;">CREATE</button>
        <br>
      </form>

         </div>
  </div>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>