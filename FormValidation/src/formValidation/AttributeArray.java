/**
 */
package formValidation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link formValidation.AttributeArray#getClassattribute <em>Classattribute</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getAttributeArray()
 * @model
 * @generated
 */
public interface AttributeArray extends EObject {
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
	 * @see formValidation.FormValidationPackage#getAttributeArray_Classattribute()
	 * @model
	 * @generated
	 */
	EList<ClassAttribute> getClassattribute();

} // AttributeArray
