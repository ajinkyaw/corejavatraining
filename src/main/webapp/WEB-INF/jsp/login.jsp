<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login Form</title>
</head>
<body>
    <h2>Login Form</h2>
    <form:form modelAttribute ="login" action="/login-api" method="post">
        <label for="username">Username:</label>
        <form:input path="username" type="text" id="username" name="username"/><br><br>
		<form:errors path="username"/>
		
        <label for="password">Password:</label>
        <form:input path="password" type="password" id="password" name="password"/><br><br>
		<form:errors path="password"/>

        <input type="submit" value="Register"/>
    </form:form>
</body>
</html>
