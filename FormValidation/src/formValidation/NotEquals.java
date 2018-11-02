/**
 */
package formValidation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not Equals</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link formValidation.NotEquals#getAttributearray <em>Attributearray</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getNotEquals()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='areEqualTypes differentDataInArray'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot areEqualTypes='Tuple {\n\tmessage : String = \'In equal rule all data types should be same.\',\n\tstatus : Boolean = \n\t\t\tattributearray.classattribute -> forAll(a1: ClassAttribute, a2: ClassAttribute | \n\t\t\t\tif a1<>a2 then \n\t\t\t\ta1.attributetype.vrsta = a2.attributetype.vrsta\n\t\t\t\telse true\n\t\t\t\tendif\n\t\t\t)\n}.status' differentDataInArray='Tuple {\n\tmessage : String = \'All attributes should be different\',\n\tstatus : Boolean = \n\t\t attributearray.classattribute -> forAll(a1: ClassAttribute, a2: ClassAttribute |\n\t\t \tif a1<>a2 then\n\t\t \ta1.name <> a2.name\n\t\t \telse true\n\t\t \tendif\n\t\t )\n}.status'"
 * @generated
 */
public interface NotEquals extends ClassRule {
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
	 * @see formValidation.FormValidationPackage#getNotEquals_Attributearray()
	 * @model containment="true"
	 * @generated
	 */
	AttributeArray getAttributearray();

	/**
	 * Sets the value of the '{@link formValidation.NotEquals#getAttributearray <em>Attributearray</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributearray</em>' containment reference.
	 * @see #getAttributearray()
	 * @generated
	 */
	void setAttributearray(AttributeArray value);

} // NotEquals
