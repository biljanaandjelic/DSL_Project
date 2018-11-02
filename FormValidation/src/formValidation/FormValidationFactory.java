/**
 */
package formValidation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see formValidation.FormValidationPackage
 * @generated
 */
public interface FormValidationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FormValidationFactory eINSTANCE = formValidation.impl.FormValidationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Validation Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Validation Class</em>'.
	 * @generated
	 */
	ValidationClass createValidationClass();

	/**
	 * Returns a new object of class '<em>Class Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Attribute</em>'.
	 * @generated
	 */
	ClassAttribute createClassAttribute();

	/**
	 * Returns a new object of class '<em>Attribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Type</em>'.
	 * @generated
	 */
	AttributeType createAttributeType();

	/**
	 * Returns a new object of class '<em>Required</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Required</em>'.
	 * @generated
	 */
	Required createRequired();

	/**
	 * Returns a new object of class '<em>Email</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Email</em>'.
	 * @generated
	 */
	Email createEmail();

	/**
	 * Returns a new object of class '<em>Min Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Min Length</em>'.
	 * @generated
	 */
	MinLength createMinLength();

	/**
	 * Returns a new object of class '<em>Max Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Max Length</em>'.
	 * @generated
	 */
	MaxLength createMaxLength();

	/**
	 * Returns a new object of class '<em>Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Length</em>'.
	 * @generated
	 */
	Length createLength();

	/**
	 * Returns a new object of class '<em>Min Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Min Number</em>'.
	 * @generated
	 */
	MinNumber createMinNumber();

	/**
	 * Returns a new object of class '<em>Min Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Min Date</em>'.
	 * @generated
	 */
	MinDate createMinDate();

	/**
	 * Returns a new object of class '<em>Max Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Max Number</em>'.
	 * @generated
	 */
	MaxNumber createMaxNumber();

	/**
	 * Returns a new object of class '<em>Max Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Max Date</em>'.
	 * @generated
	 */
	MaxDate createMaxDate();

	/**
	 * Returns a new object of class '<em>Acceptable Values String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Acceptable Values String</em>'.
	 * @generated
	 */
	AcceptableValuesString createAcceptableValuesString();

	/**
	 * Returns a new object of class '<em>Acceptable Values Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Acceptable Values Date</em>'.
	 * @generated
	 */
	AcceptableValuesDate createAcceptableValuesDate();

	/**
	 * Returns a new object of class '<em>String Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Pattern</em>'.
	 * @generated
	 */
	StringPattern createStringPattern();

	/**
	 * Returns a new object of class '<em>Date Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Pattern</em>'.
	 * @generated
	 */
	DatePattern createDatePattern();

	/**
	 * Returns a new object of class '<em>Not Equals</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Equals</em>'.
	 * @generated
	 */
	NotEquals createNotEquals();

	/**
	 * Returns a new object of class '<em>Greater Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Greater Than</em>'.
	 * @generated
	 */
	GreaterThan createGreaterThan();

	/**
	 * Returns a new object of class '<em>Equals</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equals</em>'.
	 * @generated
	 */
	Equals createEquals();

	/**
	 * Returns a new object of class '<em>Less Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Less Than</em>'.
	 * @generated
	 */
	LessThan createLessThan();

	/**
	 * Returns a new object of class '<em>Attribute Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Array</em>'.
	 * @generated
	 */
	AttributeArray createAttributeArray();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FormValidationPackage getFormValidationPackage();

} //FormValidationFactory
