package org.xtext.example.mydsl.ui;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

public class FormValDSLHighlightingCalculator implements ISemanticHighlightingCalculator {

	private List<String> classRules = Arrays.asList("LessThan", "GreaterThan", "NotEquals", "Equals");
	private List<String> classSettings = Arrays.asList("OverviewSettings", "LabelSettings", "AttributeSettings",
			"ErrorMessageSettings", "FormSettings", "NoteSettings");
	private List<String> attributeRule = Arrays.asList("Required", "MinNumber", "MaxNumber", "MinDate", "MaxDate",
			"StringPattern", "DatePattern", "AcceptableValuesString", "AcceptableValuesDate", "MaxLength", "MinLength",
			"Length");
	private List<String> layouts = Arrays.asList("FieldSet", "Grid", "Tab");
	private List<String> tokens = Arrays.asList("{", "(", ")", ",");
	private List<String> uiComponents = Arrays.asList("TextInput", "TextArea", "Password", "TelInput", "EmailInput",
			"NumericUIComponent", "FileInput", "RadioButton", "DropDownList", "CheckBox", "LoadValues",
			"AutocompleteComponent");

	@Override
	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		// TODO Auto-generated method stub
		if (resource == null || resource.getParseResult() == null)
			return;

		// TreeIterator<EObject> tree = resource.

		EObject objEl;

		INode root = resource.getParseResult().getRootNode();
		Iterable<ILeafNode> el = root.getLeafNodes();
		Iterator<ILeafNode> it = root.getLeafNodes().iterator();
		INode leaf;
		String context = "BusinessModel";

