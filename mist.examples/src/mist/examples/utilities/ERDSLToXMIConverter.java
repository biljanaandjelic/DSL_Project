package mist.examples.utilities;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.xtext.example.domij.ErDslStandaloneSetup;

import com.google.inject.Injector;

public class ERDSLToXMIConverter {
	
	//IMPORTANT!!!!!
	//dodati ErPackageImpl.init(); u public Injector createInjectorAndDoEMFRegistration() {	

	public static void convertERDSLtoXMI(String inputM, String outputM) {
		Injector injector = new ErDslStandaloneSetup().createInjectorAndDoEMFRegistration();

		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);


		URI uri = URI.createURI(inputM);
		

		Resource xtextResource = resourceSet.getResource(uri, true);

		EcoreUtil.resolveAll(xtextResource);

		Resource xmiResource = resourceSet.createResource(URI.createURI(outputM));
		xmiResource.getContents().add(xtextResource.getContents().get(0));
		try {
			xmiResource.save(null);
			System.out.println("Saved " + outputM);
	    	System.out.println("ERDSL file converted successfully to XMI");
	    	System.out.println("-------------------------------------");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
