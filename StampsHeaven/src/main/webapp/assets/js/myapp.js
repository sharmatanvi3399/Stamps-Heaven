$(function(){
//solving the active menu problem
	switch(menu){
	
	 case 'About Us' :
	$('#about').addClass('active');
	break;
	 case 'Contact Us' :
			$('#contact').addClass('active');
			break;
	 case 'All Stamps':
		 $('#listStamps').addClass('active');
		 break;
	default:
	 
			$('#listStamps').addClass('active');
	        $('#a_'+menu).addClass('active');
			break;
	
	}
	
	
});