/**
 */
package formValidation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link formValidation.DatePattern#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getDatePattern()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='structureOfRegex'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot structureOfRegex='\n\t\tvalue.matches(\'dd.MM.yyyy\') or value.matches(\'dd.MMM.yyyy\') or value.matches(\'dd-MMM-yyyy\')\n\t\tor value.matches(\'dd/MMM/yyyy\') or value.matches(\'dd-MM-yyyy\') or value.matches(\'dd/MM/yyyy\')'"
 * @generated
 */
public interface DatePattern extends Pattern {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"dd/MM/yyyy"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see formValidation.FormValidationPackage#getDatePattern_Value()
	 * @model default="dd/MM/yyyy"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link formValidation.DatePattern#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // DatePattern
