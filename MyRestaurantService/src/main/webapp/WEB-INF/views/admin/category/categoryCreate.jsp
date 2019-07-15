<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<h1 class="h1_form">
	ADD CATEGORY 
</h1>
	<h3>Create Category</h3>
	<form:form id="login"  method="POST"
		modelAttribute="category" >
		<fieldset id="inputs">
			<label>Name: </label>
			<form:input  type="text" path="name" />
			<form:errors path="name" />
		</fieldset>
			<label>Description: </label>
			<form:textarea  path="description" />
			<form:errors path="description" />
		<fieldset id="actions">
			<input id="submit" type="submit" value="ADD">
		</fieldset>
	</form:form>