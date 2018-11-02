package org.xtext.example.domij.erdsl.handlers;

import java.io.IOException;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.xtext.example.domij.ErDslStandaloneSetup;

import com.google.inject.Injector;

public class GenerateXmiFromErDSl {
	
	//dodati ErPackageImpl.init(); u public Injector createInjectorAndDoEMFRegistration() {
	
	public String generate(IPath path) {
		Injector injector = new ErDslStandaloneSetup().createInjectorAndDoEMFRegistration();

		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);


		URI uri = URI.createURI("file:/"+path.toString());
		

		Resource xtextResource = resourceSet.getResource(uri, true);

		EcoreUtil.resolveAll(xtextResource);
		String xmipath = "file:/"+path.toString().substring(0, path.toString().length()-6)+".xmi";
		Resource xmiResource = resourceSet.createResource(URI.createURI(xmipath));
		xmiResource.getContents().add(xtextResource.getContents().get(0));
		try {
			xmiResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return xmipath;
	}
}
