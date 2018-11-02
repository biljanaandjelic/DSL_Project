/**
 */
package formValidation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Acceptable Values String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link formValidation.AcceptableValuesString#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getAcceptableValuesString()
 * @model
 * @generated
 */
public interface AcceptableValuesString extends AcceptableValues {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see formValidation.FormValidationPackage#getAcceptableValuesString_Values()
	 * @model
	 * @generated
	 */
	EList<String> getValues();

} // AcceptableValuesString
