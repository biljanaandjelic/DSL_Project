/**
 */
package rdbms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check Con</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rdbms.CheckCon#getCheckCondition <em>Check Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see rdbms.RdbmsPackage#getCheckCon()
 * @model
 * @generated
 */
public interface CheckCon extends Constraints {
	/**
	 * Returns the value of the '<em><b>Check Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Condition</em>' attribute.
	 * @see #setCheckCondition(String)
	 * @see rdbms.RdbmsPackage#getCheckCon_CheckCondition()
	 * @model
	 * @generated
	 */
	String getCheckCondition();

	/**
	 * Sets the value of the '{@link rdbms.CheckCon#getCheckCondition <em>Check Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Condition</em>' attribute.
	 * @see #getCheckCondition()
	 * @generated
	 */
	void setCheckCondition(String value);

} // CheckCon
