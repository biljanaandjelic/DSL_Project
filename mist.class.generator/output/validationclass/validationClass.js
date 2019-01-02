$(document).ready(function() {
	
		$(".dropdown-item").click(function(){
			var $this = $(this);
			var panelSelector = $this.attr("href");
			var $panelToShow = $(panelSelector);
			
			$(".panel").hide();
			$panelToShow.show();
			
			
		});
		
	$("#submitButton").click(function(e){
	 if($("form")[0].checkValidity()){

if($("#adresaElektronskePosteAdministratoraid").val()== $("#adresaElektronskePosteid").val() ||  
 false)
{
		e.preventDefault();
		alert(" Adresa Elektronske Poste and Adresa Elektronske Poste Administratora should be different.");
}
 if($("#adresaElektronskePosteid").val() != $("#adresaElektronskePosteid").val() || $("#adresaSedistaid").val() != $("#adresaElektronskePosteid").val() )
{
	e.preventDefault();
	alert("Adresa Elektronske Poste  and Adresa Sedista should be same.");
}
if($("#nnid").val() > $("#mmid").val())
{
	e.preventDefault();
	alert("Mm  should be greaterthan Nn .");
}

	}
});
});

if($("#adresaElektronskePosteAdministratoraid").val()== $("#adresaElektronskePosteid").val() ||  
 false)
{
		e.preventDefault();
		alert(" Adresa Elektronske Poste and Adresa Elektronske Poste Administratora should be different.");
}
 if($("#adresaElektronskePosteid").val() != $("#adresaElektronskePosteid").val() || $("#adresaSedistaid").val() != $("#adresaElektronskePosteid").val() )
{
	e.preventDefault();
	alert("Adresa Elektronske Poste  and Adresa Sedista should be same.");
}
if($("#nnid").val() > $("#mmid").val())
{
	e.preventDefault();
	alert("Mm  should be greaterthan Nn .");
}
$(function() {
  var availableTags = [
    "ActionScript", "AppleScript", "Asp", "BASIC", "C", "C++",
    "Clojure", "COBOL", "ColdFusion", "Erlang", "Fortran",
    "Groovy", "Haskell", "Java", "JavaScript", "Lisp", "Perl",
    "PHP", "Python", "Ruby", "Scala", "Scheme"
  ];
  
  $("#brojOrganizacioneJedinice").autocomplete({
    source: availableTags
  });
});
