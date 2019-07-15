<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edit Category</title>
<jsp:include page="/WEB-INF/include/style-include.jsp" />
</head>
<body>
	<h1 class="h1_form">_EDIT CATEGORY_</h1>

	<h3>Edit Category</h3>
	<form:form id="login" method="POST" modelAttribute="category">
		<form:input path="id" type="hidden" />
		<fieldset id="inputs">
			<label>Name: </label>
			<form:input  path="name" />
			<form:errors path="name" />

			<label>Description: </label>
			<form:textarea  path="description" />
			<form:errors path="description" />
		</fieldset>
		<fieldset id="actions">
			<input id="submit" type="submit" value="Update Category">
		</fieldset>
	</form:form>

</body>
</html>