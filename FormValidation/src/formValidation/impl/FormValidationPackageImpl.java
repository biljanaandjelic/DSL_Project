/**
 */
package formValidation.impl;

import formValidation.AcceptableValues;
import formValidation.AcceptableValuesDate;
import formValidation.AcceptableValuesString;
import formValidation.AdditionalSettings;
import formValidation.AttributeArray;
import formValidation.AttributeDataType;
import formValidation.AttributeRule;
import formValidation.AttributeSettings;
import formValidation.AttributeType;
import formValidation.AutocompleteComponent;
import formValidation.BusinessModel;
import formValidation.CheckBox;
import formValidation.ClassAttribute;
import formValidation.ClassRule;
import formValidation.Color;
import formValidation.DatePattern;
import formValidation.DateUIComponent;
import formValidation.DropDownList;
import formValidation.EDataType;
import formValidation.EDateUIType;
import formValidation.EGridOrder;
import formValidation.EOrientation;
import formValidation.EPosition;
import formValidation.ERequiredField;
import formValidation.EUINumberComponentType;
import formValidation.EmailInput;
import formValidation.EnumerationUIComponent;
import formValidation.Equals;
import formValidation.ErrorMessage;
import formValidation.ErrorMessageSettings;
import formValidation.FieldSet;
import formValidation.FileInput;
import formValidation.FormLayout;
import formValidation.FormSettings;
import formValidation.FormValidationFactory;
import formValidation.FormValidationPackage;
import formValidation.GreaterThan;
import formValidation.Grid;
import formValidation.LabelSettings;
import formValidation.Length;
import formValidation.LessThan;
import formValidation.LoadValues;
import formValidation.Max;
import formValidation.MaxDate;
import formValidation.MaxLength;
import formValidation.MaxNumber;
import formValidation.Min;
import formValidation.MinDate;
import formValidation.MinLength;
import formValidation.MinNumber;
import formValidation.NonPrimitiveDataType;
import formValidation.NotEquals;
import formValidation.NoteSettings;
import formValidation.NumericUIComponent;
import formValidation.OverviewSettings;
import formValidation.Pagination;
import formValidation.Password;
import formValidation.Pattern;
import formValidation.PrimitiveDataType;
import formValidation.RadioButton;
import formValidation.RefEntity;
import formValidation.Required;
import formValidation.SelectingUIComponent;
import formValidation.StringPattern;
import formValidation.Tab;
import formValidation.TableOverview;
import formValidation.TelInput;
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
	private EClass numericUIComponentEClass = null;

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
	private EClass attributeSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass telInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emailInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passwordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionalSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonPrimitiveDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorMessageSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paginationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableOverviewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass overviewSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noteSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectingUIComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass autocompleteComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eDataTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eOrientationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eRequiredFieldEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ePositionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eGridOrderEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum euiNumberComponentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eDateUITypeEEnum = null;

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
	public EAttribute getValidationClass_Label() {
		return (EAttribute)validationClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValidationClass_Formlayout() {
		return (EReference)validationClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValidationClass_AdditionalSettings() {
		return (EReference)validationClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValidationClass_Overviewsettings() {
		return (EReference)validationClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValidationClass_Attr() {
		return (EAttribute)validationClassEClass.getEStructuralFeatures().get(7);
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
	public EReference getAttributeRule_AttributeRuleErrorMessage() {
		return (EReference)attributeRuleEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getClassAttribute_Label() {
		return (EAttribute)classAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassAttribute_Master() {
		return (EAttribute)classAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassAttribute_IsClassRepresenting() {
		return (EAttribute)classAttributeEClass.getEStructuralFeatures().get(5);
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
	public EReference getAttributeType_UiComponent() {
		return (EReference)attributeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeType_AttributeDataType() {
		return (EReference)attributeTypeEClass.getEStructuralFeatures().get(1);
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
	public EReference getClassRule_ClassRuleErrorMessage() {
		return (EReference)classRuleEClass.getEStructuralFeatures().get(0);
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
	public EReference getAttributeArray_Attributes() {
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
	public EAttribute getUIComponent_Note() {
		return (EAttribute)uiComponentEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getNumericUIComponent_ComponentType() {
		return (EAttribute)numericUIComponentEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getDropDownList_IsMultiSelect() {
		return (EAttribute)dropDownListEClass.getEStructuralFeatures().get(0);
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
	public EClass getDateUIComponent() {
		return dateUIComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateUIComponent_Type() {
		return (EAttribute)dateUIComponentEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getTextUIComponent_PlaceHolder() {
		return (EAttribute)textUIComponentEClass.getEStructuralFeatures().get(0);
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
	public EReference getFormLayout_Attributearray() {
		return (EReference)formLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormLayout_Layouts() {
		return (EReference)formLayoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormLayout_Name() {
		return (EAttribute)formLayoutEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getTab_Label() {
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
	public EClass getAttributeSettings() {
		return attributeSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeSettings_Presentation() {
		return (EAttribute)attributeSettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelSettings() {
		return labelSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelSettings_Position() {
		return (EAttribute)labelSettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorMessage() {
		return errorMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorMessage_Message() {
		return (EAttribute)errorMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTelInput() {
		return telInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmailInput() {
		return emailInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPassword() {
		return passwordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassword_Visible() {
		return (EAttribute)passwordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdditionalSettings() {
		return additionalSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileInput() {
		return fileInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileInput_ButtonPosition() {
		return (EAttribute)fileInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeDataType() {
		return attributeDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeDataType_IsCollection() {
		return (EAttribute)attributeDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveDataType() {
		return primitiveDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveDataType_Type() {
		return (EAttribute)primitiveDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonPrimitiveDataType() {
		return nonPrimitiveDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNonPrimitiveDataType_Type() {
		return (EReference)nonPrimitiveDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefEntity() {
		return refEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRefEntity_IsSingeValue() {
		return (EAttribute)refEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessModel() {
		return businessModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessModel_Validationclasses() {
		return (EReference)businessModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessModel_Label() {
		return (EAttribute)businessModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessModel_Description() {
		return (EAttribute)businessModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorMessageSettings() {
		return errorMessageSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorMessageSettings_Position() {
		return (EAttribute)errorMessageSettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorMessageSettings_Color() {
		return (EReference)errorMessageSettingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormSettings() {
		return formSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormSettings_AutoComplete() {
		return (EAttribute)formSettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPagination() {
		return paginationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPagination_PossibleNumberOfShownRows() {
		return (EAttribute)paginationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPagination_DefaultNumOfShownRows() {
		return (EAttribute)paginationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableOverview() {
		return tableOverviewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableOverview_Name() {
		return (EAttribute)tableOverviewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableOverview_Height() {
		return (EAttribute)tableOverviewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableOverview_Paging() {
		return (EReference)tableOverviewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableOverview_Width() {
		return (EAttribute)tableOverviewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableOverview_Title() {
		return (EAttribute)tableOverviewEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOverviewSettings() {
		return overviewSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOverviewSettings_Tableoverview() {
		return (EReference)overviewSettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoteSettings() {
		return noteSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoteSettings_Position() {
		return (EAttribute)noteSettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectingUIComponent() {
		return selectingUIComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoadValues() {
		return loadValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadValues_IsMultiSelect() {
		return (EAttribute)loadValuesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutocompleteComponent() {
		return autocompleteComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColor() {
		return colorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColor_Red() {
		return (EAttribute)colorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColor_Green() {
		return (EAttribute)colorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColor_Blue() {
		return (EAttribute)colorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEDataType() {
		return eDataTypeEEnum;
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
	public EEnum getERequiredField() {
		return eRequiredFieldEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEPosition() {
		return ePositionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEGridOrder() {
		return eGridOrderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEUINumberComponentType() {
		return euiNumberComponentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEDateUIType() {
		return eDateUITypeEEnum;
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
		createEAttribute(validationClassEClass, VALIDATION_CLASS__LABEL);
		createEReference(validationClassEClass, VALIDATION_CLASS__FORMLAYOUT);
		createEReference(validationClassEClass, VALIDATION_CLASS__ADDITIONAL_SETTINGS);
		createEReference(validationClassEClass, VALIDATION_CLASS__OVERVIEWSETTINGS);
		createEAttribute(validationClassEClass, VALIDATION_CLASS__ATTR);

		attributeRuleEClass = createEClass(ATTRIBUTE_RULE);
		createEReference(attributeRuleEClass, ATTRIBUTE_RULE__ATTRIBUTE_RULE_ERROR_MESSAGE);

		classAttributeEClass = createEClass(CLASS_ATTRIBUTE);
		createEAttribute(classAttributeEClass, CLASS_ATTRIBUTE__NAME);
		createEReference(classAttributeEClass, CLASS_ATTRIBUTE__ATTRIBUTETYPE);
		createEReference(classAttributeEClass, CLASS_ATTRIBUTE__ATTRIBUTERULE);
		createEAttribute(classAttributeEClass, CLASS_ATTRIBUTE__LABEL);
		createEAttribute(classAttributeEClass, CLASS_ATTRIBUTE__MASTER);
		createEAttribute(classAttributeEClass, CLASS_ATTRIBUTE__IS_CLASS_REPRESENTING);

		attributeTypeEClass = createEClass(ATTRIBUTE_TYPE);
		createEReference(attributeTypeEClass, ATTRIBUTE_TYPE__UI_COMPONENT);
		createEReference(attributeTypeEClass, ATTRIBUTE_TYPE__ATTRIBUTE_DATA_TYPE);

		minEClass = createEClass(MIN);

		maxEClass = createEClass(MAX);

		requiredEClass = createEClass(REQUIRED);

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
		createEReference(classRuleEClass, CLASS_RULE__CLASS_RULE_ERROR_MESSAGE);

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
		createEReference(attributeArrayEClass, ATTRIBUTE_ARRAY__ATTRIBUTES);

		uiComponentEClass = createEClass(UI_COMPONENT);
		createEAttribute(uiComponentEClass, UI_COMPONENT__TOOLTIP);
		createEAttribute(uiComponentEClass, UI_COMPONENT__NOTE);

		numericUIComponentEClass = createEClass(NUMERIC_UI_COMPONENT);
		createEAttribute(numericUIComponentEClass, NUMERIC_UI_COMPONENT__DEFAULT_VALUE);
		createEAttribute(numericUIComponentEClass, NUMERIC_UI_COMPONENT__COMPONENT_TYPE);

		enumerationUIComponentEClass = createEClass(ENUMERATION_UI_COMPONENT);

		radioButtonEClass = createEClass(RADIO_BUTTON);
		createEAttribute(radioButtonEClass, RADIO_BUTTON__ORIENTATION);

		dropDownListEClass = createEClass(DROP_DOWN_LIST);
		createEAttribute(dropDownListEClass, DROP_DOWN_LIST__IS_MULTI_SELECT);

		checkBoxEClass = createEClass(CHECK_BOX);
		createEAttribute(checkBoxEClass, CHECK_BOX__ORIENTATION);

		dateUIComponentEClass = createEClass(DATE_UI_COMPONENT);
		createEAttribute(dateUIComponentEClass, DATE_UI_COMPONENT__TYPE);

		textUIComponentEClass = createEClass(TEXT_UI_COMPONENT);
		createEAttribute(textUIComponentEClass, TEXT_UI_COMPONENT__PLACE_HOLDER);

		textInputEClass = createEClass(TEXT_INPUT);

		textAreaEClass = createEClass(TEXT_AREA);
		createEAttribute(textAreaEClass, TEXT_AREA__NUM_OF_ROWS);

		formLayoutEClass = createEClass(FORM_LAYOUT);
		createEReference(formLayoutEClass, FORM_LAYOUT__ATTRIBUTEARRAY);
		createEReference(formLayoutEClass, FORM_LAYOUT__LAYOUTS);
		createEAttribute(formLayoutEClass, FORM_LAYOUT__NAME);

		fieldSetEClass = createEClass(FIELD_SET);
		createEAttribute(fieldSetEClass, FIELD_SET__LEGEND);

		tabEClass = createEClass(TAB);
		createEAttribute(tabEClass, TAB__LABEL);

		gridEClass = createEClass(GRID);

		attributeSettingsEClass = createEClass(ATTRIBUTE_SETTINGS);
		createEAttribute(attributeSettingsEClass, ATTRIBUTE_SETTINGS__PRESENTATION);

		labelSettingsEClass = createEClass(LABEL_SETTINGS);
		createEAttribute(labelSettingsEClass, LABEL_SETTINGS__POSITION);

		errorMessageEClass = createEClass(ERROR_MESSAGE);
		createEAttribute(errorMessageEClass, ERROR_MESSAGE__MESSAGE);

		telInputEClass = createEClass(TEL_INPUT);

		emailInputEClass = createEClass(EMAIL_INPUT);

		passwordEClass = createEClass(PASSWORD);
		createEAttribute(passwordEClass, PASSWORD__VISIBLE);

		additionalSettingsEClass = createEClass(ADDITIONAL_SETTINGS);

		fileInputEClass = createEClass(FILE_INPUT);
		createEAttribute(fileInputEClass, FILE_INPUT__BUTTON_POSITION);

		attributeDataTypeEClass = createEClass(ATTRIBUTE_DATA_TYPE);
		createEAttribute(attributeDataTypeEClass, ATTRIBUTE_DATA_TYPE__IS_COLLECTION);

		primitiveDataTypeEClass = createEClass(PRIMITIVE_DATA_TYPE);
		createEAttribute(primitiveDataTypeEClass, PRIMITIVE_DATA_TYPE__TYPE);

		nonPrimitiveDataTypeEClass = createEClass(NON_PRIMITIVE_DATA_TYPE);
		createEReference(nonPrimitiveDataTypeEClass, NON_PRIMITIVE_DATA_TYPE__TYPE);

		refEntityEClass = createEClass(REF_ENTITY);
		createEAttribute(refEntityEClass, REF_ENTITY__IS_SINGE_VALUE);

		businessModelEClass = createEClass(BUSINESS_MODEL);
		createEReference(businessModelEClass, BUSINESS_MODEL__VALIDATIONCLASSES);
		createEAttribute(businessModelEClass, BUSINESS_MODEL__LABEL);
		createEAttribute(businessModelEClass, BUSINESS_MODEL__DESCRIPTION);

		errorMessageSettingsEClass = createEClass(ERROR_MESSAGE_SETTINGS);
		createEAttribute(errorMessageSettingsEClass, ERROR_MESSAGE_SETTINGS__POSITION);
		createEReference(errorMessageSettingsEClass, ERROR_MESSAGE_SETTINGS__COLOR);

		formSettingsEClass = createEClass(FORM_SETTINGS);
		createEAttribute(formSettingsEClass, FORM_SETTINGS__AUTO_COMPLETE);

		paginationEClass = createEClass(PAGINATION);
		createEAttribute(paginationEClass, PAGINATION__POSSIBLE_NUMBER_OF_SHOWN_ROWS);
		createEAttribute(paginationEClass, PAGINATION__DEFAULT_NUM_OF_SHOWN_ROWS);

		tableOverviewEClass = createEClass(TABLE_OVERVIEW);
		createEAttribute(tableOverviewEClass, TABLE_OVERVIEW__NAME);
		createEAttribute(tableOverviewEClass, TABLE_OVERVIEW__HEIGHT);
		createEReference(tableOverviewEClass, TABLE_OVERVIEW__PAGING);
		createEAttribute(tableOverviewEClass, TABLE_OVERVIEW__WIDTH);
		createEAttribute(tableOverviewEClass, TABLE_OVERVIEW__TITLE);

		overviewSettingsEClass = createEClass(OVERVIEW_SETTINGS);
		createEReference(overviewSettingsEClass, OVERVIEW_SETTINGS__TABLEOVERVIEW);

		noteSettingsEClass = createEClass(NOTE_SETTINGS);
		createEAttribute(noteSettingsEClass, NOTE_SETTINGS__POSITION);

		selectingUIComponentEClass = createEClass(SELECTING_UI_COMPONENT);

		loadValuesEClass = createEClass(LOAD_VALUES);
		createEAttribute(loadValuesEClass, LOAD_VALUES__IS_MULTI_SELECT);

		autocompleteComponentEClass = createEClass(AUTOCOMPLETE_COMPONENT);

		colorEClass = createEClass(COLOR);
		createEAttribute(colorEClass, COLOR__RED);
		createEAttribute(colorEClass, COLOR__GREEN);
		createEAttribute(colorEClass, COLOR__BLUE);

		// Create enums
		eDataTypeEEnum = createEEnum(EDATA_TYPE);
		eOrientationEEnum = createEEnum(EORIENTATION);
		eRequiredFieldEEnum = createEEnum(EREQUIRED_FIELD);
		ePositionEEnum = createEEnum(EPOSITION);
		eGridOrderEEnum = createEEnum(EGRID_ORDER);
		euiNumberComponentTypeEEnum = createEEnum(EUI_NUMBER_COMPONENT_TYPE);
		eDateUITypeEEnum = createEEnum(EDATE_UI_TYPE);
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
		enumerationUIComponentEClass.getESuperTypes().add(this.getUIComponent());
		radioButtonEClass.getESuperTypes().add(this.getSelectingUIComponent());
		dropDownListEClass.getESuperTypes().add(this.getSelectingUIComponent());
		checkBoxEClass.getESuperTypes().add(this.getSelectingUIComponent());
		dateUIComponentEClass.getESuperTypes().add(this.getUIComponent());
		textUIComponentEClass.getESuperTypes().add(this.getUIComponent());
		textInputEClass.getESuperTypes().add(this.getTextUIComponent());
		textAreaEClass.getESuperTypes().add(this.getTextUIComponent());
		fieldSetEClass.getESuperTypes().add(this.getFormLayout());
		tabEClass.getESuperTypes().add(this.getFormLayout());
		gridEClass.getESuperTypes().add(this.getFormLayout());
		attributeSettingsEClass.getESuperTypes().add(this.getAdditionalSettings());
		labelSettingsEClass.getESuperTypes().add(this.getAdditionalSettings());
		telInputEClass.getESuperTypes().add(this.getTextUIComponent());
		emailInputEClass.getESuperTypes().add(this.getTextUIComponent());
		passwordEClass.getESuperTypes().add(this.getTextUIComponent());
		fileInputEClass.getESuperTypes().add(this.getUIComponent());
		primitiveDataTypeEClass.getESuperTypes().add(this.getAttributeDataType());
		nonPrimitiveDataTypeEClass.getESuperTypes().add(this.getAttributeDataType());
		refEntityEClass.getESuperTypes().add(this.getUIComponent());
		errorMessageSettingsEClass.getESuperTypes().add(this.getAdditionalSettings());
		formSettingsEClass.getESuperTypes().add(this.getAdditionalSettings());
		noteSettingsEClass.getESuperTypes().add(this.getAdditionalSettings());
		selectingUIComponentEClass.getESuperTypes().add(this.getUIComponent());
		loadValuesEClass.getESuperTypes().add(this.getSelectingUIComponent());
		autocompleteComponentEClass.getESuperTypes().add(this.getUIComponent());

		// Initialize classes, features, and operations; add parameters
		initEClass(validationClassEClass, ValidationClass.class, "ValidationClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValidationClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, ValidationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValidationClass_Classattribute(), this.getClassAttribute(), null, "classattribute", null, 0, -1, ValidationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValidationClass_Classrule(), this.getClassRule(), null, "classrule", null, 0, -1, ValidationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValidationClass_Label(), ecorePackage.getEString(), "label", null, 0, 1, ValidationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValidationClass_Formlayout(), this.getFormLayout(), null, "formlayout", null, 0, -1, ValidationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValidationClass_AdditionalSettings(), this.getAdditionalSettings(), null, "additionalSettings", null, 0, -1, ValidationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValidationClass_Overviewsettings(), this.getOverviewSettings(), null, "overviewsettings", null, 0, 1, ValidationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValidationClass_Attr(), ecorePackage.getEString(), "attr", null, 0, 1, ValidationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeRuleEClass, AttributeRule.class, "AttributeRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeRule_AttributeRuleErrorMessage(), this.getErrorMessage(), null, "attributeRuleErrorMessage", null, 0, 1, AttributeRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classAttributeEClass, ClassAttribute.class, "ClassAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, ClassAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassAttribute_Attributetype(), this.getAttributeType(), null, "attributetype", null, 1, 1, ClassAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassAttribute_Attributerule(), this.getAttributeRule(), null, "attributerule", null, 0, -1, ClassAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassAttribute_Label(), ecorePackage.getEString(), "label", null, 0, 1, ClassAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassAttribute_Master(), ecorePackage.getEBoolean(), "master", "false", 0, 1, ClassAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassAttribute_IsClassRepresenting(), ecorePackage.getEBoolean(), "isClassRepresenting", "false", 0, 1, ClassAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeTypeEClass, AttributeType.class, "AttributeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeType_UiComponent(), this.getUIComponent(), null, "uiComponent", null, 0, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeType_AttributeDataType(), this.getAttributeDataType(), null, "attributeDataType", null, 1, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(minEClass, Min.class, "Min", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(maxEClass, Max.class, "Max", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requiredEClass, Required.class, "Required", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(acceptableValuesEClass, AcceptableValues.class, "AcceptableValues", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(patternEClass, Pattern.class, "Pattern", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(minLengthEClass, MinLength.class, "MinLength", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMinLength_Value(), theXMLTypePackage.getInt(), "value", null, 0, 1, MinLength.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(maxLengthEClass, MaxLength.class, "MaxLength", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaxLength_Value(), ecorePackage.getEInt(), "value", null, 0, 1, MaxLength.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lengthEClass, Length.class, "Length", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLength_Value(), theXMLTypePackage.getInt(), "value", null, 0, 1, Length.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(minNumberEClass, MinNumber.class, "MinNumber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMinNumber_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, MinNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(minDateEClass, MinDate.class, "MinDate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMinDate_Value(), ecorePackage.getEString(), "value", null, 0, 1, MinDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(maxNumberEClass, MaxNumber.class, "MaxNumber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaxNumber_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, MaxNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getClassRule_ClassRuleErrorMessage(), this.getErrorMessage(), null, "classRuleErrorMessage", null, 0, 1, ClassRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getAttributeArray_Attributes(), this.getClassAttribute(), null, "attributes", null, 0, -1, AttributeArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiComponentEClass, UIComponent.class, "UIComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUIComponent_Tooltip(), ecorePackage.getEString(), "tooltip", null, 0, 1, UIComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIComponent_Note(), ecorePackage.getEString(), "note", null, 0, 1, UIComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numericUIComponentEClass, NumericUIComponent.class, "NumericUIComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumericUIComponent_DefaultValue(), ecorePackage.getEDouble(), "defaultValue", null, 0, 1, NumericUIComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumericUIComponent_ComponentType(), this.getEUINumberComponentType(), "componentType", "SimpleInput", 0, 1, NumericUIComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationUIComponentEClass, EnumerationUIComponent.class, "EnumerationUIComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(radioButtonEClass, RadioButton.class, "RadioButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRadioButton_Orientation(), this.getEOrientation(), "orientation", null, 0, 1, RadioButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dropDownListEClass, DropDownList.class, "DropDownList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDropDownList_IsMultiSelect(), ecorePackage.getEBoolean(), "isMultiSelect", "false", 0, 1, DropDownList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkBoxEClass, CheckBox.class, "CheckBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCheckBox_Orientation(), this.getEOrientation(), "orientation", null, 0, 1, CheckBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateUIComponentEClass, DateUIComponent.class, "DateUIComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateUIComponent_Type(), this.getEDateUIType(), "type", "OnlyDate", 0, 1, DateUIComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textUIComponentEClass, TextUIComponent.class, "TextUIComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextUIComponent_PlaceHolder(), ecorePackage.getEString(), "placeHolder", null, 0, 1, TextUIComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textInputEClass, TextInput.class, "TextInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textAreaEClass, TextArea.class, "TextArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextArea_NumOfRows(), ecorePackage.getEInt(), "numOfRows", "1", 0, 1, TextArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formLayoutEClass, FormLayout.class, "FormLayout", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFormLayout_Attributearray(), this.getAttributeArray(), null, "attributearray", null, 0, -1, FormLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormLayout_Layouts(), this.getFormLayout(), null, "layouts", null, 0, -1, FormLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormLayout_Name(), ecorePackage.getEString(), "name", null, 0, 1, FormLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldSetEClass, FieldSet.class, "FieldSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFieldSet_Legend(), ecorePackage.getEString(), "legend", null, 0, 1, FieldSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tabEClass, Tab.class, "Tab", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTab_Label(), ecorePackage.getEString(), "label", null, 0, 1, Tab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gridEClass, Grid.class, "Grid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeSettingsEClass, AttributeSettings.class, "AttributeSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeSettings_Presentation(), this.getERequiredField(), "presentation", null, 0, 1, AttributeSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelSettingsEClass, LabelSettings.class, "LabelSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabelSettings_Position(), this.getEPosition(), "position", null, 0, 1, LabelSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorMessageEClass, ErrorMessage.class, "ErrorMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getErrorMessage_Message(), ecorePackage.getEString(), "message", null, 0, 1, ErrorMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(telInputEClass, TelInput.class, "TelInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emailInputEClass, EmailInput.class, "EmailInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(passwordEClass, Password.class, "Password", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPassword_Visible(), ecorePackage.getEBoolean(), "visible", "true", 0, 1, Password.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(additionalSettingsEClass, AdditionalSettings.class, "AdditionalSettings", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fileInputEClass, FileInput.class, "FileInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileInput_ButtonPosition(), this.getEPosition(), "buttonPosition", "Right", 0, 1, FileInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeDataTypeEClass, AttributeDataType.class, "AttributeDataType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeDataType_IsCollection(), ecorePackage.getEBoolean(), "isCollection", "false", 0, 1, AttributeDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveDataTypeEClass, PrimitiveDataType.class, "PrimitiveDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimitiveDataType_Type(), this.getEDataType(), "type", null, 0, 1, PrimitiveDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonPrimitiveDataTypeEClass, NonPrimitiveDataType.class, "NonPrimitiveDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNonPrimitiveDataType_Type(), this.getValidationClass(), null, "type", null, 1, 1, NonPrimitiveDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refEntityEClass, RefEntity.class, "RefEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRefEntity_IsSingeValue(), ecorePackage.getEBoolean(), "isSingeValue", "true", 0, 1, RefEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessModelEClass, BusinessModel.class, "BusinessModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusinessModel_Validationclasses(), this.getValidationClass(), null, "validationclasses", null, 0, -1, BusinessModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessModel_Label(), ecorePackage.getEString(), "label", null, 0, 1, BusinessModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, BusinessModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorMessageSettingsEClass, ErrorMessageSettings.class, "ErrorMessageSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getErrorMessageSettings_Position(), this.getEPosition(), "position", null, 0, 1, ErrorMessageSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getErrorMessageSettings_Color(), this.getColor(), null, "color", null, 0, 1, ErrorMessageSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formSettingsEClass, FormSettings.class, "FormSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormSettings_AutoComplete(), ecorePackage.getEBoolean(), "autoComplete", null, 0, 1, FormSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paginationEClass, Pagination.class, "Pagination", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPagination_PossibleNumberOfShownRows(), ecorePackage.getEInt(), "possibleNumberOfShownRows", null, 0, -1, Pagination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPagination_DefaultNumOfShownRows(), ecorePackage.getEInt(), "defaultNumOfShownRows", null, 0, 1, Pagination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableOverviewEClass, TableOverview.class, "TableOverview", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableOverview_Name(), ecorePackage.getEString(), "name", null, 0, 1, TableOverview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableOverview_Height(), ecorePackage.getEInt(), "height", null, 0, 1, TableOverview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableOverview_Paging(), this.getPagination(), null, "paging", null, 0, 1, TableOverview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableOverview_Width(), ecorePackage.getEInt(), "width", null, 0, 1, TableOverview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableOverview_Title(), ecorePackage.getEString(), "title", null, 0, 1, TableOverview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(overviewSettingsEClass, OverviewSettings.class, "OverviewSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOverviewSettings_Tableoverview(), this.getTableOverview(), null, "tableoverview", null, 0, 1, OverviewSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noteSettingsEClass, NoteSettings.class, "NoteSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNoteSettings_Position(), this.getEPosition(), "position", "Right", 0, 1, NoteSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectingUIComponentEClass, SelectingUIComponent.class, "SelectingUIComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(loadValuesEClass, LoadValues.class, "LoadValues", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoadValues_IsMultiSelect(), ecorePackage.getEBoolean(), "isMultiSelect", "false", 0, 1, LoadValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(autocompleteComponentEClass, AutocompleteComponent.class, "AutocompleteComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(colorEClass, Color.class, "Color", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColor_Red(), ecorePackage.getEInt(), "red", "250", 0, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColor_Green(), ecorePackage.getEInt(), "green", "0", 0, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColor_Blue(), ecorePackage.getEInt(), "blue", "0", 0, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(eDataTypeEEnum, EDataType.class, "EDataType");
		addEEnumLiteral(eDataTypeEEnum, EDataType.STRING);
		addEEnumLiteral(eDataTypeEEnum, EDataType.NUMBER);
		addEEnumLiteral(eDataTypeEEnum, EDataType.DATE);
		addEEnumLiteral(eDataTypeEEnum, EDataType.BLOB);

		initEEnum(eOrientationEEnum, EOrientation.class, "EOrientation");
		addEEnumLiteral(eOrientationEEnum, EOrientation.VERTICAL);
		addEEnumLiteral(eOrientationEEnum, EOrientation.HORIZONTAL);

		initEEnum(eRequiredFieldEEnum, ERequiredField.class, "ERequiredField");
		addEEnumLiteral(eRequiredFieldEEnum, ERequiredField.ASTERIX);
		addEEnumLiteral(eRequiredFieldEEnum, ERequiredField.HIGHLIGHTING);

		initEEnum(ePositionEEnum, EPosition.class, "EPosition");
		addEEnumLiteral(ePositionEEnum, EPosition.ABOVE);
		addEEnumLiteral(ePositionEEnum, EPosition.LEFT);
		addEEnumLiteral(ePositionEEnum, EPosition.RIGHT);
		addEEnumLiteral(ePositionEEnum, EPosition.BELOW);

		initEEnum(eGridOrderEEnum, EGridOrder.class, "EGridOrder");
		addEEnumLiteral(eGridOrderEEnum, EGridOrder.FIRST_ROW);
		addEEnumLiteral(eGridOrderEEnum, EGridOrder.FIRST_COLUMN);

		initEEnum(euiNumberComponentTypeEEnum, EUINumberComponentType.class, "EUINumberComponentType");
		addEEnumLiteral(euiNumberComponentTypeEEnum, EUINumberComponentType.NUMBER_SCROLLER);
		addEEnumLiteral(euiNumberComponentTypeEEnum, EUINumberComponentType.SIMPLE_INPUT);

		initEEnum(eDateUITypeEEnum, EDateUIType.class, "EDateUIType");
		addEEnumLiteral(eDateUITypeEEnum, EDateUIType.ONLY_DATE);
		addEEnumLiteral(eDateUITypeEEnum, EDateUIType.ONLY_TIME);
		addEEnumLiteral(eDateUITypeEEnum, EDateUIType.DATE_TIME);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// http://www.obeo.fr/dsl/dnc/archetype
		createArchetypeAnnotations();
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
			 "constraints", "differentClassAttributes nameFormat allLayoutsSameType"
		   });	
		addAnnotation
		  (classAttributeEClass, 
		   source, 
		   new String[] {
			 "constraints", "appropriateAttributeRules compareMinMaxLength compareMinMaxNumber compareMinMaxDate nameFormat attributeRuleRequiredCanAppearJustOnce attributeRuleMinLengthCanAppearJustOnce attributeRuleMaxLengthCanAppearJustOnce attributeRuleLengthCanAppearJustOnce attributeRuleMinCanAppearJustOnce attributeRuleMaxCanAppearJustOnce attributeRuleAcceptableValuesCanAppearJustOnce attributeRulePatternCanAppearJustOnce collectionCannotBeMaster collectionCannotBeRepresenting"
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
			 "constraints", "differentAttributes differentAttributesInArray areEqualTypes"
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
			 "constraints", "acceptbleDataType areEqualTypes differentAttributes"
		   });	
		addAnnotation
		  (attributeArrayEClass, 
		   source, 
		   new String[] {
			 "constraints", "containDifferentAttributes"
		   });	
		addAnnotation
		  (formLayoutEClass, 
		   source, 
		   new String[] {
			 "constraints", "checkFormLayout uniqueFormLayoutName numOfAttributeArraysFieldSet numOfAttributeArrayTab nameFormat allLayoutsOnOneLevelMustBeSameType"
		   });	
		addAnnotation
		  (businessModelEClass, 
		   source, 
		   new String[] {
			 "constraints", "uniqueClassName"
		   });	
		addAnnotation
		  (colorEClass, 
		   source, 
		   new String[] {
			 "constraints", "RedComponentRange GreenComponetRange BlueComponetRange"
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
			 "differentClassAttributes", "Tuple {\n\tmessage : String = \'All attributes should be different\',\n\tstatus : Boolean = \n\t\t classattribute-> forAll(a1: ClassAttribute, a2: ClassAttribute | \n\t\t \tif a1<>a2 then a1.name <> a2.name else true endif\n\t\t )\n}.status",
			 "nameFormat", "name.matches(\'[a-z][a-zA-Z0-9.]*\')",
			 "allLayoutsSameType", "Tuple {\n\tmessage : String = \'At one level all attributes must be same type\',\n\tstatus : Boolean = \n\t\tformlayout -> forAll(fL1: FormLayout, fL2: FormLayout | \n\t\t\tif fL1.oclIsTypeOf(fL2.oclType()) then true else false endif )\n}.status"
		   });	
		addAnnotation
		  (classAttributeEClass, 
		   source, 
		   new String[] {
			 "appropriateAttributeRules", "Tuple {\n\tmessage : String = \'Each data type has appropriate rulles that can be applay to it.\',\n\tstatus : Boolean = \n\t\t if attributetype.attributeDataType.oclIsKindOf(PrimitiveDataType) \n\t\t \t  then if attributetype.attributeDataType.oclAsType(PrimitiveDataType).type = EDataType::Number\n\t\t \t  \t    then attributerule-> forAll(a1: AttributeRule | a1.oclIsKindOf(MaxNumber) or a1.oclIsKindOf(MinNumber) or a1.oclIsKindOf(Required))\n\t\t \t        else if attributetype.attributeDataType.oclAsType(PrimitiveDataType).type = EDataType::_\'String\'  \n\t\t \t             then attributerule-> forAll(a1: AttributeRule | a1.oclIsKindOf(MinLength) or a1.oclIsKindOf(MaxLength) or\n\t\t \t\t\t\t\ta1.oclIsKindOf(Length) or a1.oclIsKindOf(Required) or a1.oclIsKindOf(Pattern) or a1.oclIsKindOf(AcceptableValuesString))\n\t\t \t\t\t\t  else attributerule-> forAll(a1: AttributeRule | a1.oclIsKindOf(MaxDate) or a1.oclIsKindOf(MinDate) or a1.oclIsKindOf(Required)\n\t\t \t\t\t\t  or a1.oclIsKindOf(AcceptableValuesDate)or a1.oclIsKindOf(DatePattern))\n\t\t                 endif\n\t\t           endif\n\t\telse attributerule-> forAll(a1: AttributeRule | a1.oclIsKindOf(Required))\n\t\tendif\n}.status",
			 "compareMinMaxLength", "Tuple {\n\tmessage : String = \'Maxlength value should be greater than mainlength\',\n\tstatus : Boolean = \n\t\t\tattributerule-> forAll(a1: AttributeRule, a2: AttributeRule | \n\t\t\tif a1.oclIsKindOf(MaxLength) and a2.oclIsKindOf(MinLength)\n\t\t\tthen\n\t\t\t\ta1.oclAsType(MaxLength).value >= a2.oclAsType(MinLength).value\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif\n\t\t)\n}.status",
			 "compareMinMaxNumber", "Tuple {\n\tmessage : String = \'Check if max value is greater then min value\',\n\tstatus : Boolean = \n\t\t\tattributerule-> forAll(a1: AttributeRule, a2: AttributeRule | \n\t\t\tif a1.oclIsKindOf(MaxNumber) and a2.oclIsKindOf(MinNumber)\n\t\t\tthen\n\t\t\t\ta1.oclAsType(MaxNumber).value >= a2.oclAsType(MinNumber).value\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif\n\t\t)\n}.status",
			 "compareMinMaxDate", "Tuple {\n\tmessage : String = \'Check id max date is greater then min date\',\n\tstatus : Boolean = \n\t\t\tattributerule-> forAll(a1: AttributeRule, a2: AttributeRule | \n\t\t\tif a1.oclIsKindOf(MaxDate) and a2.oclIsKindOf(MinDate)\n\t\t\tthen\n\t\t\t\ta1.oclAsType(MaxDate).value >= a2.oclAsType(MinDate).value\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif\n\t\t)\n}.status",
			 "nameFormat", "name.matches(\'[a-z][a-zA-Z]*\')",
			 "attributeRuleRequiredCanAppearJustOnce", "\n\t\tattributerule -> select(aR| aR.oclIsKindOf(Required))->size() <=1",
			 "attributeRuleMinLengthCanAppearJustOnce", "\n\t\tattributerule -> select(aR| aR.oclIsKindOf(MinLength))->size() <=1",
			 "attributeRuleMaxLengthCanAppearJustOnce", "\n\t\tattributerule -> select(aR| aR.oclIsKindOf(MaxLength))->size() <=1",
			 "attributeRuleLengthCanAppearJustOnce", "\n\t\tattributerule -> select(aR| aR.oclIsKindOf(Length))->size() <=1",
			 "attributeRuleMinCanAppearJustOnce", "\n\t\tattributerule -> select(aR| aR.oclIsKindOf(Min))->size() <=1",
			 "attributeRuleMaxCanAppearJustOnce", "\n\t\tattributerule -> select(aR| aR.oclIsKindOf(Max))->size() <=1",
			 "attributeRuleAcceptableValuesCanAppearJustOnce", "\n\t\tattributerule -> select(aR| aR.oclIsKindOf(AcceptableValues))->size() <=1",
			 "attributeRulePatternCanAppearJustOnce", "\n\t\tattributerule -> select(aR| aR.oclIsKindOf(Pattern))->size() <=1",
			 "collectionCannotBeMaster", "\n\t\tif attributetype.attributeDataType.isCollection then master = false else true endif",
			 "collectionCannotBeRepresenting", "\n\t\tif attributetype.attributeDataType.isCollection then isClassRepresenting = false else true endif"
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
			 "areEqualTypes", "Tuple {\n\tmessage : String = \'In notequal rule all data types should be same.\',\n\tstatus : Boolean = \n\t\t attributearray.attributes -> forAll(a1: ClassAttribute, a2: ClassAttribute |\n\t\t if a1<>a2  then \n\t\t\t if a1.attributetype.attributeDataType.oclIsKindOf(PrimitiveDataType) \n\t\t\t and a2.attributetype.attributeDataType.oclIsKindOf(PrimitiveDataType) \n\t\t\t then\n\t\t\t a1.attributetype.attributeDataType.oclAsType(PrimitiveDataType).type = a2.attributetype.attributeDataType.oclAsType(PrimitiveDataType).type\n\t\t\t else \n\t\t\t a1.attributetype.attributeDataType.oclAsType(NonPrimitiveDataType).type.name = a2.attributetype.attributeDataType.oclAsType(NonPrimitiveDataType).type.name\n\t\t\t endif\n\t\t else true\n\t\t endif\n\t\t  )\n}.status",
			 "differentDataInArray", "Tuple {\n\tmessage : String = \'All attributes should be different\',\n\tstatus : Boolean = \n\t\t attributearray.attributes -> forAll(a1: ClassAttribute, a2: ClassAttribute |\n\t\t \tif a1<>a2 then\n\t\t \ta1.name <> a2.name\n\t\t \telse true\n\t\t \tendif\n\t\t )\n}.status"
		   });	
		addAnnotation
		  (greaterThanEClass, 
		   source, 
		   new String[] {
			 "differentAttributes", "Tuple {\n\tmessage : String = \'First attribute and attributes from array should be different\',\n\tstatus : Boolean = \n\t\t\tattributearray.attributes -> forAll(a1: ClassAttribute | classattribute.name <> a1.name)\n}.status",
			 "differentAttributesInArray", "Tuple {\n\tmessage : String = \'Attributes in array must be different\',\n\tstatus : Boolean = \n\t\t\t attributearray.attributes -> forAll(a1: ClassAttribute, a2: ClassAttribute | if a1<>a2 then\n\t\t\t \ta1.name <> a2.name\n\t\t\t \telse true\n\t\t\t \tendif\n\t\t\t )\n}.status",
			 "areEqualTypes", "Tuple {\n\tmessage : String = \'In greater then rule all data types should be same.\',\n\tstatus : Boolean = \n\t\t attributearray.attributes -> forAll(a1: ClassAttribute, a2: ClassAttribute |\n\t\t if a1<>a2  then \n\t\t\t if a1.attributetype.attributeDataType.oclIsKindOf(PrimitiveDataType) \n\t\t\t and a2.attributetype.attributeDataType.oclIsKindOf(PrimitiveDataType) \n\t\t\t and classattribute.attributetype.attributeDataType.oclIsKindOf(PrimitiveDataType)\n\t\t\t then\n\t\t\t a1.attributetype.attributeDataType.oclAsType(PrimitiveDataType).type = a2.attributetype.attributeDataType.oclAsType(PrimitiveDataType).type\n\t\t\t and classattribute.attributetype.attributeDataType.oclAsType(PrimitiveDataType).type = a1.attributetype.attributeDataType.oclAsType(PrimitiveDataType).type\n\t\t\t else \n\t\t\t a1.attributetype.attributeDataType.oclAsType(NonPrimitiveDataType).type.name = a2.attributetype.attributeDataType.oclAsType(NonPrimitiveDataType).type.name\n\t\t\t and classattribute.attributetype.attributeDataType.oclAsType(NonPrimitiveDataType).type.name = a1.attributetype.attributeDataType.oclAsType(NonPrimitiveDataType).type.name\n\t\t\t endif\n\t\t else true\n\t\t endif)\n}.status"
		   });	
		addAnnotation
		  (equalsEClass, 
		   source, 
		   new String[] {
			 "collectionSize", "\n\t\t\tattributearray.attributes -> size() >= 2",
			 "areEqualTypes", "Tuple {\n\tmessage : String = \'In equal rule all data types should be same.\',\n\tstatus : Boolean = \n\t\t attributearray.attributes -> forAll(a1: ClassAttribute, a2: ClassAttribute |\n\t\t if a1<>a2  then \n\t\t\t if a1.attributetype.attributeDataType.oclIsKindOf(PrimitiveDataType) \n\t\t\t and a2.attributetype.attributeDataType.oclIsKindOf(PrimitiveDataType) \n\t\t\t then\n\t\t\t a1.attributetype.attributeDataType.oclAsType(PrimitiveDataType).type = a2.attributetype.attributeDataType.oclAsType(PrimitiveDataType).type\n\t\t\t else \n\t\t\t  if (a1.attributetype.attributeDataType.oclIsKindOf(NonPrimitiveDataType) and a2.attributetype.attributeDataType.oclIsKindOf(PrimitiveDataType))\n\t\t\t  or (a1.attributetype.attributeDataType.oclIsKindOf(PrimitiveDataType) and a2.attributetype.attributeDataType.oclIsKindOf(NonPrimitiveDataType))\n\t\t\t  then false\n\t\t\t  else\n\t\t\t  a1.attributetype.attributeDataType.oclAsType(NonPrimitiveDataType).type.name = a2.attributetype.attributeDataType.oclAsType(NonPrimitiveDataType).type.name\n\t\t\t  endif\n\t\t\t endif\n\t\t else true\n\t\t endif\n\t\t  )\n}.status"
		   });	
		addAnnotation
		  (lessThanEClass, 
		   source, 
		   new String[] {
			 "acceptbleDataType", "Tuple {\n\tmessage : String = \'It is possible to compare just attibutes type of date or type of number.\',\n\tstatus : Boolean = \n\t\t  classattribute.attributetype.attributeDataType.oclAsType(PrimitiveDataType) = EDataType::Number \n\t\t  or classattribute.attributetype.attributeDataType.oclAsType(PrimitiveDataType) = EDataType::Date\n}.status",
			 "areEqualTypes", "Tuple {\n\tmessage : String = \'In less then rule all data types should be same.\',\n\tstatus : Boolean = \n\t\t attributearray.attributes -> forAll(a1: ClassAttribute, a2: ClassAttribute |\n\t\t if a1<>a2  then \n\t\t\t if a1.attributetype.attributeDataType.oclIsKindOf(PrimitiveDataType) \n\t\t\t and a2.attributetype.attributeDataType.oclIsKindOf(PrimitiveDataType) \n\t\t\t and classattribute.attributetype.attributeDataType.oclIsKindOf(PrimitiveDataType)\n\t\t\t then\n\t\t\t a1.attributetype.attributeDataType.oclAsType(PrimitiveDataType).type = a2.attributetype.attributeDataType.oclAsType(PrimitiveDataType).type\n\t\t\t and classattribute.attributetype.attributeDataType.oclAsType(PrimitiveDataType).type = a1.attributetype.attributeDataType.oclAsType(PrimitiveDataType).type\n\t\t\t else \n\t\t\t a1.attributetype.attributeDataType.oclAsType(NonPrimitiveDataType).type.name = a2.attributetype.attributeDataType.oclAsType(NonPrimitiveDataType).type.name\n\t\t\t and classattribute.attributetype.attributeDataType.oclAsType(NonPrimitiveDataType).type.name = a1.attributetype.attributeDataType.oclAsType(NonPrimitiveDataType).type.name\n\t\t\t endif\n\t\t else true\n\t\t endif)\n}.status",
			 "differentAttributes", "\n\t\t\tattributearray.attributes -> forAll(a1: ClassAttribute | classattribute.name <> a1.name)"
		   });	
		addAnnotation
		  (attributeArrayEClass, 
		   source, 
		   new String[] {
			 "containDifferentAttributes", "\n\t\tattributes -> forAll(a1: ClassAttribute, a2: ClassAttribute | \n\t\t\tif a1 <> a2 \n\t\t\tthen a1.name <> a2.name\n\t\t\telse true \n\t\t\tendif\n\t\t)"
		   });	
		addAnnotation
		  (formLayoutEClass, 
		   source, 
		   new String[] {
			 "checkFormLayout", "Tuple {\n\tmessage : String = \'Attribute could appear only in one layout\',\n\tstatus : Boolean = \n\t\tFormLayout.allInstances()->forAll(fL1: FormLayout, fL2: FormLayout |  \n\t\t\tif fL1 <> fL2 and fL1.attributearray <> null and fL2.attributearray <> null\n\t\t\tthen\n\t\t\tfL1.attributearray.attributes.oclAsSet() -> intersection(fL2.attributearray.attributes.oclAsSet())->isEmpty()\n\t\t\telse true\n\t\t\tendif\n\t\t)\n}.status",
			 "uniqueFormLayoutName", "Tuple {\n\tmessage : String = \'Layout name should be unique\',\n\tstatus : Boolean = \n\t\tFormLayout.allInstances()->forAll(fL1: FormLayout, fL2: FormLayout |  if fL1 <> fL2 then\n\t\t\tfL1.name <> fL2.name\n\t\t\telse true\n\t\t\tendif\n\t\t)\n}.status",
			 "numOfAttributeArraysFieldSet", "Tuple {\n\tmessage : String = \'Number of attribute arrays is not appropriate.\',\n\tstatus : Boolean = \n\t\tFormLayout.allInstances()->forAll(fL1: FormLayout |\n\t\t\tif fL1.oclIsKindOf(FieldSet) then fL1.attributearray->size() <= 1 else true\n\t\t\tendif\n\t\t)\n}.status",
			 "numOfAttributeArrayTab", "Tuple {\n\tmessage : String = \'Number of attribute arrays is not appropriate.\',\n\tstatus : Boolean = \n\t\tFormLayout.allInstances()->forAll(fL1: FormLayout |\n\t\t\tif fL1.oclIsKindOf(Tab) then fL1.attributearray->size() <= 1 else true\n\t\t\tendif\n\t\t)\n}.status",
			 "nameFormat", "name.matches(\'[a-z][a-zA-Z0-9.]*\')",
			 "allLayoutsOnOneLevelMustBeSameType", "\n\t\tlayouts -> forAll(fL1: FormLayout, fL2: FormLayout |\n\t\t\tif fL1.oclIsTypeOf(fL2.oclType()) then true else false endif\n\t\t)"
		   });	
		addAnnotation
		  (businessModelEClass, 
		   source, 
		   new String[] {
			 "uniqueClassName", "Tuple {\n\tmessage : String = \'\',\n\tstatus : Boolean = \n\t\tvalidationclasses -> forAll(vC1: ValidationClass, vC2: ValidationClass | if vC1 <> vC2 then\n\t\t\t vC1.name <> vC2.name else true endif)\n}.status"
		   });	
		addAnnotation
		  (colorEClass, 
		   source, 
		   new String[] {
			 "RedComponentRange", "Tuple {\n\tmessage : String = \'Red componet is out of range[0,255].\',\n\tstatus : Boolean = \n\t\t (red <= 255 and red >= 0)\n}.status",
			 "GreenComponetRange", "Tuple {\n\tmessage : String = \'Green componet is out of range[0,255].\',\n\tstatus : Boolean = \n\t\t(green <= 255 and green >=0)\n}.status",
			 "BlueComponetRange", "Tuple {\n\tmessage : String = \'Blue componet is out of range[0,255].\',\n\tstatus : Boolean = \n\t\t(blue <= 255 and blue >=0)\n}.status"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.obeo.fr/dsl/dnc/archetype</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createArchetypeAnnotations() {
		String source = "http://www.obeo.fr/dsl/dnc/archetype";	
		addAnnotation
		  (radioButtonEClass, 
		   source, 
		   new String[] {
			 "archetype", "Role"
		   });	
		addAnnotation
		  (paginationEClass, 
		   source, 
		   new String[] {
			 "archetype", "Description"
		   });
	}

} //FormValidationPackageImpl
