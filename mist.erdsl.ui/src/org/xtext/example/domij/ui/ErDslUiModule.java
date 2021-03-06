/*
 * generated by Xtext
 */
package org.xtext.example.domij.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

/**
 * Use this class to register components to be used within the IDE.
 */
public class ErDslUiModule extends org.xtext.example.domij.ui.AbstractErDslUiModule {
	public ErDslUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	public Class<? extends DefaultHighlightingConfiguration> bindDefaultHighlightingConfiguration () {
		 return ErDslHighlightingConfiguration.class;
	}
	
	public Class<? extends AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
		return ErDslAntlrTokenToAttributeIdMapper.class ;
	}
	
	public Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator (){
		 return ErDslHighlightingCalculator.class;
	}
	
}
