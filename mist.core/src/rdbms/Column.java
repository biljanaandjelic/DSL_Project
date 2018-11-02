/**
 */
package rdbms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rdbms.Column#getDefault <em>Default</em>}</li>
 *   <li>{@link rdbms.Column#getColumnInPKandUQ <em>Column In PKand UQ</em>}</li>
 *   <li>{@link rdbms.Column#isNullable <em>Nullable</em>}</li>
 *   <li>{@link rdbms.Column#getPrecision <em>Precision</em>}</li>
 *   <li>{@link rdbms.Column#getLength <em>Length</em>}</li>
 *   <li>{@link rdbms.Column#getColumnInFK <em>Column In FK</em>}</li>
 *   <li>{@link rdbms.Column#getColumnDataType <em>Column Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see rdbms.RdbmsPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(String)
	 * @see rdbms.RdbmsPackage#getColumn_Default()
	 * @model
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link rdbms.Column#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

	/**
	 * Returns the value of the '<em><b>Column In PKand UQ</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column In PKand UQ</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column In PKand UQ</em>' reference.
	 * @see #setColumnInPKandUQ(PKeyAndUnique)
	 * @see rdbms.RdbmsPackage#getColumn_ColumnInPKandUQ()
	 * @model
	 * @generated
	 */
	PKeyAndUnique getColumnInPKandUQ();

	/**
	 * Sets the value of the '{@link rdbms.Column#getColumnInPKandUQ <em>Column In PKand UQ</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column In PKand UQ</em>' reference.
	 * @see #getColumnInPKandUQ()
	 * @generated
	 */
	void setColumnInPKandUQ(PKeyAndUnique value);

	/**
	 * Returns the value of the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nullable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nullable</em>' attribute.
	 * @see #setNullable(boolean)
	 * @see rdbms.RdbmsPackage#getColumn_Nullable()
	 * @model required="true"
	 * @generated
	 */
	boolean isNullable();

	/**
	 * Sets the value of the '{@link rdbms.Column#isNullable <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nullable</em>' attribute.
	 * @see #isNullable()
	 * @generated
	 */
	void setNullable(boolean value);

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
	 * @see rdbms.RdbmsPackage#getColumn_Precision()
	 * @model
	 * @generated
	 */
	int getPrecision();

	/**
	 * Sets the value of the '{@link rdbms.Column#getPrecision <em>Precision</em>}' attribute.
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
	 * @see rdbms.RdbmsPackage#getColumn_Length()
	 * @model
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link rdbms.Column#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

	/**
	 * Returns the value of the '<em><b>Column In FK</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column In FK</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column In FK</em>' reference.
	 * @see #setColumnInFK(ForeignKey)
	 * @see rdbms.RdbmsPackage#getColumn_ColumnInFK()
	 * @model
	 * @generated
	 */
	ForeignKey getColumnInFK();

	/**
	 * Sets the value of the '{@link rdbms.Column#getColumnInFK <em>Column In FK</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column In FK</em>' reference.
	 * @see #getColumnInFK()
	 * @generated
	 */
	void setColumnInFK(ForeignKey value);

	/**
	 * Returns the value of the '<em><b>Column Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Data Type</em>' reference.
	 * @see #setColumnDataType(DataType)
	 * @see rdbms.RdbmsPackage#getColumn_ColumnDataType()
	 * @model required="true"
	 * @generated
	 */
	DataType getColumnDataType();

	/**
	 * Sets the value of the '{@link rdbms.Column#getColumnDataType <em>Column Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Data Type</em>' reference.
	 * @see #getColumnDataType()
	 * @generated
	 */
	void setColumnDataType(DataType value);

} // Column
