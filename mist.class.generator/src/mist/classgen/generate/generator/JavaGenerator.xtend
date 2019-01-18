package mist.classgen.generate.generatorimport formValidation.ValidationClass
import formValidation.ClassAttribute
import formValidation.EVrsta
import formValidation.AttributeRule
import formValidation.Required
import formValidation.StringPattern
import formValidation.MinLength
import formValidation.MaxLength
import formValidation.MinNumber
import formValidation.MaxNumber
import formValidation.MinDate
import formValidation.MaxDate
import formValidation.AcceptableValuesString
import formValidation.Length
import java.util.logging.Level
import formValidation.AcceptableValuesDate
import formValidation.Equals
import formValidation.ClassRuleimport formValidation.NotEqualsimport formValidation.GreaterThanimport formValidation.LessThanimport formValidation.BusinessModelimport formValidation.FormLayoutimport formValidation.Gridimport formValidation.Tabimport formValidation.FieldSetimport formValidation.AttributeArrayimport org.eclipse.emf.common.util.EListimport formValidation.Passwordimport formValidation.EmailInputimport formValidation.TelInputimport formValidation.TextInputimport formValidation.NumericUIComponentimport formValidation.FileInputimport formValidation.RadioButtonimport formValidation.DropDownListimport formValidation.CheckBoximport formValidation.LoadValuesimport formValidation.AutocompleteComponentimport formValidation.AcceptableValuesimport formValidation.EDataTypeimport formValidation.TextAreaimport formValidation.EnumerationUIComponentimport formValidation.EUINumberComponentTypeimport formValidation.NonPrimitiveDataTypeimport java.util.Listimport formValidation.EOrientationimport java.util.ArrayListimport formValidation.PrimitiveDataTypeimport formValidation.ErrorMessageSettingsimport java.util.Dictionaryimport java.util.HashSetimport java.util.HashMap/**
 * Generate Database create sql
 */
class JavaGenerator{
    
