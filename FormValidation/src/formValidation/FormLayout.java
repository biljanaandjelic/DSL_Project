/**
 */
package formValidation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link formValidation.FormLayout#getAttributearray <em>Attributearray</em>}</li>
 *   <li>{@link formValidation.FormLayout#getLayouts <em>Layouts</em>}</li>
 *   <li>{@link formValidation.FormLayout#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getFormLayout()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='checkFormLayout uniqueFormLayoutName numOfAttributeArraysFieldSet numOfAttributeArrayTab nameFormat allLayoutsOnOneLevelMustBeSameType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot checkFormLayout='Tuple {\n\tmessage : String = \'Attribute could appear only in one layout\',\n\tstatus : Boolean = \n\t\tFormLayout.allInstances()->forAll(fL1: FormLayout, fL2: FormLayout |  \n\t\t\tif fL1 <> fL2 and fL1.attributearray <> null and fL2.attributearray <> null\n\t\t\tthen\n\t\t\tfL1.attributearray.attributes.oclAsSet() -> intersection(fL2.attributearray.attributes.oclAsSet())->isEmpty()\n\t\t\telse true\n\t\t\tendif\n\t\t)\n}.status' uniqueFormLayoutName='Tuple {\n\tmessage : String = \'Layout name should be unique\',\n\tstatus : Boolean = \n\t\tFormLayout.allInstances()->forAll(fL1: FormLayout, fL2: FormLayout |  if fL1 <> fL2 then\n\t\t\tfL1.name <> fL2.name\n\t\t\telse true\n\t\t\tendif\n\t\t)\n}.status' numOfAttributeArraysFieldSet='Tuple {\n\tmessage : String = \'Number of attribute arrays is not appropriate.\',\n\tstatus : Boolean = \n\t\tFormLayout.allInstances()->forAll(fL1: FormLayout |\n\t\t\tif fL1.oclIsKindOf(FieldSet) then fL1.attributearray->size() <= 1 else true\n\t\t\tendif\n\t\t)\n}.status' numOfAttributeArrayTab='Tuple {\n\tmessage : String = \'Number of attribute arrays is not appropriate.\',\n\tstatus : Boolean = \n\t\tFormLayout.allInstances()->forAll(fL1: FormLayout |\n\t\t\tif fL1.oclIsKindOf(Tab) then fL1.attributearray->size() <= 1 else true\n\t\t\tendif\n\t\t)\n}.status' nameFormat='name.matches(\'[a-z][a-zA-Z0-9.]*\')' allLayoutsOnOneLevelMustBeSameType='\n\t\tlayouts -> forAll(fL1: FormLayout, fL2: FormLayout |\n\t\t\tif fL1.oclIsTypeOf(fL2.oclType()) then true else false endif\n\t\t)'"
 * @generated
 */
public interface FormLayout extends EObject {

	/**
	 * Returns the value of the '<em><b>Attributearray</b></em>' containment reference list.
	 * The list contents are of type {@link formValidation.AttributeArray}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributearray</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributearray</em>' containment reference list.
	 * @see formValidation.FormValidationPackage#getFormLayout_Attributearray()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeArray> getAttributearray();

	/**
	 * Returns the value of the '<em><b>Layouts</b></em>' containment reference list.
	 * The list contents are of type {@link formValidation.FormLayout}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layouts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layouts</em>' containment reference list.
	 * @see formValidation.FormValidationPackage#getFormLayout_Layouts()
	 * @model containment="true"
	 * @generated
	 */
	EList<FormLayout> getLayouts();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see formValidation.FormValidationPackage#getFormLayout_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link formValidation.FormLayout#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);
} // FormLayout
