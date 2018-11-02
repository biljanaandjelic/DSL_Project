package mist.examples.utilities;

import mist.relgen.generate.generator.RelationalMMGenerator;

public class PLSQLGeneratorLauncher {
	
	public static void launchJavaGenerator(String inputM, String outputDir) {
		try {
			RelationalMMGenerator.generateAll(inputM, outputDir);
			System.out.println("PL/SQL code was generated successfully");
			System.out.println("-------------------------------------");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
