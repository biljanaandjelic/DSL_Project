	$(document).ready(function() {
	var variables=[];	
	var collections = [];
	var metaData = [];
	
	metaData["class1MetaDataMaster"] = [  "classAttr", "classBbbb"];
	metaData["class1MetaDataCollection"] = [ ];
	metaData["class1MetaDataRepresenting"] = [ "classAttr" ];
	metaData["class1AllAttributes"] = [  "classAttr" , "classBbbb" , "classCcc" , "aaa" , "classYYa" ];;
	var class1Collection = [];
	collections["class1"] = class1Collection; 
	var class1ReferencingAttributes = [ ];
	metaData["class1ReferencingAttributes"] = class1ReferencingAttributes;
	
	 var class1ReferencedClasses = [ ];
	 metaData["class1ReferencedClasses"] =  class1ReferencedClasses;
	    		
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

	
	$("#class1Form").validate({
	   			rules:{
	   			classBbbb: {
	   				 required: true ,
	   			},
	   			classCcc: {
	   				 required: true ,
	   			},
	   			},
	   			messages: {
						classBbbb: {
					},
						classCcc: {
					},
	   				}
	   		});
	   		
	   		$("#class1SubmitButton").click(function(){
	   			
	   			if($("#class1Form").valid())
	   			{
	   				var values = $("#class1Form").serialize();
	   				var record = recordInput(values);
	   				var referencingAttributes = metaData["class1ReferencingAttributes"];
	   				var referencedClasses = metaData["class1ReferencedClasses"];
	   				
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
	   				 if(record["classAttr"] != record["classAttr"] || record["classBbbb"] != record["classAttr"] )
	   				{
	   					
	   					toastr.error("Class Attr  and Class Bbbb should be same.");
	   					areClassRulesOk = false;
	   				}
	   				if(record["aaa"]== record["classCcc"] ||  
	   				 false)
	   				{
	   						
	   						toastr.error(" Class Ccc and Aaa should be different.");
	   						areClassRulesOk = false;
	   				}
	   				if(areClassRulesOk){
	   				var index = class1Collection.length;
	   				collections["class1"].push(record);
	   				addRecordInTable(record, "class1Table", index, "Master");
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
