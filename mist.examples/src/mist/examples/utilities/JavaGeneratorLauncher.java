package mist.examples.utilities;

//import mist.classgen.generate.generator.ClassMMGenerator;

public class JavaGeneratorLauncher {

	public static void launchJavaGenerator(String inputM, String outputDir) {
		try {
			//ClassMMGenerator.generateAll(inputM, outputDir);
			System.out.println("Java code was generated successfully");
			System.out.println("-------------------------------------");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
