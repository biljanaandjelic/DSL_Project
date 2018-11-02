/**
 */
package rdbms;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rdbms.ForeignKey#getRhsKey <em>Rhs Key</em>}</li>
 *   <li>{@link rdbms.ForeignKey#getLhsAttr <em>Lhs Attr</em>}</li>
 *   <li>{@link rdbms.ForeignKey#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link rdbms.ForeignKey#getDeleteActionRHS <em>Delete Action RHS</em>}</li>
 *   <li>{@link rdbms.ForeignKey#getUpdateActionRHS <em>Update Action RHS</em>}</li>
 *   <li>{@link rdbms.ForeignKey#getFKTable <em>FK Table</em>}</li>
 *   <li>{@link rdbms.ForeignKey#getMatch <em>Match</em>}</li>
 *   <li>{@link rdbms.ForeignKey#isInverseReferentialIntegrityCon <em>Inverse Referential Integrity Con</em>}</li>
 * </ul>
 * </p>
 *
 * @see rdbms.RdbmsPackage#getForeignKey()
 * @model
 * @generated
 */
public interface ForeignKey extends Constraints {
	/**
	 * Returns the value of the '<em><b>Rhs Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs Key</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs Key</em>' reference.
	 * @see #setRhsKey(PKeyAndUnique)
	 * @see rdbms.RdbmsPackage#getForeignKey_RhsKey()
	 * @model required="true"
	 * @generated
	 */
	PKeyAndUnique getRhsKey();

	/**
	 * Sets the value of the '{@link rdbms.ForeignKey#getRhsKey <em>Rhs Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs Key</em>' reference.
	 * @see #getRhsKey()
	 * @generated
	 */
	void setRhsKey(PKeyAndUnique value);

	/**
	 * Returns the value of the '<em><b>Lhs Attr</b></em>' reference list.
	 * The list contents are of type {@link rdbms.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs Attr</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs Attr</em>' reference list.
	 * @see rdbms.RdbmsPackage#getForeignKey_LhsAttr()
	 * @model required="true"
	 * @generated
	 */
	EList<Column> getLhsAttr();

	/**
	 * Returns the value of the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refers To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers To</em>' reference.
	 * @see #setRefersTo(Table)
	 * @see rdbms.RdbmsPackage#getForeignKey_RefersTo()
	 * @model required="true"
	 * @generated
	 */
	Table getRefersTo();

	/**
	 * Sets the value of the '{@link rdbms.ForeignKey#getRefersTo <em>Refers To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers To</em>' reference.
	 * @see #getRefersTo()
	 * @generated
	 */
	void setRefersTo(Table value);

	/**
	 * Returns the value of the '<em><b>Delete Action RHS</b></em>' attribute.
	 * The literals are from the enumeration {@link rdbms.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete Action RHS</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Action RHS</em>' attribute.
	 * @see rdbms.Action
	 * @see #setDeleteActionRHS(Action)
	 * @see rdbms.RdbmsPackage#getForeignKey_DeleteActionRHS()
	 * @model
	 * @generated
	 */
	Action getDeleteActionRHS();

	/**
	 * Sets the value of the '{@link rdbms.ForeignKey#getDeleteActionRHS <em>Delete Action RHS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Action RHS</em>' attribute.
	 * @see rdbms.Action
	 * @see #getDeleteActionRHS()
	 * @generated
	 */
	void setDeleteActionRHS(Action value);

	/**
	 * Returns the value of the '<em><b>Update Action RHS</b></em>' attribute.
	 * The literals are from the enumeration {@link rdbms.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Action RHS</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Action RHS</em>' attribute.
	 * @see rdbms.Action
	 * @see #setUpdateActionRHS(Action)
	 * @see rdbms.RdbmsPackage#getForeignKey_UpdateActionRHS()
	 * @model
	 * @generated
	 */
	Action getUpdateActionRHS();

	/**
	 * Sets the value of the '{@link rdbms.ForeignKey#getUpdateActionRHS <em>Update Action RHS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Action RHS</em>' attribute.
	 * @see rdbms.Action
	 * @see #getUpdateActionRHS()
	 * @generated
	 */
	void setUpdateActionRHS(Action value);

	/**
	 * Returns the value of the '<em><b>FK Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link rdbms.Table#getTableFKs <em>Table FKs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FK Table</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FK Table</em>' container reference.
	 * @see #setFKTable(Table)
	 * @see rdbms.RdbmsPackage#getForeignKey_FKTable()
	 * @see rdbms.Table#getTableFKs
	 * @model opposite="tableFKs" required="true" transient="false"
	 * @generated
	 */
	Table getFKTable();

	/**
	 * Sets the value of the '{@link rdbms.ForeignKey#getFKTable <em>FK Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FK Table</em>' container reference.
	 * @see #getFKTable()
	 * @generated
	 */
	void setFKTable(Table value);

	/**
	 * Returns the value of the '<em><b>Match</b></em>' attribute.
	 * The literals are from the enumeration {@link rdbms.ReferencingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Match</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match</em>' attribute.
	 * @see rdbms.ReferencingType
	 * @see #setMatch(ReferencingType)
	 * @see rdbms.RdbmsPackage#getForeignKey_Match()
	 * @model
	 * @generated
	 */
	ReferencingType getMatch();

	/**
	 * Sets the value of the '{@link rdbms.ForeignKey#getMatch <em>Match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match</em>' attribute.
	 * @see rdbms.ReferencingType
	 * @see #getMatch()
	 * @generated
	 */
	void setMatch(ReferencingType value);

	/**
	 * Returns the value of the '<em><b>Inverse Referential Integrity Con</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inverse Referential Integrity Con</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inverse Referential Integrity Con</em>' attribute.
	 * @see #setInverseReferentialIntegrityCon(boolean)
	 * @see rdbms.RdbmsPackage#getForeignKey_InverseReferentialIntegrityCon()
	 * @model
	 * @generated
	 */
	boolean isInverseReferentialIntegrityCon();

	/**
	 * Sets the value of the '{@link rdbms.ForeignKey#isInverseReferentialIntegrityCon <em>Inverse Referential Integrity Con</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inverse Referential Integrity Con</em>' attribute.
	 * @see #isInverseReferentialIntegrityCon()
	 * @generated
	 */
	void setInverseReferentialIntegrityCon(boolean value);

} // ForeignKey
