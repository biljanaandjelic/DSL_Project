$(document).ready(function() {
var variables=[];	
var collections = [];
var metaData = [];
var idSeed = 0;
var validators = [];
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
metaData["sObrazacMetaDataMaster"] = [  "datumRodjenja", "adresaStanovanjaStalog", "telefon", "mobilniTelefonZaVrijeStudija"];
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

    		var aText = $this.text();
var validatorDynamic;
var formId;
    		var ahref = $this.attr("href");
    		if(ahref.indexOf("add")>-1){
    			aText = aText +" Add"
    			var $panelToShow = $(panelSelector);
    			
    			$panelToShow.show();
    			var $form = $panelToShow.find("form");
    			formId = $form.attr("id");
    			var el1=$(panelSelector + " " + formId);
    			$(panelSelector + " #" + formId).attr("id", formId +"_");
    			var el2= $("#tabPanel " + panelSelector + " #" + formId + "_");
    			$("#tabPanel " + panelSelector + " #" + formId + "_").attr("id", formId);
    			var $newPanelToShow = $(panelSelector).clone();
    			
    			$(".panel").hide();
    			$newPanelToShow.show();
    			$newPanelToShow.find("form").attr("id", formId);
    			var newForm = $("#"+formId);
    			validatorDynamic = validators[formId.split("Form")[0]];
    			var validator2 = $("#"+formId).validate(validatorDynamic);
    		}else{
    			aText = aText + " Overview"
    			var $panelToShow = $(panelSelector);
    			$(".panel").hide();
    			 $panelToShow.show();
    			 var $newPanelToShow = $(panelSelector);
    			 
    		}
    		var id = $panelToShow.attr("id");
    	
    		$(".tabPanel-li").find("a").attr("class","nav-link");
    		var sel = "a[href=\"#" +id+"\"]";
    		
    		var $samecomponent = $(".tabPanel-li").find(sel);
    		if($samecomponent.length>0){
    			$samecomponent.attr("class","nav-link active");
    		}else{
    		var newTabHeader = "<li class=\"nav-item\" data-id=\"\"><a class=\"nav-link active\" href=\"#"+id+"\" data-toggle=\"tab\"><button class=\"close closeTabbb\" type=\"button\" >×</button>"+aText+"</a></li>";
    		$(".tabPanel-li").append(newTabHeader);
    		$("#tabPanelContainer").append($newPanelToShow);
    		if(formId !== undefined){
    			var validator2 = $("#"+formId).validate(validatorDynamic);
    			}
    		}

    		var $ddLists = $(panelSelector).find("select");
    		$ddLists.each(function(index){
    			loadValuesInDropDownList($(this));
    		});
    		if(panelSelector.indexOf("overview")>=0){
    			var className = panelSelector.split("overview")[1];
    			if(collections[className]=="undefined" || collections[className].length == 0){
    				$("#linkedData"+className).hide();
    				$(panelSelector + " .no-content-message").text("There is no records.");
    				$(panelSelector + " table").hide();
    				$(panelSelector + " .sideBar").hide();
    			}else{
    				$("#linkedData"+className).show();
    				$(panelSelector + " .no-content-message").empty();
    				$(panelSelector +" table").show();
    				$(panelSelector + " .sideBar").show();
    			}
    		}else{
    		}
    	});
