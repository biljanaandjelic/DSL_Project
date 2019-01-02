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
import formValidation.ClassRuleimport formValidation.NotEqualsimport formValidation.GreaterThanimport formValidation.LessThanimport formValidation.BusinessModelimport formValidation.FormLayoutimport formValidation.Gridimport formValidation.Tabimport formValidation.FieldSetimport formValidation.AttributeArrayimport org.eclipse.emf.common.util.EListimport formValidation.Passwordimport formValidation.EmailInputimport formValidation.TelInputimport formValidation.TextInputimport formValidation.NumericUIComponentimport formValidation.FileInputimport formValidation.RadioButtonimport formValidation.DropDownListimport formValidation.CheckBoximport formValidation.LoadValuesimport formValidation.AutocompleteComponentimport formValidation.AcceptableValuesimport formValidation.EDataTypeimport formValidation.TextAreaimport formValidation.EnumerationUIComponentimport formValidation.EUINumberComponentTypeimport formValidation.NonPrimitiveDataTypeimport java.util.Listimport formValidation.EOrientation/**
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
    			<sctipt>
    		
    			</script>
    			<meta charset=\"UTF-8\">
    			<title></title>
    		</head>
    			<body>    			<nav class="navbar navbar-expand-lg navbar-light bg-light">
    			    <a class="navbar-brand" href="#">IS</a>
    			      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    			      <span class="navbar-toggler-icon"></span>
    			    </button>
    			    <div class="collapse navbar-collapse" id="navbarNavDropdown">
    			      <ul class="navbar-nav">
    			    
    			        <li class="nav-item dropdown">
    			          <a class="nav-link dropdown-toggle" href="http://example.com" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    			        Add 
    			        </a>
    			        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
    			        «FOR valClass : businessModel.validationclasses»    			        	<a class="dropdown-item" href="#add«valClass.name»">«valClass.name»</a>    			        «ENDFOR»
    			        </div>
    			        </li>
    					<li class="nav-item dropdown">
    			          <a class="nav-link dropdown-toggle" href="http://example.com" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    			        Overview 
    			        </a>
    			        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
    			            «FOR valClass : businessModel.validationclasses»
    			              	<a class="dropdown-item" href="#overview«valClass.name»">«valClass.name»</a>
    			             «ENDFOR»
    			        </div>
    			        </li>
    			      </ul>
    			    </div>
    			  </nav>    			  «FOR valClass : businessModel.validationclasses»
    			      «generateClass(valClass) »					  «generateClassOverview(valClass)»    			   «ENDFOR»
    			<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>    			<script src="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.11.2/jquery-ui.js"></script>
    			  <!--<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>  -->
    			  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
    			  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>	
    		      <script src="«businessModel.validationclasses.get(1).name».js"></script>    			</body>
    		</html>
    	'''
    }        def generateClassOverview(ValidationClass validationClass){    	'''    		<div id="overview«validationClass.name»" class="panel">    			<table class="table table-hover">
    				  <thead>    				  	<tr>    				  		«FOR attr : validationClass.classattribute»    				  			«IF attr.master»    				  			<th scope="col">    				  			«IF attr.label != null && attr.label != ""» 
    				  				  «attr.label» 
    				  			«ELSE»
    				  				  «generateInputLabel(attr.name)»
    				  			«ENDIF»    				  			</th>    				  			«ELSE»    				  			«ENDIF»    				  		«ENDFOR»    				  	</tr>    				  </thead>    			</table>    			    			<div id="linkedData«validationClass.name»">    			<ul class="nav nav-tabs">
    				<li class="nav-item">
    					<a class="nav-link active" href="#«validationClass.name»details" data-toggle="tab">Додатне информације о ентитету</a>
    				</li>    				«FOR attr : validationClass.classattribute»    					«IF attr.attributetype.attributeDataType instanceof NonPrimitiveDataType»    					«var refClass = attr.attributetype.attributeDataType as NonPrimitiveDataType»    					«var refClassName = refClass.type.name»    					 <li class="nav-item">
    					     	<a class="nav-link" href="#«refClass.type.name»tab" data-toggle="tab">Додатне информације о ентитету</a>
    					  </li>    					«ENDIF»    				«ENDFOR»    			</ul>    			<div class="tab-content">    			<div id="«validationClass.name»details" class="tab-pane active container">    			 Додатне информације    			</div>    			«FOR attr : validationClass.classattribute»
    			   «IF attr.attributetype.attributeDataType instanceof NonPrimitiveDataType»
    			    «var refClass = attr.attributetype.attributeDataType as NonPrimitiveDataType»
    			    	«var refClassName = refClass.type.name»
    			    	 <div id="«refClassName»tab"  class="tab-pane container">
    			    		«refClassName»
    			    	</div>
    			   «ENDIF»
    			«ENDFOR»    			</div>    			</div>    		</div>    	'''    }    
    def generateClass(ValidationClass validationClass){    	'''    	 <div id="add«validationClass.name»" class="panel">    	 <form>    	 «IF validationClass.formlayout.size > 0»    	     	 «FOR layout : validationClass.formlayout»    	 	«generateLayout(layout)»    	 «ENDFOR»    	 «ELSE»    	 	«generate(validationClass.classattribute, 1)»    	 «ENDIF»    	 </form>    	 </div>    	'''    }        def generateLayout(FormLayout layout){    	'''    	«IF layout instanceof Grid» «generateGrid(layout)» «ENDIF»    	«IF layout instanceof Tab» «generateTab(layout)» «ENDIF»    	«IF layout instanceof FieldSet» «generateFieldSet(layout)» «ENDIF»    	'''    }        def generateGrid(Grid gridLayout){    	'''    	    	    	    	«generateGridRow(gridLayout.attributearray)»    	    	'''    }        def generateTab(Tab tabLayout){    	    }        def generateFieldSet(FieldSet fieldSet){    	'''    	<fieldset class="border p-2">    	<legend class="w-auto">«fieldSet.legend»</legend>    	«IF fieldSet.attributearray!= null»    	«FOR attribute : fieldSet.attributearray.attributes»    		«generate(attribute)»    	«ENDFOR»    	«ENDIF»    	    	«IF fieldSet.layouts.size>0»	    	«FOR layout : fieldSet.layouts»	    		«generateLayout(layout)»	    	«ENDFOR»	    «ENDIF»    	</fieldSet>    	'''    }        def generateGridRow(AttributeArray attributes){    	val n = attributes.attributes.size;    	val numOfCells = 12/n as int;    	generate(attributes.attributes, numOfCells);	    }        def generate(EList<ClassAttribute> attributes,int cellWidth)    {    '''    	<div class="form-row">    	«FOR attr : attributes»    	<div class="form-group col-md-«cellWidth»">    		«generate(attr)»    	</div>    	«ENDFOR»    	</div>    '''	    }    
    def generate(ClassAttribute attribute){
    	'''    	<label>	    	«IF attribute.label != null && attribute.label != ""» 	    		«attribute.label» 	    	«ELSE»	    		«generateInputLabel(attribute.name)»	    	«ENDIF»    	 </label>
    		«generateInputField(attribute)»
    		    		
    		
    	'''
    }        def generateInputField(ClassAttribute attribute){    	'''    	«IF attribute.attributetype.uiComponent instanceof Password»    		«generateSimpleInput(attribute, "password", "")»    	«ELSEIF attribute.attributetype.uiComponent instanceof EmailInput»    		«val component = attribute.attributetype.uiComponent as EmailInput»    		«generateSimpleInput(attribute, "email", component.placeHolder)»    	«ELSEIF attribute.attributetype.uiComponent instanceof TelInput»    		«val component = attribute.attributetype.uiComponent as TelInput»    		«generateSimpleInput(attribute, "tel", component.placeHolder)»    	«ELSEIF attribute.attributetype.uiComponent instanceof TextInput»    		«val component = attribute.attributetype.uiComponent as TextInput»    		«generateSimpleInput(attribute, "text", component.placeHolder)»    	«ELSEIF attribute.attributetype.uiComponent instanceof TextArea»    		«generateTextArea(attribute)»    	«ELSEIF attribute.attributetype.uiComponent instanceof NumericUIComponent»    		«generateNumericUIComponent(attribute)»    	«ELSEIF attribute.attributetype.uiComponent instanceof FileInput»    		«generateSimpleInput(attribute, "file", "")»    	«ELSEIF attribute.attributetype.uiComponent instanceof RadioButton»    	  	«val component = attribute.attributetype.uiComponent as RadioButton»    		«generateRadioButtons(attribute, component.orientation)»    	«ELSEIF attribute.attributetype.uiComponent instanceof DropDownList»    		«generateDropDownList(attribute)»    	«ELSEIF attribute.attributetype.uiComponent instanceof CheckBox»    		«val component = attribute.attributetype.uiComponent as CheckBox»    		«generateCheckBoxes(attribute, component.orientation)»    	«ELSEIF attribute.attributetype.uiComponent instanceof LoadValues»    		Load values    	«ELSEIF attribute.attributetype.uiComponent instanceof AutocompleteComponent»    		    	«generateAutoComplete(attribute)»    	«ELSE»    		«generateUIComponentThatAreUnspecified(attribute)»    	«ENDIF »    	'''    }        def generateUIComponentThatAreUnspecified(ClassAttribute attribute){    	'''    	 «IF attribute.attributetype.attributeDataType == EDataType.BLOB»    	 	«generateSimpleInput(attribute,"file","")»    	 «ELSEIF attribute.attributetype.attributeDataType == EDataType.NUMBER»    	 	«generateSimpleInput(attribute,"number", "")»    	 «ELSEIF attribute.attributetype.attributeDataType == EDataType.DATE»    	 «ELSEIF attribute.attributetype instanceof NonPrimitiveDataType»    	 	«generateAutoComplete(attribute)»    	 «ELSEIF attribute.attributetype.attributeDataType == EDataType.STRING»    	 	«IF attribute.attributetype.attributeDataType.isCollection»    	 		/*Dodati provjeru koliko ima vrijednosti u */    	 		«generateCheckBoxes(attribute, EOrientation.HORIZONTAL)»    	 	«ELSE»    	 		«generateSimpleInput(attribute, "text","")»    	 	«ENDIF»    	 «ENDIF»    	'''    }        def generateAutoComplete(ClassAttribute attribute){    	'''    	    <input class="form-control autocomplete"  id="«attribute.name»" placeholder="Enter A" />    	'''    }        def generateCheckBoxes(ClassAttribute attribute, EOrientation orientation){    	'''    	«IF attribute.attributetype.attributeDataType instanceof NonPrimitiveDataType»    	 «val referencedClass = attribute.attributetype.attributeDataType as NonPrimitiveDataType»    	 «val referencedClassName = referencedClass.type.name»    	 «referencedClassName»    	«ELSE»    		«FOR rule : attribute.attributerule»    			«IF rule instanceof AcceptableValuesString»    				«val stringValues = rule as AcceptableValuesString»    				«IF orientation == EOrientation.HORIZONTAL»	    				«FOR value : stringValues.values»	    				<label class="checkbox-inline"><input type="checkbox" value="«value»">«value»</label>	    				«ENDFOR»					«ELSE»						«FOR value : stringValues.values»
						<label class="checkbox-inline"><input type="checkbox" value="«value»">«value»</label>
						«ENDFOR»					«ENDIF»    			«ELSEIF rule instanceof AcceptableValuesDate»    				«val dateValues = rule as AcceptableValuesString»    				«IF orientation == EOrientation»    			    «FOR value : dateValues.values»    			    	<label class="checkbox-inline"><input type="checkbox" value="«value»">«value»</label>    			    «ENDFOR»    			    «ELSE»    			    	 «FOR value : dateValues.values»
    			    	    	<label class="checkbox-inline"><input type="checkbox" value="«value»">«value»</label>
    			    	 «ENDFOR»    			    «ENDIF»    			«ENDIF»    		«ENDFOR»    	«ENDIF»    	<label class="checkbox-inline"><input type="checkbox" value="">Option 1</label>    	'''    }        def generateRadioButtons(ClassAttribute attribute, EOrientation orientation){    	'''    	«IF attribute.attributetype.attributeDataType instanceof NonPrimitiveDataType»    	«ELSE»    		«FOR rule : attribute.attributerule»    			«IF rule instanceof AcceptableValuesString»    				«val stringValues = rule as AcceptableValuesString»    				«IF orientation == EOrientation.HORIZONTAL»    				«FOR value : stringValues.values»    					<label class="checkbox-inline"><input type="radio" value="«value»">«value»</label>    				«ENDFOR»    				«ELSE»    				«FOR value : stringValues.values»
    				   <label class="checkbox-inline"><input type="radio" value="«value»">«value»</label>
    				 «ENDFOR»    				«ENDIF»    			«ELSEIF rule instanceof AcceptableValuesDate»    				«val dateValues = rule as AcceptableValuesString»
    			    «FOR value : dateValues.values»    			    	<label class="checkbox-inline"><input type="radio" value="«value»">«value»</label>
    			    «ENDFOR»    			«ENDIF»    		«ENDFOR»    	«ENDIF»    	<label class="checkbox-inline"><input type="radio" value="">Option 1</label>    	'''    }        def generateNumericUIComponent(ClassAttribute attribute){    	'''    	«val component = attribute.attributetype.uiComponent as NumericUIComponent»    	«IF component.componentType == EUINumberComponentType.SIMPLE_INPUT»    		«generateSimpleInput(attribute, "number", "")»    	«ELSE»	    	    <input type="range" class="form-control-range" id="«attribute.name»">    	«ENDIF»    	'''    }        def generateTextArea(ClassAttribute attribute){    	'''    	 «IF attribute.attributetype.uiComponent instanceof TextArea»    	 «val component = attribute.attributetype.uiComponent as TextArea»
    	  <textarea class="form-control" rows="«component.numOfRows»" id="«attribute.name»" placeholder="«component.placeHolder»"></textarea>    	 «ENDIF»    	'''    }        def  generateSimpleInput(ClassAttribute attribute, String type, String placeholder){    	'''    	<input id="«attribute.name»id" class="form-control" type="«type»" placeholder="«placeholder»" />    	'''    }    
    def generateDropDownList(ClassAttribute attribute){    	'''    	<select class="form-control" id="«attribute.name»">    	«IF attribute.attributetype.attributeDataType instanceof ValidationClass»    	«ELSE»    	«FOR rule : attribute.attributerule»    		«IF rule instanceof AcceptableValuesString»    		«FOR value : rule.values»    			<option>«value»</option>    		«ENDFOR»    		«ELSEIF rule instanceof AcceptableValuesDate»	    			    		«ENDIF»    	«ENDFOR»    	«ENDIF»    	</select>    	'''    }    
    def generateAttributeRules(AttributeRule rule, String attributeName){
    	'''
		«IF rule instanceof Required » required «ENDIF»
		«IF rule instanceof StringPattern»«stringPattern(rule)»«ENDIF»
		«IF rule instanceof MinLength»«minLengthRule(rule)»«ENDIF»
		«IF rule instanceof MaxLength»«maxLengthRule(rule)»«ENDIF»
		«IF rule instanceof MinNumber»«minNumberRule(rule)»«ENDIF»
		«IF rule instanceof MaxNumber»«maxNumberRule(rule)»«ENDIF»
		«IF rule instanceof MinDate»«minDateRule(rule)»«ENDIF»
		«IF rule instanceof MaxDate»«maxDateRule(rule)»«ENDIF»
		«IF rule instanceof AcceptableValuesString»list="«attributeName»"«ENDIF»
		«IF rule instanceof Length»«setLengthRule(rule)»«ENDIF»
		«IF rule instanceof AcceptableValuesDate»list="«attributeName»"«ENDIF»
    	'''
    }
    
    def stringPattern(StringPattern pattern){
    	'''
    		pattern="«pattern.value»"
    	'''
    }
    
    def minLengthRule(MinLength minLength){
    	'''
    		minlength="«minLength.value»"
    	'''
    }
    
    def maxLengthRule(MaxLength maxLength){
    	'''
    		maxlength="«maxLength.value»"
    	'''
    }
    
    def minNumberRule(MinNumber minNumber){
    	'''
    		min="«minNumber.value»"
    	'''
    }
    
    def maxNumberRule(MaxNumber maxNumber){
    	'''
    		max="«maxNumber.value»"
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
    	length="«length.value»"
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
    }        def generateInputLabel(String name){    	var strings = name.split("(?=[A-Z])");    	var newName ="";    	for(str : strings ){    		newName += str.toFirstUpper();    		newName +=" "    	}    	    	return newName;    }            def generateJS(BusinessModel model){    	'''    		$(document).ready(function() {    			    		«generateMenuItemOpenCloseJS()»    		    		«FOR vclass : model.validationclasses»	
    			«FOR rule : vclass.classrule»
    			  «««genFunction(rule)»»»
    			«ENDFOR»
    			«FOR attr : vclass.classattribute»    			«IF attr.attributetype.uiComponent != null»
    			  «IF attr.attributetype.uiComponent instanceof AutocompleteComponent»
    			   «generateAutoCompleteJS(attr)»
    			 «ENDIF»    			«ENDIF»
    		    «ENDFOR»
    		«ENDFOR»    		});    	'''    }        def generateCollections(ValidationClass valClass){    	'''    		var «valClass.name»Collection = [];  			var «valClass.name»AvailableTags = [];    	'''    }        def generateMenuItemOpenCloseJS(){    	'''    			$(".dropdown-item").click(function(){
    					var $this = $(this);
    					var panelSelector = $this.attr("href");
    					var $panelToShow = $(panelSelector);
    					
    					$(".panel").hide();
    					$panelToShow.show();
    					
    					
    				});    	'''    }  	def generateAutoCompleteJS(ClassAttribute attribute){  		'''  			  			$(function() {  			«var List<String> values =  newArrayList()»  			«FOR rule : attribute.attributerule»  				«IF rule instanceof AcceptableValuesString»  					«val acceptableValues  = rule as AcceptableValuesString»  					«values = acceptableValues.values»  				«ELSEIF rule instanceof AcceptableValuesDate»  					«val acceptableValues  = rule as AcceptableValuesDate»
  					«values = acceptableValues.values»  				«ENDIF»  			«ENDFOR»  			«IF !values.empty»
  			  var «attribute.name»AvailableTags = [  			  «FOR value : values BEFORE '[' SEPARATOR ',' AFTER '];'»  			  	«value»
  			  «ENDFOR» 
  			  $("#«attribute.name»").autocomplete({
  			    source: «attribute.name»AvailableTags
  			  });
  			});  			«ELSE»  				var «attribute.name»AvailableTags = [];  				$("#«attribute.name»").autocomplete({
  				  	source: «attribute.name»AvailableTags
  				  	});
  				});  			«ENDIF»  		'''  	}  	    def genFunction(ClassRule classRule){    	'''    	«IF classRule instanceof Equals» «generateEqualsRule(classRule)»«ENDIF»    	«IF classRule instanceof NotEquals»«generateNotEqualsRule(classRule)»«ENDIF»    	«IF classRule instanceof GreaterThan»«generateGreaterRule(classRule)»«ENDIF»    	«IF classRule instanceof LessThan»«generateLessRule(classRule)»«ENDIF»    	'''    }        def generateEqualsRule(Equals equalsRule){    	'''    		if(«FOR input : equalsRule.attributearray.attributes SEPARATOR '|| '»$("#«input.name»id").val() != $("#«equalsRule.attributearray.attributes.get(0).name»id").val() «ENDFOR»)    		{    			e.preventDefault();    			alert("«FOR rule : equalsRule.attributearray.attributes SEPARATOR ' and '»«generateInputLabel(rule.name)»«ENDFOR»should be same.");    		}    	'''    }        def generateNotEqualsRule(NotEquals notEqualsRule){    	'''    	if(«FOR input : notEqualsRule.attributearray.attributes »«generateNonEqualsCondition(input,notEqualsRule)»«ENDFOR» false)    	{    			e.preventDefault();    			alert("«FOR rule : notEqualsRule.attributearray.attributes SEPARATOR 'and'» «generateInputLabel(rule.name)»«ENDFOR»should be different.");    	}    	'''    }        def generateGreaterRule(GreaterThan rule){    	'''    		if(«FOR input : rule.attributearray»«FOR attr : input.attributes SEPARATOR "|| "»$("#«rule.classattribute.name»id").val() > $("#«attr.name»id").val()«ENDFOR»«ENDFOR»)    		{    			e.preventDefault();    			alert("«FOR input : rule.attributearray»«FOR attr : input.attributes SEPARATOR 'and '»«generateInputLabel(attr.name)»«ENDFOR»«ENDFOR» should be greaterthan «generateInputLabel(rule.classattribute.name)».");    		}    	'''    }        def generateLessRule(LessThan rule){    	'''    		if(«FOR input : rule.attributearray»«FOR attr : input.attributes SEPARATOR "|| "»$("#«rule.classattribute.name»id").val() < $("#«attr.name»id").val()«ENDFOR»«ENDFOR»)    		{    			e.preventDefault();
    			alert("«FOR input : rule.attributearray»«FOR attr : input.attributes SEPARATOR 'and '»«generateInputLabel(attr.name)»«ENDFOR»«ENDFOR» should be less than «generateInputLabel(rule.classattribute.name)».");    		}    	'''    }        def generateNonEqualsCondition(ClassAttribute input, NotEquals notEqualsRule){    	'''    	«IF input != notEqualsRule.attributearray.attributes.get(0) »$("#«input.name»id").val()== $("#«notEqualsRule.attributearray.attributes.get(0).name»id").val() ||  «ENDIF»    	'''    }
    /*
    
    def generate(Class cls, String packageName) {
    '''
		package «packageName»;
		
		«cls.accessModifier» class «cls.name» «IF cls.supertypes.size > 0»extends «cls.supertypes.get(0).name»«ENDIF»{
			«FOR f : cls.fields»
			     «f.generate»
			«ENDFOR»
			
			
			«FOR m : cls.methods»
			     «m.generate(cls)»
			     
            «ENDFOR»	
		}
    '''}
    
    def generate(Attribute attr) {
    '''
		«attr.accessModifier» «IF attr.isStatic»static «ENDIF»«IF attr.type != null»«attr.type.type.name»«ELSE»String«ENDIF» «attr.name»;
    '''}
   
    def generateParameter(Attribute attr) {
    '''«IF attr.isStatic»static «ENDIF»«IF attr.type != null»«attr.type.type.name»«ELSE»String«ENDIF» «attr.name»'''
    }
    
   	
   	def generate(Method func, Class c) {
    '''
        «IF func.isAbstract»abstract «ENDIF»«func.accessModifier» «IF func.isStatic»static «ENDIF»«IF func.returnType != null»«func.returnType.type.name» «ELSE»«IF !c.name.equalsIgnoreCase(func.name)»String «ENDIF»«ENDIF»«func.name»(«FOR p : func.parameters SEPARATOR ", "»«p.generateParameter»«ENDFOR»)«IF func.body != null» {
            «func.body»
        }«ENDIF»;
    '''}
      */
    
}