/**
 */
package er.impl;

import er.Domain;
import er.ERModel;
import er.Entity;
import er.ErPackage;
import er.Gerund;
import er.RelationshipConcept;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ER Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link er.impl.ERModelImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link er.impl.ERModelImpl#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link er.impl.ERModelImpl#getGerunds <em>Gerunds</em>}</li>
 *   <li>{@link er.impl.ERModelImpl#getDomains <em>Domains</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ERModelImpl extends ModellingConceptImpl implements ERModel {
	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entities;

	/**
	 * The cached value of the '{@link #getRelationships() <em>Relationships</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationshipConcept> relationships;

	/**
	 * The cached value of the '{@link #getGerunds() <em>Gerunds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGerunds()
	 * @generated
	 * @ordered
	 */
	protected EList<Gerund> gerunds;

	/**
	 * The cached value of the '{@link #getDomains() <em>Domains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomains()
	 * @generated
	 * @ordered
	 */
	protected EList<Domain> domains;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ERModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErPackage.Literals.ER_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentEList<Entity>(Entity.class, this, ErPackage.ER_MODEL__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationshipConcept> getRelationships() {
		if (relationships == null) {
			relationships = new EObjectContainmentEList<RelationshipConcept>(RelationshipConcept.class, this, ErPackage.ER_MODEL__RELATIONSHIPS);
		}
		return relationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gerund> getGerunds() {
		if (gerunds == null) {
			gerunds = new EObjectContainmentEList<Gerund>(Gerund.class, this, ErPackage.ER_MODEL__GERUNDS);
		}
		return gerunds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Domain> getDomains() {
		if (domains == null) {
			domains = new EObjectContainmentEList<Domain>(Domain.class, this, ErPackage.ER_MODEL__DOMAINS);
		}
		return domains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErPackage.ER_MODEL__ENTITIES:
				return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
			case ErPackage.ER_MODEL__RELATIONSHIPS:
				return ((InternalEList<?>)getRelationships()).basicRemove(otherEnd, msgs);
			case ErPackage.ER_MODEL__GERUNDS:
				return ((InternalEList<?>)getGerunds()).basicRemove(otherEnd, msgs);
			case ErPackage.ER_MODEL__DOMAINS:
				return ((InternalEList<?>)getDomains()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ErPackage.ER_MODEL__ENTITIES:
				return getEntities();
			case ErPackage.ER_MODEL__RELATIONSHIPS:
				return getRelationships();
			case ErPackage.ER_MODEL__GERUNDS:
				return getGerunds();
			case ErPackage.ER_MODEL__DOMAINS:
				return getDomains();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ErPackage.ER_MODEL__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case ErPackage.ER_MODEL__RELATIONSHIPS:
				getRelationships().clear();
				getRelationships().addAll((Collection<? extends RelationshipConcept>)newValue);
				return;
			case ErPackage.ER_MODEL__GERUNDS:
				getGerunds().clear();
				getGerunds().addAll((Collection<? extends Gerund>)newValue);
				return;
			case ErPackage.ER_MODEL__DOMAINS:
				getDomains().clear();
				getDomains().addAll((Collection<? extends Domain>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ErPackage.ER_MODEL__ENTITIES:
				getEntities().clear();
				return;
			case ErPackage.ER_MODEL__RELATIONSHIPS:
				getRelationships().clear();
				return;
			case ErPackage.ER_MODEL__GERUNDS:
				getGerunds().clear();
				return;
			case ErPackage.ER_MODEL__DOMAINS:
				getDomains().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ErPackage.ER_MODEL__ENTITIES:
				return entities != null && !entities.isEmpty();
			case ErPackage.ER_MODEL__RELATIONSHIPS:
				return relationships != null && !relationships.isEmpty();
			case ErPackage.ER_MODEL__GERUNDS:
				return gerunds != null && !gerunds.isEmpty();
			case ErPackage.ER_MODEL__DOMAINS:
				return domains != null && !domains.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ERModelImpl
