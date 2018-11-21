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
 *   <li>{@link formValidation.ClassAttribute#getUicomponent <em>Uicomponent</em>}</li>
 *   <li>{@link formValidation.ClassAttribute#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getClassAttribute()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueAttributeRules appropriateAttributeRules comparedMinMax compareMinMaxLength'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot uniqueAttributeRules='\n\t\t\t attributerule->forAll(a1: AttributeRule, a2: AttributeRule |if  a1 <> a2 then\n\t\t\t \tnot a1.oclIsTypeOf(a2.oclType()) else true endif\n\t\t\t )' appropriateAttributeRules='Tuple {\n\tmessage : String = \'Each data type has appropriate rulles that can be applay to it.\',\n\tstatus : Boolean = \n\t\tif attributetype.vrsta = EVrsta::Number\n\t\tthen\n\t\t\tattributerule-> forAll(a1: AttributeRule | a1.oclIsKindOf(MaxNumber) or a1.oclIsKindOf(MinNumber) or a1.oclIsKindOf(Required))\n\t\telse\n\t\t  if attributetype.vrsta = EVrsta::_\'String\'\n\t\t  then\n\t\t   attributerule-> forAll(a1: AttributeRule | a1.oclIsKindOf(MinLength) or a1.oclIsKindOf(MaxLength) or \n\t\t   \ta1.oclIsKindOf(Length) or a1.oclIsKindOf(Required) or a1.oclIsKindOf(Pattern) or a1.oclIsKindOf(AcceptableValuesString)\n\t\t   \tor a1.oclIsKindOf(Email)\n\t\t   )\n\t\t  else\n\t\t  attributerule-> forAll(a1: AttributeRule | a1.oclIsKindOf(MaxDate) or a1.oclIsKindOf(MinDate) or a1.oclIsKindOf(Required) \n\t\t  or a1.oclIsKindOf(AcceptableValuesDate)or a1.oclIsKindOf(DatePattern))\n\t\t  endif\n\t\tendif\n\t\t\n}.status' comparedMinMax='Tuple {\n\tmessage : String = \'Max value should be greater than min value\',\n\tstatus : Boolean = \n\t\tattributerule-> forAll(a1: AttributeRule, a2: AttributeRule | \n\t\t\tif a1.oclIsKindOf(MaxNumber) and a2.oclIsKindOf(MinNumber)\n\t\t\tthen\n\t\t\t\ta1.oclAsType(MaxNumber).value >= a2.oclAsType(MinNumber).value \n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif\n\t\t)\n}.status' compareMinMaxLength='Tuple {\n\tmessage : String = \'Maxlength value should be greater than maxlength\',\n\tstatus : Boolean = \n\t\t\tattributerule-> forAll(a1: AttributeRule, a2: AttributeRule | \n\t\t\tif a1.oclIsKindOf(MaxLength) and a2.oclIsKindOf(MinLength)\n\t\t\tthen\n\t\t\t\ta1.oclAsType(MaxLength).value >= a2.oclAsType(MinLength).value\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif\n\t\t)\n}.status'"
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
	 * Returns the value of the '<em><b>Uicomponent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uicomponent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uicomponent</em>' containment reference.
	 * @see #setUicomponent(UIComponent)
	 * @see formValidation.FormValidationPackage#getClassAttribute_Uicomponent()
	 * @model containment="true"
	 * @generated
	 */
	UIComponent getUicomponent();

	/**
	 * Sets the value of the '{@link formValidation.ClassAttribute#getUicomponent <em>Uicomponent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uicomponent</em>' containment reference.
	 * @see #getUicomponent()
	 * @generated
	 */
	void setUicomponent(UIComponent value);

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

} // ClassAttribute
