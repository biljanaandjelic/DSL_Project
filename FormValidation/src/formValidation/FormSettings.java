/**
 */
package formValidation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link formValidation.FormSettings#isAutoComplete <em>Auto Complete</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getFormSettings()
 * @model
 * @generated
 */
public interface FormSettings extends AdditionalSettings {
	/**
	 * Returns the value of the '<em><b>Auto Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Complete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Complete</em>' attribute.
	 * @see #setAutoComplete(boolean)
	 * @see formValidation.FormValidationPackage#getFormSettings_AutoComplete()
	 * @model
	 * @generated
	 */
	boolean isAutoComplete();

	/**
	 * Sets the value of the '{@link formValidation.FormSettings#isAutoComplete <em>Auto Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Complete</em>' attribute.
	 * @see #isAutoComplete()
	 * @generated
	 */
	void setAutoComplete(boolean value);

} // FormSettings
