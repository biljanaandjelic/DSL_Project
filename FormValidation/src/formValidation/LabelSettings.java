/**
 */
package formValidation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link formValidation.LabelSettings#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getLabelSettings()
 * @model
 * @generated
 */
public interface LabelSettings extends AdditionalSettings {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
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
	 * @see formValidation.FormValidationPackage#getLabelSettings_Position()
	 * @model
	 * @generated
	 */
	EPosition getPosition();

	/**
	 * Sets the value of the '{@link formValidation.LabelSettings#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see formValidation.EPosition
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(EPosition value);

} // LabelSettings
