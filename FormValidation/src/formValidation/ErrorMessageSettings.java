/**
 */
package formValidation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Message Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link formValidation.ErrorMessageSettings#getPosition <em>Position</em>}</li>
 *   <li>{@link formValidation.ErrorMessageSettings#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getErrorMessageSettings()
 * @model
 * @generated
 */
public interface ErrorMessageSettings extends AdditionalSettings {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * The default value is <code>"Below"</code>.
	 * The literals are from the enumeration {@link formValidation.EPosition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see formValidation.EPosition
	 * @see #setPosition(EPosition)
	 * @see formValidation.FormValidationPackage#getErrorMessageSettings_Position()
	 * @model default="Below"
	 * @generated
	 */
	EPosition getPosition();

	/**
	 * Sets the value of the '{@link formValidation.ErrorMessageSettings#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see formValidation.EPosition
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(EPosition value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' containment reference.
	 * @see #setColor(Color)
	 * @see formValidation.FormValidationPackage#getErrorMessageSettings_Color()
	 * @model containment="true"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link formValidation.ErrorMessageSettings#getColor <em>Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' containment reference.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

} // ErrorMessageSettings
