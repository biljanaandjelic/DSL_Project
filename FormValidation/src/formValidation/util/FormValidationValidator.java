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
			case FormValidationPackage.EMAIL:
				return validateEmail((Email)value, diagnostics, context);
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
			case FormValidationPackage.EVRSTA:
				return validateEVrsta((EVrsta)value, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateClassAttribute_uniqueAttributeRules(classAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassAttribute_appropriateAttributeRules(classAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassAttribute_comparedMinMax(classAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassAttribute_compareMinMaxLength(classAttribute, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the uniqueAttributeRules constraint of '<em>Class Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS_ATTRIBUTE__UNIQUE_ATTRIBUTE_RULES__EEXPRESSION = "\n" +
		"\t\t\t attributerule->forAll(a1: AttributeRule, a2: AttributeRule |if  a1 <> a2 then\n" +
		"\t\t\t \tnot a1.oclIsTypeOf(a2.oclType()) else true endif\n" +
		"\t\t\t )";

	/**
	 * Validates the uniqueAttributeRules constraint of '<em>Class Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassAttribute_uniqueAttributeRules(ClassAttribute classAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.CLASS_ATTRIBUTE,
				 classAttribute,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueAttributeRules",
				 CLASS_ATTRIBUTE__UNIQUE_ATTRIBUTE_RULES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
		"\t\tif attributetype.vrsta = EVrsta::Number\n" +
		"\t\tthen\n" +
		"\t\t\tattributerule-> forAll(a1: AttributeRule | a1.oclIsKindOf(MaxNumber) or a1.oclIsKindOf(MinNumber) or a1.oclIsKindOf(Required))\n" +
		"\t\telse\n" +
		"\t\t  if attributetype.vrsta = EVrsta::_'String'\n" +
		"\t\t  then\n" +
		"\t\t   attributerule-> forAll(a1: AttributeRule | a1.oclIsKindOf(MinLength) or a1.oclIsKindOf(MaxLength) or \n" +
		"\t\t   \ta1.oclIsKindOf(Length) or a1.oclIsKindOf(Required) or a1.oclIsKindOf(Pattern) or a1.oclIsKindOf(AcceptableValuesString)\n" +
		"\t\t   \tor a1.oclIsKindOf(Email)\n" +
		"\t\t   )\n" +
		"\t\t  else\n" +
		"\t\t  attributerule-> forAll(a1: AttributeRule | a1.oclIsKindOf(MaxDate) or a1.oclIsKindOf(MinDate) or a1.oclIsKindOf(Required) \n" +
		"\t\t  or a1.oclIsKindOf(AcceptableValuesDate)or a1.oclIsKindOf(DatePattern))\n" +
		"\t\t  endif\n" +
		"\t\tendif\n" +
		"\t\t\n" +
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
	 * The cached validation expression for the comparedMinMax constraint of '<em>Class Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS_ATTRIBUTE__COMPARED_MIN_MAX__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Max value should be greater than min value',\n" +
		"\tstatus : Boolean = \n" +
		"\t\tattributerule-> forAll(a1: AttributeRule, a2: AttributeRule | \n" +
		"\t\t\tif a1.oclIsKindOf(MaxNumber) and a2.oclIsKindOf(MinNumber)\n" +
		"\t\t\tthen\n" +
		"\t\t\t\ta1.oclAsType(MaxNumber).value >= a2.oclAsType(MinNumber).value \n" +
		"\t\t\telse\n" +
		"\t\t\t\ttrue\n" +
		"\t\t\tendif\n" +
		"\t\t)\n" +
		"}.status";

	/**
	 * Validates the comparedMinMax constraint of '<em>Class Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassAttribute_comparedMinMax(ClassAttribute classAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.CLASS_ATTRIBUTE,
				 classAttribute,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "comparedMinMax",
				 CLASS_ATTRIBUTE__COMPARED_MIN_MAX__EEXPRESSION,
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
		"\tmessage : String = 'Maxlength value should be greater than maxlength',\n" +
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
	public boolean validateEmail(Email email, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(email, diagnostics, context);
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
		"\tmessage : String = 'In equal rule all data types should be same.',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tattributearray.classattribute -> forAll(a1: ClassAttribute, a2: ClassAttribute | \n" +
		"\t\t\t\tif a1<>a2 then \n" +
		"\t\t\t\ta1.attributetype.vrsta = a2.attributetype.vrsta\n" +
		"\t\t\t\telse true\n" +
		"\t\t\t\tendif\n" +
		"\t\t\t)\n" +
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
		"\t\t attributearray.classattribute -> forAll(a1: ClassAttribute, a2: ClassAttribute |\n" +
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
		if (result || diagnostics != null) result &= validateGreaterThan_acceptbleDataType(greaterThan, diagnostics, context);
		if (result || diagnostics != null) result &= validateGreaterThan_differentAttributes(greaterThan, diagnostics, context);
		if (result || diagnostics != null) result &= validateGreaterThan_differentAttributesInArray(greaterThan, diagnostics, context);
		if (result || diagnostics != null) result &= validateGreaterThan_equalTypes(greaterThan, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the acceptbleDataType constraint of '<em>Greater Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GREATER_THAN__ACCEPTBLE_DATA_TYPE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'It is possible to compare just attibutes type of date or type of number.',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tclassattribute.attributetype.vrsta = EVrsta::Number or classattribute.attributetype.vrsta = EVrsta::Date\n" +
		"}.status";

	/**
	 * Validates the acceptbleDataType constraint of '<em>Greater Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGreaterThan_acceptbleDataType(GreaterThan greaterThan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.GREATER_THAN,
				 greaterThan,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "acceptbleDataType",
				 GREATER_THAN__ACCEPTBLE_DATA_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
		"\t\t\tattributearray.classattribute -> forAll(a1: ClassAttribute | classattribute.name <> a1.name)\n" +
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
		"\t\t\t attributearray.classattribute -> forAll(a1: ClassAttribute, a2: ClassAttribute | if a1<>a2 then\n" +
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
	 * The cached validation expression for the equalTypes constraint of '<em>Greater Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GREATER_THAN__EQUAL_TYPES__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Data type should be same',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tattributearray.classattribute -> forAll(a1: ClassAttribute | a1.attributetype.vrsta = classattribute.attributetype.vrsta)\n" +
		"}.status";

	/**
	 * Validates the equalTypes constraint of '<em>Greater Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGreaterThan_equalTypes(GreaterThan greaterThan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.GREATER_THAN,
				 greaterThan,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "equalTypes",
				 GREATER_THAN__EQUAL_TYPES__EEXPRESSION,
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
		"\t\t\tattributearray.classattribute -> size() >= 2";

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
		"\t\t\tattributearray.classattribute -> forAll(a1: ClassAttribute, a2: ClassAttribute | a1.attributetype.vrsta = a2.attributetype.vrsta)\n" +
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
		if (result || diagnostics != null) result &= validateLessThan_differentAttributes(lessThan, diagnostics, context);
		if (result || diagnostics != null) result &= validateLessThan_equalTypes(lessThan, diagnostics, context);
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
		"\t\t\tclassattribute.attributetype.vrsta = EVrsta::Number or classattribute.attributetype.vrsta = EVrsta::Date\n" +
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
	 * The cached validation expression for the differentAttributes constraint of '<em>Less Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LESS_THAN__DIFFERENT_ATTRIBUTES__EEXPRESSION = "\n" +
		"\t\t\tattributearray.classattribute -> forAll(a1: ClassAttribute | classattribute.name <> a1.name)";

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
	 * The cached validation expression for the equalTypes constraint of '<em>Less Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LESS_THAN__EQUAL_TYPES__EEXPRESSION = "\n" +
		"\t\t\tattributearray.classattribute -> forAll(a1: ClassAttribute | a1.attributetype.vrsta = classattribute.attributetype.vrsta)";

	/**
	 * Validates the equalTypes constraint of '<em>Less Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLessThan_equalTypes(LessThan lessThan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormValidationPackage.Literals.LESS_THAN,
				 lessThan,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "equalTypes",
				 LESS_THAN__EQUAL_TYPES__EEXPRESSION,
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
		return validate_EveryDefaultConstraint(attributeArray, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEVrsta(EVrsta eVrsta, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
