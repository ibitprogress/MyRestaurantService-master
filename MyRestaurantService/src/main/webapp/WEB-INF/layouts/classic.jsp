<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/include/style-include.jsp" />

<html>
<head>
<title><tiles:getAsString name="title" /></title>
</head>

<body>
	<div id="pagewrap">
		<header id="header">
			<tiles:insertAttribute name="header" />
		</header>

		<div id="sidebar">
			<tiles:insertAttribute name="sidebar" />
		</div>

		<div id="content">
			<tiles:insertAttribute name="body" />
		</div>
		
		<%-- <footer id="footer" >
			<tiles:insertAttribute name="footer" />
		</footer>  --%>
	</div>
</body>
</html>