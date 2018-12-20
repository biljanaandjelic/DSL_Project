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
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_CLASS__LABEL = 3;

	/**
	 * The feature id for the '<em><b>Formlayout</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_CLASS__FORMLAYOUT = 4;

	/**
	 * The feature id for the '<em><b>Additional Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_CLASS__ADDITIONAL_SETTINGS = 5;

	/**
	 * The feature id for the '<em><b>Overviewsettings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_CLASS__OVERVIEWSETTINGS = 6;

	/**
	 * The number of structural features of the '<em>Validation Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_CLASS_FEATURE_COUNT = 7;

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
	 * The feature id for the '<em><b>Attribute Rule Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RULE__ATTRIBUTE_RULE_ERROR_MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Attribute Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RULE_FEATURE_COUNT = 1;

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
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ATTRIBUTE__LABEL = 3;

	/**
	 * The feature id for the '<em><b>Master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ATTRIBUTE__MASTER = 4;

	/**
	 * The feature id for the '<em><b>Is Class Representing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ATTRIBUTE__IS_CLASS_REPRESENTING = 5;

	/**
	 * The number of structural features of the '<em>Class Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ATTRIBUTE_FEATURE_COUNT = 6;

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
	 * The feature id for the '<em><b>Ui Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE__UI_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Attribute Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE__ATTRIBUTE_DATA_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_FEATURE_COUNT = 2;

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
	 * The feature id for the '<em><b>Attribute Rule Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN__ATTRIBUTE_RULE_ERROR_MESSAGE = ATTRIBUTE_RULE__ATTRIBUTE_RULE_ERROR_MESSAGE;

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
	 * The feature id for the '<em><b>Attribute Rule Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX__ATTRIBUTE_RULE_ERROR_MESSAGE = ATTRIBUTE_RULE__ATTRIBUTE_RULE_ERROR_MESSAGE;

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
	 * The feature id for the '<em><b>Attribute Rule Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED__ATTRIBUTE_RULE_ERROR_MESSAGE = ATTRIBUTE_RULE__ATTRIBUTE_RULE_ERROR_MESSAGE;

	/**
	 * The number of structural features of the '<em>Required</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_FEATURE_COUNT = ATTRIBUTE_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Required</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_OPERATION_COUNT = ATTRIBUTE_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.AcceptableValuesImpl <em>Acceptable Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.AcceptableValuesImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getAcceptableValues()
	 * @generated
	 */
	int ACCEPTABLE_VALUES = 7;

	/**
	 * The feature id for the '<em><b>Attribute Rule Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTABLE_VALUES__ATTRIBUTE_RULE_ERROR_MESSAGE = ATTRIBUTE_RULE__ATTRIBUTE_RULE_ERROR_MESSAGE;

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
	int PATTERN = 8;

	/**
	 * The feature id for the '<em><b>Attribute Rule Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__ATTRIBUTE_RULE_ERROR_MESSAGE = ATTRIBUTE_RULE__ATTRIBUTE_RULE_ERROR_MESSAGE;

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
	int MIN_LENGTH = 9;

	/**
	 * The feature id for the '<em><b>Attribute Rule Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_LENGTH__ATTRIBUTE_RULE_ERROR_MESSAGE = ATTRIBUTE_RULE__ATTRIBUTE_RULE_ERROR_MESSAGE;

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
	int MAX_LENGTH = 10;

	/**
	 * The feature id for the '<em><b>Attribute Rule Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_LENGTH__ATTRIBUTE_RULE_ERROR_MESSAGE = ATTRIBUTE_RULE__ATTRIBUTE_RULE_ERROR_MESSAGE;

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
	int LENGTH = 11;

	/**
	 * The feature id for the '<em><b>Attribute Rule Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH__ATTRIBUTE_RULE_ERROR_MESSAGE = ATTRIBUTE_RULE__ATTRIBUTE_RULE_ERROR_MESSAGE;

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
	int MIN_NUMBER = 12;

	/**
	 * The feature id for the '<em><b>Attribute Rule Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_NUMBER__ATTRIBUTE_RULE_ERROR_MESSAGE = MIN__ATTRIBUTE_RULE_ERROR_MESSAGE;

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
	int MIN_DATE = 13;

	/**
	 * The feature id for the '<em><b>Attribute Rule Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_DATE__ATTRIBUTE_RULE_ERROR_MESSAGE = MIN__ATTRIBUTE_RULE_ERROR_MESSAGE;

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
	int MAX_NUMBER = 14;

	/**
	 * The feature id for the '<em><b>Attribute Rule Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_NUMBER__ATTRIBUTE_RULE_ERROR_MESSAGE = MAX__ATTRIBUTE_RULE_ERROR_MESSAGE;

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
	int MAX_DATE = 15;

	/**
	 * The feature id for the '<em><b>Attribute Rule Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_DATE__ATTRIBUTE_RULE_ERROR_MESSAGE = MAX__ATTRIBUTE_RULE_ERROR_MESSAGE;

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
	int ACCEPTABLE_VALUES_STRING = 16;

	/**
	 * The feature id for the '<em><b>Attribute Rule Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTABLE_VALUES_STRING__ATTRIBUTE_RULE_ERROR_MESSAGE = ACCEPTABLE_VALUES__ATTRIBUTE_RULE_ERROR_MESSAGE;

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
	int ACCEPTABLE_VALUES_DATE = 17;

	/**
	 * The feature id for the '<em><b>Attribute Rule Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTABLE_VALUES_DATE__ATTRIBUTE_RULE_ERROR_MESSAGE = ACCEPTABLE_VALUES__ATTRIBUTE_RULE_ERROR_MESSAGE;

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
	int STRING_PATTERN = 18;

	/**
	 * The feature id for the '<em><b>Attribute Rule Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PATTERN__ATTRIBUTE_RULE_ERROR_MESSAGE = PATTERN__ATTRIBUTE_RULE_ERROR_MESSAGE;

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
	int DATE_PATTERN = 19;

	/**
	 * The feature id for the '<em><b>Attribute Rule Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PATTERN__ATTRIBUTE_RULE_ERROR_MESSAGE = PATTERN__ATTRIBUTE_RULE_ERROR_MESSAGE;

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
	int CLASS_RULE = 20;

	/**
	 * The feature id for the '<em><b>Class Rule Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_RULE__CLASS_RULE_ERROR_MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Class Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_RULE_FEATURE_COUNT = 1;

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
	int NOT_EQUALS = 21;

	/**
	 * The feature id for the '<em><b>Class Rule Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUALS__CLASS_RULE_ERROR_MESSAGE = CLASS_RULE__CLASS_RULE_ERROR_MESSAGE;

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
	int GREATER_THAN = 22;

	/**
	 * The feature id for the '<em><b>Class Rule Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__CLASS_RULE_ERROR_MESSAGE = CLASS_RULE__CLASS_RULE_ERROR_MESSAGE;

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
	int EQUALS = 23;

	/**
	 * The feature id for the '<em><b>Class Rule Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS__CLASS_RULE_ERROR_MESSAGE = CLASS_RULE__CLASS_RULE_ERROR_MESSAGE;

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
	int LESS_THAN = 24;

	/**
	 * The feature id for the '<em><b>Class Rule Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__CLASS_RULE_ERROR_MESSAGE = CLASS_RULE__CLASS_RULE_ERROR_MESSAGE;

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
	int ATTRIBUTE_ARRAY = 25;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ARRAY__ATTRIBUTES = 0;

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
	 * The meta object id for the '{@link formValidation.impl.UIComponentImpl <em>UI Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.UIComponentImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getUIComponent()
	 * @generated
	 */
	int UI_COMPONENT = 26;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_COMPONENT__TOOLTIP = 0;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_COMPONENT__NOTE = 1;

	/**
	 * The number of structural features of the '<em>UI Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_COMPONENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>UI Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.NumericUIComponentImpl <em>Numeric UI Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.NumericUIComponentImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getNumericUIComponent()
	 * @generated
	 */
	int NUMERIC_UI_COMPONENT = 27;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_UI_COMPONENT__TOOLTIP = UI_COMPONENT__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_UI_COMPONENT__NOTE = UI_COMPONENT__NOTE;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_UI_COMPONENT__DEFAULT_VALUE = UI_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_UI_COMPONENT__COMPONENT_TYPE = UI_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Numeric UI Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_UI_COMPONENT_FEATURE_COUNT = UI_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Numeric UI Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_UI_COMPONENT_OPERATION_COUNT = UI_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.EnumerationUIComponentImpl <em>Enumeration UI Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.EnumerationUIComponentImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getEnumerationUIComponent()
	 * @generated
	 */
	int ENUMERATION_UI_COMPONENT = 28;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_UI_COMPONENT__TOOLTIP = UI_COMPONENT__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_UI_COMPONENT__NOTE = UI_COMPONENT__NOTE;

	/**
	 * The number of structural features of the '<em>Enumeration UI Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_UI_COMPONENT_FEATURE_COUNT = UI_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Enumeration UI Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_UI_COMPONENT_OPERATION_COUNT = UI_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.SelectingUIComponentImpl <em>Selecting UI Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.SelectingUIComponentImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getSelectingUIComponent()
	 * @generated
	 */
	int SELECTING_UI_COMPONENT = 59;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTING_UI_COMPONENT__TOOLTIP = UI_COMPONENT__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTING_UI_COMPONENT__NOTE = UI_COMPONENT__NOTE;

	/**
	 * The number of structural features of the '<em>Selecting UI Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTING_UI_COMPONENT_FEATURE_COUNT = UI_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Selecting UI Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTING_UI_COMPONENT_OPERATION_COUNT = UI_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.RadioButtonImpl <em>Radio Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.RadioButtonImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getRadioButton()
	 * @generated
	 */
	int RADIO_BUTTON = 29;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__TOOLTIP = SELECTING_UI_COMPONENT__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__NOTE = SELECTING_UI_COMPONENT__NOTE;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__ORIENTATION = SELECTING_UI_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Radio Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON_FEATURE_COUNT = SELECTING_UI_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Radio Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON_OPERATION_COUNT = SELECTING_UI_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.DropDownListImpl <em>Drop Down List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.DropDownListImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getDropDownList()
	 * @generated
	 */
	int DROP_DOWN_LIST = 30;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DOWN_LIST__TOOLTIP = SELECTING_UI_COMPONENT__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DOWN_LIST__NOTE = SELECTING_UI_COMPONENT__NOTE;

	/**
	 * The feature id for the '<em><b>Is Multi Select</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DOWN_LIST__IS_MULTI_SELECT = SELECTING_UI_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Drop Down List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DOWN_LIST_FEATURE_COUNT = SELECTING_UI_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Drop Down List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DOWN_LIST_OPERATION_COUNT = SELECTING_UI_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.CheckBoxImpl <em>Check Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.CheckBoxImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getCheckBox()
	 * @generated
	 */
	int CHECK_BOX = 31;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__TOOLTIP = SELECTING_UI_COMPONENT__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__NOTE = SELECTING_UI_COMPONENT__NOTE;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__ORIENTATION = SELECTING_UI_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Check Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX_FEATURE_COUNT = SELECTING_UI_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Check Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX_OPERATION_COUNT = SELECTING_UI_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.DateUIComponentImpl <em>Date UI Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.DateUIComponentImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getDateUIComponent()
	 * @generated
	 */
	int DATE_UI_COMPONENT = 32;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_UI_COMPONENT__TOOLTIP = UI_COMPONENT__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_UI_COMPONENT__NOTE = UI_COMPONENT__NOTE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_UI_COMPONENT__TYPE = UI_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date UI Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_UI_COMPONENT_FEATURE_COUNT = UI_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Date UI Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_UI_COMPONENT_OPERATION_COUNT = UI_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.TextUIComponentImpl <em>Text UI Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.TextUIComponentImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getTextUIComponent()
	 * @generated
	 */
	int TEXT_UI_COMPONENT = 33;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_UI_COMPONENT__TOOLTIP = UI_COMPONENT__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_UI_COMPONENT__NOTE = UI_COMPONENT__NOTE;

	/**
	 * The feature id for the '<em><b>Place Holder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_UI_COMPONENT__PLACE_HOLDER = UI_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text UI Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_UI_COMPONENT_FEATURE_COUNT = UI_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text UI Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_UI_COMPONENT_OPERATION_COUNT = UI_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.TextInputImpl <em>Text Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.TextInputImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getTextInput()
	 * @generated
	 */
	int TEXT_INPUT = 34;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__TOOLTIP = TEXT_UI_COMPONENT__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__NOTE = TEXT_UI_COMPONENT__NOTE;

	/**
	 * The feature id for the '<em><b>Place Holder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__PLACE_HOLDER = TEXT_UI_COMPONENT__PLACE_HOLDER;

	/**
	 * The number of structural features of the '<em>Text Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_FEATURE_COUNT = TEXT_UI_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_OPERATION_COUNT = TEXT_UI_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.TextAreaImpl <em>Text Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.TextAreaImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getTextArea()
	 * @generated
	 */
	int TEXT_AREA = 35;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__TOOLTIP = TEXT_UI_COMPONENT__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__NOTE = TEXT_UI_COMPONENT__NOTE;

	/**
	 * The feature id for the '<em><b>Place Holder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__PLACE_HOLDER = TEXT_UI_COMPONENT__PLACE_HOLDER;

	/**
	 * The feature id for the '<em><b>Num Of Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__NUM_OF_ROWS = TEXT_UI_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_FEATURE_COUNT = TEXT_UI_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_OPERATION_COUNT = TEXT_UI_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.FormLayoutImpl <em>Form Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.FormLayoutImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getFormLayout()
	 * @generated
	 */
	int FORM_LAYOUT = 36;

	/**
	 * The feature id for the '<em><b>Attributearray</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LAYOUT__ATTRIBUTEARRAY = 0;

	/**
	 * The feature id for the '<em><b>Layouts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LAYOUT__LAYOUTS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LAYOUT__NAME = 2;

	/**
	 * The number of structural features of the '<em>Form Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LAYOUT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Form Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LAYOUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.FieldSetImpl <em>Field Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.FieldSetImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getFieldSet()
	 * @generated
	 */
	int FIELD_SET = 37;

	/**
	 * The feature id for the '<em><b>Attributearray</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SET__ATTRIBUTEARRAY = FORM_LAYOUT__ATTRIBUTEARRAY;

	/**
	 * The feature id for the '<em><b>Layouts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SET__LAYOUTS = FORM_LAYOUT__LAYOUTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SET__NAME = FORM_LAYOUT__NAME;

	/**
	 * The feature id for the '<em><b>Legend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SET__LEGEND = FORM_LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Field Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SET_FEATURE_COUNT = FORM_LAYOUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Field Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SET_OPERATION_COUNT = FORM_LAYOUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.TabImpl <em>Tab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.TabImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getTab()
	 * @generated
	 */
	int TAB = 38;

	/**
	 * The feature id for the '<em><b>Attributearray</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__ATTRIBUTEARRAY = FORM_LAYOUT__ATTRIBUTEARRAY;

	/**
	 * The feature id for the '<em><b>Layouts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__LAYOUTS = FORM_LAYOUT__LAYOUTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__NAME = FORM_LAYOUT__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__LABEL = FORM_LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_FEATURE_COUNT = FORM_LAYOUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_OPERATION_COUNT = FORM_LAYOUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.GridImpl <em>Grid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.GridImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getGrid()
	 * @generated
	 */
	int GRID = 39;

	/**
	 * The feature id for the '<em><b>Attributearray</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__ATTRIBUTEARRAY = FORM_LAYOUT__ATTRIBUTEARRAY;

	/**
	 * The feature id for the '<em><b>Layouts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__LAYOUTS = FORM_LAYOUT__LAYOUTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__NAME = FORM_LAYOUT__NAME;

	/**
	 * The feature id for the '<em><b>Num Of Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__NUM_OF_COLUMNS = FORM_LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Num Of Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__NUM_OF_ROWS = FORM_LAYOUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__ORDER = FORM_LAYOUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Expand Last</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__EXPAND_LAST = FORM_LAYOUT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_FEATURE_COUNT = FORM_LAYOUT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_OPERATION_COUNT = FORM_LAYOUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.AdditionalSettingsImpl <em>Additional Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.AdditionalSettingsImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getAdditionalSettings()
	 * @generated
	 */
	int ADDITIONAL_SETTINGS = 46;

	/**
	 * The number of structural features of the '<em>Additional Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SETTINGS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Additional Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SETTINGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.AttributeSettingsImpl <em>Attribute Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.AttributeSettingsImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getAttributeSettings()
	 * @generated
	 */
	int ATTRIBUTE_SETTINGS = 40;

	/**
	 * The feature id for the '<em><b>Presentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SETTINGS__PRESENTATION = ADDITIONAL_SETTINGS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SETTINGS_FEATURE_COUNT = ADDITIONAL_SETTINGS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribute Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SETTINGS_OPERATION_COUNT = ADDITIONAL_SETTINGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.LabelSettingsImpl <em>Label Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.LabelSettingsImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getLabelSettings()
	 * @generated
	 */
	int LABEL_SETTINGS = 41;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_SETTINGS__POSITION = ADDITIONAL_SETTINGS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Label Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_SETTINGS_FEATURE_COUNT = ADDITIONAL_SETTINGS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Label Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_SETTINGS_OPERATION_COUNT = ADDITIONAL_SETTINGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.ErrorMessageImpl <em>Error Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.ErrorMessageImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getErrorMessage()
	 * @generated
	 */
	int ERROR_MESSAGE = 42;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MESSAGE__MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Error Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MESSAGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Error Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.TelInputImpl <em>Tel Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.TelInputImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getTelInput()
	 * @generated
	 */
	int TEL_INPUT = 43;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEL_INPUT__TOOLTIP = TEXT_UI_COMPONENT__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEL_INPUT__NOTE = TEXT_UI_COMPONENT__NOTE;

	/**
	 * The feature id for the '<em><b>Place Holder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEL_INPUT__PLACE_HOLDER = TEXT_UI_COMPONENT__PLACE_HOLDER;

	/**
	 * The number of structural features of the '<em>Tel Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEL_INPUT_FEATURE_COUNT = TEXT_UI_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tel Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEL_INPUT_OPERATION_COUNT = TEXT_UI_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.EmailInputImpl <em>Email Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.EmailInputImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getEmailInput()
	 * @generated
	 */
	int EMAIL_INPUT = 44;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_INPUT__TOOLTIP = TEXT_UI_COMPONENT__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_INPUT__NOTE = TEXT_UI_COMPONENT__NOTE;

	/**
	 * The feature id for the '<em><b>Place Holder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_INPUT__PLACE_HOLDER = TEXT_UI_COMPONENT__PLACE_HOLDER;

	/**
	 * The number of structural features of the '<em>Email Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_INPUT_FEATURE_COUNT = TEXT_UI_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Email Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_INPUT_OPERATION_COUNT = TEXT_UI_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.PasswordImpl <em>Password</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.PasswordImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getPassword()
	 * @generated
	 */
	int PASSWORD = 45;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD__TOOLTIP = TEXT_UI_COMPONENT__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD__NOTE = TEXT_UI_COMPONENT__NOTE;

	/**
	 * The feature id for the '<em><b>Place Holder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD__PLACE_HOLDER = TEXT_UI_COMPONENT__PLACE_HOLDER;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD__VISIBLE = TEXT_UI_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Password</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_FEATURE_COUNT = TEXT_UI_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Password</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_OPERATION_COUNT = TEXT_UI_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.FileInputImpl <em>File Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.FileInputImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getFileInput()
	 * @generated
	 */
	int FILE_INPUT = 47;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_INPUT__TOOLTIP = UI_COMPONENT__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_INPUT__NOTE = UI_COMPONENT__NOTE;

	/**
	 * The feature id for the '<em><b>Button Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_INPUT__BUTTON_POSITION = UI_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_INPUT_FEATURE_COUNT = UI_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>File Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_INPUT_OPERATION_COUNT = UI_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.AttributeDataTypeImpl <em>Attribute Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.AttributeDataTypeImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getAttributeDataType()
	 * @generated
	 */
	int ATTRIBUTE_DATA_TYPE = 48;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DATA_TYPE__IS_COLLECTION = 0;

	/**
	 * The number of structural features of the '<em>Attribute Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DATA_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Attribute Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.PrimitiveDataTypeImpl <em>Primitive Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.PrimitiveDataTypeImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getPrimitiveDataType()
	 * @generated
	 */
	int PRIMITIVE_DATA_TYPE = 49;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE__IS_COLLECTION = ATTRIBUTE_DATA_TYPE__IS_COLLECTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE__TYPE = ATTRIBUTE_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE_FEATURE_COUNT = ATTRIBUTE_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Primitive Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE_OPERATION_COUNT = ATTRIBUTE_DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.NonPrimitiveDataTypeImpl <em>Non Primitive Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.NonPrimitiveDataTypeImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getNonPrimitiveDataType()
	 * @generated
	 */
	int NON_PRIMITIVE_DATA_TYPE = 50;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_PRIMITIVE_DATA_TYPE__IS_COLLECTION = ATTRIBUTE_DATA_TYPE__IS_COLLECTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_PRIMITIVE_DATA_TYPE__TYPE = ATTRIBUTE_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Non Primitive Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_PRIMITIVE_DATA_TYPE_FEATURE_COUNT = ATTRIBUTE_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Non Primitive Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_PRIMITIVE_DATA_TYPE_OPERATION_COUNT = ATTRIBUTE_DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.RefEntityImpl <em>Ref Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.RefEntityImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getRefEntity()
	 * @generated
	 */
	int REF_ENTITY = 51;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_ENTITY__TOOLTIP = UI_COMPONENT__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_ENTITY__NOTE = UI_COMPONENT__NOTE;

	/**
	 * The feature id for the '<em><b>Is Singe Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_ENTITY__IS_SINGE_VALUE = UI_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ref Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_ENTITY_FEATURE_COUNT = UI_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ref Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_ENTITY_OPERATION_COUNT = UI_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.BusinessModelImpl <em>Business Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.BusinessModelImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getBusinessModel()
	 * @generated
	 */
	int BUSINESS_MODEL = 52;

	/**
	 * The feature id for the '<em><b>Validationclasses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_MODEL__VALIDATIONCLASSES = 0;

	/**
	 * The number of structural features of the '<em>Business Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Business Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.ErrorMessageSettingsImpl <em>Error Message Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.ErrorMessageSettingsImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getErrorMessageSettings()
	 * @generated
	 */
	int ERROR_MESSAGE_SETTINGS = 53;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MESSAGE_SETTINGS__POSITION = ADDITIONAL_SETTINGS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MESSAGE_SETTINGS__COLOR = ADDITIONAL_SETTINGS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Error Message Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MESSAGE_SETTINGS_FEATURE_COUNT = ADDITIONAL_SETTINGS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Error Message Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MESSAGE_SETTINGS_OPERATION_COUNT = ADDITIONAL_SETTINGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.FormSettingsImpl <em>Form Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.FormSettingsImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getFormSettings()
	 * @generated
	 */
	int FORM_SETTINGS = 54;

	/**
	 * The feature id for the '<em><b>Auto Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_SETTINGS__AUTO_COMPLETE = ADDITIONAL_SETTINGS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Form Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_SETTINGS_FEATURE_COUNT = ADDITIONAL_SETTINGS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Form Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_SETTINGS_OPERATION_COUNT = ADDITIONAL_SETTINGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.PaginationImpl <em>Pagination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.PaginationImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getPagination()
	 * @generated
	 */
	int PAGINATION = 55;

	/**
	 * The feature id for the '<em><b>Possible Number Of Shown Rows</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION__POSSIBLE_NUMBER_OF_SHOWN_ROWS = 0;

	/**
	 * The feature id for the '<em><b>Default Num Of Shown Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION__DEFAULT_NUM_OF_SHOWN_ROWS = 1;

	/**
	 * The number of structural features of the '<em>Pagination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pagination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.TableOverviewImpl <em>Table Overview</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.TableOverviewImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getTableOverview()
	 * @generated
	 */
	int TABLE_OVERVIEW = 56;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OVERVIEW__NAME = 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OVERVIEW__HEIGHT = 1;

	/**
	 * The feature id for the '<em><b>Paging</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OVERVIEW__PAGING = 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OVERVIEW__WIDTH = 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OVERVIEW__TITLE = 4;

	/**
	 * The number of structural features of the '<em>Table Overview</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OVERVIEW_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Table Overview</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OVERVIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.OverviewSettingsImpl <em>Overview Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.OverviewSettingsImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getOverviewSettings()
	 * @generated
	 */
	int OVERVIEW_SETTINGS = 57;

	/**
	 * The feature id for the '<em><b>Tableoverview</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERVIEW_SETTINGS__TABLEOVERVIEW = 0;

	/**
	 * The number of structural features of the '<em>Overview Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERVIEW_SETTINGS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Overview Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERVIEW_SETTINGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.NoteSettingsImpl <em>Note Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.NoteSettingsImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getNoteSettings()
	 * @generated
	 */
	int NOTE_SETTINGS = 58;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_SETTINGS__POSITION = ADDITIONAL_SETTINGS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Note Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_SETTINGS_FEATURE_COUNT = ADDITIONAL_SETTINGS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Note Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_SETTINGS_OPERATION_COUNT = ADDITIONAL_SETTINGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.LoadValuesImpl <em>Load Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.LoadValuesImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getLoadValues()
	 * @generated
	 */
	int LOAD_VALUES = 60;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_VALUES__TOOLTIP = SELECTING_UI_COMPONENT__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_VALUES__NOTE = SELECTING_UI_COMPONENT__NOTE;

	/**
	 * The feature id for the '<em><b>Is Multi Select</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_VALUES__IS_MULTI_SELECT = SELECTING_UI_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Load Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_VALUES_FEATURE_COUNT = SELECTING_UI_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Load Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_VALUES_OPERATION_COUNT = SELECTING_UI_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.AutocompleteComponentImpl <em>Autocomplete Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.AutocompleteComponentImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getAutocompleteComponent()
	 * @generated
	 */
	int AUTOCOMPLETE_COMPONENT = 61;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOCOMPLETE_COMPONENT__TOOLTIP = UI_COMPONENT__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOCOMPLETE_COMPONENT__NOTE = UI_COMPONENT__NOTE;

	/**
	 * The number of structural features of the '<em>Autocomplete Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOCOMPLETE_COMPONENT_FEATURE_COUNT = UI_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Autocomplete Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOCOMPLETE_COMPONENT_OPERATION_COUNT = UI_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link formValidation.impl.ColorImpl <em>Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.impl.ColorImpl
	 * @see formValidation.impl.FormValidationPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 62;

	/**
	 * The feature id for the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__RED = 0;

	/**
	 * The feature id for the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__GREEN = 1;

	/**
	 * The feature id for the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__BLUE = 2;

	/**
	 * The number of structural features of the '<em>Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link formValidation.EDataType <em>EData Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.EDataType
	 * @see formValidation.impl.FormValidationPackageImpl#getEDataType()
	 * @generated
	 */
	int EDATA_TYPE = 63;

	/**
	 * The meta object id for the '{@link formValidation.EOrientation <em>EOrientation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.EOrientation
	 * @see formValidation.impl.FormValidationPackageImpl#getEOrientation()
	 * @generated
	 */
	int EORIENTATION = 64;


	/**
	 * The meta object id for the '{@link formValidation.ERequiredField <em>ERequired Field</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.ERequiredField
	 * @see formValidation.impl.FormValidationPackageImpl#getERequiredField()
	 * @generated
	 */
	int EREQUIRED_FIELD = 65;

	/**
	 * The meta object id for the '{@link formValidation.EPosition <em>EPosition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.EPosition
	 * @see formValidation.impl.FormValidationPackageImpl#getEPosition()
	 * @generated
	 */
	int EPOSITION = 66;

	/**
	 * The meta object id for the '{@link formValidation.EGridOrder <em>EGrid Order</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.EGridOrder
	 * @see formValidation.impl.FormValidationPackageImpl#getEGridOrder()
	 * @generated
	 */
	int EGRID_ORDER = 67;

	/**
	 * The meta object id for the '{@link formValidation.EUINumberComponentType <em>EUI Number Component Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.EUINumberComponentType
	 * @see formValidation.impl.FormValidationPackageImpl#getEUINumberComponentType()
	 * @generated
	 */
	int EUI_NUMBER_COMPONENT_TYPE = 68;

	/**
	 * The meta object id for the '{@link formValidation.EDateUIType <em>EDate UI Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formValidation.EDateUIType
	 * @see formValidation.impl.FormValidationPackageImpl#getEDateUIType()
	 * @generated
	 */
	int EDATE_UI_TYPE = 69;


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
	 * Returns the meta object for the attribute '{@link formValidation.ValidationClass#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see formValidation.ValidationClass#getLabel()
	 * @see #getValidationClass()
	 * @generated
	 */
	EAttribute getValidationClass_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link formValidation.ValidationClass#getFormlayout <em>Formlayout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formlayout</em>'.
	 * @see formValidation.ValidationClass#getFormlayout()
	 * @see #getValidationClass()
	 * @generated
	 */
	EReference getValidationClass_Formlayout();

	/**
	 * Returns the meta object for the containment reference list '{@link formValidation.ValidationClass#getAdditionalSettings <em>Additional Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Settings</em>'.
	 * @see formValidation.ValidationClass#getAdditionalSettings()
	 * @see #getValidationClass()
	 * @generated
	 */
	EReference getValidationClass_AdditionalSettings();

	/**
	 * Returns the meta object for the containment reference list '{@link formValidation.ValidationClass#getOverviewsettings <em>Overviewsettings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Overviewsettings</em>'.
	 * @see formValidation.ValidationClass#getOverviewsettings()
	 * @see #getValidationClass()
	 * @generated
	 */
	EReference getValidationClass_Overviewsettings();

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
	 * Returns the meta object for the containment reference '{@link formValidation.AttributeRule#getAttributeRuleErrorMessage <em>Attribute Rule Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attribute Rule Error Message</em>'.
	 * @see formValidation.AttributeRule#getAttributeRuleErrorMessage()
	 * @see #getAttributeRule()
	 * @generated
	 */
	EReference getAttributeRule_AttributeRuleErrorMessage();

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
	 * Returns the meta object for the attribute '{@link formValidation.ClassAttribute#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see formValidation.ClassAttribute#getLabel()
	 * @see #getClassAttribute()
	 * @generated
	 */
	EAttribute getClassAttribute_Label();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.ClassAttribute#isMaster <em>Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Master</em>'.
	 * @see formValidation.ClassAttribute#isMaster()
	 * @see #getClassAttribute()
	 * @generated
	 */
	EAttribute getClassAttribute_Master();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.ClassAttribute#isIsClassRepresenting <em>Is Class Representing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Class Representing</em>'.
	 * @see formValidation.ClassAttribute#isIsClassRepresenting()
	 * @see #getClassAttribute()
	 * @generated
	 */
	EAttribute getClassAttribute_IsClassRepresenting();

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
	 * Returns the meta object for the containment reference '{@link formValidation.AttributeType#getUiComponent <em>Ui Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ui Component</em>'.
	 * @see formValidation.AttributeType#getUiComponent()
	 * @see #getAttributeType()
	 * @generated
	 */
	EReference getAttributeType_UiComponent();

	/**
	 * Returns the meta object for the containment reference '{@link formValidation.AttributeType#getAttributeDataType <em>Attribute Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attribute Data Type</em>'.
	 * @see formValidation.AttributeType#getAttributeDataType()
	 * @see #getAttributeType()
	 * @generated
	 */
	EReference getAttributeType_AttributeDataType();

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
	 * Returns the meta object for the containment reference '{@link formValidation.ClassRule#getClassRuleErrorMessage <em>Class Rule Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Class Rule Error Message</em>'.
	 * @see formValidation.ClassRule#getClassRuleErrorMessage()
	 * @see #getClassRule()
	 * @generated
	 */
	EReference getClassRule_ClassRuleErrorMessage();

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
	 * Returns the meta object for the reference list '{@link formValidation.AttributeArray#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see formValidation.AttributeArray#getAttributes()
	 * @see #getAttributeArray()
	 * @generated
	 */
	EReference getAttributeArray_Attributes();

	/**
	 * Returns the meta object for class '{@link formValidation.UIComponent <em>UI Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Component</em>'.
	 * @see formValidation.UIComponent
	 * @generated
	 */
	EClass getUIComponent();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.UIComponent#getTooltip <em>Tooltip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tooltip</em>'.
	 * @see formValidation.UIComponent#getTooltip()
	 * @see #getUIComponent()
	 * @generated
	 */
	EAttribute getUIComponent_Tooltip();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.UIComponent#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note</em>'.
	 * @see formValidation.UIComponent#getNote()
	 * @see #getUIComponent()
	 * @generated
	 */
	EAttribute getUIComponent_Note();

	/**
	 * Returns the meta object for class '{@link formValidation.NumericUIComponent <em>Numeric UI Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric UI Component</em>'.
	 * @see formValidation.NumericUIComponent
	 * @generated
	 */
	EClass getNumericUIComponent();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.NumericUIComponent#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see formValidation.NumericUIComponent#getDefaultValue()
	 * @see #getNumericUIComponent()
	 * @generated
	 */
	EAttribute getNumericUIComponent_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.NumericUIComponent#getComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Type</em>'.
	 * @see formValidation.NumericUIComponent#getComponentType()
	 * @see #getNumericUIComponent()
	 * @generated
	 */
	EAttribute getNumericUIComponent_ComponentType();

	/**
	 * Returns the meta object for class '{@link formValidation.EnumerationUIComponent <em>Enumeration UI Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration UI Component</em>'.
	 * @see formValidation.EnumerationUIComponent
	 * @generated
	 */
	EClass getEnumerationUIComponent();

	/**
	 * Returns the meta object for class '{@link formValidation.RadioButton <em>Radio Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radio Button</em>'.
	 * @see formValidation.RadioButton
	 * @generated
	 */
	EClass getRadioButton();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.RadioButton#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see formValidation.RadioButton#getOrientation()
	 * @see #getRadioButton()
	 * @generated
	 */
	EAttribute getRadioButton_Orientation();

	/**
	 * Returns the meta object for class '{@link formValidation.DropDownList <em>Drop Down List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop Down List</em>'.
	 * @see formValidation.DropDownList
	 * @generated
	 */
	EClass getDropDownList();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.DropDownList#isIsMultiSelect <em>Is Multi Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Multi Select</em>'.
	 * @see formValidation.DropDownList#isIsMultiSelect()
	 * @see #getDropDownList()
	 * @generated
	 */
	EAttribute getDropDownList_IsMultiSelect();

	/**
	 * Returns the meta object for class '{@link formValidation.CheckBox <em>Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Box</em>'.
	 * @see formValidation.CheckBox
	 * @generated
	 */
	EClass getCheckBox();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.CheckBox#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see formValidation.CheckBox#getOrientation()
	 * @see #getCheckBox()
	 * @generated
	 */
	EAttribute getCheckBox_Orientation();

	/**
	 * Returns the meta object for class '{@link formValidation.DateUIComponent <em>Date UI Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date UI Component</em>'.
	 * @see formValidation.DateUIComponent
	 * @generated
	 */
	EClass getDateUIComponent();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.DateUIComponent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see formValidation.DateUIComponent#getType()
	 * @see #getDateUIComponent()
	 * @generated
	 */
	EAttribute getDateUIComponent_Type();

	/**
	 * Returns the meta object for class '{@link formValidation.TextUIComponent <em>Text UI Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text UI Component</em>'.
	 * @see formValidation.TextUIComponent
	 * @generated
	 */
	EClass getTextUIComponent();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.TextUIComponent#getPlaceHolder <em>Place Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Place Holder</em>'.
	 * @see formValidation.TextUIComponent#getPlaceHolder()
	 * @see #getTextUIComponent()
	 * @generated
	 */
	EAttribute getTextUIComponent_PlaceHolder();

	/**
	 * Returns the meta object for class '{@link formValidation.TextInput <em>Text Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Input</em>'.
	 * @see formValidation.TextInput
	 * @generated
	 */
	EClass getTextInput();

	/**
	 * Returns the meta object for class '{@link formValidation.TextArea <em>Text Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Area</em>'.
	 * @see formValidation.TextArea
	 * @generated
	 */
	EClass getTextArea();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.TextArea#getNumOfRows <em>Num Of Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Of Rows</em>'.
	 * @see formValidation.TextArea#getNumOfRows()
	 * @see #getTextArea()
	 * @generated
	 */
	EAttribute getTextArea_NumOfRows();

	/**
	 * Returns the meta object for class '{@link formValidation.FormLayout <em>Form Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Layout</em>'.
	 * @see formValidation.FormLayout
	 * @generated
	 */
	EClass getFormLayout();

	/**
	 * Returns the meta object for the containment reference '{@link formValidation.FormLayout#getAttributearray <em>Attributearray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attributearray</em>'.
	 * @see formValidation.FormLayout#getAttributearray()
	 * @see #getFormLayout()
	 * @generated
	 */
	EReference getFormLayout_Attributearray();

	/**
	 * Returns the meta object for the containment reference list '{@link formValidation.FormLayout#getLayouts <em>Layouts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layouts</em>'.
	 * @see formValidation.FormLayout#getLayouts()
	 * @see #getFormLayout()
	 * @generated
	 */
	EReference getFormLayout_Layouts();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.FormLayout#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see formValidation.FormLayout#getName()
	 * @see #getFormLayout()
	 * @generated
	 */
	EAttribute getFormLayout_Name();

	/**
	 * Returns the meta object for class '{@link formValidation.FieldSet <em>Field Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Set</em>'.
	 * @see formValidation.FieldSet
	 * @generated
	 */
	EClass getFieldSet();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.FieldSet#getLegend <em>Legend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legend</em>'.
	 * @see formValidation.FieldSet#getLegend()
	 * @see #getFieldSet()
	 * @generated
	 */
	EAttribute getFieldSet_Legend();

	/**
	 * Returns the meta object for class '{@link formValidation.Tab <em>Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab</em>'.
	 * @see formValidation.Tab
	 * @generated
	 */
	EClass getTab();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.Tab#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see formValidation.Tab#getLabel()
	 * @see #getTab()
	 * @generated
	 */
	EAttribute getTab_Label();

	/**
	 * Returns the meta object for class '{@link formValidation.Grid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid</em>'.
	 * @see formValidation.Grid
	 * @generated
	 */
	EClass getGrid();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.Grid#getNumOfColumns <em>Num Of Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Of Columns</em>'.
	 * @see formValidation.Grid#getNumOfColumns()
	 * @see #getGrid()
	 * @generated
	 */
	EAttribute getGrid_NumOfColumns();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.Grid#getNumOfRows <em>Num Of Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Of Rows</em>'.
	 * @see formValidation.Grid#getNumOfRows()
	 * @see #getGrid()
	 * @generated
	 */
	EAttribute getGrid_NumOfRows();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.Grid#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see formValidation.Grid#getOrder()
	 * @see #getGrid()
	 * @generated
	 */
	EAttribute getGrid_Order();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.Grid#isExpandLast <em>Expand Last</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expand Last</em>'.
	 * @see formValidation.Grid#isExpandLast()
	 * @see #getGrid()
	 * @generated
	 */
	EAttribute getGrid_ExpandLast();

	/**
	 * Returns the meta object for class '{@link formValidation.AttributeSettings <em>Attribute Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Settings</em>'.
	 * @see formValidation.AttributeSettings
	 * @generated
	 */
	EClass getAttributeSettings();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.AttributeSettings#getPresentation <em>Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Presentation</em>'.
	 * @see formValidation.AttributeSettings#getPresentation()
	 * @see #getAttributeSettings()
	 * @generated
	 */
	EAttribute getAttributeSettings_Presentation();

	/**
	 * Returns the meta object for class '{@link formValidation.LabelSettings <em>Label Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Settings</em>'.
	 * @see formValidation.LabelSettings
	 * @generated
	 */
	EClass getLabelSettings();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.LabelSettings#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see formValidation.LabelSettings#getPosition()
	 * @see #getLabelSettings()
	 * @generated
	 */
	EAttribute getLabelSettings_Position();

	/**
	 * Returns the meta object for class '{@link formValidation.ErrorMessage <em>Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Message</em>'.
	 * @see formValidation.ErrorMessage
	 * @generated
	 */
	EClass getErrorMessage();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.ErrorMessage#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see formValidation.ErrorMessage#getMessage()
	 * @see #getErrorMessage()
	 * @generated
	 */
	EAttribute getErrorMessage_Message();

	/**
	 * Returns the meta object for class '{@link formValidation.TelInput <em>Tel Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tel Input</em>'.
	 * @see formValidation.TelInput
	 * @generated
	 */
	EClass getTelInput();

	/**
	 * Returns the meta object for class '{@link formValidation.EmailInput <em>Email Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Email Input</em>'.
	 * @see formValidation.EmailInput
	 * @generated
	 */
	EClass getEmailInput();

	/**
	 * Returns the meta object for class '{@link formValidation.Password <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Password</em>'.
	 * @see formValidation.Password
	 * @generated
	 */
	EClass getPassword();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.Password#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see formValidation.Password#isVisible()
	 * @see #getPassword()
	 * @generated
	 */
	EAttribute getPassword_Visible();

	/**
	 * Returns the meta object for class '{@link formValidation.AdditionalSettings <em>Additional Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additional Settings</em>'.
	 * @see formValidation.AdditionalSettings
	 * @generated
	 */
	EClass getAdditionalSettings();

	/**
	 * Returns the meta object for class '{@link formValidation.FileInput <em>File Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Input</em>'.
	 * @see formValidation.FileInput
	 * @generated
	 */
	EClass getFileInput();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.FileInput#getButtonPosition <em>Button Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Button Position</em>'.
	 * @see formValidation.FileInput#getButtonPosition()
	 * @see #getFileInput()
	 * @generated
	 */
	EAttribute getFileInput_ButtonPosition();

	/**
	 * Returns the meta object for class '{@link formValidation.AttributeDataType <em>Attribute Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Data Type</em>'.
	 * @see formValidation.AttributeDataType
	 * @generated
	 */
	EClass getAttributeDataType();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.AttributeDataType#isIsCollection <em>Is Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Collection</em>'.
	 * @see formValidation.AttributeDataType#isIsCollection()
	 * @see #getAttributeDataType()
	 * @generated
	 */
	EAttribute getAttributeDataType_IsCollection();

	/**
	 * Returns the meta object for class '{@link formValidation.PrimitiveDataType <em>Primitive Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Data Type</em>'.
	 * @see formValidation.PrimitiveDataType
	 * @generated
	 */
	EClass getPrimitiveDataType();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.PrimitiveDataType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see formValidation.PrimitiveDataType#getType()
	 * @see #getPrimitiveDataType()
	 * @generated
	 */
	EAttribute getPrimitiveDataType_Type();

	/**
	 * Returns the meta object for class '{@link formValidation.NonPrimitiveDataType <em>Non Primitive Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Primitive Data Type</em>'.
	 * @see formValidation.NonPrimitiveDataType
	 * @generated
	 */
	EClass getNonPrimitiveDataType();

	/**
	 * Returns the meta object for the reference '{@link formValidation.NonPrimitiveDataType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see formValidation.NonPrimitiveDataType#getType()
	 * @see #getNonPrimitiveDataType()
	 * @generated
	 */
	EReference getNonPrimitiveDataType_Type();

	/**
	 * Returns the meta object for class '{@link formValidation.RefEntity <em>Ref Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Entity</em>'.
	 * @see formValidation.RefEntity
	 * @generated
	 */
	EClass getRefEntity();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.RefEntity#isIsSingeValue <em>Is Singe Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Singe Value</em>'.
	 * @see formValidation.RefEntity#isIsSingeValue()
	 * @see #getRefEntity()
	 * @generated
	 */
	EAttribute getRefEntity_IsSingeValue();

	/**
	 * Returns the meta object for class '{@link formValidation.BusinessModel <em>Business Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Model</em>'.
	 * @see formValidation.BusinessModel
	 * @generated
	 */
	EClass getBusinessModel();

	/**
	 * Returns the meta object for the containment reference list '{@link formValidation.BusinessModel#getValidationclasses <em>Validationclasses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Validationclasses</em>'.
	 * @see formValidation.BusinessModel#getValidationclasses()
	 * @see #getBusinessModel()
	 * @generated
	 */
	EReference getBusinessModel_Validationclasses();

	/**
	 * Returns the meta object for class '{@link formValidation.ErrorMessageSettings <em>Error Message Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Message Settings</em>'.
	 * @see formValidation.ErrorMessageSettings
	 * @generated
	 */
	EClass getErrorMessageSettings();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.ErrorMessageSettings#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see formValidation.ErrorMessageSettings#getPosition()
	 * @see #getErrorMessageSettings()
	 * @generated
	 */
	EAttribute getErrorMessageSettings_Position();

	/**
	 * Returns the meta object for the containment reference '{@link formValidation.ErrorMessageSettings#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Color</em>'.
	 * @see formValidation.ErrorMessageSettings#getColor()
	 * @see #getErrorMessageSettings()
	 * @generated
	 */
	EReference getErrorMessageSettings_Color();

	/**
	 * Returns the meta object for class '{@link formValidation.FormSettings <em>Form Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Settings</em>'.
	 * @see formValidation.FormSettings
	 * @generated
	 */
	EClass getFormSettings();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.FormSettings#isAutoComplete <em>Auto Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Complete</em>'.
	 * @see formValidation.FormSettings#isAutoComplete()
	 * @see #getFormSettings()
	 * @generated
	 */
	EAttribute getFormSettings_AutoComplete();

	/**
	 * Returns the meta object for class '{@link formValidation.Pagination <em>Pagination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pagination</em>'.
	 * @see formValidation.Pagination
	 * @generated
	 */
	EClass getPagination();

	/**
	 * Returns the meta object for the attribute list '{@link formValidation.Pagination#getPossibleNumberOfShownRows <em>Possible Number Of Shown Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Possible Number Of Shown Rows</em>'.
	 * @see formValidation.Pagination#getPossibleNumberOfShownRows()
	 * @see #getPagination()
	 * @generated
	 */
	EAttribute getPagination_PossibleNumberOfShownRows();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.Pagination#getDefaultNumOfShownRows <em>Default Num Of Shown Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Num Of Shown Rows</em>'.
	 * @see formValidation.Pagination#getDefaultNumOfShownRows()
	 * @see #getPagination()
	 * @generated
	 */
	EAttribute getPagination_DefaultNumOfShownRows();

	/**
	 * Returns the meta object for class '{@link formValidation.TableOverview <em>Table Overview</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Overview</em>'.
	 * @see formValidation.TableOverview
	 * @generated
	 */
	EClass getTableOverview();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.TableOverview#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see formValidation.TableOverview#getName()
	 * @see #getTableOverview()
	 * @generated
	 */
	EAttribute getTableOverview_Name();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.TableOverview#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see formValidation.TableOverview#getHeight()
	 * @see #getTableOverview()
	 * @generated
	 */
	EAttribute getTableOverview_Height();

	/**
	 * Returns the meta object for the containment reference list '{@link formValidation.TableOverview#getPaging <em>Paging</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paging</em>'.
	 * @see formValidation.TableOverview#getPaging()
	 * @see #getTableOverview()
	 * @generated
	 */
	EReference getTableOverview_Paging();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.TableOverview#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see formValidation.TableOverview#getWidth()
	 * @see #getTableOverview()
	 * @generated
	 */
	EAttribute getTableOverview_Width();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.TableOverview#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see formValidation.TableOverview#getTitle()
	 * @see #getTableOverview()
	 * @generated
	 */
	EAttribute getTableOverview_Title();

	/**
	 * Returns the meta object for class '{@link formValidation.OverviewSettings <em>Overview Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overview Settings</em>'.
	 * @see formValidation.OverviewSettings
	 * @generated
	 */
	EClass getOverviewSettings();

	/**
	 * Returns the meta object for the containment reference list '{@link formValidation.OverviewSettings#getTableoverview <em>Tableoverview</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tableoverview</em>'.
	 * @see formValidation.OverviewSettings#getTableoverview()
	 * @see #getOverviewSettings()
	 * @generated
	 */
	EReference getOverviewSettings_Tableoverview();

	/**
	 * Returns the meta object for class '{@link formValidation.NoteSettings <em>Note Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note Settings</em>'.
	 * @see formValidation.NoteSettings
	 * @generated
	 */
	EClass getNoteSettings();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.NoteSettings#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see formValidation.NoteSettings#getPosition()
	 * @see #getNoteSettings()
	 * @generated
	 */
	EAttribute getNoteSettings_Position();

	/**
	 * Returns the meta object for class '{@link formValidation.SelectingUIComponent <em>Selecting UI Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selecting UI Component</em>'.
	 * @see formValidation.SelectingUIComponent
	 * @generated
	 */
	EClass getSelectingUIComponent();

	/**
	 * Returns the meta object for class '{@link formValidation.LoadValues <em>Load Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Values</em>'.
	 * @see formValidation.LoadValues
	 * @generated
	 */
	EClass getLoadValues();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.LoadValues#isIsMultiSelect <em>Is Multi Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Multi Select</em>'.
	 * @see formValidation.LoadValues#isIsMultiSelect()
	 * @see #getLoadValues()
	 * @generated
	 */
	EAttribute getLoadValues_IsMultiSelect();

	/**
	 * Returns the meta object for class '{@link formValidation.AutocompleteComponent <em>Autocomplete Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Autocomplete Component</em>'.
	 * @see formValidation.AutocompleteComponent
	 * @generated
	 */
	EClass getAutocompleteComponent();

	/**
	 * Returns the meta object for class '{@link formValidation.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color</em>'.
	 * @see formValidation.Color
	 * @generated
	 */
	EClass getColor();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.Color#getRed <em>Red</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Red</em>'.
	 * @see formValidation.Color#getRed()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_Red();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.Color#getGreen <em>Green</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Green</em>'.
	 * @see formValidation.Color#getGreen()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_Green();

	/**
	 * Returns the meta object for the attribute '{@link formValidation.Color#getBlue <em>Blue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blue</em>'.
	 * @see formValidation.Color#getBlue()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_Blue();

	/**
	 * Returns the meta object for enum '{@link formValidation.EDataType <em>EData Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EData Type</em>'.
	 * @see formValidation.EDataType
	 * @generated
	 */
	EEnum getEDataType();

	/**
	 * Returns the meta object for enum '{@link formValidation.EOrientation <em>EOrientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EOrientation</em>'.
	 * @see formValidation.EOrientation
	 * @generated
	 */
	EEnum getEOrientation();

	/**
	 * Returns the meta object for enum '{@link formValidation.ERequiredField <em>ERequired Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ERequired Field</em>'.
	 * @see formValidation.ERequiredField
	 * @generated
	 */
	EEnum getERequiredField();

	/**
	 * Returns the meta object for enum '{@link formValidation.EPosition <em>EPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EPosition</em>'.
	 * @see formValidation.EPosition
	 * @generated
	 */
	EEnum getEPosition();

	/**
	 * Returns the meta object for enum '{@link formValidation.EGridOrder <em>EGrid Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EGrid Order</em>'.
	 * @see formValidation.EGridOrder
	 * @generated
	 */
	EEnum getEGridOrder();

	/**
	 * Returns the meta object for enum '{@link formValidation.EUINumberComponentType <em>EUI Number Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EUI Number Component Type</em>'.
	 * @see formValidation.EUINumberComponentType
	 * @generated
	 */
	EEnum getEUINumberComponentType();

	/**
	 * Returns the meta object for enum '{@link formValidation.EDateUIType <em>EDate UI Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EDate UI Type</em>'.
	 * @see formValidation.EDateUIType
	 * @generated
	 */
	EEnum getEDateUIType();

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
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_CLASS__LABEL = eINSTANCE.getValidationClass_Label();

		/**
		 * The meta object literal for the '<em><b>Formlayout</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATION_CLASS__FORMLAYOUT = eINSTANCE.getValidationClass_Formlayout();

		/**
		 * The meta object literal for the '<em><b>Additional Settings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATION_CLASS__ADDITIONAL_SETTINGS = eINSTANCE.getValidationClass_AdditionalSettings();

		/**
		 * The meta object literal for the '<em><b>Overviewsettings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATION_CLASS__OVERVIEWSETTINGS = eINSTANCE.getValidationClass_Overviewsettings();

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
		 * The meta object literal for the '<em><b>Attribute Rule Error Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_RULE__ATTRIBUTE_RULE_ERROR_MESSAGE = eINSTANCE.getAttributeRule_AttributeRuleErrorMessage();

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
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_ATTRIBUTE__LABEL = eINSTANCE.getClassAttribute_Label();

		/**
		 * The meta object literal for the '<em><b>Master</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_ATTRIBUTE__MASTER = eINSTANCE.getClassAttribute_Master();

		/**
		 * The meta object literal for the '<em><b>Is Class Representing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_ATTRIBUTE__IS_CLASS_REPRESENTING = eINSTANCE.getClassAttribute_IsClassRepresenting();

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
		 * The meta object literal for the '<em><b>Ui Component</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_TYPE__UI_COMPONENT = eINSTANCE.getAttributeType_UiComponent();

		/**
		 * The meta object literal for the '<em><b>Attribute Data Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_TYPE__ATTRIBUTE_DATA_TYPE = eINSTANCE.getAttributeType_AttributeDataType();

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
		 * The meta object literal for the '<em><b>Class Rule Error Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_RULE__CLASS_RULE_ERROR_MESSAGE = eINSTANCE.getClassRule_ClassRuleErrorMessage();

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
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_ARRAY__ATTRIBUTES = eINSTANCE.getAttributeArray_Attributes();

		/**
		 * The meta object literal for the '{@link formValidation.impl.UIComponentImpl <em>UI Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.UIComponentImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getUIComponent()
		 * @generated
		 */
		EClass UI_COMPONENT = eINSTANCE.getUIComponent();

		/**
		 * The meta object literal for the '<em><b>Tooltip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_COMPONENT__TOOLTIP = eINSTANCE.getUIComponent_Tooltip();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_COMPONENT__NOTE = eINSTANCE.getUIComponent_Note();

		/**
		 * The meta object literal for the '{@link formValidation.impl.NumericUIComponentImpl <em>Numeric UI Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.NumericUIComponentImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getNumericUIComponent()
		 * @generated
		 */
		EClass NUMERIC_UI_COMPONENT = eINSTANCE.getNumericUIComponent();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC_UI_COMPONENT__DEFAULT_VALUE = eINSTANCE.getNumericUIComponent_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Component Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC_UI_COMPONENT__COMPONENT_TYPE = eINSTANCE.getNumericUIComponent_ComponentType();

		/**
		 * The meta object literal for the '{@link formValidation.impl.EnumerationUIComponentImpl <em>Enumeration UI Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.EnumerationUIComponentImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getEnumerationUIComponent()
		 * @generated
		 */
		EClass ENUMERATION_UI_COMPONENT = eINSTANCE.getEnumerationUIComponent();

		/**
		 * The meta object literal for the '{@link formValidation.impl.RadioButtonImpl <em>Radio Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.RadioButtonImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getRadioButton()
		 * @generated
		 */
		EClass RADIO_BUTTON = eINSTANCE.getRadioButton();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIO_BUTTON__ORIENTATION = eINSTANCE.getRadioButton_Orientation();

		/**
		 * The meta object literal for the '{@link formValidation.impl.DropDownListImpl <em>Drop Down List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.DropDownListImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getDropDownList()
		 * @generated
		 */
		EClass DROP_DOWN_LIST = eINSTANCE.getDropDownList();

		/**
		 * The meta object literal for the '<em><b>Is Multi Select</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROP_DOWN_LIST__IS_MULTI_SELECT = eINSTANCE.getDropDownList_IsMultiSelect();

		/**
		 * The meta object literal for the '{@link formValidation.impl.CheckBoxImpl <em>Check Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.CheckBoxImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getCheckBox()
		 * @generated
		 */
		EClass CHECK_BOX = eINSTANCE.getCheckBox();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_BOX__ORIENTATION = eINSTANCE.getCheckBox_Orientation();

		/**
		 * The meta object literal for the '{@link formValidation.impl.DateUIComponentImpl <em>Date UI Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.DateUIComponentImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getDateUIComponent()
		 * @generated
		 */
		EClass DATE_UI_COMPONENT = eINSTANCE.getDateUIComponent();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_UI_COMPONENT__TYPE = eINSTANCE.getDateUIComponent_Type();

		/**
		 * The meta object literal for the '{@link formValidation.impl.TextUIComponentImpl <em>Text UI Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.TextUIComponentImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getTextUIComponent()
		 * @generated
		 */
		EClass TEXT_UI_COMPONENT = eINSTANCE.getTextUIComponent();

		/**
		 * The meta object literal for the '<em><b>Place Holder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_UI_COMPONENT__PLACE_HOLDER = eINSTANCE.getTextUIComponent_PlaceHolder();

		/**
		 * The meta object literal for the '{@link formValidation.impl.TextInputImpl <em>Text Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.TextInputImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getTextInput()
		 * @generated
		 */
		EClass TEXT_INPUT = eINSTANCE.getTextInput();

		/**
		 * The meta object literal for the '{@link formValidation.impl.TextAreaImpl <em>Text Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.TextAreaImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getTextArea()
		 * @generated
		 */
		EClass TEXT_AREA = eINSTANCE.getTextArea();

		/**
		 * The meta object literal for the '<em><b>Num Of Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_AREA__NUM_OF_ROWS = eINSTANCE.getTextArea_NumOfRows();

		/**
		 * The meta object literal for the '{@link formValidation.impl.FormLayoutImpl <em>Form Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.FormLayoutImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getFormLayout()
		 * @generated
		 */
		EClass FORM_LAYOUT = eINSTANCE.getFormLayout();

		/**
		 * The meta object literal for the '<em><b>Attributearray</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_LAYOUT__ATTRIBUTEARRAY = eINSTANCE.getFormLayout_Attributearray();

		/**
		 * The meta object literal for the '<em><b>Layouts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_LAYOUT__LAYOUTS = eINSTANCE.getFormLayout_Layouts();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_LAYOUT__NAME = eINSTANCE.getFormLayout_Name();

		/**
		 * The meta object literal for the '{@link formValidation.impl.FieldSetImpl <em>Field Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.FieldSetImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getFieldSet()
		 * @generated
		 */
		EClass FIELD_SET = eINSTANCE.getFieldSet();

		/**
		 * The meta object literal for the '<em><b>Legend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_SET__LEGEND = eINSTANCE.getFieldSet_Legend();

		/**
		 * The meta object literal for the '{@link formValidation.impl.TabImpl <em>Tab</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.TabImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getTab()
		 * @generated
		 */
		EClass TAB = eINSTANCE.getTab();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAB__LABEL = eINSTANCE.getTab_Label();

		/**
		 * The meta object literal for the '{@link formValidation.impl.GridImpl <em>Grid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.GridImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getGrid()
		 * @generated
		 */
		EClass GRID = eINSTANCE.getGrid();

		/**
		 * The meta object literal for the '<em><b>Num Of Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID__NUM_OF_COLUMNS = eINSTANCE.getGrid_NumOfColumns();

		/**
		 * The meta object literal for the '<em><b>Num Of Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID__NUM_OF_ROWS = eINSTANCE.getGrid_NumOfRows();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID__ORDER = eINSTANCE.getGrid_Order();

		/**
		 * The meta object literal for the '<em><b>Expand Last</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID__EXPAND_LAST = eINSTANCE.getGrid_ExpandLast();

		/**
		 * The meta object literal for the '{@link formValidation.impl.AttributeSettingsImpl <em>Attribute Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.AttributeSettingsImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getAttributeSettings()
		 * @generated
		 */
		EClass ATTRIBUTE_SETTINGS = eINSTANCE.getAttributeSettings();

		/**
		 * The meta object literal for the '<em><b>Presentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_SETTINGS__PRESENTATION = eINSTANCE.getAttributeSettings_Presentation();

		/**
		 * The meta object literal for the '{@link formValidation.impl.LabelSettingsImpl <em>Label Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.LabelSettingsImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getLabelSettings()
		 * @generated
		 */
		EClass LABEL_SETTINGS = eINSTANCE.getLabelSettings();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_SETTINGS__POSITION = eINSTANCE.getLabelSettings_Position();

		/**
		 * The meta object literal for the '{@link formValidation.impl.ErrorMessageImpl <em>Error Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.ErrorMessageImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getErrorMessage()
		 * @generated
		 */
		EClass ERROR_MESSAGE = eINSTANCE.getErrorMessage();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_MESSAGE__MESSAGE = eINSTANCE.getErrorMessage_Message();

		/**
		 * The meta object literal for the '{@link formValidation.impl.TelInputImpl <em>Tel Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.TelInputImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getTelInput()
		 * @generated
		 */
		EClass TEL_INPUT = eINSTANCE.getTelInput();

		/**
		 * The meta object literal for the '{@link formValidation.impl.EmailInputImpl <em>Email Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.EmailInputImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getEmailInput()
		 * @generated
		 */
		EClass EMAIL_INPUT = eINSTANCE.getEmailInput();

		/**
		 * The meta object literal for the '{@link formValidation.impl.PasswordImpl <em>Password</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.PasswordImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getPassword()
		 * @generated
		 */
		EClass PASSWORD = eINSTANCE.getPassword();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSWORD__VISIBLE = eINSTANCE.getPassword_Visible();

		/**
		 * The meta object literal for the '{@link formValidation.impl.AdditionalSettingsImpl <em>Additional Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.AdditionalSettingsImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getAdditionalSettings()
		 * @generated
		 */
		EClass ADDITIONAL_SETTINGS = eINSTANCE.getAdditionalSettings();

		/**
		 * The meta object literal for the '{@link formValidation.impl.FileInputImpl <em>File Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.FileInputImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getFileInput()
		 * @generated
		 */
		EClass FILE_INPUT = eINSTANCE.getFileInput();

		/**
		 * The meta object literal for the '<em><b>Button Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_INPUT__BUTTON_POSITION = eINSTANCE.getFileInput_ButtonPosition();

		/**
		 * The meta object literal for the '{@link formValidation.impl.AttributeDataTypeImpl <em>Attribute Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.AttributeDataTypeImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getAttributeDataType()
		 * @generated
		 */
		EClass ATTRIBUTE_DATA_TYPE = eINSTANCE.getAttributeDataType();

		/**
		 * The meta object literal for the '<em><b>Is Collection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DATA_TYPE__IS_COLLECTION = eINSTANCE.getAttributeDataType_IsCollection();

		/**
		 * The meta object literal for the '{@link formValidation.impl.PrimitiveDataTypeImpl <em>Primitive Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.PrimitiveDataTypeImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getPrimitiveDataType()
		 * @generated
		 */
		EClass PRIMITIVE_DATA_TYPE = eINSTANCE.getPrimitiveDataType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_DATA_TYPE__TYPE = eINSTANCE.getPrimitiveDataType_Type();

		/**
		 * The meta object literal for the '{@link formValidation.impl.NonPrimitiveDataTypeImpl <em>Non Primitive Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.NonPrimitiveDataTypeImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getNonPrimitiveDataType()
		 * @generated
		 */
		EClass NON_PRIMITIVE_DATA_TYPE = eINSTANCE.getNonPrimitiveDataType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NON_PRIMITIVE_DATA_TYPE__TYPE = eINSTANCE.getNonPrimitiveDataType_Type();

		/**
		 * The meta object literal for the '{@link formValidation.impl.RefEntityImpl <em>Ref Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.RefEntityImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getRefEntity()
		 * @generated
		 */
		EClass REF_ENTITY = eINSTANCE.getRefEntity();

		/**
		 * The meta object literal for the '<em><b>Is Singe Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REF_ENTITY__IS_SINGE_VALUE = eINSTANCE.getRefEntity_IsSingeValue();

		/**
		 * The meta object literal for the '{@link formValidation.impl.BusinessModelImpl <em>Business Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.BusinessModelImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getBusinessModel()
		 * @generated
		 */
		EClass BUSINESS_MODEL = eINSTANCE.getBusinessModel();

		/**
		 * The meta object literal for the '<em><b>Validationclasses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_MODEL__VALIDATIONCLASSES = eINSTANCE.getBusinessModel_Validationclasses();

		/**
		 * The meta object literal for the '{@link formValidation.impl.ErrorMessageSettingsImpl <em>Error Message Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.ErrorMessageSettingsImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getErrorMessageSettings()
		 * @generated
		 */
		EClass ERROR_MESSAGE_SETTINGS = eINSTANCE.getErrorMessageSettings();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_MESSAGE_SETTINGS__POSITION = eINSTANCE.getErrorMessageSettings_Position();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MESSAGE_SETTINGS__COLOR = eINSTANCE.getErrorMessageSettings_Color();

		/**
		 * The meta object literal for the '{@link formValidation.impl.FormSettingsImpl <em>Form Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.FormSettingsImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getFormSettings()
		 * @generated
		 */
		EClass FORM_SETTINGS = eINSTANCE.getFormSettings();

		/**
		 * The meta object literal for the '<em><b>Auto Complete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_SETTINGS__AUTO_COMPLETE = eINSTANCE.getFormSettings_AutoComplete();

		/**
		 * The meta object literal for the '{@link formValidation.impl.PaginationImpl <em>Pagination</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.PaginationImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getPagination()
		 * @generated
		 */
		EClass PAGINATION = eINSTANCE.getPagination();

		/**
		 * The meta object literal for the '<em><b>Possible Number Of Shown Rows</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGINATION__POSSIBLE_NUMBER_OF_SHOWN_ROWS = eINSTANCE.getPagination_PossibleNumberOfShownRows();

		/**
		 * The meta object literal for the '<em><b>Default Num Of Shown Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGINATION__DEFAULT_NUM_OF_SHOWN_ROWS = eINSTANCE.getPagination_DefaultNumOfShownRows();

		/**
		 * The meta object literal for the '{@link formValidation.impl.TableOverviewImpl <em>Table Overview</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.TableOverviewImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getTableOverview()
		 * @generated
		 */
		EClass TABLE_OVERVIEW = eINSTANCE.getTableOverview();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_OVERVIEW__NAME = eINSTANCE.getTableOverview_Name();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_OVERVIEW__HEIGHT = eINSTANCE.getTableOverview_Height();

		/**
		 * The meta object literal for the '<em><b>Paging</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_OVERVIEW__PAGING = eINSTANCE.getTableOverview_Paging();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_OVERVIEW__WIDTH = eINSTANCE.getTableOverview_Width();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_OVERVIEW__TITLE = eINSTANCE.getTableOverview_Title();

		/**
		 * The meta object literal for the '{@link formValidation.impl.OverviewSettingsImpl <em>Overview Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.OverviewSettingsImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getOverviewSettings()
		 * @generated
		 */
		EClass OVERVIEW_SETTINGS = eINSTANCE.getOverviewSettings();

		/**
		 * The meta object literal for the '<em><b>Tableoverview</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OVERVIEW_SETTINGS__TABLEOVERVIEW = eINSTANCE.getOverviewSettings_Tableoverview();

		/**
		 * The meta object literal for the '{@link formValidation.impl.NoteSettingsImpl <em>Note Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.NoteSettingsImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getNoteSettings()
		 * @generated
		 */
		EClass NOTE_SETTINGS = eINSTANCE.getNoteSettings();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE_SETTINGS__POSITION = eINSTANCE.getNoteSettings_Position();

		/**
		 * The meta object literal for the '{@link formValidation.impl.SelectingUIComponentImpl <em>Selecting UI Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.SelectingUIComponentImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getSelectingUIComponent()
		 * @generated
		 */
		EClass SELECTING_UI_COMPONENT = eINSTANCE.getSelectingUIComponent();

		/**
		 * The meta object literal for the '{@link formValidation.impl.LoadValuesImpl <em>Load Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.LoadValuesImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getLoadValues()
		 * @generated
		 */
		EClass LOAD_VALUES = eINSTANCE.getLoadValues();

		/**
		 * The meta object literal for the '<em><b>Is Multi Select</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_VALUES__IS_MULTI_SELECT = eINSTANCE.getLoadValues_IsMultiSelect();

		/**
		 * The meta object literal for the '{@link formValidation.impl.AutocompleteComponentImpl <em>Autocomplete Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.AutocompleteComponentImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getAutocompleteComponent()
		 * @generated
		 */
		EClass AUTOCOMPLETE_COMPONENT = eINSTANCE.getAutocompleteComponent();

		/**
		 * The meta object literal for the '{@link formValidation.impl.ColorImpl <em>Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.impl.ColorImpl
		 * @see formValidation.impl.FormValidationPackageImpl#getColor()
		 * @generated
		 */
		EClass COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '<em><b>Red</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__RED = eINSTANCE.getColor_Red();

		/**
		 * The meta object literal for the '<em><b>Green</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__GREEN = eINSTANCE.getColor_Green();

		/**
		 * The meta object literal for the '<em><b>Blue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__BLUE = eINSTANCE.getColor_Blue();

		/**
		 * The meta object literal for the '{@link formValidation.EDataType <em>EData Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.EDataType
		 * @see formValidation.impl.FormValidationPackageImpl#getEDataType()
		 * @generated
		 */
		EEnum EDATA_TYPE = eINSTANCE.getEDataType();

		/**
		 * The meta object literal for the '{@link formValidation.EOrientation <em>EOrientation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.EOrientation
		 * @see formValidation.impl.FormValidationPackageImpl#getEOrientation()
		 * @generated
		 */
		EEnum EORIENTATION = eINSTANCE.getEOrientation();

		/**
		 * The meta object literal for the '{@link formValidation.ERequiredField <em>ERequired Field</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.ERequiredField
		 * @see formValidation.impl.FormValidationPackageImpl#getERequiredField()
		 * @generated
		 */
		EEnum EREQUIRED_FIELD = eINSTANCE.getERequiredField();

		/**
		 * The meta object literal for the '{@link formValidation.EPosition <em>EPosition</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.EPosition
		 * @see formValidation.impl.FormValidationPackageImpl#getEPosition()
		 * @generated
		 */
		EEnum EPOSITION = eINSTANCE.getEPosition();

		/**
		 * The meta object literal for the '{@link formValidation.EGridOrder <em>EGrid Order</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.EGridOrder
		 * @see formValidation.impl.FormValidationPackageImpl#getEGridOrder()
		 * @generated
		 */
		EEnum EGRID_ORDER = eINSTANCE.getEGridOrder();

		/**
		 * The meta object literal for the '{@link formValidation.EUINumberComponentType <em>EUI Number Component Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.EUINumberComponentType
		 * @see formValidation.impl.FormValidationPackageImpl#getEUINumberComponentType()
		 * @generated
		 */
		EEnum EUI_NUMBER_COMPONENT_TYPE = eINSTANCE.getEUINumberComponentType();

		/**
		 * The meta object literal for the '{@link formValidation.EDateUIType <em>EDate UI Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formValidation.EDateUIType
		 * @see formValidation.impl.FormValidationPackageImpl#getEDateUIType()
		 * @generated
		 */
		EEnum EDATE_UI_TYPE = eINSTANCE.getEDateUIType();

	}

} //FormValidationPackage
