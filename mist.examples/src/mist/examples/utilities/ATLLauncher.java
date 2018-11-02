package mist.examples.utilities;

import java.net.URI;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.m2m.atl.drivers.emf4atl.AtlEMFModelHandler;
import org.eclipse.m2m.atl.engine.vm.AtlLauncher;
import org.eclipse.m2m.atl.engine.vm.AtlModelHandler;
import org.eclipse.m2m.atl.engine.vm.ModelLoader;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMModel;

public class ATLLauncher {
    
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void launchATL(String inputMM, String inputMMAlias, String outputMM, String outputMMAlias, String inputM, String outputM, String asm) {
    	try {
    		//AtlModelHandler and ModelLoader init
    		AtlModelHandler.registerDefaultHandler("EMF", new AtlEMFModelHandler());   		
	    	AtlModelHandler amh = AtlModelHandler.getDefault("EMF");
	    	ModelLoader ml = amh.createModelLoader();
	    	
	    	//stores meta-models and models
	    	Map models = new HashMap();
	    	//used to locate metamodels, models and trasformation file
	    	URI uri;
	    	
	    	//URL where ER.ecore (input metamodel) is located
	    	uri = URI.create(inputMM);
	    	//load ER meta-model (the name is the same in the ATL file  [ex.: ATL CODE-> create OUT : RDBMS from IN : *ER*;])
	    	ASMModel metamodel_er = ml.loadModel(inputMMAlias, ml.getMOF(), uri.toURL().openStream());
	    	//store   
	    	models.put(inputMMAlias, metamodel_er);
	    	
	    	//URL where RDBMS.ecore (output metamodel) is located
	    	uri = URI.create(outputMM);
	    	//load RDBMS meta-model (the name is the same in the ATL file  [ex.: ATL CODE-> create OUT : *RDBMS* from IN : ER;])
	    	ASMModel metamodel_rdbms = ml.loadModel(outputMMAlias, ml.getMOF(), uri.toURL().openStream());
	    	//store 
	    	models.put(outputMMAlias, metamodel_rdbms);
	    	
	    	//URL where powerPlant.xmi (input model) is located
	    	uri = URI.create(inputM);
	    	//load Families model (the name is the same in the ATL file  [ex.: ATL CODE-> create OUT : RDBMS from *IN* : ER;])
	    	ASMModel model_er = ml.loadModel("IN", metamodel_er, uri.toURL().openStream());
	    	//store 
	    	models.put("IN", model_er);
	    	
	    	//create a new output model (the name is the same in the ATL file  [ex.: ATL CODE-> create *OUT* : RDBMS from IN : ER;])
	    	ASMModel model_rdbms = ml.newModel("OUT", outputM, metamodel_rdbms);
	    	//store 
	    	models.put("OUT", model_rdbms);
	    	
	    	//URL where er2rdbms.asm (transformation .asm) is located
	    	uri = URI.create(asm);
	    	//get an Atllauncher
	    	AtlLauncher mylauncher = AtlLauncher.getDefault();
	    	//execute the transformation (in this case we pass just the map "models")
	    	mylauncher.launch(uri.toURL(), Collections.EMPTY_MAP, models, Collections.EMPTY_MAP, Collections.EMPTY_LIST, Collections.EMPTY_MAP);
	    	
	    	//save the outputModel in "file://C:/Documents and Settings/Administrator/workspace2/Families2Persons/sample-Persons.xmi"
	    	model_rdbms.getModelLoader().save(model_rdbms, outputM);
	    	
	    	//once executed this file make a refresh on the destination folder
	    	System.out.println("Saved " + outputM);
	    	System.out.println("Transformation completed successfully");
	    	System.out.println("-------------------------------------");
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
    	
    	
    }
	
}
