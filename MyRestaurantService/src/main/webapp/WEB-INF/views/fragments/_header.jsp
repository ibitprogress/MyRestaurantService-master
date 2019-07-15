<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<jsp:include page="/WEB-INF/include/style-include.jsp" />
<head>
<script type="text/javascript">
	function showTime() {
		var dat = new Date();
		var H = '' + dat.getHours();
		H = H.length < 2 ? '0' + H : H;
		var M = '' + dat.getMinutes();
		M = M.length < 2 ? '0' + M : M;
		var S = '' + dat.getSeconds();
		S = S.length < 2 ? '0' + S : S;
		var clock = H + ':' + M + ':' + S;
		document.getElementById('time_div').innerHTML = clock;
		setTimeout(showTime, 1000); 
	}
</script>
</head>
<html>
<hgroup>
	<h1 id="site-logo">
		<img alt="Logo" src="/resources/images/rest.png"> <!-- <a href="/">RestaurantInLviv</a> -->
	</h1>
	<h2 id="site-description">Welcome, to my Restaurant</h2>
</hgroup>
<div id="time_div">
		<script type="text/javascript">
			showTime();
		</script>
	</div>
<nav>
	<ul id="main-nav" class="clearfix">
		<li><a href="/">Home</a></li>
		<li><a href="news">News</a></li>
		<li><a href="menu">Menu</a></li>
		<li><a href="reservation">Reservation</a></li>
		<li><a href="contact">Contacts</a></li>
		<!-- <li><a href="about">About Us</a></li> -->
	</ul>
</nav>