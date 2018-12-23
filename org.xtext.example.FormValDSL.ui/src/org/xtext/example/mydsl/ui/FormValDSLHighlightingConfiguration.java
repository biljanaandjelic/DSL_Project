package org.xtext.example.mydsl.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class FormValDSLHighlightingConfiguration extends 
	DefaultHighlightingConfiguration
{

	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor){
		super.configure(acceptor);
		addType(acceptor, "attr_name", 250, 20, 0, SWT.ITALIC);
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
