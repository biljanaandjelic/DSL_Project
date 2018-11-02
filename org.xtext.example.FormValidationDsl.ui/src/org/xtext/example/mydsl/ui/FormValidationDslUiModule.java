package org.xtext.example.mydsl.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

public class FormValidationDslUiModule extends AbstractFormValidationDslUiModule {

	public FormValidationDslUiModule(AbstractUIPlugin plugin) {
		super(plugin);
		// TODO Auto-generated constructor stub
	}
	
	public Class<? extends DefaultHighlightingConfiguration> bindDefaultHighlightingConfiguration () {
		 return FormValidationDslHighlightingConfiguration.class;
	}
	
	public Class<? extends AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
		return FormValidationDslAntlrTokenToAttributeIdMapper.class ;
	}
	
	public Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator (){
		 return FormValidationDslHighlightingCalculator.class;
	}
}
