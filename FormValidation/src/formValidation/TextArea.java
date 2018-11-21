/**
 */
package formValidation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link formValidation.TextArea#getNumOfRows <em>Num Of Rows</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getTextArea()
 * @model
 * @generated
 */
public interface TextArea extends TextUIComponent {
	/**
	 * Returns the value of the '<em><b>Num Of Rows</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Of Rows</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Of Rows</em>' attribute.
	 * @see #setNumOfRows(int)
	 * @see formValidation.FormValidationPackage#getTextArea_NumOfRows()
	 * @model default="1"
	 * @generated
	 */
	int getNumOfRows();

	/**
	 * Sets the value of the '{@link formValidation.TextArea#getNumOfRows <em>Num Of Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Of Rows</em>' attribute.
	 * @see #getNumOfRows()
	 * @generated
	 */
	void setNumOfRows(int value);

} // TextArea
