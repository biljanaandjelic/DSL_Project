/*
 * generated by Xtext 2.9.1
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import formValidation.AcceptableValuesDate;
import formValidation.AcceptableValuesString;
import formValidation.AttributeArray;
import formValidation.AttributeSettings;
import formValidation.AttributeType;
import formValidation.AutocompleteComponent;
import formValidation.BusinessModel;
import formValidation.CheckBox;
import formValidation.ClassAttribute;
import formValidation.Color;
import formValidation.DatePattern;
import formValidation.DateUIComponent;
import formValidation.DropDownList;
import formValidation.EmailInput;
import formValidation.Equals;
import formValidation.ErrorMessage;
import formValidation.ErrorMessageSettings;
import formValidation.FieldSet;
import formValidation.FileInput;
import formValidation.FormSettings;
import formValidation.FormValidationPackage;
import formValidation.GreaterThan;
import formValidation.Grid;
import formValidation.LabelSettings;
import formValidation.Length;
import formValidation.LessThan;
import formValidation.LoadValues;
import formValidation.MaxDate;
import formValidation.MaxLength;
import formValidation.MaxNumber;
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
import formValidation.PrimitiveDataType;
import formValidation.RadioButton;
import formValidation.RefEntity;
import formValidation.Required;
import formValidation.StringPattern;
import formValidation.Tab;
import formValidation.TableOverview;
import formValidation.TelInput;
import formValidation.TextArea;
import formValidation.TextInput;
import formValidation.ValidationClass;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.xtext.example.mydsl.services.FormValDSLGrammarAccess;

@SuppressWarnings("all")
public class FormValDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private FormValDSLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == FormValidationPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case FormValidationPackage.ACCEPTABLE_VALUES_DATE:
				sequence_AcceptableValuesDate(context, (AcceptableValuesDate) semanticObject); 
				return; 
			case FormValidationPackage.ACCEPTABLE_VALUES_STRING:
				sequence_AcceptableValuesString(context, (AcceptableValuesString) semanticObject); 
				return; 
			case FormValidationPackage.ATTRIBUTE_ARRAY:
				sequence_AttributeArray(context, (AttributeArray) semanticObject); 
				return; 
			case FormValidationPackage.ATTRIBUTE_SETTINGS:
				sequence_AttributeSettings(context, (AttributeSettings) semanticObject); 
				return; 
			case FormValidationPackage.ATTRIBUTE_TYPE:
				sequence_AttributeType(context, (AttributeType) semanticObject); 
				return; 
			case FormValidationPackage.AUTOCOMPLETE_COMPONENT:
				sequence_AutocompleteComponent(context, (AutocompleteComponent) semanticObject); 
				return; 
			case FormValidationPackage.BUSINESS_MODEL:
				sequence_BusinessModel(context, (BusinessModel) semanticObject); 
				return; 
			case FormValidationPackage.CHECK_BOX:
				sequence_CheckBox(context, (CheckBox) semanticObject); 
				return; 
			case FormValidationPackage.CLASS_ATTRIBUTE:
				sequence_ClassAttribute(context, (ClassAttribute) semanticObject); 
				return; 
			case FormValidationPackage.COLOR:
				sequence_Color(context, (Color) semanticObject); 
				return; 
			case FormValidationPackage.DATE_PATTERN:
				sequence_DatePattern(context, (DatePattern) semanticObject); 
				return; 
			case FormValidationPackage.DATE_UI_COMPONENT:
				sequence_DateUIComponent(context, (DateUIComponent) semanticObject); 
				return; 
			case FormValidationPackage.DROP_DOWN_LIST:
				sequence_DropDownList(context, (DropDownList) semanticObject); 
				return; 
			case FormValidationPackage.EMAIL_INPUT:
				sequence_EmailInput(context, (EmailInput) semanticObject); 
				return; 
			case FormValidationPackage.EQUALS:
				sequence_Equals(context, (Equals) semanticObject); 
				return; 
			case FormValidationPackage.ERROR_MESSAGE:
				sequence_ErrorMessage(context, (ErrorMessage) semanticObject); 
				return; 
			case FormValidationPackage.ERROR_MESSAGE_SETTINGS:
				sequence_ErrorMessageSettings(context, (ErrorMessageSettings) semanticObject); 
				return; 
			case FormValidationPackage.FIELD_SET:
				sequence_FieldSet(context, (FieldSet) semanticObject); 
				return; 
			case FormValidationPackage.FILE_INPUT:
				sequence_FileInput(context, (FileInput) semanticObject); 
				return; 
			case FormValidationPackage.FORM_SETTINGS:
				sequence_FormSettings(context, (FormSettings) semanticObject); 
				return; 
			case FormValidationPackage.GREATER_THAN:
				sequence_GreaterThan(context, (GreaterThan) semanticObject); 
				return; 
			case FormValidationPackage.GRID:
				sequence_Grid(context, (Grid) semanticObject); 
				return; 
			case FormValidationPackage.LABEL_SETTINGS:
				sequence_LabelSettings(context, (LabelSettings) semanticObject); 
				return; 
			case FormValidationPackage.LENGTH:
				sequence_Length(context, (Length) semanticObject); 
				return; 
			case FormValidationPackage.LESS_THAN:
				sequence_LessThan(context, (LessThan) semanticObject); 
				return; 
			case FormValidationPackage.LOAD_VALUES:
				sequence_LoadValues(context, (LoadValues) semanticObject); 
				return; 
			case FormValidationPackage.MAX_DATE:
				sequence_MaxDate(context, (MaxDate) semanticObject); 
				return; 
			case FormValidationPackage.MAX_LENGTH:
				sequence_MaxLength(context, (MaxLength) semanticObject); 
				return; 
			case FormValidationPackage.MAX_NUMBER:
				sequence_MaxNumber(context, (MaxNumber) semanticObject); 
				return; 
			case FormValidationPackage.MIN_DATE:
				sequence_MinDate(context, (MinDate) semanticObject); 
				return; 
			case FormValidationPackage.MIN_LENGTH:
				sequence_MinLength(context, (MinLength) semanticObject); 
				return; 
			case FormValidationPackage.MIN_NUMBER:
				sequence_MinNumber(context, (MinNumber) semanticObject); 
				return; 
			case FormValidationPackage.NON_PRIMITIVE_DATA_TYPE:
				sequence_NonPrimitiveDataType(context, (NonPrimitiveDataType) semanticObject); 
				return; 
			case FormValidationPackage.NOT_EQUALS:
				sequence_NotEquals(context, (NotEquals) semanticObject); 
				return; 
			case FormValidationPackage.NOTE_SETTINGS:
				sequence_NoteSettings(context, (NoteSettings) semanticObject); 
				return; 
			case FormValidationPackage.NUMERIC_UI_COMPONENT:
				sequence_NumericUIComponent(context, (NumericUIComponent) semanticObject); 
				return; 
			case FormValidationPackage.OVERVIEW_SETTINGS:
				sequence_OverviewSettings(context, (OverviewSettings) semanticObject); 
				return; 
			case FormValidationPackage.PAGINATION:
				sequence_Pagination(context, (Pagination) semanticObject); 
				return; 
			case FormValidationPackage.PASSWORD:
				sequence_Password(context, (Password) semanticObject); 
				return; 
			case FormValidationPackage.PRIMITIVE_DATA_TYPE:
				sequence_PrimitiveDataType(context, (PrimitiveDataType) semanticObject); 
				return; 
			case FormValidationPackage.RADIO_BUTTON:
				sequence_RadioButton(context, (RadioButton) semanticObject); 
				return; 
			case FormValidationPackage.REF_ENTITY:
				sequence_RefEntity(context, (RefEntity) semanticObject); 
				return; 
			case FormValidationPackage.REQUIRED:
				sequence_Required(context, (Required) semanticObject); 
				return; 
			case FormValidationPackage.STRING_PATTERN:
				sequence_StringPattern(context, (StringPattern) semanticObject); 
				return; 
			case FormValidationPackage.TAB:
				sequence_Tab(context, (Tab) semanticObject); 
				return; 
			case FormValidationPackage.TABLE_OVERVIEW:
				sequence_TableOverview(context, (TableOverview) semanticObject); 
				return; 
			case FormValidationPackage.TEL_INPUT:
				sequence_TelInput(context, (TelInput) semanticObject); 
				return; 
			case FormValidationPackage.TEXT_AREA:
				sequence_TextArea(context, (TextArea) semanticObject); 
				return; 
			case FormValidationPackage.TEXT_INPUT:
				sequence_TextInput(context, (TextInput) semanticObject); 
				return; 
			case FormValidationPackage.VALIDATION_CLASS:
				sequence_ValidationClass(context, (ValidationClass) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AttributeRule returns AcceptableValuesDate
	 *     AcceptableValuesDate returns AcceptableValuesDate
	 *
	 * Constraint:
	 *     ((values+=EString values+=EString*)? attributeRuleErrorMessage=ErrorMessage?)
	 */
	protected void sequence_AcceptableValuesDate(ISerializationContext context, AcceptableValuesDate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AttributeRule returns AcceptableValuesString
	 *     AcceptableValuesString returns AcceptableValuesString
	 *
	 * Constraint:
	 *     ((values+=EString values+=EString*)? attributeRuleErrorMessage=ErrorMessage?)
	 */
	protected void sequence_AcceptableValuesString(ISerializationContext context, AcceptableValuesString semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AttributeArray returns AttributeArray
	 *
	 * Constraint:
	 *     (attributes+=[ClassAttribute|EString] attributes+=[ClassAttribute|EString]*)
	 */
	protected void sequence_AttributeArray(ISerializationContext context, AttributeArray semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AdditionalSettings returns AttributeSettings
	 *     AttributeSettings returns AttributeSettings
	 *
	 * Constraint:
	 *     presentation=ERequiredField?
	 */
	protected void sequence_AttributeSettings(ISerializationContext context, AttributeSettings semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AttributeType returns AttributeType
	 *
	 * Constraint:
	 *     (attributeDataType=AttributeDataType uiComponent=UIComponent?)
	 */
	protected void sequence_AttributeType(ISerializationContext context, AttributeType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UIComponent returns AutocompleteComponent
	 *     AutocompleteComponent returns AutocompleteComponent
	 *
	 * Constraint:
	 *     (tooltip=EString? note=EString?)
	 */
	protected void sequence_AutocompleteComponent(ISerializationContext context, AutocompleteComponent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BusinessModel returns BusinessModel
	 *
	 * Constraint:
	 *     (validationclasses+=ValidationClass validationclasses+=ValidationClass*)?
	 */
	protected void sequence_BusinessModel(ISerializationContext context, BusinessModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UIComponent returns CheckBox
	 *     CheckBox returns CheckBox
	 *
	 * Constraint:
	 *     (tooltip=EString? note=EString? orientation=EOrientation?)
	 */
	protected void sequence_CheckBox(ISerializationContext context, CheckBox semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ClassAttribute returns ClassAttribute
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         label=EString? 
	 *         attributetype=AttributeType 
	 *         master?='Master'? 
	 *         isClassRepresenting?='ClassRepresenting'? 
	 *         (attributerule+=AttributeRule attributerule+=AttributeRule*)?
	 *     )
	 */
	protected void sequence_ClassAttribute(ISerializationContext context, ClassAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Color returns Color
	 *
	 * Constraint:
	 *     (red=EInt? green=EInt? blue=EInt?)
	 */
	protected void sequence_Color(ISerializationContext context, Color semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AttributeRule returns DatePattern
	 *     DatePattern returns DatePattern
	 *
	 * Constraint:
	 *     (value=EString? attributeRuleErrorMessage=ErrorMessage?)
	 */
	protected void sequence_DatePattern(ISerializationContext context, DatePattern semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UIComponent returns DateUIComponent
	 *     DateUIComponent returns DateUIComponent
	 *
	 * Constraint:
	 *     (tooltip=EString? note=EString? type=EDateUIType?)
	 */
	protected void sequence_DateUIComponent(ISerializationContext context, DateUIComponent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UIComponent returns DropDownList
	 *     DropDownList returns DropDownList
	 *
	 * Constraint:
	 *     (isMultiSelect?='MultiSelectable'? tooltip=EString? note=EString?)
	 */
	protected void sequence_DropDownList(ISerializationContext context, DropDownList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UIComponent returns EmailInput
	 *     EmailInput returns EmailInput
	 *
	 * Constraint:
	 *     (tooltip=EString? note=EString? placeHolder=EString?)
	 */
	protected void sequence_EmailInput(ISerializationContext context, EmailInput semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ClassRule returns Equals
	 *     Equals returns Equals
	 *
	 * Constraint:
	 *     (classRuleErrorMessage=ErrorMessage? attributearray=AttributeArray?)
	 */
	protected void sequence_Equals(ISerializationContext context, Equals semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AdditionalSettings returns ErrorMessageSettings
	 *     ErrorMessageSettings returns ErrorMessageSettings
	 *
	 * Constraint:
	 *     (position=EPosition? color=Color?)
	 */
	protected void sequence_ErrorMessageSettings(ISerializationContext context, ErrorMessageSettings semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ErrorMessage returns ErrorMessage
	 *
	 * Constraint:
	 *     message=EString?
	 */
	protected void sequence_ErrorMessage(ISerializationContext context, ErrorMessage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FormLayout returns FieldSet
	 *     FieldSet returns FieldSet
	 *
	 * Constraint:
	 *     (name=EString legend=EString? attributearray=AttributeArray? (layouts+=FormLayout layouts+=FormLayout*)?)
	 */
	protected void sequence_FieldSet(ISerializationContext context, FieldSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UIComponent returns FileInput
	 *     FileInput returns FileInput
	 *
	 * Constraint:
	 *     (tooltip=EString? note=EString? buttonPosition=EPosition?)
	 */
	protected void sequence_FileInput(ISerializationContext context, FileInput semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AdditionalSettings returns FormSettings
	 *     FormSettings returns FormSettings
	 *
	 * Constraint:
	 *     autoComplete?='Auto Complete'?
	 */
	protected void sequence_FormSettings(ISerializationContext context, FormSettings semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ClassRule returns GreaterThan
	 *     GreaterThan returns GreaterThan
	 *
	 * Constraint:
	 *     (classattribute=[ClassAttribute|EString]? classRuleErrorMessage=ErrorMessage? (attributearray+=AttributeArray attributearray+=AttributeArray*)?)
	 */
	protected void sequence_GreaterThan(ISerializationContext context, GreaterThan semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FormLayout returns Grid
	 *     Grid returns Grid
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         numOfColumns=EInt? 
	 *         numOfRows=EInt? 
	 *         order=EGridOrder? 
	 *         expandLast?='Expand last'? 
	 *         attributearray=AttributeArray? 
	 *         (layouts+=FormLayout layouts+=FormLayout*)?
	 *     )
	 */
	protected void sequence_Grid(ISerializationContext context, Grid semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AdditionalSettings returns LabelSettings
	 *     LabelSettings returns LabelSettings
	 *
	 * Constraint:
	 *     position=EPosition?
	 */
	protected void sequence_LabelSettings(ISerializationContext context, LabelSettings semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AttributeRule returns Length
	 *     Length returns Length
	 *
	 * Constraint:
	 *     (value=Int0? attributeRuleErrorMessage=ErrorMessage?)
	 */
	protected void sequence_Length(ISerializationContext context, Length semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ClassRule returns LessThan
	 *     LessThan returns LessThan
	 *
	 * Constraint:
	 *     (classattribute=[ClassAttribute|EString]? classRuleErrorMessage=ErrorMessage? (attributearray+=AttributeArray attributearray+=AttributeArray*)?)
	 */
	protected void sequence_LessThan(ISerializationContext context, LessThan semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UIComponent returns LoadValues
	 *     LoadValues returns LoadValues
	 *
	 * Constraint:
	 *     (isMultiSelect?='isMultiSelect'? tooltip=EString? note=EString?)
	 */
	protected void sequence_LoadValues(ISerializationContext context, LoadValues semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AttributeRule returns MaxDate
	 *     MaxDate returns MaxDate
	 *
	 * Constraint:
	 *     (value=EString? attributeRuleErrorMessage=ErrorMessage?)
	 */
	protected void sequence_MaxDate(ISerializationContext context, MaxDate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AttributeRule returns MaxLength
	 *     MaxLength returns MaxLength
	 *
	 * Constraint:
	 *     (value=EInt? attributeRuleErrorMessage=ErrorMessage?)
	 */
	protected void sequence_MaxLength(ISerializationContext context, MaxLength semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AttributeRule returns MaxNumber
	 *     MaxNumber returns MaxNumber
	 *
	 * Constraint:
	 *     (value=Float? attributeRuleErrorMessage=ErrorMessage?)
	 */
	protected void sequence_MaxNumber(ISerializationContext context, MaxNumber semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AttributeRule returns MinDate
	 *     MinDate returns MinDate
	 *
	 * Constraint:
	 *     (value=EString? attributeRuleErrorMessage=ErrorMessage?)
	 */
	protected void sequence_MinDate(ISerializationContext context, MinDate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AttributeRule returns MinLength
	 *     MinLength returns MinLength
	 *
	 * Constraint:
	 *     (value=EInt? attributeRuleErrorMessage=ErrorMessage?)
	 */
	protected void sequence_MinLength(ISerializationContext context, MinLength semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AttributeRule returns MinNumber
	 *     MinNumber returns MinNumber
	 *
	 * Constraint:
	 *     (value=Float? attributeRuleErrorMessage=ErrorMessage?)
	 */
	protected void sequence_MinNumber(ISerializationContext context, MinNumber semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AttributeDataType returns NonPrimitiveDataType
	 *     NonPrimitiveDataType returns NonPrimitiveDataType
	 *
	 * Constraint:
	 *     (type=[ValidationClass|EString] isCollection?='Collection'?)
	 */
	protected void sequence_NonPrimitiveDataType(ISerializationContext context, NonPrimitiveDataType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ClassRule returns NotEquals
	 *     NotEquals returns NotEquals
	 *
	 * Constraint:
	 *     (classRuleErrorMessage=ErrorMessage? attributearray=AttributeArray?)
	 */
	protected void sequence_NotEquals(ISerializationContext context, NotEquals semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AdditionalSettings returns NoteSettings
	 *     NoteSettings returns NoteSettings
	 *
	 * Constraint:
	 *     position=EPosition?
	 */
	protected void sequence_NoteSettings(ISerializationContext context, NoteSettings semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UIComponent returns NumericUIComponent
	 *     NumericUIComponent returns NumericUIComponent
	 *
	 * Constraint:
	 *     (tooltip=EString? note=EString? defaultValue=EDouble? componentType=EUINumberComponentType?)
	 */
	protected void sequence_NumericUIComponent(ISerializationContext context, NumericUIComponent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     OverviewSettings returns OverviewSettings
	 *
	 * Constraint:
	 *     tableoverview=TableOverview?
	 */
	protected void sequence_OverviewSettings(ISerializationContext context, OverviewSettings semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Pagination returns Pagination
	 *
	 * Constraint:
	 *     ((possibleNumberOfShownRows+=EInt possibleNumberOfShownRows+=EInt*)? defaultNumOfShownRows=EInt?)
	 */
	protected void sequence_Pagination(ISerializationContext context, Pagination semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UIComponent returns Password
	 *     Password returns Password
	 *
	 * Constraint:
	 *     (tooltip=EString? note=EString? placeHolder=EString? visible=EBoolean?)
	 */
	protected void sequence_Password(ISerializationContext context, Password semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AttributeDataType returns PrimitiveDataType
	 *     PrimitiveDataType returns PrimitiveDataType
	 *
	 * Constraint:
	 *     (type=EDataType? isCollection?='Collection'?)
	 */
	protected void sequence_PrimitiveDataType(ISerializationContext context, PrimitiveDataType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UIComponent returns RadioButton
	 *     RadioButton returns RadioButton
	 *
	 * Constraint:
	 *     (tooltip=EString? note=EString? orientation=EOrientation?)
	 */
	protected void sequence_RadioButton(ISerializationContext context, RadioButton semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UIComponent returns RefEntity
	 *     RefEntity returns RefEntity
	 *
	 * Constraint:
	 *     (tooltip=EString? note=EString? isSingeValue=EBoolean?)
	 */
	protected void sequence_RefEntity(ISerializationContext context, RefEntity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AttributeRule returns Required
	 *     Required returns Required
	 *
	 * Constraint:
	 *     attributeRuleErrorMessage=ErrorMessage?
	 */
	protected void sequence_Required(ISerializationContext context, Required semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AttributeRule returns StringPattern
	 *     StringPattern returns StringPattern
	 *
	 * Constraint:
	 *     (value=EString? attributeRuleErrorMessage=ErrorMessage?)
	 */
	protected void sequence_StringPattern(ISerializationContext context, StringPattern semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FormLayout returns Tab
	 *     Tab returns Tab
	 *
	 * Constraint:
	 *     (name=EString label=EString? attributearray=AttributeArray? (layouts+=FormLayout layouts+=FormLayout*)?)
	 */
	protected void sequence_Tab(ISerializationContext context, Tab semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TableOverview returns TableOverview
	 *
	 * Constraint:
	 *     (name=EString height=EInt? width=EInt? title=EString? paging=Pagination?)
	 */
	protected void sequence_TableOverview(ISerializationContext context, TableOverview semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UIComponent returns TelInput
	 *     TelInput returns TelInput
	 *
	 * Constraint:
	 *     (tooltip=EString? note=EString? placeHolder=EString?)
	 */
	protected void sequence_TelInput(ISerializationContext context, TelInput semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UIComponent returns TextArea
	 *     TextArea returns TextArea
	 *
	 * Constraint:
	 *     (tooltip=EString? note=EString? placeHolder=EString? numOfRows=EInt?)
	 */
	protected void sequence_TextArea(ISerializationContext context, TextArea semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UIComponent returns TextInput
	 *     TextInput returns TextInput
	 *
	 * Constraint:
	 *     (tooltip=EString? note=EString? placeHolder=EString?)
	 */
	protected void sequence_TextInput(ISerializationContext context, TextInput semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ValidationClass returns ValidationClass
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         label=EString? 
	 *         (classattribute+=ClassAttribute classattribute+=ClassAttribute*)? 
	 *         (classrule+=ClassRule classrule+=ClassRule*)? 
	 *         (formlayout+=FormLayout formlayout+=FormLayout*)? 
	 *         (additionalSettings+=AdditionalSettings additionalSettings+=AdditionalSettings*)? 
	 *         overviewsettings=OverviewSettings?
	 *     )
	 */
	protected void sequence_ValidationClass(ISerializationContext context, ValidationClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
