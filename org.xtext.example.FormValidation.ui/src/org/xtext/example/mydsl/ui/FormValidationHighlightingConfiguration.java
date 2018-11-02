package org.xtext.example.mydsl.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class FormValidationHighlightingConfiguration extends DefaultHighlightingConfiguration {

	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		// TODO Auto-generated method stub
		super.configure(acceptor);
		addType(acceptor, "attr_name", 250, 102, 0, SWT.ITALIC);
		addType(acceptor,"data_type",40,200,50,SWT.ITALIC);
		addType(acceptor,"attr_rule",180,120,70,SWT.ITALIC);
		addType(acceptor,"class_rule",70,89,150,SWT.ITALIC);
		addType(acceptor,"class_bracket",90,40,20,SWT.ITALIC);
		addType(acceptor,"class_name",250,180,50,SWT.BOLD);
		
	}
	
	
	
	public void addType( IHighlightingConfigurationAcceptor acceptor, String s, int r, int g, int b, int style )
	 {
		 TextStyle textStyle = new TextStyle();
		 textStyle.setBackgroundColor(new RGB(255, 255, 255));
		 textStyle.setColor(new RGB(r, g, b));
		 textStyle.setStyle(style);
		 acceptor.acceptDefaultHighlighting(s, s, textStyle);
	 }
}
