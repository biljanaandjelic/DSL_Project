/**
 */
package formValidation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Email</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link formValidation.Email#isIsEmail <em>Is Email</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getEmail()
 * @model
 * @generated
 */
public interface Email extends AttributeRule {
	/**
	 * Returns the value of the '<em><b>Is Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Email</em>' attribute.
	 * @see #setIsEmail(boolean)
	 * @see formValidation.FormValidationPackage#getEmail_IsEmail()
	 * @model
	 * @generated
	 */
	boolean isIsEmail();

	/**
	 * Sets the value of the '{@link formValidation.Email#isIsEmail <em>Is Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Email</em>' attribute.
	 * @see #isIsEmail()
	 * @generated
	 */
	void setIsEmail(boolean value);

} // Email
