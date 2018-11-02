/**
 */
package rdbms;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rdbms.Table#getTableFKs <em>Table FKs</em>}</li>
 *   <li>{@link rdbms.Table#getTablePK <em>Table PK</em>}</li>
 *   <li>{@link rdbms.Table#getTableUQ <em>Table UQ</em>}</li>
 *   <li>{@link rdbms.Table#getColumns <em>Columns</em>}</li>
 *   <li>{@link rdbms.Table#getTableCHs <em>Table CHs</em>}</li>
 * </ul>
 * </p>
 *
 * @see rdbms.RdbmsPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Table FKs</b></em>' containment reference list.
	 * The list contents are of type {@link rdbms.ForeignKey}.
	 * It is bidirectional and its opposite is '{@link rdbms.ForeignKey#getFKTable <em>FK Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table FKs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table FKs</em>' containment reference list.
	 * @see rdbms.RdbmsPackage#getTable_TableFKs()
	 * @see rdbms.ForeignKey#getFKTable
	 * @model opposite="FKTable" containment="true"
	 * @generated
	 */
	EList<ForeignKey> getTableFKs();

	/**
	 * Returns the value of the '<em><b>Table PK</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table PK</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table PK</em>' containment reference.
	 * @see #setTablePK(PrimaryKeyCon)
	 * @see rdbms.RdbmsPackage#getTable_TablePK()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PrimaryKeyCon getTablePK();

	/**
	 * Sets the value of the '{@link rdbms.Table#getTablePK <em>Table PK</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table PK</em>' containment reference.
	 * @see #getTablePK()
	 * @generated
	 */
	void setTablePK(PrimaryKeyCon value);

	/**
	 * Returns the value of the '<em><b>Table UQ</b></em>' containment reference list.
	 * The list contents are of type {@link rdbms.UniqueCon}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table UQ</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table UQ</em>' containment reference list.
	 * @see rdbms.RdbmsPackage#getTable_TableUQ()
	 * @model containment="true"
	 * @generated
	 */
	EList<UniqueCon> getTableUQ();

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link rdbms.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see rdbms.RdbmsPackage#getTable_Columns()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Column> getColumns();

	/**
	 * Returns the value of the '<em><b>Table CHs</b></em>' containment reference list.
	 * The list contents are of type {@link rdbms.CheckCon}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table CHs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table CHs</em>' containment reference list.
	 * @see rdbms.RdbmsPackage#getTable_TableCHs()
	 * @model containment="true"
	 * @generated
	 */
	EList<CheckCon> getTableCHs();

} // Table
