/**
 */
package rdbms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rdbms.Constraints#getDeferrable <em>Deferrable</em>}</li>
 *   <li>{@link rdbms.Constraints#getDeferred <em>Deferred</em>}</li>
 * </ul>
 * </p>
 *
 * @see rdbms.RdbmsPackage#getConstraints()
 * @model abstract="true"
 * @generated
 */
public interface Constraints extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Deferrable</b></em>' attribute.
	 * The literals are from the enumeration {@link rdbms.DeferrableAct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deferrable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deferrable</em>' attribute.
	 * @see rdbms.DeferrableAct
	 * @see #setDeferrable(DeferrableAct)
	 * @see rdbms.RdbmsPackage#getConstraints_Deferrable()
	 * @model
	 * @generated
	 */
	DeferrableAct getDeferrable();

	/**
	 * Sets the value of the '{@link rdbms.Constraints#getDeferrable <em>Deferrable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deferrable</em>' attribute.
	 * @see rdbms.DeferrableAct
	 * @see #getDeferrable()
	 * @generated
	 */
	void setDeferrable(DeferrableAct value);

	/**
	 * Returns the value of the '<em><b>Deferred</b></em>' attribute.
	 * The literals are from the enumeration {@link rdbms.DeferredAct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deferred</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deferred</em>' attribute.
	 * @see rdbms.DeferredAct
	 * @see #setDeferred(DeferredAct)
	 * @see rdbms.RdbmsPackage#getConstraints_Deferred()
	 * @model
	 * @generated
	 */
	DeferredAct getDeferred();

	/**
	 * Sets the value of the '{@link rdbms.Constraints#getDeferred <em>Deferred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deferred</em>' attribute.
	 * @see rdbms.DeferredAct
	 * @see #getDeferred()
	 * @generated
	 */
	void setDeferred(DeferredAct value);

} // Constraints
