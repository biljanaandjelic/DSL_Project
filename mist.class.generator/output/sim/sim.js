$(document).ready(function() {
var variables=[];	
var collections = [];
var metaData = [];
var idSeed = 0;
metaData["class1MetaDataMaster"] = [  "attr", "attrr"];
metaData["class1MetaDataCollection"] = [ ];
metaData["class1MetaDataRepresenting"] = [ "attr" ];
metaData["class1AllAttributes"] = [  "attr" , "attrr" ];;
var class1Collection = [];
collections["class1"] = class1Collection;
var class1ReferencingAttributes = [ ];
metaData["class1ReferencingAttributes"] = class1ReferencingAttributes;

 var class1ReferencedClasses = [ ];
 metaData["class1ReferencedClasses"] =  class1ReferencedClasses;
metaData["class2MetaDataMaster"] = [  "attr"];
metaData["class2MetaDataCollection"] = [ ];
metaData["class2MetaDataRepresenting"] = [ "attr" ];
metaData["class2AllAttributes"] = [  "attr" ];;
var class2Collection = [];
collections["class2"] = class2Collection;
var class2ReferencingAttributes = [ ];
metaData["class2ReferencingAttributes"] = class2ReferencingAttributes;

 var class2ReferencedClasses = [ ];
 metaData["class2ReferencedClasses"] =  class2ReferencedClasses;
metaData["class3MetaDataMaster"] = [  "bb"];
metaData["class3MetaDataCollection"] = [  "attr"];
metaData["class3MetaDataRepresenting"] = [ "bb" ];
metaData["class3AllAttributes"] = [  "bb" , "attr" ];;
var class3Collection = [];
collections["class3"] = class3Collection;
var class3ReferencingAttributes = [  "attr"];
metaData["class3ReferencingAttributes"] = class3ReferencingAttributes;

 var class3ReferencedClasses = [  "class2"];
 metaData["class3ReferencedClasses"] =  class3ReferencedClasses;
    		
$(".dropdown-item").click(function(){
	var $this = $(this);
	var panelSelector = $this.attr("href");

	var aText = $this.text();

	var ahref = $this.attr("href");
	if(ahref.indexOf("add")>-1){
		aText = aText +" Add"
		var $panelToShow = $(panelSelector);
		
		$panelToShow.show();
		var $newPanelToShow = $(panelSelector).clone();
		$(".panel").hide();
		$newPanelToShow.show();
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
	var newTabHeader = "<li class=\"nav-item\" data-id=\"\"><a class=\"nav-link active\" href=\""+selector+id+"\" data-toggle=\"tab\"><button class=\"close closeTabbb\" type=\"button\" >×</button>"+panelSelector+"_"+id+"</a></li>";
	//$(".tabPanel-li").append(newTabHeader);
	$(".panel").hide();
//	$(".panel").find("form").attr("id",$(".panel").find("form").attr("id")+"_")
	   
	/*if(typeof($panelToShow.find("form").attr("id")) != 'undefined'){
	    	$panelToShow.find("form").attr("id",$panelToShow.find("form").attr("id").split("_")[0]);
	 } */
	//$panelToShow.show();
	//var $newPanel = $panelToShow.clone();
	//$panelToShow.hide();
	//$newPanel.show();
	
	//$("#tabPanelContainer").append($newPanel);
	
	var sel = "a[href=\"#add" +panelSelector+id+"\"]";
	    		
	var $samecomponent = $(".tabPanel-li").find(sel);
	if($samecomponent.length>0){
	  //  alert("vec postoji ne otvaraj stavi u fokus");
	    $samecomponent.attr("class","nav-link active");
	}else{
		$panelToShow.show();
		var $newPanel = $panelToShow.clone();
		$panelToShow.hide();
		$newPanel.attr("id", "add"+panelSelector+id);
		$(".tabPanel-li").find("a").attr("class","nav-link");
		$(".tabPanel-li").append(newTabHeader);
		$("#tabPanelContainer").append($newPanel);
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
    		        		alert(index);
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
		if(attrFormCol == field){
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
		//return;
	}else{
	}
});
$("#class1Form").validate({
   			rules:{
   			},
   			messages: {
   				}
   		});
   		
   		$("body").on("click",".class1SubmitButton",function(){
   			var $form = $(this).parent().parent();
   			var formId = $form.attr("id");
   			if($("#class1Form").valid())
   			{
   				var values = $form.serialize();
   				var values = unescape(values.replace(/\+/g, ' '));
   				
   				var record = recordInput(values, "class1");
   				var referencingAttributes = metaData["class1ReferencingAttributes"];
   				var referencedClasses = metaData["class1ReferencedClasses"];
   				
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
   				var index = class1Collection.length;
   				if(record["id"]==-1){
   					record["id"] = idSeed++;
   					collections["class1"].push(record);
   					addRecordInTable(record, "class1Table", index, "Master");
   				  	toastr.success("Object is saved!");
   				  	//$("#class1Form [name='id']").val(-1);
   				  	//$("#class1Form")[0].reset();
   				}else{
   					saveChanges("class1", record);
   					changeRecordInTable(record, "class1Table", index, "Master");
   					toastr.success("Object is saved!");
   					//$("#class1Form [name='id']").val(-1);
   					//$("#class1Form")[0].reset();
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
   		
$("#class2Form").validate({
   			rules:{
   			},
   			messages: {
   				}
   		});
   		
   		$("body").on("click",".class2SubmitButton",function(){
   			var $form = $(this).parent().parent();
   			var formId = $form.attr("id");
   			if($("#class2Form").valid())
   			{
   				var values = $form.serialize();
   				var values = unescape(values.replace(/\+/g, ' '));
   				
   				var record = recordInput(values, "class2");
   				var referencingAttributes = metaData["class2ReferencingAttributes"];
   				var referencedClasses = metaData["class2ReferencedClasses"];
   				
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
   				var index = class2Collection.length;
   				if(record["id"]==-1){
   					record["id"] = idSeed++;
   					collections["class2"].push(record);
   					addRecordInTable(record, "class2Table", index, "Master");
   				  	toastr.success("Object is saved!");
   				  	//$("#class2Form [name='id']").val(-1);
   				  	//$("#class2Form")[0].reset();
   				}else{
   					saveChanges("class2", record);
   					changeRecordInTable(record, "class2Table", index, "Master");
   					toastr.success("Object is saved!");
   					//$("#class2Form [name='id']").val(-1);
   					//$("#class2Form")[0].reset();
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
   		
$("#class3Form").validate({
   			rules:{
   			},
   			messages: {
   				}
   		});
   		
   		$("body").on("click",".class3SubmitButton",function(){
   			var $form = $(this).parent().parent();
   			var formId = $form.attr("id");
   			if($("#class3Form").valid())
   			{
   				var values = $form.serialize();
   				var values = unescape(values.replace(/\+/g, ' '));
   				
   				var record = recordInput(values, "class3");
   				var referencingAttributes = metaData["class3ReferencingAttributes"];
   				var referencedClasses = metaData["class3ReferencedClasses"];
   				
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
   				var index = class3Collection.length;
   				if(record["id"]==-1){
   					record["id"] = idSeed++;
   					collections["class3"].push(record);
   					addRecordInTable(record, "class3Table", index, "Master");
   				  	toastr.success("Object is saved!");
   				  	//$("#class3Form [name='id']").val(-1);
   				  	//$("#class3Form")[0].reset();
   				}else{
   					saveChanges("class3", record);
   					changeRecordInTable(record, "class3Table", index, "Master");
   					toastr.success("Object is saved!");
   					//$("#class3Form [name='id']").val(-1);
   					//$("#class3Form")[0].reset();
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
