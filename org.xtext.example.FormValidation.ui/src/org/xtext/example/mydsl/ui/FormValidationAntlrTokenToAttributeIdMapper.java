package org.xtext.example.mydsl.ui;

import java.util.Arrays;
import java.util.List;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;


public class FormValidationAntlrTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {
	protected static List<String> rules=Arrays.asList("'Length'","'MaxLength'","'MinLength'","'StringPattern'","''DatePattern",
			"'MaxNumber'","'MinNumber'","'MinDate'","'MaxDate'","'AcceptableValuesDate'","'AcceptableValuesString'","'type'","'Email'","'Required'");
	protected static List<String> class_rule=Arrays.asList("'Equals'","'NotEquals'","'LessThan'","'GreaterThan'");
	
	@Override
	protected String calculateId(String tokenName, int tokenType) {
		//System.out.println(tokenName);
		if(tokenName.equals("RULE_ID")){
			return "attr_name";
		}else if(tokenName.equals("'String'") || tokenName.equals("'Date'") || tokenName.equals("'Number'")){
			return "data_type";
			
		}else if(rules.contains(tokenName)){
			return "attr_rule";
		}else if(class_rule.contains(tokenName)){
			return "class_rule";
		}
		
		return "";
	}
}
