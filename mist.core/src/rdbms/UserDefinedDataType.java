/**
 */
package rdbms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Defined Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rdbms.UserDefinedDataType#getDataType <em>Data Type</em>}</li>
 *   <li>{@link rdbms.UserDefinedDataType#getPrecision <em>Precision</em>}</li>
 *   <li>{@link rdbms.UserDefinedDataType#getLength <em>Length</em>}</li>
 *   <li>{@link rdbms.UserDefinedDataType#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see rdbms.RdbmsPackage#getUserDefinedDataType()
 * @model
 * @generated
 */
public interface UserDefinedDataType extends DataType {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(SystemDataType)
	 * @see rdbms.RdbmsPackage#getUserDefinedDataType_DataType()
	 * @model required="true"
	 * @generated
	 */
	SystemDataType getDataType();

	/**
	 * Sets the value of the '{@link rdbms.UserDefinedDataType#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(SystemDataType value);

	/**
	 * Returns the value of the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see #setPrecision(int)
	 * @see rdbms.RdbmsPackage#getUserDefinedDataType_Precision()
	 * @model
	 * @generated
	 */
	int getPrecision();

	/**
	 * Sets the value of the '{@link rdbms.UserDefinedDataType#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(int value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see rdbms.RdbmsPackage#getUserDefinedDataType_Length()
	 * @model
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link rdbms.UserDefinedDataType#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see rdbms.RdbmsPackage#getUserDefinedDataType_DefaultValue()
	 * @model
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link rdbms.UserDefinedDataType#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

} // UserDefinedDataType
