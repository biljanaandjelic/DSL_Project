package mist.classgen.generate.generator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import mist.classgen.generate.generator.JavaGenerator;
import util.FVALToXMIConverter;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import classDiagram.ClassDiagramPackage;
import classDiagram.ClassModel;
import classDiagram.ModelingConcept;
import formValidation.FormValidationPackage;
import formValidation.ValidationClass;

public class ClassMMGenerator {

	public static void generateAll(String inputPath, String outputDirectory) {

		//open directory chooser
		//Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		//		DirectoryDialog dirDialog = new DirectoryDialog(shell);
		//		dirDialog.setText("Select generation directory");
		//		dirDialog.setMessage("Please select directory where you want to put generated files.");
		//		String selectedDir = dirDialog.open();
	//	CharSequence cs1 ="<!DOCTYPE html> <html><head><meta charset=\"UTF-8\"><title>Title of the document</title></head><body>Content of the document......</body></html>";
		//saveFile(outputDirectory + "/" + pkg.getName().toLowerCase() + "/" + mc.getName()+ ".java", cs);
		//saveFile("output/mainPage.html",cs1);
		if (outputDirectory != null) {
			ValidationClass cm = loadValidationClassModel(inputPath);
			JavaGenerator java = new JavaGenerator();

			//for (classDiagram.Package pkg : cm.getPackages()) {
			//for (ModelingConcept mc : pkg.getElements()) {
					if (cm instanceof ValidationClass) {
						CharSequence cs = java.generateHTML(cm, cm.getName().toLowerCase());
						//CharSequence cs1 ="<!DOCTYPE html> <html><head><meta charset=\"UTF-8\"><title>Title of the document</title></head><body>Content of the document......</body></html>";
						saveFile(outputDirectory + "/" + cm.getName().toLowerCase() + "/" + cm.getName()+ ".html", cs);
						
						CharSequence csJS = java.generateJS(cm);
						saveFile(outputDirectory + "/" + cm.getName().toLowerCase() + "/" + cm.getName()+ ".js", csJS);
						//saveFile("output/html",cs1);
					}else{
						System.out.println("Nije instanca adekvatne klase");
					}
				//}
			//}
//
		}

	}

	private static ValidationClass loadValidationClassModel(String modulePath) {
		// Initialize the model
		FormValidationPackage.eINSTANCE.eClass();

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		m.put("ecore", new EcoreResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Get the resource
		Resource resource = resSet.getResource(URI.createFileURI(modulePath), true);
		//Resource resource = resSet.getResource(URI.createURI("class/ClassModel.xmi"), true);

		// Get the first model element and cast it to the right type, in my
		// example everything is included in this first node
		ValidationClass pkg = (ValidationClass) resource.getContents().get(0);

		return pkg;
	}

	private static void saveFile(String path, CharSequence cs) {
		File output = new File(path);
		PrintWriter pw = null;
		try {
			if (output.getParentFile() != null) {
				output.getParentFile().mkdirs();
			}			
			output.createNewFile();
			pw = new PrintWriter(new FileOutputStream(output));
			pw.print(cs);

			System.out.println("saved " + path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
	}
	
	public static void main(String[]  args){
		FVALToXMIConverter.convertFVALtoXMI("input/person.fval", "output/person.xmi");
		generateAll("output/person.xmi", "output");
	}
}
