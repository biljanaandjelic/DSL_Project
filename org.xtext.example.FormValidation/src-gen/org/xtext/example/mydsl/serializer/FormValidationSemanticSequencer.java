/*
 * generated by Xtext 2.9.1
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import formValidation.AcceptableValuesDate;
import formValidation.AcceptableValuesString;
import formValidation.AttributeArray;
import formValidation.AttributeType;
import formValidation.ClassAttribute;
import formValidation.DatePattern;
import formValidation.Email;
import formValidation.Equals;
import formValidation.FormValidationPackage;
import formValidation.GreaterThan;
import formValidation.Length;
import formValidation.LessThan;
import formValidation.MaxDate;
import formValidation.MaxLength;
import formValidation.MaxNumber;
import formValidation.MinDate;
import formValidation.MinLength;
import formValidation.MinNumber;
import formValidation.NotEquals;
import formValidation.Required;
import formValidation.StringPattern;
import formValidation.ValidationClass;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.services.FormValidationGrammarAccess;

@SuppressWarnings("all")
public class FormValidationSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private FormValidationGrammarAccess grammarAccess;
	
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
			case FormValidationPackage.ATTRIBUTE_TYPE:
				sequence_AttributeType(context, (AttributeType) semanticObject); 
				return; 
			case FormValidationPackage.CLASS_ATTRIBUTE:
				sequence_ClassAttribute(context, (ClassAttribute) semanticObject); 
				return; 
			case FormValidationPackage.DATE_PATTERN:
				sequence_DatePattern(context, (DatePattern) semanticObject); 
				return; 
			case FormValidationPackage.EMAIL:
				sequence_Email(context, (Email) semanticObject); 
				return; 
			case FormValidationPackage.EQUALS:
				sequence_Equals(context, (Equals) semanticObject); 
				return; 
			case FormValidationPackage.GREATER_THAN:
				sequence_GreaterThan(context, (GreaterThan) semanticObject); 
				return; 
			case FormValidationPackage.LENGTH:
				sequence_Length(context, (Length) semanticObject); 
				return; 
			case FormValidationPackage.LESS_THAN:
				sequence_LessThan(context, (LessThan) semanticObject); 
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
			case FormValidationPackage.NOT_EQUALS:
				sequence_NotEquals(context, (NotEquals) semanticObject); 
				return; 
			case FormValidationPackage.REQUIRED:
				sequence_Required(context, (Required) semanticObject); 
				return; 
			case FormValidationPackage.STRING_PATTERN:
				sequence_StringPattern(context, (StringPattern) semanticObject); 
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
	 *     (values+=EString values+=EString*)?
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
	 *     (values+=EString values+=EString*)?
	 */
	protected void sequence_AcceptableValuesString(ISerializationContext context, AcceptableValuesString semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AttributeArray returns AttributeArray
	 *
	 * Constraint:
	 *     (classattribute+=[ClassAttribute|EString] classattribute+=[ClassAttribute|EString]*)?
	 */
	protected void sequence_AttributeArray(ISerializationContext context, AttributeArray semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AttributeType returns AttributeType
	 *
	 * Constraint:
	 *     vrsta=EVrsta
	 */
	protected void sequence_AttributeType(ISerializationContext context, AttributeType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FormValidationPackage.Literals.ATTRIBUTE_TYPE__VRSTA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FormValidationPackage.Literals.ATTRIBUTE_TYPE__VRSTA));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAttributeTypeAccess().getVrstaEVrstaEnumRuleCall_1_0(), semanticObject.getVrsta());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ClassAttribute returns ClassAttribute
	 *
	 * Constraint:
	 *     (name=EString attributetype=AttributeType (attributerule+=AttributeRule attributerule+=AttributeRule*)?)
	 */
	protected void sequence_ClassAttribute(ISerializationContext context, ClassAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AttributeRule returns DatePattern
	 *     DatePattern returns DatePattern
	 *
	 * Constraint:
	 *     value=EString?
	 */
	protected void sequence_DatePattern(ISerializationContext context, DatePattern semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AttributeRule returns Email
	 *     Email returns Email
	 *
	 * Constraint:
	 *     isEmail?='isEmail'?
	 */
	protected void sequence_Email(ISerializationContext context, Email semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ClassRule returns Equals
	 *     Equals returns Equals
	 *
	 * Constraint:
	 *     attributearray=AttributeArray?
	 */
	protected void sequence_Equals(ISerializationContext context, Equals semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ClassRule returns GreaterThan
	 *     GreaterThan returns GreaterThan
	 *
	 * Constraint:
	 *     (classattribute=[ClassAttribute|EString]? (attributearray+=AttributeArray attributearray+=AttributeArray*)?)
	 */
	protected void sequence_GreaterThan(ISerializationContext context, GreaterThan semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AttributeRule returns Length
	 *     Length returns Length
	 *
	 * Constraint:
	 *     value=Int0?
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
	 *     (classattribute=[ClassAttribute|EString]? (attributearray+=AttributeArray attributearray+=AttributeArray*)?)
	 */
	protected void sequence_LessThan(ISerializationContext context, LessThan semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AttributeRule returns MaxDate
	 *     MaxDate returns MaxDate
	 *
	 * Constraint:
	 *     value=EString?
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
	 *     value=Int0?
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
	 *     value=Float?
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
	 *     value=EString?
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
	 *     value=Int0?
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
	 *     value=Float?
	 */
	protected void sequence_MinNumber(ISerializationContext context, MinNumber semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ClassRule returns NotEquals
	 *     NotEquals returns NotEquals
	 *
	 * Constraint:
	 *     attributearray=AttributeArray?
	 */
	protected void sequence_NotEquals(ISerializationContext context, NotEquals semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AttributeRule returns Required
	 *     Required returns Required
	 *
	 * Constraint:
	 *     isRequired?='isRequired'?
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
	 *     value=EString?
	 */
	protected void sequence_StringPattern(ISerializationContext context, StringPattern semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ValidationClass returns ValidationClass
	 *
	 * Constraint:
	 *     (name=EString (classattribute+=ClassAttribute classattribute+=ClassAttribute*)? (classrule+=ClassRule classrule+=ClassRule*)?)
	 */
	protected void sequence_ValidationClass(ISerializationContext context, ValidationClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
