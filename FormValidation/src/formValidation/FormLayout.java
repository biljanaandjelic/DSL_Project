/**
 */
package formValidation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link formValidation.FormLayout#getClassattribute <em>Classattribute</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getFormLayout()
 * @model abstract="true"
 * @generated
 */
public interface FormLayout extends EObject {

	/**
	 * Returns the value of the '<em><b>Classattribute</b></em>' reference list.
	 * The list contents are of type {@link formValidation.ClassAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classattribute</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classattribute</em>' reference list.
	 * @see formValidation.FormValidationPackage#getFormLayout_Classattribute()
	 * @model
	 * @generated
	 */
	EList<ClassAttribute> getClassattribute();
} // FormLayout
