/**
 */
package er.impl;

import er.Categories;
import er.Categorisation;
import er.EntityConcept;
import er.ErPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Categorisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link er.impl.CategorisationImpl#getCategorisationEntities <em>Categorisation Entities</em>}</li>
 *   <li>{@link er.impl.CategorisationImpl#isIsPartial <em>Is Partial</em>}</li>
 *   <li>{@link er.impl.CategorisationImpl#getCategorisedEntity <em>Categorised Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CategorisationImpl extends RelationshipConceptImpl implements Categorisation {
	/**
	 * The cached value of the '{@link #getCategorisationEntities() <em>Categorisation Entities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorisationEntities()
	 * @generated
	 * @ordered
	 */
	protected Categories categorisationEntities;

	/**
	 * The default value of the '{@link #isIsPartial() <em>Is Partial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPartial()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PARTIAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPartial() <em>Is Partial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPartial()
	 * @generated
	 * @ordered
	 */
	protected boolean isPartial = IS_PARTIAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCategorisedEntity() <em>Categorised Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorisedEntity()
	 * @generated
	 * @ordered
	 */
	protected EntityConcept categorisedEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategorisationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErPackage.Literals.CATEGORISATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Categories getCategorisationEntities() {
		return categorisationEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategorisationEntities(Categories newCategorisationEntities, NotificationChain msgs) {
		Categories oldCategorisationEntities = categorisationEntities;
		categorisationEntities = newCategorisationEntities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErPackage.CATEGORISATION__CATEGORISATION_ENTITIES, oldCategorisationEntities, newCategorisationEntities);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorisationEntities(Categories newCategorisationEntities) {
		if (newCategorisationEntities != categorisationEntities) {
			NotificationChain msgs = null;
			if (categorisationEntities != null)
				msgs = ((InternalEObject)categorisationEntities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErPackage.CATEGORISATION__CATEGORISATION_ENTITIES, null, msgs);
			if (newCategorisationEntities != null)
				msgs = ((InternalEObject)newCategorisationEntities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErPackage.CATEGORISATION__CATEGORISATION_ENTITIES, null, msgs);
			msgs = basicSetCategorisationEntities(newCategorisationEntities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErPackage.CATEGORISATION__CATEGORISATION_ENTITIES, newCategorisationEntities, newCategorisationEntities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPartial() {
		return isPartial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPartial(boolean newIsPartial) {
		boolean oldIsPartial = isPartial;
		isPartial = newIsPartial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErPackage.CATEGORISATION__IS_PARTIAL, oldIsPartial, isPartial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityConcept getCategorisedEntity() {
		if (categorisedEntity != null && categorisedEntity.eIsProxy()) {
			InternalEObject oldCategorisedEntity = (InternalEObject)categorisedEntity;
			categorisedEntity = (EntityConcept)eResolveProxy(oldCategorisedEntity);
			if (categorisedEntity != oldCategorisedEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErPackage.CATEGORISATION__CATEGORISED_ENTITY, oldCategorisedEntity, categorisedEntity));
			}
		}
		return categorisedEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityConcept basicGetCategorisedEntity() {
		return categorisedEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorisedEntity(EntityConcept newCategorisedEntity) {
		EntityConcept oldCategorisedEntity = categorisedEntity;
		categorisedEntity = newCategorisedEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErPackage.CATEGORISATION__CATEGORISED_ENTITY, oldCategorisedEntity, categorisedEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErPackage.CATEGORISATION__CATEGORISATION_ENTITIES:
				return basicSetCategorisationEntities(null, msgs);
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
			case ErPackage.CATEGORISATION__CATEGORISATION_ENTITIES:
				return getCategorisationEntities();
			case ErPackage.CATEGORISATION__IS_PARTIAL:
				return isIsPartial();
			case ErPackage.CATEGORISATION__CATEGORISED_ENTITY:
				if (resolve) return getCategorisedEntity();
				return basicGetCategorisedEntity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ErPackage.CATEGORISATION__CATEGORISATION_ENTITIES:
				setCategorisationEntities((Categories)newValue);
				return;
			case ErPackage.CATEGORISATION__IS_PARTIAL:
				setIsPartial((Boolean)newValue);
				return;
			case ErPackage.CATEGORISATION__CATEGORISED_ENTITY:
				setCategorisedEntity((EntityConcept)newValue);
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
			case ErPackage.CATEGORISATION__CATEGORISATION_ENTITIES:
				setCategorisationEntities((Categories)null);
				return;
			case ErPackage.CATEGORISATION__IS_PARTIAL:
				setIsPartial(IS_PARTIAL_EDEFAULT);
				return;
			case ErPackage.CATEGORISATION__CATEGORISED_ENTITY:
				setCategorisedEntity((EntityConcept)null);
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
			case ErPackage.CATEGORISATION__CATEGORISATION_ENTITIES:
				return categorisationEntities != null;
			case ErPackage.CATEGORISATION__IS_PARTIAL:
				return isPartial != IS_PARTIAL_EDEFAULT;
			case ErPackage.CATEGORISATION__CATEGORISED_ENTITY:
				return categorisedEntity != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isPartial: ");
		result.append(isPartial);
		result.append(')');
		return result.toString();
	}

} //CategorisationImpl
