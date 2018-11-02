/**
 */
package formValidation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Greater Than</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link formValidation.GreaterThan#getClassattribute <em>Classattribute</em>}</li>
 *   <li>{@link formValidation.GreaterThan#getAttributearray <em>Attributearray</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getGreaterThan()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='acceptbleDataType differentAttributes differentAttributesInArray equalTypes'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot acceptbleDataType='Tuple {\n\tmessage : String = \'It is possible to compare just attibutes type of date or type of number.\',\n\tstatus : Boolean = \n\t\t\tclassattribute.attributetype.vrsta = EVrsta::Number or classattribute.attributetype.vrsta = EVrsta::Date\n}.status' differentAttributes='Tuple {\n\tmessage : String = \'First attribute and attributes from array should be different\',\n\tstatus : Boolean = \n\t\t\tattributearray.classattribute -> forAll(a1: ClassAttribute | classattribute.name <> a1.name)\n}.status' differentAttributesInArray='Tuple {\n\tmessage : String = \'Attributes in array must be different\',\n\tstatus : Boolean = \n\t\t\t attributearray.classattribute -> forAll(a1: ClassAttribute, a2: ClassAttribute | if a1<>a2 then\n\t\t\t \ta1.name <> a2.name\n\t\t\t \telse true\n\t\t\t \tendif\n\t\t\t )\n}.status' equalTypes='Tuple {\n\tmessage : String = \'Data type should be same\',\n\tstatus : Boolean = \n\t\t\tattributearray.classattribute -> forAll(a1: ClassAttribute | a1.attributetype.vrsta = classattribute.attributetype.vrsta)\n}.status'"
 * @generated
 */
public interface GreaterThan extends ClassRule {
	/**
	 * Returns the value of the '<em><b>Classattribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classattribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classattribute</em>' reference.
	 * @see #setClassattribute(ClassAttribute)
	 * @see formValidation.FormValidationPackage#getGreaterThan_Classattribute()
	 * @model
	 * @generated
	 */
	ClassAttribute getClassattribute();

	/**
	 * Sets the value of the '{@link formValidation.GreaterThan#getClassattribute <em>Classattribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classattribute</em>' reference.
	 * @see #getClassattribute()
	 * @generated
	 */
	void setClassattribute(ClassAttribute value);

	/**
	 * Returns the value of the '<em><b>Attributearray</b></em>' containment reference list.
	 * The list contents are of type {@link formValidation.AttributeArray}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributearray</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributearray</em>' containment reference list.
	 * @see formValidation.FormValidationPackage#getGreaterThan_Attributearray()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeArray> getAttributearray();

} // GreaterThan
