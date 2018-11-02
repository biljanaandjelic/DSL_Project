package org.xtext.example.domij;




import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

import er.Gerund;
import er.ModellingConcept;




public class ErDslQNP extends DefaultDeclarativeQualifiedNameProvider{

	QualifiedName qualifiedName(ModellingConcept e){
		return QualifiedName.create(e.getName());
	}
	
	
	/*QualifiedName qualifiedName(RegularEntity e) {
		//if( e instanceof Gerund){
			//go to the parse tree and extract the actual string used for referencing
	    	//note that you have to substitute MyDslPackage with the package of your language
			List<INode> typeNodes = NodeModelUtils.findNodesForFeature(e, ErPackage.eINSTANCE.getRegularEntity_Entity());
			//brute force concatenation, please actually test that the terminal rule behind the abstract node (LeafNode)
			//is not a comment, otherwise the comment is added to the name, same is true for white spaces
			String name="";
			for (INode abstractNode : typeNodes) {
				name+=abstractNode.getText();
				//System.out.println(abstractNode.getText());
			}
			//trim is just a quick and dirty workaround
	        return QualifiedName.create(name.trim());
	}*/
		
	QualifiedName qualifiedName(Gerund e) {
		/*//if( e instanceof Gerund){
			//go to the parse tree and extract the actual string used for referencing
	    	//note that you have to substitute MyDslPackage with the package of your language
			List<INode> typeNodes = NodeModelUtils.findNodesForFeature(e, ErPackage.eINSTANCE.getGerund_Relationship());
			//brute force concatenation, please actually test that the terminal rule behind the abstract node (LeafNode)
			//is not a comment, otherwise the comment is added to the name, same is true for white spaces
			String name="";
			for (INode abstractNode : typeNodes) {
				name+=abstractNode.getText();
				//System.out.println(abstractNode.getText());
			}
			//trim is just a quick and dirty workaround
*/	        return QualifiedName.create(e.getRelationship().getName());
	}
	
}