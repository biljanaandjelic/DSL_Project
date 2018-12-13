/**
 */
package formValidation.util;

import formValidation.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see formValidation.FormValidationPackage
 * @generated
 */
public class FormValidationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FormValidationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormValidationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FormValidationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormValidationSwitch<Adapter> modelSwitch =
		new FormValidationSwitch<Adapter>() {
			@Override
			public Adapter caseValidationClass(ValidationClass object) {
				return createValidationClassAdapter();
			}
			@Override
			public Adapter caseAttributeRule(AttributeRule object) {
				return createAttributeRuleAdapter();
			}
			@Override
			public Adapter caseClassAttribute(ClassAttribute object) {
				return createClassAttributeAdapter();
			}
			@Override
			public Adapter caseAttributeType(AttributeType object) {
				return createAttributeTypeAdapter();
			}
			@Override
			public Adapter caseMin(Min object) {
				return createMinAdapter();
			}
			@Override
			public Adapter caseMax(Max object) {
				return createMaxAdapter();
			}
			@Override
			public Adapter caseRequired(Required object) {
				return createRequiredAdapter();
			}
			@Override
			public Adapter caseEmail(Email object) {
				return createEmailAdapter();
			}
			@Override
			public Adapter caseAcceptableValues(AcceptableValues object) {
				return createAcceptableValuesAdapter();
			}
			@Override
			public Adapter casePattern(Pattern object) {
				return createPatternAdapter();
			}
			@Override
			public Adapter caseMinLength(MinLength object) {
				return createMinLengthAdapter();
			}
			@Override
			public Adapter caseMaxLength(MaxLength object) {
				return createMaxLengthAdapter();
			}
			@Override
			public Adapter caseLength(Length object) {
				return createLengthAdapter();
			}
			@Override
			public Adapter caseMinNumber(MinNumber object) {
				return createMinNumberAdapter();
			}
			@Override
			public Adapter caseMinDate(MinDate object) {
				return createMinDateAdapter();
			}
			@Override
			public Adapter caseMaxNumber(MaxNumber object) {
				return createMaxNumberAdapter();
			}
			@Override
			public Adapter caseMaxDate(MaxDate object) {
				return createMaxDateAdapter();
			}
			@Override
			public Adapter caseAcceptableValuesString(AcceptableValuesString object) {
				return createAcceptableValuesStringAdapter();
			}
			@Override
			public Adapter caseAcceptableValuesDate(AcceptableValuesDate object) {
				return createAcceptableValuesDateAdapter();
			}
			@Override
			public Adapter caseStringPattern(StringPattern object) {
				return createStringPatternAdapter();
			}
			@Override
			public Adapter caseDatePattern(DatePattern object) {
				return createDatePatternAdapter();
			}
			@Override
			public Adapter caseClassRule(ClassRule object) {
				return createClassRuleAdapter();
			}
			@Override
			public Adapter caseNotEquals(NotEquals object) {
				return createNotEqualsAdapter();
			}
			@Override
			public Adapter caseGreaterThan(GreaterThan object) {
				return createGreaterThanAdapter();
			}
			@Override
			public Adapter caseEquals(Equals object) {
				return createEqualsAdapter();
			}
			@Override
			public Adapter caseLessThan(LessThan object) {
				return createLessThanAdapter();
			}
			@Override
			public Adapter caseAttributeArray(AttributeArray object) {
				return createAttributeArrayAdapter();
			}
			@Override
			public Adapter caseUIComponent(UIComponent object) {
				return createUIComponentAdapter();
			}
			@Override
			public Adapter caseNumericUIComponent(NumericUIComponent object) {
				return createNumericUIComponentAdapter();
			}
			@Override
			public Adapter caseEnumerationUIComponent(EnumerationUIComponent object) {
				return createEnumerationUIComponentAdapter();
			}
			@Override
			public Adapter caseRadioButton(RadioButton object) {
				return createRadioButtonAdapter();
			}
			@Override
			public Adapter caseDropDownList(DropDownList object) {
				return createDropDownListAdapter();
			}
			@Override
			public Adapter caseCheckBox(CheckBox object) {
				return createCheckBoxAdapter();
			}
			@Override
			public Adapter caseDateUIComponent(DateUIComponent object) {
				return createDateUIComponentAdapter();
			}
			@Override
			public Adapter caseTextUIComponent(TextUIComponent object) {
				return createTextUIComponentAdapter();
			}
			@Override
			public Adapter caseTextInput(TextInput object) {
				return createTextInputAdapter();
			}
			@Override
			public Adapter caseTextArea(TextArea object) {
				return createTextAreaAdapter();
			}
			@Override
			public Adapter caseFormLayout(FormLayout object) {
				return createFormLayoutAdapter();
			}
			@Override
			public Adapter caseFieldSet(FieldSet object) {
				return createFieldSetAdapter();
			}
			@Override
			public Adapter caseTab(Tab object) {
				return createTabAdapter();
			}
			@Override
			public Adapter caseGrid(Grid object) {
				return createGridAdapter();
			}
			@Override
			public Adapter caseAttributeSettings(AttributeSettings object) {
				return createAttributeSettingsAdapter();
			}
			@Override
			public Adapter caseLabelSettings(LabelSettings object) {
				return createLabelSettingsAdapter();
			}
			@Override
			public Adapter caseErrorMessage(ErrorMessage object) {
				return createErrorMessageAdapter();
			}
			@Override
			public Adapter caseTelInput(TelInput object) {
				return createTelInputAdapter();
			}
			@Override
			public Adapter caseEmailInput(EmailInput object) {
				return createEmailInputAdapter();
			}
			@Override
			public Adapter casePassword(Password object) {
				return createPasswordAdapter();
			}
			@Override
			public Adapter caseAdditionalSettings(AdditionalSettings object) {
				return createAdditionalSettingsAdapter();
			}
			@Override
			public Adapter caseFileInput(FileInput object) {
				return createFileInputAdapter();
			}
			@Override
			public Adapter caseAttributeDataType(AttributeDataType object) {
				return createAttributeDataTypeAdapter();
			}
			@Override
			public Adapter casePrimitiveDataType(PrimitiveDataType object) {
				return createPrimitiveDataTypeAdapter();
			}
			@Override
			public Adapter caseNonPrimitiveDataType(NonPrimitiveDataType object) {
				return createNonPrimitiveDataTypeAdapter();
			}
			@Override
			public Adapter caseRefEntity(RefEntity object) {
				return createRefEntityAdapter();
			}
			@Override
			public Adapter caseBusinessModel(BusinessModel object) {
				return createBusinessModelAdapter();
			}
			@Override
			public Adapter caseErrorMessageSettings(ErrorMessageSettings object) {
				return createErrorMessageSettingsAdapter();
			}
			@Override
			public Adapter caseFormSettings(FormSettings object) {
				return createFormSettingsAdapter();
			}
			@Override
			public Adapter casePagination(Pagination object) {
				return createPaginationAdapter();
			}
			@Override
			public Adapter caseTableOverview(TableOverview object) {
				return createTableOverviewAdapter();
			}
			@Override
			public Adapter caseOverviewSettings(OverviewSettings object) {
				return createOverviewSettingsAdapter();
			}
			@Override
			public Adapter caseNoteSettings(NoteSettings object) {
				return createNoteSettingsAdapter();
			}
			@Override
			public Adapter caseSelectingUIComponent(SelectingUIComponent object) {
				return createSelectingUIComponentAdapter();
			}
			@Override
			public Adapter caseLoadValues(LoadValues object) {
				return createLoadValuesAdapter();
			}
			@Override
			public Adapter caseAutocompleteComponent(AutocompleteComponent object) {
				return createAutocompleteComponentAdapter();
			}
			@Override
			public Adapter caseColor(Color object) {
				return createColorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link formValidation.ValidationClass <em>Validation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.ValidationClass
	 * @generated
	 */
	public Adapter createValidationClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.AttributeRule <em>Attribute Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.AttributeRule
	 * @generated
	 */
	public Adapter createAttributeRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.ClassAttribute <em>Class Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.ClassAttribute
	 * @generated
	 */
	public Adapter createClassAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.AttributeType
	 * @generated
	 */
	public Adapter createAttributeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.Min <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.Min
	 * @generated
	 */
	public Adapter createMinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.Max <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.Max
	 * @generated
	 */
	public Adapter createMaxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.Required <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.Required
	 * @generated
	 */
	public Adapter createRequiredAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.Email <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.Email
	 * @generated
	 */
	public Adapter createEmailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.AcceptableValues <em>Acceptable Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.AcceptableValues
	 * @generated
	 */
	public Adapter createAcceptableValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.Pattern
	 * @generated
	 */
	public Adapter createPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.MinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.MinLength
	 * @generated
	 */
	public Adapter createMinLengthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.MaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.MaxLength
	 * @generated
	 */
	public Adapter createMaxLengthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.Length <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.Length
	 * @generated
	 */
	public Adapter createLengthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.MinNumber <em>Min Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.MinNumber
	 * @generated
	 */
	public Adapter createMinNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.MinDate <em>Min Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.MinDate
	 * @generated
	 */
	public Adapter createMinDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.MaxNumber <em>Max Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.MaxNumber
	 * @generated
	 */
	public Adapter createMaxNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.MaxDate <em>Max Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.MaxDate
	 * @generated
	 */
	public Adapter createMaxDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.AcceptableValuesString <em>Acceptable Values String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.AcceptableValuesString
	 * @generated
	 */
	public Adapter createAcceptableValuesStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.AcceptableValuesDate <em>Acceptable Values Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.AcceptableValuesDate
	 * @generated
	 */
	public Adapter createAcceptableValuesDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.StringPattern <em>String Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.StringPattern
	 * @generated
	 */
	public Adapter createStringPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.DatePattern <em>Date Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.DatePattern
	 * @generated
	 */
	public Adapter createDatePatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.ClassRule <em>Class Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.ClassRule
	 * @generated
	 */
	public Adapter createClassRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.NotEquals <em>Not Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.NotEquals
	 * @generated
	 */
	public Adapter createNotEqualsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.GreaterThan <em>Greater Than</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.GreaterThan
	 * @generated
	 */
	public Adapter createGreaterThanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.Equals <em>Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.Equals
	 * @generated
	 */
	public Adapter createEqualsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.LessThan <em>Less Than</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.LessThan
	 * @generated
	 */
	public Adapter createLessThanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.AttributeArray <em>Attribute Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.AttributeArray
	 * @generated
	 */
	public Adapter createAttributeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.UIComponent <em>UI Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.UIComponent
	 * @generated
	 */
	public Adapter createUIComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.NumericUIComponent <em>Numeric UI Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.NumericUIComponent
	 * @generated
	 */
	public Adapter createNumericUIComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.EnumerationUIComponent <em>Enumeration UI Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.EnumerationUIComponent
	 * @generated
	 */
	public Adapter createEnumerationUIComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.RadioButton <em>Radio Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.RadioButton
	 * @generated
	 */
	public Adapter createRadioButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.DropDownList <em>Drop Down List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.DropDownList
	 * @generated
	 */
	public Adapter createDropDownListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.CheckBox <em>Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.CheckBox
	 * @generated
	 */
	public Adapter createCheckBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.DateUIComponent <em>Date UI Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.DateUIComponent
	 * @generated
	 */
	public Adapter createDateUIComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.TextUIComponent <em>Text UI Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.TextUIComponent
	 * @generated
	 */
	public Adapter createTextUIComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.TextInput <em>Text Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.TextInput
	 * @generated
	 */
	public Adapter createTextInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.TextArea <em>Text Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.TextArea
	 * @generated
	 */
	public Adapter createTextAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.FormLayout <em>Form Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.FormLayout
	 * @generated
	 */
	public Adapter createFormLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.FieldSet <em>Field Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.FieldSet
	 * @generated
	 */
	public Adapter createFieldSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.Tab <em>Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.Tab
	 * @generated
	 */
	public Adapter createTabAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.Grid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.Grid
	 * @generated
	 */
	public Adapter createGridAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.AttributeSettings <em>Attribute Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.AttributeSettings
	 * @generated
	 */
	public Adapter createAttributeSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.LabelSettings <em>Label Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.LabelSettings
	 * @generated
	 */
	public Adapter createLabelSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.ErrorMessage <em>Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.ErrorMessage
	 * @generated
	 */
	public Adapter createErrorMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.TelInput <em>Tel Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.TelInput
	 * @generated
	 */
	public Adapter createTelInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.EmailInput <em>Email Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.EmailInput
	 * @generated
	 */
	public Adapter createEmailInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.Password <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.Password
	 * @generated
	 */
	public Adapter createPasswordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.AdditionalSettings <em>Additional Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.AdditionalSettings
	 * @generated
	 */
	public Adapter createAdditionalSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.FileInput <em>File Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.FileInput
	 * @generated
	 */
	public Adapter createFileInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.AttributeDataType <em>Attribute Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.AttributeDataType
	 * @generated
	 */
	public Adapter createAttributeDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.PrimitiveDataType <em>Primitive Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.PrimitiveDataType
	 * @generated
	 */
	public Adapter createPrimitiveDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.NonPrimitiveDataType <em>Non Primitive Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.NonPrimitiveDataType
	 * @generated
	 */
	public Adapter createNonPrimitiveDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.RefEntity <em>Ref Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.RefEntity
	 * @generated
	 */
	public Adapter createRefEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.BusinessModel <em>Business Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.BusinessModel
	 * @generated
	 */
	public Adapter createBusinessModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.ErrorMessageSettings <em>Error Message Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.ErrorMessageSettings
	 * @generated
	 */
	public Adapter createErrorMessageSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.FormSettings <em>Form Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.FormSettings
	 * @generated
	 */
	public Adapter createFormSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.Pagination <em>Pagination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.Pagination
	 * @generated
	 */
	public Adapter createPaginationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.TableOverview <em>Table Overview</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.TableOverview
	 * @generated
	 */
	public Adapter createTableOverviewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.OverviewSettings <em>Overview Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.OverviewSettings
	 * @generated
	 */
	public Adapter createOverviewSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.NoteSettings <em>Note Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.NoteSettings
	 * @generated
	 */
	public Adapter createNoteSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.SelectingUIComponent <em>Selecting UI Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.SelectingUIComponent
	 * @generated
	 */
	public Adapter createSelectingUIComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.LoadValues <em>Load Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.LoadValues
	 * @generated
	 */
	public Adapter createLoadValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.AutocompleteComponent <em>Autocomplete Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.AutocompleteComponent
	 * @generated
	 */
	public Adapter createAutocompleteComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link formValidation.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see formValidation.Color
	 * @generated
	 */
	public Adapter createColorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FormValidationAdapterFactory
