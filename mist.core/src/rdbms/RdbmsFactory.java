/**
 */
package rdbms;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see rdbms.RdbmsPackage
 * @generated
 */
public interface RdbmsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RdbmsFactory eINSTANCE = rdbms.impl.RdbmsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database</em>'.
	 * @generated
	 */
	Database createDatabase();

	/**
	 * Returns a new object of class '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table</em>'.
	 * @generated
	 */
	Table createTable();

	/**
	 * Returns a new object of class '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Column</em>'.
	 * @generated
	 */
	Column createColumn();

	/**
	 * Returns a new object of class '<em>Foreign Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Foreign Key</em>'.
	 * @generated
	 */
	ForeignKey createForeignKey();

	/**
	 * Returns a new object of class '<em>Check Con</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check Con</em>'.
	 * @generated
	 */
	CheckCon createCheckCon();

	/**
	 * Returns a new object of class '<em>Primary Key Con</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primary Key Con</em>'.
	 * @generated
	 */
	PrimaryKeyCon createPrimaryKeyCon();

	/**
	 * Returns a new object of class '<em>Unique Con</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unique Con</em>'.
	 * @generated
	 */
	UniqueCon createUniqueCon();

	/**
	 * Returns a new object of class '<em>System Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Data Type</em>'.
	 * @generated
	 */
	SystemDataType createSystemDataType();

	/**
	 * Returns a new object of class '<em>User Defined Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Defined Data Type</em>'.
	 * @generated
	 */
	UserDefinedDataType createUserDefinedDataType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RdbmsPackage getRdbmsPackage();

} //RdbmsFactory
