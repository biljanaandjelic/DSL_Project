/**
 */
package formValidation.impl;

import formValidation.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FormValidationFactoryImpl extends EFactoryImpl implements FormValidationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FormValidationFactory init() {
		try {
			FormValidationFactory theFormValidationFactory = (FormValidationFactory)EPackage.Registry.INSTANCE.getEFactory(FormValidationPackage.eNS_URI);
			if (theFormValidationFactory != null) {
				return theFormValidationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FormValidationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormValidationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FormValidationPackage.VALIDATION_CLASS: return createValidationClass();
			case FormValidationPackage.CLASS_ATTRIBUTE: return createClassAttribute();
			case FormValidationPackage.ATTRIBUTE_TYPE: return createAttributeType();
			case FormValidationPackage.REQUIRED: return createRequired();
			case FormValidationPackage.EMAIL: return createEmail();
			case FormValidationPackage.MIN_LENGTH: return createMinLength();
			case FormValidationPackage.MAX_LENGTH: return createMaxLength();
			case FormValidationPackage.LENGTH: return createLength();
			case FormValidationPackage.MIN_NUMBER: return createMinNumber();
			case FormValidationPackage.MIN_DATE: return createMinDate();
			case FormValidationPackage.MAX_NUMBER: return createMaxNumber();
			case FormValidationPackage.MAX_DATE: return createMaxDate();
			case FormValidationPackage.ACCEPTABLE_VALUES_STRING: return createAcceptableValuesString();
			case FormValidationPackage.ACCEPTABLE_VALUES_DATE: return createAcceptableValuesDate();
			case FormValidationPackage.STRING_PATTERN: return createStringPattern();
			case FormValidationPackage.DATE_PATTERN: return createDatePattern();
			case FormValidationPackage.NOT_EQUALS: return createNotEquals();
			case FormValidationPackage.GREATER_THAN: return createGreaterThan();
			case FormValidationPackage.EQUALS: return createEquals();
			case FormValidationPackage.LESS_THAN: return createLessThan();
			case FormValidationPackage.ATTRIBUTE_ARRAY: return createAttributeArray();
			case FormValidationPackage.DEPENDANCY: return createDependancy();
			case FormValidationPackage.INPUT_NUMBER: return createInputNumber();
			case FormValidationPackage.SCROLLBAR: return createScrollbar();
			case FormValidationPackage.RADIO_BUTTON: return createRadioButton();
			case FormValidationPackage.DROP_DOWN_LIST: return createDropDownList();
			case FormValidationPackage.CHECK_BOX: return createCheckBox();
			case FormValidationPackage.MULTI_SELECTED_DROP_DOWN_LIST: return createMultiSelectedDropDownList();
			case FormValidationPackage.DATE_UI_COMPONENT: return createDateUIComponent();
			case FormValidationPackage.TEXT_INPUT: return createTextInput();
			case FormValidationPackage.TEXT_AREA: return createTextArea();
			case FormValidationPackage.FIELD_SET: return createFieldSet();
			case FormValidationPackage.TAB: return createTab();
			case FormValidationPackage.GRID: return createGrid();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case FormValidationPackage.EVRSTA:
				return createEVrstaFromString(eDataType, initialValue);
			case FormValidationPackage.EORIENTATION:
				return createEOrientationFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case FormValidationPackage.EVRSTA:
				return convertEVrstaToString(eDataType, instanceValue);
			case FormValidationPackage.EORIENTATION:
				return convertEOrientationToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidationClass createValidationClass() {
		ValidationClassImpl validationClass = new ValidationClassImpl();
		return validationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassAttribute createClassAttribute() {
		ClassAttributeImpl classAttribute = new ClassAttributeImpl();
		return classAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeType createAttributeType() {
		AttributeTypeImpl attributeType = new AttributeTypeImpl();
		return attributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Required createRequired() {
		RequiredImpl required = new RequiredImpl();
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Email createEmail() {
		EmailImpl email = new EmailImpl();
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinLength createMinLength() {
		MinLengthImpl minLength = new MinLengthImpl();
		return minLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxLength createMaxLength() {
		MaxLengthImpl maxLength = new MaxLengthImpl();
		return maxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Length createLength() {
		LengthImpl length = new LengthImpl();
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinNumber createMinNumber() {
		MinNumberImpl minNumber = new MinNumberImpl();
		return minNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinDate createMinDate() {
		MinDateImpl minDate = new MinDateImpl();
		return minDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxNumber createMaxNumber() {
		MaxNumberImpl maxNumber = new MaxNumberImpl();
		return maxNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxDate createMaxDate() {
		MaxDateImpl maxDate = new MaxDateImpl();
		return maxDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptableValuesString createAcceptableValuesString() {
		AcceptableValuesStringImpl acceptableValuesString = new AcceptableValuesStringImpl();
		return acceptableValuesString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptableValuesDate createAcceptableValuesDate() {
		AcceptableValuesDateImpl acceptableValuesDate = new AcceptableValuesDateImpl();
		return acceptableValuesDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringPattern createStringPattern() {
		StringPatternImpl stringPattern = new StringPatternImpl();
		return stringPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatePattern createDatePattern() {
		DatePatternImpl datePattern = new DatePatternImpl();
		return datePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotEquals createNotEquals() {
		NotEqualsImpl notEquals = new NotEqualsImpl();
		return notEquals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreaterThan createGreaterThan() {
		GreaterThanImpl greaterThan = new GreaterThanImpl();
		return greaterThan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equals createEquals() {
		EqualsImpl equals = new EqualsImpl();
		return equals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LessThan createLessThan() {
		LessThanImpl lessThan = new LessThanImpl();
		return lessThan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeArray createAttributeArray() {
		AttributeArrayImpl attributeArray = new AttributeArrayImpl();
		return attributeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependancy createDependancy() {
		DependancyImpl dependancy = new DependancyImpl();
		return dependancy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputNumber createInputNumber() {
		InputNumberImpl inputNumber = new InputNumberImpl();
		return inputNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scrollbar createScrollbar() {
		ScrollbarImpl scrollbar = new ScrollbarImpl();
		return scrollbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadioButton createRadioButton() {
		RadioButtonImpl radioButton = new RadioButtonImpl();
		return radioButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropDownList createDropDownList() {
		DropDownListImpl dropDownList = new DropDownListImpl();
		return dropDownList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckBox createCheckBox() {
		CheckBoxImpl checkBox = new CheckBoxImpl();
		return checkBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiSelectedDropDownList createMultiSelectedDropDownList() {
		MultiSelectedDropDownListImpl multiSelectedDropDownList = new MultiSelectedDropDownListImpl();
		return multiSelectedDropDownList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateUIComponent createDateUIComponent() {
		DateUIComponentImpl dateUIComponent = new DateUIComponentImpl();
		return dateUIComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextInput createTextInput() {
		TextInputImpl textInput = new TextInputImpl();
		return textInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextArea createTextArea() {
		TextAreaImpl textArea = new TextAreaImpl();
		return textArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldSet createFieldSet() {
		FieldSetImpl fieldSet = new FieldSetImpl();
		return fieldSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tab createTab() {
		TabImpl tab = new TabImpl();
		return tab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grid createGrid() {
		GridImpl grid = new GridImpl();
		return grid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EVrsta createEVrstaFromString(EDataType eDataType, String initialValue) {
		EVrsta result = EVrsta.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEVrstaToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOrientation createEOrientationFromString(EDataType eDataType, String initialValue) {
		EOrientation result = EOrientation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEOrientationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormValidationPackage getFormValidationPackage() {
		return (FormValidationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FormValidationPackage getPackage() {
		return FormValidationPackage.eINSTANCE;
	}

} //FormValidationFactoryImpl
