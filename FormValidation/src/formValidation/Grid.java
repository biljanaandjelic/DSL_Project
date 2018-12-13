/**
 */
package formValidation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link formValidation.Grid#getNumOfColumns <em>Num Of Columns</em>}</li>
 *   <li>{@link formValidation.Grid#getNumOfRows <em>Num Of Rows</em>}</li>
 *   <li>{@link formValidation.Grid#getOrder <em>Order</em>}</li>
 *   <li>{@link formValidation.Grid#isExpandLast <em>Expand Last</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getGrid()
 * @model
 * @generated
 */
public interface Grid extends FormLayout {
	/**
	 * Returns the value of the '<em><b>Num Of Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Of Columns</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Of Columns</em>' attribute.
	 * @see #setNumOfColumns(int)
	 * @see formValidation.FormValidationPackage#getGrid_NumOfColumns()
	 * @model
	 * @generated
	 */
	int getNumOfColumns();

	/**
	 * Sets the value of the '{@link formValidation.Grid#getNumOfColumns <em>Num Of Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Of Columns</em>' attribute.
	 * @see #getNumOfColumns()
	 * @generated
	 */
	void setNumOfColumns(int value);

	/**
	 * Returns the value of the '<em><b>Num Of Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Of Rows</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Of Rows</em>' attribute.
	 * @see #setNumOfRows(int)
	 * @see formValidation.FormValidationPackage#getGrid_NumOfRows()
	 * @model
	 * @generated
	 */
	int getNumOfRows();

	/**
	 * Sets the value of the '{@link formValidation.Grid#getNumOfRows <em>Num Of Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Of Rows</em>' attribute.
	 * @see #getNumOfRows()
	 * @generated
	 */
	void setNumOfRows(int value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * The literals are from the enumeration {@link formValidation.EGridOrder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see formValidation.EGridOrder
	 * @see #setOrder(EGridOrder)
	 * @see formValidation.FormValidationPackage#getGrid_Order()
	 * @model
	 * @generated
	 */
	EGridOrder getOrder();

	/**
	 * Sets the value of the '{@link formValidation.Grid#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see formValidation.EGridOrder
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(EGridOrder value);

	/**
	 * Returns the value of the '<em><b>Expand Last</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expand Last</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expand Last</em>' attribute.
	 * @see #setExpandLast(boolean)
	 * @see formValidation.FormValidationPackage#getGrid_ExpandLast()
	 * @model default="true"
	 * @generated
	 */
	boolean isExpandLast();

	/**
	 * Sets the value of the '{@link formValidation.Grid#isExpandLast <em>Expand Last</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expand Last</em>' attribute.
	 * @see #isExpandLast()
	 * @generated
	 */
	void setExpandLast(boolean value);

} // Grid
