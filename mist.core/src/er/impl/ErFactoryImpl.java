/**
 */
package er.impl;

import er.*;

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
public class ErFactoryImpl extends EFactoryImpl implements ErFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ErFactory init() {
		try {
			ErFactory theErFactory = (ErFactory)EPackage.Registry.INSTANCE.getEFactory(ErPackage.eNS_URI);
			if (theErFactory != null) {
				return theErFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ErFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErFactoryImpl() {
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
			case ErPackage.ENTITY: return createEntity();
			case ErPackage.ATTRIBUTE: return createAttribute();
			case ErPackage.DOMAIN: return createDomain();
			case ErPackage.RELATIONSHIP: return createRelationship();
			case ErPackage.ISA: return createISA();
			case ErPackage.CATEGORISATION: return createCategorisation();
			case ErPackage.IDENTIFICATION_DEPENDENCY: return createIdentificationDependency();
			case ErPackage.REGULAR_ENTITY: return createRegularEntity();
			case ErPackage.CATEGORIES: return createCategories();
			case ErPackage.ER_MODEL: return createERModel();
			case ErPackage.KEY: return createKey();
			case ErPackage.GERUND: return createGerund();
			case ErPackage.ATTRIBUTE_DOMAIN: return createAttributeDomain();
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
			case ErPackage.MIN_CARDINALITY:
				return createMinCardinalityFromString(eDataType, initialValue);
			case ErPackage.MAX_CARDINALITY:
				return createMaxCardinalityFromString(eDataType, initialValue);
			case ErPackage.PRIMITIVE_DOMAIN:
				return createPrimitiveDomainFromString(eDataType, initialValue);
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
			case ErPackage.MIN_CARDINALITY:
				return convertMinCardinalityToString(eDataType, instanceValue);
			case ErPackage.MAX_CARDINALITY:
				return convertMaxCardinalityToString(eDataType, instanceValue);
			case ErPackage.PRIMITIVE_DOMAIN:
				return convertPrimitiveDomainToString(eDataType, instanceValue);
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
	public Domain createDomain() {
		DomainImpl domain = new DomainImpl();
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship createRelationship() {
		RelationshipImpl relationship = new RelationshipImpl();
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISA createISA() {
		ISAImpl isa = new ISAImpl();
		return isa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Categorisation createCategorisation() {
		CategorisationImpl categorisation = new CategorisationImpl();
		return categorisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentificationDependency createIdentificationDependency() {
		IdentificationDependencyImpl identificationDependency = new IdentificationDependencyImpl();
		return identificationDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularEntity createRegularEntity() {
		RegularEntityImpl regularEntity = new RegularEntityImpl();
		return regularEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Categories createCategories() {
		CategoriesImpl categories = new CategoriesImpl();
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERModel createERModel() {
		ERModelImpl erModel = new ERModelImpl();
		return erModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Key createKey() {
		KeyImpl key = new KeyImpl();
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gerund createGerund() {
		GerundImpl gerund = new GerundImpl();
		return gerund;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDomain createAttributeDomain() {
		AttributeDomainImpl attributeDomain = new AttributeDomainImpl();
		return attributeDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinCardinality createMinCardinalityFromString(EDataType eDataType, String initialValue) {
		MinCardinality result = MinCardinality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMinCardinalityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxCardinality createMaxCardinalityFromString(EDataType eDataType, String initialValue) {
		MaxCardinality result = MaxCardinality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaxCardinalityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveDomain createPrimitiveDomainFromString(EDataType eDataType, String initialValue) {
		PrimitiveDomain result = PrimitiveDomain.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrimitiveDomainToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErPackage getErPackage() {
		return (ErPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ErPackage getPackage() {
		return ErPackage.eINSTANCE;
	}

} //ErFactoryImpl
