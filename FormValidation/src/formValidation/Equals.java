/**
 */
package formValidation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equals</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link formValidation.Equals#getAttributearray <em>Attributearray</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getEquals()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='collectionSize areEqualTypes'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot collectionSize='\n\t\t\tattributearray.classattribute -> size() >= 2' areEqualTypes='Tuple {\n\tmessage : String = \'In equal rule all data types should be same.\',\n\tstatus : Boolean = \n\t\t\tattributearray.classattribute -> forAll(a1: ClassAttribute, a2: ClassAttribute | a1.attributetype.vrsta = a2.attributetype.vrsta)\n}.status'"
 * @generated
 */
public interface Equals extends ClassRule {
	/**
	 * Returns the value of the '<em><b>Attributearray</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributearray</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributearray</em>' containment reference.
	 * @see #setAttributearray(AttributeArray)
	 * @see formValidation.FormValidationPackage#getEquals_Attributearray()
	 * @model containment="true"
	 * @generated
	 */
	AttributeArray getAttributearray();

	/**
	 * Sets the value of the '{@link formValidation.Equals#getAttributearray <em>Attributearray</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributearray</em>' containment reference.
	 * @see #getAttributearray()
	 * @generated
	 */
	void setAttributearray(AttributeArray value);

} // Equals
