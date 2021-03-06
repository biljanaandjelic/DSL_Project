/**
 *
 * $Id$
 */
package rdbms.validation;

import org.eclipse.emf.common.util.EList;

import rdbms.Action;
import rdbms.Column;
import rdbms.PKeyAndUnique;
import rdbms.ReferencingType;
import rdbms.Table;

/**
 * A sample validator interface for {@link rdbms.ForeignKey}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ForeignKeyValidator {
	boolean validate();

	boolean validateRhsKey(PKeyAndUnique value);
	boolean validateLhsAttr(EList<Column> value);
	boolean validateRefersTo(Table value);
	boolean validateDeleteActionRHS(Action value);
	boolean validateUpdateActionRHS(Action value);
	boolean validateFKTable(Table value);
	boolean validateMatch(ReferencingType value);
	boolean validateInverseReferentialIntegrityCon(boolean value);
}
