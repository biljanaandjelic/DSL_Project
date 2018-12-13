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
 *   <li>{@link formValidation.ClassRule#getClassRuleErrorMessage <em>Class Rule Error Message</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getClassRule()
 * @model abstract="true"
 * @generated
 */
public interface ClassRule extends EObject {

	/**
	 * Returns the value of the '<em><b>Class Rule Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Rule Error Message</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Rule Error Message</em>' containment reference.
	 * @see #setClassRuleErrorMessage(ErrorMessage)
	 * @see formValidation.FormValidationPackage#getClassRule_ClassRuleErrorMessage()
	 * @model containment="true"
	 * @generated
	 */
	ErrorMessage getClassRuleErrorMessage();

	/**
	 * Sets the value of the '{@link formValidation.ClassRule#getClassRuleErrorMessage <em>Class Rule Error Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Rule Error Message</em>' containment reference.
	 * @see #getClassRuleErrorMessage()
	 * @generated
	 */
	void setClassRuleErrorMessage(ErrorMessage value);
} // ClassRule
