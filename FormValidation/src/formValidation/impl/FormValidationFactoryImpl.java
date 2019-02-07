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
			case FormValidationPackage.ENTITY: return createEntity();
			case FormValidationPackage.ATTRIBUTE: return createAttribute();
			case FormValidationPackage.ATTRIBUTE_TYPE: return createAttributeType();
			case FormValidationPackage.REQUIRED: return createRequired();
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
			case FormValidationPackage.NUMERIC_UI_COMPONENT: return createNumericUIComponent();
			case FormValidationPackage.RADIO_BUTTON: return createRadioButton();
			case FormValidationPackage.DROP_DOWN_LIST: return createDropDownList();
			case FormValidationPackage.CHECK_BOX: return createCheckBox();
			case FormValidationPackage.DATE_UI_COMPONENT: return createDateUIComponent();
			case FormValidationPackage.TEXT_INPUT: return createTextInput();
			case FormValidationPackage.TEXT_AREA: return createTextArea();
			case FormValidationPackage.ATTRIBUTE_SETTINGS: return createAttributeSettings();
			case FormValidationPackage.LABEL_SETTINGS: return createLabelSettings();
			case FormValidationPackage.ERROR_MESSAGE: return createErrorMessage();
			case FormValidationPackage.TEL_INPUT: return createTelInput();
			case FormValidationPackage.EMAIL_INPUT: return createEmailInput();
			case FormValidationPackage.PASSWORD: return createPassword();
			case FormValidationPackage.FILE_INPUT: return createFileInput();
			case FormValidationPackage.PRIMITIVE_DATA_TYPE: return createPrimitiveDataType();
			case FormValidationPackage.NON_PRIMITIVE_DATA_TYPE: return createNonPrimitiveDataType();
			case FormValidationPackage.REF_ENTITY: return createRefEntity();
			case FormValidationPackage.BUSINESS_MODEL: return createBusinessModel();
			case FormValidationPackage.ERROR_MESSAGE_SETTINGS: return createErrorMessageSettings();
			case FormValidationPackage.PAGINATION: return createPagination();
			case FormValidationPackage.TABLE_OVERVIEW: return createTableOverview();
			case FormValidationPackage.OVERVIEW_SETTINGS: return createOverviewSettings();
			case FormValidationPackage.NOTE_SETTINGS: return createNoteSettings();
			case FormValidationPackage.LOAD_VALUES: return createLoadValues();
			case FormValidationPackage.AUTOCOMPLETE_COMPONENT: return createAutocompleteComponent();
			case FormValidationPackage.COLOR: return createColor();
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
			case FormValidationPackage.EDATE_UI_TYPE:
				return createEDateUITypeFromString(eDataType, initialValue);
			case FormValidationPackage.EREQUIRED_FIELD:
				return createERequiredFieldFromString(eDataType, initialValue);
			case FormValidationPackage.EORIENTATION:
				return createEOrientationFromString(eDataType, initialValue);
			case FormValidationPackage.ELAYOUT:
				return createELayoutFromString(eDataType, initialValue);
			case FormValidationPackage.EUI_NUMBER_COMPONENT_TYPE:
				return createEUINumberComponentTypeFromString(eDataType, initialValue);
			case FormValidationPackage.EGRID_ORDER:
				return createEGridOrderFromString(eDataType, initialValue);
			case FormValidationPackage.EPOSITION:
				return createEPositionFromString(eDataType, initialValue);
			case FormValidationPackage.EDATA_TYPE:
				return createEDataTypeFromString(eDataType, initialValue);
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
			case FormValidationPackage.EDATE_UI_TYPE:
				return convertEDateUITypeToString(eDataType, instanceValue);
			case FormValidationPackage.EREQUIRED_FIELD:
				return convertERequiredFieldToString(eDataType, instanceValue);
			case FormValidationPackage.EORIENTATION:
				return convertEOrientationToString(eDataType, instanceValue);
			case FormValidationPackage.ELAYOUT:
				return convertELayoutToString(eDataType, instanceValue);
			case FormValidationPackage.EUI_NUMBER_COMPONENT_TYPE:
				return convertEUINumberComponentTypeToString(eDataType, instanceValue);
			case FormValidationPackage.EGRID_ORDER:
				return convertEGridOrderToString(eDataType, instanceValue);
			case FormValidationPackage.EPOSITION:
				return convertEPositionToString(eDataType, instanceValue);
			case FormValidationPackage.EDATA_TYPE:
				return convertEDataTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
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
	public NumericUIComponent createNumericUIComponent() {
		NumericUIComponentImpl numericUIComponent = new NumericUIComponentImpl();
		return numericUIComponent;
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
	public AttributeSettings createAttributeSettings() {
		AttributeSettingsImpl attributeSettings = new AttributeSettingsImpl();
		return attributeSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelSettings createLabelSettings() {
		LabelSettingsImpl labelSettings = new LabelSettingsImpl();
		return labelSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorMessage createErrorMessage() {
		ErrorMessageImpl errorMessage = new ErrorMessageImpl();
		return errorMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelInput createTelInput() {
		TelInputImpl telInput = new TelInputImpl();
		return telInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmailInput createEmailInput() {
		EmailInputImpl emailInput = new EmailInputImpl();
		return emailInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Password createPassword() {
		PasswordImpl password = new PasswordImpl();
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileInput createFileInput() {
		FileInputImpl fileInput = new FileInputImpl();
		return fileInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveDataType createPrimitiveDataType() {
		PrimitiveDataTypeImpl primitiveDataType = new PrimitiveDataTypeImpl();
		return primitiveDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonPrimitiveDataType createNonPrimitiveDataType() {
		NonPrimitiveDataTypeImpl nonPrimitiveDataType = new NonPrimitiveDataTypeImpl();
		return nonPrimitiveDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefEntity createRefEntity() {
		RefEntityImpl refEntity = new RefEntityImpl();
		return refEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessModel createBusinessModel() {
		BusinessModelImpl businessModel = new BusinessModelImpl();
		return businessModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorMessageSettings createErrorMessageSettings() {
		ErrorMessageSettingsImpl errorMessageSettings = new ErrorMessageSettingsImpl();
		return errorMessageSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pagination createPagination() {
		PaginationImpl pagination = new PaginationImpl();
		return pagination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableOverview createTableOverview() {
		TableOverviewImpl tableOverview = new TableOverviewImpl();
		return tableOverview;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverviewSettings createOverviewSettings() {
		OverviewSettingsImpl overviewSettings = new OverviewSettingsImpl();
		return overviewSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteSettings createNoteSettings() {
		NoteSettingsImpl noteSettings = new NoteSettingsImpl();
		return noteSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadValues createLoadValues() {
		LoadValuesImpl loadValues = new LoadValuesImpl();
		return loadValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutocompleteComponent createAutocompleteComponent() {
		AutocompleteComponentImpl autocompleteComponent = new AutocompleteComponentImpl();
		return autocompleteComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color createColor() {
		ColorImpl color = new ColorImpl();
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public formValidation.EDataType createEDataTypeFromString(EDataType eDataType, String initialValue) {
		formValidation.EDataType result = formValidation.EDataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEDataTypeToString(EDataType eDataType, Object instanceValue) {
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
	public ELayout createELayoutFromString(EDataType eDataType, String initialValue) {
		ELayout result = ELayout.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertELayoutToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERequiredField createERequiredFieldFromString(EDataType eDataType, String initialValue) {
		ERequiredField result = ERequiredField.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertERequiredFieldToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPosition createEPositionFromString(EDataType eDataType, String initialValue) {
		EPosition result = EPosition.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEPositionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGridOrder createEGridOrderFromString(EDataType eDataType, String initialValue) {
		EGridOrder result = EGridOrder.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEGridOrderToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EUINumberComponentType createEUINumberComponentTypeFromString(EDataType eDataType, String initialValue) {
		EUINumberComponentType result = EUINumberComponentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEUINumberComponentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDateUIType createEDateUITypeFromString(EDataType eDataType, String initialValue) {
		EDateUIType result = EDateUIType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEDateUITypeToString(EDataType eDataType, Object instanceValue) {
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
