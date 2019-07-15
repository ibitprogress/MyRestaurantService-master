<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<h1 class="h1_form">_ADMIN_</h1>
<sec:authorize access="hasRole('ROLE_ADMIN')">
	<label>add: </label>
	<hr>
	<label>- category: <a href="admin/category/categoryCreate">add
			category</a></label>
	<hr>
	<label>- menu to category: <a
		href="admin/product/createProduct">add menu</a></label>
	<hr>
	<label>- news: <a href="admin/news/addNews">add news</a></label>
	<hr>
</sec:authorize>
<h3>View Category</h3>
<table align="center" border="1px">
	<tr>
		<td width="40%"><strong>Category Name: </strong></td>
		<td width="60%"><strong>Category Description: </strong></td>
	</tr>
	<c:forEach items="${category }" var="item">


		<tr align="center">
			<td>
				<div>${item.name}</div>
			</td>
			<td>
				<div>${item.description}</div>
			</td>
			<td><a href="admin/category/${item.id}/edit">EDIT</a></td>
			<td><a href="admin/category/${item.id}/delete">DELETE</a></td>
		</tr>
	</c:forEach>
</table>

<h3>VIEW PRODUCT</h3>
<table border="1px">
	<tr>
		<td><strong>Product Name:</strong></td>
		<td><strong>Product Description:</strong></td>
		<td><strong>Product Price:</strong></td>
		<td><strong>Product Category ID:</strong></td>
	</tr>

	<c:forEach items="${product }" var="item">
		<tr>
			<td>${item.name }</td>
			<td>${item.description }</td>
			<td>${item.price }$</td>
			<td>${item.category.getName() }</td>
		</tr>
	</c:forEach>

</table>
