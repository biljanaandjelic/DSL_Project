/**
 */
package er.util;

import er.*;

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
 * @see er.ErPackage
 * @generated
 */
public class ErSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ErPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErSwitch() {
		if (modelPackage == null) {
			modelPackage = ErPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
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
			case ErPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = caseModellingConcept(entity);
				if (result == null) result = caseEntityConcept(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErPackage.MODELLING_CONCEPT: {
				ModellingConcept modellingConcept = (ModellingConcept)theEObject;
				T result = caseModellingConcept(modellingConcept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErPackage.RELATIONSHIP_CONCEPT: {
				RelationshipConcept relationshipConcept = (RelationshipConcept)theEObject;
				T result = caseRelationshipConcept(relationshipConcept);
				if (result == null) result = caseModellingConcept(relationshipConcept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = caseModellingConcept(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErPackage.DOMAIN: {
				Domain domain = (Domain)theEObject;
				T result = caseDomain(domain);
				if (result == null) result = caseModellingConcept(domain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErPackage.RELATIONSHIP: {
				Relationship relationship = (Relationship)theEObject;
				T result = caseRelationship(relationship);
				if (result == null) result = caseRelationshipConcept(relationship);
				if (result == null) result = caseModellingConcept(relationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErPackage.ISA: {
				ISA isa = (ISA)theEObject;
				T result = caseISA(isa);
				if (result == null) result = caseRelationshipConcept(isa);
				if (result == null) result = caseModellingConcept(isa);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErPackage.CATEGORISATION: {
				Categorisation categorisation = (Categorisation)theEObject;
				T result = caseCategorisation(categorisation);
				if (result == null) result = caseRelationshipConcept(categorisation);
				if (result == null) result = caseModellingConcept(categorisation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErPackage.IDENTIFICATION_DEPENDENCY: {
				IdentificationDependency identificationDependency = (IdentificationDependency)theEObject;
				T result = caseIdentificationDependency(identificationDependency);
				if (result == null) result = caseRelationshipConcept(identificationDependency);
				if (result == null) result = caseModellingConcept(identificationDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErPackage.REGULAR_ENTITY: {
				RegularEntity regularEntity = (RegularEntity)theEObject;
				T result = caseRegularEntity(regularEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErPackage.CATEGORIES: {
				Categories categories = (Categories)theEObject;
				T result = caseCategories(categories);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErPackage.ER_MODEL: {
				ERModel erModel = (ERModel)theEObject;
				T result = caseERModel(erModel);
				if (result == null) result = caseModellingConcept(erModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErPackage.ENTITY_CONCEPT: {
				EntityConcept entityConcept = (EntityConcept)theEObject;
				T result = caseEntityConcept(entityConcept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErPackage.KEY: {
				Key key = (Key)theEObject;
				T result = caseKey(key);
				if (result == null) result = caseModellingConcept(key);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErPackage.GERUND: {
				Gerund gerund = (Gerund)theEObject;
				T result = caseGerund(gerund);
				if (result == null) result = caseEntityConcept(gerund);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErPackage.ATTRIBUTE_DOMAIN: {
				AttributeDomain attributeDomain = (AttributeDomain)theEObject;
				T result = caseAttributeDomain(attributeDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modelling Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modelling Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModellingConcept(ModellingConcept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationshipConcept(RelationshipConcept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomain(Domain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationship(Relationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISA(ISA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Categorisation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Categorisation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategorisation(Categorisation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identification Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identification Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentificationDependency(IdentificationDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regular Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regular Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegularEntity(RegularEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Categories</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Categories</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategories(Categories object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ER Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ER Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseERModel(ERModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityConcept(EntityConcept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKey(Key object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gerund</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gerund</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGerund(Gerund object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDomain(AttributeDomain object) {
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

} //ErSwitch
