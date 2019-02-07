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
	 * Returns a new object of class '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity</em>'.
	 * @generated
	 */
	Entity createEntity();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

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
	 * Returns a new object of class '<em>Numeric UI Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numeric UI Component</em>'.
	 * @generated
	 */
	NumericUIComponent createNumericUIComponent();

	/**
	 * Returns a new object of class '<em>Radio Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Radio Button</em>'.
	 * @generated
	 */
	RadioButton createRadioButton();

	/**
	 * Returns a new object of class '<em>Drop Down List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drop Down List</em>'.
	 * @generated
	 */
	DropDownList createDropDownList();

	/**
	 * Returns a new object of class '<em>Check Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check Box</em>'.
	 * @generated
	 */
	CheckBox createCheckBox();

	/**
	 * Returns a new object of class '<em>Date UI Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date UI Component</em>'.
	 * @generated
	 */
	DateUIComponent createDateUIComponent();

	/**
	 * Returns a new object of class '<em>Text Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Input</em>'.
	 * @generated
	 */
	TextInput createTextInput();

	/**
	 * Returns a new object of class '<em>Text Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Area</em>'.
	 * @generated
	 */
	TextArea createTextArea();

	/**
	 * Returns a new object of class '<em>Attribute Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Settings</em>'.
	 * @generated
	 */
	AttributeSettings createAttributeSettings();

	/**
	 * Returns a new object of class '<em>Label Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label Settings</em>'.
	 * @generated
	 */
	LabelSettings createLabelSettings();

	/**
	 * Returns a new object of class '<em>Error Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Message</em>'.
	 * @generated
	 */
	ErrorMessage createErrorMessage();

	/**
	 * Returns a new object of class '<em>Tel Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tel Input</em>'.
	 * @generated
	 */
	TelInput createTelInput();

	/**
	 * Returns a new object of class '<em>Email Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Email Input</em>'.
	 * @generated
	 */
	EmailInput createEmailInput();

	/**
	 * Returns a new object of class '<em>Password</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Password</em>'.
	 * @generated
	 */
	Password createPassword();

	/**
	 * Returns a new object of class '<em>File Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Input</em>'.
	 * @generated
	 */
	FileInput createFileInput();

	/**
	 * Returns a new object of class '<em>Primitive Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Data Type</em>'.
	 * @generated
	 */
	PrimitiveDataType createPrimitiveDataType();

	/**
	 * Returns a new object of class '<em>Non Primitive Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non Primitive Data Type</em>'.
	 * @generated
	 */
	NonPrimitiveDataType createNonPrimitiveDataType();

	/**
	 * Returns a new object of class '<em>Ref Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ref Entity</em>'.
	 * @generated
	 */
	RefEntity createRefEntity();

	/**
	 * Returns a new object of class '<em>Business Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Model</em>'.
	 * @generated
	 */
	BusinessModel createBusinessModel();

	/**
	 * Returns a new object of class '<em>Error Message Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Message Settings</em>'.
	 * @generated
	 */
	ErrorMessageSettings createErrorMessageSettings();

	/**
	 * Returns a new object of class '<em>Pagination</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pagination</em>'.
	 * @generated
	 */
	Pagination createPagination();

	/**
	 * Returns a new object of class '<em>Table Overview</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Overview</em>'.
	 * @generated
	 */
	TableOverview createTableOverview();

	/**
	 * Returns a new object of class '<em>Overview Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Overview Settings</em>'.
	 * @generated
	 */
	OverviewSettings createOverviewSettings();

	/**
	 * Returns a new object of class '<em>Note Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Note Settings</em>'.
	 * @generated
	 */
	NoteSettings createNoteSettings();

	/**
	 * Returns a new object of class '<em>Load Values</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load Values</em>'.
	 * @generated
	 */
	LoadValues createLoadValues();

	/**
	 * Returns a new object of class '<em>Autocomplete Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Autocomplete Component</em>'.
	 * @generated
	 */
	AutocompleteComponent createAutocompleteComponent();

	/**
	 * Returns a new object of class '<em>Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Color</em>'.
	 * @generated
	 */
	Color createColor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FormValidationPackage getFormValidationPackage();

} //FormValidationFactory
