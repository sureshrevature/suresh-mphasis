<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
.error{color:red}
</head>
<body>
<form:form action="connectagain" modelAttribute="emp">
Username : <form:input path="name"/>
Password(*) :<form:password path="pass"/>
<form:errors path="pass" cssClass="error"/><br>
<input type=submit value="submit">
</form:form> 
</body>
</html>