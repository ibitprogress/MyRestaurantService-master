<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h1 class="h1_form">_Create Product_</h1>

<form:form id="login" method="POST" modelAttribute="product">
	<fieldset id="inputs">
		<label>Category:</label>
		<form:select path="category" >
			<c:forEach items="${categories }" var="item">
				<form:option value="${item.getId() }"> ${item.name}</form:option>
			</c:forEach>
		</form:select>
		<form:errors path="category" />

		<label>Product name:</label>
		<form:input path="name" />
		<form:errors path="name" />

		<label>Product Description:</label>
		<form:input path="description"  />
		<form:errors path="description" />

		<label>Product Price:</label>
		<form:input path="price" />
		<form:errors path="price" />
	</fieldset>
	<fieldset id="actions">
	<input type="submit" value="Create Product" id="submit" />
</fieldset>
</form:form>
<a href="admin/controll">back to admin</a>
</body>
