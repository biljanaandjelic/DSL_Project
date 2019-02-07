/**
 */
package formValidation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link formValidation.AttributeSettings#getPresentation <em>Presentation</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getAttributeSettings()
 * @model
 * @generated
 */
public interface AttributeSettings extends AdditionalSettings {
	/**
	 * Returns the value of the '<em><b>Presentation</b></em>' attribute.
	 * The default value is <code>"Asterix"</code>.
	 * The literals are from the enumeration {@link formValidation.ERequiredField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presentation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation</em>' attribute.
	 * @see formValidation.ERequiredField
	 * @see #setPresentation(ERequiredField)
	 * @see formValidation.FormValidationPackage#getAttributeSettings_Presentation()
	 * @model default="Asterix"
	 * @generated
	 */
	ERequiredField getPresentation();

	/**
	 * Sets the value of the '{@link formValidation.AttributeSettings#getPresentation <em>Presentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation</em>' attribute.
	 * @see formValidation.ERequiredField
	 * @see #getPresentation()
	 * @generated
	 */
	void setPresentation(ERequiredField value);

} // AttributeSettings
