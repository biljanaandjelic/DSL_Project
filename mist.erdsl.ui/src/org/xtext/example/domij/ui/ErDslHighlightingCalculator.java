package org.xtext.example.domij.ui;

import java.util.Iterator;

import org.eclipse.swt.SWT;
import org.eclipse.xtext.impl.TerminalRuleImpl;
import org.eclipse.xtext.nodemodel.BidiIterator;
import org.eclipse.xtext.nodemodel.BidiTreeIterator;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.impl.CompositeNodeWithSemanticElement;
import org.eclipse.xtext.nodemodel.impl.HiddenLeafNode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import er.Categories;
import er.Categorisation;
import er.Entity;
import er.Gerund;
import er.Relationship;

public class ErDslHighlightingCalculator implements
		ISemanticHighlightingCalculator {

	@Override
	public void provideHighlightingFor(XtextResource resource,	IHighlightedPositionAcceptor acceptor) {
		// TODO Auto-generated method stub
		if( resource == null || resource.getParseResult() == null ) return;
		INode root = resource.getParseResult().getRootNode();
		
		Iterator<ILeafNode> it = root.getLeafNodes().iterator();
		INode leaf;
		String context = "Model";
		while( it.hasNext() ) {
			leaf = it.next();
			//System.out.println(context.concat(leaf.getText()));
			if(context.equals("Model") && (leaf.getText().equals("{") || leaf.getText().equals("}")))
				acceptor.addPosition(leaf.getOffset(), leaf.getLength(), "Model");
			else if(leaf.getText().equals("domains"))
					highlightDomain(leaf, it, acceptor, context);
				 else if(leaf.getText().equals("entities")) 
							highlightEntity(leaf, it, acceptor,context);
					  else if(leaf.getText().equals("gerunds"))
								highlightGerund(leaf, it, acceptor,context);
						   else if( leaf.getText().equals("relationships")) 
									highlightRelationship(leaf, it, acceptor,context);
							   else if( leaf.getText().startsWith("'") && leaf.getText().endsWith("'")) 
								 	acceptor.addPosition(leaf.getOffset(), leaf.getLength(), "String");
		}		
	}
	
	
	
	protected void highlightRelationship (INode leaf, Iterator<ILeafNode> it, IHighlightedPositionAcceptor acceptor, String context) {
		int opened= 0, closed=0, openedContext=0,closedContext = 0;
		context = "relationships";
		while( it.hasNext()) {
			
			leaf = it.next();
			if(leaf.getText().equals("{"))
				opened++;
			else if(leaf.getText().equals("}"))
					closed++;
			
					
			
			if(leaf.getText().equals("relationships") ||  leaf.getText().equals("Categorisation") || leaf.getText().equals("ISA") || leaf.getText().equals("IdentificationDependency")) {
				context = leaf.getText();
				openedContext=0;
				closedContext = 0;
			}else if((context.equals("Categorisation") || context.equals("IdentificationDependency") || context.equals("ISA")) && leaf.getText().equals("{"))
						openedContext++;
					else if((context.equals("Categorisation") || context.equals("IdentificationDependency") || context.equals("ISA")) && leaf.getText().equals("}"))
							closedContext++;
			

			if(context.equals("relationships") && (leaf.getText().equals("{") || leaf.getText().equals("}"))) 
				acceptor.addPosition(leaf.getOffset(), leaf.getLength(), "Relationship");
			else if(/*context.equals("Relationship") &&*/ (/*leaf.getText().equals("Attribute") ||*/ leaf.getText().equals("entitiesInRelationship") ||  leaf.getText().equals("attributeSet")  || leaf.getText().equals("domain") || leaf.getText().equals("default")))
					acceptor.addPosition(leaf.getOffset(), leaf.getLength(), "Relationship");
				 else if(context.equals("Categorisation") && (leaf.getText().equals("cardinality") || leaf.getText().equals("entities")  || leaf.getText().equals("{") || leaf.getText().equals("}")))
						acceptor.addPosition(leaf.getOffset(), leaf.getLength(), "Categorisation");
				 	  else if(context.equals("IdentificationDependency") && (leaf.getText().equals("{") || leaf.getText().equals("}")))
				 			 acceptor.addPosition(leaf.getOffset(), leaf.getLength(), "IdentificationDependency");
				 	  		else if(context.equals("ISA") && ( leaf.getText().equals("{") || leaf.getText().equals("}")))
				 	  				acceptor.addPosition(leaf.getOffset(), leaf.getLength(), "ISA");
						 	  		else if( leaf.getText().startsWith("'") && leaf.getText().endsWith("'")) 
						 	  				acceptor.addPosition(leaf.getOffset(), leaf.getLength(), "String");
							 	  		else if(leaf.getText().equals("domains"))
							 	  				highlightDomain(leaf, it, acceptor, context);
							 	  			else if(leaf.getText().equals("entities")) 
													highlightEntity(leaf, it, acceptor,context);
											  else if(leaf.getText().equals("gerunds"))
														highlightGerund(leaf, it, acceptor,context);
			
			if(openedContext == closedContext && openedContext != 0)
				context = "relationships";
			
			if(opened == closed && opened != 0){
				acceptor.addPosition(leaf.getOffset(), leaf.getLength(), "Relationship");
				context = "Model";
				break;
			}
		}
	}
	
	protected void highlightGerund (INode leaf, Iterator<ILeafNode> it, IHighlightedPositionAcceptor acceptor, String context) {
		while( it.hasNext() ) {
			leaf = it.next();
			if (leaf.getText().equals("Attribute") || leaf.getText().equals("entitiesInRelationship") || leaf.getText().equals("Relationship") || leaf.getText().equals("{") || leaf.getText().equals("}")  || leaf.getText().equals("attributeSet") ||  leaf.getText().equals("domain") || leaf.getText().equals("default"))
				acceptor.addPosition(leaf.getOffset(), leaf.getLength(), "Gerund");
			else if( leaf.getText().startsWith("'") && leaf.getText().endsWith("'")) 
			 		acceptor.addPosition(leaf.getOffset(), leaf.getLength(), "String");
				else if(leaf.getText().equals("domains")){
						highlightDomain(leaf, it, acceptor, context);
						break;
					}else if(leaf.getText().equals("entities")) { 
							highlightEntity(leaf, it, acceptor,context);
							break;
							} else if( leaf.getText().equals("relationships")) { 
									highlightRelationship(leaf, it, acceptor,context);
									break;
								}
				
		}
	}
		
	protected void highlightEntity (INode leaf, Iterator<ILeafNode> it, IHighlightedPositionAcceptor acceptor, String context) {
		while( it.hasNext() ) {
			leaf = it.next();
			if(leaf.getText().equals("Attribute") || leaf.getText().equals("{") || leaf.getText().equals("}") || leaf.getText().equals("domain") || leaf.getText().equals("default"))
				acceptor.addPosition(leaf.getOffset(), leaf.getLength(), "Entity");
			else if( leaf.getText().startsWith("'") && leaf.getText().endsWith("'")) 
			 		acceptor.addPosition(leaf.getOffset(), leaf.getLength(), "String");
				else if(leaf.getText().equals("domains")) {
						highlightDomain(leaf, it, acceptor, context);
						break;
					} else if(leaf.getText().equals("gerunds")) {
								highlightGerund(leaf, it, acceptor,context);
								break;
							} else if( leaf.getText().equals("relationships")) {
									highlightRelationship(leaf, it, acceptor,context);
									break;
							}
						 
		}
	}
	
	protected void highlightDomain (INode leaf, Iterator<ILeafNode> it, IHighlightedPositionAcceptor acceptor, String context) {
		//int opened= 0, closed=0;
		while( it.hasNext() ) {
			leaf = it.next();
			/*if(leaf.getText().equals("{"))
				opened++;
			else if(leaf.getText().equals("}"))
					closed++;*/
			if(leaf.getText().equals("Domain") || leaf.getText().equals("{") || leaf.getText().equals("}") || leaf.getText().equals("extends"))
				acceptor.addPosition(leaf.getOffset(), leaf.getLength(), "Domain");
			else  if( leaf.getText().startsWith("'") && leaf.getText().endsWith("'")) 
				 	acceptor.addPosition(leaf.getOffset(), leaf.getLength(), "String");
				 else if(leaf.getText().equals("entities")) {
							highlightEntity(leaf, it, acceptor,context);
							break;
				 	} else if(leaf.getText().equals("gerunds")) {
								highlightGerund(leaf, it, acceptor,context);
								break;
				 			}else if( leaf.getText().equals("relationships")) { 
									highlightRelationship(leaf, it, acceptor,context);
									break;
				 				}
			/*if(opened == closed && opened != 0){
				context="Model";
				break;
			}*/
		}
	}

}
