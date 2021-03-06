/*
 * generated by Xtext
 */
package org.xtext.example.domij.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.domij.services.ErDslGrammarAccess;

public class ErDslParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private ErDslGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.xtext.example.domij.parser.antlr.internal.InternalErDslParser createParser(XtextTokenStream stream) {
		return new org.xtext.example.domij.parser.antlr.internal.InternalErDslParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "ERModel";
	}
	
	public ErDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ErDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
