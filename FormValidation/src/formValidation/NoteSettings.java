/**
 */
package formValidation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Note Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link formValidation.NoteSettings#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getNoteSettings()
 * @model
 * @generated
 */
public interface NoteSettings extends AdditionalSettings {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * The default value is <code>"Right"</code>.
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
	 * @see formValidation.FormValidationPackage#getNoteSettings_Position()
	 * @model default="Right"
	 * @generated
	 */
	EPosition getPosition();

	/**
	 * Sets the value of the '{@link formValidation.NoteSettings#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see formValidation.EPosition
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(EPosition value);

} // NoteSettings