    def generateHTML(BusinessModel businessModel){
    	'''
    		<!DOCTYPE html> 
    		<html>
    		<head>    			<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">     			     			    			
    			<style>
    				.panel{
    						display: none;
    					}
    			</style>

    			<meta charset=\"UTF-8\">
    			<title></title>
    		</head>
    			<body>    			<nav class="navbar fixed-top navbar-expand-lg navbar-light bg-light">
    			    <a class="navbar-brand" href="#">«businessModel.label»</a>
    			      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    			      <span class="navbar-toggler-icon"></span>
    			    </button>
    			    <div class="collapse navbar-collapse" id="navbarNavDropdown">
    			      <ul class="navbar-nav">
    			    
    			        <li class="nav-item dropdown">
    			          <a class="nav-link dropdown-toggle" href="http://example.com" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Add</a>
    			        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
    			        «FOR valClass : businessModel.validationclasses»    			        	<a class="dropdown-item" href="#add«valClass.name»">«generateInputLabel(valClass.name, valClass.label)»</a>    			        «ENDFOR»
    			        </div>
    			        </li>
    					<li class="nav-item dropdown">
    			          <a class="nav-link dropdown-toggle" href="http://example.com" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    			        Overview 
    			        </a>
    			        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
    			            «FOR valClass : businessModel.validationclasses»
    			              	<a class="dropdown-item" href="#overview«valClass.name»">«generateInputLabel(valClass.name, valClass.label)»</a>
    			             «ENDFOR»
    			        </div>
    			        </li>
    			      </ul>
    			    </div>
    			  </nav>    			  «FOR valClass : businessModel.validationclasses»
    			      «generateClass(valClass) »					  «generateClassOverview(valClass)»    			  «ENDFOR»    			    			<link href="https://cdnjs.cloudflare.com/ajax/libs/toastr.js/2.0.1/css/toastr.css" rel="stylesheet"/>
    			<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">    			<link rel="stylesheet" href="«businessModel.label».css">
    			<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>    			<script src="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.11.2/jquery-ui.js"></script>    			<script src=" https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.0/jquery.validate.js"></script>
    			<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.0/jquery.validate.min.js"></script>    			<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.0/additional-methods.js"></script>    			<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.0/additional-methods.min.js"></script>
    			
    			  <!--<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>  -->
    			  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
    			  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>	
    		      <script src="https://cdnjs.cloudflare.com/ajax/libs/toastr.js/2.0.1/js/toastr.js"></script>    		      <script src="«businessModel.label».js"></script>    			</body>
    		</html>
    	'''
    }    def generateCSS(BusinessModel businessModel){    	'''    	«generateAutocompleteCSS()»    	.delete-mode{    		margin-bottom: 50px;    	}    	.btn {
    	  background-color: DodgerBlue; /* Blue background */
    	  border: none; /* Remove borders */
    	  color: white; /* White text */
    	  padding: 12px 16px; /* Some padding */
    	  font-size: 16px; /* Set a font size */
    	  cursor: pointer; /* Mouse pointer on hover */
    	}
    	
    	.btn:hover {
    	  background-color: RoyalBlue;
    	}    	    	.additonalInfo-field{    		display: inline-block;    	}    	    	.delete-sidebar-items"{    		background-color: #c2d6d6    	}    		    	form{    		width: 80%;    		margin: 0 auto;    	}    		    	div form    	{    		align: center;    	}    		    	.formButtons    	{    		float: right;    	}    		    	table    	{    		margin: 0 auto;    	}    	    	.sideBar    	{
    	padding-top: 90px;    	text-align: center;    	background-color: #e6ffe6;    	border-right: 1px solid gray;    	}    	    	.content    	{    		padding-top: 90px;    	}    	.classOverview    	{    		overflow: hidden;
    		position: relative;
    		width: 100%;    	}    	    	.panel    	{    		padding-top: 90px;    	}    	    	.classOverview-content    	{    		    	}    	    	.delete-sidebar-items    	{    		display: none;    	}    		    	«FOR valClass : businessModel.validationclasses»    	     	#add«valClass.name»    	{    	 	align: center;    	}    	    	.select-box{    		display: none;    	}    	    	.sidebar-item{    		margin-bottom: 50px;    	}    	«generateAdditionlSettings(valClass)»    	«generateTableStyle(valClass)»	    	«ENDFOR»    	'''    }        def generateAutocompleteCSS(){    	'''    	.ui-autocomplete {
    	  position: absolute;
    	  top: 100%;
    	  left: 0;
    	  z-index: 1000;
    	  display: none;
    	  float: left;
    	  min-width: 160px;
    	  padding: 5px 0;
    	  margin: 2px 0 0;
    	  list-style: none;
    	  font-size: 14px;
    	  text-align: left;
    	  background-color: #ffffff;
    	  border: 1px solid #cccccc;
    	  border: 1px solid rgba(0, 0, 0, 0.15);
    	  border-radius: 4px;
    	  -webkit-box-shadow: 0 6px 12px rgba(0, 0, 0, 0.175);
    	  box-shadow: 0 6px 12px rgba(0, 0, 0, 0.175);
    	  background-clip: padding-box;
    	}
    	
    	.ui-autocomplete > li > div {
    	  display: block;
    	  padding: 3px 20px;
    	  clear: both;
    	  font-weight: normal;
    	  line-height: 1.42857143;
    	  color: #333333;
    	  white-space: nowrap;
    	}
    	
    	.ui-state-hover,
    	.ui-state-active,
    	.ui-state-focus {
    	  text-decoration: none;
    	  color: #262626;
    	  background-color: #f5f5f5;
    	  cursor: pointer;
    	}
    	
    	.ui-helper-hidden-accessible {
    	  border: 0;
    	  clip: rect(0 0 0 0);
    	  height: 1px;
    	  margin: -1px;
    	  overflow: hidden;
    	  padding: 0;
    	  position: absolute;
    	  width: 1px;
    	}    	'''    }        def generateAdditionlSettings(ValidationClass vClass){   		'''   		    	«FOR classSetting : vClass.additionalSettings»	   		    		«IF classSetting instanceof ErrorMessageSettings»   		    			#«vClass.name»Form label.error{   		    				color : («classSetting.color.red», «classSetting.color.green», «classSetting.color.blue»)   		    				}   		    		«ELSE»   		    		#«vClass.name»Form label.error{
   		    		   	color : #FF0000;
   		    		   }   		    		«ENDIF»
   		    	«ENDFOR»   		'''    }        def generateTableStyle(ValidationClass vClass){    	'''    	    			«IF vClass.overviewsettings != null && vClass.overviewsettings.tableoverview!= null && vClass.overviewsettings.tableoverview.width>0»    			#«vClass.name»Table{    				width: «vClass.overviewsettings.tableoverview.width»px;    			}    			«ENDIF»    	'''    }        def generateClassOverview(ValidationClass validationClass){    	'''    		<div id="overview«validationClass.name»" class="panel classOverview">    			<div class="row">    			<div class="col-1 sideBar">    			<button type="button" class="btn delete-mode" >
    				<i class="fa fa-trash"></i><br/> Delete mode
    			</button>    			<div class="delete-sidebar-items">    				<div class="sidebar-item"><button class="btn delete-selected"> <i class="fa fa-trash"></i> <br/> Delete selected </button></div>    				    				<div class="sidebar-item"><button class="btn delete-all"> <i class="fa fa-trash"></i> <br/> Delete all </button></div>    				<div class="sidebar-item"><button class="btn cancel-delete-mode"><i class="fas fa-close"></i> <br/> Cancel</button></div>    			</div>    			</div>    			<div class="col-11 content">    			<div class="no-content-message classOverview-content" ></div>    			«generateTable(validationClass,"")»    			    			<div id="linkedData«validationClass.name»" class="classOverview-content">    			<ul class="nav nav-tabs">    			«IF containsNonMasterAttributes(validationClass)»
    				<li class="nav-item">
    					<a class="nav-link active" href="#«validationClass.name»details" data-toggle="tab">Додатне информације о ентитету</a>
    				</li>    			«ENDIF»    				«FOR attr : validationClass.classattribute»    					«IF attr.attributetype.attributeDataType instanceof NonPrimitiveDataType»    					«var refClass = attr.attributetype.attributeDataType as NonPrimitiveDataType»    					    					 <li class="nav-item">
    					     	<a class="nav-link" href="#«attr.name»Tab" data-toggle="tab">«generateInputLabel(refClass.type.name, refClass.type.label)»</a>
    					  </li>    					«ENDIF»    				«ENDFOR»    			</ul>    			<div class="tab-content">    			«IF containsNonMasterAttributes(validationClass)»    			<div id="«validationClass.name»details" class="tab-pane active">    			     			«generateAdditionalInfo(validationClass)»    			</div>    			«ENDIF»    			«FOR attr : validationClass.classattribute»
    			   «IF attr.attributetype.attributeDataType instanceof NonPrimitiveDataType»
    			    «var refClass = attr.attributetype.attributeDataType as NonPrimitiveDataType»
    			    	 <div id="«attr.name»Tab"  class="tab-pane referenced">    			    		«var referencedClass = refClass.type as ValidationClass»    			    		«generateTable(referencedClass,"Ref")»
    			    	</div>
    			   «ENDIF»
    			«ENDFOR»    			</div>    			</div>    			</div>    			</div>    		</div>    	'''    }        def generateAdditionalInfo(ValidationClass vClass){    	'''    	«var nonMasterAttributes = getNonMasterAttributes(vClass)»    	«FOR i : 0..nonMasterAttributes.size-1»    	    	«IF i%2 == 0»    	<div class="form-row">
    	    <div class="form-group col-md-6  additonalInfo-field">    	    <label> «generateInputLabel(nonMasterAttributes.get(i).name,nonMasterAttributes.get(i).label)» :</label>    	    <div  class="additionalInfo" name="«nonMasterAttributes.get(i).name»"> </div>    	 	</div>    	  «IF i == nonMasterAttributes.size-1»    	  	</div>    	  «ENDIF»    	 «ELSE»    	 	<div class="form-group col-md-6 additonalInfo-field">    	 		  <label> «generateInputLabel(nonMasterAttributes.get(i).name,nonMasterAttributes.get(i).label)» :</label>
    	 		   <div class="additionalInfo" name = "«nonMasterAttributes.get(i).name»"> </div>
    	  	</div>    	</div>    	«ENDIF»    	    	«ENDFOR»    	'''    }        def getNonMasterAttributes(ValidationClass vClass)    {    	var nonMasterAttributes = new ArrayList();    	for(attr : vClass.classattribute ){    		if(!attr.master && (attr.attributetype.attributeDataType instanceof PrimitiveDataType)){    			nonMasterAttributes.add(attr);    		}    	}    	    	return nonMasterAttributes;    }        def containsNonMasterAttributes(ValidationClass vClass){    	var indicator = false;    	for(attr : vClass.classattribute){    		if(!attr.master && (attr.attributetype.attributeDataType instanceof PrimitiveDataType)){    			indicator = true;    		}    	}    	    	return indicator;    }        def generateTable(ValidationClass validationClass, String kind){    	'''    	<div class="classOverview-content">    	<table class="table table-hover" id="«IF kind.empty»«validationClass.name»Table">«ELSE»«validationClass.name»Table«kind»">«ENDIF»
    		<thead>
    	    <tr>    	    <th class="select-box"></th>
    	    «FOR attr : validationClass.classattribute»
    	    	«IF attr.master»
    	    	<th scope="col" class="column-name" name="«attr.name»">«IF attr.label != null && attr.label != ""» «attr.label» «ELSE»«generateInputLabel(attr.name)»«ENDIF»</th>
    	    	«ENDIF»
    	    «ENDFOR»
    	    </tr>
    	    </thead>
    	    <tbody>
    	    </tbody>
    	 </table>    	 </div>    	'''    }        def areAllTabs(EList<FormLayout> layouts)    {    	    	for(layout : layouts){    		if(!(layout instanceof Tab)){    			return false;    		}    	}    	    	return true;    }        
    def generateClass(ValidationClass validationClass){    	'''    	 <div id="add«validationClass.name»" class="panel">    	 <form id="«validationClass.name»Form">    	 <input type="hidden" name="id" value="-1"/>    	 «IF validationClass.formlayout.size > 0»    	     	     	     	 «IF areAllTabs(validationClass.formlayout)»    		«generateTabs(validationClass.formlayout)»    	 «ELSE»    	  «FOR layout : validationClass.formlayout»
    	     «generateLayout(layout)»
    	  «ENDFOR»    	 «ENDIF»    	     	 «ELSE»    	 	«generate(validationClass.classattribute, 12)»    	 «ENDIF»    	 <div class="formButtons">    	 <input type="button"  class="btn btn-success" id="«validationClass.name»SubmitButton" value="Submit"/>    	 <input type="button"  class="btn btn-success" value="Cancel" id="«validationClass.name»cancelButton"/>    	 </div>    	 </form>    	 </div>    	'''    }        def generateLayout(FormLayout layout){    	'''    	«IF layout instanceof Grid» «generateGrid(layout)» «ENDIF»    	    	«IF layout instanceof FieldSet» «generateFieldSet(layout)» «ENDIF»    	'''    }        def generateGrid(Grid gridLayout){    	'''    	    	    	«FOR row : gridLayout.attributearray»    	«generateGridRow(row)»    	«ENDFOR»    	'''    }        def generateTabs(EList<FormLayout> tabs){    	'''    	<ul class="nav nav-tabs">    	    	«FOR i : 0..tabs.size-1»    		«var tTab = tabs.get(i) as Tab»    		<li class="nav-item">
    			<a  «IF i==0»class="nav-link active"«ELSE»class="nav-link"«ENDIF»href="#«tTab.name»" data-toggle="tab">«generateInputLabel(tTab.name, tTab.label)»</a>
    		</li>    		    	«ENDFOR»    	</ul>    	    	<div class="tab-content">    	«FOR i : 0..tabs.size-1»
    	   «var tTab = tabs.get(i) as Tab»
    	   <div id="«tTab.name»" «IF i==0»class="tab-pane active container" «ELSE»class="tab-pane container"«ENDIF»>    	   «FOR array : tTab.attributearray»
    	     «FOR attribute : array.attributes»
    	       «generate(attribute)»
    	     «ENDFOR»
    	   «ENDFOR»    	   «IF tTab.layouts.size > 0»    	   	«IF areAllTabs(tTab.layouts)»    	   	«generateTabs(tTab.layouts)»    	   	«ELSE»    	   	«FOR layout : tTab.layouts»    	   		«generateLayout(layout)»    	   	«ENDFOR»    	   	«ENDIF»    	   «ENDIF»    	   </div>
    	 «ENDFOR»    	 </div>    	'''    }        def generateFieldSet(FieldSet fieldSet){    	'''    	<fieldset class="border p-2">    	<legend class="w-auto">«fieldSet.legend»</legend>    	«IF fieldSet.attributearray!= null»    	«FOR array : fieldSet.attributearray»    		«FOR attribute : array.attributes»    		«generate(attribute)»    		«ENDFOR»    	«ENDFOR»    	«ENDIF»    	    	«IF fieldSet.layouts.size>0»	    	«FOR layout : fieldSet.layouts»	    		«generateLayout(layout)»	    	«ENDFOR»	    «ENDIF»    	</fieldSet>    	'''    }        def generateGridRow(AttributeArray attributes){    	val n = attributes.attributes.size;    	val numOfCells = 12/n as int;    	generate(attributes.attributes, numOfCells);	    }        def generate(EList<ClassAttribute> attributes,int cellWidth)    {    '''    	<div class="form-row">    	«FOR attr : attributes»    	<div class="form-group col-md-«cellWidth»">    		«generate(attr)»    	</div>    	    	«ENDFOR»    	</div>    '''	    }    
    def generate(ClassAttribute attribute){
    	'''    	<label>«IF attribute.label != null && attribute.label != ""» «attribute.label» «ELSE» «generateInputLabel(attribute.name)» «ENDIF»</label>
    	«generateInputField(attribute)»	
    	'''
    }        def generateInputField(ClassAttribute attribute){    	'''    	«IF attribute.attributetype.uiComponent instanceof Password»    		«generateSimpleInput(attribute, "password", "")»    	«ELSEIF attribute.attributetype.uiComponent instanceof EmailInput»    		«val component = attribute.attributetype.uiComponent as EmailInput»    		«generateSimpleInput(attribute, "email", component.placeHolder)»    	«ELSEIF attribute.attributetype.uiComponent instanceof TelInput»    		«val component = attribute.attributetype.uiComponent as TelInput»    		«generateSimpleInput(attribute, "tel", component.placeHolder)»    	«ELSEIF attribute.attributetype.uiComponent instanceof TextInput»    		«val component = attribute.attributetype.uiComponent as TextInput»    		«generateSimpleInput(attribute, "text", component.placeHolder)»    	«ELSEIF attribute.attributetype.uiComponent instanceof TextArea»    		«generateTextArea(attribute)»    	«ELSEIF attribute.attributetype.uiComponent instanceof NumericUIComponent»    		«generateNumericUIComponent(attribute)»    	«ELSEIF attribute.attributetype.uiComponent instanceof FileInput»    		«generateSimpleInput(attribute, "file", "")»    	«ELSEIF attribute.attributetype.uiComponent instanceof RadioButton»    	  	«val component = attribute.attributetype.uiComponent as RadioButton»    		«generateRadioButtons(attribute, component.orientation)»    	«ELSEIF attribute.attributetype.uiComponent instanceof DropDownList»    		«generateDropDownList(attribute)»    	«ELSEIF attribute.attributetype.uiComponent instanceof CheckBox»    		«val component = attribute.attributetype.uiComponent as CheckBox»    		«generateCheckBoxes(attribute, component.orientation)»    	«ELSEIF attribute.attributetype.uiComponent instanceof LoadValues»    		Load values    	«ELSEIF attribute.attributetype.uiComponent instanceof AutocompleteComponent»    		    		«generateAutoComplete(attribute)»    	«ELSE»    		    		«generateUIComponentThatAreUnspecified(attribute)»    	«ENDIF »    	'''    }        def generateUIComponentThatAreUnspecified(ClassAttribute attribute){    	'''    	«IF attribute.attributetype.attributeDataType instanceof PrimitiveDataType»    	«val dataType = attribute.attributetype.attributeDataType as PrimitiveDataType»    	 «IF dataType.type == EDataType.BLOB»    	 	«generateSimpleInput(attribute,"file","")»    	 «ELSEIF dataType.type == EDataType.NUMBER»    	 	«generateSimpleInput(attribute,"number", "")»    	 «ELSEIF dataType.type == EDataType.DATE»   	    	 «ELSEIF dataType.type == EDataType.STRING»    	 	«IF dataType.isCollection»    	 		/*Dodati provjeru koliko ima vrijednosti u */    	 		«generateCheckBoxes(attribute, EOrientation.HORIZONTAL)»    	 	«ELSE»    	 		«generateSimpleInput(attribute, "text","")»    	 	«ENDIF»    	 «ENDIF»    	 «ELSE»    	 	«generateAutoComplete(attribute)»    	 «ENDIF»    	'''    }        def generateAutoComplete(ClassAttribute attribute){    	'''    		«IF attribute.attributetype.attributeDataType instanceof NonPrimitiveDataType»    		«var attributeType = attribute.attributetype.attributeDataType as NonPrimitiveDataType»    		«var type = attributeType.type»    		 <input class="form-control autocomplete"  id="«attribute.name»"Id name="«attribute.name»" placeholder="Enter A" data-class="«type.name»" />    		«ELSE»    		 <input class="form-control autocomplete"  id="«attribute.name»" name="«attribute.name»" placeholder="Enter A" data-class="" />    		«ENDIF»    	'''    }        def generateCheckBoxes(ClassAttribute attribute, EOrientation orientation){    	'''    	«IF attribute.attributetype.attributeDataType instanceof NonPrimitiveDataType»    	 «val referencedClass = attribute.attributetype.attributeDataType as NonPrimitiveDataType»    	 «val referencedClassName = referencedClass.type.name»    	 «referencedClassName»    	«ELSE»    		«FOR rule : attribute.attributerule»    			«IF rule instanceof AcceptableValuesString»    				«val stringValues = rule as AcceptableValuesString»    				«IF orientation == EOrientation.HORIZONTAL»	    				«FOR value : stringValues.values»	    				<label class="checkbox-inline"><input type="checkbox" value="«value»" name="«attribute.name»">«value»</label>	    				«ENDFOR»					«ELSE»						«FOR value : stringValues.values»
						<label class="checkbox-inline"><input type="checkbox" value="«value»" name="«attribute.name»">«value»</label>
						«ENDFOR»					«ENDIF»    			«ELSEIF rule instanceof AcceptableValuesDate»    				«val dateValues = rule as AcceptableValuesString»    				«IF orientation == EOrientation»    			    «FOR value : dateValues.values»    			    	<label class="checkbox-inline"><input type="checkbox" value="«value»" name="«attribute.name»">«value»</label>    			    «ENDFOR»    			    «ELSE»    			    	 «FOR value : dateValues.values»
    			    	    	<label class="checkbox-inline"><input type="checkbox" value="«value»" name="«attribute.name»" >«value»</label>
    			    	 «ENDFOR»    			    «ENDIF»    			«ENDIF»    		«ENDFOR»    	«ENDIF»    	    	'''    }        def generateRadioButtons(ClassAttribute attribute, EOrientation orientation){    	'''    	«IF attribute.attributetype.attributeDataType instanceof NonPrimitiveDataType»    	«ELSE»    		«FOR rule : attribute.attributerule»    			«IF rule instanceof AcceptableValuesString»    				«val stringValues = rule as AcceptableValuesString»    				«IF orientation == EOrientation.HORIZONTAL»    				«FOR value : stringValues.values»    					<label class="checkbox-inline"><input type="radio" value="«value»" name="«attribute.name»">«value»</label>    				«ENDFOR»    				«ELSE»    				«FOR value : stringValues.values»
    				   <label class="checkbox-inline"><input type="radio" value="«value»" name="«attribute.name»" >«value»</label>
    				 «ENDFOR»    				«ENDIF»    			«ELSEIF rule instanceof AcceptableValuesDate»    				«val dateValues = rule as AcceptableValuesString»
    			    «FOR value : dateValues.values»    			    	<label class="checkbox-inline"><input type="radio" value="«value»" name="«attribute.name»>"«value»</label>
    			    «ENDFOR»    			«ENDIF»    		«ENDFOR»    	«ENDIF»    	    	'''    }        def generateNumericUIComponent(ClassAttribute attribute){    	'''    	«val component = attribute.attributetype.uiComponent as NumericUIComponent»    	«IF component.componentType == EUINumberComponentType.SIMPLE_INPUT»    		«generateSimpleInput(attribute, "number", "")»    	«ELSE»	    	    <input type="range" class="form-control-range" id="«attribute.name»Id" name="«attribute.name»">    	«ENDIF»    	'''    }        def generateTextArea(ClassAttribute attribute){    	'''    	 «IF attribute.attributetype.uiComponent instanceof TextArea»    	 «val component = attribute.attributetype.uiComponent as TextArea»
    	  <textarea class="form-control" rows="«component.numOfRows»" id="«attribute.name»Id" name="«attribute.name»" placeholder="«component.placeHolder»"></textarea>    	 «ENDIF»    	'''    }        def  generateSimpleInput(ClassAttribute attribute, String type, String placeholder){    	'''    	<input id="«attribute.name»Id" class="form-control" type="«type»" placeholder="«placeholder»" name="«attribute.name»"/>    	'''    }    
    def generateDropDownList(ClassAttribute attribute){    	'''    	<select class="form-control" id="«attribute.name»Id" name="«attribute.name»">    	«IF attribute.attributetype.attributeDataType instanceof ValidationClass»    	«ELSE»    	«FOR rule : attribute.attributerule»    		«IF rule instanceof AcceptableValuesString»    		«FOR value : rule.values»    			<option>«value»</option>    		«ENDFOR»    		«ELSEIF rule instanceof AcceptableValuesDate»	    			    		«ENDIF»    	«ENDFOR»    	«ENDIF»    	</select>    	'''    }    
    def generateAttributeRules(AttributeRule rule, String attributeName){
    	'''
		«IF rule instanceof Required » required: true «ENDIF»
		«IF rule instanceof StringPattern»«stringPattern(rule)»«ENDIF»
		«IF rule instanceof MinLength»«minLengthRule(rule)»«ENDIF»
		«IF rule instanceof MaxLength»«maxLengthRule(rule)»«ENDIF»
		«IF rule instanceof MinNumber»«minNumberRule(rule)»«ENDIF»
		«IF rule instanceof MaxNumber»«maxNumberRule(rule)»«ENDIF»
		«««IF rule instanceof MinDate»«minDateRule(rule)»«ENDIF»
		«««IF rule instanceof MaxDate»«maxDateRule(rule)»«ENDIF»
		«««IF rule instanceof AcceptableValuesString»list="«attributeName»"«ENDIF»
		«IF rule instanceof Length»«setLengthRule(rule)»«ENDIF»
		«««IF rule instanceof AcceptableValuesDate»list="«attributeName»"«ENDIF»
    	'''
    }                def generateAttributeRulesMessage(AttributeRule rule, String attributeName){		'''			«IF rule instanceof Required»			«IF rule.attributeRuleErrorMessage!= null && rule.attributeRuleErrorMessage.message!=""»			required: "«rule.attributeRuleErrorMessage.message»"			«ENDIF»			«ELSEIF rule instanceof StringPattern»			«IF rule.attributeRuleErrorMessage!= null && rule.attributeRuleErrorMessage.message!=""»
			pattern: "«rule.attributeRuleErrorMessage.message»"
			«ENDIF»			«ELSEIF rule instanceof Length»
			«IF rule.attributeRuleErrorMessage!= null && rule.attributeRuleErrorMessage.message!=""»
			length: "«rule.attributeRuleErrorMessage.message»"
			«ENDIF»			«ELSEIF rule instanceof MaxLength»
			«IF rule.attributeRuleErrorMessage!= null && rule.attributeRuleErrorMessage.message!=""»
			maxlength: "«rule.attributeRuleErrorMessage.message»"
			«ENDIF»			«ELSEIF rule instanceof MinLength»
			«IF rule.attributeRuleErrorMessage!= null && rule.attributeRuleErrorMessage.message!=""»
			minlength: "«rule.attributeRuleErrorMessage.message»"
			«ENDIF»			«ELSEIF rule instanceof MinNumber»
			«IF rule.attributeRuleErrorMessage!= null && rule.attributeRuleErrorMessage.message!=""»
			min: "«rule.attributeRuleErrorMessage.message»"
			«ENDIF»			«ELSEIF rule instanceof MaxNumber»
			«IF rule.attributeRuleErrorMessage!= null && rule.attributeRuleErrorMessage.message!=""»
			max: "«rule.attributeRuleErrorMessage.message»"
			«ENDIF»			«ENDIF»		'''    }
    
