/**
 */
package formValidation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link formValidation.LoadValues#isIsMultiSelect <em>Is Multi Select</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getLoadValues()
 * @model
 * @generated
 */
public interface LoadValues extends SelectingUIComponent {
	/**
	 * Returns the value of the '<em><b>Is Multi Select</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Multi Select</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Multi Select</em>' attribute.
	 * @see #setIsMultiSelect(boolean)
	 * @see formValidation.FormValidationPackage#getLoadValues_IsMultiSelect()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsMultiSelect();

	/**
	 * Sets the value of the '{@link formValidation.LoadValues#isIsMultiSelect <em>Is Multi Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Multi Select</em>' attribute.
	 * @see #isIsMultiSelect()
	 * @generated
	 */
	void setIsMultiSelect(boolean value);

} // LoadValues