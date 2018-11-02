package org.xtext.example.domij.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class ErDslHighlightingConfiguration extends
		DefaultHighlightingConfiguration {

	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		// TODO Auto-generated method stub
		super.configure(acceptor);
		addType(acceptor, "String", 102, 102, 0, SWT.ITALIC);
		addType(acceptor, "Cardinality", 128, 128, 128, SWT.NORMAL);
		addType(acceptor, "Entity", 204, 102, 0, SWT.BOLD);
		addType(acceptor, "Relationship", 0, 0, 255, SWT.BOLD);
		addType(acceptor, "Gerund", 0, 153, 0, SWT.BOLD);
		addType(acceptor, "ISA", 0, 150, 255, SWT.BOLD);
		addType(acceptor, "Categorisation", 0, 100, 255, SWT.BOLD);
		addType(acceptor, "Domain", 255, 0, 255, SWT.BOLD);
		addType(acceptor, "IdentificationDependency", 0, 200, 255, SWT.BOLD);
		addType(acceptor, "Model", 102, 0, 102, SWT.BOLD);
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
