/**
 */
package formValidation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Less Than</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link formValidation.LessThan#getClassattribute <em>Classattribute</em>}</li>
 *   <li>{@link formValidation.LessThan#getAttributearray <em>Attributearray</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getLessThan()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='acceptbleDataType areEqualTypes differentAttributes'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot acceptbleDataType='Tuple {\n\tmessage : String = \'It is possible to compare just attibutes type of date or type of number.\',\n\tstatus : Boolean = \n\t\t  classattribute.attributetype.attributeDataType.oclAsType(PrimitiveDataType) = EDataType::Number \n\t\t  or classattribute.attributetype.attributeDataType.oclAsType(PrimitiveDataType) = EDataType::Date\n}.status' areEqualTypes='Tuple {\n\tmessage : String = \'In less then rule all data types should be same.\',\n\tstatus : Boolean = \n\t\t attributearray.classattribute -> forAll(a1: ClassAttribute, a2: ClassAttribute |\n\t\t if a1<>a2  then \n\t\t\t if a1.attributetype.attributeDataType.oclIsKindOf(PrimitiveDataType) \n\t\t\t and a2.attributetype.attributeDataType.oclIsKindOf(PrimitiveDataType) \n\t\t\t and classattribute.attributetype.attributeDataType.oclIsKindOf(PrimitiveDataType)\n\t\t\t then\n\t\t\t a1.attributetype.attributeDataType.oclAsType(PrimitiveDataType).type = a2.attributetype.attributeDataType.oclAsType(PrimitiveDataType).type\n\t\t\t and classattribute.attributetype.attributeDataType.oclAsType(PrimitiveDataType).type = a1.attributetype.attributeDataType.oclAsType(PrimitiveDataType).type\n\t\t\t else \n\t\t\t a1.attributetype.attributeDataType.oclAsType(NonPrimitiveDataType).type.name = a2.attributetype.attributeDataType.oclAsType(NonPrimitiveDataType).type.name\n\t\t\t and classattribute.attributetype.attributeDataType.oclAsType(NonPrimitiveDataType).type.name = a1.attributetype.attributeDataType.oclAsType(NonPrimitiveDataType).type.name\n\t\t\t endif\n\t\t else true\n\t\t endif)\n}.status' differentAttributes='\n\t\t\tattributearray.classattribute -> forAll(a1: ClassAttribute | classattribute.name <> a1.name)'"
 * @generated
 */
public interface LessThan extends ClassRule {
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
	 * @see formValidation.FormValidationPackage#getLessThan_Classattribute()
	 * @model
	 * @generated
	 */
	ClassAttribute getClassattribute();

	/**
	 * Sets the value of the '{@link formValidation.LessThan#getClassattribute <em>Classattribute</em>}' reference.
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
	 * @see formValidation.FormValidationPackage#getLessThan_Attributearray()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeArray> getAttributearray();

} // LessThan