openTab = function(panelSelector, id){
	alert("open tab");
	var selector = "#add" + panelSelector;
	var $panelToShow = $(selector);
    
	$(".tabPanel-li").find("a").attr("class","nav-link");
	var newTabHeader = "<li class=\"nav-item\" data-id=\"\"><a class=\"nav-link active\" href=\""+selector+id+"\" data-toggle=\"tab\"><button class=\"close closeTabbb\" type=\"button\" >×</button>"+panelSelector+"_"+id+"</a></li>";

	$(".panel").hide();
    

	
	var sel = "a[href=\"#add" +panelSelector+id+"\"]";
	    		
	var $samecomponent = $(".tabPanel-li").find(sel);
	if($samecomponent.length>0){
	    $samecomponent.attr("class","nav-link active");
	}else{
		$panelToShow.show();
		var $newPanel = $panelToShow.clone();
		$panelToShow.hide();
		$newPanel.attr("id", "add"+panelSelector+id);
		$newPanel.find("form").attr("id","edit"+panelSelector+id);

		$(".tabPanel-li").find("a").attr("class","nav-link");
		$(".tabPanel-li").append(newTabHeader);
		$("#tabPanelContainer").append($newPanel);
		var elll = $("#edit"+panelSelector+id+ "[name='id']");
		$("#edit"+panelSelector+id+ " [name='id']").val(id);
		var validator = validators[panelSelector];
		$("#edit"+panelSelector+id).validate(validator);
		
		$newPanel.show();
	}
}
$("body").on("click", "#tabPanel .tabPanel-li a", function(e){
    		 $("#tabPanel a").attr("class","nav-link");
    		 $(this).attr("class", "nav-link active");
    		 $(".panel").hide();
    		 var panelSelector = $(this).attr("href");
    		 var $panelToShow = $(panelSelector);
    		// $(".panel").find("form").attr("id",$(".panel").find("form").attr("id")+"_")
    		     		   
    		 /* if(typeof($panelToShow.find("form").attr("id")) != 'undefined'){
    		     $panelToShow.find("form").attr("id",$panelToShow.find("form").attr("id").split("_")[0]);
    		    } */
    		    var $ddLists = $(panelSelector).find("select");
    		        $ddLists.each(function(index){
    		        		//alert(index);
    		        		loadValuesInDropDownList($(this));
    		        });
    		 $panelToShow.show();
});
contains = function(attrFromCol, field){
	if(Object.prototype.toString.call(field) == '[object Array]'){
		var contain = false;
		$.each(field, function(index, val){
				if(val == attrFromCol){
					contain = true;
				}
							
		});
		
		return contain;
	}else{
		if(attrFromCol == field){
			return true;
		}else{
			return false;
		}
	}
}
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
$("body").on("click",".delete-selected",function(){
	var $divContainingTable = $(this).parent().parent().parent().parent();
	var className = $divContainingTable.parent().attr("id").split("overview")[1];
	var $table = $divContainingTable.find("table");
	var selectedRows = $table.find("input[type='checkbox']:checked");
	var idList = [];
	
	$.each(selectedRows, function(){
		var cellElement = $(this).parent();
		var rowElement = $(this).parent().parent();
		idList.push(rowElement.attr("data-id"));
		});
		
	
	if(deleteRecords(className, idList)){
		$.each(selectedRows, function(){
		   var cellElement = $(this).parent();
		   var rowElement = $(this).parent().parent();
		    	rowElement.remove();
		    			
		    });
	}
	var panelSelector = "#overview" + className;		
	if($table.find("tr").length<2){
		$(panelSelector + " .no-content-message").text("There is no records.");
		$(panelSelector + " table").hide();
		$(panelSelector + " .sideBar").hide();
	}
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
    	var className = $divContainingTable.parent().attr("id").split("overview")[1];
    	var $tbody = $divContainingTable.find("tbody");
    	var rows = $tbody.find("tr");
    	var idList = [];
    	$.each(rows, function(){
    		idList.push($(this).attr("data-id"));
    	});
    	
    	if(deleteRecords(className, idList)){
    	   $.each(rows, function(){
    	    $(this).remove();
    	    			    			
    	    });
    	 }
    
    	var panelSelector = "#overview" + className;
    	if($tbody.find("tr").length==0){
    		$(panelSelector + " .no-content-message").text("There is no records.");
    		$(panelSelector + " table").hide();
    		$(panelSelector + " .sideBar").hide();
    	}
    
    });
$("body").on("click", ".delete-mode",function(e){
	var $this = $(this);
	var $divParent = $this.parent();
	var $rootPanel = $this.parent().parent().parent();
	var rootId = $rootPanel.attr("id");
	var tableName = rootId.split("overview")[1]+"Table";
	$divParent.find(".delete-sidebar-items").show();
	var tableSelector = "#"+tableName+ " .select-box";
	$(tableSelector).show();
	});
