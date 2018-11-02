$(document).ready(function() {
	$("#submitButton").click(function(e){
	 if($("form")[0].checkValidity()){
	 if($("#nameid").val() != $("#nameid").val() || $("#surnameid").val() != $("#nameid").val() )
	{
		e.preventDefault();
		alert("Name  and Surname should be same.");
	}
	if($("#nicknameid").val()== $("#nameid").val() ||  
	 false)
	{
			e.preventDefault();
			alert(" Name and Nickname should be different.");
	}
	if($("#ageid").val() < $("#yearsOfServiceid").val())
	{
		e.preventDefault();
		alert("Years Of Service  should be less than Age .");
	}
	if($("#dateOfBirthid").val() > $("#dateOfEmploymentid").val())
	{
		e.preventDefault();
		alert("Date Of Employment  should be greaterthan Date Of Birth .");
	}
	}
});
});
