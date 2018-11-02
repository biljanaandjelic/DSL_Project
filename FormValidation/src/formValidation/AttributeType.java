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
 *   <li>{@link formValidation.AttributeType#getVrsta <em>Vrsta</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getAttributeType()
 * @model
 * @generated
 */
public interface AttributeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Vrsta</b></em>' attribute.
	 * The literals are from the enumeration {@link formValidation.EVrsta}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vrsta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vrsta</em>' attribute.
	 * @see formValidation.EVrsta
	 * @see #setVrsta(EVrsta)
	 * @see formValidation.FormValidationPackage#getAttributeType_Vrsta()
	 * @model
	 * @generated
	 */
	EVrsta getVrsta();

	/**
	 * Sets the value of the '{@link formValidation.AttributeType#getVrsta <em>Vrsta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vrsta</em>' attribute.
	 * @see formValidation.EVrsta
	 * @see #getVrsta()
	 * @generated
	 */
	void setVrsta(EVrsta value);

} // AttributeType
