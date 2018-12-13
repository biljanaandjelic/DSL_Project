/**
 */
package formValidation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link formValidation.FileInput#getButtonPosition <em>Button Position</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getFileInput()
 * @model
 * @generated
 */
public interface FileInput extends UIComponent {
	/**
	 * Returns the value of the '<em><b>Button Position</b></em>' attribute.
	 * The default value is <code>"Right"</code>.
	 * The literals are from the enumeration {@link formValidation.EPosition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Button Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Button Position</em>' attribute.
	 * @see formValidation.EPosition
	 * @see #setButtonPosition(EPosition)
	 * @see formValidation.FormValidationPackage#getFileInput_ButtonPosition()
	 * @model default="Right"
	 * @generated
	 */
	EPosition getButtonPosition();

	/**
	 * Sets the value of the '{@link formValidation.FileInput#getButtonPosition <em>Button Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Button Position</em>' attribute.
	 * @see formValidation.EPosition
	 * @see #getButtonPosition()
	 * @generated
	 */
	void setButtonPosition(EPosition value);

} // FileInput
