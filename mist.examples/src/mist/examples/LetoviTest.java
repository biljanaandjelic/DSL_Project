package mist.examples;

import mist.examples.utilities.ATLLauncher;
import mist.examples.utilities.ERDSLToXMIConverter;
import mist.examples.utilities.JavaGeneratorLauncher;
import mist.examples.utilities.PLSQLGeneratorLauncher;

public class LetoviTest {
	//this part should be changed on each computer
	//VD home PC
	private static final String PATH_TO_REPO 	= "file:/C:/Users/Vladimir/git/domij/";
	//	//VD office PC and laptop
	//	private static final String PATH_TO_REPO 	= "file:/C:/Users/vdimitrieski/git/domij/";

	//this part is changed based on the example		
	private static final String ER_ERDSL_M	 	= PATH_TO_REPO + "mist.examples/erdsl/_letovi/letovi.erdsl";
	private static final String EXAMPLES_DIR 	= "letovi/";
	private static final String ER_M 			= EXAMPLES_DIR + "letoviER.xmi";
	private static final String RDBMS_M 		= EXAMPLES_DIR + "letoviRel.xmi";
	private static final String CLASS_M 		= EXAMPLES_DIR + "letoviClass.xmi";



	//this part is always the same
	//do not change
	private static final String EXAMPLES_PLUGIN	= "mist.examples/";	
	private static final String ER_MM 			= PATH_TO_REPO + "mist.core/model/er.ecore";
	private static final String RDBMS_MM 		= PATH_TO_REPO + "mist.core/model/rdbms.ecore";
	private static final String CLASS_MM 		= PATH_TO_REPO + "mist.core/model/classDiagram.ecore";
	private static final String RDBMS_ASM 		= PATH_TO_REPO + "mist.er2rdbms/er2rdbms.asm";	
	private static final String CLASS_ASM 		= PATH_TO_REPO + "mist.er2class/er2class.asm";	
	private static final String RDBMS_M_ATL 	= PATH_TO_REPO + EXAMPLES_PLUGIN + RDBMS_M;
	private static final String CLASS_M_ATL 	= PATH_TO_REPO + EXAMPLES_PLUGIN + CLASS_M;
	private static final String ER_XMI_M 		= PATH_TO_REPO + EXAMPLES_PLUGIN + ER_M;



	public static void main(String[] args) {
		//convert erdsl to xmi as an entry point of the transformation
		ERDSLToXMIConverter.convertERDSLtoXMI(ER_ERDSL_M, ER_XMI_M);

		//transform er model to relational and class models
		ATLLauncher.launchATL(ER_MM, "ER", RDBMS_MM, "RDBMS", ER_XMI_M, RDBMS_M_ATL, RDBMS_ASM);
		ATLLauncher.launchATL(ER_MM, "ER", CLASS_MM, "Class", ER_XMI_M, CLASS_M_ATL, CLASS_ASM);

		//generate code
		PLSQLGeneratorLauncher.launchJavaGenerator(RDBMS_M, EXAMPLES_DIR);
		JavaGeneratorLauncher.launchJavaGenerator(CLASS_M, EXAMPLES_DIR);
	}
}
