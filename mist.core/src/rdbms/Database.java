/**
 */
package rdbms;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rdbms.Database#getUserDefinedDataTypes <em>User Defined Data Types</em>}</li>
 *   <li>{@link rdbms.Database#getTables <em>Tables</em>}</li>
 *   <li>{@link rdbms.Database#getDataTypes <em>Data Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see rdbms.RdbmsPackage#getDatabase()
 * @model
 * @generated
 */
public interface Database extends ModelElement {
	/**
	 * Returns the value of the '<em><b>User Defined Data Types</b></em>' containment reference list.
	 * The list contents are of type {@link rdbms.UserDefinedDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Defined Data Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Defined Data Types</em>' containment reference list.
	 * @see rdbms.RdbmsPackage#getDatabase_UserDefinedDataTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<UserDefinedDataType> getUserDefinedDataTypes();

	/**
	 * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
	 * The list contents are of type {@link rdbms.Table}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' containment reference list.
	 * @see rdbms.RdbmsPackage#getDatabase_Tables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Table> getTables();

	/**
	 * Returns the value of the '<em><b>Data Types</b></em>' containment reference list.
	 * The list contents are of type {@link rdbms.SystemDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Types</em>' containment reference list.
	 * @see rdbms.RdbmsPackage#getDatabase_DataTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemDataType> getDataTypes();

} // Database
