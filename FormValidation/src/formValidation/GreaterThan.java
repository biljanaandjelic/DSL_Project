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
 *   <li>{@link formValidation.GreaterThan#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link formValidation.GreaterThan#getAttributearray <em>Attributearray</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getGreaterThan()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='differentAttributes differentAttributesInArray areEqualTypes'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot differentAttributes='Tuple {\n\tmessage : String = \'First attribute and attributes from array should be different\',\n\tstatus : Boolean = \n\t\t\tattributearray.attributes -> forAll(a1: Attribute | attribute.name <> a1.name)\n}.status' differentAttributesInArray='Tuple {\n\tmessage : String = \'Attributes in array must be different\',\n\tstatus : Boolean = \n\t\t\t attributearray.attributes -> forAll(a1: Attribute, a2: Attribute | if a1<>a2 then\n\t\t\t \ta1.name <> a2.name\n\t\t\t \telse true\n\t\t\t \tendif\n\t\t\t )\n}.status' areEqualTypes='Tuple {\n\tmessage : String = \'In greater then rule all data types should be same.\',\n\tstatus : Boolean = \n\t\t attributearray.attributes -> forAll(a1: Attribute, a2: Attribute |\n\t\t if a1<>a2  then \n\t\t\t if a1.attributetype.dataType.oclIsKindOf(PrimitiveDataType) \n\t\t\t and a2.attributetype.dataType.oclIsKindOf(PrimitiveDataType) \n\t\t\t and attribute.attributetype.dataType.oclIsKindOf(PrimitiveDataType)\n\t\t\t then\n\t\t\t a1.attributetype.dataType.oclAsType(PrimitiveDataType).type = a2.attributetype.dataType.oclAsType(PrimitiveDataType).type\n\t\t\t and attribute.attributetype.dataType.oclAsType(PrimitiveDataType).type = a1.attributetype.dataType.oclAsType(PrimitiveDataType).type\n\t\t\t else \n\t\t\t a1.attributetype.dataType.oclAsType(NonPrimitiveDataType).type.name = a2.attributetype.dataType.oclAsType(NonPrimitiveDataType).type.name\n\t\t\t and attribute.attributetype.dataType.oclAsType(NonPrimitiveDataType).type.name = a1.attributetype.dataType.oclAsType(NonPrimitiveDataType).type.name\n\t\t\t endif\n\t\t else true\n\t\t endif)\n}.status'"
 * @generated
 */
public interface GreaterThan extends ClassRule {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Attribute)
	 * @see formValidation.FormValidationPackage#getGreaterThan_Attribute()
	 * @model
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link formValidation.GreaterThan#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

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