    def stringPattern(StringPattern pattern){
    	'''
    		pattern: /«pattern.value»/
    	'''
    }
    
    def minLengthRule(MinLength minLength){
    	'''
    		minlength: «minLength.value»
    	'''
    }
    
    def maxLengthRule(MaxLength maxLength){
    	'''
    		maxlength: «maxLength.value»
    	'''
    }
    
    def minNumberRule(MinNumber minNumber){
    	'''
    		min: "«minNumber.value»"
    	'''
    }
    
    def maxNumberRule(MaxNumber maxNumber){
    	'''
    		max: "«maxNumber.value»"
    	'''
    }
    
    def minDateRule(MinDate minDate){
    	'''
    		min="«minDate.value»"
    	'''
    }
    
    def maxDateRule(MaxDate maxDate){
    	'''
    		max="«maxDate.value»"
    	'''
    }
    
    def generateStringDataList(ClassAttribute attribute){
    	'''
    		«FOR rule :  attribute.attributerule»
    			«IF rule instanceof AcceptableValuesString »
    			
    				<datalist id="«attribute.name»">
    				«generateDataListOptions(rule)»
    			
    			«ENDIF»
    		«ENDFOR»
    	'''
    	
    }
    
    def generateDateDataList(ClassAttribute attribute){
    	'''
    		«FOR rule :  attribute.attributerule»
    			«IF rule instanceof AcceptableValuesDate»
    			
    				<datalist id="«attribute.name»">
    				«generateDateOptions(rule)»
    			
    			«ENDIF»
    		«ENDFOR»
    	'''
    }
    
