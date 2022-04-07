<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file = "navbar.jsp" %>
<%@page isELIgnored="false" %>
<% String uuname =(String) request.getSession().getAttribute("uname");
if (uuname ==null)
{
%>
<jsp:forward page = "index.jsp" />
<% 
}
%>
<html>
<head>
<script src="https://kit.fontawesome.com/291b208b59.js" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/css/medical_report.css">
<title>Insert title here</title>
</head>
<body>
    <div class= "heads">Message Report</div>
		<form id="form" class="validate">
     <c:forEach items="${med}" var="element">  
	  <div class="form-field">
	  <c:if test ="${element.role ==  'User'}">
		<label for=""><h2 style = "font-family:Serif;">UserPid:${ element.pid }</h2></label> <input type="text" style = "color:black;" name="medicine" value = ${element.message } id="" readonly required />
		</c:if>
		<c:if test = "${element.role ==  'Doctor'}">
		<label for=""><h2 style = "font-family:Serif;">Doctor:${ element.doctor }</h2></label> <input type="text" style = "color:black;" name="medicine" value = ${element.message } id="" readonly required />
		</c:if>
		</div>
    </c:forEach>  
    </form>
	
    <form method="post" action="/messagereport/${pid}" method="post"
		id="form" class="validate">
            <div class="form-field">
				<label for="text-input">Role</label> <input type="text"
					name="role"  value = ${role} id="text-input"  readonly required />
			</div>
			<div class="form-field">
				<label for="text-input">Message</label> <input type="text"
					name="message" id="text-input" placeholder="medicine" required />
			</div>
            <div class="form-field">
				<label for=""></label> <input type="submit" name = "Add" value="Add" />
			</div>

        <div class="form-field">
				<label for=""></label> <input type="submit" name="End Messages" value="End Messages" />
			</div>
            
			
	</form>
    </body>
</html>
