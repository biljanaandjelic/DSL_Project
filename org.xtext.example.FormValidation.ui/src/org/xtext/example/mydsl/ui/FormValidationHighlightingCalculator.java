package org.xtext.example.mydsl.ui;

import java.util.Iterator;

import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

public class FormValidationHighlightingCalculator implements ISemanticHighlightingCalculator {

	@Override
	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		// TODO Auto-generated method stub
		if( resource == null || resource.getParseResult() == null ) return;
		INode root = resource.getParseResult().getRootNode();
		
		Iterator<ILeafNode> it = root.getLeafNodes().iterator();
		INode leaf;
		String context = "Model";
		while( it.hasNext() ) {
			leaf=it.next();
			//System.out.println("Tree");
			if(leaf.getText().equals("{") || leaf.getText().equals("}")){
				//System.out.println("Element start");
				acceptor.addPosition(leaf.getOffset(), leaf.getLength(), "class_bracket");
			}else if(Character.isUpperCase(leaf.getText().charAt(0)) && leaf.getText().endsWith("{") ){
				//System.out.println("Class name");
				acceptor.addPosition(leaf.getOffset(), leaf.getLength(), "class_name");
			}
		}
		
	}

}
