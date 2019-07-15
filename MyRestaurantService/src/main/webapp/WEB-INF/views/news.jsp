<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<h1 class="h1_form">_NEWS_</h1>

<table class="table_menu">

	<c:forEach items="${showFuturedNews }" var="news">
		<tr><!-- <a href="#">..</a> -->
			<td><strong style="color: orange;">${news.newsName }</strong></td>
		</tr>
		<tr>
			<td><strong>Date:</strong> ${news.createNewsDate }</td>
		</tr>
		<tr>
			<td><strong>Description:</strong> ${news.description }
			<hr>
			<br>
			</td>
		</tr>
	</c:forEach>
</table>
