/**
 */
package formValidation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric UI Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link formValidation.NumericUIComponent#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link formValidation.NumericUIComponent#getComponentType <em>Component Type</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getNumericUIComponent()
 * @model
 * @generated
 */
public interface NumericUIComponent extends UIComponent {
	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(double)
	 * @see formValidation.FormValidationPackage#getNumericUIComponent_DefaultValue()
	 * @model
	 * @generated
	 */
	double getDefaultValue();

	/**
	 * Sets the value of the '{@link formValidation.NumericUIComponent#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(double value);

	/**
	 * Returns the value of the '<em><b>Component Type</b></em>' attribute.
	 * The default value is <code>"SimpleInput"</code>.
	 * The literals are from the enumeration {@link formValidation.EUINumberComponentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Type</em>' attribute.
	 * @see formValidation.EUINumberComponentType
	 * @see #setComponentType(EUINumberComponentType)
	 * @see formValidation.FormValidationPackage#getNumericUIComponent_ComponentType()
	 * @model default="SimpleInput"
	 * @generated
	 */
	EUINumberComponentType getComponentType();

	/**
	 * Sets the value of the '{@link formValidation.NumericUIComponent#getComponentType <em>Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Type</em>' attribute.
	 * @see formValidation.EUINumberComponentType
	 * @see #getComponentType()
	 * @generated
	 */
	void setComponentType(EUINumberComponentType value);

} // NumericUIComponent