$("body").on("click", ".cancel-delete-mode",function(e){
	$(this).parent().parent().hide();
	var table = $(this).parent().parent().parent().parent().find("table")[0];
	$("#"+table.id+" .select-box").hide();
});
deleteRecords = function(className, ids){
	var isDeletingPossible = true;
	$.each(ids, function(key, val){
		if(!checkIfDeletingIsPossible(val)){
			isDeletingPossible = false;
		}
	});
	if(isDeletingPossible){
	$.each(ids, function(key,val){
		
		var index = -1;
		$.each(collections[className], function(keyCol, value){
			if(value["id"] == val){
				
				index = keyCol;
			}
		});
		collections[className].splice(index,1);
			
	});
	}else{
		toastr.error("Not posible to remove.");
	}
	
	return isDeletingPossible;
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
checkIfDeletingIsPossible = function(id){
	var counter = 0;
	var collectionKeys = Object.keys(collections);
	for(i = 0; i < collectionKeys.length; i++){
		var keys1 = Object.keys(collections[collectionKeys[i]]);
		for(j = 0; j < keys1.length; j++){
			var el = collections[collectionKeys[i]][keys1[j]];
			if(el["id"] == id){
				counter++;
			}
			
			if(el instanceof jQuery){
				var itIsObject = true;
				var objValues = el.values();
			}
			
			if(!$.isEmptyObject(el)){
			var keyValues = el.keys();
			for(k = 0; k < keyValues.length; k++){
				var element = el[keyValues[k]]
				if(element !== undefined && element["id"] == id){
				    	counter++;
				}
			}
			
				   	
				$.each(el,function(k,v){
					if($.isArray(v)){
						var succ = true;
					}
				});
				
					var keyValues2 = Object.keys(el);
				    for(k = 0; k < keyValues2.length; k++){
				    	var element = el[keyValues2[k]]
				    	if($.isArray(element)){
				    		var arrayKeys = Object.keys(element);
				    		for(l = 0; l< arrayKeys.length; l++){
				    			var refObj = element[l];
				    			if(!$.isEmptyObject(refObj)){
				    				var refObjKeys = Object.keys(refObj);
				    				if (refObj!=undefined && refObj["id"]==id){
				    					counter++;
				    				}
				    				
				    				for(m = 0; m < refObjKeys.length; m++){
				    					var attrVal =  refObj[m];
				    					if(refObj[m] !==undefined && refObj[m]==id){
				    						counter++;
				    						}
				    				}
				    			}
				    		}
				    	}
				    	if(element !== undefined && element["id"] == id){
				    		counter++;
				    	 }
				  	}
			}
			
			/*if(Object.prototype.toString.call(el) == '[object Array]'){
			var keyValues = Object.keys(collectionKeys[i][keys[j]]);
			for(k = 0; k < keyValues.length; k++){
				var element = el[keyValues[k]]
				if(element !== undefined && element["id"] == id){
				    		counter++;
				    }
				}
			} */
		}
	}
	
	if(counter>1){
		return false;
	}else{
		return true;
	}
}

loadValuesInDropDownList = function(component){
	    $this = component;
	    var name = $this.attr("name");
	    var alertBoxContent = "Get focus "+ name;  
	    var kind = $this.attr("data-kind");
	    if(kind == "ValidationClass"){
	    	$this.empty();
	    		var dataClass = $this.attr("data-class");
	    	 	
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
$(".tabPanel-li").on("click",".closeTabbb", function(e){
	e.preventDefault();
	var $li = $(this).parent().parent();
	var tabId = $(this).parent().attr("href");
	$li.remove();
	$(tabId).hide();
	var $items = $(".tabPanel-li").find("a");
	if($items.length>0){
		var element = $items[0];
		var el = $items.get(0);
		var $element =$(el);
		$(el).attr("class", "nav-link active");
		var $element1 = $(el);
		var panelSelector = $(el).attr("href");
		$(".panel").hide();
		$(panelSelector).show();
		event.stopImmediatePropagation();
	}else{
	}
});
    	
    	var opstinaValidateObject = {
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
    	    		};
    	validators["opstina"]=opstinaValidateObject;		
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
    			if($("#"+formId).valid())
    			{
    				var values = $form.serialize();
    				var values = unescape(values.replace(/\+/g, ' '));
    				
    				var record = recordInput(values, "opstina");
    				var referencingAttributes = metaData["opstinaReferencingAttributes"];
    				var referencedClasses = metaData["opstinaReferencedClasses"];
    				
    				var arrayOfValues = [];
    				var isFound = false;
    					$.each(referencingAttributes, function(index, val){
    						var classRef = referencedClasses[index];
    						var referencedCollection = collections[classRef];
    						var representingAttribute = metaData[classRef+"MetaDataRepresenting"][0];
    						
    						
    						referencedCollection.forEach(function(elValue, elIndex){
    							
    							if(contains(elValue[representingAttribute], record[val])){
    								isFound = true;
    								arrayOfValues.push(elValue);
    								record[val+"_representing"] = elValue[representingAttribute];
    								//record[val] = elValue;
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
    		
    	
    	var drzavljanstvoValidateObject = {
    	    			rules:{
    	    			naziv: {
    	    				 required: true 
    	    			},
    	    			},
    	    			messages: {
    						naziv: {
    					},
    	    				}
    	    		};
    	validators["drzavljanstvo"]=drzavljanstvoValidateObject;		
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
    			if($("#"+formId).valid())
    			{
    				var values = $form.serialize();
    				var values = unescape(values.replace(/\+/g, ' '));
    				
    				var record = recordInput(values, "drzavljanstvo");
    				var referencingAttributes = metaData["drzavljanstvoReferencingAttributes"];
    				var referencedClasses = metaData["drzavljanstvoReferencedClasses"];
    				
    				var arrayOfValues = [];
    				var isFound = false;
    					$.each(referencingAttributes, function(index, val){
    						var classRef = referencedClasses[index];
    						var referencedCollection = collections[classRef];
    						var representingAttribute = metaData[classRef+"MetaDataRepresenting"][0];
    						
    						
    						referencedCollection.forEach(function(elValue, elIndex){
    							
    							if(contains(elValue[representingAttribute], record[val])){
    								isFound = true;
    								arrayOfValues.push(elValue);
    								record[val+"_representing"] = elValue[representingAttribute];
    								//record[val] = elValue;
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
    		
    	
    	var srednjaskolaValidateObject = {
    	    			rules:{
    	    			naziv: {
    	    				 required: true 
    	    			},
    	    			},
    	    			messages: {
    						naziv: {
    					},
    	    				}
    	    		};
    	validators["srednjaskola"]=srednjaskolaValidateObject;		
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
    			if($("#"+formId).valid())
    			{
    				var values = $form.serialize();
    				var values = unescape(values.replace(/\+/g, ' '));
    				
    				var record = recordInput(values, "srednjaskola");
    				var referencingAttributes = metaData["srednjaskolaReferencingAttributes"];
    				var referencedClasses = metaData["srednjaskolaReferencedClasses"];
    				
    				var arrayOfValues = [];
    				var isFound = false;
    					$.each(referencingAttributes, function(index, val){
    						var classRef = referencedClasses[index];
    						var referencedCollection = collections[classRef];
    						var representingAttribute = metaData[classRef+"MetaDataRepresenting"][0];
    						
    						
    						referencedCollection.forEach(function(elValue, elIndex){
    							
    							if(contains(elValue[representingAttribute], record[val])){
    								isFound = true;
    								arrayOfValues.push(elValue);
    								record[val+"_representing"] = elValue[representingAttribute];
    								//record[val] = elValue;
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
    		
    	
    	var tipSednjeSkoleValidateObject = {
    	    			rules:{
    	    			naziv: {
    	    				 required: true 
    	    			},
    	    			},
    	    			messages: {
    						naziv: {
    					},
    	    				}
    	    		};
    	validators["tipSednjeSkole"]=tipSednjeSkoleValidateObject;		
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
    			if($("#"+formId).valid())
    			{
    				var values = $form.serialize();
    				var values = unescape(values.replace(/\+/g, ' '));
    				
    				var record = recordInput(values, "tipSednjeSkole");
    				var referencingAttributes = metaData["tipSednjeSkoleReferencingAttributes"];
    				var referencedClasses = metaData["tipSednjeSkoleReferencedClasses"];
    				
    				var arrayOfValues = [];
    				var isFound = false;
    					$.each(referencingAttributes, function(index, val){
    						var classRef = referencedClasses[index];
    						var referencedCollection = collections[classRef];
    						var representingAttribute = metaData[classRef+"MetaDataRepresenting"][0];
    						
    						
    						referencedCollection.forEach(function(elValue, elIndex){
    							
    							if(contains(elValue[representingAttribute], record[val])){
    								isFound = true;
    								arrayOfValues.push(elValue);
    								record[val+"_representing"] = elValue[representingAttribute];
    								//record[val] = elValue;
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
    		
    	
    	var drzavaValidateObject = {
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
    	    		};
    	validators["drzava"]=drzavaValidateObject;		
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
    			if($("#"+formId).valid())
    			{
    				var values = $form.serialize();
    				var values = unescape(values.replace(/\+/g, ' '));
    				
    				var record = recordInput(values, "drzava");
    				var referencingAttributes = metaData["drzavaReferencingAttributes"];
    				var referencedClasses = metaData["drzavaReferencedClasses"];
    				
    				var arrayOfValues = [];
    				var isFound = false;
    					$.each(referencingAttributes, function(index, val){
    						var classRef = referencedClasses[index];
    						var referencedCollection = collections[classRef];
    						var representingAttribute = metaData[classRef+"MetaDataRepresenting"][0];
    						
    						
    						referencedCollection.forEach(function(elValue, elIndex){
    							
    							if(contains(elValue[representingAttribute], record[val])){
    								isFound = true;
    								arrayOfValues.push(elValue);
    								record[val+"_representing"] = elValue[representingAttribute];
    								//record[val] = elValue;
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
    		
    	
    	var mestoValidateObject = {
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
    	    		};
    	validators["mesto"]=mestoValidateObject;		
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
    			if($("#"+formId).valid())
    			{
    				var values = $form.serialize();
    				var values = unescape(values.replace(/\+/g, ' '));
    				
    				var record = recordInput(values, "mesto");
    				var referencingAttributes = metaData["mestoReferencingAttributes"];
    				var referencedClasses = metaData["mestoReferencedClasses"];
    				
    				var arrayOfValues = [];
    				var isFound = false;
    					$.each(referencingAttributes, function(index, val){
    						var classRef = referencedClasses[index];
    						var referencedCollection = collections[classRef];
    						var representingAttribute = metaData[classRef+"MetaDataRepresenting"][0];
    						
    						
    						referencedCollection.forEach(function(elValue, elIndex){
    							
    							if(contains(elValue[representingAttribute], record[val])){
    								isFound = true;
    								arrayOfValues.push(elValue);
    								record[val+"_representing"] = elValue[representingAttribute];
    								//record[val] = elValue;
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
    		
    	
    	var nacionalnostValidateObject = {
    	    			rules:{
    	    			naziv: {
    	    				 required: true 
    	    			},
    	    			},
    	    			messages: {
    						naziv: {
    					},
    	    				}
    	    		};
    	validators["nacionalnost"]=nacionalnostValidateObject;		
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
    			if($("#"+formId).valid())
    			{
    				var values = $form.serialize();
    				var values = unescape(values.replace(/\+/g, ' '));
    				
    				var record = recordInput(values, "nacionalnost");
    				var referencingAttributes = metaData["nacionalnostReferencingAttributes"];
    				var referencedClasses = metaData["nacionalnostReferencedClasses"];
    				
    				var arrayOfValues = [];
    				var isFound = false;
    					$.each(referencingAttributes, function(index, val){
    						var classRef = referencedClasses[index];
    						var referencedCollection = collections[classRef];
    						var representingAttribute = metaData[classRef+"MetaDataRepresenting"][0];
    						
    						
    						referencedCollection.forEach(function(elValue, elIndex){
    							
    							if(contains(elValue[representingAttribute], record[val])){
    								isFound = true;
    								arrayOfValues.push(elValue);
    								record[val+"_representing"] = elValue[representingAttribute];
    								//record[val] = elValue;
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
    		
    	
    	var sObrazacValidateObject = {
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
    	    		};
    	validators["sObrazac"]=sObrazacValidateObject;		
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
    			if($("#"+formId).valid())
    			{
    				var values = $form.serialize();
    				var values = unescape(values.replace(/\+/g, ' '));
    				
    				var record = recordInput(values, "sObrazac");
    				var referencingAttributes = metaData["sObrazacReferencingAttributes"];
    				var referencedClasses = metaData["sObrazacReferencedClasses"];
    				
    				var arrayOfValues = [];
    				var isFound = false;
    					$.each(referencingAttributes, function(index, val){
    						var classRef = referencedClasses[index];
    						var referencedCollection = collections[classRef];
    						var representingAttribute = metaData[classRef+"MetaDataRepresenting"][0];
    						
    						
    						referencedCollection.forEach(function(elValue, elIndex){
    							
    							if(contains(elValue[representingAttribute], record[val])){
    								isFound = true;
    								arrayOfValues.push(elValue);
    								record[val+"_representing"] = elValue[representingAttribute];
    								//record[val] = elValue;
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
