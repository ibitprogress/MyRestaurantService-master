<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

	<h1 class="h1_form">_Register_</h1>
	<form:form id="login" method="POST" modelAttribute="user">
		<fieldset id="inputs">
			<label>FirstName: </label>
			<form:input path="firstName" id="username" placeholder="FirstName"/>
			<form:errors path="firstName" class="error_control" />

			<label>FirstName: </label>
			<form:input path="lastName"  id="username" placeholder="FirstName"/>
			<form:errors path="lastName" class="error_control" />

			<label>Login: </label>
			<form:input path="username" id="username" placeholder="Login"/>
			<form:errors path="username" class="error_control" />

			<label>Password: </label>
			<form:input path="password" type="password" id="password" placeholder="Password"/>
			<form:errors path="password" class="error_control" />

			<label>PhoneNumber: </label>
			<form:input path="phoneNumber"  id="username" placeholder="PhoneNumber"/>
			<form:errors path="phoneNumber" class="error_control" />

			<label>Email: </label>
			<form:input path="email"  id="username" placeholder="Email"/>
			<form:errors path="email" class="error_control" />
		</fieldset >
		<fieldset id="actions">
			<input id="submit" type="submit" value="Register">
		</fieldset>
	</form:form>