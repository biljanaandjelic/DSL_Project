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
import formValidation.ClassRuleimport formValidation.NotEqualsimport formValidation.GreaterThanimport formValidation.LessThan/**
 * Generate Database create sql
 */
class JavaGenerator{
    
    def generateHTML(ValidationClass cls, String className){
    	'''
    		<!DOCTYPE html> 
    		<html>
    		<head>    			 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">    			 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>    			 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>    			 <script src="«cls.name».js" type="text/javascript"></script>
    			<style>
    			input {color: blue}
    			input {
    				margin-left: 10px;
    				-webkit-box-sizing: border-box;
    			    -moz-box-sizing:    border-box;
    			    box-sizing:         border-box;
    			    width:80%;
    			    height: 25px;
    			    border-radius: 2px;
    			   }    			.form-control{    				width: 25%;    			}
    			#submitButton{
    				
    				width: 25%;
    			}
    			
    			div {margin-left: 10px}
    			</style>
    			<sctipt>
    		
    			</script>
    			<meta charset=\"UTF-8\">
    			<title></title>
    		</head>
    			<body>
    				<form id=«className»form> 
    					«FOR attr : cls.classattribute»
    						«generate(attr)»
    					«ENDFOR» 
    					</br>     					
    					<input type="submit"  class="btn btn-success" id="submitButton"/>
    				</form>
    			</body>
    		</html>
    	'''
    }
    
    def generate(ClassAttribute attribute){
    	'''<div> «generateInputLabel(attribute.name)» </div>
    		<input id="«attribute.name»id" class="form-control" type="«IF attribute.attributetype.vrsta == EVrsta.STRING»text" «ELSE»«attribute.attributetype.vrsta»"«ENDIF»
    		«FOR rule : attribute.attributerule  »
    			«generateAttributeRules(rule,attribute.name)»
    		«ENDFOR»
    		/>
    		«generateStringDataList(attribute)»
    		«generateDateDataList(attribute)»
    	'''
    }
    
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
    		«FOR attr : equalsRule.attributearray.classattribute AFTER ')'»
    			$("#«attr.name»id").val() ==
    		«ENDFOR»
    	'''
    }        def generateInputLabel(String name){    	var strings = name.split("(?=[A-Z])");    	var newName ="";    	for(str : strings ){    		newName += str.toFirstUpper();    		newName +=" "    	}    	    	return newName;    }            def generateJS(ValidationClass vclass){    	'''    		$(document).ready(function() {    			$("#submitButton").click(function(e){    			 if($("form")[0].checkValidity()){    			«FOR rule : vclass.classrule»    				«genFunction(rule)»    			«ENDFOR»    			}
    		});
    		});    	'''    }        def genFunction(ClassRule classRule){    	'''    	«IF classRule instanceof Equals» «generateEqualsRule(classRule)»«ENDIF»    	«IF classRule instanceof NotEquals»«generateNotEqualsRule(classRule)»«ENDIF»    	«IF classRule instanceof GreaterThan»«generateGreaterRule(classRule)»«ENDIF»    	«IF classRule instanceof LessThan»«generateLessRule(classRule)»«ENDIF»    	'''    }        def generateEqualsRule(Equals equalsRule){    	'''    		if(«FOR input : equalsRule.attributearray.classattribute SEPARATOR '|| '»$("#«input.name»id").val() != $("#«equalsRule.attributearray.classattribute.get(0).name»id").val() «ENDFOR»)    		{    			e.preventDefault();    			alert("«FOR rule : equalsRule.attributearray.classattribute SEPARATOR ' and '»«generateInputLabel(rule.name)»«ENDFOR»should be same.");    		}    	'''    }        def generateNotEqualsRule(NotEquals notEqualsRule){    	'''    	if(«FOR input : notEqualsRule.attributearray.classattribute»«generateNonEqualsCondition(input,notEqualsRule)»«ENDFOR» false)    	{    			e.preventDefault();    			alert("«FOR rule : notEqualsRule.attributearray.classattribute SEPARATOR 'and'» «generateInputLabel(rule.name)»«ENDFOR»should be different.");    	}    	'''    }        def generateGreaterRule(GreaterThan rule){    	'''    		if(«FOR input : rule.attributearray»«FOR attr : input.classattribute SEPARATOR "|| "»$("#«rule.classattribute.name»id").val() > $("#«attr.name»id").val()«ENDFOR»«ENDFOR»)    		{    			e.preventDefault();    			alert("«FOR input : rule.attributearray»«FOR attr : input.classattribute SEPARATOR 'and '»«generateInputLabel(attr.name)»«ENDFOR»«ENDFOR» should be greaterthan «generateInputLabel(rule.classattribute.name)».");    		}    	'''    }        def generateLessRule(LessThan rule){    	'''    		if(«FOR input : rule.attributearray»«FOR attr : input.classattribute SEPARATOR "|| "»$("#«rule.classattribute.name»id").val() < $("#«attr.name»id").val()«ENDFOR»«ENDFOR»)    		{    			e.preventDefault();
    			alert("«FOR input : rule.attributearray»«FOR attr : input.classattribute SEPARATOR 'and '»«generateInputLabel(attr.name)»«ENDFOR»«ENDFOR» should be less than «generateInputLabel(rule.classattribute.name)».");    		}    	'''    }        def generateNonEqualsCondition(ClassAttribute input, NotEquals notEqualsRule){    	'''    	«IF input != notEqualsRule.attributearray.classattribute.get(0) »$("#«input.name»id").val()== $("#«notEqualsRule.attributearray.classattribute.get(0).name»id").val() ||  «ENDIF»    	'''    }
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