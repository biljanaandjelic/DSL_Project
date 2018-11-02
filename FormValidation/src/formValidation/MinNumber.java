/**
 */
package formValidation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Min Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link formValidation.MinNumber#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getMinNumber()
 * @model
 * @generated
 */
public interface MinNumber extends Min {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(float)
	 * @see formValidation.FormValidationPackage#getMinNumber_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Float"
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link formValidation.MinNumber#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

} // MinNumber
