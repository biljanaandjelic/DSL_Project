/**
 */
package formValidation.impl;

import formValidation.AcceptableValues;
import formValidation.AcceptableValuesDate;
import formValidation.AcceptableValuesString;
import formValidation.AttributeArray;
import formValidation.AttributeRule;
import formValidation.AttributeType;
import formValidation.CheckBox;
import formValidation.ClassAttribute;
import formValidation.ClassRule;
import formValidation.DatePattern;
import formValidation.DateUIComponent;
import formValidation.Dependancy;
import formValidation.DropDownList;
import formValidation.EOrientation;
import formValidation.EVrsta;
import formValidation.Email;
import formValidation.EnumerationUIComponent;
import formValidation.Equals;
import formValidation.FieldSet;
import formValidation.FormLayout;
import formValidation.FormValidationFactory;
import formValidation.FormValidationPackage;
import formValidation.GreaterThan;
import formValidation.Grid;
import formValidation.InputNumber;
import formValidation.Length;
import formValidation.LessThan;
import formValidation.Max;
import formValidation.MaxDate;
import formValidation.MaxLength;
import formValidation.MaxNumber;
import formValidation.Min;
import formValidation.MinDate;
import formValidation.MinLength;
import formValidation.MinNumber;
import formValidation.MultiSelectedDropDownList;
import formValidation.MultipleValues;
import formValidation.NotEquals;
import formValidation.NumericUIComponent;
import formValidation.Pattern;
import formValidation.RadioButton;
import formValidation.Required;
import formValidation.Scrollbar;
import formValidation.SingleValue;
import formValidation.StringPattern;
import formValidation.Tab;
import formValidation.TextArea;
import formValidation.TextInput;
import formValidation.TextUIComponent;
import formValidation.UIComponent;
import formValidation.ValidationClass;

