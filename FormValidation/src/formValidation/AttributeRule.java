/**
 */
package formValidation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link formValidation.AttributeRule#getAttributeRuleErrorMessage <em>Attribute Rule Error Message</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getAttributeRule()
 * @model abstract="true"
 * @generated
 */
public interface AttributeRule extends EObject {

	/**
	 * Returns the value of the '<em><b>Attribute Rule Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Rule Error Message</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Rule Error Message</em>' containment reference.
	 * @see #setAttributeRuleErrorMessage(ErrorMessage)
	 * @see formValidation.FormValidationPackage#getAttributeRule_AttributeRuleErrorMessage()
	 * @model containment="true"
	 * @generated
	 */
	ErrorMessage getAttributeRuleErrorMessage();

	/**
	 * Sets the value of the '{@link formValidation.AttributeRule#getAttributeRuleErrorMessage <em>Attribute Rule Error Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Rule Error Message</em>' containment reference.
	 * @see #getAttributeRuleErrorMessage()
	 * @generated
	 */
	void setAttributeRuleErrorMessage(ErrorMessage value);
} // AttributeRule
