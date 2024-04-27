<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>AjouterClient</title>
    <link href="<%=request.getContextPath() %>/resources/css/sb-admin.css" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/resources/font-awesome/css/font-awesome.css" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/resources/css/plugins/dataTables/dataTables.bootstrap.css" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/resources/css/sb-admin.css" rel="stylesheet">
</head>
<body>
    <div id="wrapper">
  	<nav class="navbar navbar-default navbar-fixed-top" role="navigation" style="margin-bottom: 0">
    	<%@ include file="/WEB-INF/views/includes/entete.jsp" %>
    <div class="navbar-default navbar-static-side" role="navigation">
    	<%@ include file="/WEB-INF/views/menu_left/menuLeft.jsp" %>
   	</div>
    </nav>
         <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Nouvel utilisateur</h1>
                    <div class="panel panel-primary">
					           	<div class="panel-heading">
					                           Informations
					            </div>
					                        <div class="panel-body">
								  				<form action="/usersService/users" method="post">
										    				<div class="form-group">
										    				
					                                            <label><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Nom</font></font></label>
					                                                                                        
					                                            <input name="nom" class="form-control" placeholder="Nom" required="required" />
					                                            
					                                        </div>
					                                        <div class="form-group">
										    				
					                                            <label><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Prénom</font></font></label>
					                                                                                        
					                                            <input name="prenom" class="form-control" placeholder="Prenom" required="required" />
					                                            
					                                        </div>
					                                        <div class="form-group">
										    				
					                                            <label><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Adresse</font></font></label>
					                                                                                        
					                                            <input name="adresse" class="form-control" placeholder="Adresse" required="required" />
					                                            
					                                        </div>
					                                        <div class="form-group">
										    				
					                                            <label><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Mail</font></font></label>
					                                                                                        
					                                            <input name="mail" class="form-control" placeholder="Mail" required="required" />
					                                            
					                                        </div>
					                                        <div class="form-group">
										    				
					                                            <label><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Téléphone</font></font></label>
					                                                                                        
					                                            <input name="phone" class="form-control" placeholder="Telephone" required="required" />
					                                            
					                                        </div>

					                            			<div class="panel-footer">
							                                        <button type="submit" class="btn btn-primary"><i class="fa fa-save"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">&nbsp;Enregistrer</font></font></i></button>
							                                      <a href="/usersService/users" class="btn btn-danger"><i class="fa fa-arrow-left"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">&nbsp;Annuler</font></font></i></a>      
					                                        </div>
					                   				</form>	
					                        </div>
					                    </div>
					                </div>
                    </div>
                 </div>
            </div>
    <script src="<%=request.getContextPath() %>/resources/js/sb-admin.js"></script>
    <script src="<%=request.getContextPath() %>/resources/js/jquery-1.10.2.js"></script>
    <script src="<%=request.getContextPath() %>/resources/js/bootstrap.min.js"></script>
    <script src="<%=request.getContextPath() %>/resources/js/plugins/metisMenu/jquery.metisMenu.js"></script>
    <script src="<%=request.getContextPath() %>/resources/js/plugins/dataTables/jquery.dataTables.js"></script>
    <script src="<%=request.getContextPath() %>/resources/js/plugins/dataTables/dataTables.bootstrap.js"></script>
    <script src="<%=request.getContextPath() %>/resources/js/sb-admin.js"></script>
    <script>
    $(document).ready(function() {
        $('#dataTables-example').dataTable();
    });
    </script>
</body>
</html>