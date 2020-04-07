<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />


<c:set var="contextRoot" value=" ${pageContext.request.contextPath }" />


<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<title>Stamps Heaven - ${title}</title>

<!-- Bootstrap core CSS -->
<link href="${css }/bootstrap.css" rel="stylesheet">

<!-- BootStrap Readable Theme -->
<link href="${css }/bootstrap-readble-theme.css" rel="stylesheet">


<!-- Add custom CSS here -->
<link href="${css }/myapp.css" rel="stylesheet">

</head>

<body>

	<div class="wrapper">

		<!--  Navigation -->
		<%@include file="./shared/navbar.jsp"%>

		<!-- page container -->
		<div class="content">

			<!-- Loading the home content -->

			<c:if test="${userClickHome == true}">
				<%@include file="home.jsp"%>
			</c:if>

			<!-- Loaded when user clicks about -->

			<c:if test="${userClickAbout == true}">
				<%@include file="about.jsp"%>
			</c:if>


			<!-- Loaded when user clicks contact -->

			<c:if test="${userClickContact == true}">
				<%@include file="contact.jsp"%>
			</c:if>
			<!-- Loaded when user clicks contact -->

			
		</div>

		<!-- Footer comes here -->

		<%@include file="./shared/footer.jsp"%>

		<!--  jQuery -->

		<script src="${js}/jquery.js"></script>

		<!-- Bootstrap Core JavaScript -->
		<script src="${js}/bootstrap.min.js"></script>


		<!-- Self coded JavaScript -->
		<script src="${js}/myapp.js"></script>






		<!-- JavaScript -->
		<script src="js/jquery-1.10.2.js"></script>
		<script src="js/bootstrap.js"></script>

	</div>
</body>

</html>
