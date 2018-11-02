package org.xtext.example.domij;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import er.impl.ErPackageImpl;

public class GenerateXmiFromErDSl {
	
	//dodati ErPackageImpl.init(); u public Injector createInjectorAndDoEMFRegistration() {
	
	public static void main(String[] args) {
		Injector injector = new ErDslStandaloneSetup().createInjectorAndDoEMFRegistration();

		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);


		URI uri = URI.createURI("file:/D:/Fakultet/Vezbe/DomenskoOrijentisanoModelovanjeIJezici/runtime-EclipseApplication/studsluzba/model.erdsl");
		

		Resource xtextResource = resourceSet.getResource(uri, true);

		EcoreUtil.resolveAll(xtextResource);

		Resource xmiResource = resourceSet.createResource(URI.createURI("file:/D:/Fakultet/Vezbe/DomenskoOrijentisanoModelovanjeIJezici/runtime-EclipseApplication/studsluzba/model.xmi"));
		xmiResource.getContents().add(xtextResource.getContents().get(0));
		try {
			xmiResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
