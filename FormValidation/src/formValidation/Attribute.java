/**
 */
package formValidation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link formValidation.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link formValidation.Attribute#getAttributetype <em>Attributetype</em>}</li>
 *   <li>{@link formValidation.Attribute#getRules <em>Rules</em>}</li>
 *   <li>{@link formValidation.Attribute#getLabel <em>Label</em>}</li>
 *   <li>{@link formValidation.Attribute#isMaster <em>Master</em>}</li>
 *   <li>{@link formValidation.Attribute#isIsClassRepresenting <em>Is Class Representing</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getAttribute()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appropriateAttributeRules compareMinMaxLength compareMinMaxNumber compareMinMaxDate nameFormat attributeRuleRequiredCanAppearJustOnce attributeRuleMinLengthCanAppearJustOnce attributeRuleMaxLengthCanAppearJustOnce attributeRuleLengthCanAppearJustOnce attributeRuleMinCanAppearJustOnce attributeRuleMaxCanAppearJustOnce attributeRuleAcceptableValuesCanAppearJustOnce attributeRulePatternCanAppearJustOnce collectionCannotBeMaster collectionCannotBeRepresenting nonPrimitiveAttributeCannotBeMaster'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot appropriateAttributeRules='Tuple {\n\tmessage : String = \'Each data type has appropriate rulles that can be applay to it.\',\n\tstatus : Boolean = \n\t\t if attributetype.oclIsKindOf(PrimitiveDataType) \n\t\t \t  then if attributetype.dataType.oclAsType(PrimitiveDataType).type = EDataType::Number\n\t\t \t  \t    then rules -> forAll(a1: AttributeRule | a1.oclIsKindOf(MaxNumber) or a1.oclIsKindOf(MinNumber) or a1.oclIsKindOf(Required))\n\t\t \t        else if attributetype.dataType.oclAsType(PrimitiveDataType).type = EDataType::_\'String\'  \n\t\t \t             then rules-> forAll(a1: AttributeRule | a1.oclIsKindOf(MinLength) or a1.oclIsKindOf(MaxLength) or\n\t\t \t\t\t\t\ta1.oclIsKindOf(Length) or a1.oclIsKindOf(Required) or a1.oclIsKindOf(Pattern) or a1.oclIsKindOf(AcceptableValuesString))\n\t\t \t\t\t\t  else rules-> forAll(a1: AttributeRule | a1.oclIsKindOf(MaxDate) or a1.oclIsKindOf(MinDate) or a1.oclIsKindOf(Required)\n\t\t \t\t\t\t  or a1.oclIsKindOf(AcceptableValuesDate)or a1.oclIsKindOf(DatePattern))\n\t\t                 endif\n\t\t           endif\n\t\telse rules-> forAll(a1: AttributeRule | a1.oclIsKindOf(Required))\n\t\tendif\n}.status' compareMinMaxLength='Tuple {\n\tmessage : String = \'Maxlength value should be greater than mainlength\',\n\tstatus : Boolean = \n\t\t\trules -> forAll(a1: AttributeRule, a2: AttributeRule | \n\t\t\tif a1.oclIsKindOf(MaxLength) and a2.oclIsKindOf(MinLength)\n\t\t\tthen\n\t\t\t\ta1.oclAsType(MaxLength).value >= a2.oclAsType(MinLength).value\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif\n\t\t)\n}.status' compareMinMaxNumber='Tuple {\n\tmessage : String = \'Check if max value is greater then min value\',\n\tstatus : Boolean = \n\t\t\trules -> forAll(a1: AttributeRule, a2: AttributeRule | \n\t\t\tif a1.oclIsKindOf(MaxNumber) and a2.oclIsKindOf(MinNumber)\n\t\t\tthen\n\t\t\t\ta1.oclAsType(MaxNumber).value >= a2.oclAsType(MinNumber).value\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif\n\t\t)\n}.status' compareMinMaxDate='Tuple {\n\tmessage : String = \'Check id max date is greater then min date\',\n\tstatus : Boolean = \n\t\t\trules -> forAll(a1: AttributeRule, a2: AttributeRule | \n\t\t\tif a1.oclIsKindOf(MaxDate) and a2.oclIsKindOf(MinDate)\n\t\t\tthen\n\t\t\t\ta1.oclAsType(MaxDate).value >= a2.oclAsType(MinDate).value\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif\n\t\t)\n}.status' nameFormat='name.matches(\'[a-z][a-zA-Z0-9.]*\')' attributeRuleRequiredCanAppearJustOnce='\n\t\trules -> select(aR| aR.oclIsKindOf(Required))->size() <=1' attributeRuleMinLengthCanAppearJustOnce='\n\t\trules -> select(aR| aR.oclIsKindOf(MinLength))->size() <=1' attributeRuleMaxLengthCanAppearJustOnce='\n\t\trules -> select(aR| aR.oclIsKindOf(MaxLength))->size() <=1' attributeRuleLengthCanAppearJustOnce='\n\t\trules -> select(aR| aR.oclIsKindOf(Length))->size() <=1' attributeRuleMinCanAppearJustOnce='\n\t\trules -> select(aR| aR.oclIsKindOf(Min))->size() <=1' attributeRuleMaxCanAppearJustOnce='\n\t\trules -> select(aR| aR.oclIsKindOf(Max))->size() <=1' attributeRuleAcceptableValuesCanAppearJustOnce='\n\t\trules -> select(aR| aR.oclIsKindOf(AcceptableValues))->size() <=1' attributeRulePatternCanAppearJustOnce='\n\t\trules -> select(aR| aR.oclIsKindOf(Pattern))->size() <=1' collectionCannotBeMaster='\n\t\tif attributetype.dataType.isCollection then master = false else true endif' collectionCannotBeRepresenting='\n\t\tif attributetype.dataType.isCollection then isClassRepresenting = false else true endif' nonPrimitiveAttributeCannotBeMaster='Tuple {\n\tmessage : String = \'Non primitive data type cannot be master attribute.\',\n\tstatus : Boolean = \n\t\tif attributetype.dataType.oclIsKindOf(NonPrimitiveDataType) then master = false else true endif\n}.status'"
 * @generated
 */
public interface Attribute extends EObject {
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
	 * @see formValidation.FormValidationPackage#getAttribute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link formValidation.Attribute#getName <em>Name</em>}' attribute.
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
	 * @see formValidation.FormValidationPackage#getAttribute_Attributetype()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AttributeType getAttributetype();

	/**
	 * Sets the value of the '{@link formValidation.Attribute#getAttributetype <em>Attributetype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributetype</em>' containment reference.
	 * @see #getAttributetype()
	 * @generated
	 */
	void setAttributetype(AttributeType value);

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link formValidation.AttributeRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see formValidation.FormValidationPackage#getAttribute_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeRule> getRules();

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
	 * @see formValidation.FormValidationPackage#getAttribute_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link formValidation.Attribute#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Master</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Master</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master</em>' attribute.
	 * @see #setMaster(boolean)
	 * @see formValidation.FormValidationPackage#getAttribute_Master()
	 * @model default="false"
	 * @generated
	 */
	boolean isMaster();

	/**
	 * Sets the value of the '{@link formValidation.Attribute#isMaster <em>Master</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master</em>' attribute.
	 * @see #isMaster()
	 * @generated
	 */
	void setMaster(boolean value);

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
	 * @see formValidation.FormValidationPackage#getAttribute_IsClassRepresenting()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsClassRepresenting();

	/**
	 * Sets the value of the '{@link formValidation.Attribute#isIsClassRepresenting <em>Is Class Representing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Class Representing</em>' attribute.
	 * @see #isIsClassRepresenting()
	 * @generated
	 */
	void setIsClassRepresenting(boolean value);

} // Attribute