		while (it.hasNext()) {
			leaf = it.next();
			String leafString = leaf.getText();
			if(leaf.getText().trim().equals("{")){
				highlightBusinessModel(leaf, it, acceptor, context);
			}
			/*if(!leaf.getText().trim().equals("") && !leaf.getText().equals("}")){
				highlightClass(leaf, it, acceptor, context);
			} */
			
		}
	}
	
	protected void highlightBusinessModel(INode leaf, Iterator<ILeafNode> it,
			IHighlightedPositionAcceptor acceptor, String context){
		while (it.hasNext()) {
			leaf = it.next();
			String leafString = leaf.getText();
			if(leaf.getText().trim().toLowerCase().equals("label")){
				highlightLabel(leaf, it, acceptor, context);
			}else if(leaf.getText().trim().toLowerCase().equals("description")){
				highlightLabel(leaf, it, acceptor, context);
			}else if(!leaf.getText().trim().equals("") && !leaf.getText().equals("}")){
				highlightClass(leaf, it, acceptor, context);
			}
			
		}
	}

	protected void highlightReferencedAttributes(INode leaf, Iterator<ILeafNode> it,
			IHighlightedPositionAcceptor acceptor, String context) {
		System.out.println("Referenced attributes");
		while (it.hasNext()) {
			leaf = it.next();
			String leafString = leaf.getText();
			if (!leaf.getText().equals("(") && !leaf.getText().equals(",") && !leaf.getText().equals(")") && !leaf.getText().trim().equals("")) {
				acceptor.addPosition(leaf.getOffset(), leaf.getLength(), "referenceAttribute");
			} else if (leaf.getText().equals(")")) {
				break;
			}
		}

	}

	protected void highlightClassName(INode leaf, Iterator<ILeafNode> it, IHighlightedPositionAcceptor acceptor,
			String context) {
		acceptor.addPosition(leaf.getOffset(), leaf.getLength(), "className");
		while (it.hasNext()) {
			leaf = it.next();
			if (!classRules.contains(leaf.getText())) {

			}
		}
	}

	protected void highlightClass(INode leaf, Iterator<ILeafNode> it, IHighlightedPositionAcceptor acceptor,
			String context) {
		context = "Class";
		acceptor.addPosition(leaf.getOffset(), leaf.getLength(), "className1");
		while (it.hasNext()) {
			leaf = it.next();
			String leafString = leaf.getText();
			if (leaf.getText().trim().equals("")) {

			} else if (classSettings.contains(leaf.getText())) {
				highlightClassSettings(leaf, it, acceptor, context);
			} else if (tokens.contains(leaf.getText())) {
				
			} else if (layouts.contains(leaf.getText())) {
				highlightLayouts(leaf, it, acceptor, context);
			} else if (leaf.getText().equals("}")) {
				break;
			}else if(classRules.contains(leaf.getText())){
				highlightClassRules(leaf, it, acceptor, context);
			}else if(leaf.getText().toLowerCase().equals("label")){
				highlightLabel(leaf, it, acceptor, context);
			}else {
				highlightClassAttribute(leaf, it, acceptor, context);
			}

		}
	}
	protected void highlightLabel(INode leaf, Iterator<ILeafNode> it, IHighlightedPositionAcceptor acceptor,
			String context){
		boolean isQuotes = false;
		while(it.hasNext()){
			leaf = it.next();
			String leafString = leaf.getText();
			if(!leaf.getText().trim().equals("")){
				isQuotes = true;
			}
			if(isQuotes){
				acceptor.addPosition(leaf.getOffset(), leaf.getLength(), "label");
				break;
			}
		}
	}
	
	protected void highlightClassSettings(INode leaf, Iterator<ILeafNode> it, IHighlightedPositionAcceptor acceptor,
			String context) {
		
		int numOfOpenCurlyBraces = 0;
		int numOfClosedCurlyBraces = 0;
		while (it.hasNext()) {
			leaf = it.next();
			String leafString = leaf.getText();
			if (leaf.getText().equals("{")) {
				numOfOpenCurlyBraces++;
			}
			if (leaf.getText().equals("}")) {
				numOfClosedCurlyBraces++;
				if (numOfClosedCurlyBraces == numOfOpenCurlyBraces) {
					break;
				}
			}
		}

	}

	protected void highlightClassAttribute(INode leaf, Iterator<ILeafNode> it, IHighlightedPositionAcceptor acceptor,
			String context) {
		acceptor.addPosition(leaf.getOffset(), leaf.getLength(), "classAttribute");
		int numOfOpenedCurlyBraces = 0;
		int numOfClosedCurlyBraces = 0;
		
		while (it.hasNext()) {
			leaf = it.next();
			String leafString = leaf.getText();
			INode nextSibling = leaf.getNextSibling();
			
			if (attributeRule.contains(leaf.getText())) {
				highlightAttributeRule(leaf, it, acceptor, context);
			} else if (uiComponents.contains(leaf.getText())) {
				highlightUIComponets(leaf, it, acceptor, context);
			} else if(leaf.getText().equals("{")){
				numOfOpenedCurlyBraces++;
			}else if (leaf.getText().equals("}")) {
				numOfClosedCurlyBraces++;
				if(numOfClosedCurlyBraces == numOfOpenedCurlyBraces)
				{
					break;
				}
			}else if(leaf.getText().toLowerCase().equals("label")){
				highlightLabel(leaf, it, acceptor, context);
			}
		}

	}

	protected void highlightAttributeRule(INode leaf, Iterator<ILeafNode> it, IHighlightedPositionAcceptor acceptor,
			String context) {
		boolean hasErrorMessage = false;
		leaf = it.next();
		int numOfOpenCurlyBraces = 0;
		int numbOfClosedCurlyBraces = 0;
		if(leaf.getNextSibling().getText().equals("}")){
			return;
		}
		
		while (it.hasNext()) {
			leaf = it.next();
			String leafString = leaf.getText();
			INode nextSibling = leaf.getNextSibling();
			
			if(leaf.getText().equals("{")){
				numOfOpenCurlyBraces++;
			}else if(leaf.getText().equals("}")){
				numbOfClosedCurlyBraces++;
				if(numbOfClosedCurlyBraces == numOfOpenCurlyBraces)
				{
					break;
				}
			}else if(attributeRule.contains(leaf.getText())){
				highlightAttributeRule(leaf, it, acceptor, context);
				break;
			}else if(uiComponents.contains(leaf.getText())){
				highlightUIComponets(leaf, it, acceptor, context);
				break;
			}else if( nextSibling != null){
				if(nextSibling.getText().equals("}")){
					int num = numbOfClosedCurlyBraces + 1;
					if(num > numOfOpenCurlyBraces ){
						//it.next();
						break;
					}
					
				}
			}
			
		}
		// }
	}

	protected void highlightLayouts(INode leaf, Iterator<ILeafNode> it, IHighlightedPositionAcceptor acceptor,
			String context) {
	
		boolean isLayoutName = true;
		int openCurlyBraces = 0;
		int closedCurlyBraces = 0;
		while (it.hasNext()) {
			leaf = it.next();
			String leafString = leaf.getText();
			if (isLayoutName) {
				isLayoutName = false;
			} else if (layouts.contains(leaf.getText())) {
				highlightLayouts(leaf, it, acceptor, context);
			} else if (leaf.getText().equals("attributes")) {
				highlightReferencedAttributes(leaf, it, acceptor, context);
			} else if (leaf.getText().equals("{")) {
				openCurlyBraces++;
			}else if(leaf.getText().equals("}")){
				closedCurlyBraces++;
				if(openCurlyBraces == closedCurlyBraces){
					break;
				}
			}
		}

	}

	protected void highlightUIComponets(INode leaf, Iterator<ILeafNode> it, IHighlightedPositionAcceptor acceptor,
			String context) {
		int numOfOpenCurlyBraces = 0;
		int numOfClosedCurlyBraces = 0;
		while (it.hasNext()) {
			leaf = it.next();
			String leafString = leaf.getText();
			if (leaf.getText().equals("{")) {
				numOfOpenCurlyBraces++;
			} else if (leaf.getText().equals("}")) {
				numOfClosedCurlyBraces++;
				if (numOfOpenCurlyBraces == numOfClosedCurlyBraces) {
					break;
				}
			}
		}
	}
	
	protected void highlightClassRules(INode leaf, Iterator<ILeafNode> it, IHighlightedPositionAcceptor acceptor,
			String context){
		int numOfOpenCurlyBraces = 0;
		int numOfClosedCurlyBraces = 0;
		
		while(it.hasNext()){
			leaf = it.next();
			String leafString = leaf.getText();
			if(leaf.getText().equals("{")){
				numOfOpenCurlyBraces++;
			}else if(leaf.getText().equals("}")){
				numOfClosedCurlyBraces++;
				if(numOfOpenCurlyBraces == numOfClosedCurlyBraces){
					break;
				}
			}else if(leaf.getText().equals("attributes")){
				highlightReferencedAttributes(leaf, it, acceptor, context);
			}
		}
	}

}
