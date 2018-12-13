/**
 */
package formValidation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link formValidation.ClassAttribute#getName <em>Name</em>}</li>
 *   <li>{@link formValidation.ClassAttribute#getAttributetype <em>Attributetype</em>}</li>
 *   <li>{@link formValidation.ClassAttribute#getAttributerule <em>Attributerule</em>}</li>
 *   <li>{@link formValidation.ClassAttribute#getLabel <em>Label</em>}</li>
 *   <li>{@link formValidation.ClassAttribute#isMaser <em>Maser</em>}</li>
 *   <li>{@link formValidation.ClassAttribute#isIsClassRepresenting <em>Is Class Representing</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getClassAttribute()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appropriateAttributeRules compareMinMaxLength compareMinMaxNumber compareMinMaxDate nameFormat'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot appropriateAttributeRules='Tuple {\n\tmessage : String = \'Each data type has appropriate rulles that can be applay to it.\',\n\tstatus : Boolean = \n\t\t if attributetype.attributeDataType.oclIsKindOf(PrimitiveDataType) \n\t\t \t  then if attributetype.attributeDataType.oclAsType(PrimitiveDataType).type = EDataType::Number\n\t\t \t  \t    then attributerule-> forAll(a1: AttributeRule | a1.oclIsKindOf(MaxNumber) or a1.oclIsKindOf(MinNumber) or a1.oclIsKindOf(Required))\n\t\t \t        else if attributetype.attributeDataType.oclAsType(PrimitiveDataType).type = EDataType::_\'String\'  \n\t\t \t             then attributerule-> forAll(a1: AttributeRule | a1.oclIsKindOf(MinLength) or a1.oclIsKindOf(MaxLength) or\n\t\t \t\t\t\t\ta1.oclIsKindOf(Length) or a1.oclIsKindOf(Required) or a1.oclIsKindOf(Pattern) or a1.oclIsKindOf(AcceptableValuesString)\n\t\t \t\t\t\t\tor a1.oclIsKindOf(Email))\n\t\t \t\t\t\t  else attributerule-> forAll(a1: AttributeRule | a1.oclIsKindOf(MaxDate) or a1.oclIsKindOf(MinDate) or a1.oclIsKindOf(Required)\n\t\t \t\t\t\t  or a1.oclIsKindOf(AcceptableValuesDate)or a1.oclIsKindOf(DatePattern))\n\t\t                 endif\n\t\t           endif\n\t\telse attributerule-> forAll(a1: AttributeRule | a1.oclIsKindOf(Required))\n\t\tendif\n}.status' compareMinMaxLength='Tuple {\n\tmessage : String = \'Maxlength value should be greater than mainlength\',\n\tstatus : Boolean = \n\t\t\tattributerule-> forAll(a1: AttributeRule, a2: AttributeRule | \n\t\t\tif a1.oclIsKindOf(MaxLength) and a2.oclIsKindOf(MinLength)\n\t\t\tthen\n\t\t\t\ta1.oclAsType(MaxLength).value >= a2.oclAsType(MinLength).value\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif\n\t\t)\n}.status' compareMinMaxNumber='Tuple {\n\tmessage : String = \'Check if max value is greater then min value\',\n\tstatus : Boolean = \n\t\t\tattributerule-> forAll(a1: AttributeRule, a2: AttributeRule | \n\t\t\tif a1.oclIsKindOf(MaxNumber) and a2.oclIsKindOf(MinNumber)\n\t\t\tthen\n\t\t\t\ta1.oclAsType(MaxNumber).value >= a2.oclAsType(MinNumber).value\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif\n\t\t)\n}.status' compareMinMaxDate='Tuple {\n\tmessage : String = \'Check id max date is greater then min date\',\n\tstatus : Boolean = \n\t\t\tattributerule-> forAll(a1: AttributeRule, a2: AttributeRule | \n\t\t\tif a1.oclIsKindOf(MaxDate) and a2.oclIsKindOf(MinDate)\n\t\t\tthen\n\t\t\t\ta1.oclAsType(MaxDate).value >= a2.oclAsType(MinDate).value\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif\n\t\t)\n}.status' nameFormat='name.matches(\'[a-z][a-zA-Z]*\')'"
 * @generated
 */
public interface ClassAttribute extends EObject {
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
	 * @see formValidation.FormValidationPackage#getClassAttribute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link formValidation.ClassAttribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Attributetype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributetype</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributetype</em>' containment reference.
	 * @see #setAttributetype(AttributeType)
	 * @see formValidation.FormValidationPackage#getClassAttribute_Attributetype()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AttributeType getAttributetype();

	/**
	 * Sets the value of the '{@link formValidation.ClassAttribute#getAttributetype <em>Attributetype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributetype</em>' containment reference.
	 * @see #getAttributetype()
	 * @generated
	 */
	void setAttributetype(AttributeType value);

	/**
	 * Returns the value of the '<em><b>Attributerule</b></em>' containment reference list.
	 * The list contents are of type {@link formValidation.AttributeRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributerule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributerule</em>' containment reference list.
	 * @see formValidation.FormValidationPackage#getClassAttribute_Attributerule()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeRule> getAttributerule();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see formValidation.FormValidationPackage#getClassAttribute_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link formValidation.ClassAttribute#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Maser</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maser</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maser</em>' attribute.
	 * @see #setMaser(boolean)
	 * @see formValidation.FormValidationPackage#getClassAttribute_Maser()
	 * @model default="true"
	 * @generated
	 */
	boolean isMaser();

	/**
	 * Sets the value of the '{@link formValidation.ClassAttribute#isMaser <em>Maser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maser</em>' attribute.
	 * @see #isMaser()
	 * @generated
	 */
	void setMaser(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Class Representing</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Class Representing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Class Representing</em>' attribute.
	 * @see #setIsClassRepresenting(boolean)
	 * @see formValidation.FormValidationPackage#getClassAttribute_IsClassRepresenting()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsClassRepresenting();

	/**
	 * Sets the value of the '{@link formValidation.ClassAttribute#isIsClassRepresenting <em>Is Class Representing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Class Representing</em>' attribute.
	 * @see #isIsClassRepresenting()
	 * @generated
	 */
	void setIsClassRepresenting(boolean value);

} // ClassAttribute
