/**
 */
package formValidation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Max Length</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link formValidation.MaxLength#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getMaxLength()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='maxLengthValue'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot maxLengthValue='Tuple {\n\tmessage : String = \'MaxLength cannot be less than zero\',\n\tstatus : Boolean = \n\t\t\tvalue > 0\n}.status'"
 * @generated
 */
public interface MaxLength extends AttributeRule {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see formValidation.FormValidationPackage#getMaxLength_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link formValidation.MaxLength#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // MaxLength
