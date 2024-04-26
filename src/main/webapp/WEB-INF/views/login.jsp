<%@	taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <title>Login</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="<%=request.getContextPath() %>/resources/css/login.css" rel="stylesheet">
    <!-- Core CSS - Include with every page -->
    <link href="<%=request.getContextPath() %>/resources/css/styless.css" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/resources/font-awesome/css/font-awesome.css" rel="stylesheet">
    <script src="<%=request.getContextPath() %>/resources/js/jquery-1.10.2.js"></script>
    <script src="<%=request.getContextPath() %>/resources/js/bootstrap.min.js"></script>
    <script src="<%=request.getContextPath() %>/resources/js/plugins/metisMenu/jquery.metisMenu.js"></script>
    <script src="<%=request.getContextPath() %>/resources/js/sb-admin.js"></script>
    <link href="<%=request.getContextPath() %>/resources/css/sb-admin.css" rel="stylesheet">
<style>
body {
  background-image: url("<%=request.getContextPath() %>/resources/images/background1.jpg");
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: 100% 100%;
}
</style>
</head>
<body >
<div class="main">
    <p class="sign" align="center"> Connexion </p>
    <c:if test="${!empty error}">
    	<div class="text-danger" align="center"> ${error} </div>
    </c:if>
    <c:if test="${!empty logoute}">
    	<div class="text-primary" align="center">${logoute} </div>
    </c:if>
    <p></p>
    <form role="form" class="flogin" action="/usersService/login" method="post" >
      	<input class="un " type="text" align="center" placeholder="Identifiants" name="username" value="">
      	<input class="un" type="password" align="center" placeholder="Mot de passe" name="password" value="">
      	<button class="submit" align="center" value="login" name="submit">connexion</button>
     </form>
      <p></p>
     <p class="forgot" align="center"> <a href="#"> Mot de passe oublié? </a> </p>         
  </div>
</body>
</html>