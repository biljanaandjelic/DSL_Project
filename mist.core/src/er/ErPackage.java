/**
 */
package er;

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
 * @see er.ErFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore#/'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface ErPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "er";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/er";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "er";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ErPackage eINSTANCE = er.impl.ErPackageImpl.init();

	/**
	 * The meta object id for the '{@link er.impl.ModellingConceptImpl <em>Modelling Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see er.impl.ModellingConceptImpl
	 * @see er.impl.ErPackageImpl#getModellingConcept()
	 * @generated
	 */
	int MODELLING_CONCEPT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELLING_CONCEPT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Modelling Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELLING_CONCEPT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Modelling Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELLING_CONCEPT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link er.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see er.impl.EntityImpl
	 * @see er.impl.ErPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = MODELLING_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Entity Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ENTITY_ATTRIBUTES = MODELLING_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__KEY_SET = MODELLING_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PRIMARY_KEY = MODELLING_CONCEPT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = MODELLING_CONCEPT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = MODELLING_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link er.impl.RelationshipConceptImpl <em>Relationship Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see er.impl.RelationshipConceptImpl
	 * @see er.impl.ErPackageImpl#getRelationshipConcept()
	 * @generated
	 */
	int RELATIONSHIP_CONCEPT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_CONCEPT__NAME = MODELLING_CONCEPT__NAME;

	/**
	 * The number of structural features of the '<em>Relationship Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_CONCEPT_FEATURE_COUNT = MODELLING_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Relationship Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_CONCEPT_OPERATION_COUNT = MODELLING_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link er.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see er.impl.AttributeImpl
	 * @see er.impl.ErPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = MODELLING_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Attribute Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTRIBUTE_DOMAIN = MODELLING_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = MODELLING_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = MODELLING_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link er.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see er.impl.DomainImpl
	 * @see er.impl.ErPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__NAME = MODELLING_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Primitive Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__PRIMITIVE_DOMAIN = MODELLING_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = MODELLING_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OPERATION_COUNT = MODELLING_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link er.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see er.impl.RelationshipImpl
	 * @see er.impl.ErPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__NAME = RELATIONSHIP_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__ENTITIES = RELATIONSHIP_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relationship Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__RELATIONSHIP_ATTRIBUTES = RELATIONSHIP_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = RELATIONSHIP_CONCEPT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = RELATIONSHIP_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link er.impl.ISAImpl <em>ISA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see er.impl.ISAImpl
	 * @see er.impl.ErPackageImpl#getISA()
	 * @generated
	 */
	int ISA = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISA__NAME = RELATIONSHIP_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Supertype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISA__SUPERTYPE = RELATIONSHIP_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subtypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISA__SUBTYPES = RELATIONSHIP_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Classification Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISA__CLASSIFICATION_ATTRIBUTE = RELATIONSHIP_CONCEPT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>ISA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISA_FEATURE_COUNT = RELATIONSHIP_CONCEPT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>ISA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISA_OPERATION_COUNT = RELATIONSHIP_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link er.impl.CategorisationImpl <em>Categorisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see er.impl.CategorisationImpl
	 * @see er.impl.ErPackageImpl#getCategorisation()
	 * @generated
	 */
	int CATEGORISATION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORISATION__NAME = RELATIONSHIP_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Categorisation Entities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORISATION__CATEGORISATION_ENTITIES = RELATIONSHIP_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Partial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORISATION__IS_PARTIAL = RELATIONSHIP_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Categorised Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORISATION__CATEGORISED_ENTITY = RELATIONSHIP_CONCEPT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Categorisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORISATION_FEATURE_COUNT = RELATIONSHIP_CONCEPT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Categorisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORISATION_OPERATION_COUNT = RELATIONSHIP_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link er.impl.IdentificationDependencyImpl <em>Identification Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see er.impl.IdentificationDependencyImpl
	 * @see er.impl.ErPackageImpl#getIdentificationDependency()
	 * @generated
	 */
	int IDENTIFICATION_DEPENDENCY = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_DEPENDENCY__NAME = RELATIONSHIP_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Weak Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_DEPENDENCY__WEAK_ENTITY = RELATIONSHIP_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Regular Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_DEPENDENCY__REGULAR_ENTITY = RELATIONSHIP_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Identification Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_DEPENDENCY_FEATURE_COUNT = RELATIONSHIP_CONCEPT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Identification Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_DEPENDENCY_OPERATION_COUNT = RELATIONSHIP_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link er.impl.RegularEntityImpl <em>Regular Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see er.impl.RegularEntityImpl
	 * @see er.impl.ErPackageImpl#getRegularEntity()
	 * @generated
	 */
	int REGULAR_ENTITY = 9;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_ENTITY__ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_ENTITY__ROLE = 1;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_ENTITY__MIN = 2;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_ENTITY__MAX = 3;

	/**
	 * The number of structural features of the '<em>Regular Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_ENTITY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Regular Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link er.impl.CategoriesImpl <em>Categories</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see er.impl.CategoriesImpl
	 * @see er.impl.ErPackageImpl#getCategories()
	 * @generated
	 */
	int CATEGORIES = 10;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIES__ENTITIES = 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIES__MIN = 1;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIES__MAX = 2;

	/**
	 * The number of structural features of the '<em>Categories</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Categories</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link er.impl.ERModelImpl <em>ER Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see er.impl.ERModelImpl
	 * @see er.impl.ErPackageImpl#getERModel()
	 * @generated
	 */
	int ER_MODEL = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ER_MODEL__NAME = MODELLING_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ER_MODEL__ENTITIES = MODELLING_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ER_MODEL__RELATIONSHIPS = MODELLING_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gerunds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ER_MODEL__GERUNDS = MODELLING_CONCEPT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Domains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ER_MODEL__DOMAINS = MODELLING_CONCEPT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>ER Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ER_MODEL_FEATURE_COUNT = MODELLING_CONCEPT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>ER Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ER_MODEL_OPERATION_COUNT = MODELLING_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link er.impl.EntityConceptImpl <em>Entity Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see er.impl.EntityConceptImpl
	 * @see er.impl.ErPackageImpl#getEntityConcept()
	 * @generated
	 */
	int ENTITY_CONCEPT = 12;

	/**
	 * The number of structural features of the '<em>Entity Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CONCEPT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Entity Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CONCEPT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link er.impl.KeyImpl <em>Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see er.impl.KeyImpl
	 * @see er.impl.ErPackageImpl#getKey()
	 * @generated
	 */
	int KEY = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__NAME = MODELLING_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Key Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__KEY_ATTRIBUTES = MODELLING_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_FEATURE_COUNT = MODELLING_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_OPERATION_COUNT = MODELLING_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link er.impl.GerundImpl <em>Gerund</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see er.impl.GerundImpl
	 * @see er.impl.ErPackageImpl#getGerund()
	 * @generated
	 */
	int GERUND = 14;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GERUND__RELATIONSHIP = ENTITY_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gerund</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GERUND_FEATURE_COUNT = ENTITY_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gerund</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GERUND_OPERATION_COUNT = ENTITY_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link er.impl.AttributeDomainImpl <em>Attribute Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see er.impl.AttributeDomainImpl
	 * @see er.impl.ErPackageImpl#getAttributeDomain()
	 * @generated
	 */
	int ATTRIBUTE_DOMAIN = 15;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DOMAIN__DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DOMAIN__DEFAULT = 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DOMAIN__LENGTH = 2;

	/**
	 * The number of structural features of the '<em>Attribute Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DOMAIN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Attribute Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link er.MinCardinality <em>Min Cardinality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see er.MinCardinality
	 * @see er.impl.ErPackageImpl#getMinCardinality()
	 * @generated
	 */
	int MIN_CARDINALITY = 16;

	/**
	 * The meta object id for the '{@link er.MaxCardinality <em>Max Cardinality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see er.MaxCardinality
	 * @see er.impl.ErPackageImpl#getMaxCardinality()
	 * @generated
	 */
	int MAX_CARDINALITY = 17;

	/**
	 * The meta object id for the '{@link er.PrimitiveDomain <em>Primitive Domain</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see er.PrimitiveDomain
	 * @see er.impl.ErPackageImpl#getPrimitiveDomain()
	 * @generated
	 */
	int PRIMITIVE_DOMAIN = 18;


	/**
	 * Returns the meta object for class '{@link er.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see er.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link er.Entity#getEntityAttributes <em>Entity Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity Attributes</em>'.
	 * @see er.Entity#getEntityAttributes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_EntityAttributes();

	/**
	 * Returns the meta object for the containment reference list '{@link er.Entity#getKeySet <em>Key Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Key Set</em>'.
	 * @see er.Entity#getKeySet()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_KeySet();

	/**
	 * Returns the meta object for the reference '{@link er.Entity#getPrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary Key</em>'.
	 * @see er.Entity#getPrimaryKey()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_PrimaryKey();

	/**
	 * Returns the meta object for class '{@link er.ModellingConcept <em>Modelling Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelling Concept</em>'.
	 * @see er.ModellingConcept
	 * @generated
	 */
	EClass getModellingConcept();

	/**
	 * Returns the meta object for the attribute '{@link er.ModellingConcept#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see er.ModellingConcept#getName()
	 * @see #getModellingConcept()
	 * @generated
	 */
	EAttribute getModellingConcept_Name();

	/**
	 * Returns the meta object for class '{@link er.RelationshipConcept <em>Relationship Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Concept</em>'.
	 * @see er.RelationshipConcept
	 * @generated
	 */
	EClass getRelationshipConcept();

	/**
	 * Returns the meta object for class '{@link er.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see er.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link er.Attribute#getAttributeDomain <em>Attribute Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attribute Domain</em>'.
	 * @see er.Attribute#getAttributeDomain()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_AttributeDomain();

	/**
	 * Returns the meta object for class '{@link er.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see er.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the attribute '{@link er.Domain#getPrimitiveDomain <em>Primitive Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primitive Domain</em>'.
	 * @see er.Domain#getPrimitiveDomain()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_PrimitiveDomain();

	/**
	 * Returns the meta object for class '{@link er.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see er.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the containment reference list '{@link er.Relationship#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see er.Relationship#getEntities()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Entities();

	/**
	 * Returns the meta object for the containment reference list '{@link er.Relationship#getRelationshipAttributes <em>Relationship Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationship Attributes</em>'.
	 * @see er.Relationship#getRelationshipAttributes()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_RelationshipAttributes();

	/**
	 * Returns the meta object for class '{@link er.ISA <em>ISA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISA</em>'.
	 * @see er.ISA
	 * @generated
	 */
	EClass getISA();

	/**
	 * Returns the meta object for the containment reference '{@link er.ISA#getSupertype <em>Supertype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supertype</em>'.
	 * @see er.ISA#getSupertype()
	 * @see #getISA()
	 * @generated
	 */
	EReference getISA_Supertype();

	/**
	 * Returns the meta object for the reference list '{@link er.ISA#getSubtypes <em>Subtypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subtypes</em>'.
	 * @see er.ISA#getSubtypes()
	 * @see #getISA()
	 * @generated
	 */
	EReference getISA_Subtypes();

	/**
	 * Returns the meta object for the reference '{@link er.ISA#getClassificationAttribute <em>Classification Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classification Attribute</em>'.
	 * @see er.ISA#getClassificationAttribute()
	 * @see #getISA()
	 * @generated
	 */
	EReference getISA_ClassificationAttribute();

	/**
	 * Returns the meta object for class '{@link er.Categorisation <em>Categorisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Categorisation</em>'.
	 * @see er.Categorisation
	 * @generated
	 */
	EClass getCategorisation();

	/**
	 * Returns the meta object for the containment reference '{@link er.Categorisation#getCategorisationEntities <em>Categorisation Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Categorisation Entities</em>'.
	 * @see er.Categorisation#getCategorisationEntities()
	 * @see #getCategorisation()
	 * @generated
	 */
	EReference getCategorisation_CategorisationEntities();

	/**
	 * Returns the meta object for the attribute '{@link er.Categorisation#isIsPartial <em>Is Partial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Partial</em>'.
	 * @see er.Categorisation#isIsPartial()
	 * @see #getCategorisation()
	 * @generated
	 */
	EAttribute getCategorisation_IsPartial();

	/**
	 * Returns the meta object for the reference '{@link er.Categorisation#getCategorisedEntity <em>Categorised Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Categorised Entity</em>'.
	 * @see er.Categorisation#getCategorisedEntity()
	 * @see #getCategorisation()
	 * @generated
	 */
	EReference getCategorisation_CategorisedEntity();

	/**
	 * Returns the meta object for class '{@link er.IdentificationDependency <em>Identification Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identification Dependency</em>'.
	 * @see er.IdentificationDependency
	 * @generated
	 */
	EClass getIdentificationDependency();

	/**
	 * Returns the meta object for the reference '{@link er.IdentificationDependency#getWeakEntity <em>Weak Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Weak Entity</em>'.
	 * @see er.IdentificationDependency#getWeakEntity()
	 * @see #getIdentificationDependency()
	 * @generated
	 */
	EReference getIdentificationDependency_WeakEntity();

	/**
	 * Returns the meta object for the containment reference '{@link er.IdentificationDependency#getRegularEntity <em>Regular Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Regular Entity</em>'.
	 * @see er.IdentificationDependency#getRegularEntity()
	 * @see #getIdentificationDependency()
	 * @generated
	 */
	EReference getIdentificationDependency_RegularEntity();

	/**
	 * Returns the meta object for class '{@link er.RegularEntity <em>Regular Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regular Entity</em>'.
	 * @see er.RegularEntity
	 * @generated
	 */
	EClass getRegularEntity();

	/**
	 * Returns the meta object for the reference '{@link er.RegularEntity#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see er.RegularEntity#getEntity()
	 * @see #getRegularEntity()
	 * @generated
	 */
	EReference getRegularEntity_Entity();

	/**
	 * Returns the meta object for the attribute '{@link er.RegularEntity#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see er.RegularEntity#getRole()
	 * @see #getRegularEntity()
	 * @generated
	 */
	EAttribute getRegularEntity_Role();

	/**
	 * Returns the meta object for the attribute '{@link er.RegularEntity#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see er.RegularEntity#getMin()
	 * @see #getRegularEntity()
	 * @generated
	 */
	EAttribute getRegularEntity_Min();

	/**
	 * Returns the meta object for the attribute '{@link er.RegularEntity#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see er.RegularEntity#getMax()
	 * @see #getRegularEntity()
	 * @generated
	 */
	EAttribute getRegularEntity_Max();

	/**
	 * Returns the meta object for class '{@link er.Categories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Categories</em>'.
	 * @see er.Categories
	 * @generated
	 */
	EClass getCategories();

	/**
	 * Returns the meta object for the reference list '{@link er.Categories#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entities</em>'.
	 * @see er.Categories#getEntities()
	 * @see #getCategories()
	 * @generated
	 */
	EReference getCategories_Entities();

	/**
	 * Returns the meta object for the attribute '{@link er.Categories#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see er.Categories#getMin()
	 * @see #getCategories()
	 * @generated
	 */
	EAttribute getCategories_Min();

	/**
	 * Returns the meta object for the attribute '{@link er.Categories#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see er.Categories#getMax()
	 * @see #getCategories()
	 * @generated
	 */
	EAttribute getCategories_Max();

	/**
	 * Returns the meta object for class '{@link er.ERModel <em>ER Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ER Model</em>'.
	 * @see er.ERModel
	 * @generated
	 */
	EClass getERModel();

	/**
	 * Returns the meta object for the containment reference list '{@link er.ERModel#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see er.ERModel#getEntities()
	 * @see #getERModel()
	 * @generated
	 */
	EReference getERModel_Entities();

	/**
	 * Returns the meta object for the containment reference list '{@link er.ERModel#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationships</em>'.
	 * @see er.ERModel#getRelationships()
	 * @see #getERModel()
	 * @generated
	 */
	EReference getERModel_Relationships();

	/**
	 * Returns the meta object for the containment reference list '{@link er.ERModel#getGerunds <em>Gerunds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gerunds</em>'.
	 * @see er.ERModel#getGerunds()
	 * @see #getERModel()
	 * @generated
	 */
	EReference getERModel_Gerunds();

	/**
	 * Returns the meta object for the containment reference list '{@link er.ERModel#getDomains <em>Domains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domains</em>'.
	 * @see er.ERModel#getDomains()
	 * @see #getERModel()
	 * @generated
	 */
	EReference getERModel_Domains();

	/**
	 * Returns the meta object for class '{@link er.EntityConcept <em>Entity Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Concept</em>'.
	 * @see er.EntityConcept
	 * @generated
	 */
	EClass getEntityConcept();

	/**
	 * Returns the meta object for class '{@link er.Key <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key</em>'.
	 * @see er.Key
	 * @generated
	 */
	EClass getKey();

	/**
	 * Returns the meta object for the reference list '{@link er.Key#getKeyAttributes <em>Key Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Key Attributes</em>'.
	 * @see er.Key#getKeyAttributes()
	 * @see #getKey()
	 * @generated
	 */
	EReference getKey_KeyAttributes();

	/**
	 * Returns the meta object for class '{@link er.Gerund <em>Gerund</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gerund</em>'.
	 * @see er.Gerund
	 * @generated
	 */
	EClass getGerund();

	/**
	 * Returns the meta object for the containment reference '{@link er.Gerund#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relationship</em>'.
	 * @see er.Gerund#getRelationship()
	 * @see #getGerund()
	 * @generated
	 */
	EReference getGerund_Relationship();

	/**
	 * Returns the meta object for class '{@link er.AttributeDomain <em>Attribute Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Domain</em>'.
	 * @see er.AttributeDomain
	 * @generated
	 */
	EClass getAttributeDomain();

	/**
	 * Returns the meta object for the reference '{@link er.AttributeDomain#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see er.AttributeDomain#getDomain()
	 * @see #getAttributeDomain()
	 * @generated
	 */
	EReference getAttributeDomain_Domain();

	/**
	 * Returns the meta object for the attribute '{@link er.AttributeDomain#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see er.AttributeDomain#getDefault()
	 * @see #getAttributeDomain()
	 * @generated
	 */
	EAttribute getAttributeDomain_Default();

	/**
	 * Returns the meta object for the attribute '{@link er.AttributeDomain#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see er.AttributeDomain#getLength()
	 * @see #getAttributeDomain()
	 * @generated
	 */
	EAttribute getAttributeDomain_Length();

	/**
	 * Returns the meta object for enum '{@link er.MinCardinality <em>Min Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Min Cardinality</em>'.
	 * @see er.MinCardinality
	 * @generated
	 */
	EEnum getMinCardinality();

	/**
	 * Returns the meta object for enum '{@link er.MaxCardinality <em>Max Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Max Cardinality</em>'.
	 * @see er.MaxCardinality
	 * @generated
	 */
	EEnum getMaxCardinality();

	/**
	 * Returns the meta object for enum '{@link er.PrimitiveDomain <em>Primitive Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive Domain</em>'.
	 * @see er.PrimitiveDomain
	 * @generated
	 */
	EEnum getPrimitiveDomain();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ErFactory getErFactory();

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
		 * The meta object literal for the '{@link er.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see er.impl.EntityImpl
		 * @see er.impl.ErPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Entity Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ENTITY_ATTRIBUTES = eINSTANCE.getEntity_EntityAttributes();

		/**
		 * The meta object literal for the '<em><b>Key Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__KEY_SET = eINSTANCE.getEntity_KeySet();

		/**
		 * The meta object literal for the '<em><b>Primary Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__PRIMARY_KEY = eINSTANCE.getEntity_PrimaryKey();

		/**
		 * The meta object literal for the '{@link er.impl.ModellingConceptImpl <em>Modelling Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see er.impl.ModellingConceptImpl
		 * @see er.impl.ErPackageImpl#getModellingConcept()
		 * @generated
		 */
		EClass MODELLING_CONCEPT = eINSTANCE.getModellingConcept();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELLING_CONCEPT__NAME = eINSTANCE.getModellingConcept_Name();

		/**
		 * The meta object literal for the '{@link er.impl.RelationshipConceptImpl <em>Relationship Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see er.impl.RelationshipConceptImpl
		 * @see er.impl.ErPackageImpl#getRelationshipConcept()
		 * @generated
		 */
		EClass RELATIONSHIP_CONCEPT = eINSTANCE.getRelationshipConcept();

		/**
		 * The meta object literal for the '{@link er.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see er.impl.AttributeImpl
		 * @see er.impl.ErPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Attribute Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__ATTRIBUTE_DOMAIN = eINSTANCE.getAttribute_AttributeDomain();

		/**
		 * The meta object literal for the '{@link er.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see er.impl.DomainImpl
		 * @see er.impl.ErPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Primitive Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__PRIMITIVE_DOMAIN = eINSTANCE.getDomain_PrimitiveDomain();

		/**
		 * The meta object literal for the '{@link er.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see er.impl.RelationshipImpl
		 * @see er.impl.ErPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__ENTITIES = eINSTANCE.getRelationship_Entities();

		/**
		 * The meta object literal for the '<em><b>Relationship Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__RELATIONSHIP_ATTRIBUTES = eINSTANCE.getRelationship_RelationshipAttributes();

		/**
		 * The meta object literal for the '{@link er.impl.ISAImpl <em>ISA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see er.impl.ISAImpl
		 * @see er.impl.ErPackageImpl#getISA()
		 * @generated
		 */
		EClass ISA = eINSTANCE.getISA();

		/**
		 * The meta object literal for the '<em><b>Supertype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISA__SUPERTYPE = eINSTANCE.getISA_Supertype();

		/**
		 * The meta object literal for the '<em><b>Subtypes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISA__SUBTYPES = eINSTANCE.getISA_Subtypes();

		/**
		 * The meta object literal for the '<em><b>Classification Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISA__CLASSIFICATION_ATTRIBUTE = eINSTANCE.getISA_ClassificationAttribute();

		/**
		 * The meta object literal for the '{@link er.impl.CategorisationImpl <em>Categorisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see er.impl.CategorisationImpl
		 * @see er.impl.ErPackageImpl#getCategorisation()
		 * @generated
		 */
		EClass CATEGORISATION = eINSTANCE.getCategorisation();

		/**
		 * The meta object literal for the '<em><b>Categorisation Entities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORISATION__CATEGORISATION_ENTITIES = eINSTANCE.getCategorisation_CategorisationEntities();

		/**
		 * The meta object literal for the '<em><b>Is Partial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORISATION__IS_PARTIAL = eINSTANCE.getCategorisation_IsPartial();

		/**
		 * The meta object literal for the '<em><b>Categorised Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORISATION__CATEGORISED_ENTITY = eINSTANCE.getCategorisation_CategorisedEntity();

		/**
		 * The meta object literal for the '{@link er.impl.IdentificationDependencyImpl <em>Identification Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see er.impl.IdentificationDependencyImpl
		 * @see er.impl.ErPackageImpl#getIdentificationDependency()
		 * @generated
		 */
		EClass IDENTIFICATION_DEPENDENCY = eINSTANCE.getIdentificationDependency();

		/**
		 * The meta object literal for the '<em><b>Weak Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFICATION_DEPENDENCY__WEAK_ENTITY = eINSTANCE.getIdentificationDependency_WeakEntity();

		/**
		 * The meta object literal for the '<em><b>Regular Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFICATION_DEPENDENCY__REGULAR_ENTITY = eINSTANCE.getIdentificationDependency_RegularEntity();

		/**
		 * The meta object literal for the '{@link er.impl.RegularEntityImpl <em>Regular Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see er.impl.RegularEntityImpl
		 * @see er.impl.ErPackageImpl#getRegularEntity()
		 * @generated
		 */
		EClass REGULAR_ENTITY = eINSTANCE.getRegularEntity();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULAR_ENTITY__ENTITY = eINSTANCE.getRegularEntity_Entity();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULAR_ENTITY__ROLE = eINSTANCE.getRegularEntity_Role();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULAR_ENTITY__MIN = eINSTANCE.getRegularEntity_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULAR_ENTITY__MAX = eINSTANCE.getRegularEntity_Max();

		/**
		 * The meta object literal for the '{@link er.impl.CategoriesImpl <em>Categories</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see er.impl.CategoriesImpl
		 * @see er.impl.ErPackageImpl#getCategories()
		 * @generated
		 */
		EClass CATEGORIES = eINSTANCE.getCategories();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORIES__ENTITIES = eINSTANCE.getCategories_Entities();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORIES__MIN = eINSTANCE.getCategories_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORIES__MAX = eINSTANCE.getCategories_Max();

		/**
		 * The meta object literal for the '{@link er.impl.ERModelImpl <em>ER Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see er.impl.ERModelImpl
		 * @see er.impl.ErPackageImpl#getERModel()
		 * @generated
		 */
		EClass ER_MODEL = eINSTANCE.getERModel();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ER_MODEL__ENTITIES = eINSTANCE.getERModel_Entities();

		/**
		 * The meta object literal for the '<em><b>Relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ER_MODEL__RELATIONSHIPS = eINSTANCE.getERModel_Relationships();

		/**
		 * The meta object literal for the '<em><b>Gerunds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ER_MODEL__GERUNDS = eINSTANCE.getERModel_Gerunds();

		/**
		 * The meta object literal for the '<em><b>Domains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ER_MODEL__DOMAINS = eINSTANCE.getERModel_Domains();

		/**
		 * The meta object literal for the '{@link er.impl.EntityConceptImpl <em>Entity Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see er.impl.EntityConceptImpl
		 * @see er.impl.ErPackageImpl#getEntityConcept()
		 * @generated
		 */
		EClass ENTITY_CONCEPT = eINSTANCE.getEntityConcept();

		/**
		 * The meta object literal for the '{@link er.impl.KeyImpl <em>Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see er.impl.KeyImpl
		 * @see er.impl.ErPackageImpl#getKey()
		 * @generated
		 */
		EClass KEY = eINSTANCE.getKey();

		/**
		 * The meta object literal for the '<em><b>Key Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY__KEY_ATTRIBUTES = eINSTANCE.getKey_KeyAttributes();

		/**
		 * The meta object literal for the '{@link er.impl.GerundImpl <em>Gerund</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see er.impl.GerundImpl
		 * @see er.impl.ErPackageImpl#getGerund()
		 * @generated
		 */
		EClass GERUND = eINSTANCE.getGerund();

		/**
		 * The meta object literal for the '<em><b>Relationship</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GERUND__RELATIONSHIP = eINSTANCE.getGerund_Relationship();

		/**
		 * The meta object literal for the '{@link er.impl.AttributeDomainImpl <em>Attribute Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see er.impl.AttributeDomainImpl
		 * @see er.impl.ErPackageImpl#getAttributeDomain()
		 * @generated
		 */
		EClass ATTRIBUTE_DOMAIN = eINSTANCE.getAttributeDomain();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_DOMAIN__DOMAIN = eINSTANCE.getAttributeDomain_Domain();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DOMAIN__DEFAULT = eINSTANCE.getAttributeDomain_Default();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DOMAIN__LENGTH = eINSTANCE.getAttributeDomain_Length();

		/**
		 * The meta object literal for the '{@link er.MinCardinality <em>Min Cardinality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see er.MinCardinality
		 * @see er.impl.ErPackageImpl#getMinCardinality()
		 * @generated
		 */
		EEnum MIN_CARDINALITY = eINSTANCE.getMinCardinality();

		/**
		 * The meta object literal for the '{@link er.MaxCardinality <em>Max Cardinality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see er.MaxCardinality
		 * @see er.impl.ErPackageImpl#getMaxCardinality()
		 * @generated
		 */
		EEnum MAX_CARDINALITY = eINSTANCE.getMaxCardinality();

		/**
		 * The meta object literal for the '{@link er.PrimitiveDomain <em>Primitive Domain</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see er.PrimitiveDomain
		 * @see er.impl.ErPackageImpl#getPrimitiveDomain()
		 * @generated
		 */
		EEnum PRIMITIVE_DOMAIN = eINSTANCE.getPrimitiveDomain();

	}

} //ErPackage
