/**
 */
package formValidation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link formValidation.AttributeType#getUiComponent <em>Ui Component</em>}</li>
 *   <li>{@link formValidation.AttributeType#getAttributeDataType <em>Attribute Data Type</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getAttributeType()
 * @model
 * @generated
 */
public interface AttributeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ui Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ui Component</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ui Component</em>' containment reference.
	 * @see #setUiComponent(UIComponent)
	 * @see formValidation.FormValidationPackage#getAttributeType_UiComponent()
	 * @model containment="true"
	 * @generated
	 */
	UIComponent getUiComponent();

	/**
	 * Sets the value of the '{@link formValidation.AttributeType#getUiComponent <em>Ui Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ui Component</em>' containment reference.
	 * @see #getUiComponent()
	 * @generated
	 */
	void setUiComponent(UIComponent value);

	/**
	 * Returns the value of the '<em><b>Attribute Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Data Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Data Type</em>' containment reference.
	 * @see #setAttributeDataType(AttributeDataType)
	 * @see formValidation.FormValidationPackage#getAttributeType_AttributeDataType()
	 * @model containment="true"
	 * @generated
	 */
	AttributeDataType getAttributeDataType();

	/**
	 * Sets the value of the '{@link formValidation.AttributeType#getAttributeDataType <em>Attribute Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Data Type</em>' containment reference.
	 * @see #getAttributeDataType()
	 * @generated
	 */
	void setAttributeDataType(AttributeDataType value);

} // AttributeType
