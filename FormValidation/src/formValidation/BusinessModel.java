/**
 */
package formValidation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link formValidation.BusinessModel#getValidationclass <em>Validationclass</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getBusinessModel()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueClassName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot uniqueClassName='Tuple {\n\tmessage : String = \'\',\n\tstatus : Boolean = \n\t\tvalidationclass -> forAll(vC1: ValidationClass, vC2: ValidationClass | if vC1 <> vC2 then\n\t\t\t vC1.name <> vC2.name else true endif)\n}.status'"
 * @generated
 */
public interface BusinessModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Validationclass</b></em>' containment reference list.
	 * The list contents are of type {@link formValidation.ValidationClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validationclass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validationclass</em>' containment reference list.
	 * @see formValidation.FormValidationPackage#getBusinessModel_Validationclass()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValidationClass> getValidationclass();

} // BusinessModel
