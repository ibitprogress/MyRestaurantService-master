<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1 class="h1_form">_Login Form_</h1>
<form:form method="post" id="login">
	<fieldset id="inputs">
			<label>User name:</label> <input name="username" type="text" id="username" placeholder="Login" autofocus required/> 
			<label>Password:</label> <input type="password" name="password" placeholder="Password" id="password" required/>
	</fieldset>
	<fieldset id="actions">
		<input type="submit" value="LogIn" id="submit">
	</fieldset>
</form:form>

</html>