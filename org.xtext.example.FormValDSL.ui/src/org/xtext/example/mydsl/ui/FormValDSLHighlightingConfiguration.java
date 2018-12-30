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
		addType(acceptor, "referenceAttribute", 200, 20, 0, SWT.ITALIC);
		addType(acceptor,"classAttribute", 190, 0, 0, SWT.BOLD);
		addType(acceptor,"layout", 0, 0, 250, SWT.BOLD);
		addType(acceptor,"layoutName", 0, 0, 170, SWT.NORMAL);
		addType(acceptor,"className", 150, 20, 100, SWT.BOLD);
		addType(acceptor, "classSettings", 0, 51, 0, SWT.BOLD);
		addType(acceptor,"className1", 0, 20, 100, SWT.BOLD);
		addType(acceptor,"label", 0, 150, 0, SWT.BOLD);
		addType(acceptor,"name", 150, 0, 150, SWT.NORMAL);
		
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
