package org.xtext.example.mydsl.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;


public class FormValDSLUiModule  extends AbstractFormValDSLUiModule{

	public FormValDSLUiModule(AbstractUIPlugin plugin) {
		super(plugin);
		// TODO Auto-generated constructor stub
	}

	public Class<? extends DefaultHighlightingConfiguration> bindDefaultHighlightingConfiguration () {
		 return FormValDSLHighlightingConfiguration.class;
	}
	
	public Class<? extends AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
		return FormValDSLAntlrTokenToAttributeIdMapper.class ;
	}
	
	public Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator (){
		 return FormValDSLHighlightingCalculator.class;
	}
}
