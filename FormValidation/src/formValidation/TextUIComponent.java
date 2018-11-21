/**
 */
package formValidation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text UI Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link formValidation.TextUIComponent#getPlaceHolder <em>Place Holder</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getTextUIComponent()
 * @model abstract="true"
 * @generated
 */
public interface TextUIComponent extends UIComponent {

	/**
	 * Returns the value of the '<em><b>Place Holder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place Holder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place Holder</em>' attribute.
	 * @see #setPlaceHolder(String)
	 * @see formValidation.FormValidationPackage#getTextUIComponent_PlaceHolder()
	 * @model
	 * @generated
	 */
	String getPlaceHolder();

	/**
	 * Sets the value of the '{@link formValidation.TextUIComponent#getPlaceHolder <em>Place Holder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place Holder</em>' attribute.
	 * @see #getPlaceHolder()
	 * @generated
	 */
	void setPlaceHolder(String value);
} // TextUIComponent
