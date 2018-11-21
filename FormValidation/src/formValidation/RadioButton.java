/**
 */
package formValidation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Radio Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link formValidation.RadioButton#getOrientation <em>Orientation</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getRadioButton()
 * @model
 * @generated
 */
public interface RadioButton extends SingleValue {
	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * The literals are from the enumeration {@link formValidation.EOrientation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see formValidation.EOrientation
	 * @see #setOrientation(EOrientation)
	 * @see formValidation.FormValidationPackage#getRadioButton_Orientation()
	 * @model
	 * @generated
	 */
	EOrientation getOrientation();

	/**
	 * Sets the value of the '{@link formValidation.RadioButton#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see formValidation.EOrientation
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(EOrientation value);

} // RadioButton
