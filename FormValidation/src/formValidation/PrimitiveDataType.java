/**
 */
package formValidation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link formValidation.PrimitiveDataType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getPrimitiveDataType()
 * @model
 * @generated
 */
public interface PrimitiveDataType extends AttributeDataType {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link formValidation.EDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see formValidation.EDataType
	 * @see #setType(EDataType)
	 * @see formValidation.FormValidationPackage#getPrimitiveDataType_Type()
	 * @model
	 * @generated
	 */
	EDataType getType();

	/**
	 * Sets the value of the '{@link formValidation.PrimitiveDataType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see formValidation.EDataType
	 * @see #getType()
	 * @generated
	 */
	void setType(EDataType value);

} // PrimitiveDataType
