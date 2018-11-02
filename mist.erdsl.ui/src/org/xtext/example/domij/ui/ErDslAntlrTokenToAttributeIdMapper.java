package org.xtext.example.domij.ui;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;

public class ErDslAntlrTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {
	
	@Override
	protected String calculateId(String tokenName, int tokenType) {

		if( "'Entity'".equals(tokenName) || "'entities'".equals(tokenName) || "'attributeSet'".equals(tokenName) || "'keySet'".equals(tokenName) || "'primaryKey'".equals(tokenName) ) {
			return "Entity";
		} else
		if( "'Relationship'".equals(tokenName) || "'relationships'".equals(tokenName) || "'attributeSet'".equals(tokenName)) {
			return "Relationship";
		} else
		if( "'Gerund'".equals(tokenName) || "'gerunds'".equals(tokenName)) {
			return "Gerund";
		} else
		if( "'ISA'".equals(tokenName) || "'supertype'".equals(tokenName) ||  "'subtypes'".equals(tokenName) ||  "'classificationAtrtibute'".equals(tokenName)) {
			return "ISA";
		} else
		if( "'domains'".equals(tokenName) || "'domain'".equals(tokenName) || "'default'".equals(tokenName)) {
			return "Domain";
		} else
		if( "'Categorisation'".equals(tokenName) || "'categorisedEntity'".equals(tokenName) || "'categorisationEntities'".equals(tokenName) || "'isPartial'".equals(tokenName)) {
			return "Categorisation";
		} else
		if( "'IdentificationDependency'".equals(tokenName) || "'weakEntity'".equals(tokenName) || "'regularEntity'".equals(tokenName)) {
			return "IdentificationDependency";
		} else if( "'ERModel'".equals(tokenName) || "'diagrams'".equals(tokenName) || "'ERDiagram'".equals(tokenName)) {
				return "Model";
		} else if("'time'".equals(tokenName) || "'date'".equals(tokenName) || "'boolean'".equals(tokenName) || "'real'".equals(tokenName) || "'integer'".equals(tokenName) || "'string'".equals(tokenName) || "'one'".equals(tokenName) || "'zero'".equals(tokenName) || "'many'".equals(tokenName)|| "'true'".equals(tokenName) || "'false'".equals(tokenName)){
					return "Cardinality";
		} 
		return super.calculateId(tokenName, tokenType);
	}
	 
	protected boolean checkNumeric (String s) {
			for (int i=0;i<s.length();i++) {
				if(s.charAt(i)<'0' || s.charAt(i)>'9')
					return false;
			}
			return true;
	}

}
