/**
 */
package er.util;

import er.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see er.ErPackage
 * @generated
 */
public class ErAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ErPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ErPackage.eINSTANCE;
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
	protected ErSwitch<Adapter> modelSwitch =
		new ErSwitch<Adapter>() {
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseModellingConcept(ModellingConcept object) {
				return createModellingConceptAdapter();
			}
			@Override
			public Adapter caseRelationshipConcept(RelationshipConcept object) {
				return createRelationshipConceptAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseDomain(Domain object) {
				return createDomainAdapter();
			}
			@Override
			public Adapter caseRelationship(Relationship object) {
				return createRelationshipAdapter();
			}
			@Override
			public Adapter caseISA(ISA object) {
				return createISAAdapter();
			}
			@Override
			public Adapter caseCategorisation(Categorisation object) {
				return createCategorisationAdapter();
			}
			@Override
			public Adapter caseIdentificationDependency(IdentificationDependency object) {
				return createIdentificationDependencyAdapter();
			}
			@Override
			public Adapter caseRegularEntity(RegularEntity object) {
				return createRegularEntityAdapter();
			}
			@Override
			public Adapter caseCategories(Categories object) {
				return createCategoriesAdapter();
			}
			@Override
			public Adapter caseERModel(ERModel object) {
				return createERModelAdapter();
			}
			@Override
			public Adapter caseEntityConcept(EntityConcept object) {
				return createEntityConceptAdapter();
			}
			@Override
			public Adapter caseKey(Key object) {
				return createKeyAdapter();
			}
			@Override
			public Adapter caseGerund(Gerund object) {
				return createGerundAdapter();
			}
			@Override
			public Adapter caseAttributeDomain(AttributeDomain object) {
				return createAttributeDomainAdapter();
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
	 * Creates a new adapter for an object of class '{@link er.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see er.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link er.ModellingConcept <em>Modelling Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see er.ModellingConcept
	 * @generated
	 */
	public Adapter createModellingConceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link er.RelationshipConcept <em>Relationship Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see er.RelationshipConcept
	 * @generated
	 */
	public Adapter createRelationshipConceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link er.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see er.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link er.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see er.Domain
	 * @generated
	 */
	public Adapter createDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link er.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see er.Relationship
	 * @generated
	 */
	public Adapter createRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link er.ISA <em>ISA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see er.ISA
	 * @generated
	 */
	public Adapter createISAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link er.Categorisation <em>Categorisation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see er.Categorisation
	 * @generated
	 */
	public Adapter createCategorisationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link er.IdentificationDependency <em>Identification Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see er.IdentificationDependency
	 * @generated
	 */
	public Adapter createIdentificationDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link er.RegularEntity <em>Regular Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see er.RegularEntity
	 * @generated
	 */
	public Adapter createRegularEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link er.Categories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see er.Categories
	 * @generated
	 */
	public Adapter createCategoriesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link er.ERModel <em>ER Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see er.ERModel
	 * @generated
	 */
	public Adapter createERModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link er.EntityConcept <em>Entity Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see er.EntityConcept
	 * @generated
	 */
	public Adapter createEntityConceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link er.Key <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see er.Key
	 * @generated
	 */
	public Adapter createKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link er.Gerund <em>Gerund</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see er.Gerund
	 * @generated
	 */
	public Adapter createGerundAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link er.AttributeDomain <em>Attribute Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see er.AttributeDomain
	 * @generated
	 */
	public Adapter createAttributeDomainAdapter() {
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

} //ErAdapterFactory
