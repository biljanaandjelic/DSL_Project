$(document).ready(function() {
var variables=[];	
var collections = [];
var metaData = [];
var idSeed = 0;
metaData["opstinaMetaDataMaster"] = [  "kod", "naziv"];
metaData["opstinaMetaDataCollection"] = [ ];
metaData["opstinaMetaDataRepresenting"] = [ "kod" ];
metaData["opstinaAllAttributes"] = [  "kod" , "naziv" ];;
var opstinaCollection = [];
collections["opstina"] = opstinaCollection;
var opstinaReferencingAttributes = [ ];
metaData["opstinaReferencingAttributes"] = opstinaReferencingAttributes;

 var opstinaReferencedClasses = [ ];
 metaData["opstinaReferencedClasses"] =  opstinaReferencedClasses;
metaData["drzavljanstvoMetaDataMaster"] = [  "naziv"];
metaData["drzavljanstvoMetaDataCollection"] = [ ];
metaData["drzavljanstvoMetaDataRepresenting"] = [ "naziv" ];
metaData["drzavljanstvoAllAttributes"] = [  "naziv" ];;
var drzavljanstvoCollection = [];
collections["drzavljanstvo"] = drzavljanstvoCollection;
var drzavljanstvoReferencingAttributes = [ ];
metaData["drzavljanstvoReferencingAttributes"] = drzavljanstvoReferencingAttributes;

 var drzavljanstvoReferencedClasses = [ ];
 metaData["drzavljanstvoReferencedClasses"] =  drzavljanstvoReferencedClasses;
metaData["srednjaskolaMetaDataMaster"] = [  "naziv"];
metaData["srednjaskolaMetaDataCollection"] = [ ];
metaData["srednjaskolaMetaDataRepresenting"] = [ "naziv" ];
metaData["srednjaskolaAllAttributes"] = [  "naziv" ];;
var srednjaskolaCollection = [];
collections["srednjaskola"] = srednjaskolaCollection;
var srednjaskolaReferencingAttributes = [ ];
metaData["srednjaskolaReferencingAttributes"] = srednjaskolaReferencingAttributes;

 var srednjaskolaReferencedClasses = [ ];
 metaData["srednjaskolaReferencedClasses"] =  srednjaskolaReferencedClasses;
metaData["tipSednjeSkoleMetaDataMaster"] = [  "naziv"];
metaData["tipSednjeSkoleMetaDataCollection"] = [ ];
metaData["tipSednjeSkoleMetaDataRepresenting"] = [ "naziv" ];
metaData["tipSednjeSkoleAllAttributes"] = [  "naziv" ];;
var tipSednjeSkoleCollection = [];
collections["tipSednjeSkole"] = tipSednjeSkoleCollection;
var tipSednjeSkoleReferencingAttributes = [ ];
metaData["tipSednjeSkoleReferencingAttributes"] = tipSednjeSkoleReferencingAttributes;

 var tipSednjeSkoleReferencedClasses = [ ];
 metaData["tipSednjeSkoleReferencedClasses"] =  tipSednjeSkoleReferencedClasses;
metaData["drzavaMetaDataMaster"] = [  "naziv", "kod"];
metaData["drzavaMetaDataCollection"] = [ ];
metaData["drzavaMetaDataRepresenting"] = [ "naziv" ];
metaData["drzavaAllAttributes"] = [  "naziv" , "kod" ];;
var drzavaCollection = [];
collections["drzava"] = drzavaCollection;
var drzavaReferencingAttributes = [ ];
metaData["drzavaReferencingAttributes"] = drzavaReferencingAttributes;

 var drzavaReferencedClasses = [ ];
 metaData["drzavaReferencedClasses"] =  drzavaReferencedClasses;
metaData["mestoMetaDataMaster"] = [  "naziv", "postanskiBroj"];
metaData["mestoMetaDataCollection"] = [ ];
metaData["mestoMetaDataRepresenting"] = [ "naziv" ];
metaData["mestoAllAttributes"] = [  "naziv" , "postanskiBroj" , "kod" ];;
var mestoCollection = [];
collections["mesto"] = mestoCollection;
var mestoReferencingAttributes = [ ];
metaData["mestoReferencingAttributes"] = mestoReferencingAttributes;

 var mestoReferencedClasses = [ ];
 metaData["mestoReferencedClasses"] =  mestoReferencedClasses;
metaData["nacionalnostMetaDataMaster"] = [  "naziv"];
metaData["nacionalnostMetaDataCollection"] = [ ];
metaData["nacionalnostMetaDataRepresenting"] = [ "naziv" ];
metaData["nacionalnostAllAttributes"] = [  "naziv" ];;
var nacionalnostCollection = [];
collections["nacionalnost"] = nacionalnostCollection;
var nacionalnostReferencingAttributes = [ ];
metaData["nacionalnostReferencingAttributes"] = nacionalnostReferencingAttributes;

 var nacionalnostReferencedClasses = [ ];
 metaData["nacionalnostReferencedClasses"] =  nacionalnostReferencedClasses;
metaData["sObrazacMetaDataMaster"] = [  "datumRodjenja", "drzavaRodjenja", "adresaStanovanjaStalog", "telefon", "opstinaStanovanjaZaVrijemeStudija", "mobilniTelefonZaVrijeStudija"];
metaData["sObrazacMetaDataCollection"] = [  "nacinIzdrazavanjaTokomStudija", "izdrzavanjeDrugihLica"];
metaData["sObrazacMetaDataRepresenting"] = [  ];
metaData["sObrazacAllAttributes"] = [  "datumRodjenja" , "mestoRodjena" , "opstinaRodjena" , "drzavaRodjenja" , "adresaStanovanjaStalog" , "opstinaStalnogStanovanja" , "mestoStalnogStanovanje" , "telefon" , "adresaStanovanjaZaVrijemeStudija" , "opstinaStanovanjaZaVrijemeStudija" , "mestoStanovanjeZaVrijemeStudija" , "mobilniTelefonZaVrijeStudija" , "drzavljanstvo" , "nacionalnost" , "srednjaSkola" , "profilSrednjeSkole" , "glavniRadniStatusStudenta" , "zanimanjeStudenta" , "bracniStatus" , "tipSmjestaja" , "nacinIzdrazavanjaTokomStudija" , "glavniNacinIzdrzavanja" , "izdrzavanjeDrugihLica" ];;
var sObrazacCollection = [];
collections["sObrazac"] = sObrazacCollection;
var sObrazacReferencingAttributes = [  "mestoRodjena", "opstinaRodjena", "drzavaRodjenja", "opstinaStalnogStanovanja", "mestoStalnogStanovanje", "adresaStanovanjaZaVrijemeStudija", "opstinaStanovanjaZaVrijemeStudija", "mestoStanovanjeZaVrijemeStudija", "drzavljanstvo", "nacionalnost", "srednjaSkola", "profilSrednjeSkole"];
metaData["sObrazacReferencingAttributes"] = sObrazacReferencingAttributes;

 var sObrazacReferencedClasses = [  "mesto", "opstina", "drzava", "opstina", "mesto", "mesto", "opstina", "mesto", "drzavljanstvo", "nacionalnost", "srednjaskola", "tipSednjeSkole"];
 metaData["sObrazacReferencedClasses"] =  sObrazacReferencedClasses;
    		
$(".dropdown-item").click(function(){
	var $this = $(this);
	var panelSelector = $this.attr("href");
	var $panelToShow = $(panelSelector);			
	$(".panel").hide();
	//$(".panel").find("form").attr("id",$(".panel").find("form").attr("id")+"_")
	var aText = $this.text();
	$panelToShow.show();
	var ahref = $this.attr("href");
	var id = $panelToShow.attr("id");
	/*if(typeof($panelToShow.find("form").attr("id")) != 'undefined'){
		$panelToShow.find("form").attr("id",$panelToShow.find("form").attr("id").split("_")[0]);
	} */
	$(".tabPanel-li").find("a").attr("class","nav-link");
	var newTabHeader = "<li class=\"nav-item\" data-id=\"\"><a class=\"nav-link active\" href=\"#"+id+"\" data-toggle=\"tab\"><button class=\"close closeTab\" type=\"button\" >×</button>"+aText+"</a></li>";
	$(".tabPanel-li").append(newTabHeader);
	$("#tabPanelContainer").append($panelToShow);
	
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
openTab = function(panelSelector, id){
	var selector = "#add" + panelSelector;
	var $panelToShow = $(selector);
	//var id = $panelToShow.attr("id");
	$(".tabPanel-li").find("a").attr("class","nav-link");
	var newTabHeader = "<li class=\"nav-item\" data-id=\"\"><a class=\"nav-link active\" href=\""+selector+id+"\" data-toggle=\"tab\"><button class=\"close closeTab\" type=\"button\" >×</button>"+panelSelector+"_"+id+"</a></li>";
	$(".tabPanel-li").append(newTabHeader);
	$(".panel").hide();
//	$(".panel").find("form").attr("id",$(".panel").find("form").attr("id")+"_")
	   
	/*if(typeof($panelToShow.find("form").attr("id")) != 'undefined'){
	    	$panelToShow.find("form").attr("id",$panelToShow.find("form").attr("id").split("_")[0]);
	 } */
	$panelToShow.show();
	var $newPanel = $panelToShow.clone();
	$panelToShow.hide();
	$newPanel.show();
	$newPanel.attr("id", "add"+panelSelector+id);
	$("#tabPanelContainer").append($newPanel);
	
	
}
$("body").on("click", "#tabPanel a", function(e){
    		 $("#tabPanel a").attr("class","nav-link");
    		 $(this).attr("class", "nav-link active");
    		 $(".panel").hide();
    		 var panelSelector = $(this).attr("href");
    		 var $panelToShow = $(panelSelector);
    		// $(".panel").find("form").attr("id",$(".panel").find("form").attr("id")+"_")
    		     		   
    		 /* if(typeof($panelToShow.find("form").attr("id")) != 'undefined'){
    		     $panelToShow.find("form").attr("id",$panelToShow.find("form").attr("id").split("_")[0]);
    		    } */
    		 $panelToShow.show();
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
				var tableSelector = divId + " #" + tableReferenced;
				$("#" + tableSelector + " tbody").empty();
				if(Object.prototype.toString.call(refValues) == '[object String]'){
										
				$("#" + tableSelector).hide();
				var noContentDiv = "<div class=\"noContent\"> There is no referenced records. </div>"
				$("#"+divId).append(noContentDiv);
				}else if(Object.prototype.toString.call(refValues) == '[object Array]' && refValues.length > 0){
				$("#" + divId +" .noContent").remove();
				$("#" + tableSelector).show();
				$.each(refValues, function(index, val){
					addRecordInTable(val, tableSelector, index, "Referenced");
					
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
	//var formSelector = "#" + tableName + "Form";
	openTab(tableName, rowId);
	var formSelector = "#add"+tableName+rowId+" #" + tableName + "Form";
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
changeRecordInTable = function(record, tableIdentifier, index, className){
	var identifierRow = "#" + tableIdentifier + " tr[data-id='"+record["id"]+"']";
	var newRow ="<td class=\"select-box\"><input type=\"checkbox\"/></td>"
	var identifier = "#" + tableIdentifier;
	$(identifierRow).empty();
	$(identifier + " th.column-name").each(function(){
	    	newRow += "<td>" + record[$(this).attr("name")] + "</td>"
	  });
	$(identifierRow).append(newRow);
	
}
saveChanges = function(className, record){
	var indexElement =-1;
	$.each(collections[className], function(index, value){
		if(value["id"]==record["id"]){
			indexElement = index;
			}
		});
		
		collections[className].splice(indexElement,1);
		collections[className].push(record);
	}
setFormInputValues = function(formSelector, record){
	var keys = Object.keys(record);
	for(i = 0; i < keys.length; i++){
	    var value = record[keys[i]];
	    var selector = formSelector +" [name=\'"+keys[i]+"\']";
	    $(selector).val(value);
	}
	
	for(i = 0; i < keys.length; i++){
		if(keys[i].indexOf("_")>-1){
			 var value = record[keys[i]];
			 var selector = formSelector +" [name=\'"+keys[i].split("_")[0]+"\']";
			 $(selector).val(value);
		}
	   
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
	var $rootPanel = $this.parent().parent().parent();
	var rootId = $rootPanel.attr("id");
	var tableName = rootId.split("overview")[1]+"Table";
	$divParent.find(".delete-sidebar-items").show();
	var tableSelector = "#"+tableName+ " .select-box";
	$(tableSelector).show();
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

$("select").click(function(e){
	  if (e.originalEvent) {
	    $this = $(this);
	    var name = $this.attr("name");
	    var alertBoxContent = "Get focus "+ name;  
	    var kind = $this.attr("data-kind");
	    if(kind == "ValidationClass"){
	    	$this.empty();
	    		var dataClass = $(this).attr("data-class");
	    	 	
	    	 			var values = collections[dataClass];
	    	  			var optionValues = [];
	    	  			var attrName = dataClass + "MetaDataRepresenting";
	    	  			var metaDateRepresenting = metaData[attrName];
	    	  			var options ="";
	    	  			$.each(values, function(index, val){
	    	  				
	    	  				var element = val;
	    	  				var value = "";
	    	  				$.each(metaDateRepresenting, function(index, vall){
	    	  					value += element[vall];
	    	  					options+="<option>"+element[vall]+"</option>"
	    	  					});
	    	  				optionValues.push(value);
	    	  			});
	    	  			
	    	  			$this.append(options);
	    }else{
	    }
	  }
	
});
$("body").on("click",".closeTab", function(){
	
	var $li = $(this).parent().parent();
	var tabId = $(this).parent().attr("href");
	$li.remove();
	$(tabId).remove();
});
$("#opstinaForm").validate({
   			rules:{
   			kod: {
   				 required: true 
   			},
   			naziv: {
   				 required: true 
   			},
   			},
   			messages: {
					kod: {
				},
					naziv: {
				},
   				}
   		});
   		
   		$("body").on("click",".opstinaSubmitButton",function(){
   			var $form = $(this).parent().parent();
   			var formId = $form.attr("id");
   			if($("#opstinaForm").valid())
   			{
   				var values = $form.serialize();
   				var values = unescape(values.replace(/\+/g, ' '));
   				
   				var record = recordInput(values, "opstina");
   				var referencingAttributes = metaData["opstinaReferencingAttributes"];
   				var referencedClasses = metaData["opstinaReferencedClasses"];
   				
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
   								record[val+"_representing"] = elValue[representingAttribute];
   								record[val] = elValue;
   								}
   							});
   							
   							if(isFound){
   							    record[val] = arrayOfValues;
   							}
   						});
   				var areClassRulesOk = true;		
   				if(areClassRulesOk){
   				var index = opstinaCollection.length;
   				if(record["id"]==-1){
   					record["id"] = idSeed++;
   					collections["opstina"].push(record);
   					addRecordInTable(record, "opstinaTable", index, "Master");
   				  	toastr.success("Object is saved!");
   				  	//$("#opstinaForm [name='id']").val(-1);
   				  	//$("#opstinaForm")[0].reset();
   				}else{
   					saveChanges("opstina", record);
   					changeRecordInTable(record, "opstinaTable", index, "Master");
   					toastr.success("Object is saved!");
   					//$("#opstinaForm [name='id']").val(-1);
   					//$("#opstinaForm")[0].reset();
   				}
   				
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
   		
$("#drzavljanstvoForm").validate({
   			rules:{
   			naziv: {
   				 required: true 
   			},
   			},
   			messages: {
					naziv: {
				},
   				}
   		});
   		
   		$("body").on("click",".drzavljanstvoSubmitButton",function(){
   			var $form = $(this).parent().parent();
   			var formId = $form.attr("id");
   			if($("#drzavljanstvoForm").valid())
   			{
   				var values = $form.serialize();
   				var values = unescape(values.replace(/\+/g, ' '));
   				
   				var record = recordInput(values, "drzavljanstvo");
   				var referencingAttributes = metaData["drzavljanstvoReferencingAttributes"];
   				var referencedClasses = metaData["drzavljanstvoReferencedClasses"];
   				
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
   								record[val+"_representing"] = elValue[representingAttribute];
   								record[val] = elValue;
   								}
   							});
   							
   							if(isFound){
   							    record[val] = arrayOfValues;
   							}
   						});
   				var areClassRulesOk = true;		
   				if(areClassRulesOk){
   				var index = drzavljanstvoCollection.length;
   				if(record["id"]==-1){
   					record["id"] = idSeed++;
   					collections["drzavljanstvo"].push(record);
   					addRecordInTable(record, "drzavljanstvoTable", index, "Master");
   				  	toastr.success("Object is saved!");
   				  	//$("#drzavljanstvoForm [name='id']").val(-1);
   				  	//$("#drzavljanstvoForm")[0].reset();
   				}else{
   					saveChanges("drzavljanstvo", record);
   					changeRecordInTable(record, "drzavljanstvoTable", index, "Master");
   					toastr.success("Object is saved!");
   					//$("#drzavljanstvoForm [name='id']").val(-1);
   					//$("#drzavljanstvoForm")[0].reset();
   				}
   				
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
   		
$("#srednjaskolaForm").validate({
   			rules:{
   			naziv: {
   				 required: true 
   			},
   			},
   			messages: {
					naziv: {
				},
   				}
   		});
   		
   		$("body").on("click",".srednjaskolaSubmitButton",function(){
   			var $form = $(this).parent().parent();
   			var formId = $form.attr("id");
   			if($("#srednjaskolaForm").valid())
   			{
   				var values = $form.serialize();
   				var values = unescape(values.replace(/\+/g, ' '));
   				
   				var record = recordInput(values, "srednjaskola");
   				var referencingAttributes = metaData["srednjaskolaReferencingAttributes"];
   				var referencedClasses = metaData["srednjaskolaReferencedClasses"];
   				
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
   								record[val+"_representing"] = elValue[representingAttribute];
   								record[val] = elValue;
   								}
   							});
   							
   							if(isFound){
   							    record[val] = arrayOfValues;
   							}
   						});
   				var areClassRulesOk = true;		
   				if(areClassRulesOk){
   				var index = srednjaskolaCollection.length;
   				if(record["id"]==-1){
   					record["id"] = idSeed++;
   					collections["srednjaskola"].push(record);
   					addRecordInTable(record, "srednjaskolaTable", index, "Master");
   				  	toastr.success("Object is saved!");
   				  	//$("#srednjaskolaForm [name='id']").val(-1);
   				  	//$("#srednjaskolaForm")[0].reset();
   				}else{
   					saveChanges("srednjaskola", record);
   					changeRecordInTable(record, "srednjaskolaTable", index, "Master");
   					toastr.success("Object is saved!");
   					//$("#srednjaskolaForm [name='id']").val(-1);
   					//$("#srednjaskolaForm")[0].reset();
   				}
   				
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
   		
$("#tipSednjeSkoleForm").validate({
   			rules:{
   			naziv: {
   				 required: true 
   			},
   			},
   			messages: {
					naziv: {
				},
   				}
   		});
   		
   		$("body").on("click",".tipSednjeSkoleSubmitButton",function(){
   			var $form = $(this).parent().parent();
   			var formId = $form.attr("id");
   			if($("#tipSednjeSkoleForm").valid())
   			{
   				var values = $form.serialize();
   				var values = unescape(values.replace(/\+/g, ' '));
   				
   				var record = recordInput(values, "tipSednjeSkole");
   				var referencingAttributes = metaData["tipSednjeSkoleReferencingAttributes"];
   				var referencedClasses = metaData["tipSednjeSkoleReferencedClasses"];
   				
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
   								record[val+"_representing"] = elValue[representingAttribute];
   								record[val] = elValue;
   								}
   							});
   							
   							if(isFound){
   							    record[val] = arrayOfValues;
   							}
   						});
   				var areClassRulesOk = true;		
   				if(areClassRulesOk){
   				var index = tipSednjeSkoleCollection.length;
   				if(record["id"]==-1){
   					record["id"] = idSeed++;
   					collections["tipSednjeSkole"].push(record);
   					addRecordInTable(record, "tipSednjeSkoleTable", index, "Master");
   				  	toastr.success("Object is saved!");
   				  	//$("#tipSednjeSkoleForm [name='id']").val(-1);
   				  	//$("#tipSednjeSkoleForm")[0].reset();
   				}else{
   					saveChanges("tipSednjeSkole", record);
   					changeRecordInTable(record, "tipSednjeSkoleTable", index, "Master");
   					toastr.success("Object is saved!");
   					//$("#tipSednjeSkoleForm [name='id']").val(-1);
   					//$("#tipSednjeSkoleForm")[0].reset();
   				}
   				
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
   		
$("#drzavaForm").validate({
   			rules:{
   			naziv: {
   				 required: true 
   			},
   			kod: {
   				 required: true ,
   										minlength: 3,
   										maxlength: 3
   			},
   			},
   			messages: {
					naziv: {
				},
					kod: {
				},
   				}
   		});
   		
   		$("body").on("click",".drzavaSubmitButton",function(){
   			var $form = $(this).parent().parent();
   			var formId = $form.attr("id");
   			if($("#drzavaForm").valid())
   			{
   				var values = $form.serialize();
   				var values = unescape(values.replace(/\+/g, ' '));
   				
   				var record = recordInput(values, "drzava");
   				var referencingAttributes = metaData["drzavaReferencingAttributes"];
   				var referencedClasses = metaData["drzavaReferencedClasses"];
   				
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
   								record[val+"_representing"] = elValue[representingAttribute];
   								record[val] = elValue;
   								}
   							});
   							
   							if(isFound){
   							    record[val] = arrayOfValues;
   							}
   						});
   				var areClassRulesOk = true;		
   				if(areClassRulesOk){
   				var index = drzavaCollection.length;
   				if(record["id"]==-1){
   					record["id"] = idSeed++;
   					collections["drzava"].push(record);
   					addRecordInTable(record, "drzavaTable", index, "Master");
   				  	toastr.success("Object is saved!");
   				  	//$("#drzavaForm [name='id']").val(-1);
   				  	//$("#drzavaForm")[0].reset();
   				}else{
   					saveChanges("drzava", record);
   					changeRecordInTable(record, "drzavaTable", index, "Master");
   					toastr.success("Object is saved!");
   					//$("#drzavaForm [name='id']").val(-1);
   					//$("#drzavaForm")[0].reset();
   				}
   				
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
   		
$("#mestoForm").validate({
   			rules:{
   			naziv: {
   				 required: true 
   			},
   			postanskiBroj: {
   				pattern: /[0-9]{5}/
   			},
   			kod: {
   				 required: true 
   			},
   			},
   			messages: {
					naziv: {
				},
					postanskiBroj: {
				},
					kod: {
				},
   				}
   		});
   		
   		$("body").on("click",".mestoSubmitButton",function(){
   			var $form = $(this).parent().parent();
   			var formId = $form.attr("id");
   			if($("#mestoForm").valid())
   			{
   				var values = $form.serialize();
   				var values = unescape(values.replace(/\+/g, ' '));
   				
   				var record = recordInput(values, "mesto");
   				var referencingAttributes = metaData["mestoReferencingAttributes"];
   				var referencedClasses = metaData["mestoReferencedClasses"];
   				
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
   								record[val+"_representing"] = elValue[representingAttribute];
   								record[val] = elValue;
   								}
   							});
   							
   							if(isFound){
   							    record[val] = arrayOfValues;
   							}
   						});
   				var areClassRulesOk = true;		
   				if(areClassRulesOk){
   				var index = mestoCollection.length;
   				if(record["id"]==-1){
   					record["id"] = idSeed++;
   					collections["mesto"].push(record);
   					addRecordInTable(record, "mestoTable", index, "Master");
   				  	toastr.success("Object is saved!");
   				  	//$("#mestoForm [name='id']").val(-1);
   				  	//$("#mestoForm")[0].reset();
   				}else{
   					saveChanges("mesto", record);
   					changeRecordInTable(record, "mestoTable", index, "Master");
   					toastr.success("Object is saved!");
   					//$("#mestoForm [name='id']").val(-1);
   					//$("#mestoForm")[0].reset();
   				}
   				
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
   		
$("#nacionalnostForm").validate({
   			rules:{
   			naziv: {
   				 required: true 
   			},
   			},
   			messages: {
					naziv: {
				},
   				}
   		});
   		
   		$("body").on("click",".nacionalnostSubmitButton",function(){
   			var $form = $(this).parent().parent();
   			var formId = $form.attr("id");
   			if($("#nacionalnostForm").valid())
   			{
   				var values = $form.serialize();
   				var values = unescape(values.replace(/\+/g, ' '));
   				
   				var record = recordInput(values, "nacionalnost");
   				var referencingAttributes = metaData["nacionalnostReferencingAttributes"];
   				var referencedClasses = metaData["nacionalnostReferencedClasses"];
   				
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
   								record[val+"_representing"] = elValue[representingAttribute];
   								record[val] = elValue;
   								}
   							});
   							
   							if(isFound){
   							    record[val] = arrayOfValues;
   							}
   						});
   				var areClassRulesOk = true;		
   				if(areClassRulesOk){
   				var index = nacionalnostCollection.length;
   				if(record["id"]==-1){
   					record["id"] = idSeed++;
   					collections["nacionalnost"].push(record);
   					addRecordInTable(record, "nacionalnostTable", index, "Master");
   				  	toastr.success("Object is saved!");
   				  	//$("#nacionalnostForm [name='id']").val(-1);
   				  	//$("#nacionalnostForm")[0].reset();
   				}else{
   					saveChanges("nacionalnost", record);
   					changeRecordInTable(record, "nacionalnostTable", index, "Master");
   					toastr.success("Object is saved!");
   					//$("#nacionalnostForm [name='id']").val(-1);
   					//$("#nacionalnostForm")[0].reset();
   				}
   				
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
   		
$("#sObrazacForm").validate({
   			rules:{
   			datumRodjenja: {
   				 required: true 
   			},
   			mestoRodjena: {
   				 required: true 
   			},
   			opstinaRodjena: {
   				 required: true 
   			},
   			drzavaRodjenja: {
   				 required: true 
   			},
   			adresaStanovanjaStalog: {
   				 required: true 
   			},
   			opstinaStalnogStanovanja: {
   				 required: true 
   			},
   			mestoStalnogStanovanje: {
   				 required: true 
   			},
   			telefon: {
   				 required: true 
   			},
   			adresaStanovanjaZaVrijemeStudija: {
   				 required: true 
   			},
   			opstinaStanovanjaZaVrijemeStudija: {
   				 required: true 
   			},
   			mestoStanovanjeZaVrijemeStudija: {
   				 required: true 
   			},
   			mobilniTelefonZaVrijeStudija: {
   				 required: true 
   			},
   			drzavljanstvo: {
   				 required: true 
   			},
   			nacionalnost: {
   				 required: true 
   			},
   			srednjaSkola: {
   				 required: true 
   			},
   			profilSrednjeSkole: {
   				 required: true 
   			},
   			glavniRadniStatusStudenta: {
   				 required: true ,
   			},
   			bracniStatus: {
   				 required: true ,
   			},
   			tipSmjestaja: {
   			},
   			nacinIzdrazavanjaTokomStudija: {
   			},
   			glavniNacinIzdrzavanja: {
   			},
   			izdrzavanjeDrugihLica: {
   			},
   			},
   			messages: {
					datumRodjenja: {
				},
					mestoRodjena: {
				},
					opstinaRodjena: {
				},
					drzavaRodjenja: {
				},
					adresaStanovanjaStalog: {
				},
					opstinaStalnogStanovanja: {
				},
					mestoStalnogStanovanje: {
				},
					telefon: {
				},
					adresaStanovanjaZaVrijemeStudija: {
				},
					opstinaStanovanjaZaVrijemeStudija: {
				},
					mestoStanovanjeZaVrijemeStudija: {
				},
					mobilniTelefonZaVrijeStudija: {
				},
					drzavljanstvo: {
				},
					nacionalnost: {
				},
					srednjaSkola: {
				},
					profilSrednjeSkole: {
				},
					glavniRadniStatusStudenta: {
				},
					bracniStatus: {
				},
					tipSmjestaja: {
				},
					nacinIzdrazavanjaTokomStudija: {
				},
					glavniNacinIzdrzavanja: {
				},
					izdrzavanjeDrugihLica: {
				},
   				}
   		});
   		
   		$("body").on("click",".sObrazacSubmitButton",function(){
   			var $form = $(this).parent().parent();
   			var formId = $form.attr("id");
   			if($("#sObrazacForm").valid())
   			{
   				var values = $form.serialize();
   				var values = unescape(values.replace(/\+/g, ' '));
   				
   				var record = recordInput(values, "sObrazac");
   				var referencingAttributes = metaData["sObrazacReferencingAttributes"];
   				var referencedClasses = metaData["sObrazacReferencedClasses"];
   				
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
   								record[val+"_representing"] = elValue[representingAttribute];
   								record[val] = elValue;
   								}
   							});
   							
   							if(isFound){
   							    record[val] = arrayOfValues;
   							}
   						});
   				var areClassRulesOk = true;		
   				if(areClassRulesOk){
   				var index = sObrazacCollection.length;
   				if(record["id"]==-1){
   					record["id"] = idSeed++;
   					collections["sObrazac"].push(record);
   					addRecordInTable(record, "sObrazacTable", index, "Master");
   				  	toastr.success("Object is saved!");
   				  	//$("#sObrazacForm [name='id']").val(-1);
   				  	//$("#sObrazacForm")[0].reset();
   				}else{
   					saveChanges("sObrazac", record);
   					changeRecordInTable(record, "sObrazacTable", index, "Master");
   					toastr.success("Object is saved!");
   					//$("#sObrazacForm [name='id']").val(-1);
   					//$("#sObrazacForm")[0].reset();
   				}
   				
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
