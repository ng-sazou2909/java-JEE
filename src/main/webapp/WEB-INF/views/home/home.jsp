<%-- <%@ include file="/WEB-INF/views/includes/include.jsp" %> --%>
<!DOCTYPE html>
<html lang="fr">

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>page d'accueil</title>

    <!-- Core CSS - Include with every page -->
    <link href="<%=request.getContextPath() %>/resources/css/styles.css" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/resources/font-awesome/css/font-awesome.css" rel="stylesheet">
	
    <!-- Page-Level Plugin CSS - Blank -->

    <!-- SB Admin CSS - Include with every page -->
    <link href="<%=request.getContextPath() %>/resources/css/sb-admin.css" rel="stylesheet">
    <style>
body {
  background-image: url("<%=request.getContextPath() %>/resources/images/panier.png");
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: 100% 100%;
}
</style>

</head>

<body class="view" >

    <div id="wrapper">
    
  	<nav class="navbar navbar-default navbar-fixed-top" role="navigation" style="margin-bottom: 0">
    
    	<%@ include file="/WEB-INF/views/includes/entete.jsp" %>
    	
    <div class="navbar-default navbar-static-side" role="navigation">
    	
    	<%@ include file="/WEB-INF/views/menu_left/menuLeft.jsp" %>
    	
     <!-- /.sidebar-collapse -->
   	
   	</div>
    
     <!-- /.navbar-static-side -->
     
    </nav>
     <nav>
        <div class="fon" id="page-wrapper" style="background-image: url('<%=request.getContextPath() %>/resources/images/panier.png');">
        		
           
            
        
    </div>
    </nav>
    </div>
    <!-- /#wrapper -->

    <!-- Core Scripts - Include with every page -->
    <script src="<%=request.getContextPath() %>/resources/js/jquery-1.10.2.js"></script>
    <script src="<%=request.getContextPath() %>/resources/js/bootstrap.min.js"></script>
    <script src="<%=request.getContextPath() %>/resources/js/plugins/metisMenu/jquery.metisMenu.js"></script>

    <!-- Page-Level Plugin Scripts - Blank -->

    <!-- SB Admin Scripts - Include with every page -->
    <script src="<%=request.getContextPath() %>/resources/js/sb-admin.js"></script>

    <!-- Page-Level Demo Scripts - Blank - Use for reference -->
    
    <script>
 // Animations init
    new WOW().init();
 
   
    </script>
    
    
</div>
</body>
</html>
