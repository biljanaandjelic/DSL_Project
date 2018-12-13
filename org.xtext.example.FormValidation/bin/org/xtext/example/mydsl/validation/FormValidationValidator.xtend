///*
// * generated by Xtext 2.9.1
// */
//package org.xtext.example.mydsl.validation
//
//import java.text.SimpleDateFormat
//import formValidation.StringPattern
//import formValidation.AttributeRule
//import formValidation.ClassAttribute
//import formValidation.AcceptableValuesString
//import formValidation.EVrsta
//import formValidation.DatePattern
//import formValidation.MinDate
//import formValidation.MaxDate
//import formValidation.impl.MinDateImpl
//import java.text.ParseException
//import formValidation.FormValidationPackage
//import org.eclipse.xtext.validation.Check
//import formValidation.MaxLength
//import formValidation.MinLength
//import formValidation.Length
//import formValidation.ValidationClass
//import formValidation.AcceptableValuesDate
//
///**
// * This class contains custom validation rules. 
// *
// * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
// */
//class FormValidationValidator extends AbstractFormValidationValidator {
//	
////  public static val INVALID_NAME = 'invalidName'
////
////	@Check
////	def checkGreetingStartsWithCapital(Greeting greeting) {
////		if (!Character.isUpperCase(greeting.name.charAt(0))) {
////			warning('Name should start with a capital', 
////					FormValidationPackage.Literals.GREETING__NAME,
////					INVALID_NAME)
////		}
////	}
//
//  public static val INVALID_NAME = 'invalidName'
//	
//	@Check
//	def checkClassName(ValidationClass valClass){
//		if(!Character.isUpperCase(valClass.name.charAt(0))){
//			warning("Class name should start with a capital",FormValidationPackage.Literals.VALIDATION_CLASS__NAME,INVALID_NAME );
//		}
//	}
//	
//	@Check
//	def checkAttributeName(ClassAttribute classAttribute){
//		if(!Character.isLowerCase(classAttribute.name.charAt(0))){
//			warning("Attribute name should start with a lowercase letter", 
//				FormValidationPackage.Literals.CLASS_ATTRIBUTE__NAME, INVALID_NAME
//			);
//		}
//	}
//	 	
//	@Check
//	def checkStringRule(ClassAttribute classAttribute){
//		var isLength = false;
//		var isMaxOrMin = false;		
//		
//		if(classAttribute.attributetype. == EVrsta.STRING){
//			
//			for(AttributeRule attrRule : classAttribute.attributerule){
//				if(attrRule instanceof Length){
//					isLength = true;
//				}else if(attrRule instanceof MaxLength){
//					isMaxOrMin= true;
//				}else if(attrRule instanceof MinLength){
//					isMaxOrMin = true;	
//				}
//			}
//			
//				if(isLength && isMaxOrMin){
//					error("It must not be set length rule at same time as minlength or maxlength. Please chose suitable rule.",
//						FormValidationPackage.Literals.CLASS_ATTRIBUTE__ATTRIBUTERULE);
//				}
//		}
//	}
//	
//	@Check
//	def checkStringAcceptableValuse(ClassAttribute classAttribute){
//		var length=-1;
//		var minLength=-1;
//		var maxLength=-1;
//		
//		if(classAttribute.attributetype.vrsta == EVrsta.STRING){
//			for(AttributeRule rule : classAttribute.attributerule){
//				if(rule instanceof Length){
//					length=rule.value;
//				}else if(rule instanceof MinLength){
//					minLength=rule.value;
//				}else if(rule instanceof MaxLength){
//					maxLength = rule.value;
//				}
//			}
//		}
//		if(length!=-1){
//			for(AttributeRule rule : classAttribute.attributerule){
//				if(rule instanceof AcceptableValuesString){
//					val accValues = rule as AcceptableValuesString;
//					for(String value : accValues.values){
//						if(value.length!=length){
//							
//							error("Values from acceptable values must be specific length",rule,FormValidationPackage.Literals.ACCEPTABLE_VALUES_STRING__VALUES);
//					}
//				}	
//			}
//		}
//		}else if(minLength!=-1 && maxLength!=-1){
//			
//				for(AttributeRule rule : classAttribute.attributerule){
//				
//				if(rule instanceof AcceptableValuesString){
//					val accValues = rule as AcceptableValuesString;
//					for(String value : accValues.values){
//						if(value.length>maxLength || value.length<minLength){
//							error("Length of value from acceptable values must be between specific min length and max length",rule,FormValidationPackage.Literals.ACCEPTABLE_VALUES_STRING__VALUES);
//						}
//					}	
//				}
//			}
//		}else if(minLength!=-1){
//				for(AttributeRule rule : classAttribute.attributerule){
//				if(rule instanceof AcceptableValuesString){
//					val accValues=  rule as AcceptableValuesString;
//					for(String value : accValues.values){
//						if( value.length<minLength){
//							error("Length of value from acceptable values must be longer.",rule,FormValidationPackage.Literals.ACCEPTABLE_VALUES_STRING__VALUES);
//						}
//					}	
//				}
//			}
//		}else if(maxLength!=-1){
//			for(AttributeRule rule : classAttribute.attributerule){
//				
//				if(rule instanceof AcceptableValuesString){
//					val  accValues = rule as AcceptableValuesString;
//					for(String value : accValues.values){
//						if( value.length<minLength){
//							error("Length of values from acceptable values must be shorter",accValues,FormValidationPackage.Literals.ACCEPTABLE_VALUES_STRING__VALUES);
//						}
//					}	
//				}
//			}
//		}
//	}
//	
//	@Check
//	def checkStringPattern(ClassAttribute attribute){
//	 
//		if(isStrngType(attribute) && containsStringPattern(attribute) && containsAcceptableValues(attribute)){
//			val stringPattern = getStringPattern(attribute);
//			for(AttributeRule rule : attribute.attributerule){
//				if(rule instanceof AcceptableValuesString){
//					val stringRule=rule as AcceptableValuesString;
//					for(String value : stringRule.values){
//						if(!value.matches(stringPattern)){
//							error("Acceptable values don't match pattern", rule,FormValidationPackage.Literals.ACCEPTABLE_VALUES_STRING__VALUES);
//						}else{
//							
//						}
//					}
//				}
//			}
//		}
//	}
//	
//	@Check
//	def checkDateFormat(ClassAttribute attribute){
//		if(isDateType(attribute) ){
//			var datePattern = "dd/MM/yyyy";
//			if(isDatePatternDefined(attribute))
//			{
//				datePattern = getDatePatern(attribute);
//			}
//			
//			if(isMaxDateDefined(attribute)){
//				var maxDateValue = getMaxDate(attribute);
//				var maxDateRule = getMaxDateRule(attribute);
//				if(!isFormatOk(datePattern,maxDateValue)){
//					error("It is not good date format",maxDateRule, FormValidationPackage.Literals.MAX_DATE__VALUE);
//				}
//			}
//			
//			if(isMinDateDefined(attribute)){
//				var minDateValue = getMinDate(attribute);
//				var minDateRule = getMinDateRule(attribute);
//				if(!isFormatOk(datePattern,minDateValue)){
//					error("It is not good date forma", minDateRule, FormValidationPackage.Literals.MIN_DATE__VALUE);
//				}
//			}
//			
//			if(isMinDateDefined(attribute) && isMaxDateDefined(attribute)){
//				var minDateValue = getMinDate(attribute);
//				var maxDateValue = getMaxDate(attribute);
//				if(!compareMinAndMaxDate(minDateValue, maxDateValue, datePattern)){
//					error("Min date is after max date", FormValidationPackage.Literals.CLASS_ATTRIBUTE__ATTRIBUTERULE);
//				}
//			}
//			
//			if(isDateAcceptableValues(attribute)){
//				var acceptableValuesDate = getDateAcceptableValues(attribute) as AcceptableValuesDate;
//				for(String value : acceptableValuesDate.values){
//					if(!isFormatOk(datePattern,value)){
//						error("Value is not appropriate format", acceptableValuesDate, FormValidationPackage.Literals.ACCEPTABLE_VALUES_DATE__VALUES);
//					}
//				}
//			}
//		}
//	}
//	
//	def boolean isFormatOk(String pattern, String value){
//		var flag = true;
//		//var date = null;
//		//var pattern1 = "dd/MM/yyyy";
//		var sdf = new SimpleDateFormat(pattern);
//		try{
//			var date = sdf.parse(value);
//	    	if (!value.equals(sdf.format(date))) {
//	       	 	flag = false;
//	    	}
//    	}catch(ParseException ex){
//    		//flag = false;
//    		return false;
//    	}
//    	
//		return flag;
//	}
//	
//	def boolean isDateType(ClassAttribute attribute){
//		var flag = false;
//		
//		if(attribute.attributetype.vrsta == EVrsta.DATE){
//			flag = true;
//		}
//		
//		return flag;
//	}
//	
//	def String getMaxDate(ClassAttribute attribute){
//		var maxDateValue = "WRONG";
//		
//		for(AttributeRule rule : attribute.attributerule){
//			if(rule instanceof MaxDate){
//				var maxDate = rule as MaxDate;
//				maxDateValue = maxDate.value;
//			}
//		}	
//		
//		return maxDateValue;
//	}
//	
//	def AttributeRule getMaxDateRule(ClassAttribute attribute){
//		var maxDate = attribute.attributerule.get(0);
//		for(AttributeRule rule : attribute.attributerule){
//			if(rule instanceof MaxDate){
//				maxDate = rule as MaxDate;
//				//var maxDateValue = maxDate
//			}
//		}	
//		return maxDate;
//	}
//	
//	def AttributeRule getMinDateRule(ClassAttribute attribute){
//		var minDateRule = attribute.attributerule.get(0);
//		for(AttributeRule rule : attribute.attributerule){
//			if(rule instanceof MinDate){
//				minDateRule = rule as MinDateImpl;
//			}	
//		}
//		
//		return minDateRule;
//	}
//	
//	def String getMinDate(ClassAttribute  attribute){
//		var minDateValue = "WRONG";
//		
//		for(AttributeRule rule : attribute.attributerule){
//			if(rule instanceof MinDate){
//				var minDate = rule as MinDateImpl;
//				minDateValue = minDate.value;
//				//minDate.
//				return minDateValue;
//			}	
//		}
//		
//		return minDateValue;
//	}
//	
//	def String getDatePatern(ClassAttribute attribute){
//		var patternValue = "WRONG";
//		
//		for(AttributeRule rule : attribute.attributerule){
//			if(rule instanceof DatePattern){
//				var pattern = rule as DatePattern;
//				patternValue = pattern.value;
//				
//				return patternValue;
//			}
//		}
//		
//		return	patternValue;
//	}
//	
//	def boolean isMaxDateDefined(ClassAttribute attribute){
//		var isDefined = false;
//		
//		for(AttributeRule rule : attribute.attributerule){
//			if(rule instanceof MaxDate){
//				isDefined = true;
//			}
//		}
//		
//		return isDefined;
//	}
//	
//	def boolean isMinDateDefined(ClassAttribute attribute){
//		var isDefined = false;
//		
//		for(AttributeRule rule : attribute.attributerule){
//			if(rule instanceof MinDate){
//				isDefined = true;
//			}
//		}
//		
//		return isDefined;
//	}
//	
//	def boolean isDatePatternDefined(ClassAttribute attribute){
//		var isDefined = false;
//		
//		for(AttributeRule rule : attribute.attributerule){
//			if(rule instanceof DatePattern){
//				isDefined = true;
//			}
//		}
//		
//		return isDefined;
//	}
//	
//	def boolean isStrngType(ClassAttribute attr){
//		if(attr.attributetype.vrsta == EVrsta.STRING){
//			return true;
//		}else{
//			return false;
//		}
//	}
//	
//	def boolean containsStringPattern(ClassAttribute attr){
//		for(AttributeRule rule : attr.attributerule){
//			if(rule instanceof StringPattern){
//				return true;
//			}
//		}
//		
//		return false;
//	}
//	
//	def boolean containsAcceptableValues(ClassAttribute attr){
//		for(AttributeRule rule : attr.attributerule){
//			if(rule instanceof AcceptableValuesString){
//				return true;
//			}
//		}
//		
//		return false;
//	}
//	
//	
//	def String getStringPattern(ClassAttribute attr){
//		for(AttributeRule rule : attr.attributerule){
//			if(rule instanceof StringPattern){
//				val strPatt=rule as StringPattern;
//				return strPatt.value;
//			}
//		}
//		return "WRONG";
//	}
//	
//	def boolean compareMinAndMaxDate(String minDate, String maxDate, String pattern){
//		var flag = true;
//		var sdf = new SimpleDateFormat("dd/MM/yyyy");
//        var dateMin = sdf.parse(minDate);
//        var dateMax = sdf.parse(maxDate);
//        if(dateMax.compareTo(dateMin) <= 0){
//        	flag = false;
//        }
//        
//		return flag;
//	}
//	
//	
//	def boolean isDateAcceptableValues(ClassAttribute attribute){
//		var datePattern = false;
//		for(AttributeRule rule : attribute.attributerule)
//		{
//			if(rule instanceof AcceptableValuesDate)
//			{
//				datePattern = true;
//			}
//		}
//		
//		return datePattern;
//	}
//	
//	def AttributeRule getDateAcceptableValues(ClassAttribute attribute){
//		var datePatternRule = attribute.attributerule.get(0);
//		
//		for(AttributeRule rule : attribute.attributerule)
//		{
//			if(rule instanceof AcceptableValuesDate){
//				datePatternRule = rule as AcceptableValuesDate;
//			}	
//		}
//		
//		return datePatternRule;
//	}
//	
//}
