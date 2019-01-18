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
	newRow +="<td class=\"select-box\"><input type=\"checkbox\"/></td>"
	$(identifier + " th.column-name").each(function(){
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
			showDetailsForSelectedRecords(tableName, record);
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
getRecord = function(tableName, id){
	var retValue;
	$.each(collections[tableName], function(key, value){
		if (value["id"] == id){
			retValue = value;
			}
		});
	return retValue
};
$("body").on('dblclick',"tbody tr",function(){
	var $row = $(this);
	var rowId = $row.attr("data-id");
	var $table = $(this).parent().parent();
	var tableName = $table.attr("id").split("Table")[0];
	record = getRecord(tableName, rowId);
	var formSelector = "#" + tableName + "Form";
	setFormInputValues(formSelector, record); 	
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
$(".delete-selected").click(function(){
	var $divContainingTable = $(this).parent().parent().parent().parent();
	var className = $divContainingTable.parent().attr("id").split("overview")[1];
	var $table = $divContainingTable.find("table");
	var selectedRows = $table.find("input[type='checkbox']:checked");
	var idList = [];
	$.each(selectedRows, function(){
		var cellElement = $(this).parent();
		var rowElement = $(this).parent().parent();
		idList.push(rowElement.attr("data-id"));
		rowElement.remove();
		
		});
		deleteRecords(className, idList);
	});
setFormInputValues = function(formSelector, record){
	var keys = Object.keys(record);
	for(i = 0; i < keys.length; i++){
	    var value = record[keys[i]];
	    var selector = formSelector +" [name=\'"+keys[i]+"\']";
	    $(selector).val(value);
	}
toastr.success("Data are shown in form. Please open form to see data.");
}
$(".delete-all").click(function(){
    	var $divContainingTable = $(this).parent().parent().parent().parent();
    	var $tbody = $divContainingTable.find("tbody");
    
    });
$(".delete-mode").click(function(e){
	var $this = $(this);
	var $divParent = $this.parent();
	$divParent.find(".delete-sidebar-items").show();
	$(".select-box").show();
	});
$(".cancel-delete-mode").click(function(e){
	$(this).parent().parent().hide();
	var table = $(this).parent().parent().parent().parent().find("table")[0];
	$("#"+table.id+" .select-box").hide();
});
deleteRecords = function(className, ids){
	
	$.each(ids, function(key,val){
		//if(checkIfDeletingIsPosible(val)){
		$.each(collections[className], function(keyCol, value){
			if(value["id"] == val){
				collections[className].splice(keyCol,1);
			}
		});
	//	}else{
		//	toastr.error("Not posible to remove.");
		//	}
	});
}
showDetailsForSelectedRecords = function(tableName, record){
	var nonMasterAttributes = $("#"+tableName+"details .additionalInfo");
	$.each(nonMasterAttributes, function(){
		var el = this;
		
		var attributes = el.attributes;
		var attrName = attributes[1].nodeValue;
		var value = record[attrName];
				
		$(this).text(value);
	});
}
checkIfDeletingIsPosible = function(id){
	var counter = 0;
	var collectionKeys = Object.keys(collections);
	for(i = 0; i < collectionKeys.length; i++){
		var keys = Objects.keys(collections[collectionKeys[i]]);
		for(j = 0; j < keys.length; j++){
			if(collections[collectionKeys[i]][keys[j]]["id"]==id){
				counter++;
			}
		}
	}
	
	if(counter>1){
		return false;
	}else{
		return true;
	}
}

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
   				if(record["id"]==-1){
   					record["id"] = idSeed++;
   				collections["organizacionaJedinica"].push(record);
   				}else{
   					toastr.error("Implement function for update");
   				}
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
   				if(record["id"]==-1){
   					record["id"] = idSeed++;
   				collections["validationClass"].push(record);
   				}else{
   					toastr.error("Implement function for update");
   				}
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
