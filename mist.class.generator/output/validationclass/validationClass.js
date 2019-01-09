	$(document).ready(function() {
	var variables=[];	
	var collections = [];
	var metaData = [];
	
	var organizacionaJedinicaMetaDataMaster =[  "broj"];
	metaData["organizacionaJedinicaMetaDataMaster"] = organizacionaJedinicaMetaDataMaster;
	var organizacionaJedinicaMetaDataRepresenting =[ "broj" ];
	metaData["organizacionaJedinicaMetaDataRepresenting"] = organizacionaJedinicaMetaDataRepresenting;
	var organizacionaJedinicaAllAttributes =[  "broj" , "naziv" ];
	metaData["organizacionaJedinicaAllAttributes"] = organizacionaJedinicaAllAttributes;
	var organizacionaJedinicaCollection = [];
	collections["organizacionaJedinica"] = organizacionaJedinicaCollection; 
	var organizacionaJedinicaReferencingAttributes = [ ];
	metaData["organizacionaJedinicaReferencingAttributes"] = organizacionaJedinicaReferencingAttributes;
	
	 var organizacionaJedinicaReferencedClasses = [ ];
	 metaData["organizacionaJedinicaReferencedClasses"] =  organizacionaJedinicaReferencedClasses;
	var validationClassMetaDataMaster =[  "jedinstvenBrojKorisnikaJavnihSredstava", "nazicPravnogLica", "jedinstveniMaticniBrojGradjanina", "poreskiIdentifikacioniBroj"];
	metaData["validationClassMetaDataMaster"] = validationClassMetaDataMaster;
	var validationClassMetaDataRepresenting =[ "jedinstvenBrojKorisnikaJavnihSredstava","nazicPravnogLica" ];
	metaData["validationClassMetaDataRepresenting"] = validationClassMetaDataRepresenting;
	var validationClassAllAttributes =[  "jedinstvenBrojKorisnikaJavnihSredstava" , "nazicPravnogLica" , "jedinstveniMaticniBrojGradjanina" , "poreskiIdentifikacioniBroj" , "adresaSedista" , "adresaElektronskePoste" , "brojTelefona" , "imeIPrezimeAdminstratora" , "brojIdentifikacioneOznake" , "brojTelefonaAdministratoraa" , "adresaElektronskePosteAdministratora" , "brojOrganizacioneJedinice" , "nn" , "mm" ];
	metaData["validationClassAllAttributes"] = validationClassAllAttributes;
	var validationClassCollection = [];
	collections["validationClass"] = validationClassCollection; 
	var validationClassReferencingAttributes = [  "brojOrganizacioneJedinice"];
	metaData["validationClassReferencingAttributes"] = validationClassReferencingAttributes;
	
	 var validationClassReferencedClasses = [  "organizacionaJedinica"];
	 metaData["validationClassReferencedClasses"] =  validationClassReferencedClasses;
	    		
	$(".dropdown-item").click(function(){
			var $this = $(this);
			var panelSelector = $this.attr("href");
			var $panelToShow = $(panelSelector);
			
			$(".panel").hide();
			$panelToShow.show();
			
			
		});
	addRecordInTable = function(record, tableIdentifier, index, className){
		var identifier = "#" + tableIdentifier;
		var newRow = "<tr class="+className+" data-index="+index+">";
		$(identifier + " th").each(function(){
			newRow += "<td>" + record[$(this).attr("name")] + "</td>"
		});
		newRow += "</tr>"
		$(identifier +" tbody").append(newRow);
	}
	$("body").on("mouseenter", ".Master", function(){
				$this = $(this);
				$parentTable = $this.parent().parent();
				$divParent = $parentTable.parent();
				$divElements = $divParent.find("div .referenced");
				var tableName = $parentTable.attr("id").split("Table")[0];
				var index = $this.attr("data-index");
				var record = collections[tableName][index];
				$.each($divElements, function(key, value){
					var divId = value.id;
					var attrName = value.id.split("Tab")[0];
					var refValues = record[attrName]
					var tableReferenced = $("#"+divId + " Table").attr("id");
					$("#" + tableReferenced + " tbody").empty();
					if(Object.prototype.toString.call(refValues) == '[object String]'){
											
					$("#" + tableReferenced).hide();
					var noContentDiv = "<div class=\"noContent\"> There is no referenced records. </div>"
					$("#"+divId).append(noContentDiv);
					}else if(Object.prototype.toString.call(refValues) == '[object Array]' && refValues.length > 0){
					$("#" + divId +" .noContent").remove();
					$("#" + tableReferenced).show();
					$.each(refValues, function(index, val){
						addRecordInTable(val, tableReferenced, index, "Referenced");
						
						});
					}
					});
				var attributes = tableName + "MetaDataMaster";
				var metaDataMaster = metaData[attributes];
				var id = $this.attr("id");
				var additionalInfo = "#" + tableName + "details";
				
			
			});

	
	$("#organizacionaJedinicaForm").validate({
	   			rules:{
	   			broj: {
	   				 required: true 
	   			},
	   			},
	   			messages: {
						broj: {
						required: "Број органиѕационе јединице је обавеѕно поље."
					},
	   				}
	   		});
	   		
	   		$("#organizacionaJedinicaSubmitButton").click(function(){
	   			
	   			if($("#organizacionaJedinicaForm").valid())
	   			{
	   				var values = $("#organizacionaJedinicaForm").serialize();
	   				var record = recordInput(values);
	   				var referencingAttributes = metaData["organizacionaJedinicaReferencingAttributes"];
	   				var referencedClasses = metaData["organizacionaJedinicaReferencedClasses"];
	   				
	   					$.each(referencingAttributes, function(index, val){
	   						var classRef = referencedClasses[index];
	   						var referencedCollection = collections[classRef];
	   						var representingAttribute = metaData[classRef+"MetaDataRepresenting"][0];
	   						var arrayOfValues = [];
	   						var isFound = false;
	   						referencedCollection.forEach(function(elValue, elIndex){
	   						
	   							if(elValue[representingAttribute] == record[val]){
	   								isFound = true;
	   								arrayOfValues.push(elValue);
	   								record[val] = elValue;
	   								}
	   							});
	   							
	   							if(isFound){
	   							    record[val] = arrayOfValues;
	   							}
	   						});
	   						
	   						
	   					
	   				var index = organizacionaJedinicaCollection.length;
	   				collections["organizacionaJedinica"].push(record);
	   				addRecordInTable(record, "organizacionaJedinicaTable", index, "Master");
	   			}
	   			else
	   			{
	   				return false;
	   			}
	   		});
	   		
	$("#validationClassForm").validate({
	   			rules:{
	   			jedinstvenBrojKorisnikaJavnihSredstava: {
	   				 required: true 
	   			},
	   			nazicPravnogLica: {
	   				 required: true 
	   			},
	   			jedinstveniMaticniBrojGradjanina: {
	   				 required: true ,
	   				pattern: /[0-9]{13}/
	   			},
	   			poreskiIdentifikacioniBroj: {
	   				 required: true 
	   			},
	   			adresaSedista: {
	   				 required: true 
	   			},
	   			adresaElektronskePoste: {
	   				 required: true 
	   			},
	   			brojTelefona: {
	   				 required: true 
	   			},
	   			imeIPrezimeAdminstratora: {
	   				 required: true 
	   			},
	   			brojIdentifikacioneOznake: {
	   				 required: true ,
	   				pattern: /[0-9]{9}/
	   			},
	   			brojTelefonaAdministratoraa: {
	   				 required: true 
	   			},
	   			adresaElektronskePosteAdministratora: {
	   				 required: true ,
	   				minlength: 10,
	   				maxlength: 254
	   			},
	   			brojOrganizacioneJedinice: {
	   				 required: true 
	   			},
	   			},
	   			messages: {
						jedinstvenBrojKorisnikaJavnihSredstava: {
						required: "Јединствен број корисника јавних средстава је обавезно поље."
					},
						nazicPravnogLica: {
						required: "Назив правног лица је обавезно поље."
					},
						jedinstveniMaticniBrojGradjanina: {
					},
						poreskiIdentifikacioniBroj: {
					},
						adresaSedista: {
					},
						adresaElektronskePoste: {
					},
						brojTelefona: {
					},
						imeIPrezimeAdminstratora: {
					},
						brojIdentifikacioneOznake: {
					},
						brojTelefonaAdministratoraa: {
					},
						adresaElektronskePosteAdministratora: {
					},
						brojOrganizacioneJedinice: {
					},
	   				}
	   		});
	   		
	   		$("#validationClassSubmitButton").click(function(){
	   			
	   			if($("#validationClassForm").valid())
	   			{
	   				var values = $("#validationClassForm").serialize();
	   				var record = recordInput(values);
	   				var referencingAttributes = metaData["validationClassReferencingAttributes"];
	   				var referencedClasses = metaData["validationClassReferencedClasses"];
	   				
	   					$.each(referencingAttributes, function(index, val){
	   						var classRef = referencedClasses[index];
	   						var referencedCollection = collections[classRef];
	   						var representingAttribute = metaData[classRef+"MetaDataRepresenting"][0];
	   						var arrayOfValues = [];
	   						var isFound = false;
	   						referencedCollection.forEach(function(elValue, elIndex){
	   						
	   							if(elValue[representingAttribute] == record[val]){
	   								isFound = true;
	   								arrayOfValues.push(elValue);
	   								record[val] = elValue;
	   								}
	   							});
	   							
	   							if(isFound){
	   							    record[val] = arrayOfValues;
	   							}
	   						});
	   						
	   						
	   					
	   				var index = validationClassCollection.length;
	   				collections["validationClass"].push(record);
	   				addRecordInTable(record, "validationClassTable", index, "Master");
	   			}
	   			else
	   			{
	   				return false;
	   			}
	   		});
	   		
	
	$(".autocomplete").click(function() {
	  			var dataClass = $(this).attr("data-class");
	var values = collections[dataClass];
	  			var brojOrganizacioneJediniceAvailableTags = [];
	  			var attrName = dataClass + "MetaDataRepresenting";
	  			var metaDateRepresenting = metaData[attrName];
	  			$.each(values, function(index, val){
	  				var element = val;
	  				var value = "";
	  				$.each(metaDateRepresenting, function(index, vall){
	  					value += element[vall];
	  					});
	  				brojOrganizacioneJediniceAvailableTags.push(value);
	  			});
	  			$("#brojOrganizacioneJedinice").autocomplete({
	  				  source: brojOrganizacioneJediniceAvailableTags
	  			});
	  			});
	
	recordInput = function(inputValues){
	var values = inputValues.split("&");
	var record = [];
	values.forEach(function(value){
		var velAux = value.split("=");
	
		record[velAux[0]]= velAux[1];
	});
	
	return record;
	}
	});