import formValidation.util.FormValidationValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FormValidationPackageImpl extends EPackageImpl implements FormValidationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validationClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptableValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minLengthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maxLengthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lengthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minDateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maxNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maxDateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptableValuesStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptableValuesDateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datePatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notEqualsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterThanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lessThanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependancyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericUIComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scrollbarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationUIComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass radioButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dropDownListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiSelectedDropDownListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateUIComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textUIComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tabEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gridEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eVrstaEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eOrientationEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see formValidation.FormValidationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FormValidationPackageImpl() {
		super(eNS_URI, FormValidationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FormValidationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FormValidationPackage init() {
		if (isInited) return (FormValidationPackage)EPackage.Registry.INSTANCE.getEPackage(FormValidationPackage.eNS_URI);

		// Obtain or create and register package
		FormValidationPackageImpl theFormValidationPackage = (FormValidationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FormValidationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FormValidationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFormValidationPackage.createPackageContents();

		// Initialize created meta-data
		theFormValidationPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theFormValidationPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return FormValidationValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theFormValidationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FormValidationPackage.eNS_URI, theFormValidationPackage);
		return theFormValidationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValidationClass() {
		return validationClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValidationClass_Name() {
		return (EAttribute)validationClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValidationClass_Classattribute() {
		return (EReference)validationClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValidationClass_Classrule() {
		return (EReference)validationClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeRule() {
		return attributeRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeRule_ErrorMessage() {
		return (EAttribute)attributeRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassAttribute() {
		return classAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassAttribute_Name() {
		return (EAttribute)classAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassAttribute_Attributetype() {
		return (EReference)classAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassAttribute_Attributerule() {
		return (EReference)classAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeType() {
		return attributeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeType_Vrsta() {
		return (EAttribute)attributeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMin() {
		return minEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMax() {
		return maxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequired() {
		return requiredEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequired_IsRequired() {
		return (EAttribute)requiredEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmail() {
		return emailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmail_IsEmail() {
		return (EAttribute)emailEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptableValues() {
		return acceptableValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern() {
		return patternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinLength() {
		return minLengthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMinLength_Value() {
		return (EAttribute)minLengthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaxLength() {
		return maxLengthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaxLength_Value() {
		return (EAttribute)maxLengthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLength() {
		return lengthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLength_Value() {
		return (EAttribute)lengthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinNumber() {
		return minNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMinNumber_Value() {
		return (EAttribute)minNumberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinDate() {
		return minDateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMinDate_Value() {
		return (EAttribute)minDateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaxNumber() {
		return maxNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaxNumber_Value() {
		return (EAttribute)maxNumberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaxDate() {
		return maxDateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaxDate_Value() {
		return (EAttribute)maxDateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptableValuesString() {
		return acceptableValuesStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAcceptableValuesString_Values() {
		return (EAttribute)acceptableValuesStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptableValuesDate() {
		return acceptableValuesDateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAcceptableValuesDate_Values() {
		return (EAttribute)acceptableValuesDateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringPattern() {
		return stringPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringPattern_Value() {
		return (EAttribute)stringPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatePattern() {
		return datePatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatePattern_Value() {
		return (EAttribute)datePatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassRule() {
		return classRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotEquals() {
		return notEqualsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotEquals_Attributearray() {
		return (EReference)notEqualsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGreaterThan() {
		return greaterThanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGreaterThan_Classattribute() {
		return (EReference)greaterThanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGreaterThan_Attributearray() {
		return (EReference)greaterThanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquals() {
		return equalsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquals_Attributearray() {
		return (EReference)equalsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLessThan() {
		return lessThanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLessThan_Classattribute() {
		return (EReference)lessThanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLessThan_Attributearray() {
		return (EReference)lessThanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeArray() {
		return attributeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeArray_Classattribute() {
		return (EReference)attributeArrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIComponent() {
		return uiComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIComponent_Tooltip() {
		return (EAttribute)uiComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependancy() {
		return dependancyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericUIComponent() {
		return numericUIComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericUIComponent_DefaultValue() {
		return (EAttribute)numericUIComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputNumber() {
		return inputNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScrollbar() {
		return scrollbarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationUIComponent() {
		return enumerationUIComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleValue() {
		return singleValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultipleValues() {
		return multipleValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRadioButton() {
		return radioButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadioButton_Orientation() {
		return (EAttribute)radioButtonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDropDownList() {
		return dropDownListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckBox() {
		return checkBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckBox_Orientation() {
		return (EAttribute)checkBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiSelectedDropDownList() {
		return multiSelectedDropDownListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateUIComponent() {
		return dateUIComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextUIComponent() {
		return textUIComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextInput() {
		return textInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextArea() {
		return textAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextArea_NumOfRows() {
		return (EAttribute)textAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormLayout() {
		return formLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldSet() {
		return fieldSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldSet_Legend() {
		return (EAttribute)fieldSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTab() {
		return tabEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTab_Name() {
		return (EAttribute)tabEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrid() {
		return gridEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrid_NumOfColumns() {
		return (EAttribute)gridEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEVrsta() {
		return eVrstaEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEOrientation() {
		return eOrientationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormValidationFactory getFormValidationFactory() {
		return (FormValidationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		validationClassEClass = createEClass(VALIDATION_CLASS);
		createEAttribute(validationClassEClass, VALIDATION_CLASS__NAME);
		createEReference(validationClassEClass, VALIDATION_CLASS__CLASSATTRIBUTE);
		createEReference(validationClassEClass, VALIDATION_CLASS__CLASSRULE);

		attributeRuleEClass = createEClass(ATTRIBUTE_RULE);
		createEAttribute(attributeRuleEClass, ATTRIBUTE_RULE__ERROR_MESSAGE);

		classAttributeEClass = createEClass(CLASS_ATTRIBUTE);
		createEAttribute(classAttributeEClass, CLASS_ATTRIBUTE__NAME);
		createEReference(classAttributeEClass, CLASS_ATTRIBUTE__ATTRIBUTETYPE);
		createEReference(classAttributeEClass, CLASS_ATTRIBUTE__ATTRIBUTERULE);

		attributeTypeEClass = createEClass(ATTRIBUTE_TYPE);
		createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__VRSTA);

		minEClass = createEClass(MIN);

		maxEClass = createEClass(MAX);

		requiredEClass = createEClass(REQUIRED);
		createEAttribute(requiredEClass, REQUIRED__IS_REQUIRED);

		emailEClass = createEClass(EMAIL);
		createEAttribute(emailEClass, EMAIL__IS_EMAIL);

		acceptableValuesEClass = createEClass(ACCEPTABLE_VALUES);

		patternEClass = createEClass(PATTERN);

		minLengthEClass = createEClass(MIN_LENGTH);
		createEAttribute(minLengthEClass, MIN_LENGTH__VALUE);

		maxLengthEClass = createEClass(MAX_LENGTH);
		createEAttribute(maxLengthEClass, MAX_LENGTH__VALUE);

		lengthEClass = createEClass(LENGTH);
		createEAttribute(lengthEClass, LENGTH__VALUE);

		minNumberEClass = createEClass(MIN_NUMBER);
		createEAttribute(minNumberEClass, MIN_NUMBER__VALUE);

		minDateEClass = createEClass(MIN_DATE);
		createEAttribute(minDateEClass, MIN_DATE__VALUE);

		maxNumberEClass = createEClass(MAX_NUMBER);
		createEAttribute(maxNumberEClass, MAX_NUMBER__VALUE);

		maxDateEClass = createEClass(MAX_DATE);
		createEAttribute(maxDateEClass, MAX_DATE__VALUE);

		acceptableValuesStringEClass = createEClass(ACCEPTABLE_VALUES_STRING);
		createEAttribute(acceptableValuesStringEClass, ACCEPTABLE_VALUES_STRING__VALUES);

		acceptableValuesDateEClass = createEClass(ACCEPTABLE_VALUES_DATE);
		createEAttribute(acceptableValuesDateEClass, ACCEPTABLE_VALUES_DATE__VALUES);

		stringPatternEClass = createEClass(STRING_PATTERN);
		createEAttribute(stringPatternEClass, STRING_PATTERN__VALUE);

		datePatternEClass = createEClass(DATE_PATTERN);
		createEAttribute(datePatternEClass, DATE_PATTERN__VALUE);

		classRuleEClass = createEClass(CLASS_RULE);

		notEqualsEClass = createEClass(NOT_EQUALS);
		createEReference(notEqualsEClass, NOT_EQUALS__ATTRIBUTEARRAY);

		greaterThanEClass = createEClass(GREATER_THAN);
		createEReference(greaterThanEClass, GREATER_THAN__CLASSATTRIBUTE);
		createEReference(greaterThanEClass, GREATER_THAN__ATTRIBUTEARRAY);

		equalsEClass = createEClass(EQUALS);
		createEReference(equalsEClass, EQUALS__ATTRIBUTEARRAY);

		lessThanEClass = createEClass(LESS_THAN);
		createEReference(lessThanEClass, LESS_THAN__CLASSATTRIBUTE);
		createEReference(lessThanEClass, LESS_THAN__ATTRIBUTEARRAY);

		attributeArrayEClass = createEClass(ATTRIBUTE_ARRAY);
		createEReference(attributeArrayEClass, ATTRIBUTE_ARRAY__CLASSATTRIBUTE);

		uiComponentEClass = createEClass(UI_COMPONENT);
		createEAttribute(uiComponentEClass, UI_COMPONENT__TOOLTIP);

		dependancyEClass = createEClass(DEPENDANCY);

		numericUIComponentEClass = createEClass(NUMERIC_UI_COMPONENT);
		createEAttribute(numericUIComponentEClass, NUMERIC_UI_COMPONENT__DEFAULT_VALUE);

		inputNumberEClass = createEClass(INPUT_NUMBER);

		scrollbarEClass = createEClass(SCROLLBAR);

		enumerationUIComponentEClass = createEClass(ENUMERATION_UI_COMPONENT);

		singleValueEClass = createEClass(SINGLE_VALUE);

		multipleValuesEClass = createEClass(MULTIPLE_VALUES);

		radioButtonEClass = createEClass(RADIO_BUTTON);
		createEAttribute(radioButtonEClass, RADIO_BUTTON__ORIENTATION);

		dropDownListEClass = createEClass(DROP_DOWN_LIST);

		checkBoxEClass = createEClass(CHECK_BOX);
		createEAttribute(checkBoxEClass, CHECK_BOX__ORIENTATION);

		multiSelectedDropDownListEClass = createEClass(MULTI_SELECTED_DROP_DOWN_LIST);

		dateUIComponentEClass = createEClass(DATE_UI_COMPONENT);

		textUIComponentEClass = createEClass(TEXT_UI_COMPONENT);

		textInputEClass = createEClass(TEXT_INPUT);

		textAreaEClass = createEClass(TEXT_AREA);
		createEAttribute(textAreaEClass, TEXT_AREA__NUM_OF_ROWS);

		formLayoutEClass = createEClass(FORM_LAYOUT);

		fieldSetEClass = createEClass(FIELD_SET);
		createEAttribute(fieldSetEClass, FIELD_SET__LEGEND);

		tabEClass = createEClass(TAB);
		createEAttribute(tabEClass, TAB__NAME);

		gridEClass = createEClass(GRID);
		createEAttribute(gridEClass, GRID__NUM_OF_COLUMNS);

		// Create enums
		eVrstaEEnum = createEEnum(EVRSTA);
		eOrientationEEnum = createEEnum(EORIENTATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		minEClass.getESuperTypes().add(this.getAttributeRule());
		maxEClass.getESuperTypes().add(this.getAttributeRule());
		requiredEClass.getESuperTypes().add(this.getAttributeRule());
		emailEClass.getESuperTypes().add(this.getAttributeRule());
		acceptableValuesEClass.getESuperTypes().add(this.getAttributeRule());
		patternEClass.getESuperTypes().add(this.getAttributeRule());
		minLengthEClass.getESuperTypes().add(this.getAttributeRule());
		maxLengthEClass.getESuperTypes().add(this.getAttributeRule());
		lengthEClass.getESuperTypes().add(this.getAttributeRule());
		minNumberEClass.getESuperTypes().add(this.getMin());
		minDateEClass.getESuperTypes().add(this.getMin());
		maxNumberEClass.getESuperTypes().add(this.getMax());
		maxDateEClass.getESuperTypes().add(this.getMax());
		acceptableValuesStringEClass.getESuperTypes().add(this.getAcceptableValues());
		acceptableValuesDateEClass.getESuperTypes().add(this.getAcceptableValues());
		stringPatternEClass.getESuperTypes().add(this.getPattern());
		datePatternEClass.getESuperTypes().add(this.getPattern());
		notEqualsEClass.getESuperTypes().add(this.getClassRule());
		greaterThanEClass.getESuperTypes().add(this.getClassRule());
		equalsEClass.getESuperTypes().add(this.getClassRule());
		lessThanEClass.getESuperTypes().add(this.getClassRule());
		numericUIComponentEClass.getESuperTypes().add(this.getUIComponent());
		inputNumberEClass.getESuperTypes().add(this.getNumericUIComponent());
		scrollbarEClass.getESuperTypes().add(this.getNumericUIComponent());
		enumerationUIComponentEClass.getESuperTypes().add(this.getNumericUIComponent());
		singleValueEClass.getESuperTypes().add(this.getEnumerationUIComponent());
		multipleValuesEClass.getESuperTypes().add(this.getEnumerationUIComponent());
		radioButtonEClass.getESuperTypes().add(this.getSingleValue());
		dropDownListEClass.getESuperTypes().add(this.getSingleValue());
		checkBoxEClass.getESuperTypes().add(this.getMultipleValues());
		multiSelectedDropDownListEClass.getESuperTypes().add(this.getMultipleValues());
		dateUIComponentEClass.getESuperTypes().add(this.getUIComponent());
		textUIComponentEClass.getESuperTypes().add(this.getUIComponent());
		textInputEClass.getESuperTypes().add(this.getTextUIComponent());
		textAreaEClass.getESuperTypes().add(this.getTextUIComponent());
		fieldSetEClass.getESuperTypes().add(this.getFormLayout());
		tabEClass.getESuperTypes().add(this.getFormLayout());
		gridEClass.getESuperTypes().add(this.getFormLayout());

		// Initialize classes, features, and operations; add parameters
		initEClass(validationClassEClass, ValidationClass.class, "ValidationClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValidationClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, ValidationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValidationClass_Classattribute(), this.getClassAttribute(), null, "classattribute", null, 0, -1, ValidationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValidationClass_Classrule(), this.getClassRule(), null, "classrule", null, 0, -1, ValidationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeRuleEClass, AttributeRule.class, "AttributeRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeRule_ErrorMessage(), ecorePackage.getEString(), "errorMessage", null, 0, 1, AttributeRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classAttributeEClass, ClassAttribute.class, "ClassAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, ClassAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassAttribute_Attributetype(), this.getAttributeType(), null, "attributetype", null, 1, 1, ClassAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassAttribute_Attributerule(), this.getAttributeRule(), null, "attributerule", null, 0, -1, ClassAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeTypeEClass, AttributeType.class, "AttributeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeType_Vrsta(), this.getEVrsta(), "vrsta", null, 0, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(minEClass, Min.class, "Min", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(maxEClass, Max.class, "Max", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requiredEClass, Required.class, "Required", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequired_IsRequired(), ecorePackage.getEBoolean(), "isRequired", null, 0, 1, Required.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emailEClass, Email.class, "Email", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmail_IsEmail(), ecorePackage.getEBoolean(), "isEmail", null, 0, 1, Email.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(acceptableValuesEClass, AcceptableValues.class, "AcceptableValues", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(patternEClass, Pattern.class, "Pattern", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(minLengthEClass, MinLength.class, "MinLength", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMinLength_Value(), theXMLTypePackage.getInt(), "value", null, 0, 1, MinLength.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(maxLengthEClass, MaxLength.class, "MaxLength", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaxLength_Value(), theXMLTypePackage.getInt(), "value", null, 0, 1, MaxLength.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lengthEClass, Length.class, "Length", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLength_Value(), theXMLTypePackage.getInt(), "value", null, 0, 1, Length.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(minNumberEClass, MinNumber.class, "MinNumber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMinNumber_Value(), theXMLTypePackage.getFloat(), "value", null, 0, 1, MinNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(minDateEClass, MinDate.class, "MinDate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMinDate_Value(), ecorePackage.getEString(), "value", null, 0, 1, MinDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(maxNumberEClass, MaxNumber.class, "MaxNumber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaxNumber_Value(), theXMLTypePackage.getFloat(), "value", null, 0, 1, MaxNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(maxDateEClass, MaxDate.class, "MaxDate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaxDate_Value(), ecorePackage.getEString(), "value", null, 0, 1, MaxDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(acceptableValuesStringEClass, AcceptableValuesString.class, "AcceptableValuesString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAcceptableValuesString_Values(), ecorePackage.getEString(), "values", null, 0, -1, AcceptableValuesString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(acceptableValuesDateEClass, AcceptableValuesDate.class, "AcceptableValuesDate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAcceptableValuesDate_Values(), ecorePackage.getEString(), "values", null, 0, -1, AcceptableValuesDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringPatternEClass, StringPattern.class, "StringPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringPattern_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datePatternEClass, DatePattern.class, "DatePattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatePattern_Value(), ecorePackage.getEString(), "value", "dd/MM/yyyy", 0, 1, DatePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classRuleEClass, ClassRule.class, "ClassRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(notEqualsEClass, NotEquals.class, "NotEquals", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotEquals_Attributearray(), this.getAttributeArray(), null, "attributearray", null, 0, 1, NotEquals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(greaterThanEClass, GreaterThan.class, "GreaterThan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGreaterThan_Classattribute(), this.getClassAttribute(), null, "classattribute", null, 0, 1, GreaterThan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGreaterThan_Attributearray(), this.getAttributeArray(), null, "attributearray", null, 0, -1, GreaterThan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equalsEClass, Equals.class, "Equals", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEquals_Attributearray(), this.getAttributeArray(), null, "attributearray", null, 0, 1, Equals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lessThanEClass, LessThan.class, "LessThan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLessThan_Classattribute(), this.getClassAttribute(), null, "classattribute", null, 0, 1, LessThan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLessThan_Attributearray(), this.getAttributeArray(), null, "attributearray", null, 0, -1, LessThan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeArrayEClass, AttributeArray.class, "AttributeArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeArray_Classattribute(), this.getClassAttribute(), null, "classattribute", null, 0, -1, AttributeArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiComponentEClass, UIComponent.class, "UIComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUIComponent_Tooltip(), ecorePackage.getEString(), "tooltip", null, 0, 1, UIComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependancyEClass, Dependancy.class, "Dependancy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numericUIComponentEClass, NumericUIComponent.class, "NumericUIComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumericUIComponent_DefaultValue(), ecorePackage.getEDouble(), "defaultValue", null, 0, 1, NumericUIComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputNumberEClass, InputNumber.class, "InputNumber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scrollbarEClass, Scrollbar.class, "Scrollbar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumerationUIComponentEClass, EnumerationUIComponent.class, "EnumerationUIComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(singleValueEClass, SingleValue.class, "SingleValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multipleValuesEClass, MultipleValues.class, "MultipleValues", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(radioButtonEClass, RadioButton.class, "RadioButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRadioButton_Orientation(), this.getEOrientation(), "orientation", null, 0, 1, RadioButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dropDownListEClass, DropDownList.class, "DropDownList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(checkBoxEClass, CheckBox.class, "CheckBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCheckBox_Orientation(), this.getEOrientation(), "orientation", null, 0, 1, CheckBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiSelectedDropDownListEClass, MultiSelectedDropDownList.class, "MultiSelectedDropDownList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dateUIComponentEClass, DateUIComponent.class, "DateUIComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textUIComponentEClass, TextUIComponent.class, "TextUIComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textInputEClass, TextInput.class, "TextInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textAreaEClass, TextArea.class, "TextArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextArea_NumOfRows(), ecorePackage.getEInt(), "numOfRows", "1", 0, 1, TextArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formLayoutEClass, FormLayout.class, "FormLayout", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fieldSetEClass, FieldSet.class, "FieldSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFieldSet_Legend(), ecorePackage.getEString(), "legend", null, 0, 1, FieldSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tabEClass, Tab.class, "Tab", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTab_Name(), ecorePackage.getEString(), "name", null, 0, 1, Tab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gridEClass, Grid.class, "Grid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGrid_NumOfColumns(), ecorePackage.getEInt(), "numOfColumns", null, 0, 1, Grid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(eVrstaEEnum, EVrsta.class, "EVrsta");
		addEEnumLiteral(eVrstaEEnum, EVrsta.STRING);
		addEEnumLiteral(eVrstaEEnum, EVrsta.NUMBER);
		addEEnumLiteral(eVrstaEEnum, EVrsta.DATE);

		initEEnum(eOrientationEEnum, EOrientation.class, "EOrientation");
		addEEnumLiteral(eOrientationEEnum, EOrientation.VERTICAL);
		addEEnumLiteral(eOrientationEEnum, EOrientation.HORIZONTAL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore",
			 "ecore.xml.type", "http://www.eclipse.org/emf/2003/XMLType"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (validationClassEClass, 
		   source, 
		   new String[] {
			 "constraints", "differentClassAttributes"
		   });	
		addAnnotation
		  (classAttributeEClass, 
		   source, 
		   new String[] {
			 "constraints", "uniqueAttributeRules appropriateAttributeRules comparedMinMax compareMinMaxLength"
		   });	
		addAnnotation
		  (minLengthEClass, 
		   source, 
		   new String[] {
			 "constraints", "minLengthValue"
		   });	
		addAnnotation
		  (maxLengthEClass, 
		   source, 
		   new String[] {
			 "constraints", "maxLengthValue"
		   });	
		addAnnotation
		  (lengthEClass, 
		   source, 
		   new String[] {
			 "constraints", "lengthValue"
		   });	
		addAnnotation
		  (datePatternEClass, 
		   source, 
		   new String[] {
			 "constraints", "structureOfRegex"
		   });	
		addAnnotation
		  (notEqualsEClass, 
		   source, 
		   new String[] {
			 "constraints", "areEqualTypes differentDataInArray"
		   });	
		addAnnotation
		  (greaterThanEClass, 
		   source, 
		   new String[] {
			 "constraints", "acceptbleDataType differentAttributes differentAttributesInArray equalTypes"
		   });	
		addAnnotation
		  (equalsEClass, 
		   source, 
		   new String[] {
			 "constraints", "collectionSize areEqualTypes"
		   });	
		addAnnotation
		  (lessThanEClass, 
		   source, 
		   new String[] {
			 "constraints", "acceptbleDataType differentAttributes equalTypes"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (validationClassEClass, 
		   source, 
		   new String[] {
			 "differentClassAttributes", "Tuple {\n\tmessage : String = \'All attributes should be different\',\n\tstatus : Boolean = \n\t\t classattribute-> forAll(a1: ClassAttribute, a2: ClassAttribute | \n\t\t \tif a1<>a2 then a1.name <> a2.name else true endif\n\t\t )\n}.status"
		   });	
		addAnnotation
		  (classAttributeEClass, 
		   source, 
		   new String[] {
			 "uniqueAttributeRules", "\n\t\t\t attributerule->forAll(a1: AttributeRule, a2: AttributeRule |if  a1 <> a2 then\n\t\t\t \tnot a1.oclIsTypeOf(a2.oclType()) else true endif\n\t\t\t )",
			 "appropriateAttributeRules", "Tuple {\n\tmessage : String = \'Each data type has appropriate rulles that can be applay to it.\',\n\tstatus : Boolean = \n\t\tif attributetype.vrsta = EVrsta::Number\n\t\tthen\n\t\t\tattributerule-> forAll(a1: AttributeRule | a1.oclIsKindOf(MaxNumber) or a1.oclIsKindOf(MinNumber) or a1.oclIsKindOf(Required))\n\t\telse\n\t\t  if attributetype.vrsta = EVrsta::_\'String\'\n\t\t  then\n\t\t   attributerule-> forAll(a1: AttributeRule | a1.oclIsKindOf(MinLength) or a1.oclIsKindOf(MaxLength) or \n\t\t   \ta1.oclIsKindOf(Length) or a1.oclIsKindOf(Required) or a1.oclIsKindOf(Pattern) or a1.oclIsKindOf(AcceptableValuesString)\n\t\t   \tor a1.oclIsKindOf(Email)\n\t\t   )\n\t\t  else\n\t\t  attributerule-> forAll(a1: AttributeRule | a1.oclIsKindOf(MaxDate) or a1.oclIsKindOf(MinDate) or a1.oclIsKindOf(Required) \n\t\t  or a1.oclIsKindOf(AcceptableValuesDate)or a1.oclIsKindOf(DatePattern))\n\t\t  endif\n\t\tendif\n\t\t\n}.status",
			 "comparedMinMax", "Tuple {\n\tmessage : String = \'Max value should be greater than min value\',\n\tstatus : Boolean = \n\t\tattributerule-> forAll(a1: AttributeRule, a2: AttributeRule | \n\t\t\tif a1.oclIsKindOf(MaxNumber) and a2.oclIsKindOf(MinNumber)\n\t\t\tthen\n\t\t\t\ta1.oclAsType(MaxNumber).value >= a2.oclAsType(MinNumber).value \n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif\n\t\t)\n}.status",
			 "compareMinMaxLength", "Tuple {\n\tmessage : String = \'Maxlength value should be greater than maxlength\',\n\tstatus : Boolean = \n\t\t\tattributerule-> forAll(a1: AttributeRule, a2: AttributeRule | \n\t\t\tif a1.oclIsKindOf(MaxLength) and a2.oclIsKindOf(MinLength)\n\t\t\tthen\n\t\t\t\ta1.oclAsType(MaxLength).value >= a2.oclAsType(MinLength).value\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif\n\t\t)\n}.status"
		   });	
		addAnnotation
		  (minLengthEClass, 
		   source, 
		   new String[] {
			 "minLengthValue", "Tuple {\n\tmessage : String = \'MaxLength cannot be less than zero\',\n\tstatus : Boolean = \n\t\t\tvalue > 0\n}.status"
		   });	
		addAnnotation
		  (maxLengthEClass, 
		   source, 
		   new String[] {
			 "maxLengthValue", "Tuple {\n\tmessage : String = \'MaxLength cannot be less than zero\',\n\tstatus : Boolean = \n\t\t\tvalue > 0\n}.status"
		   });	
		addAnnotation
		  (lengthEClass, 
		   source, 
		   new String[] {
			 "lengthValue", "Tuple {\n\tmessage : String = \'MaxLength cannot be less than zero\',\n\tstatus : Boolean = \n\t\t\tvalue > 0\n}.status"
		   });	
		addAnnotation
		  (datePatternEClass, 
		   source, 
		   new String[] {
			 "structureOfRegex", "\n\t\tvalue.matches(\'dd.MM.yyyy\') or value.matches(\'dd.MMM.yyyy\') or value.matches(\'dd-MMM-yyyy\')\n\t\tor value.matches(\'dd/MMM/yyyy\') or value.matches(\'dd-MM-yyyy\') or value.matches(\'dd/MM/yyyy\')"
		   });	
		addAnnotation
		  (notEqualsEClass, 
		   source, 
		   new String[] {
			 "areEqualTypes", "Tuple {\n\tmessage : String = \'In equal rule all data types should be same.\',\n\tstatus : Boolean = \n\t\t\tattributearray.classattribute -> forAll(a1: ClassAttribute, a2: ClassAttribute | \n\t\t\t\tif a1<>a2 then \n\t\t\t\ta1.attributetype.vrsta = a2.attributetype.vrsta\n\t\t\t\telse true\n\t\t\t\tendif\n\t\t\t)\n}.status",
			 "differentDataInArray", "Tuple {\n\tmessage : String = \'All attributes should be different\',\n\tstatus : Boolean = \n\t\t attributearray.classattribute -> forAll(a1: ClassAttribute, a2: ClassAttribute |\n\t\t \tif a1<>a2 then\n\t\t \ta1.name <> a2.name\n\t\t \telse true\n\t\t \tendif\n\t\t )\n}.status"
		   });	
		addAnnotation
		  (greaterThanEClass, 
		   source, 
		   new String[] {
			 "acceptbleDataType", "Tuple {\n\tmessage : String = \'It is possible to compare just attibutes type of date or type of number.\',\n\tstatus : Boolean = \n\t\t\tclassattribute.attributetype.vrsta = EVrsta::Number or classattribute.attributetype.vrsta = EVrsta::Date\n}.status",
			 "differentAttributes", "Tuple {\n\tmessage : String = \'First attribute and attributes from array should be different\',\n\tstatus : Boolean = \n\t\t\tattributearray.classattribute -> forAll(a1: ClassAttribute | classattribute.name <> a1.name)\n}.status",
			 "differentAttributesInArray", "Tuple {\n\tmessage : String = \'Attributes in array must be different\',\n\tstatus : Boolean = \n\t\t\t attributearray.classattribute -> forAll(a1: ClassAttribute, a2: ClassAttribute | if a1<>a2 then\n\t\t\t \ta1.name <> a2.name\n\t\t\t \telse true\n\t\t\t \tendif\n\t\t\t )\n}.status",
			 "equalTypes", "Tuple {\n\tmessage : String = \'Data type should be same\',\n\tstatus : Boolean = \n\t\t\tattributearray.classattribute -> forAll(a1: ClassAttribute | a1.attributetype.vrsta = classattribute.attributetype.vrsta)\n}.status"
		   });	
		addAnnotation
		  (equalsEClass, 
		   source, 
		   new String[] {
			 "collectionSize", "\n\t\t\tattributearray.classattribute -> size() >= 2",
			 "areEqualTypes", "Tuple {\n\tmessage : String = \'In equal rule all data types should be same.\',\n\tstatus : Boolean = \n\t\t\tattributearray.classattribute -> forAll(a1: ClassAttribute, a2: ClassAttribute | a1.attributetype.vrsta = a2.attributetype.vrsta)\n}.status"
		   });	
		addAnnotation
		  (lessThanEClass, 
		   source, 
		   new String[] {
			 "acceptbleDataType", "Tuple {\n\tmessage : String = \'It is possible to compare just attibutes type of date or type of number.\',\n\tstatus : Boolean = \n\t\t\tclassattribute.attributetype.vrsta = EVrsta::Number or classattribute.attributetype.vrsta = EVrsta::Date\n}.status",
			 "differentAttributes", "\n\t\t\tattributearray.classattribute -> forAll(a1: ClassAttribute | classattribute.name <> a1.name)",
			 "equalTypes", "\n\t\t\tattributearray.classattribute -> forAll(a1: ClassAttribute | a1.attributetype.vrsta = classattribute.attributetype.vrsta)"
		   });
	}

} //FormValidationPackageImpl
