<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<h1 class="h1_form">_Edit Profile_</h1>
<form:form id="login" method="POST" modelAttribute="profile">
	<fieldset id="idUnvisible">
		<form:input path="id" type="hidden" />
		<label>Login:(No) </label>
		<form:input path="username" readonly="true" />
		<form:errors path="username" />

		<label>Password:(No) </label>
		<form:input path="password" type="password" readonly="true" />
		<form:errors path="password" />
	</fieldset>
	<fieldset id="inputs">
		<label>FirstName: </label>
		<form:input path="firstName" />
		<form:errors path="firstName" />

		<label>LastName: </label>
		<form:input path="lastName" />
		<form:errors path="lastName" />

		<label>PhoneNumber: </label>
		<form:input path="phoneNumber" />
		<form:errors path="phoneNumber" />

		<label>Email: </label>
		<form:input path="email" />
		<form:errors path="email" />
	</fieldset>
	<fieldset id="actions">
		<input id="submit" type="submit" value="Update Info">
	</fieldset>
</form:form>