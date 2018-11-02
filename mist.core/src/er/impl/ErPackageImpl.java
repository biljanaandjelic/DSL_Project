/**
 */
package er.impl;

import er.Attribute;
import er.AttributeDomain;
import er.Categories;
import er.Categorisation;
import er.Domain;
import er.ERModel;
import er.Entity;
import er.EntityConcept;
import er.ErFactory;
import er.ErPackage;
import er.Gerund;
import er.IdentificationDependency;
import er.Key;
import er.MaxCardinality;
import er.MinCardinality;
import er.ModellingConcept;
import er.PrimitiveDomain;
import er.RegularEntity;
import er.Relationship;
import er.RelationshipConcept;

import er.util.ErValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ErPackageImpl extends EPackageImpl implements ErPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modellingConceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipConceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categorisationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identificationDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regularEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoriesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityConceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gerundEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum minCardinalityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum maxCardinalityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum primitiveDomainEEnum = null;

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
	 * @see er.ErPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ErPackageImpl() {
		super(eNS_URI, ErFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ErPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ErPackage init() {
		if (isInited) return (ErPackage)EPackage.Registry.INSTANCE.getEPackage(ErPackage.eNS_URI);

		// Obtain or create and register package
		ErPackageImpl theErPackage = (ErPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ErPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ErPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theErPackage.createPackageContents();

		// Initialize created meta-data
		theErPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theErPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ErValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theErPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ErPackage.eNS_URI, theErPackage);
		return theErPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_EntityAttributes() {
		return (EReference)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_KeySet() {
		return (EReference)entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_PrimaryKey() {
		return (EReference)entityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModellingConcept() {
		return modellingConceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModellingConcept_Name() {
		return (EAttribute)modellingConceptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipConcept() {
		return relationshipConceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_AttributeDomain() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomain() {
		return domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_PrimitiveDomain() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationship() {
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_Entities() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_RelationshipAttributes() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISA() {
		return isaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISA_Supertype() {
		return (EReference)isaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISA_Subtypes() {
		return (EReference)isaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISA_ClassificationAttribute() {
		return (EReference)isaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategorisation() {
		return categorisationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategorisation_CategorisationEntities() {
		return (EReference)categorisationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategorisation_IsPartial() {
		return (EAttribute)categorisationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategorisation_CategorisedEntity() {
		return (EReference)categorisationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentificationDependency() {
		return identificationDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentificationDependency_WeakEntity() {
		return (EReference)identificationDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentificationDependency_RegularEntity() {
		return (EReference)identificationDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegularEntity() {
		return regularEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegularEntity_Entity() {
		return (EReference)regularEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularEntity_Role() {
		return (EAttribute)regularEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularEntity_Min() {
		return (EAttribute)regularEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularEntity_Max() {
		return (EAttribute)regularEntityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategories() {
		return categoriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategories_Entities() {
		return (EReference)categoriesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategories_Min() {
		return (EAttribute)categoriesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategories_Max() {
		return (EAttribute)categoriesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getERModel() {
		return erModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getERModel_Entities() {
		return (EReference)erModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getERModel_Relationships() {
		return (EReference)erModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getERModel_Gerunds() {
		return (EReference)erModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getERModel_Domains() {
		return (EReference)erModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityConcept() {
		return entityConceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKey() {
		return keyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKey_KeyAttributes() {
		return (EReference)keyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGerund() {
		return gerundEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGerund_Relationship() {
		return (EReference)gerundEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeDomain() {
		return attributeDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeDomain_Domain() {
		return (EReference)attributeDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeDomain_Default() {
		return (EAttribute)attributeDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeDomain_Length() {
		return (EAttribute)attributeDomainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMinCardinality() {
		return minCardinalityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMaxCardinality() {
		return maxCardinalityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrimitiveDomain() {
		return primitiveDomainEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErFactory getErFactory() {
		return (ErFactory)getEFactoryInstance();
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
		entityEClass = createEClass(ENTITY);
		createEReference(entityEClass, ENTITY__ENTITY_ATTRIBUTES);
		createEReference(entityEClass, ENTITY__KEY_SET);
		createEReference(entityEClass, ENTITY__PRIMARY_KEY);

		modellingConceptEClass = createEClass(MODELLING_CONCEPT);
		createEAttribute(modellingConceptEClass, MODELLING_CONCEPT__NAME);

		relationshipConceptEClass = createEClass(RELATIONSHIP_CONCEPT);

		attributeEClass = createEClass(ATTRIBUTE);
		createEReference(attributeEClass, ATTRIBUTE__ATTRIBUTE_DOMAIN);

		domainEClass = createEClass(DOMAIN);
		createEAttribute(domainEClass, DOMAIN__PRIMITIVE_DOMAIN);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEReference(relationshipEClass, RELATIONSHIP__ENTITIES);
		createEReference(relationshipEClass, RELATIONSHIP__RELATIONSHIP_ATTRIBUTES);

		isaEClass = createEClass(ISA);
		createEReference(isaEClass, ISA__SUPERTYPE);
		createEReference(isaEClass, ISA__SUBTYPES);
		createEReference(isaEClass, ISA__CLASSIFICATION_ATTRIBUTE);

		categorisationEClass = createEClass(CATEGORISATION);
		createEReference(categorisationEClass, CATEGORISATION__CATEGORISATION_ENTITIES);
		createEAttribute(categorisationEClass, CATEGORISATION__IS_PARTIAL);
		createEReference(categorisationEClass, CATEGORISATION__CATEGORISED_ENTITY);

		identificationDependencyEClass = createEClass(IDENTIFICATION_DEPENDENCY);
		createEReference(identificationDependencyEClass, IDENTIFICATION_DEPENDENCY__WEAK_ENTITY);
		createEReference(identificationDependencyEClass, IDENTIFICATION_DEPENDENCY__REGULAR_ENTITY);

		regularEntityEClass = createEClass(REGULAR_ENTITY);
		createEReference(regularEntityEClass, REGULAR_ENTITY__ENTITY);
		createEAttribute(regularEntityEClass, REGULAR_ENTITY__ROLE);
		createEAttribute(regularEntityEClass, REGULAR_ENTITY__MIN);
		createEAttribute(regularEntityEClass, REGULAR_ENTITY__MAX);

		categoriesEClass = createEClass(CATEGORIES);
		createEReference(categoriesEClass, CATEGORIES__ENTITIES);
		createEAttribute(categoriesEClass, CATEGORIES__MIN);
		createEAttribute(categoriesEClass, CATEGORIES__MAX);

		erModelEClass = createEClass(ER_MODEL);
		createEReference(erModelEClass, ER_MODEL__ENTITIES);
		createEReference(erModelEClass, ER_MODEL__RELATIONSHIPS);
		createEReference(erModelEClass, ER_MODEL__GERUNDS);
		createEReference(erModelEClass, ER_MODEL__DOMAINS);

		entityConceptEClass = createEClass(ENTITY_CONCEPT);

		keyEClass = createEClass(KEY);
		createEReference(keyEClass, KEY__KEY_ATTRIBUTES);

		gerundEClass = createEClass(GERUND);
		createEReference(gerundEClass, GERUND__RELATIONSHIP);

		attributeDomainEClass = createEClass(ATTRIBUTE_DOMAIN);
		createEReference(attributeDomainEClass, ATTRIBUTE_DOMAIN__DOMAIN);
		createEAttribute(attributeDomainEClass, ATTRIBUTE_DOMAIN__DEFAULT);
		createEAttribute(attributeDomainEClass, ATTRIBUTE_DOMAIN__LENGTH);

		// Create enums
		minCardinalityEEnum = createEEnum(MIN_CARDINALITY);
		maxCardinalityEEnum = createEEnum(MAX_CARDINALITY);
		primitiveDomainEEnum = createEEnum(PRIMITIVE_DOMAIN);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		entityEClass.getESuperTypes().add(this.getModellingConcept());
		entityEClass.getESuperTypes().add(this.getEntityConcept());
		relationshipConceptEClass.getESuperTypes().add(this.getModellingConcept());
		attributeEClass.getESuperTypes().add(this.getModellingConcept());
		domainEClass.getESuperTypes().add(this.getModellingConcept());
		relationshipEClass.getESuperTypes().add(this.getRelationshipConcept());
		isaEClass.getESuperTypes().add(this.getRelationshipConcept());
		categorisationEClass.getESuperTypes().add(this.getRelationshipConcept());
		identificationDependencyEClass.getESuperTypes().add(this.getRelationshipConcept());
		erModelEClass.getESuperTypes().add(this.getModellingConcept());
		keyEClass.getESuperTypes().add(this.getModellingConcept());
		gerundEClass.getESuperTypes().add(this.getEntityConcept());

		// Initialize classes, features, and operations; add parameters
		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntity_EntityAttributes(), this.getAttribute(), null, "entityAttributes", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_KeySet(), this.getKey(), null, "keySet", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_PrimaryKey(), this.getKey(), null, "primaryKey", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modellingConceptEClass, ModellingConcept.class, "ModellingConcept", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModellingConcept_Name(), ecorePackage.getEString(), "name", null, 1, 1, ModellingConcept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipConceptEClass, RelationshipConcept.class, "RelationshipConcept", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttribute_AttributeDomain(), this.getAttributeDomain(), null, "attributeDomain", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomain_PrimitiveDomain(), this.getPrimitiveDomain(), "primitiveDomain", null, 1, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipEClass, Relationship.class, "Relationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationship_Entities(), this.getRegularEntity(), null, "entities", null, 2, -1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_RelationshipAttributes(), this.getAttribute(), null, "relationshipAttributes", null, 0, -1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isaEClass, er.ISA.class, "ISA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISA_Supertype(), this.getRegularEntity(), null, "supertype", null, 1, 1, er.ISA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISA_Subtypes(), this.getEntity(), null, "subtypes", null, 2, -1, er.ISA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISA_ClassificationAttribute(), this.getAttribute(), null, "classificationAttribute", null, 1, 1, er.ISA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categorisationEClass, Categorisation.class, "Categorisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCategorisation_CategorisationEntities(), this.getCategories(), null, "categorisationEntities", null, 1, 1, Categorisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCategorisation_IsPartial(), ecorePackage.getEBoolean(), "isPartial", "false", 1, 1, Categorisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCategorisation_CategorisedEntity(), this.getEntityConcept(), null, "categorisedEntity", null, 1, 1, Categorisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identificationDependencyEClass, IdentificationDependency.class, "IdentificationDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIdentificationDependency_WeakEntity(), this.getEntity(), null, "weakEntity", null, 1, 1, IdentificationDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdentificationDependency_RegularEntity(), this.getRegularEntity(), null, "regularEntity", null, 1, 1, IdentificationDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regularEntityEClass, RegularEntity.class, "RegularEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegularEntity_Entity(), this.getEntityConcept(), null, "entity", null, 1, 1, RegularEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegularEntity_Role(), ecorePackage.getEString(), "role", null, 0, 1, RegularEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegularEntity_Min(), this.getMinCardinality(), "min", null, 1, 1, RegularEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegularEntity_Max(), this.getMaxCardinality(), "max", null, 1, 1, RegularEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categoriesEClass, Categories.class, "Categories", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCategories_Entities(), this.getEntityConcept(), null, "entities", null, 2, -1, Categories.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCategories_Min(), this.getMinCardinality(), "min", null, 1, 1, Categories.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCategories_Max(), this.getMaxCardinality(), "max", null, 1, 1, Categories.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(erModelEClass, ERModel.class, "ERModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getERModel_Entities(), this.getEntity(), null, "entities", null, 0, -1, ERModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERModel_Relationships(), this.getRelationshipConcept(), null, "relationships", null, 0, -1, ERModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERModel_Gerunds(), this.getGerund(), null, "gerunds", null, 0, -1, ERModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERModel_Domains(), this.getDomain(), null, "domains", null, 0, -1, ERModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityConceptEClass, EntityConcept.class, "EntityConcept", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(keyEClass, Key.class, "Key", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKey_KeyAttributes(), this.getAttribute(), null, "keyAttributes", null, 1, -1, Key.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gerundEClass, Gerund.class, "Gerund", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGerund_Relationship(), this.getRelationship(), null, "relationship", null, 1, 1, Gerund.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeDomainEClass, AttributeDomain.class, "AttributeDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeDomain_Domain(), this.getDomain(), null, "domain", null, 1, 1, AttributeDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeDomain_Default(), ecorePackage.getEString(), "default", null, 0, 1, AttributeDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeDomain_Length(), ecorePackage.getEInt(), "length", null, 0, 1, AttributeDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(minCardinalityEEnum, MinCardinality.class, "MinCardinality");
		addEEnumLiteral(minCardinalityEEnum, MinCardinality.ZERO);
		addEEnumLiteral(minCardinalityEEnum, MinCardinality.ONE);

		initEEnum(maxCardinalityEEnum, MaxCardinality.class, "MaxCardinality");
		addEEnumLiteral(maxCardinalityEEnum, MaxCardinality.ONE);
		addEEnumLiteral(maxCardinalityEEnum, MaxCardinality.MANY);

		initEEnum(primitiveDomainEEnum, PrimitiveDomain.class, "PrimitiveDomain");
		addEEnumLiteral(primitiveDomainEEnum, PrimitiveDomain.INTEGER);
		addEEnumLiteral(primitiveDomainEEnum, PrimitiveDomain.STRING);
		addEEnumLiteral(primitiveDomainEEnum, PrimitiveDomain.REAL);
		addEEnumLiteral(primitiveDomainEEnum, PrimitiveDomain.BOOLEAN);
		addEEnumLiteral(primitiveDomainEEnum, PrimitiveDomain.DATE);
		addEEnumLiteral(primitiveDomainEEnum, PrimitiveDomain.TIME);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// gmf.node
		createGmfAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// gmf.link
		createGmf_1Annotations();
		// gmf.compartment
		createGmf_2Annotations();
		// gmf.affixed
		createGmf_3Annotations();
		// gmf.diagram
		createGmf_4Annotations();
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
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore#/"
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
		  (entityEClass, 
		   source, 
		   new String[] {
			 "constraints", "existedKey invalidPrimaryKey invalidAttributInKey"
		   });	
		addAnnotation
		  (modellingConceptEClass, 
		   source, 
		   new String[] {
			 "constraints", "existedName"
		   });	
		addAnnotation
		  (isaEClass, 
		   source, 
		   new String[] {
			 "constraints", "invalidClassificationAtrtibute SubTypeExistsAsSuperType duplicateSybtype"
		   });	
		addAnnotation
		  (categorisationEClass, 
		   source, 
		   new String[] {
			 "constraints", "invalidCategory"
		   });	
		addAnnotation
		  (identificationDependencyEClass, 
		   source, 
		   new String[] {
			 "constraints", "invalidWeakEntity"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf.node";	
		addAnnotation
		  (entityEClass, 
		   source, 
		   new String[] {
			 "border.width", "1",
			 "figure", "polygon",
			 "polygon.x", "0 30 30 0",
			 "polygon.y", "0 0 30 30"
		   });	
		addAnnotation
		  (modellingConceptEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "label.icon", "false",
			 "border.color", "0,0,0"
		   });	
		addAnnotation
		  (relationshipConceptEClass, 
		   source, 
		   new String[] {
			 "figure", "polygon",
			 "polygon.x", "0 30 60 30",
			 "polygon.y", "30 0 30 60"
		   });	
		addAnnotation
		  (attributeEClass, 
		   source, 
		   new String[] {
			 "border.width", "1",
			 "phantom", "true",
			 "size", "50,5"
		   });	
		addAnnotation
		  (domainEClass, 
		   source, 
		   new String[] {
			 "border.width", "1"
		   });	
		addAnnotation
		  (relationshipEClass, 
		   source, 
		   new String[] {
			 "border.width", "1"
		   });	
		addAnnotation
		  (isaEClass, 
		   source, 
		   new String[] {
			 "label.text", "IS-A",
			 "label.style", "bold",
			 "border.width", "2",
			 "figure", "polygon",
			 "polygon.x", "0 15 30",
			 "polygon.y", "15 0 15"
		   });	
		addAnnotation
		  (categorisationEClass, 
		   source, 
		   new String[] {
			 "label.text", "EX-OR",
			 "border.width", "2",
			 "figure", "polygon",
			 "polygon.x", "0 15 30",
			 "polygon.y", "0 15 0"
		   });	
		addAnnotation
		  (identificationDependencyEClass, 
		   source, 
		   new String[] {
			 "border.width", "2",
			 "border.color", "0,0,0"
		   });	
		addAnnotation
		  (regularEntityEClass, 
		   source, 
		   new String[] {
			 "label.placement", "external",
			 "label", "min,max",
			 "label.pattern", "({0},{1})",
			 "label.icon", "false",
			 "border.color", "0,0,0",
			 "color", "255,255,255",
			 "border.width", "1",
			 "figure", "ellipse",
			 "size", "7,7"
		   });	
		addAnnotation
		  (categoriesEClass, 
		   source, 
		   new String[] {
			 "label.placement", "external",
			 "label", "min,max",
			 "label.pattern", "({0},{1})",
			 "label.icon", "false",
			 "border.color", "0,0,0",
			 "color", "255,255,255",
			 "border.width", "1",
			 "figure", "ellipse",
			 "size", "7,7"
		   });	
		addAnnotation
		  (keyEClass, 
		   source, 
		   new String[] {
			 "border.width", "1",
			 "size", "50,25"
		   });	
		addAnnotation
		  (gerundEClass, 
		   source, 
		   new String[] {
			 "label.placement", "none",
			 "label.icon", "false",
			 "border.width", "1",
			 "border.color", "0,0,0",
			 "figure", "polygon",
			 "polygon.x", "0 0 60 60",
			 "polygon.y", "60 0 0 60"
		   });	
		addAnnotation
		  (attributeDomainEClass, 
		   source, 
		   new String[] {
			 "label.placement", "none",
			 "label.icon", "false",
			 "color", "255,178,102",
			 "border.width", "0"
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
		  (entityEClass, 
		   source, 
		   new String[] {
			 "existedKey", "\n\t\t\tkeySet->forAll(k1:Key, k2:Key | k1.keyAttributes->intersection(k2.keyAttributes)->includesAll(k1.keyAttributes) and k1.keyAttributes->symmetricDifference(k2.keyAttributes)->isEmpty() implies k1=k2)",
			 "existedKey$message", "\'The key with attribute set already exists\'",
			 "invalidPrimaryKey", "\n\t\t\tif(keySet->notEmpty()) then\n\t\t\t\tif(not primaryKey->oclIsUndefined()) then\n\t\t\t\t\tkeySet->includes(primaryKey)\n\t\t\t\telse\n\t\t\t\t\tnot primaryKey->oclIsUndefined()\n\t\t\t\tendif\n\t\t\telse\n\t\t\t\tkeySet->isEmpty()\n\t\t\tendif",
			 "invalidAttributInKey", "\n\t\t\t\tif(not keySet.keyAttributes->isEmpty()) then\n\t\t\t\t\tif(entityAttributes->notEmpty()) then\n\t\t\t\t\t\tentityAttributes->includesAll(keySet.keyAttributes)\n\t\t\t\t\telse\n\t\t\t\t\t\tentityAttributes->notEmpty()\n\t\t\t\t\tendif\n\t\t\t\telse\n\t\t\t\t\tkeySet.keyAttributes->isEmpty()\n\t\t\t\tendif"
		   });	
		addAnnotation
		  (modellingConceptEClass, 
		   source, 
		   new String[] {
			 "existedName", "\n\t\t\tModellingConcept.allInstances()->symmetricDifference(Gerund.allInstances())->forAll(m1:ModellingConcept, m2:ModellingConcept | m1.name = m2.name implies m1=m2)"
		   });	
		addAnnotation
		  (isaEClass, 
		   source, 
		   new String[] {
			 "invalidClassificationAtrtibute", "\n\t\tif supertype.entity.oclIsTypeOf(Entity) then\n\t\t\tsupertype.entity.oclAsType(Entity).entityAttributes->includes(classificationAttribute) \n\t\telse \n\t\t\tsupertype.entity.oclAsType(Gerund).relationship.relationshipAttributes->includes(classificationAttribute) \t\n\t\tendif",
			 "SubTypeExistsAsSuperType", "\n\t\tif(supertype.entity.oclIsTypeOf(Entity)) then \n\t\t\tsubtypes->excludes(supertype.entity.oclAsType(Entity))\n\t\telse\n\t\t\tnot supertype.entity.oclIsTypeOf(Entity)\n\t\tendif",
			 "duplicateSybtype", "\n\t\t\tISA.allInstances().subtypes->forAll(e1:Entity | ISA.allInstances().subtypes->select(e2 | e1.name=e2.name)->size()<2)"
		   });	
		addAnnotation
		  (categorisationEClass, 
		   source, 
		   new String[] {
			 "invalidCategory", "\n\t\t\tcategorisationEntities.entities->excludes(categorisedEntity) and categorisationEntities.entities->\n\t\t\tforAll(e1:EntityConcept, e2:EntityConcept | \n\t\t\t\t\t\tif(e1.oclIsTypeOf(Entity) and  e2.oclIsTypeOf(Entity)) then\n\t\t\t\t\t\t\te1.oclAsType(Entity).name = e2.oclAsType(Entity).name implies e1 = e2\n\t\t\t\t\t\telse if(e1.oclIsTypeOf(Gerund) and  e2.oclIsTypeOf(Gerund)) then\n\t\t\t\t\t\t\t\te1.oclAsType(Gerund).relationship.name = e2.oclAsType(Gerund).relationship.name implies e1 = e2\n\t\t\t\t\t\t\t else\n\t\t\t\t\t\t\t \ttrue\n\t\t\t\t\t\t\t endif\n\t\t\t\t\t\tendif\n\t\t\t\t\t)"
		   });	
		addAnnotation
		  (identificationDependencyEClass, 
		   source, 
		   new String[] {
			 "invalidWeakEntity", "\n\t\tif(regularEntity.entity.oclIsTypeOf(Entity)) then\n\t\t\tregularEntity.entity.oclAsType(Entity) <> weakEntity\n\t\telse\n\t\t\tnot regularEntity.entity.oclIsTypeOf(Entity)\n\t\tendif"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.link";	
		addAnnotation
		  (getEntity_EntityAttributes(), 
		   source, 
		   new String[] {
			 "style", "solid",
			 "color", "0,0,0",
			 "width", "0"
		   });	
		addAnnotation
		  (getEntity_PrimaryKey(), 
		   source, 
		   new String[] {
			 "label.text", "primaryKey",
			 "target.decoration", "arrow",
			 "style", "dash",
			 "color", "0,0,0"
		   });	
		addAnnotation
		  (getRelationship_RelationshipAttributes(), 
		   source, 
		   new String[] {
			 "style", "solid",
			 "color", "0,0,0"
		   });	
		addAnnotation
		  (getISA_Subtypes(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "style", "solid",
			 "color", "0,0,0",
			 "border.width", "5"
		   });	
		addAnnotation
		  (getISA_ClassificationAttribute(), 
		   source, 
		   new String[] {
			 "label.text", "classificationAttribute",
			 "target.decoration", "arrow",
			 "style", "dash",
			 "color", "0,0,0"
		   });	
		addAnnotation
		  (getCategorisation_CategorisedEntity(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "style", "solid",
			 "color", "0,0,0"
		   });	
		addAnnotation
		  (getIdentificationDependency_WeakEntity(), 
		   source, 
		   new String[] {
			 "label.text", "weakEntity",
			 "target.decoration", "arrow",
			 "style", "solid",
			 "width", "2",
			 "color", "0,0,0"
		   });	
		addAnnotation
		  (getRegularEntity_Entity(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "style", "solid",
			 "color", "0,0,0"
		   });	
		addAnnotation
		  (getCategories_Entities(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "style", "solid",
			 "color", "0,0,0",
			 "border.width", "2"
		   });	
		addAnnotation
		  (getKey_KeyAttributes(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "style", "dash",
			 "color", "180,180,180"
		   });	
		addAnnotation
		  (getAttributeDomain_Domain(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "style", "solid",
			 "color", "0,0,0"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.compartment";	
		addAnnotation
		  (getEntity_KeySet(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getERModel_Entities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getERModel_Relationships(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getERModel_Gerunds(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getERModel_Domains(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getGerund_Relationship(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.affixed</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.affixed";	
		addAnnotation
		  (getRelationship_Entities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getISA_Supertype(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCategorisation_CategorisationEntities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getIdentificationDependency_RegularEntity(), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (erModelEClass, 
		   source, 
		   new String[] {
			 "model.extension", "erdsl",
			 "diagram.extension", "erdsldiag"
		   });
	}

} //ErPackageImpl
