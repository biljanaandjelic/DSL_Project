/**
 */
package formValidation.util;

import formValidation.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see formValidation.FormValidationPackage
 * @generated
 */
public class FormValidationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FormValidationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormValidationSwitch() {
		if (modelPackage == null) {
			modelPackage = FormValidationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FormValidationPackage.VALIDATION_CLASS: {
				ValidationClass validationClass = (ValidationClass)theEObject;
				T result = caseValidationClass(validationClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.ATTRIBUTE_RULE: {
				AttributeRule attributeRule = (AttributeRule)theEObject;
				T result = caseAttributeRule(attributeRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.CLASS_ATTRIBUTE: {
				ClassAttribute classAttribute = (ClassAttribute)theEObject;
				T result = caseClassAttribute(classAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.ATTRIBUTE_TYPE: {
				AttributeType attributeType = (AttributeType)theEObject;
				T result = caseAttributeType(attributeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.MIN: {
				Min min = (Min)theEObject;
				T result = caseMin(min);
				if (result == null) result = caseAttributeRule(min);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.MAX: {
				Max max = (Max)theEObject;
				T result = caseMax(max);
				if (result == null) result = caseAttributeRule(max);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.REQUIRED: {
				Required required = (Required)theEObject;
				T result = caseRequired(required);
				if (result == null) result = caseAttributeRule(required);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.EMAIL: {
				Email email = (Email)theEObject;
				T result = caseEmail(email);
				if (result == null) result = caseAttributeRule(email);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.ACCEPTABLE_VALUES: {
				AcceptableValues acceptableValues = (AcceptableValues)theEObject;
				T result = caseAcceptableValues(acceptableValues);
				if (result == null) result = caseAttributeRule(acceptableValues);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.PATTERN: {
				Pattern pattern = (Pattern)theEObject;
				T result = casePattern(pattern);
				if (result == null) result = caseAttributeRule(pattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.MIN_LENGTH: {
				MinLength minLength = (MinLength)theEObject;
				T result = caseMinLength(minLength);
				if (result == null) result = caseAttributeRule(minLength);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.MAX_LENGTH: {
				MaxLength maxLength = (MaxLength)theEObject;
				T result = caseMaxLength(maxLength);
				if (result == null) result = caseAttributeRule(maxLength);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.LENGTH: {
				Length length = (Length)theEObject;
				T result = caseLength(length);
				if (result == null) result = caseAttributeRule(length);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.MIN_NUMBER: {
				MinNumber minNumber = (MinNumber)theEObject;
				T result = caseMinNumber(minNumber);
				if (result == null) result = caseMin(minNumber);
				if (result == null) result = caseAttributeRule(minNumber);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.MIN_DATE: {
				MinDate minDate = (MinDate)theEObject;
				T result = caseMinDate(minDate);
				if (result == null) result = caseMin(minDate);
				if (result == null) result = caseAttributeRule(minDate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.MAX_NUMBER: {
				MaxNumber maxNumber = (MaxNumber)theEObject;
				T result = caseMaxNumber(maxNumber);
				if (result == null) result = caseMax(maxNumber);
				if (result == null) result = caseAttributeRule(maxNumber);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.MAX_DATE: {
				MaxDate maxDate = (MaxDate)theEObject;
				T result = caseMaxDate(maxDate);
				if (result == null) result = caseMax(maxDate);
				if (result == null) result = caseAttributeRule(maxDate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.ACCEPTABLE_VALUES_STRING: {
				AcceptableValuesString acceptableValuesString = (AcceptableValuesString)theEObject;
				T result = caseAcceptableValuesString(acceptableValuesString);
				if (result == null) result = caseAcceptableValues(acceptableValuesString);
				if (result == null) result = caseAttributeRule(acceptableValuesString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.ACCEPTABLE_VALUES_DATE: {
				AcceptableValuesDate acceptableValuesDate = (AcceptableValuesDate)theEObject;
				T result = caseAcceptableValuesDate(acceptableValuesDate);
				if (result == null) result = caseAcceptableValues(acceptableValuesDate);
				if (result == null) result = caseAttributeRule(acceptableValuesDate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.STRING_PATTERN: {
				StringPattern stringPattern = (StringPattern)theEObject;
				T result = caseStringPattern(stringPattern);
				if (result == null) result = casePattern(stringPattern);
				if (result == null) result = caseAttributeRule(stringPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.DATE_PATTERN: {
				DatePattern datePattern = (DatePattern)theEObject;
				T result = caseDatePattern(datePattern);
				if (result == null) result = casePattern(datePattern);
				if (result == null) result = caseAttributeRule(datePattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.CLASS_RULE: {
				ClassRule classRule = (ClassRule)theEObject;
				T result = caseClassRule(classRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.NOT_EQUALS: {
				NotEquals notEquals = (NotEquals)theEObject;
				T result = caseNotEquals(notEquals);
				if (result == null) result = caseClassRule(notEquals);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.GREATER_THAN: {
				GreaterThan greaterThan = (GreaterThan)theEObject;
				T result = caseGreaterThan(greaterThan);
				if (result == null) result = caseClassRule(greaterThan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.EQUALS: {
				Equals equals = (Equals)theEObject;
				T result = caseEquals(equals);
				if (result == null) result = caseClassRule(equals);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.LESS_THAN: {
				LessThan lessThan = (LessThan)theEObject;
				T result = caseLessThan(lessThan);
				if (result == null) result = caseClassRule(lessThan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.ATTRIBUTE_ARRAY: {
				AttributeArray attributeArray = (AttributeArray)theEObject;
				T result = caseAttributeArray(attributeArray);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.UI_COMPONENT: {
				UIComponent uiComponent = (UIComponent)theEObject;
				T result = caseUIComponent(uiComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.NUMERIC_UI_COMPONENT: {
				NumericUIComponent numericUIComponent = (NumericUIComponent)theEObject;
				T result = caseNumericUIComponent(numericUIComponent);
				if (result == null) result = caseUIComponent(numericUIComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.ENUMERATION_UI_COMPONENT: {
				EnumerationUIComponent enumerationUIComponent = (EnumerationUIComponent)theEObject;
				T result = caseEnumerationUIComponent(enumerationUIComponent);
				if (result == null) result = caseUIComponent(enumerationUIComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.RADIO_BUTTON: {
				RadioButton radioButton = (RadioButton)theEObject;
				T result = caseRadioButton(radioButton);
				if (result == null) result = caseSelectingUIComponent(radioButton);
				if (result == null) result = caseUIComponent(radioButton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.DROP_DOWN_LIST: {
				DropDownList dropDownList = (DropDownList)theEObject;
				T result = caseDropDownList(dropDownList);
				if (result == null) result = caseSelectingUIComponent(dropDownList);
				if (result == null) result = caseUIComponent(dropDownList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.CHECK_BOX: {
				CheckBox checkBox = (CheckBox)theEObject;
				T result = caseCheckBox(checkBox);
				if (result == null) result = caseSelectingUIComponent(checkBox);
				if (result == null) result = caseUIComponent(checkBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.DATE_UI_COMPONENT: {
				DateUIComponent dateUIComponent = (DateUIComponent)theEObject;
				T result = caseDateUIComponent(dateUIComponent);
				if (result == null) result = caseUIComponent(dateUIComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.TEXT_UI_COMPONENT: {
				TextUIComponent textUIComponent = (TextUIComponent)theEObject;
				T result = caseTextUIComponent(textUIComponent);
				if (result == null) result = caseUIComponent(textUIComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.TEXT_INPUT: {
				TextInput textInput = (TextInput)theEObject;
				T result = caseTextInput(textInput);
				if (result == null) result = caseTextUIComponent(textInput);
				if (result == null) result = caseUIComponent(textInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.TEXT_AREA: {
				TextArea textArea = (TextArea)theEObject;
				T result = caseTextArea(textArea);
				if (result == null) result = caseTextUIComponent(textArea);
				if (result == null) result = caseUIComponent(textArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.FORM_LAYOUT: {
				FormLayout formLayout = (FormLayout)theEObject;
				T result = caseFormLayout(formLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.FIELD_SET: {
				FieldSet fieldSet = (FieldSet)theEObject;
				T result = caseFieldSet(fieldSet);
				if (result == null) result = caseFormLayout(fieldSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.TAB: {
				Tab tab = (Tab)theEObject;
				T result = caseTab(tab);
				if (result == null) result = caseFormLayout(tab);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.GRID: {
				Grid grid = (Grid)theEObject;
				T result = caseGrid(grid);
				if (result == null) result = caseFormLayout(grid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.ATTRIBUTE_SETTINGS: {
				AttributeSettings attributeSettings = (AttributeSettings)theEObject;
				T result = caseAttributeSettings(attributeSettings);
				if (result == null) result = caseAdditionalSettings(attributeSettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.LABEL_SETTINGS: {
				LabelSettings labelSettings = (LabelSettings)theEObject;
				T result = caseLabelSettings(labelSettings);
				if (result == null) result = caseAdditionalSettings(labelSettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.ERROR_MESSAGE: {
				ErrorMessage errorMessage = (ErrorMessage)theEObject;
				T result = caseErrorMessage(errorMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.TEL_INPUT: {
				TelInput telInput = (TelInput)theEObject;
				T result = caseTelInput(telInput);
				if (result == null) result = caseTextUIComponent(telInput);
				if (result == null) result = caseUIComponent(telInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.EMAIL_INPUT: {
				EmailInput emailInput = (EmailInput)theEObject;
				T result = caseEmailInput(emailInput);
				if (result == null) result = caseTextUIComponent(emailInput);
				if (result == null) result = caseUIComponent(emailInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.PASSWORD: {
				Password password = (Password)theEObject;
				T result = casePassword(password);
				if (result == null) result = caseTextUIComponent(password);
				if (result == null) result = caseUIComponent(password);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.ADDITIONAL_SETTINGS: {
				AdditionalSettings additionalSettings = (AdditionalSettings)theEObject;
				T result = caseAdditionalSettings(additionalSettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.FILE_INPUT: {
				FileInput fileInput = (FileInput)theEObject;
				T result = caseFileInput(fileInput);
				if (result == null) result = caseUIComponent(fileInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.ATTRIBUTE_DATA_TYPE: {
				AttributeDataType attributeDataType = (AttributeDataType)theEObject;
				T result = caseAttributeDataType(attributeDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.PRIMITIVE_DATA_TYPE: {
				PrimitiveDataType primitiveDataType = (PrimitiveDataType)theEObject;
				T result = casePrimitiveDataType(primitiveDataType);
				if (result == null) result = caseAttributeDataType(primitiveDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.NON_PRIMITIVE_DATA_TYPE: {
				NonPrimitiveDataType nonPrimitiveDataType = (NonPrimitiveDataType)theEObject;
				T result = caseNonPrimitiveDataType(nonPrimitiveDataType);
				if (result == null) result = caseAttributeDataType(nonPrimitiveDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.REF_ENTITY: {
				RefEntity refEntity = (RefEntity)theEObject;
				T result = caseRefEntity(refEntity);
				if (result == null) result = caseUIComponent(refEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.BUSINESS_MODEL: {
				BusinessModel businessModel = (BusinessModel)theEObject;
				T result = caseBusinessModel(businessModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.ERROR_MESSAGE_SETTINGS: {
				ErrorMessageSettings errorMessageSettings = (ErrorMessageSettings)theEObject;
				T result = caseErrorMessageSettings(errorMessageSettings);
				if (result == null) result = caseAdditionalSettings(errorMessageSettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.FORM_SETTINGS: {
				FormSettings formSettings = (FormSettings)theEObject;
				T result = caseFormSettings(formSettings);
				if (result == null) result = caseAdditionalSettings(formSettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.PAGINATION: {
				Pagination pagination = (Pagination)theEObject;
				T result = casePagination(pagination);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.TABLE_OVERVIEW: {
				TableOverview tableOverview = (TableOverview)theEObject;
				T result = caseTableOverview(tableOverview);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.OVERVIEW_SETTINGS: {
				OverviewSettings overviewSettings = (OverviewSettings)theEObject;
				T result = caseOverviewSettings(overviewSettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.NOTE_SETTINGS: {
				NoteSettings noteSettings = (NoteSettings)theEObject;
				T result = caseNoteSettings(noteSettings);
				if (result == null) result = caseAdditionalSettings(noteSettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.SELECTING_UI_COMPONENT: {
				SelectingUIComponent selectingUIComponent = (SelectingUIComponent)theEObject;
				T result = caseSelectingUIComponent(selectingUIComponent);
				if (result == null) result = caseUIComponent(selectingUIComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.LOAD_VALUES: {
				LoadValues loadValues = (LoadValues)theEObject;
				T result = caseLoadValues(loadValues);
				if (result == null) result = caseSelectingUIComponent(loadValues);
				if (result == null) result = caseUIComponent(loadValues);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.AUTOCOMPLETE_COMPONENT: {
				AutocompleteComponent autocompleteComponent = (AutocompleteComponent)theEObject;
				T result = caseAutocompleteComponent(autocompleteComponent);
				if (result == null) result = caseUIComponent(autocompleteComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormValidationPackage.COLOR: {
				Color color = (Color)theEObject;
				T result = caseColor(color);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Validation Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Validation Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidationClass(ValidationClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeRule(AttributeRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassAttribute(ClassAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeType(AttributeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Min</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Min</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMin(Min object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMax(Max object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequired(Required object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Email</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Email</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmail(Email object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Acceptable Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Acceptable Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcceptableValues(AcceptableValues object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern(Pattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Min Length</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Min Length</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinLength(MinLength object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Length</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Length</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaxLength(MaxLength object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Length</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Length</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLength(Length object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Min Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Min Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinNumber(MinNumber object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Min Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Min Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinDate(MinDate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaxNumber(MaxNumber object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaxDate(MaxDate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Acceptable Values String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Acceptable Values String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcceptableValuesString(AcceptableValuesString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Acceptable Values Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Acceptable Values Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcceptableValuesDate(AcceptableValuesDate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringPattern(StringPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatePattern(DatePattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassRule(ClassRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Equals</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Equals</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotEquals(NotEquals object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Than</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreaterThan(GreaterThan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equals</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equals</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquals(Equals object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less Than</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLessThan(LessThan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeArray(AttributeArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIComponent(UIComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric UI Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric UI Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericUIComponent(NumericUIComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration UI Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration UI Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationUIComponent(EnumerationUIComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Radio Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Radio Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRadioButton(RadioButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drop Down List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drop Down List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDropDownList(DropDownList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Check Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Check Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckBox(CheckBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date UI Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date UI Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateUIComponent(DateUIComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text UI Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text UI Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextUIComponent(TextUIComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextInput(TextInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextArea(TextArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormLayout(FormLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldSet(FieldSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tab</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tab</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTab(Tab object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGrid(Grid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeSettings(AttributeSettings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelSettings(LabelSettings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorMessage(ErrorMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tel Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tel Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTelInput(TelInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Email Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Email Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmailInput(EmailInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Password</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Password</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePassword(Password object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additional Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additional Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionalSettings(AdditionalSettings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileInput(FileInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDataType(AttributeDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveDataType(PrimitiveDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Primitive Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Primitive Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonPrimitiveDataType(NonPrimitiveDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefEntity(RefEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessModel(BusinessModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Message Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Message Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorMessageSettings(ErrorMessageSettings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormSettings(FormSettings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pagination</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pagination</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePagination(Pagination object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Overview</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Overview</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableOverview(TableOverview object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Overview Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Overview Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOverviewSettings(OverviewSettings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Note Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Note Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoteSettings(NoteSettings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selecting UI Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selecting UI Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectingUIComponent(SelectingUIComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadValues(LoadValues object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Autocomplete Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Autocomplete Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutocompleteComponent(AutocompleteComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColor(Color object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FormValidationSwitch
