$(document).ready(function() {
	
$(".dropdown-item").click(function(){
		var $this = $(this);
		var panelSelector = $this.attr("href");
		var $panelToShow = $(panelSelector);
		
		$(".panel").hide();
		$panelToShow.show();
		
		
	});


$(function() {
var brojOrganizacioneJediniceAvailableTags = [];
$("#brojOrganizacioneJedinice").autocomplete({
  	source: brojOrganizacioneJediniceAvailableTags
  	});
});
});
