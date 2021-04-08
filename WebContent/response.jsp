<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Résultat</title>
</head>
<body bgcolor="lightblue">
<form action="index.html"  method="post">
<center>
<% 
   int o1= Integer.parseInt(request.getParameter("o1")); 
   int o2= Integer.parseInt(request.getParameter("o2")); 
   String operation = request.getParameter("operation");
   String resultat ="";
%> 
<%! float LRES; %>
<h1 style="color:green"> Affichage </h1>
<% 
if (operation.equals("addition")){ 
	resultat = String.valueOf(o1+o2);
	LRES = o1+o2;
}
if (operation.equals("soustraction")){ 
	resultat = String.valueOf(o1-o2);
	LRES = o1-o2;
}
if (operation.equals("multiplication")){ 
    resultat = String.valueOf(o1*o2);
    LRES = o1*o2;
}
if (operation.equals("division")){ 
	if (o2 == 0){
%>
<jsp:forward page="erreur.jsp"></jsp:forward>
<% 
	} else {
	resultat = String.valueOf(o1/o2);
	LRES = o1/o2;
}     }
%>
<hr>
 
    
 <h3 style="color:green">Résultat =<%= LRES %></h3><br>
       
  <input  type="submit" value="Back">
  </center>
  </form>
</body>
</html>