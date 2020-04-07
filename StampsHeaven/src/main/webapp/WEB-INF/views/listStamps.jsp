<div class="container">

	<div class="row">

		<!--  would be to display sidebar -->
		<div class="col-md-3">

			<%@ include file="./shared/sidebar.jsp" %>
 
		</div>
		<!--  to display the actual products -->
		<div class="col-md-9">
		
		
		<!--   ADDED breadcrump component -->
		<div class="row">
		
		<div class ="col-lg-12">
		
	
	<c:if test="${userClickAllStamps == true }">
		<ol class ="breadcrumb">
		
		<li><a href="${contextRoot }/home">Home</a></li>
		<li class="active">All Stamps</li>
		
		
		
		
		</ol>
		</c:if>
		
		<c:if test="${userClickCategoryStamps == true }">
		<ol class ="breadcrumb">
		
		<li><a href="${contextRoot }/home">Home</a></li>
		<li class="active">Category</li>
		<li class="active">${category.name }</li>
		
		
		
		
		</ol>
		</c:if>
		</div>
		
		</div>
		
		</div>


	</div>




</div>
