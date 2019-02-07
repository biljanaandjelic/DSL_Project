/**
 */
package formValidation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link formValidation.ClassRule#getErrorMessage <em>Error Message</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getClassRule()
 * @model abstract="true"
 * @generated
 */
public interface ClassRule extends EObject {

	/**
	 * Returns the value of the '<em><b>Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Message</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Message</em>' containment reference.
	 * @see #setErrorMessage(ErrorMessage)
	 * @see formValidation.FormValidationPackage#getClassRule_ErrorMessage()
	 * @model containment="true"
	 * @generated
	 */
	ErrorMessage getErrorMessage();

	/**
	 * Sets the value of the '{@link formValidation.ClassRule#getErrorMessage <em>Error Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Message</em>' containment reference.
	 * @see #getErrorMessage()
	 * @generated
	 */
	void setErrorMessage(ErrorMessage value);
} // ClassRule
