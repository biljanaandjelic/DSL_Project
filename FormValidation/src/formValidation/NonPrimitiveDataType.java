/**
 */
package formValidation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Primitive Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link formValidation.NonPrimitiveDataType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getNonPrimitiveDataType()
 * @model
 * @generated
 */
public interface NonPrimitiveDataType extends AttributeDataType {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Entity)
	 * @see formValidation.FormValidationPackage#getNonPrimitiveDataType_Type()
	 * @model required="true"
	 * @generated
	 */
	Entity getType();

	/**
	 * Sets the value of the '{@link formValidation.NonPrimitiveDataType#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Entity value);

} // NonPrimitiveDataType
