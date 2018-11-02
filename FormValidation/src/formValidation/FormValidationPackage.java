/**
 */
package formValidation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see formValidation.FormValidationFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore' ecore.xml.type='http://www.eclipse.org/emf/2003/XMLType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface FormValidationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "formValidation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/formValidation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "formValidation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FormValidationPackage eINSTANCE = formValidation.impl.FormValidationPackageImpl.init();

	/**
	 * The meta object id for the '{@link formValidation.impl.ValidationClassImpl <em>Validation Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.ValidationClassImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getValidationClass()
	 * @generated
	 */
	int VALIDATION_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_CLASS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Classattribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_CLASS__CLASSATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Classrule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_CLASS__CLASSRULE = 2;

	/**
	 * The number of structural features of the '<em>Validation Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_CLASS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Validation Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.AttributeRuleImpl <em>Attribute Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.AttributeRuleImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getAttributeRule()
	 * @generated
	 */
	int ATTRIBUTE_RULE = 1;

	/**
	 * The number of structural features of the '<em>Attribute Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RULE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Attribute Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.ClassAttributeImpl <em>Class Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.ClassAttributeImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getClassAttribute()
	 * @generated
	 */
	int CLASS_ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Attributetype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ATTRIBUTE__ATTRIBUTETYPE = 1;

	/**
	 * The feature id for the '<em><b>Attributerule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ATTRIBUTE__ATTRIBUTERULE = 2;

	/**
	 * The number of structural features of the '<em>Class Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ATTRIBUTE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Class Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.AttributeTypeImpl <em>Attribute Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.AttributeTypeImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getAttributeType()
	 * @generated
	 */
	int ATTRIBUTE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Vrsta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE__VRSTA = 0;

	/**
	 * The number of structural features of the '<em>Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.MinImpl <em>Min</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.MinImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getMin()
	 * @generated
	 */
	int MIN = 4;

	/**
	 * The number of structural features of the '<em>Min</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_FEATURE_COUNT = ATTRIBUTE_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Min</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_OPERATION_COUNT = ATTRIBUTE_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.MaxImpl <em>Max</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.MaxImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getMax()
	 * @generated
	 */
	int MAX = 5;

	/**
	 * The number of structural features of the '<em>Max</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_FEATURE_COUNT = ATTRIBUTE_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Max</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_OPERATION_COUNT = ATTRIBUTE_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.RequiredImpl <em>Required</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.RequiredImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getRequired()
	 * @generated
	 */
	int REQUIRED = 6;

	/**
	 * The feature id for the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED__IS_REQUIRED = ATTRIBUTE_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Required</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_FEATURE_COUNT = ATTRIBUTE_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Required</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_OPERATION_COUNT = ATTRIBUTE_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.EmailImpl <em>Email</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.EmailImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getEmail()
	 * @generated
	 */
	int EMAIL = 7;

	/**
	 * The feature id for the '<em><b>Is Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__IS_EMAIL = ATTRIBUTE_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Email</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_FEATURE_COUNT = ATTRIBUTE_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Email</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_OPERATION_COUNT = ATTRIBUTE_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.AcceptableValuesImpl <em>Acceptable Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.AcceptableValuesImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getAcceptableValues()
	 * @generated
	 */
	int ACCEPTABLE_VALUES = 8;

	/**
	 * The number of structural features of the '<em>Acceptable Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTABLE_VALUES_FEATURE_COUNT = ATTRIBUTE_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Acceptable Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTABLE_VALUES_OPERATION_COUNT = ATTRIBUTE_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.PatternImpl <em>Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.PatternImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getPattern()
	 * @generated
	 */
	int PATTERN = 9;

	/**
	 * The number of structural features of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FEATURE_COUNT = ATTRIBUTE_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPERATION_COUNT = ATTRIBUTE_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.MinLengthImpl <em>Min Length</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.MinLengthImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getMinLength()
	 * @generated
	 */
	int MIN_LENGTH = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_LENGTH__VALUE = ATTRIBUTE_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Min Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_LENGTH_FEATURE_COUNT = ATTRIBUTE_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Min Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_LENGTH_OPERATION_COUNT = ATTRIBUTE_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.MaxLengthImpl <em>Max Length</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.MaxLengthImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getMaxLength()
	 * @generated
	 */
	int MAX_LENGTH = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_LENGTH__VALUE = ATTRIBUTE_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Max Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_LENGTH_FEATURE_COUNT = ATTRIBUTE_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Max Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_LENGTH_OPERATION_COUNT = ATTRIBUTE_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.LengthImpl <em>Length</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.LengthImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getLength()
	 * @generated
	 */
	int LENGTH = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH__VALUE = ATTRIBUTE_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_FEATURE_COUNT = ATTRIBUTE_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_OPERATION_COUNT = ATTRIBUTE_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.MinNumberImpl <em>Min Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.MinNumberImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getMinNumber()
	 * @generated
	 */
	int MIN_NUMBER = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_NUMBER__VALUE = MIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Min Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_NUMBER_FEATURE_COUNT = MIN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Min Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_NUMBER_OPERATION_COUNT = MIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.MinDateImpl <em>Min Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.MinDateImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getMinDate()
	 * @generated
	 */
	int MIN_DATE = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_DATE__VALUE = MIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Min Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_DATE_FEATURE_COUNT = MIN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Min Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_DATE_OPERATION_COUNT = MIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.MaxNumberImpl <em>Max Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.MaxNumberImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getMaxNumber()
	 * @generated
	 */
	int MAX_NUMBER = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_NUMBER__VALUE = MAX_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Max Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_NUMBER_FEATURE_COUNT = MAX_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Max Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_NUMBER_OPERATION_COUNT = MAX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.MaxDateImpl <em>Max Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.MaxDateImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getMaxDate()
	 * @generated
	 */
	int MAX_DATE = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_DATE__VALUE = MAX_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Max Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_DATE_FEATURE_COUNT = MAX_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Max Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_DATE_OPERATION_COUNT = MAX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.AcceptableValuesStringImpl <em>Acceptable Values String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.AcceptableValuesStringImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getAcceptableValuesString()
	 * @generated
	 */
	int ACCEPTABLE_VALUES_STRING = 17;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTABLE_VALUES_STRING__VALUES = ACCEPTABLE_VALUES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Acceptable Values String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTABLE_VALUES_STRING_FEATURE_COUNT = ACCEPTABLE_VALUES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Acceptable Values String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTABLE_VALUES_STRING_OPERATION_COUNT = ACCEPTABLE_VALUES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.AcceptableValuesDateImpl <em>Acceptable Values Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.AcceptableValuesDateImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getAcceptableValuesDate()
	 * @generated
	 */
	int ACCEPTABLE_VALUES_DATE = 18;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTABLE_VALUES_DATE__VALUES = ACCEPTABLE_VALUES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Acceptable Values Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTABLE_VALUES_DATE_FEATURE_COUNT = ACCEPTABLE_VALUES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Acceptable Values Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTABLE_VALUES_DATE_OPERATION_COUNT = ACCEPTABLE_VALUES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.StringPatternImpl <em>String Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.StringPatternImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getStringPattern()
	 * @generated
	 */
	int STRING_PATTERN = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PATTERN__VALUE = PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PATTERN_FEATURE_COUNT = PATTERN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PATTERN_OPERATION_COUNT = PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.DatePatternImpl <em>Date Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.DatePatternImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getDatePattern()
	 * @generated
	 */
	int DATE_PATTERN = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PATTERN__VALUE = PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PATTERN_FEATURE_COUNT = PATTERN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Date Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PATTERN_OPERATION_COUNT = PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.ClassRuleImpl <em>Class Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.ClassRuleImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getClassRule()
	 * @generated
	 */
	int CLASS_RULE = 21;

	/**
	 * The number of structural features of the '<em>Class Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_RULE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Class Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.NotEqualsImpl <em>Not Equals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.NotEqualsImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getNotEquals()
	 * @generated
	 */
	int NOT_EQUALS = 22;

	/**
	 * The feature id for the '<em><b>Attributearray</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUALS__ATTRIBUTEARRAY = CLASS_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUALS_FEATURE_COUNT = CLASS_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Not Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUALS_OPERATION_COUNT = CLASS_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.GreaterThanImpl <em>Greater Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.GreaterThanImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getGreaterThan()
	 * @generated
	 */
	int GREATER_THAN = 23;

	/**
	 * The feature id for the '<em><b>Classattribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__CLASSATTRIBUTE = CLASS_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributearray</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__ATTRIBUTEARRAY = CLASS_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Greater Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_FEATURE_COUNT = CLASS_RULE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Greater Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OPERATION_COUNT = CLASS_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.EqualsImpl <em>Equals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.EqualsImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getEquals()
	 * @generated
	 */
	int EQUALS = 24;

	/**
	 * The feature id for the '<em><b>Attributearray</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS__ATTRIBUTEARRAY = CLASS_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_FEATURE_COUNT = CLASS_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_OPERATION_COUNT = CLASS_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.LessThanImpl <em>Less Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.LessThanImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getLessThan()
	 * @generated
	 */
	int LESS_THAN = 25;

	/**
	 * The feature id for the '<em><b>Classattribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__CLASSATTRIBUTE = CLASS_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributearray</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__ATTRIBUTEARRAY = CLASS_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Less Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_FEATURE_COUNT = CLASS_RULE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Less Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OPERATION_COUNT = CLASS_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.AttributeArrayImpl <em>Attribute Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.AttributeArrayImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getAttributeArray()
	 * @generated
	 */
	int ATTRIBUTE_ARRAY = 26;

	/**
	 * The feature id for the '<em><b>Classattribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ARRAY__CLASSATTRIBUTE = 0;

	/**
	 * The number of structural features of the '<em>Attribute Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ARRAY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Attribute Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ARRAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link formValidation.EVrsta <em>EVrsta</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.EVrsta
	 * @see formValidation.impl.FormValidationPackageImpl#getEVrsta()
	 * @generated
	 */
	int EVRSTA = 27;


	/**
	 * Returns the meta object for class '{@link formValidation.ValidationClass <em>Validation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validation Class</em>'.
	 * @see formValidation.ValidationClass
	 * @generated
	 */
	EClass getValidationClass();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.ValidationClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see formValidation.ValidationClass#getName()
	 * @see #getValidationClass()
	 * @generated
	 */
	EAttribute getValidationClass_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link formValidation.ValidationClass#getClassattribute <em>Classattribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classattribute</em>'.
	 * @see formValidation.ValidationClass#getClassattribute()
	 * @see #getValidationClass()
	 * @generated
	 */
	EReference getValidationClass_Classattribute();

	/**
	 * Returns the meta object for the containment reference list '{@link formValidation.ValidationClass#getClassrule <em>Classrule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classrule</em>'.
	 * @see formValidation.ValidationClass#getClassrule()
	 * @see #getValidationClass()
	 * @generated
	 */
	EReference getValidationClass_Classrule();

	/**
	 * Returns the meta object for class '{@link formValidation.AttributeRule <em>Attribute Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Rule</em>'.
	 * @see formValidation.AttributeRule
	 * @generated
	 */
	EClass getAttributeRule();

	/**
	 * Returns the meta object for class '{@link formValidation.ClassAttribute <em>Class Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Attribute</em>'.
	 * @see formValidation.ClassAttribute
	 * @generated
	 */
	EClass getClassAttribute();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.ClassAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see formValidation.ClassAttribute#getName()
	 * @see #getClassAttribute()
	 * @generated
	 */
	EAttribute getClassAttribute_Name();

	/**
	 * Returns the meta object for the containment reference '{@link formValidation.ClassAttribute#getAttributetype <em>Attributetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attributetype</em>'.
	 * @see formValidation.ClassAttribute#getAttributetype()
	 * @see #getClassAttribute()
	 * @generated
	 */
	EReference getClassAttribute_Attributetype();

	/**
	 * Returns the meta object for the containment reference list '{@link formValidation.ClassAttribute#getAttributerule <em>Attributerule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributerule</em>'.
	 * @see formValidation.ClassAttribute#getAttributerule()
	 * @see #getClassAttribute()
	 * @generated
	 */
	EReference getClassAttribute_Attributerule();

	/**
	 * Returns the meta object for class '{@link formValidation.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Type</em>'.
	 * @see formValidation.AttributeType
	 * @generated
	 */
	EClass getAttributeType();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.AttributeType#getVrsta <em>Vrsta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vrsta</em>'.
	 * @see formValidation.AttributeType#getVrsta()
	 * @see #getAttributeType()
	 * @generated
	 */
	EAttribute getAttributeType_Vrsta();

	/**
	 * Returns the meta object for class '{@link formValidation.Min <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min</em>'.
	 * @see formValidation.Min
	 * @generated
	 */
	EClass getMin();

	/**
	 * Returns the meta object for class '{@link formValidation.Max <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max</em>'.
	 * @see formValidation.Max
	 * @generated
	 */
	EClass getMax();

	/**
	 * Returns the meta object for class '{@link formValidation.Required <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required</em>'.
	 * @see formValidation.Required
	 * @generated
	 */
	EClass getRequired();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.Required#isIsRequired <em>Is Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Required</em>'.
	 * @see formValidation.Required#isIsRequired()
	 * @see #getRequired()
	 * @generated
	 */
	EAttribute getRequired_IsRequired();

	/**
	 * Returns the meta object for class '{@link formValidation.Email <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Email</em>'.
	 * @see formValidation.Email
	 * @generated
	 */
	EClass getEmail();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.Email#isIsEmail <em>Is Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Email</em>'.
	 * @see formValidation.Email#isIsEmail()
	 * @see #getEmail()
	 * @generated
	 */
	EAttribute getEmail_IsEmail();

	/**
	 * Returns the meta object for class '{@link formValidation.AcceptableValues <em>Acceptable Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acceptable Values</em>'.
	 * @see formValidation.AcceptableValues
	 * @generated
	 */
	EClass getAcceptableValues();

	/**
	 * Returns the meta object for class '{@link formValidation.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern</em>'.
	 * @see formValidation.Pattern
	 * @generated
	 */
	EClass getPattern();

	/**
	 * Returns the meta object for class '{@link formValidation.MinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min Length</em>'.
	 * @see formValidation.MinLength
	 * @generated
	 */
	EClass getMinLength();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.MinLength#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see formValidation.MinLength#getValue()
	 * @see #getMinLength()
	 * @generated
	 */
	EAttribute getMinLength_Value();

	/**
	 * Returns the meta object for class '{@link formValidation.MaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Length</em>'.
	 * @see formValidation.MaxLength
	 * @generated
	 */
	EClass getMaxLength();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.MaxLength#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see formValidation.MaxLength#getValue()
	 * @see #getMaxLength()
	 * @generated
	 */
	EAttribute getMaxLength_Value();

	/**
	 * Returns the meta object for class '{@link formValidation.Length <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length</em>'.
	 * @see formValidation.Length
	 * @generated
	 */
	EClass getLength();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.Length#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see formValidation.Length#getValue()
	 * @see #getLength()
	 * @generated
	 */
	EAttribute getLength_Value();

	/**
	 * Returns the meta object for class '{@link formValidation.MinNumber <em>Min Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min Number</em>'.
	 * @see formValidation.MinNumber
	 * @generated
	 */
	EClass getMinNumber();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.MinNumber#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see formValidation.MinNumber#getValue()
	 * @see #getMinNumber()
	 * @generated
	 */
	EAttribute getMinNumber_Value();

	/**
	 * Returns the meta object for class '{@link formValidation.MinDate <em>Min Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min Date</em>'.
	 * @see formValidation.MinDate
	 * @generated
	 */
	EClass getMinDate();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.MinDate#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see formValidation.MinDate#getValue()
	 * @see #getMinDate()
	 * @generated
	 */
	EAttribute getMinDate_Value();

	/**
	 * Returns the meta object for class '{@link formValidation.MaxNumber <em>Max Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Number</em>'.
	 * @see formValidation.MaxNumber
	 * @generated
	 */
	EClass getMaxNumber();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.MaxNumber#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see formValidation.MaxNumber#getValue()
	 * @see #getMaxNumber()
	 * @generated
	 */
	EAttribute getMaxNumber_Value();

	/**
	 * Returns the meta object for class '{@link formValidation.MaxDate <em>Max Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Date</em>'.
	 * @see formValidation.MaxDate
	 * @generated
	 */
	EClass getMaxDate();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.MaxDate#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see formValidation.MaxDate#getValue()
	 * @see #getMaxDate()
	 * @generated
	 */
	EAttribute getMaxDate_Value();

	/**
	 * Returns the meta object for class '{@link formValidation.AcceptableValuesString <em>Acceptable Values String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acceptable Values String</em>'.
	 * @see formValidation.AcceptableValuesString
	 * @generated
	 */
	EClass getAcceptableValuesString();

	/**
	 * Returns the meta object for the attribute list '{@link formValidation.AcceptableValuesString#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see formValidation.AcceptableValuesString#getValues()
	 * @see #getAcceptableValuesString()
	 * @generated
	 */
	EAttribute getAcceptableValuesString_Values();

	/**
	 * Returns the meta object for class '{@link formValidation.AcceptableValuesDate <em>Acceptable Values Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acceptable Values Date</em>'.
	 * @see formValidation.AcceptableValuesDate
	 * @generated
	 */
	EClass getAcceptableValuesDate();

	/**
	 * Returns the meta object for the attribute list '{@link formValidation.AcceptableValuesDate#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see formValidation.AcceptableValuesDate#getValues()
	 * @see #getAcceptableValuesDate()
	 * @generated
	 */
	EAttribute getAcceptableValuesDate_Values();

	/**
	 * Returns the meta object for class '{@link formValidation.StringPattern <em>String Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Pattern</em>'.
	 * @see formValidation.StringPattern
	 * @generated
	 */
	EClass getStringPattern();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.StringPattern#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see formValidation.StringPattern#getValue()
	 * @see #getStringPattern()
	 * @generated
	 */
	EAttribute getStringPattern_Value();

	/**
	 * Returns the meta object for class '{@link formValidation.DatePattern <em>Date Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Pattern</em>'.
	 * @see formValidation.DatePattern
	 * @generated
	 */
	EClass getDatePattern();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.DatePattern#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see formValidation.DatePattern#getValue()
	 * @see #getDatePattern()
	 * @generated
	 */
	EAttribute getDatePattern_Value();

	/**
	 * Returns the meta object for class '{@link formValidation.ClassRule <em>Class Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Rule</em>'.
	 * @see formValidation.ClassRule
	 * @generated
	 */
	EClass getClassRule();

	/**
	 * Returns the meta object for class '{@link formValidation.NotEquals <em>Not Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Equals</em>'.
	 * @see formValidation.NotEquals
	 * @generated
	 */
	EClass getNotEquals();

	/**
	 * Returns the meta object for the containment reference '{@link formValidation.NotEquals#getAttributearray <em>Attributearray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attributearray</em>'.
	 * @see formValidation.NotEquals#getAttributearray()
	 * @see #getNotEquals()
	 * @generated
	 */
	EReference getNotEquals_Attributearray();

	/**
	 * Returns the meta object for class '{@link formValidation.GreaterThan <em>Greater Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Than</em>'.
	 * @see formValidation.GreaterThan
	 * @generated
	 */
	EClass getGreaterThan();

	/**
	 * Returns the meta object for the reference '{@link formValidation.GreaterThan#getClassattribute <em>Classattribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classattribute</em>'.
	 * @see formValidation.GreaterThan#getClassattribute()
	 * @see #getGreaterThan()
	 * @generated
	 */
	EReference getGreaterThan_Classattribute();

	/**
	 * Returns the meta object for the containment reference list '{@link formValidation.GreaterThan#getAttributearray <em>Attributearray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributearray</em>'.
	 * @see formValidation.GreaterThan#getAttributearray()
	 * @see #getGreaterThan()
	 * @generated
	 */
	EReference getGreaterThan_Attributearray();

	/**
	 * Returns the meta object for class '{@link formValidation.Equals <em>Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equals</em>'.
	 * @see formValidation.Equals
	 * @generated
	 */
	EClass getEquals();

	/**
	 * Returns the meta object for the containment reference '{@link formValidation.Equals#getAttributearray <em>Attributearray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attributearray</em>'.
	 * @see formValidation.Equals#getAttributearray()
	 * @see #getEquals()
	 * @generated
	 */
	EReference getEquals_Attributearray();

	/**
	 * Returns the meta object for class '{@link formValidation.LessThan <em>Less Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Than</em>'.
	 * @see formValidation.LessThan
	 * @generated
	 */
	EClass getLessThan();

	/**
	 * Returns the meta object for the reference '{@link formValidation.LessThan#getClassattribute <em>Classattribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classattribute</em>'.
	 * @see formValidation.LessThan#getClassattribute()
	 * @see #getLessThan()
	 * @generated
	 */
	EReference getLessThan_Classattribute();

	/**
	 * Returns the meta object for the containment reference list '{@link formValidation.LessThan#getAttributearray <em>Attributearray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributearray</em>'.
	 * @see formValidation.LessThan#getAttributearray()
	 * @see #getLessThan()
	 * @generated
	 */
	EReference getLessThan_Attributearray();

	/**
	 * Returns the meta object for class '{@link formValidation.AttributeArray <em>Attribute Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Array</em>'.
	 * @see formValidation.AttributeArray
	 * @generated
	 */
	EClass getAttributeArray();

	/**
	 * Returns the meta object for the reference list '{@link formValidation.AttributeArray#getClassattribute <em>Classattribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Classattribute</em>'.
	 * @see formValidation.AttributeArray#getClassattribute()
	 * @see #getAttributeArray()
	 * @generated
	 */
	EReference getAttributeArray_Classattribute();

	/**
	 * Returns the meta object for enum '{@link formValidation.EVrsta <em>EVrsta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EVrsta</em>'.
	 * @see formValidation.EVrsta
	 * @generated
	 */
	EEnum getEVrsta();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FormValidationFactory getFormValidationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link formValidation.impl.ValidationClassImpl <em>Validation Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.ValidationClassImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getValidationClass()
		 * @generated
		 */
		EClass VALIDATION_CLASS = eINSTANCE.getValidationClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_CLASS__NAME = eINSTANCE.getValidationClass_Name();

		/**
		 * The meta object literal for the '<em><b>Classattribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATION_CLASS__CLASSATTRIBUTE = eINSTANCE.getValidationClass_Classattribute();

		/**
		 * The meta object literal for the '<em><b>Classrule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATION_CLASS__CLASSRULE = eINSTANCE.getValidationClass_Classrule();

		/**
		 * The meta object literal for the '{@link formValidation.impl.AttributeRuleImpl <em>Attribute Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.AttributeRuleImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getAttributeRule()
		 * @generated
		 */
		EClass ATTRIBUTE_RULE = eINSTANCE.getAttributeRule();

		/**
		 * The meta object literal for the '{@link formValidation.impl.ClassAttributeImpl <em>Class Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.ClassAttributeImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getClassAttribute()
		 * @generated
		 */
		EClass CLASS_ATTRIBUTE = eINSTANCE.getClassAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_ATTRIBUTE__NAME = eINSTANCE.getClassAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Attributetype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_ATTRIBUTE__ATTRIBUTETYPE = eINSTANCE.getClassAttribute_Attributetype();

		/**
		 * The meta object literal for the '<em><b>Attributerule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_ATTRIBUTE__ATTRIBUTERULE = eINSTANCE.getClassAttribute_Attributerule();

		/**
		 * The meta object literal for the '{@link formValidation.impl.AttributeTypeImpl <em>Attribute Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.AttributeTypeImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getAttributeType()
		 * @generated
		 */
		EClass ATTRIBUTE_TYPE = eINSTANCE.getAttributeType();

		/**
		 * The meta object literal for the '<em><b>Vrsta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TYPE__VRSTA = eINSTANCE.getAttributeType_Vrsta();

		/**
		 * The meta object literal for the '{@link formValidation.impl.MinImpl <em>Min</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.MinImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getMin()
		 * @generated
		 */
		EClass MIN = eINSTANCE.getMin();

		/**
		 * The meta object literal for the '{@link formValidation.impl.MaxImpl <em>Max</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.MaxImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getMax()
		 * @generated
		 */
		EClass MAX = eINSTANCE.getMax();

		/**
		 * The meta object literal for the '{@link formValidation.impl.RequiredImpl <em>Required</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.RequiredImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getRequired()
		 * @generated
		 */
		EClass REQUIRED = eINSTANCE.getRequired();

		/**
		 * The meta object literal for the '<em><b>Is Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED__IS_REQUIRED = eINSTANCE.getRequired_IsRequired();

		/**
		 * The meta object literal for the '{@link formValidation.impl.EmailImpl <em>Email</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.EmailImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getEmail()
		 * @generated
		 */
		EClass EMAIL = eINSTANCE.getEmail();

		/**
		 * The meta object literal for the '<em><b>Is Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL__IS_EMAIL = eINSTANCE.getEmail_IsEmail();

		/**
		 * The meta object literal for the '{@link formValidation.impl.AcceptableValuesImpl <em>Acceptable Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.AcceptableValuesImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getAcceptableValues()
		 * @generated
		 */
		EClass ACCEPTABLE_VALUES = eINSTANCE.getAcceptableValues();

		/**
		 * The meta object literal for the '{@link formValidation.impl.PatternImpl <em>Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.PatternImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getPattern()
		 * @generated
		 */
		EClass PATTERN = eINSTANCE.getPattern();

		/**
		 * The meta object literal for the '{@link formValidation.impl.MinLengthImpl <em>Min Length</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.MinLengthImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getMinLength()
		 * @generated
		 */
		EClass MIN_LENGTH = eINSTANCE.getMinLength();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIN_LENGTH__VALUE = eINSTANCE.getMinLength_Value();

		/**
		 * The meta object literal for the '{@link formValidation.impl.MaxLengthImpl <em>Max Length</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.MaxLengthImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getMaxLength()
		 * @generated
		 */
		EClass MAX_LENGTH = eINSTANCE.getMaxLength();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAX_LENGTH__VALUE = eINSTANCE.getMaxLength_Value();

		/**
		 * The meta object literal for the '{@link formValidation.impl.LengthImpl <em>Length</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.LengthImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getLength()
		 * @generated
		 */
		EClass LENGTH = eINSTANCE.getLength();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LENGTH__VALUE = eINSTANCE.getLength_Value();

		/**
		 * The meta object literal for the '{@link formValidation.impl.MinNumberImpl <em>Min Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.MinNumberImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getMinNumber()
		 * @generated
		 */
		EClass MIN_NUMBER = eINSTANCE.getMinNumber();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIN_NUMBER__VALUE = eINSTANCE.getMinNumber_Value();

		/**
		 * The meta object literal for the '{@link formValidation.impl.MinDateImpl <em>Min Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.MinDateImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getMinDate()
		 * @generated
		 */
		EClass MIN_DATE = eINSTANCE.getMinDate();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIN_DATE__VALUE = eINSTANCE.getMinDate_Value();

		/**
		 * The meta object literal for the '{@link formValidation.impl.MaxNumberImpl <em>Max Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.MaxNumberImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getMaxNumber()
		 * @generated
		 */
		EClass MAX_NUMBER = eINSTANCE.getMaxNumber();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAX_NUMBER__VALUE = eINSTANCE.getMaxNumber_Value();

		/**
		 * The meta object literal for the '{@link formValidation.impl.MaxDateImpl <em>Max Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.MaxDateImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getMaxDate()
		 * @generated
		 */
		EClass MAX_DATE = eINSTANCE.getMaxDate();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAX_DATE__VALUE = eINSTANCE.getMaxDate_Value();

		/**
		 * The meta object literal for the '{@link formValidation.impl.AcceptableValuesStringImpl <em>Acceptable Values String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.AcceptableValuesStringImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getAcceptableValuesString()
		 * @generated
		 */
		EClass ACCEPTABLE_VALUES_STRING = eINSTANCE.getAcceptableValuesString();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCEPTABLE_VALUES_STRING__VALUES = eINSTANCE.getAcceptableValuesString_Values();

		/**
		 * The meta object literal for the '{@link formValidation.impl.AcceptableValuesDateImpl <em>Acceptable Values Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.AcceptableValuesDateImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getAcceptableValuesDate()
		 * @generated
		 */
		EClass ACCEPTABLE_VALUES_DATE = eINSTANCE.getAcceptableValuesDate();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCEPTABLE_VALUES_DATE__VALUES = eINSTANCE.getAcceptableValuesDate_Values();

		/**
		 * The meta object literal for the '{@link formValidation.impl.StringPatternImpl <em>String Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.StringPatternImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getStringPattern()
		 * @generated
		 */
		EClass STRING_PATTERN = eINSTANCE.getStringPattern();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_PATTERN__VALUE = eINSTANCE.getStringPattern_Value();

		/**
		 * The meta object literal for the '{@link formValidation.impl.DatePatternImpl <em>Date Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.DatePatternImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getDatePattern()
		 * @generated
		 */
		EClass DATE_PATTERN = eINSTANCE.getDatePattern();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_PATTERN__VALUE = eINSTANCE.getDatePattern_Value();

		/**
		 * The meta object literal for the '{@link formValidation.impl.ClassRuleImpl <em>Class Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.ClassRuleImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getClassRule()
		 * @generated
		 */
		EClass CLASS_RULE = eINSTANCE.getClassRule();

		/**
		 * The meta object literal for the '{@link formValidation.impl.NotEqualsImpl <em>Not Equals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.NotEqualsImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getNotEquals()
		 * @generated
		 */
		EClass NOT_EQUALS = eINSTANCE.getNotEquals();

		/**
		 * The meta object literal for the '<em><b>Attributearray</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_EQUALS__ATTRIBUTEARRAY = eINSTANCE.getNotEquals_Attributearray();

		/**
		 * The meta object literal for the '{@link formValidation.impl.GreaterThanImpl <em>Greater Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.GreaterThanImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getGreaterThan()
		 * @generated
		 */
		EClass GREATER_THAN = eINSTANCE.getGreaterThan();

		/**
		 * The meta object literal for the '<em><b>Classattribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GREATER_THAN__CLASSATTRIBUTE = eINSTANCE.getGreaterThan_Classattribute();

		/**
		 * The meta object literal for the '<em><b>Attributearray</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GREATER_THAN__ATTRIBUTEARRAY = eINSTANCE.getGreaterThan_Attributearray();

		/**
		 * The meta object literal for the '{@link formValidation.impl.EqualsImpl <em>Equals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.EqualsImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getEquals()
		 * @generated
		 */
		EClass EQUALS = eINSTANCE.getEquals();

		/**
		 * The meta object literal for the '<em><b>Attributearray</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUALS__ATTRIBUTEARRAY = eINSTANCE.getEquals_Attributearray();

		/**
		 * The meta object literal for the '{@link formValidation.impl.LessThanImpl <em>Less Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.LessThanImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getLessThan()
		 * @generated
		 */
		EClass LESS_THAN = eINSTANCE.getLessThan();

		/**
		 * The meta object literal for the '<em><b>Classattribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LESS_THAN__CLASSATTRIBUTE = eINSTANCE.getLessThan_Classattribute();

		/**
		 * The meta object literal for the '<em><b>Attributearray</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LESS_THAN__ATTRIBUTEARRAY = eINSTANCE.getLessThan_Attributearray();

		/**
		 * The meta object literal for the '{@link formValidation.impl.AttributeArrayImpl <em>Attribute Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.AttributeArrayImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getAttributeArray()
		 * @generated
		 */
		EClass ATTRIBUTE_ARRAY = eINSTANCE.getAttributeArray();

		/**
		 * The meta object literal for the '<em><b>Classattribute</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_ARRAY__CLASSATTRIBUTE = eINSTANCE.getAttributeArray_Classattribute();

		/**
		 * The meta object literal for the '{@link formValidation.EVrsta <em>EVrsta</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.EVrsta
		 * @see formValidation.impl.FormValidationPackageImpl#getEVrsta()
		 * @generated
		 */
		EEnum EVRSTA = eINSTANCE.getEVrsta();

	}

} //FormValidationPackage
