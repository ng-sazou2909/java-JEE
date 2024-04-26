<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@	taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="controlle.dto.UtilisateurDTO"%>
<html lang="fr">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Clients</title>
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
                    <h1 class="page-header">Liste des utilisateurs</h1>
                    	<div class="row">
                    		<div class="col-lg-12">
                    			<ol class="breadcrumb">
                    				<li><a href="/usersService/users?add=OK"><i class="fa fa-plus">&nbsp;Ajouter</i></a></li>
                    				<li><a href="#"><i class="fa fa-upload">&nbsp;Exporter</i></a></li>
                    				<li><a href="#"><i class="fa fa-download">&nbsp;Importer</i></a></li>
                    			</ol>
                    		</div>
                    	</div>
                    <div class="panel panel-primary">
					                      	<div class="panel-heading">
					                           Utilisateurs
					                       </div>
					                        <!-- /.panel-heading -->
					                        <div class="panel-body">
					                            <div class="table-responsive">
					                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
					                                    <thead>
					                                        <tr>
					                                            <th>Nom</th>
					                                            <th>Prénom</th>
					                                            <th>Adresse</th>
					                                            <th>Email</th>
					                                            <th>Téléphone</th>
					                                            <th>Actions</th>
					                                        </tr>
					                                    </thead>
					                                    <tbody>
					                                    <c:when test="${empty users}">
											        		<p> Liste vide</p>
											        	</c:when>
											        	<c:when test="${not empty users}">
					                                    <c:forEach items="${users}" var="client">
					                                    	<c:if test="${not empty client.id}">
					                                    	<tr>
					                                            <td>${client.getNom()}</td>
					                                            <td>${client.prenom}</td>
					                                            <td>${client.adresse}</td>
					                                            <td>${client.mail}</td>
					                                            <td>${client.phone}</td>
					                                            <td align="center">
					                                            	<a href="/usersService/users?id=${client.id}"><i class="${client.id!=null?'fa fa-edit':''}">&nbsp;</i></a>
					                                            	&nbsp;&nbsp;
					                                            	<a href="#" style="color: red" data-toggle="modal" data-target="#myModal"><i class="${client.id!=null?'fa fa-trash-o':''}"></i></a>
												                            <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
												                                <div class="modal-dialog">
												                                    <div class="modal-content">
												                                        <div class="modal-header">
												                                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">×</font></font></button>
												                                            <h4 class="modal-title" id="myModalLabel"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Suppression</font></font></h4>
												                                        </div>
												                                        <div class="modal-body"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
												                                            Veuillez confirmer la suppression</font><font style="vertical-align: inherit;">    
												                                 		 </font><font style="vertical-align: inherit;"></font><font style="vertical-align: inherit;"></font></font></div>
												                                        <div class="modal-footer">
												                                            <button type="button" class="btn btn-default" data-dismiss="modal"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;"><i class="fa fa-arrow-left">&nbsp;Annuler</i></font></font></button>
												                                            <a href="/usersService/users?deleteId=${client.id}" type="button" class="btn btn-danger"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;"><i class="fa fa-trash-o">&nbsp;Confirmer</i></font></font></a>
												                                        </div>
												                                    </div>
												                                </div>
												                            </div>                          	
					                                            		</td>
					                                        		</tr>
					                                        	</c:if>
					                                    		</c:forEach>
					                                    	</c:when>
					                                    </tbody>
					                                </table>
					                            </div>
					                        </div>
					                    </div>
					                </div>
                    			</div>
                			 </div>
            			</div>
    <script src="<%=request.getContextPath() %>/resources/js/jquery-1.10.2.js"></script>
    <script src="<%=request.getContextPath() %>/resources/js/bootstrap.min.js"></script>
    <script src="<%=request.getContextPath() %>/resources/js/plugins/metisMenu/jquery.metisMenu.js"></script>
    <script src="<%=request.getContextPath() %>/resources/js/plugins/dataTables/jquery.dataTables.js"></script>
    <script src="<%=request.getContextPath() %>/resources/js/plugins/dataTables/dataTables.bootstrap.js"></script>
    <script src="<%=request.getContextPath() %>/resources/js/sb-admin.js"></script>
    $(document).ready(function() {
        $('#dataTables-example').dataTable();
    });
    </script>
</body>
</html>
