/**
 */
package formValidation.util;

import formValidation.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see formValidation.FormValidationPackage
 * @generated
 */
public class FormValidationValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final FormValidationValidator INSTANCE = new FormValidationValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "formValidation";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormValidationValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return FormValidationPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case FormValidationPackage.VALIDATION_CLASS:
				return validateValidationClass((ValidationClass)value, diagnostics, context);
			case FormValidationPackage.ATTRIBUTE_RULE:
				return validateAttributeRule((AttributeRule)value, diagnostics, context);
			case FormValidationPackage.CLASS_ATTRIBUTE:
				return validateClassAttribute((ClassAttribute)value, diagnostics, context);
			case FormValidationPackage.ATTRIBUTE_TYPE:
				return validateAttributeType((AttributeType)value, diagnostics, context);
			case FormValidationPackage.MIN:
				return validateMin((Min)value, diagnostics, context);
			case FormValidationPackage.MAX:
				return validateMax((Max)value, diagnostics, context);
			case FormValidationPackage.REQUIRED:
				return validateRequired((Required)value, diagnostics, context);
			case FormValidationPackage.ACCEPTABLE_VALUES:
				return validateAcceptableValues((AcceptableValues)value, diagnostics, context);
			case FormValidationPackage.PATTERN:
				return validatePattern((Pattern)value, diagnostics, context);
			case FormValidationPackage.MIN_LENGTH:
				return validateMinLength((MinLength)value, diagnostics, context);
			case FormValidationPackage.MAX_LENGTH:
				return validateMaxLength((MaxLength)value, diagnostics, context);
			case FormValidationPackage.LENGTH:
				return validateLength((Length)value, diagnostics, context);
			case FormValidationPackage.MIN_NUMBER:
				return validateMinNumber((MinNumber)value, diagnostics, context);
			case FormValidationPackage.MIN_DATE:
				return validateMinDate((MinDate)value, diagnostics, context);
			case FormValidationPackage.MAX_NUMBER:
				return validateMaxNumber((MaxNumber)value, diagnostics, context);
			case FormValidationPackage.MAX_DATE:
				return validateMaxDate((MaxDate)value, diagnostics, context);
			case FormValidationPackage.ACCEPTABLE_VALUES_STRING:
				return validateAcceptableValuesString((AcceptableValuesString)value, diagnostics, context);
			case FormValidationPackage.ACCEPTABLE_VALUES_DATE:
				return validateAcceptableValuesDate((AcceptableValuesDate)value, diagnostics, context);
			case FormValidationPackage.STRING_PATTERN:
				return validateStringPattern((StringPattern)value, diagnostics, context);
			case FormValidationPackage.DATE_PATTERN:
				return validateDatePattern((DatePattern)value, diagnostics, context);
			case FormValidationPackage.CLASS_RULE:
				return validateClassRule((ClassRule)value, diagnostics, context);
			case FormValidationPackage.NOT_EQUALS:
				return validateNotEquals((NotEquals)value, diagnostics, context);
			case FormValidationPackage.GREATER_THAN:
				return validateGreaterThan((GreaterThan)value, diagnostics, context);
			case FormValidationPackage.EQUALS:
				return validateEquals((Equals)value, diagnostics, context);
			case FormValidationPackage.LESS_THAN:
				return validateLessThan((LessThan)value, diagnostics, context);
			case FormValidationPackage.ATTRIBUTE_ARRAY:
				return validateAttributeArray((AttributeArray)value, diagnostics, context);
			case FormValidationPackage.UI_COMPONENT:
				return validateUIComponent((UIComponent)value, diagnostics, context);
			case FormValidationPackage.NUMERIC_UI_COMPONENT:
				return validateNumericUIComponent((NumericUIComponent)value, diagnostics, context);
			case FormValidationPackage.ENUMERATION_UI_COMPONENT:
				return validateEnumerationUIComponent((EnumerationUIComponent)value, diagnostics, context);
			case FormValidationPackage.RADIO_BUTTON:
				return validateRadioButton((RadioButton)value, diagnostics, context);
			case FormValidationPackage.DROP_DOWN_LIST:
				return validateDropDownList((DropDownList)value, diagnostics, context);
			case FormValidationPackage.CHECK_BOX:
				return validateCheckBox((CheckBox)value, diagnostics, context);
			case FormValidationPackage.DATE_UI_COMPONENT:
				return validateDateUIComponent((DateUIComponent)value, diagnostics, context);
			case FormValidationPackage.TEXT_UI_COMPONENT:
				return validateTextUIComponent((TextUIComponent)value, diagnostics, context);
			case FormValidationPackage.TEXT_INPUT:
				return validateTextInput((TextInput)value, diagnostics, context);
			case FormValidationPackage.TEXT_AREA:
				return validateTextArea((TextArea)value, diagnostics, context);
			case FormValidationPackage.FORM_LAYOUT:
				return validateFormLayout((FormLayout)value, diagnostics, context);
			case FormValidationPackage.FIELD_SET:
				return validateFieldSet((FieldSet)value, diagnostics, context);
			case FormValidationPackage.TAB:
				return validateTab((Tab)value, diagnostics, context);
			case FormValidationPackage.GRID:
				return validateGrid((Grid)value, diagnostics, context);
			case FormValidationPackage.ATTRIBUTE_SETTINGS:
				return validateAttributeSettings((AttributeSettings)value, diagnostics, context);
			case FormValidationPackage.LABEL_SETTINGS:
				return validateLabelSettings((LabelSettings)value, diagnostics, context);
			case FormValidationPackage.ERROR_MESSAGE:
				return validateErrorMessage((ErrorMessage)value, diagnostics, context);
			case FormValidationPackage.TEL_INPUT:
				return validateTelInput((TelInput)value, diagnostics, context);
			case FormValidationPackage.EMAIL_INPUT:
				return validateEmailInput((EmailInput)value, diagnostics, context);
			case FormValidationPackage.PASSWORD:
				return validatePassword((Password)value, diagnostics, context);
			case FormValidationPackage.ADDITIONAL_SETTINGS:
				return validateAdditionalSettings((AdditionalSettings)value, diagnostics, context);
			case FormValidationPackage.FILE_INPUT:
				return validateFileInput((FileInput)value, diagnostics, context);
			case FormValidationPackage.ATTRIBUTE_DATA_TYPE:
				return validateAttributeDataType((AttributeDataType)value, diagnostics, context);
			case FormValidationPackage.PRIMITIVE_DATA_TYPE:
				return validatePrimitiveDataType((PrimitiveDataType)value, diagnostics, context);
			case FormValidationPackage.NON_PRIMITIVE_DATA_TYPE:
				return validateNonPrimitiveDataType((NonPrimitiveDataType)value, diagnostics, context);
			case FormValidationPackage.REF_ENTITY:
				return validateRefEntity((RefEntity)value, diagnostics, context);
			case FormValidationPackage.BUSINESS_MODEL:
				return validateBusinessModel((BusinessModel)value, diagnostics, context);
			case FormValidationPackage.ERROR_MESSAGE_SETTINGS:
				return validateErrorMessageSettings((ErrorMessageSettings)value, diagnostics, context);
			case FormValidationPackage.FORM_SETTINGS:
				return validateFormSettings((FormSettings)value, diagnostics, context);
			case FormValidationPackage.PAGINATION:
				return validatePagination((Pagination)value, diagnostics, context);
			case FormValidationPackage.TABLE_OVERVIEW:
				return validateTableOverview((TableOverview)value, diagnostics, context);
			case FormValidationPackage.OVERVIEW_SETTINGS:
				return validateOverviewSettings((OverviewSettings)value, diagnostics, context);
			case FormValidationPackage.NOTE_SETTINGS:
				return validateNoteSettings((NoteSettings)value, diagnostics, context);
			case FormValidationPackage.SELECTING_UI_COMPONENT:
				return validateSelectingUIComponent((SelectingUIComponent)value, diagnostics, context);
			case FormValidationPackage.LOAD_VALUES:
				return validateLoadValues((LoadValues)value, diagnostics, context);
			case FormValidationPackage.AUTOCOMPLETE_COMPONENT:
				return validateAutocompleteComponent((AutocompleteComponent)value, diagnostics, context);
			case FormValidationPackage.COLOR:
				return validateColor((Color)value, diagnostics, context);
			case FormValidationPackage.EDATA_TYPE:
				return validateEDataType((EDataType)value, diagnostics, context);
			case FormValidationPackage.EORIENTATION:
				return validateEOrientation((EOrientation)value, diagnostics, context);
			case FormValidationPackage.EREQUIRED_FIELD:
				return validateERequiredField((ERequiredField)value, diagnostics, context);
			case FormValidationPackage.EPOSITION:
				return validateEPosition((EPosition)value, diagnostics, context);
			case FormValidationPackage.EGRID_ORDER:
				return validateEGridOrder((EGridOrder)value, diagnostics, context);
			case FormValidationPackage.EUI_NUMBER_COMPONENT_TYPE:
				return validateEUINumberComponentType((EUINumberComponentType)value, diagnostics, context);
			case FormValidationPackage.EDATE_UI_TYPE:
				return validateEDateUIType((EDateUIType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValidationClass(ValidationClass validationClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(validationClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(validationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(validationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(validationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(validationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(validationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(validationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(validationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(validationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateValidationClass_differentClassAttributes(validationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateValidationClass_nameFormat(validationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateValidationClass_allLayoutsSameType(validationClass, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the differentClassAttributes constraint of '<em>Validation Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VALIDATION_CLASS__DIFFERENT_CLASS_ATTRIBUTES__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'All attributes should be different',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t classattribute-> forAll(a1: ClassAttribute, a2: ClassAttribute | \n" +
		"\t\t \tif a1<>a2 then a1.name <> a2.name else true endif\n" +
		"\t\t )\n" +
		"}.status";

	/**
	 * Validates the differentClassAttributes constraint of '<em>Validation Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValidationClass_differentClassAttributes(ValidationClass validationClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.VALIDATION_CLASS,
				 validationClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "differentClassAttributes",
				 VALIDATION_CLASS__DIFFERENT_CLASS_ATTRIBUTES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the nameFormat constraint of '<em>Validation Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VALIDATION_CLASS__NAME_FORMAT__EEXPRESSION = "name.matches('[a-z][a-zA-Z0-9.]*')";

	/**
	 * Validates the nameFormat constraint of '<em>Validation Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValidationClass_nameFormat(ValidationClass validationClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.VALIDATION_CLASS,
				 validationClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "nameFormat",
				 VALIDATION_CLASS__NAME_FORMAT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the allLayoutsSameType constraint of '<em>Validation Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VALIDATION_CLASS__ALL_LAYOUTS_SAME_TYPE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'At one level all attributes must be same type',\n" +
		"\tstatus : Boolean = \n" +
		"\t\tformlayout -> forAll(fL1: FormLayout, fL2: FormLayout | \n" +
		"\t\t\tif fL1.oclIsTypeOf(fL2.oclType()) then true else false endif )\n" +
		"}.status";

	/**
	 * Validates the allLayoutsSameType constraint of '<em>Validation Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValidationClass_allLayoutsSameType(ValidationClass validationClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.VALIDATION_CLASS,
				 validationClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "allLayoutsSameType",
				 VALIDATION_CLASS__ALL_LAYOUTS_SAME_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeRule(AttributeRule attributeRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeRule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassAttribute(ClassAttribute classAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(classAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(classAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(classAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(classAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(classAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(classAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(classAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(classAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(classAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassAttribute_appropriateAttributeRules(classAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassAttribute_compareMinMaxLength(classAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassAttribute_compareMinMaxNumber(classAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassAttribute_compareMinMaxDate(classAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassAttribute_nameFormat(classAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassAttribute_attributeRuleRequiredCanAppearJustOnce(classAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassAttribute_attributeRuleMinLengthCanAppearJustOnce(classAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassAttribute_attributeRuleMaxLengthCanAppearJustOnce(classAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassAttribute_attributeRuleLengthCanAppearJustOnce(classAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassAttribute_attributeRuleMinCanAppearJustOnce(classAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassAttribute_attributeRuleMaxCanAppearJustOnce(classAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassAttribute_attributeRuleAcceptableValuesCanAppearJustOnce(classAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassAttribute_attributeRulePatternCanAppearJustOnce(classAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassAttribute_collectionCannotBeMaster(classAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassAttribute_collectionCannotBeRepresenting(classAttribute, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appropriateAttributeRules constraint of '<em>Class Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS_ATTRIBUTE__APPROPRIATE_ATTRIBUTE_RULES__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Each data type has appropriate rulles that can be applay to it.',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t if attributetype.attributeDataType.oclIsKindOf(PrimitiveDataType) \n" +
		"\t\t \t  then if attributetype.attributeDataType.oclAsType(PrimitiveDataType).type = EDataType::Number\n" +
		"\t\t \t  \t    then attributerule-> forAll(a1: AttributeRule | a1.oclIsKindOf(MaxNumber) or a1.oclIsKindOf(MinNumber) or a1.oclIsKindOf(Required))\n" +
		"\t\t \t        else if attributetype.attributeDataType.oclAsType(PrimitiveDataType).type = EDataType::_'String'  \n" +
		"\t\t \t             then attributerule-> forAll(a1: AttributeRule | a1.oclIsKindOf(MinLength) or a1.oclIsKindOf(MaxLength) or\n" +
		"\t\t \t\t\t\t\ta1.oclIsKindOf(Length) or a1.oclIsKindOf(Required) or a1.oclIsKindOf(Pattern) or a1.oclIsKindOf(AcceptableValuesString))\n" +
		"\t\t \t\t\t\t  else attributerule-> forAll(a1: AttributeRule | a1.oclIsKindOf(MaxDate) or a1.oclIsKindOf(MinDate) or a1.oclIsKindOf(Required)\n" +
		"\t\t \t\t\t\t  or a1.oclIsKindOf(AcceptableValuesDate)or a1.oclIsKindOf(DatePattern))\n" +
		"\t\t                 endif\n" +
		"\t\t           endif\n" +
		"\t\telse attributerule-> forAll(a1: AttributeRule | a1.oclIsKindOf(Required))\n" +
		"\t\tendif\n" +
		"}.status";

	/**
	 * Validates the appropriateAttributeRules constraint of '<em>Class Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassAttribute_appropriateAttributeRules(ClassAttribute classAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.CLASS_ATTRIBUTE,
				 classAttribute,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "appropriateAttributeRules",
				 CLASS_ATTRIBUTE__APPROPRIATE_ATTRIBUTE_RULES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the compareMinMaxLength constraint of '<em>Class Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS_ATTRIBUTE__COMPARE_MIN_MAX_LENGTH__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Maxlength value should be greater than mainlength',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tattributerule-> forAll(a1: AttributeRule, a2: AttributeRule | \n" +
		"\t\t\tif a1.oclIsKindOf(MaxLength) and a2.oclIsKindOf(MinLength)\n" +
		"\t\t\tthen\n" +
		"\t\t\t\ta1.oclAsType(MaxLength).value >= a2.oclAsType(MinLength).value\n" +
		"\t\t\telse\n" +
		"\t\t\t\ttrue\n" +
		"\t\t\tendif\n" +
		"\t\t)\n" +
		"}.status";

	/**
	 * Validates the compareMinMaxLength constraint of '<em>Class Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassAttribute_compareMinMaxLength(ClassAttribute classAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.CLASS_ATTRIBUTE,
				 classAttribute,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "compareMinMaxLength",
				 CLASS_ATTRIBUTE__COMPARE_MIN_MAX_LENGTH__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the compareMinMaxNumber constraint of '<em>Class Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS_ATTRIBUTE__COMPARE_MIN_MAX_NUMBER__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Check if max value is greater then min value',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tattributerule-> forAll(a1: AttributeRule, a2: AttributeRule | \n" +
		"\t\t\tif a1.oclIsKindOf(MaxNumber) and a2.oclIsKindOf(MinNumber)\n" +
		"\t\t\tthen\n" +
		"\t\t\t\ta1.oclAsType(MaxNumber).value >= a2.oclAsType(MinNumber).value\n" +
		"\t\t\telse\n" +
		"\t\t\t\ttrue\n" +
		"\t\t\tendif\n" +
		"\t\t)\n" +
		"}.status";

	/**
	 * Validates the compareMinMaxNumber constraint of '<em>Class Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassAttribute_compareMinMaxNumber(ClassAttribute classAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.CLASS_ATTRIBUTE,
				 classAttribute,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "compareMinMaxNumber",
				 CLASS_ATTRIBUTE__COMPARE_MIN_MAX_NUMBER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the compareMinMaxDate constraint of '<em>Class Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS_ATTRIBUTE__COMPARE_MIN_MAX_DATE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Check id max date is greater then min date',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tattributerule-> forAll(a1: AttributeRule, a2: AttributeRule | \n" +
		"\t\t\tif a1.oclIsKindOf(MaxDate) and a2.oclIsKindOf(MinDate)\n" +
		"\t\t\tthen\n" +
		"\t\t\t\ta1.oclAsType(MaxDate).value >= a2.oclAsType(MinDate).value\n" +
		"\t\t\telse\n" +
		"\t\t\t\ttrue\n" +
		"\t\t\tendif\n" +
		"\t\t)\n" +
		"}.status";

	/**
	 * Validates the compareMinMaxDate constraint of '<em>Class Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassAttribute_compareMinMaxDate(ClassAttribute classAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.CLASS_ATTRIBUTE,
				 classAttribute,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "compareMinMaxDate",
				 CLASS_ATTRIBUTE__COMPARE_MIN_MAX_DATE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the nameFormat constraint of '<em>Class Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS_ATTRIBUTE__NAME_FORMAT__EEXPRESSION = "name.matches('[a-z][a-zA-Z]*')";

	/**
	 * Validates the nameFormat constraint of '<em>Class Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassAttribute_nameFormat(ClassAttribute classAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.CLASS_ATTRIBUTE,
				 classAttribute,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "nameFormat",
				 CLASS_ATTRIBUTE__NAME_FORMAT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the attributeRuleRequiredCanAppearJustOnce constraint of '<em>Class Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS_ATTRIBUTE__ATTRIBUTE_RULE_REQUIRED_CAN_APPEAR_JUST_ONCE__EEXPRESSION = "\n" +
		"\t\tattributerule -> select(aR| aR.oclIsKindOf(Required))->size() <=1";

	/**
	 * Validates the attributeRuleRequiredCanAppearJustOnce constraint of '<em>Class Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassAttribute_attributeRuleRequiredCanAppearJustOnce(ClassAttribute classAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.CLASS_ATTRIBUTE,
				 classAttribute,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "attributeRuleRequiredCanAppearJustOnce",
				 CLASS_ATTRIBUTE__ATTRIBUTE_RULE_REQUIRED_CAN_APPEAR_JUST_ONCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the attributeRuleMinLengthCanAppearJustOnce constraint of '<em>Class Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS_ATTRIBUTE__ATTRIBUTE_RULE_MIN_LENGTH_CAN_APPEAR_JUST_ONCE__EEXPRESSION = "\n" +
		"\t\tattributerule -> select(aR| aR.oclIsKindOf(MinLength))->size() <=1";

	/**
	 * Validates the attributeRuleMinLengthCanAppearJustOnce constraint of '<em>Class Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassAttribute_attributeRuleMinLengthCanAppearJustOnce(ClassAttribute classAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.CLASS_ATTRIBUTE,
				 classAttribute,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "attributeRuleMinLengthCanAppearJustOnce",
				 CLASS_ATTRIBUTE__ATTRIBUTE_RULE_MIN_LENGTH_CAN_APPEAR_JUST_ONCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the attributeRuleMaxLengthCanAppearJustOnce constraint of '<em>Class Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS_ATTRIBUTE__ATTRIBUTE_RULE_MAX_LENGTH_CAN_APPEAR_JUST_ONCE__EEXPRESSION = "\n" +
		"\t\tattributerule -> select(aR| aR.oclIsKindOf(MaxLength))->size() <=1";

	/**
	 * Validates the attributeRuleMaxLengthCanAppearJustOnce constraint of '<em>Class Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassAttribute_attributeRuleMaxLengthCanAppearJustOnce(ClassAttribute classAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.CLASS_ATTRIBUTE,
				 classAttribute,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "attributeRuleMaxLengthCanAppearJustOnce",
				 CLASS_ATTRIBUTE__ATTRIBUTE_RULE_MAX_LENGTH_CAN_APPEAR_JUST_ONCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the attributeRuleLengthCanAppearJustOnce constraint of '<em>Class Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS_ATTRIBUTE__ATTRIBUTE_RULE_LENGTH_CAN_APPEAR_JUST_ONCE__EEXPRESSION = "\n" +
		"\t\tattributerule -> select(aR| aR.oclIsKindOf(Length))->size() <=1";

	/**
	 * Validates the attributeRuleLengthCanAppearJustOnce constraint of '<em>Class Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassAttribute_attributeRuleLengthCanAppearJustOnce(ClassAttribute classAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.CLASS_ATTRIBUTE,
				 classAttribute,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "attributeRuleLengthCanAppearJustOnce",
				 CLASS_ATTRIBUTE__ATTRIBUTE_RULE_LENGTH_CAN_APPEAR_JUST_ONCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the attributeRuleMinCanAppearJustOnce constraint of '<em>Class Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS_ATTRIBUTE__ATTRIBUTE_RULE_MIN_CAN_APPEAR_JUST_ONCE__EEXPRESSION = "\n" +
		"\t\tattributerule -> select(aR| aR.oclIsKindOf(Min))->size() <=1";

	/**
	 * Validates the attributeRuleMinCanAppearJustOnce constraint of '<em>Class Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassAttribute_attributeRuleMinCanAppearJustOnce(ClassAttribute classAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.CLASS_ATTRIBUTE,
				 classAttribute,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "attributeRuleMinCanAppearJustOnce",
				 CLASS_ATTRIBUTE__ATTRIBUTE_RULE_MIN_CAN_APPEAR_JUST_ONCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the attributeRuleMaxCanAppearJustOnce constraint of '<em>Class Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS_ATTRIBUTE__ATTRIBUTE_RULE_MAX_CAN_APPEAR_JUST_ONCE__EEXPRESSION = "\n" +
		"\t\tattributerule -> select(aR| aR.oclIsKindOf(Max))->size() <=1";

	/**
	 * Validates the attributeRuleMaxCanAppearJustOnce constraint of '<em>Class Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassAttribute_attributeRuleMaxCanAppearJustOnce(ClassAttribute classAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.CLASS_ATTRIBUTE,
				 classAttribute,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "attributeRuleMaxCanAppearJustOnce",
				 CLASS_ATTRIBUTE__ATTRIBUTE_RULE_MAX_CAN_APPEAR_JUST_ONCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the attributeRuleAcceptableValuesCanAppearJustOnce constraint of '<em>Class Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS_ATTRIBUTE__ATTRIBUTE_RULE_ACCEPTABLE_VALUES_CAN_APPEAR_JUST_ONCE__EEXPRESSION = "\n" +
		"\t\tattributerule -> select(aR| aR.oclIsKindOf(AcceptableValues))->size() <=1";

	/**
	 * Validates the attributeRuleAcceptableValuesCanAppearJustOnce constraint of '<em>Class Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassAttribute_attributeRuleAcceptableValuesCanAppearJustOnce(ClassAttribute classAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.CLASS_ATTRIBUTE,
				 classAttribute,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "attributeRuleAcceptableValuesCanAppearJustOnce",
				 CLASS_ATTRIBUTE__ATTRIBUTE_RULE_ACCEPTABLE_VALUES_CAN_APPEAR_JUST_ONCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the attributeRulePatternCanAppearJustOnce constraint of '<em>Class Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS_ATTRIBUTE__ATTRIBUTE_RULE_PATTERN_CAN_APPEAR_JUST_ONCE__EEXPRESSION = "\n" +
		"\t\tattributerule -> select(aR| aR.oclIsKindOf(Pattern))->size() <=1";

	/**
	 * Validates the attributeRulePatternCanAppearJustOnce constraint of '<em>Class Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassAttribute_attributeRulePatternCanAppearJustOnce(ClassAttribute classAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.CLASS_ATTRIBUTE,
				 classAttribute,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "attributeRulePatternCanAppearJustOnce",
				 CLASS_ATTRIBUTE__ATTRIBUTE_RULE_PATTERN_CAN_APPEAR_JUST_ONCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the collectionCannotBeMaster constraint of '<em>Class Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS_ATTRIBUTE__COLLECTION_CANNOT_BE_MASTER__EEXPRESSION = "\n" +
		"\t\tif attributetype.attributeDataType.isCollection then master = false else true endif";

	/**
	 * Validates the collectionCannotBeMaster constraint of '<em>Class Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassAttribute_collectionCannotBeMaster(ClassAttribute classAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.CLASS_ATTRIBUTE,
				 classAttribute,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "collectionCannotBeMaster",
				 CLASS_ATTRIBUTE__COLLECTION_CANNOT_BE_MASTER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the collectionCannotBeRepresenting constraint of '<em>Class Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS_ATTRIBUTE__COLLECTION_CANNOT_BE_REPRESENTING__EEXPRESSION = "\n" +
		"\t\tif attributetype.attributeDataType.isCollection then isClassRepresenting = false else true endif";

	/**
	 * Validates the collectionCannotBeRepresenting constraint of '<em>Class Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassAttribute_collectionCannotBeRepresenting(ClassAttribute classAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.CLASS_ATTRIBUTE,
				 classAttribute,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "collectionCannotBeRepresenting",
				 CLASS_ATTRIBUTE__COLLECTION_CANNOT_BE_REPRESENTING__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeType(AttributeType attributeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMin(Min min, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(min, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMax(Max max, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(max, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequired(Required required, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(required, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcceptableValues(AcceptableValues acceptableValues, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(acceptableValues, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePattern(Pattern pattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pattern, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMinLength(MinLength minLength, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(minLength, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(minLength, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(minLength, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(minLength, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(minLength, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(minLength, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(minLength, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(minLength, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(minLength, diagnostics, context);
		if (result || diagnostics != null) result &= validateMinLength_minLengthValue(minLength, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the minLengthValue constraint of '<em>Min Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MIN_LENGTH__MIN_LENGTH_VALUE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'MaxLength cannot be less than zero',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tvalue > 0\n" +
		"}.status";

	/**
	 * Validates the minLengthValue constraint of '<em>Min Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMinLength_minLengthValue(MinLength minLength, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.MIN_LENGTH,
				 minLength,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "minLengthValue",
				 MIN_LENGTH__MIN_LENGTH_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaxLength(MaxLength maxLength, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(maxLength, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(maxLength, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(maxLength, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(maxLength, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(maxLength, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(maxLength, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(maxLength, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(maxLength, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(maxLength, diagnostics, context);
		if (result || diagnostics != null) result &= validateMaxLength_maxLengthValue(maxLength, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the maxLengthValue constraint of '<em>Max Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MAX_LENGTH__MAX_LENGTH_VALUE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'MaxLength cannot be less than zero',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tvalue > 0\n" +
		"}.status";

	/**
	 * Validates the maxLengthValue constraint of '<em>Max Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaxLength_maxLengthValue(MaxLength maxLength, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.MAX_LENGTH,
				 maxLength,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthValue",
				 MAX_LENGTH__MAX_LENGTH_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLength(Length length, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(length, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(length, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(length, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(length, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(length, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(length, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(length, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(length, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(length, diagnostics, context);
		if (result || diagnostics != null) result &= validateLength_lengthValue(length, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the lengthValue constraint of '<em>Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LENGTH__LENGTH_VALUE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'MaxLength cannot be less than zero',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tvalue > 0\n" +
		"}.status";

	/**
	 * Validates the lengthValue constraint of '<em>Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLength_lengthValue(Length length, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.LENGTH,
				 length,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "lengthValue",
				 LENGTH__LENGTH_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMinNumber(MinNumber minNumber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(minNumber, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMinDate(MinDate minDate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(minDate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaxNumber(MaxNumber maxNumber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(maxNumber, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaxDate(MaxDate maxDate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(maxDate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcceptableValuesString(AcceptableValuesString acceptableValuesString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(acceptableValuesString, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcceptableValuesDate(AcceptableValuesDate acceptableValuesDate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(acceptableValuesDate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringPattern(StringPattern stringPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringPattern, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatePattern(DatePattern datePattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(datePattern, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(datePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(datePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(datePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(datePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(datePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(datePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(datePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(datePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateDatePattern_structureOfRegex(datePattern, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the structureOfRegex constraint of '<em>Date Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATE_PATTERN__STRUCTURE_OF_REGEX__EEXPRESSION = "\n" +
		"\t\tvalue.matches('dd.MM.yyyy') or value.matches('dd.MMM.yyyy') or value.matches('dd-MMM-yyyy')\n" +
		"\t\tor value.matches('dd/MMM/yyyy') or value.matches('dd-MM-yyyy') or value.matches('dd/MM/yyyy')";

	/**
	 * Validates the structureOfRegex constraint of '<em>Date Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatePattern_structureOfRegex(DatePattern datePattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.DATE_PATTERN,
				 datePattern,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "structureOfRegex",
				 DATE_PATTERN__STRUCTURE_OF_REGEX__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassRule(ClassRule classRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classRule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotEquals(NotEquals notEquals, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(notEquals, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(notEquals, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(notEquals, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(notEquals, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(notEquals, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(notEquals, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(notEquals, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(notEquals, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(notEquals, diagnostics, context);
		if (result || diagnostics != null) result &= validateNotEquals_areEqualTypes(notEquals, diagnostics, context);
		if (result || diagnostics != null) result &= validateNotEquals_differentDataInArray(notEquals, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the areEqualTypes constraint of '<em>Not Equals</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NOT_EQUALS__ARE_EQUAL_TYPES__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'In notequal rule all data types should be same.',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t attributearray.attributes -> forAll(a1: ClassAttribute, a2: ClassAttribute |\n" +
		"\t\t if a1<>a2  then \n" +
		"\t\t\t if a1.attributetype.attributeDataType.oclIsKindOf(PrimitiveDataType) \n" +
		"\t\t\t and a2.attributetype.attributeDataType.oclIsKindOf(PrimitiveDataType) \n" +
		"\t\t\t then\n" +
		"\t\t\t a1.attributetype.attributeDataType.oclAsType(PrimitiveDataType).type = a2.attributetype.attributeDataType.oclAsType(PrimitiveDataType).type\n" +
		"\t\t\t else \n" +
		"\t\t\t a1.attributetype.attributeDataType.oclAsType(NonPrimitiveDataType).type.name = a2.attributetype.attributeDataType.oclAsType(NonPrimitiveDataType).type.name\n" +
		"\t\t\t endif\n" +
		"\t\t else true\n" +
		"\t\t endif\n" +
		"\t\t  )\n" +
		"}.status";

	/**
	 * Validates the areEqualTypes constraint of '<em>Not Equals</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotEquals_areEqualTypes(NotEquals notEquals, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.NOT_EQUALS,
				 notEquals,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "areEqualTypes",
				 NOT_EQUALS__ARE_EQUAL_TYPES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the differentDataInArray constraint of '<em>Not Equals</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NOT_EQUALS__DIFFERENT_DATA_IN_ARRAY__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'All attributes should be different',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t attributearray.attributes -> forAll(a1: ClassAttribute, a2: ClassAttribute |\n" +
		"\t\t \tif a1<>a2 then\n" +
		"\t\t \ta1.name <> a2.name\n" +
		"\t\t \telse true\n" +
		"\t\t \tendif\n" +
		"\t\t )\n" +
		"}.status";

	/**
	 * Validates the differentDataInArray constraint of '<em>Not Equals</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotEquals_differentDataInArray(NotEquals notEquals, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.NOT_EQUALS,
				 notEquals,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "differentDataInArray",
				 NOT_EQUALS__DIFFERENT_DATA_IN_ARRAY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGreaterThan(GreaterThan greaterThan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(greaterThan, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(greaterThan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(greaterThan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(greaterThan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(greaterThan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(greaterThan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(greaterThan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(greaterThan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(greaterThan, diagnostics, context);
		if (result || diagnostics != null) result &= validateGreaterThan_differentAttributes(greaterThan, diagnostics, context);
		if (result || diagnostics != null) result &= validateGreaterThan_differentAttributesInArray(greaterThan, diagnostics, context);
		if (result || diagnostics != null) result &= validateGreaterThan_areEqualTypes(greaterThan, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the differentAttributes constraint of '<em>Greater Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GREATER_THAN__DIFFERENT_ATTRIBUTES__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'First attribute and attributes from array should be different',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tattributearray.attributes -> forAll(a1: ClassAttribute | classattribute.name <> a1.name)\n" +
		"}.status";

	/**
	 * Validates the differentAttributes constraint of '<em>Greater Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGreaterThan_differentAttributes(GreaterThan greaterThan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.GREATER_THAN,
				 greaterThan,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "differentAttributes",
				 GREATER_THAN__DIFFERENT_ATTRIBUTES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the differentAttributesInArray constraint of '<em>Greater Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GREATER_THAN__DIFFERENT_ATTRIBUTES_IN_ARRAY__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Attributes in array must be different',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\t attributearray.attributes -> forAll(a1: ClassAttribute, a2: ClassAttribute | if a1<>a2 then\n" +
		"\t\t\t \ta1.name <> a2.name\n" +
		"\t\t\t \telse true\n" +
		"\t\t\t \tendif\n" +
		"\t\t\t )\n" +
		"}.status";

	/**
	 * Validates the differentAttributesInArray constraint of '<em>Greater Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGreaterThan_differentAttributesInArray(GreaterThan greaterThan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.GREATER_THAN,
				 greaterThan,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "differentAttributesInArray",
				 GREATER_THAN__DIFFERENT_ATTRIBUTES_IN_ARRAY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the areEqualTypes constraint of '<em>Greater Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GREATER_THAN__ARE_EQUAL_TYPES__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'In greater then rule all data types should be same.',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t attributearray.attributes -> forAll(a1: ClassAttribute, a2: ClassAttribute |\n" +
		"\t\t if a1<>a2  then \n" +
		"\t\t\t if a1.attributetype.attributeDataType.oclIsKindOf(PrimitiveDataType) \n" +
		"\t\t\t and a2.attributetype.attributeDataType.oclIsKindOf(PrimitiveDataType) \n" +
		"\t\t\t and classattribute.attributetype.attributeDataType.oclIsKindOf(PrimitiveDataType)\n" +
		"\t\t\t then\n" +
		"\t\t\t a1.attributetype.attributeDataType.oclAsType(PrimitiveDataType).type = a2.attributetype.attributeDataType.oclAsType(PrimitiveDataType).type\n" +
		"\t\t\t and classattribute.attributetype.attributeDataType.oclAsType(PrimitiveDataType).type = a1.attributetype.attributeDataType.oclAsType(PrimitiveDataType).type\n" +
		"\t\t\t else \n" +
		"\t\t\t a1.attributetype.attributeDataType.oclAsType(NonPrimitiveDataType).type.name = a2.attributetype.attributeDataType.oclAsType(NonPrimitiveDataType).type.name\n" +
		"\t\t\t and classattribute.attributetype.attributeDataType.oclAsType(NonPrimitiveDataType).type.name = a1.attributetype.attributeDataType.oclAsType(NonPrimitiveDataType).type.name\n" +
		"\t\t\t endif\n" +
		"\t\t else true\n" +
		"\t\t endif)\n" +
		"}.status";

	/**
	 * Validates the areEqualTypes constraint of '<em>Greater Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGreaterThan_areEqualTypes(GreaterThan greaterThan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.GREATER_THAN,
				 greaterThan,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "areEqualTypes",
				 GREATER_THAN__ARE_EQUAL_TYPES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquals(Equals equals, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(equals, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(equals, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(equals, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(equals, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(equals, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(equals, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(equals, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(equals, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(equals, diagnostics, context);
		if (result || diagnostics != null) result &= validateEquals_collectionSize(equals, diagnostics, context);
		if (result || diagnostics != null) result &= validateEquals_areEqualTypes(equals, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the collectionSize constraint of '<em>Equals</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EQUALS__COLLECTION_SIZE__EEXPRESSION = "\n" +
		"\t\t\tattributearray.attributes -> size() >= 2";

	/**
	 * Validates the collectionSize constraint of '<em>Equals</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquals_collectionSize(Equals equals, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.EQUALS,
				 equals,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "collectionSize",
				 EQUALS__COLLECTION_SIZE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the areEqualTypes constraint of '<em>Equals</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EQUALS__ARE_EQUAL_TYPES__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'In equal rule all data types should be same.',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t attributearray.attributes -> forAll(a1: ClassAttribute, a2: ClassAttribute |\n" +
		"\t\t if a1<>a2  then \n" +
		"\t\t\t if a1.attributetype.attributeDataType.oclIsKindOf(PrimitiveDataType) \n" +
		"\t\t\t and a2.attributetype.attributeDataType.oclIsKindOf(PrimitiveDataType) \n" +
		"\t\t\t then\n" +
		"\t\t\t a1.attributetype.attributeDataType.oclAsType(PrimitiveDataType).type = a2.attributetype.attributeDataType.oclAsType(PrimitiveDataType).type\n" +
		"\t\t\t else \n" +
		"\t\t\t  if (a1.attributetype.attributeDataType.oclIsKindOf(NonPrimitiveDataType) and a2.attributetype.attributeDataType.oclIsKindOf(PrimitiveDataType))\n" +
		"\t\t\t  or (a1.attributetype.attributeDataType.oclIsKindOf(PrimitiveDataType) and a2.attributetype.attributeDataType.oclIsKindOf(NonPrimitiveDataType))\n" +
		"\t\t\t  then false\n" +
		"\t\t\t  else\n" +
		"\t\t\t  a1.attributetype.attributeDataType.oclAsType(NonPrimitiveDataType).type.name = a2.attributetype.attributeDataType.oclAsType(NonPrimitiveDataType).type.name\n" +
		"\t\t\t  endif\n" +
		"\t\t\t endif\n" +
		"\t\t else true\n" +
		"\t\t endif\n" +
		"\t\t  )\n" +
		"}.status";

	/**
	 * Validates the areEqualTypes constraint of '<em>Equals</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquals_areEqualTypes(Equals equals, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.EQUALS,
				 equals,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "areEqualTypes",
				 EQUALS__ARE_EQUAL_TYPES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLessThan(LessThan lessThan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(lessThan, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(lessThan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(lessThan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(lessThan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(lessThan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(lessThan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(lessThan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(lessThan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(lessThan, diagnostics, context);
		if (result || diagnostics != null) result &= validateLessThan_acceptbleDataType(lessThan, diagnostics, context);
		if (result || diagnostics != null) result &= validateLessThan_areEqualTypes(lessThan, diagnostics, context);
		if (result || diagnostics != null) result &= validateLessThan_differentAttributes(lessThan, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the acceptbleDataType constraint of '<em>Less Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LESS_THAN__ACCEPTBLE_DATA_TYPE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'It is possible to compare just attibutes type of date or type of number.',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t  classattribute.attributetype.attributeDataType.oclAsType(PrimitiveDataType) = EDataType::Number \n" +
		"\t\t  or classattribute.attributetype.attributeDataType.oclAsType(PrimitiveDataType) = EDataType::Date\n" +
		"}.status";

	/**
	 * Validates the acceptbleDataType constraint of '<em>Less Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLessThan_acceptbleDataType(LessThan lessThan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.LESS_THAN,
				 lessThan,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "acceptbleDataType",
				 LESS_THAN__ACCEPTBLE_DATA_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the areEqualTypes constraint of '<em>Less Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LESS_THAN__ARE_EQUAL_TYPES__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'In less then rule all data types should be same.',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t attributearray.attributes -> forAll(a1: ClassAttribute, a2: ClassAttribute |\n" +
		"\t\t if a1<>a2  then \n" +
		"\t\t\t if a1.attributetype.attributeDataType.oclIsKindOf(PrimitiveDataType) \n" +
		"\t\t\t and a2.attributetype.attributeDataType.oclIsKindOf(PrimitiveDataType) \n" +
		"\t\t\t and classattribute.attributetype.attributeDataType.oclIsKindOf(PrimitiveDataType)\n" +
		"\t\t\t then\n" +
		"\t\t\t a1.attributetype.attributeDataType.oclAsType(PrimitiveDataType).type = a2.attributetype.attributeDataType.oclAsType(PrimitiveDataType).type\n" +
		"\t\t\t and classattribute.attributetype.attributeDataType.oclAsType(PrimitiveDataType).type = a1.attributetype.attributeDataType.oclAsType(PrimitiveDataType).type\n" +
		"\t\t\t else \n" +
		"\t\t\t a1.attributetype.attributeDataType.oclAsType(NonPrimitiveDataType).type.name = a2.attributetype.attributeDataType.oclAsType(NonPrimitiveDataType).type.name\n" +
		"\t\t\t and classattribute.attributetype.attributeDataType.oclAsType(NonPrimitiveDataType).type.name = a1.attributetype.attributeDataType.oclAsType(NonPrimitiveDataType).type.name\n" +
		"\t\t\t endif\n" +
		"\t\t else true\n" +
		"\t\t endif)\n" +
		"}.status";

	/**
	 * Validates the areEqualTypes constraint of '<em>Less Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLessThan_areEqualTypes(LessThan lessThan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.LESS_THAN,
				 lessThan,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "areEqualTypes",
				 LESS_THAN__ARE_EQUAL_TYPES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the differentAttributes constraint of '<em>Less Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LESS_THAN__DIFFERENT_ATTRIBUTES__EEXPRESSION = "\n" +
		"\t\t\tattributearray.attributes -> forAll(a1: ClassAttribute | classattribute.name <> a1.name)";

	/**
	 * Validates the differentAttributes constraint of '<em>Less Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLessThan_differentAttributes(LessThan lessThan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.LESS_THAN,
				 lessThan,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "differentAttributes",
				 LESS_THAN__DIFFERENT_ATTRIBUTES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeArray(AttributeArray attributeArray, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeArray, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributeArray, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributeArray, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributeArray, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributeArray, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributeArray, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributeArray, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributeArray, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributeArray, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttributeArray_containDifferentAttributes(attributeArray, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the containDifferentAttributes constraint of '<em>Attribute Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ATTRIBUTE_ARRAY__CONTAIN_DIFFERENT_ATTRIBUTES__EEXPRESSION = "\n" +
		"\t\tattributes -> forAll(a1: ClassAttribute, a2: ClassAttribute | \n" +
		"\t\t\tif a1 <> a2 \n" +
		"\t\t\tthen a1.name <> a2.name\n" +
		"\t\t\telse true \n" +
		"\t\t\tendif\n" +
		"\t\t)";

	/**
	 * Validates the containDifferentAttributes constraint of '<em>Attribute Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeArray_containDifferentAttributes(AttributeArray attributeArray, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.ATTRIBUTE_ARRAY,
				 attributeArray,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "containDifferentAttributes",
				 ATTRIBUTE_ARRAY__CONTAIN_DIFFERENT_ATTRIBUTES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUIComponent(UIComponent uiComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uiComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericUIComponent(NumericUIComponent numericUIComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numericUIComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationUIComponent(EnumerationUIComponent enumerationUIComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumerationUIComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRadioButton(RadioButton radioButton, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(radioButton, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDropDownList(DropDownList dropDownList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dropDownList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCheckBox(CheckBox checkBox, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(checkBox, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateUIComponent(DateUIComponent dateUIComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateUIComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextUIComponent(TextUIComponent textUIComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textUIComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextInput(TextInput textInput, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textInput, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextArea(TextArea textArea, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textArea, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormLayout(FormLayout formLayout, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(formLayout, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(formLayout, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(formLayout, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(formLayout, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(formLayout, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(formLayout, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(formLayout, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(formLayout, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(formLayout, diagnostics, context);
		if (result || diagnostics != null) result &= validateFormLayout_checkFormLayout(formLayout, diagnostics, context);
		if (result || diagnostics != null) result &= validateFormLayout_uniqueFormLayoutName(formLayout, diagnostics, context);
		if (result || diagnostics != null) result &= validateFormLayout_numOfAttributeArraysFieldSet(formLayout, diagnostics, context);
		if (result || diagnostics != null) result &= validateFormLayout_numOfAttributeArrayTab(formLayout, diagnostics, context);
		if (result || diagnostics != null) result &= validateFormLayout_nameFormat(formLayout, diagnostics, context);
		if (result || diagnostics != null) result &= validateFormLayout_allLayoutsOnOneLevelMustBeSameType(formLayout, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the checkFormLayout constraint of '<em>Form Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FORM_LAYOUT__CHECK_FORM_LAYOUT__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Attribute could appear only in one layout',\n" +
		"\tstatus : Boolean = \n" +
		"\t\tFormLayout.allInstances()->forAll(fL1: FormLayout, fL2: FormLayout |  \n" +
		"\t\t\tif fL1 <> fL2 and fL1.attributearray <> null and fL2.attributearray <> null\n" +
		"\t\t\tthen\n" +
		"\t\t\tfL1.attributearray.attributes.oclAsSet() -> intersection(fL2.attributearray.attributes.oclAsSet())->isEmpty()\n" +
		"\t\t\telse true\n" +
		"\t\t\tendif\n" +
		"\t\t)\n" +
		"}.status";

	/**
	 * Validates the checkFormLayout constraint of '<em>Form Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormLayout_checkFormLayout(FormLayout formLayout, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.FORM_LAYOUT,
				 formLayout,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "checkFormLayout",
				 FORM_LAYOUT__CHECK_FORM_LAYOUT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the uniqueFormLayoutName constraint of '<em>Form Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FORM_LAYOUT__UNIQUE_FORM_LAYOUT_NAME__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Layout name should be unique',\n" +
		"\tstatus : Boolean = \n" +
		"\t\tFormLayout.allInstances()->forAll(fL1: FormLayout, fL2: FormLayout |  if fL1 <> fL2 then\n" +
		"\t\t\tfL1.name <> fL2.name\n" +
		"\t\t\telse true\n" +
		"\t\t\tendif\n" +
		"\t\t)\n" +
		"}.status";

	/**
	 * Validates the uniqueFormLayoutName constraint of '<em>Form Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormLayout_uniqueFormLayoutName(FormLayout formLayout, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.FORM_LAYOUT,
				 formLayout,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueFormLayoutName",
				 FORM_LAYOUT__UNIQUE_FORM_LAYOUT_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the numOfAttributeArraysFieldSet constraint of '<em>Form Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FORM_LAYOUT__NUM_OF_ATTRIBUTE_ARRAYS_FIELD_SET__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Number of attribute arrays is not appropriate.',\n" +
		"\tstatus : Boolean = \n" +
		"\t\tFormLayout.allInstances()->forAll(fL1: FormLayout |\n" +
		"\t\t\tif fL1.oclIsKindOf(FieldSet) then fL1.attributearray->size() <= 1 else true\n" +
		"\t\t\tendif\n" +
		"\t\t)\n" +
		"}.status";

	/**
	 * Validates the numOfAttributeArraysFieldSet constraint of '<em>Form Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormLayout_numOfAttributeArraysFieldSet(FormLayout formLayout, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.FORM_LAYOUT,
				 formLayout,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "numOfAttributeArraysFieldSet",
				 FORM_LAYOUT__NUM_OF_ATTRIBUTE_ARRAYS_FIELD_SET__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the numOfAttributeArrayTab constraint of '<em>Form Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FORM_LAYOUT__NUM_OF_ATTRIBUTE_ARRAY_TAB__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Number of attribute arrays is not appropriate.',\n" +
		"\tstatus : Boolean = \n" +
		"\t\tFormLayout.allInstances()->forAll(fL1: FormLayout |\n" +
		"\t\t\tif fL1.oclIsKindOf(Tab) then fL1.attributearray->size() <= 1 else true\n" +
		"\t\t\tendif\n" +
		"\t\t)\n" +
		"}.status";

	/**
	 * Validates the numOfAttributeArrayTab constraint of '<em>Form Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormLayout_numOfAttributeArrayTab(FormLayout formLayout, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.FORM_LAYOUT,
				 formLayout,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "numOfAttributeArrayTab",
				 FORM_LAYOUT__NUM_OF_ATTRIBUTE_ARRAY_TAB__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the nameFormat constraint of '<em>Form Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FORM_LAYOUT__NAME_FORMAT__EEXPRESSION = "name.matches('[a-z][a-zA-Z0-9.]*')";

	/**
	 * Validates the nameFormat constraint of '<em>Form Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormLayout_nameFormat(FormLayout formLayout, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.FORM_LAYOUT,
				 formLayout,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "nameFormat",
				 FORM_LAYOUT__NAME_FORMAT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the allLayoutsOnOneLevelMustBeSameType constraint of '<em>Form Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FORM_LAYOUT__ALL_LAYOUTS_ON_ONE_LEVEL_MUST_BE_SAME_TYPE__EEXPRESSION = "\n" +
		"\t\tlayouts -> forAll(fL1: FormLayout, fL2: FormLayout |\n" +
		"\t\t\tif fL1.oclIsTypeOf(fL2.oclType()) then true else false endif\n" +
		"\t\t)";

	/**
	 * Validates the allLayoutsOnOneLevelMustBeSameType constraint of '<em>Form Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormLayout_allLayoutsOnOneLevelMustBeSameType(FormLayout formLayout, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.FORM_LAYOUT,
				 formLayout,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "allLayoutsOnOneLevelMustBeSameType",
				 FORM_LAYOUT__ALL_LAYOUTS_ON_ONE_LEVEL_MUST_BE_SAME_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFieldSet(FieldSet fieldSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(fieldSet, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(fieldSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fieldSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fieldSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(fieldSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(fieldSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(fieldSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(fieldSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fieldSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateFormLayout_checkFormLayout(fieldSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateFormLayout_uniqueFormLayoutName(fieldSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateFormLayout_numOfAttributeArraysFieldSet(fieldSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateFormLayout_numOfAttributeArrayTab(fieldSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateFormLayout_nameFormat(fieldSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateFormLayout_allLayoutsOnOneLevelMustBeSameType(fieldSet, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTab(Tab tab, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tab, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tab, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tab, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tab, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tab, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tab, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tab, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tab, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tab, diagnostics, context);
		if (result || diagnostics != null) result &= validateFormLayout_checkFormLayout(tab, diagnostics, context);
		if (result || diagnostics != null) result &= validateFormLayout_uniqueFormLayoutName(tab, diagnostics, context);
		if (result || diagnostics != null) result &= validateFormLayout_numOfAttributeArraysFieldSet(tab, diagnostics, context);
		if (result || diagnostics != null) result &= validateFormLayout_numOfAttributeArrayTab(tab, diagnostics, context);
		if (result || diagnostics != null) result &= validateFormLayout_nameFormat(tab, diagnostics, context);
		if (result || diagnostics != null) result &= validateFormLayout_allLayoutsOnOneLevelMustBeSameType(tab, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGrid(Grid grid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(grid, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(grid, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(grid, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(grid, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(grid, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(grid, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(grid, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(grid, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(grid, diagnostics, context);
		if (result || diagnostics != null) result &= validateFormLayout_checkFormLayout(grid, diagnostics, context);
		if (result || diagnostics != null) result &= validateFormLayout_uniqueFormLayoutName(grid, diagnostics, context);
		if (result || diagnostics != null) result &= validateFormLayout_numOfAttributeArraysFieldSet(grid, diagnostics, context);
		if (result || diagnostics != null) result &= validateFormLayout_numOfAttributeArrayTab(grid, diagnostics, context);
		if (result || diagnostics != null) result &= validateFormLayout_nameFormat(grid, diagnostics, context);
		if (result || diagnostics != null) result &= validateFormLayout_allLayoutsOnOneLevelMustBeSameType(grid, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeSettings(AttributeSettings attributeSettings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeSettings, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabelSettings(LabelSettings labelSettings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(labelSettings, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateErrorMessage(ErrorMessage errorMessage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(errorMessage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTelInput(TelInput telInput, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(telInput, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmailInput(EmailInput emailInput, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(emailInput, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePassword(Password password, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(password, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalSettings(AdditionalSettings additionalSettings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(additionalSettings, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileInput(FileInput fileInput, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fileInput, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType(AttributeDataType attributeDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimitiveDataType(PrimitiveDataType primitiveDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(primitiveDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonPrimitiveDataType(NonPrimitiveDataType nonPrimitiveDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nonPrimitiveDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefEntity(RefEntity refEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(refEntity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBusinessModel(BusinessModel businessModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(businessModel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(businessModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(businessModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(businessModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(businessModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(businessModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(businessModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(businessModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(businessModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateBusinessModel_uniqueClassName(businessModel, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the uniqueClassName constraint of '<em>Business Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BUSINESS_MODEL__UNIQUE_CLASS_NAME__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = '',\n" +
		"\tstatus : Boolean = \n" +
		"\t\tvalidationclasses -> forAll(vC1: ValidationClass, vC2: ValidationClass | if vC1 <> vC2 then\n" +
		"\t\t\t vC1.name <> vC2.name else true endif)\n" +
		"}.status";

	/**
	 * Validates the uniqueClassName constraint of '<em>Business Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBusinessModel_uniqueClassName(BusinessModel businessModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.BUSINESS_MODEL,
				 businessModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueClassName",
				 BUSINESS_MODEL__UNIQUE_CLASS_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateErrorMessageSettings(ErrorMessageSettings errorMessageSettings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(errorMessageSettings, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormSettings(FormSettings formSettings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(formSettings, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePagination(Pagination pagination, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pagination, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTableOverview(TableOverview tableOverview, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tableOverview, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOverviewSettings(OverviewSettings overviewSettings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(overviewSettings, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoteSettings(NoteSettings noteSettings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(noteSettings, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectingUIComponent(SelectingUIComponent selectingUIComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(selectingUIComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadValues(LoadValues loadValues, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loadValues, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAutocompleteComponent(AutocompleteComponent autocompleteComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(autocompleteComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColor(Color color, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(color, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(color, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(color, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(color, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(color, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(color, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(color, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(color, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(color, diagnostics, context);
		if (result || diagnostics != null) result &= validateColor_RedComponentRange(color, diagnostics, context);
		if (result || diagnostics != null) result &= validateColor_GreenComponetRange(color, diagnostics, context);
		if (result || diagnostics != null) result &= validateColor_BlueComponetRange(color, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the RedComponentRange constraint of '<em>Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COLOR__RED_COMPONENT_RANGE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Red componet is out of range[0,255].',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t (red <= 255 and red >= 0)\n" +
		"}.status";

	/**
	 * Validates the RedComponentRange constraint of '<em>Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColor_RedComponentRange(Color color, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.COLOR,
				 color,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "RedComponentRange",
				 COLOR__RED_COMPONENT_RANGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the GreenComponetRange constraint of '<em>Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COLOR__GREEN_COMPONET_RANGE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Green componet is out of range[0,255].',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t(green <= 255 and green >=0)\n" +
		"}.status";

	/**
	 * Validates the GreenComponetRange constraint of '<em>Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColor_GreenComponetRange(Color color, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.COLOR,
				 color,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "GreenComponetRange",
				 COLOR__GREEN_COMPONET_RANGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the BlueComponetRange constraint of '<em>Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COLOR__BLUE_COMPONET_RANGE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Blue componet is out of range[0,255].',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t(blue <= 255 and blue >=0)\n" +
		"}.status";

	/**
	 * Validates the BlueComponetRange constraint of '<em>Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColor_BlueComponetRange(Color color, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.COLOR,
				 color,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "BlueComponetRange",
				 COLOR__BLUE_COMPONET_RANGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEDataType(EDataType eDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEOrientation(EOrientation eOrientation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateERequiredField(ERequiredField eRequiredField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEPosition(EPosition ePosition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEGridOrder(EGridOrder eGridOrder, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEUINumberComponentType(EUINumberComponentType euiNumberComponentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEDateUIType(EDateUIType eDateUIType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //FormValidationValidator
