<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<style>

.menu{
margin: 0;
padding: 0;
text-align: center;
}
.menu a{
	display: inline-block;
	text-decoration: none;
	color: white;
	padding: 15px 20px;

}

.menu li{
	display: inline;
	margin: 0;
	list-style-type: none;
	font-size: 18px;
	font-weight: 200;	
	border-radius: 40px;
	background: #121010;
}

.menu > li > a:hover{
	color:#FF0080; 
}

.menu > li:hover{
	border-bottom: 2px solid #FF0080 ;
}


</style>
<div>
<table>
<tr>
		<ul class="menu">
			<li class="active-menu"><a href="/">Home</a></li>
			<li><a href="news">News</a></li>
			<li><a href="menu">Menu</a></li>
			<li><a href="reservation">Reservation</a></li>
			<li><a href="about">About Us</a></li>
			<li><a href="contacts">Contacts</a></li>
		</ul>
		</tr>
 </table>
</div>