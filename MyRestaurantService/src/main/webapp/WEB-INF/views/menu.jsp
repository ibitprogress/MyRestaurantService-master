<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1 class="h1_form">_MENU_</h1>
<table class="table_menu" >
	<tr>
		<td width="30%"><strong>Category: </strong></td>
		<td width="20%"><strong>Product Name: </strong></td>
		<td width="40%"><strong>Product Description: </strong></td>
		<td width="10%"><strong>Price: </strong></td>
	</tr>

	<c:forEach var="cat" items="${categories }">
		<tr>
			<td  style="text-align: center; font-size: 18px; font-style: italic; color: orange;"><c:out value="${cat.name }" /></td>
			<%-- <td><c:out value="${cat.description }"/> --%>
			<td></td>
			<td></td>
		</tr>
		<c:forEach var="prod" items="${cat.products}">
			<tr><td ></td>
				<td > - <c:out value="${prod.name }"/></td>
				<td > <c:out value="${prod.description }"/></td>
				<td style="text-align: center; font-size: 16px; color: #128821;">
				<c:out value="${prod.price}$"/><hr></td>
			</tr>
		</c:forEach>
	</c:forEach>
</table>