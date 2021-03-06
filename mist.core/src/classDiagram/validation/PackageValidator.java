/**
 *
 * $Id$
 */
package classDiagram.validation;

import classDiagram.ModelingConcept;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link classDiagram.Package}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PackageValidator {
	boolean validate();

	boolean validateElements(EList<ModelingConcept> value);

	boolean validatePackage(classDiagram.Package value);

	boolean validateSubpackages(EList<classDiagram.Package> value);

	boolean validateClasses(EList<classDiagram.Class> value);
}
