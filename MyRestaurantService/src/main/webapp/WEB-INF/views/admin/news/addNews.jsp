<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<h1 class="h1_form">_ADD NEWS_</h1>
<h3>Create News</h3>
<form:form id="login" method="POST" modelAttribute="news">
		<fieldset id="inputs">
				<label>NewsName: </label>
				<form:input type="text" path="newsName"/>
				<form:errors path="newsName" />

				<label>Description: </label>
				<form:textarea path="description" />
				<form:errors path="description" />
		</fieldset>
			<fieldset id="actions">
				<input id="submit" type="submit" value="Add News">
			</fieldset>
		</form:form>