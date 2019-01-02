$(document).ready(function() {
	
$(".dropdown-item").click(function(){
		var $this = $(this);
		var panelSelector = $this.attr("href");
		var $panelToShow = $(panelSelector);
		
		$(".panel").hide();
		$panelToShow.show();
		
		
	});

var organizacionaJedinicaMetaDataMaster =[  broj ];
var organizacionaJedinicaMetaDataRepresenting =[  ];

var organizacionaJedinicaAllAttributes =[  broj,  naziv ];
var validationClassMetaDataMaster =[  jedinstvenBrojKorisnikaJavnihSredstava,  nazicPravnogLica,  jedinstveniMaticniBrojGradjanina,  poreskiIdentifikacioniBroj ];
var validationClassMetaDataRepresenting =[  jedinstvenBrojKorisnikaJavnihSredstava,  nazicPravnogLica  ];

var validationClassAllAttributes =[  jedinstvenBrojKorisnikaJavnihSredstava,  nazicPravnogLica,  jedinstveniMaticniBrojGradjanina,  poreskiIdentifikacioniBroj,  adresaSedista,  adresaElektronskePoste,  brojTelefona,  imeIPrezimeAdminstratora,  brojIdentifikacioneOznake,  brojTelefonaAdministratoraa,  adresaElektronskePosteAdministratora,  brojOrganizacioneJedinice,  nn,  mm ];

$(function() {
var brojOrganizacioneJediniceAvailableTags = [];
$("#brojOrganizacioneJedinice").autocomplete({
  	source: brojOrganizacioneJediniceAvailableTags
  	});
});
});
