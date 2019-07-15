
<%@page import="java.security.Principal"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!-- <script type="text/javascript">
	$(document).ready(function() {
		$("#test").click(function() {
			$.get("user/profile", function(name) {
				alert("Username" + name);
			});
		});
	});
</script> -->
<section class="widget">
	<sec:authorize access="!isAuthenticated()">
		<h4 class="h3_sidebar">
			<a href="login">Login</a> | <a href="register">Register</a>
		</h4>
	</sec:authorize>
	<sec:authorize var="loggedIn" access="isAuthenticated()">
		<c:choose>
			<c:when test="${loggedIn }">
				<div class="test">
					<h3 class="h3_sidebar">

						<a href="user/profile/${pageContext.request.userPrincipal.name}">
							View Profile</a>
					</h3>
				</div>
			</c:when>
		</c:choose>

		<c:url var="logoutUrl" value="/logout" />
		<form:form action="${logoutUrl}" method="post">
			<fieldset id="actions">
				<input id="submitSidebar" type="submit" value="LogOut" /> <input
					type="hidden" />
			</fieldset>
		</form:form>
	</sec:authorize>
</section>

<article class="principle ten">
    <div class="shape"></div>
  </article>