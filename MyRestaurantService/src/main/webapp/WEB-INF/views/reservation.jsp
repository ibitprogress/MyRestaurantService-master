<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

	<h1 class="h1_form">_RESERVATION_</h1>
	<p></p>
		<img alt="RestaurantMap" src="/resources/images/mapa.jpg">
		<hr>
		<sec:authorize access="!isAuthenticated()">
		<p></p>
			<h3>Only authenticated users can reservation table. Please <a href="login">login</a> or <a href="register">register</a></h3>
		</sec:authorize>
		<sec:authorize access="isAuthenticated()">
	<form:form id="login" method="POST" modelAttribute="reservation">
		<fieldset id="inputs" >
			<label>Reservation Date:</label>
			<form:input type="date" path="serviceDate"/>
			
			<label>ReservatoinTime:</label>
			<form:select path="serviceTime">
			<c:forEach begin="10" end="22" var="time">
				<form:option value="${time }">Time: ${time }:00</form:option>
			</c:forEach>
			</form:select>
			
			<label>TableNumber:</label>
			<form:select path="tableNumber">
			<c:forEach begin="1" end="14" var="tableN">
				<form:option value="${tableN }">Table №: ${tableN }</form:option>
			</c:forEach>
			</form:select>
		</fieldset >
		<fieldset id="actions">
			<input id="submit" type="submit" value="Reservations">
		</fieldset>
	</form:form>
	</sec:authorize>