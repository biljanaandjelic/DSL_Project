/**
 */
package formValidation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date UI Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link formValidation.DateUIComponent#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getDateUIComponent()
 * @model
 * @generated
 */
public interface DateUIComponent extends UIComponent {

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"OnlyDate"</code>.
	 * The literals are from the enumeration {@link formValidation.EDateUIType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see formValidation.EDateUIType
	 * @see #setType(EDateUIType)
	 * @see formValidation.FormValidationPackage#getDateUIComponent_Type()
	 * @model default="OnlyDate"
	 * @generated
	 */
	EDateUIType getType();

	/**
	 * Sets the value of the '{@link formValidation.DateUIComponent#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see formValidation.EDateUIType
	 * @see #getType()
	 * @generated
	 */
	void setType(EDateUIType value);
} // DateUIComponent
