	$(document).ready(function() {
	var variables=[];	
	var collections = [];
	var metaData = [];
	var idSeed = 0;
	metaData["organizacionaJedinicaMetaDataMaster"] = [  "broj", "naziv"];
	metaData["organizacionaJedinicaMetaDataCollection"] = [ ];
	metaData["organizacionaJedinicaMetaDataRepresenting"] = [ "broj" ];
	metaData["organizacionaJedinicaAllAttributes"] = [  "broj" , "naziv" ];;
	var organizacionaJedinicaCollection = [];
	collections["organizacionaJedinica"] = organizacionaJedinicaCollection; 
	var organizacionaJedinicaReferencingAttributes = [ ];
	metaData["organizacionaJedinicaReferencingAttributes"] = organizacionaJedinicaReferencingAttributes;
	
	 var organizacionaJedinicaReferencedClasses = [ ];
	 metaData["organizacionaJedinicaReferencedClasses"] =  organizacionaJedinicaReferencedClasses;
	metaData["validationClassMetaDataMaster"] = [  "jedinstvenBrojKorisnikaJavnihSredstava", "nazicPravnogLica", "jedinstveniMaticniBrojGradjanina", "poreskiIdentifikacioniBroj"];
	metaData["validationClassMetaDataCollection"] = [  "gggg", "ggg"];
	metaData["validationClassMetaDataRepresenting"] = [ "jedinstvenBrojKorisnikaJavnihSredstava","nazicPravnogLica" ];
	metaData["validationClassAllAttributes"] = [  "jedinstvenBrojKorisnikaJavnihSredstava" , "nazicPravnogLica" , "jedinstveniMaticniBrojGradjanina" , "poreskiIdentifikacioniBroj" , "adresaSedista" , "adresaElektronskePoste" , "brojTelefona" , "imeIPrezimeAdminstratora" , "brojIdentifikacioneOznake" , "brojTelefonaAdministratoraa" , "adresaElektronskePosteAdministratora" , "brojOrganizacioneJedinice" , "vv" , "nn" , "mm" , "gggg" , "ggg" ];;
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
		
		if(panelSelector.indexOf("overview")>=0){
			var className = panelSelector.split("overview")[1];
			if(collections[className]=="undefined" || collections[className].length == 0){
				$("#linkedData"+className).hide();
				$(panelSelector + " .no-content-message").text("There is no records.");
				$(panelSelector + " table").hide();
			}else{
				$("#linkedData"+className).show();
				$(panelSelector + " .no-content-message").empty();
				$(panelSelector +" table").show();
			}
		}else{
		}
	});
	addRecordInTable = function(record, tableIdentifier, index, className){
		var identifier = "#" + tableIdentifier;
		var newRow = "<tr class="+className+" data-index="+index+" data-id="+record["id"]+">";
		$(identifier + " th").each(function(){
			newRow += "<td>" + record[$(this).attr("name")] + "</td>"
		});
		newRow += "</tr>"
		$(identifier +" tbody").append(newRow);
	}
	$("body").on("mouseenter", ".Master", function(){
				$this = $(this);
				$parentTable = $this.parent().parent();
				$divParent = $parentTable.parent().parent();
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
	addAttributesCollection = function(className, record, values){
		metaData[className+"MetaDataCollection"].forEach(function(val){
			record[val] = []
			values.forEach(function(value){
				var velAux = value.split("=");
				if(velAux[0] == val){
					
					record[val].push(velAux[1]);
					}
				});
		});
	}
	isDataTypeCollection = function(className, attributeName){
	
	 	var retVal = false;
		metaData[className+"MetaDataCollection"].forEach(function(value){
			if(value == attributeName){
				retVal = true;
			}
		});
		
		return retVal;
	}
	$(".sideBar button").click(function(){
		$this = $(this);
		var $sideBar = $this.parent();
		$sideBar.find(".delete-sidebar-items").show();
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
	   				var record = recordInput(values, "organizacionaJedinica");
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
	   				var areClassRulesOk = true;		
	   				if(areClassRulesOk){
	   				var index = organizacionaJedinicaCollection.length;
	   				collections["organizacionaJedinica"].push(record);
	   				addRecordInTable(record, "organizacionaJedinicaTable", index, "Master");
	   				toastr.success("Object is saved!");
	   				}else{
	   					toastr.error("There are some errors. Please fix errors and try again.");
	   					return false;
	   				}
	   			}
	   			else
	   			{
	   				toastr.error("There are some errors. Please fix errors and try again.");
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
	   			gggg: {
	   			},
	   			ggg: {
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
						gggg: {
					},
						ggg: {
					},
	   				}
	   		});
	   		
	   		$("#validationClassSubmitButton").click(function(){
	   			
	   			if($("#validationClassForm").valid())
	   			{
	   				var values = $("#validationClassForm").serialize();
	   				var record = recordInput(values, "validationClass");
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
	   				var areClassRulesOk = true;		
	   				if(record["adresaElektronskePosteAdministratora"]== record["adresaElektronskePoste"] ||  
	   				 false)
	   				{
	   						
	   						toastr.error(" Adresa Elektronske Poste and Adresa Elektronske Poste Administratora should be different.");
	   						areClassRulesOk = false;
	   				}
	   				 if(record["adresaElektronskePoste"] != record["adresaElektronskePoste"] || record["adresaSedista"] != record["adresaElektronskePoste"] )
	   				{
	   					
	   					toastr.error("Adresa Elektronske Poste  and Adresa Sedista should be same.");
	   					areClassRulesOk = false;
	   				}
	   				if($("#nnid").val() > $("#mmid").val())
	   				{
	   					
	   					toastr.error("Mm  should be greaterthan Nn .");
	   					areClassRulesOk = false;
	   				}
	   				if(areClassRulesOk){
	   				var index = validationClassCollection.length;
	   				collections["validationClass"].push(record);
	   				addRecordInTable(record, "validationClassTable", index, "Master");
	   				toastr.success("Object is saved!");
	   				}else{
	   					toastr.error("There are some errors. Please fix errors and try again.");
	   					return false;
	   				}
	   			}
	   			else
	   			{
	   				toastr.error("There are some errors. Please fix errors and try again.");
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
	
	
	recordInput = function(inputValues, className){
	var values = inputValues.split("&");
	var record = [];
	
	record["id"] = idSeed++;
	addAttributesCollection(className, record, values);
	values.forEach(function(value){
		var valAux = value.split("=");
		if(!isDataTypeCollection(className, valAux[0])){
			record[valAux[0]]= valAux[1];
		}
	});
	return record;
	}
	});