    def generateDataListOptions(AcceptableValuesString acceptableValues){
    	'''
    		«FOR value : acceptableValues.values AFTER '</datalist>'»
    		<option value="«value»"></option> 
    		«ENDFOR»
    		
    	'''
    }
    
    def generateDateOptions(AcceptableValuesDate rule){
    	'''
    		«FOR value : rule.values AFTER '</datalist>'»
    		<option label="nesto«value»">«value»</option>
    		«ENDFOR»
    	'''
    }
    
    def setLengthRule(Length length){
    	'''
    	length: "«length.value»"
    	'''
    }
    
    def generateScript(ValidationClass cls){
    	'''
    		$(document).ready(function(){
    		«FOR cont : cls.classrule»
    			«IF cont instanceof Equals»	
    				
    			«ENDIF»
    		«ENDFOR»
    		});
    	'''
    }
    
    def generateConstraintEquals(Equals equalsRule){
    	'''
    		if(
    		«FOR attr : equalsRule.attributearray.attributes AFTER ')'»
    			$("#«attr.name»id").val() ==
    		«ENDFOR»
    	'''
    }        def generateInputLabel(String name){    	var strings = name.split("(?=[A-Z])");    	var newName ="";    	for(str : strings ){    		newName += str.toFirstUpper();    		newName +=" "    	}    	    	return newName;    }     def generateInputLabel(String name, String label){     	if(label!=null && label!=""){     		return label;     	}else{     		generateInputLabel(name);     	}     }        def generateJS(BusinessModel model){    	'''    		$(document).ready(function() {    		var variables=[];	    		var collections = [];    		var metaData = [];    		var idSeed = 0;    		«FOR vclass : model.validationclasses»	
    		   «generateGlobalVariableMasterJS(vclass)»    		   «generateGlobalVariableCollectionsJS(vclass)»
    		   «generateGlobalVariableRepresenting(vclass)»
    		   «generateGlobalVariablesAllAttributes(vclass)»
    		   «generateGlobalCollection(vclass)»
    		   «generateGlobalVariableReferencedClasses(vclass)»
    		«ENDFOR»    		    		    		«generateMenuItemOpenCloseJS()»    		«addRecord()»    		«selectRecord()»    		«getRecordFromCollection()»    		«editRecord()»    		«addAttributesCollection()»    		«isDataTypeCollection()»    		«deleteSelected()»    		«changeRecordInTable()»    		«saveChanges()»    		«setFormInputValues()»    		«deleteAll()»    		«enterDeleteMode()»    		«cancelDeleteMode()»    		«deleteElememetsFromCollection()»    		«showRecordDetails()»    		«checkIfDeletingIsPosible()»    		«FOR vclass : model.validationclasses»    			«generateValidationRules(vclass)»
    			«FOR rule : vclass.classrule»
    			  «««genFunction(rule)»
    			«ENDFOR»
    			«FOR attr : vclass.classattribute»    			«IF attr.attributetype.uiComponent != null»
    			  «IF attr.attributetype.uiComponent instanceof AutocompleteComponent»
    			   «generateAutoCompleteJS(attr)»
    			 «ENDIF»    			«ENDIF»
    		    «ENDFOR»
    		«ENDFOR»    		    		«recordInput()»    		});    	'''    }        def generateGlobalVariableReferencedClasses(ValidationClass vClass){        	val referencedClasses = new ArrayList();    	var referencingAttributes = new ArrayList();
    	  for(attribute : vClass.classattribute){
    	    if(attribute.attributetype.attributeDataType instanceof NonPrimitiveDataType)
    	    {    	    	var dataType = attribute.attributetype.attributeDataType as NonPrimitiveDataType;    	    	var refClass = dataType.type;
    	    	referencedClasses.add(refClass.name);    	    	referencingAttributes.add(attribute.name);
    	    }
    	  }
    	'''	
    	  var «vClass.name»ReferencingAttributes = [ «FOR attr : referencingAttributes  SEPARATOR ',' AFTER ''» "«attr»"«ENDFOR»];
    	  metaData["«vClass.name»ReferencingAttributes"] = «vClass.name»ReferencingAttributes;    	      	   var «vClass.name»ReferencedClasses = [ «FOR attr : referencedClasses SEPARATOR ',' AFTER ''» "«attr»"«ENDFOR»];
    	   metaData["«vClass.name»ReferencedClasses"] =  «vClass.name»ReferencedClasses;
    	'''      /* 	'''    	var refAttrClass = [];    	«FOR attr : vClass.classattribute»    		«IF attr.attributetype.attributeDataType instanceof NonPrimitiveDataType»    		«var dataType = attr.attributetype.attributeDataType as NonPrimitiveDataType »    		refAttrClass[«attr.name»] = «dataType.type.name»    		«ENDIF»    	«ENDFOR»    	metaData["«vClass.name»ReferencingAttributes"] = refAttrClass;    	''' */        }        def generateGlobalCollection(ValidationClass vClass){    	'''    	var «vClass.name»Collection = [];    	collections["«vClass.name»"] = «vClass.name»Collection;    	'''    }        def enterDeleteMode(){    	'''    		$(".delete-mode").click(function(e){    			var $this = $(this);    			var $divParent = $this.parent();    			$divParent.find(".delete-sidebar-items").show();    			$(".select-box").show();    			});    	'''    }        def cancelDeleteMode(){    	'''    	$(".cancel-delete-mode").click(function(e){    		$(this).parent().parent().hide();    		var table = $(this).parent().parent().parent().parent().find("table")[0];    		$("#"+table.id+" .select-box").hide();    	});    	'''	    }        def generateValidationRules(ValidationClass vClass){    	''' $("#«vClass.name»Form").validate({    			rules:{    			«FOR attr : vClass.classattribute»    				«generateAttributeRule(attr)»    			«ENDFOR»    			},    			messages: {				«FOR attr : vClass.classattribute»
					 «generateAttributeRuleMessage(attr)»
				«ENDFOR»    				}    		});    		    		$("#«vClass.name»SubmitButton").click(function(){    			    			if($("#«vClass.name»Form").valid())    			{
    				var values = $("#«vClass.name»Form").serialize();    				var record = recordInput(values, "«vClass.name»");    				var referencingAttributes = metaData["«vClass.name»ReferencingAttributes"];    				var referencedClasses = metaData["«vClass.name»ReferencedClasses"];    				    					$.each(referencingAttributes, function(index, val){    						var classRef = referencedClasses[index];    						var referencedCollection = collections[classRef];    						var representingAttribute = metaData[classRef+"MetaDataRepresenting"][0];    						var arrayOfValues = [];    						var isFound = false;    						referencedCollection.forEach(function(elValue, elIndex){    						    							if(elValue[representingAttribute] == record[val]){    								isFound = true;    								arrayOfValues.push(elValue);    								record[val] = elValue;    								}    							});    							    							if(isFound){
    							    record[val] = arrayOfValues;
    							}    						});    				var areClassRulesOk = true;		    				«FOR cRule : vClass.classrule»    					«genFunction(cRule)»    				«ENDFOR»		    				if(areClassRulesOk){    				var index = «vClass.name»Collection.length;    				if(record["id"]==-1){
    					record["id"] = idSeed++;    					collections["«vClass.name»"].push(record);    					addRecordInTable(record, "«vClass.name»Table", index, "Master");
    				  	toastr.success("Object is saved!");    				}else{    					saveChanges("«vClass.name»", record);    					changeRecordInTable(record, "«vClass.name»Table", index, "Master");    					toastr.success("Object is saved!");    				}    				    				}else{    					toastr.error("There are some errors. Please fix errors and try again.");
    					return false;    				}    			}    			else    			{    				toastr.error("There are some errors. Please fix errors and try again.");    				return false;    			}    		});    		    	'''	    }        def getReferencedClass(ValidationClass vclass){    	'''    	'''    }        def saveChanges(){    	'''    	saveChanges = function(className, record){    		var indexElement =-1;    		$.each(collections[className], function(index, value){    			if(value["id"]==record["id"]){    				indexElement = index;    				}    			});    			    			collections[className].splice(indexElement,1);    			collections[className].push(record);    		}    	'''    }        def addRecord(){    	'''    	addRecordInTable = function(record, tableIdentifier, index, className){    		var identifier = "#" + tableIdentifier;    		var newRow = "<tr class="+className+" data-index="+index+" data-id="+record["id"]+">";    		newRow +="<td class=\"select-box\"><input type=\"checkbox\"/></td>"    		$(identifier + " th.column-name").each(function(){    			newRow += "<td>" + record[$(this).attr("name")] + "</td>"    		});    		newRow += "</tr>"
    		$(identifier +" tbody").append(newRow);
    	}    	'''    }        def changeRecordInTable(){    	'''    	changeRecordInTable = function(record, tableIdentifier, index, className){    		var identifierRow = "#" + tableIdentifier + " tr[data-id='"+record["id"]+"']";    		var newRow ="<td class=\"select-box\"><input type=\"checkbox\"/></td>"    		var identifier = "#" + tableIdentifier;    		$(identifierRow).empty();
    		$(identifier + " th.column-name").each(function(){
    		    	newRow += "<td>" + record[$(this).attr("name")] + "</td>"
    		  });    		$(identifierRow).append(newRow);    		    	}    	'''    }        def selectRecord(){    	'''$("body").on("mouseenter", ".Master", function(){			$this = $(this);			$parentTable = $this.parent().parent();			$divParent = $parentTable.parent().parent();			$divElements = $divParent.find("div .referenced");			var tableName = $parentTable.attr("id").split("Table")[0];			var index = $this.attr("data-index");			var record = collections[tableName][index];			showDetailsForSelectedRecords(tableName, record);			$.each($divElements, function(key, value){				var divId = value.id;				var attrName = value.id.split("Tab")[0];				var refValues = record[attrName]				var tableReferenced = $("#"+divId + " Table").attr("id");				$("#" + tableReferenced + " tbody").empty();				if(Object.prototype.toString.call(refValues) == '[object String]'){
										
				$("#" + tableReferenced).hide();
				var noContentDiv = "<div class=\"noContent\"> There is no referenced records. </div>"
				$("#"+divId).append(noContentDiv);
				}else if(Object.prototype.toString.call(refValues) == '[object Array]' && refValues.length > 0){				$("#" + divId +" .noContent").remove();
				$("#" + tableReferenced).show();				$.each(refValues, function(index, val){					addRecordInTable(val, tableReferenced, index, "Referenced");										});				}				});			var attributes = tableName + "MetaDataMaster";			var metaDataMaster = metaData[attributes];			var id = $this.attr("id");			var additionalInfo = "#" + tableName + "details";							});	'''    }    def showRecordDetails(){    	'''    	showDetailsForSelectedRecords = function(tableName, record){    		var nonMasterAttributes = $("#"+tableName+"details .additionalInfo");    		$.each(nonMasterAttributes, function(){    			var el = this;
    			
    			var attributes = el.attributes;
    			var attrName = attributes[1].nodeValue;
    			var value = record[attrName];
    					
    			$(this).text(value);    		});    	}    	'''    }        def editRecord(){    	'''    	$("body").on('dblclick',"tbody tr",function(){    		var $row = $(this);    		var rowId = $row.attr("data-id");    		var $table = $(this).parent().parent();    		var tableName = $table.attr("id").split("Table")[0];    		record = getRecord(tableName, rowId);    		var formSelector = "#" + tableName + "Form";    		setFormInputValues(formSelector, record); 	    		});    	'''	    }        def setFormInputValues(){    	'''    	setFormInputValues = function(formSelector, record){    		var keys = Object.keys(record);    		for(i = 0; i < keys.length; i++){
    		    var value = record[keys[i]];    		    var selector = formSelector +" [name=\'"+keys[i]+"\']";
    		    $(selector).val(value);
    		}    	toastr.success("Data are shown in form. Please open form to see data.");    	}    	'''    }        def getRecordFromCollection(){    	'''    	getRecord = function(tableName, id){    		var retValue;    		$.each(collections[tableName], function(key, value){    			if (value["id"] == id){    				retValue = value;    				}    			});    		return retValue    	};    	'''    }	def recordInput(){		'''				recordInput = function(inputValues, className){		var values = inputValues.split("&");		var record = [];						addAttributesCollection(className, record, values);		values.forEach(function(value){			var valAux = value.split("=");			if(!isDataTypeCollection(className, valAux[0])){				record[valAux[0]]= valAux[1];			}		});				return record;		}		'''	}        def addAttributesCollection(){    	'''    	addAttributesCollection = function(className, record, values){    		metaData[className+"MetaDataCollection"].forEach(function(val){    			record[val] = []    			values.forEach(function(value){    				var velAux = value.split("=");    				if(velAux[0] == val){    					    					record[val].push(velAux[1]);    					}    				});    		});    	}    	'''    }        def isDataTypeCollection(){    '''    isDataTypeCollection = function(className, attributeName){         	var retVal = false;    	metaData[className+"MetaDataCollection"].forEach(function(value){    		if(value == attributeName){    			retVal = true;    		}    	});    	    	return retVal;    }    '''	    }        def generateAttributeRule(ClassAttribute attribute){    	'''    		«IF attribute.attributerule.size>0»    		«attribute.name»: {    			«FOR rule : attribute.attributerule SEPARATOR ',' AFTER ''»
    			    «generateAttributeRules(rule, attribute.name)»
    			«ENDFOR»    		},    		«ENDIF»    	'''    }        def generateAttributeRuleMessage(ClassAttribute attribute){    	'''    		«IF attribute.attributerule.size>0»
    	    	«attribute.name»: {
    	    	«FOR rule : attribute.attributerule»
    	    		«generateAttributeRulesMessage(rule, attribute.name)»
    	    	«ENDFOR»
    	    },
    	    «ENDIF»    	'''    }        def generateGlobalVariableMasterJS(ValidationClass validationClass){    	    		val List<String> masterAttributes = new ArrayList()     		for(attribute : validationClass.classattribute){    			if(attribute.master)    			{    				masterAttributes.add(attribute.name)    			}    		}    	'''	    		metaData["«validationClass.name»MetaDataMaster"] = [ «FOR attr : masterAttributes  SEPARATOR ',' AFTER ''» "«attr»"«ENDFOR»];    	'''    }        def deleteSelected(){    	'''    	$(".delete-selected").click(function(){    		var $divContainingTable = $(this).parent().parent().parent().parent();    		var className = $divContainingTable.parent().attr("id").split("overview")[1];    		var $table = $divContainingTable.find("table");    		var selectedRows = $table.find("input[type='checkbox']:checked");    		var idList = [];    		$.each(selectedRows, function(){    			var cellElement = $(this).parent();    			var rowElement = $(this).parent().parent();    			idList.push(rowElement.attr("data-id"));    			rowElement.remove();    			    			});    			deleteRecords(className, idList);    		});    	'''    }        def deleteAll(){    	'''    	$(".delete-all").click(function(){
    	    	var $divContainingTable = $(this).parent().parent().parent().parent();    	    	var $tbody = $divContainingTable.find("tbody");
    	        	    });    	'''   	}   	   	   	def deleteElememetsFromCollection(){   		'''   		deleteRecords = function(className, ids){   			   			$.each(ids, function(key,val){   				//if(checkIfDeletingIsPosible(val)){   				$.each(collections[className], function(keyCol, value){   					if(value["id"] == val){   						collections[className].splice(keyCol,1);   					}   				});   			//	}else{   				//	toastr.error("Not posible to remove.");   				//	}   			});   		}   		'''   	}       /*def generateDeleteFunctionalityJS(){    	'''    	$(".sideBar button").click(function(){    		$this = $(this);    		var $sideBar = $this.parent();    		$sideBar.find(".delete-sidebar-items").show();    	});    	'''    }  */         	def checkIfDeletingIsPosible(){    		'''    		checkIfDeletingIsPosible = function(id){    			var counter = 0;    			var collectionKeys = Object.keys(collections);    			for(i = 0; i < collectionKeys.length; i++){    				var keys = Objects.keys(collections[collectionKeys[i]]);    				for(j = 0; j < keys.length; j++){    					if(collections[collectionKeys[i]][keys[j]]["id"]==id){    						counter++;    					}    				}    			}    			    			if(counter>1){    				return false;    			}else{    				return true;    			}    		}    		    		'''    	}    	        def generateGlobalVariableCollectionsJS(ValidationClass validationClass){    	    		val List<String> collectionAttributes = new ArrayList()     		for(attribute : validationClass.classattribute){    			if(attribute.attributetype.attributeDataType.isCollection)    			{    				collectionAttributes.add(attribute.name)    			}    		}    	'''	    		metaData["«validationClass.name»MetaDataCollection"] = [ «FOR attr : collectionAttributes  SEPARATOR ',' AFTER ''» "«attr»"«ENDFOR»];    	'''    }        def generateGlobalVariableRepresenting(ValidationClass validationClass){    	    		val List<String> representingAttributes = new ArrayList()    		for(attribute : validationClass.classattribute){    			if(attribute.isIsClassRepresenting)    			{    				representingAttributes.add(attribute.name)    			}    		}    	'''    		metaData["«validationClass.name»MetaDataRepresenting"] = [ «FOR attributeName : representingAttributes  SEPARATOR ',' AFTER ''»"«attributeName»"«ENDFOR» ];    	'''    }        def generateGlobalVariablesAllAttributes(ValidationClass vclass){    	'''    		metaData["«vclass.name»AllAttributes"] = [ «FOR attr : vclass.classattribute SEPARATOR ',' AFTER ''» "«attr.name»" «ENDFOR»];;    	'''    }        def generateCollections(ValidationClass valClass){    	'''    		var «valClass.name»Collection = [];  			var «valClass.name»AvailableTags = [];    	'''    }        def generateMenuItemOpenCloseJS(){    	'''    	$(".dropdown-item").click(function(){
    		var $this = $(this);
    		var panelSelector = $this.attr("href");
    		var $panelToShow = $(panelSelector);			
    		$(".panel").hide();
    		$panelToShow.show();    		    		if(panelSelector.indexOf("overview")>=0){    			var className = panelSelector.split("overview")[1];    			if(collections[className]=="undefined" || collections[className].length == 0){    				$("#linkedData"+className).hide();    				$(panelSelector + " .no-content-message").text("There is no records.");    				$(panelSelector + " table").hide();    			}else{    				$("#linkedData"+className).show();    				$(panelSelector + " .no-content-message").empty();    				$(panelSelector +" table").show();    			}    		}else{    		}
    	});    	'''    }      	def generateAutoCompleteJS(ClassAttribute attribute){  		'''  			  			$(".autocomplete").click(function() {  			«var List<String> values =  newArrayList()»  			«FOR rule : attribute.attributerule»  				«IF rule instanceof AcceptableValuesString»  					«val acceptableValues  = rule as AcceptableValuesString»  					«values = acceptableValues.values»  				«ELSEIF rule instanceof AcceptableValuesDate»  					«val acceptableValues  = rule as AcceptableValuesDate»
  					«values = acceptableValues.values»  				«ENDIF»  			«ENDFOR»  			«IF !values.empty»
  			  var «attribute.name»AvailableTags = [  			  «FOR value : values BEFORE '[' SEPARATOR ',' AFTER '];'»  			  	«value»
  			  «ENDFOR» 
  			  $("#«attribute.name»").autocomplete({
  			    source: «attribute.name»AvailableTags
  				});
  			});  			«ELSE»  			«var type = attribute.attributetype.attributeDataType as NonPrimitiveDataType»  			var dataClass = $(this).attr("data-class"); 			«var dataType = type.type as ValidationClass » 			var values = collections[dataClass];  			var «attribute.name»AvailableTags = [];  			var attrName = dataClass + "MetaDataRepresenting";  			var metaDateRepresenting = metaData[attrName];  			$.each(values, function(index, val){  				var element = val;  				var value = "";  				$.each(metaDateRepresenting, function(index, vall){  					value += element[vall];  					});  				«attribute.name»AvailableTags.push(value);  			});  			$("#«attribute.name»").autocomplete({
  				  source: «attribute.name»AvailableTags
  			});
  			});  			«ENDIF»  		'''  	}  	    def genFunction(ClassRule classRule){    	'''    	«IF classRule instanceof Equals» «generateEqualsRule(classRule)»«ENDIF»    	«IF classRule instanceof NotEquals»«generateNotEqualsRule(classRule)»«ENDIF»    	«IF classRule instanceof GreaterThan»«generateGreaterRule(classRule)»«ENDIF»    	«IF classRule instanceof LessThan»«generateLessRule(classRule)»«ENDIF»    	'''    }        def generateEqualsRule(Equals equalsRule){    	'''    		if(«FOR input : equalsRule.attributearray.attributes SEPARATOR '|| '»record["«input.name»"] != record["«equalsRule.attributearray.attributes.get(0).name»"] «ENDFOR»)    		{    			    			toastr.error("«FOR rule : equalsRule.attributearray.attributes SEPARATOR ' and '»«generateInputLabel(rule.name)»«ENDFOR»should be same.");    			areClassRulesOk = false;    		}    	'''    }        def generateNotEqualsRule(NotEquals notEqualsRule){    	'''    	if(«FOR input : notEqualsRule.attributearray.attributes »«generateNonEqualsCondition(input,notEqualsRule)»«ENDFOR» false)    	{    			    			toastr.error("«FOR rule : notEqualsRule.attributearray.attributes SEPARATOR 'and'» «generateInputLabel(rule.name)»«ENDFOR»should be different.");    			areClassRulesOk = false;    	}    	'''    }        def generateGreaterRule(GreaterThan rule){    	'''    		if(«FOR input : rule.attributearray»«FOR attr : input.attributes SEPARATOR "|| "»$("#«rule.classattribute.name»id").val() > $("#«attr.name»id").val()«ENDFOR»«ENDFOR»)    		{    			    			toastr.error("«FOR input : rule.attributearray»«FOR attr : input.attributes SEPARATOR 'and '»«generateInputLabel(attr.name, attr.label)»«ENDFOR»«ENDFOR» should be greaterthan «generateInputLabel(rule.classattribute.name)».");    			areClassRulesOk = false;    		}    	'''    }        def generateLessRule(LessThan rule){    	'''    		if(«FOR input : rule.attributearray»«FOR attr : input.attributes SEPARATOR "|| "»$("#«rule.classattribute.name»id").val() < $("#«attr.name»id").val()«ENDFOR»«ENDFOR»)    		{    			
    			toastr.error("«FOR input : rule.attributearray»«FOR attr : input.attributes SEPARATOR 'and '»«generateInputLabel(attr.name, attr.label)»«ENDFOR»«ENDFOR» should be less than «generateInputLabel(rule.classattribute.name)».");    			areClassRulesOk = false;    		}    	'''    }        def generateNonEqualsCondition(ClassAttribute input, NotEquals notEqualsRule){    	'''    	«IF input != notEqualsRule.attributearray.attributes.get(0) »record["«input.name»"]== record["«notEqualsRule.attributearray.attributes.get(0).name»"] ||  «ENDIF»    	'''    }
	def generateAuxiliarFunction(){		'''		addRecordInCollection = function(record, tableIdentifier){			tableIdentifierCollecion		}		'''	}
    
}