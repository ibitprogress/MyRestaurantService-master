<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<h1 class="h1_form">_View Profile_</h1>
<table class="table_profile">
	<tr>
		<td><label>Name: </label></td>
		<td>
			<h5>${profile.firstName }${profile.lastName }</h5>
		</td>
	</tr>
	<tr>
		<td><label>Login:</label></td>
		<td>
			<h5>${profile.username }</h5>
		</td>
	</tr>
	<tr>
		<td><label>Email:</label></td>
		<td>
			<h5>${profile.email }</h5>
		</td>
	</tr>
	<tr>
		<td><label>PhoneNumber:</label></td>
		<td><h5>${profile.phoneNumber }</h5></td>
	</tr>
	
	<tr>
		<td><label>MyBonuses:</label></td>
		<td>00000</td>
	
	</tr>
	
	
	<tr>
		<td></td>
		<td><a class="linkA"
			href="user/profile/${pageContext.request.userPrincipal.name}/edit">Edit
				Profile</a></td>
	</tr>
	
</table>