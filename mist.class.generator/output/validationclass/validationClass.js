$(document).ready(function() {
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
