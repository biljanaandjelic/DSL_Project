/**
 */
package er.util;

import er.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see er.ErPackage
 * @generated
 */
public class ErValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ErValidator INSTANCE = new ErValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "er";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ErPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ErPackage.ENTITY:
				return validateEntity((Entity)value, diagnostics, context);
			case ErPackage.MODELLING_CONCEPT:
				return validateModellingConcept((ModellingConcept)value, diagnostics, context);
			case ErPackage.RELATIONSHIP_CONCEPT:
				return validateRelationshipConcept((RelationshipConcept)value, diagnostics, context);
			case ErPackage.ATTRIBUTE:
				return validateAttribute((Attribute)value, diagnostics, context);
			case ErPackage.DOMAIN:
				return validateDomain((Domain)value, diagnostics, context);
			case ErPackage.RELATIONSHIP:
				return validateRelationship((Relationship)value, diagnostics, context);
			case ErPackage.ISA:
				return validateISA((ISA)value, diagnostics, context);
			case ErPackage.CATEGORISATION:
				return validateCategorisation((Categorisation)value, diagnostics, context);
			case ErPackage.IDENTIFICATION_DEPENDENCY:
				return validateIdentificationDependency((IdentificationDependency)value, diagnostics, context);
			case ErPackage.REGULAR_ENTITY:
				return validateRegularEntity((RegularEntity)value, diagnostics, context);
			case ErPackage.CATEGORIES:
				return validateCategories((Categories)value, diagnostics, context);
			case ErPackage.ER_MODEL:
				return validateERModel((ERModel)value, diagnostics, context);
			case ErPackage.ENTITY_CONCEPT:
				return validateEntityConcept((EntityConcept)value, diagnostics, context);
			case ErPackage.KEY:
				return validateKey((Key)value, diagnostics, context);
			case ErPackage.GERUND:
				return validateGerund((Gerund)value, diagnostics, context);
			case ErPackage.ATTRIBUTE_DOMAIN:
				return validateAttributeDomain((AttributeDomain)value, diagnostics, context);
			case ErPackage.MIN_CARDINALITY:
				return validateMinCardinality((MinCardinality)value, diagnostics, context);
			case ErPackage.MAX_CARDINALITY:
				return validateMaxCardinality((MaxCardinality)value, diagnostics, context);
			case ErPackage.PRIMITIVE_DOMAIN:
				return validatePrimitiveDomain((PrimitiveDomain)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(entity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateModellingConcept_existedName(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_existedKey(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_invalidPrimaryKey(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_invalidAttributInKey(entity, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the existedKey constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__EXISTED_KEY__EEXPRESSION = "\n" +
		"\t\t\tkeySet->forAll(k1:Key, k2:Key | k1.keyAttributes->intersection(k2.keyAttributes)->includesAll(k1.keyAttributes) and k1.keyAttributes->symmetricDifference(k2.keyAttributes)->isEmpty() implies k1=k2)";

	/**
	 * Validates the existedKey constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_existedKey(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ErPackage.Literals.ENTITY,
				 entity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "existedKey",
				 ENTITY__EXISTED_KEY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the invalidPrimaryKey constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__INVALID_PRIMARY_KEY__EEXPRESSION = "\n" +
		"\t\t\tif(keySet->notEmpty()) then\n" +
		"\t\t\t\tif(not primaryKey->oclIsUndefined()) then\n" +
		"\t\t\t\t\tkeySet->includes(primaryKey)\n" +
		"\t\t\t\telse\n" +
		"\t\t\t\t\tnot primaryKey->oclIsUndefined()\n" +
		"\t\t\t\tendif\n" +
		"\t\t\telse\n" +
		"\t\t\t\tkeySet->isEmpty()\n" +
		"\t\t\tendif";

	/**
	 * Validates the invalidPrimaryKey constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_invalidPrimaryKey(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ErPackage.Literals.ENTITY,
				 entity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "invalidPrimaryKey",
				 ENTITY__INVALID_PRIMARY_KEY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the invalidAttributInKey constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__INVALID_ATTRIBUT_IN_KEY__EEXPRESSION = "\n" +
		"\t\t\t\tif(not keySet.keyAttributes->isEmpty()) then\n" +
		"\t\t\t\t\tif(entityAttributes->notEmpty()) then\n" +
		"\t\t\t\t\t\tentityAttributes->includesAll(keySet.keyAttributes)\n" +
		"\t\t\t\t\telse\n" +
		"\t\t\t\t\t\tentityAttributes->notEmpty()\n" +
		"\t\t\t\t\tendif\n" +
		"\t\t\t\telse\n" +
		"\t\t\t\t\tkeySet.keyAttributes->isEmpty()\n" +
		"\t\t\t\tendif";

	/**
	 * Validates the invalidAttributInKey constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_invalidAttributInKey(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ErPackage.Literals.ENTITY,
				 entity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "invalidAttributInKey",
				 ENTITY__INVALID_ATTRIBUT_IN_KEY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModellingConcept(ModellingConcept modellingConcept, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(modellingConcept, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(modellingConcept, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(modellingConcept, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(modellingConcept, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(modellingConcept, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(modellingConcept, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(modellingConcept, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(modellingConcept, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(modellingConcept, diagnostics, context);
		if (result || diagnostics != null) result &= validateModellingConcept_existedName(modellingConcept, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the existedName constraint of '<em>Modelling Concept</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MODELLING_CONCEPT__EXISTED_NAME__EEXPRESSION = "\n" +
		"\t\t\tModellingConcept.allInstances()->symmetricDifference(Gerund.allInstances())->forAll(m1:ModellingConcept, m2:ModellingConcept | m1.name = m2.name implies m1=m2)";

	/**
	 * Validates the existedName constraint of '<em>Modelling Concept</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModellingConcept_existedName(ModellingConcept modellingConcept, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ErPackage.Literals.MODELLING_CONCEPT,
				 modellingConcept,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "existedName",
				 MODELLING_CONCEPT__EXISTED_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipConcept(RelationshipConcept relationshipConcept, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(relationshipConcept, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(relationshipConcept, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(relationshipConcept, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(relationshipConcept, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(relationshipConcept, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(relationshipConcept, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(relationshipConcept, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(relationshipConcept, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(relationshipConcept, diagnostics, context);
		if (result || diagnostics != null) result &= validateModellingConcept_existedName(relationshipConcept, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateModellingConcept_existedName(attribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomain(Domain domain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(domain, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(domain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(domain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(domain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(domain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(domain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(domain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(domain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(domain, diagnostics, context);
		if (result || diagnostics != null) result &= validateModellingConcept_existedName(domain, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationship(Relationship relationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(relationship, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateModellingConcept_existedName(relationship, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateISA(ISA isa, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(isa, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(isa, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(isa, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(isa, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(isa, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(isa, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(isa, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(isa, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(isa, diagnostics, context);
		if (result || diagnostics != null) result &= validateModellingConcept_existedName(isa, diagnostics, context);
		if (result || diagnostics != null) result &= validateISA_invalidClassificationAtrtibute(isa, diagnostics, context);
		if (result || diagnostics != null) result &= validateISA_SubTypeExistsAsSuperType(isa, diagnostics, context);
		if (result || diagnostics != null) result &= validateISA_duplicateSybtype(isa, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the invalidClassificationAtrtibute constraint of '<em>ISA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ISA__INVALID_CLASSIFICATION_ATRTIBUTE__EEXPRESSION = "\n" +
		"\t\tif supertype.entity.oclIsTypeOf(Entity) then\n" +
		"\t\t\tsupertype.entity.oclAsType(Entity).entityAttributes->includes(classificationAttribute) \n" +
		"\t\telse \n" +
		"\t\t\tsupertype.entity.oclAsType(Gerund).relationship.relationshipAttributes->includes(classificationAttribute) \t\n" +
		"\t\tendif";

	/**
	 * Validates the invalidClassificationAtrtibute constraint of '<em>ISA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateISA_invalidClassificationAtrtibute(ISA isa, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ErPackage.Literals.ISA,
				 isa,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "invalidClassificationAtrtibute",
				 ISA__INVALID_CLASSIFICATION_ATRTIBUTE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SubTypeExistsAsSuperType constraint of '<em>ISA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ISA__SUB_TYPE_EXISTS_AS_SUPER_TYPE__EEXPRESSION = "\n" +
		"\t\tif(supertype.entity.oclIsTypeOf(Entity)) then \n" +
		"\t\t\tsubtypes->excludes(supertype.entity.oclAsType(Entity))\n" +
		"\t\telse\n" +
		"\t\t\tnot supertype.entity.oclIsTypeOf(Entity)\n" +
		"\t\tendif";

	/**
	 * Validates the SubTypeExistsAsSuperType constraint of '<em>ISA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateISA_SubTypeExistsAsSuperType(ISA isa, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ErPackage.Literals.ISA,
				 isa,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SubTypeExistsAsSuperType",
				 ISA__SUB_TYPE_EXISTS_AS_SUPER_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the duplicateSybtype constraint of '<em>ISA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ISA__DUPLICATE_SYBTYPE__EEXPRESSION = "\n" +
		"\t\t\tISA.allInstances().subtypes->forAll(e1:Entity | ISA.allInstances().subtypes->select(e2 | e1.name=e2.name)->size()<2)";

	/**
	 * Validates the duplicateSybtype constraint of '<em>ISA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateISA_duplicateSybtype(ISA isa, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ErPackage.Literals.ISA,
				 isa,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "duplicateSybtype",
				 ISA__DUPLICATE_SYBTYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCategorisation(Categorisation categorisation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(categorisation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(categorisation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(categorisation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(categorisation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(categorisation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(categorisation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(categorisation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(categorisation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(categorisation, diagnostics, context);
		if (result || diagnostics != null) result &= validateModellingConcept_existedName(categorisation, diagnostics, context);
		if (result || diagnostics != null) result &= validateCategorisation_invalidCategory(categorisation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the invalidCategory constraint of '<em>Categorisation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CATEGORISATION__INVALID_CATEGORY__EEXPRESSION = "\n" +
		"\t\t\tcategorisationEntities.entities->excludes(categorisedEntity) and categorisationEntities.entities->\n" +
		"\t\t\tforAll(e1:EntityConcept, e2:EntityConcept | \n" +
		"\t\t\t\t\t\tif(e1.oclIsTypeOf(Entity) and  e2.oclIsTypeOf(Entity)) then\n" +
		"\t\t\t\t\t\t\te1.oclAsType(Entity).name = e2.oclAsType(Entity).name implies e1 = e2\n" +
		"\t\t\t\t\t\telse if(e1.oclIsTypeOf(Gerund) and  e2.oclIsTypeOf(Gerund)) then\n" +
		"\t\t\t\t\t\t\t\te1.oclAsType(Gerund).relationship.name = e2.oclAsType(Gerund).relationship.name implies e1 = e2\n" +
		"\t\t\t\t\t\t\t else\n" +
		"\t\t\t\t\t\t\t \ttrue\n" +
		"\t\t\t\t\t\t\t endif\n" +
		"\t\t\t\t\t\tendif\n" +
		"\t\t\t\t\t)";

	/**
	 * Validates the invalidCategory constraint of '<em>Categorisation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCategorisation_invalidCategory(Categorisation categorisation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ErPackage.Literals.CATEGORISATION,
				 categorisation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "invalidCategory",
				 CATEGORISATION__INVALID_CATEGORY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentificationDependency(IdentificationDependency identificationDependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(identificationDependency, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(identificationDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(identificationDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(identificationDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(identificationDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(identificationDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(identificationDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(identificationDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(identificationDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateModellingConcept_existedName(identificationDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateIdentificationDependency_invalidWeakEntity(identificationDependency, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the invalidWeakEntity constraint of '<em>Identification Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String IDENTIFICATION_DEPENDENCY__INVALID_WEAK_ENTITY__EEXPRESSION = "\n" +
		"\t\tif(regularEntity.entity.oclIsTypeOf(Entity)) then\n" +
		"\t\t\tregularEntity.entity.oclAsType(Entity) <> weakEntity\n" +
		"\t\telse\n" +
		"\t\t\tnot regularEntity.entity.oclIsTypeOf(Entity)\n" +
		"\t\tendif";

	/**
	 * Validates the invalidWeakEntity constraint of '<em>Identification Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentificationDependency_invalidWeakEntity(IdentificationDependency identificationDependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ErPackage.Literals.IDENTIFICATION_DEPENDENCY,
				 identificationDependency,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "invalidWeakEntity",
				 IDENTIFICATION_DEPENDENCY__INVALID_WEAK_ENTITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegularEntity(RegularEntity regularEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(regularEntity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCategories(Categories categories, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(categories, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateERModel(ERModel erModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(erModel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(erModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(erModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(erModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(erModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(erModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(erModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(erModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(erModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateModellingConcept_existedName(erModel, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntityConcept(EntityConcept entityConcept, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entityConcept, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKey(Key key, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(key, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(key, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(key, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(key, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(key, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(key, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(key, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(key, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(key, diagnostics, context);
		if (result || diagnostics != null) result &= validateModellingConcept_existedName(key, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGerund(Gerund gerund, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gerund, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDomain(AttributeDomain attributeDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeDomain, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMinCardinality(MinCardinality minCardinality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaxCardinality(MaxCardinality maxCardinality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimitiveDomain(PrimitiveDomain primitiveDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ErValidator
