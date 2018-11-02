/**
 */
package rdbms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rdbms.SystemDataType#getPredefinedLength <em>Predefined Length</em>}</li>
 *   <li>{@link rdbms.SystemDataType#getPredefinedDecPlaces <em>Predefined Dec Places</em>}</li>
 * </ul>
 * </p>
 *
 * @see rdbms.RdbmsPackage#getSystemDataType()
 * @model
 * @generated
 */
public interface SystemDataType extends DataType {
	/**
	 * Returns the value of the '<em><b>Predefined Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefined Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Length</em>' attribute.
	 * @see #setPredefinedLength(int)
	 * @see rdbms.RdbmsPackage#getSystemDataType_PredefinedLength()
	 * @model
	 * @generated
	 */
	int getPredefinedLength();

	/**
	 * Sets the value of the '{@link rdbms.SystemDataType#getPredefinedLength <em>Predefined Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefined Length</em>' attribute.
	 * @see #getPredefinedLength()
	 * @generated
	 */
	void setPredefinedLength(int value);

	/**
	 * Returns the value of the '<em><b>Predefined Dec Places</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefined Dec Places</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Dec Places</em>' attribute.
	 * @see #setPredefinedDecPlaces(int)
	 * @see rdbms.RdbmsPackage#getSystemDataType_PredefinedDecPlaces()
	 * @model
	 * @generated
	 */
	int getPredefinedDecPlaces();

	/**
	 * Sets the value of the '{@link rdbms.SystemDataType#getPredefinedDecPlaces <em>Predefined Dec Places</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefined Dec Places</em>' attribute.
	 * @see #getPredefinedDecPlaces()
	 * @generated
	 */
	void setPredefinedDecPlaces(int value);

} // SystemDataType
