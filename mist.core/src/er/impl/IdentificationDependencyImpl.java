/**
 */
package er.impl;

import er.Entity;
import er.ErPackage;
import er.IdentificationDependency;
import er.RegularEntity;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identification Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link er.impl.IdentificationDependencyImpl#getWeakEntity <em>Weak Entity</em>}</li>
 *   <li>{@link er.impl.IdentificationDependencyImpl#getRegularEntity <em>Regular Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IdentificationDependencyImpl extends RelationshipConceptImpl implements IdentificationDependency {
	/**
	 * The cached value of the '{@link #getWeakEntity() <em>Weak Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeakEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity weakEntity;

	/**
	 * The cached value of the '{@link #getRegularEntity() <em>Regular Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegularEntity()
	 * @generated
	 * @ordered
	 */
	protected RegularEntity regularEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentificationDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErPackage.Literals.IDENTIFICATION_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getWeakEntity() {
		if (weakEntity != null && weakEntity.eIsProxy()) {
			InternalEObject oldWeakEntity = (InternalEObject)weakEntity;
			weakEntity = (Entity)eResolveProxy(oldWeakEntity);
			if (weakEntity != oldWeakEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErPackage.IDENTIFICATION_DEPENDENCY__WEAK_ENTITY, oldWeakEntity, weakEntity));
			}
		}
		return weakEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetWeakEntity() {
		return weakEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeakEntity(Entity newWeakEntity) {
		Entity oldWeakEntity = weakEntity;
		weakEntity = newWeakEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErPackage.IDENTIFICATION_DEPENDENCY__WEAK_ENTITY, oldWeakEntity, weakEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularEntity getRegularEntity() {
		return regularEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegularEntity(RegularEntity newRegularEntity, NotificationChain msgs) {
		RegularEntity oldRegularEntity = regularEntity;
		regularEntity = newRegularEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErPackage.IDENTIFICATION_DEPENDENCY__REGULAR_ENTITY, oldRegularEntity, newRegularEntity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegularEntity(RegularEntity newRegularEntity) {
		if (newRegularEntity != regularEntity) {
			NotificationChain msgs = null;
			if (regularEntity != null)
				msgs = ((InternalEObject)regularEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErPackage.IDENTIFICATION_DEPENDENCY__REGULAR_ENTITY, null, msgs);
			if (newRegularEntity != null)
				msgs = ((InternalEObject)newRegularEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErPackage.IDENTIFICATION_DEPENDENCY__REGULAR_ENTITY, null, msgs);
			msgs = basicSetRegularEntity(newRegularEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErPackage.IDENTIFICATION_DEPENDENCY__REGULAR_ENTITY, newRegularEntity, newRegularEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErPackage.IDENTIFICATION_DEPENDENCY__REGULAR_ENTITY:
				return basicSetRegularEntity(null, msgs);
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
			case ErPackage.IDENTIFICATION_DEPENDENCY__WEAK_ENTITY:
				if (resolve) return getWeakEntity();
				return basicGetWeakEntity();
			case ErPackage.IDENTIFICATION_DEPENDENCY__REGULAR_ENTITY:
				return getRegularEntity();
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
			case ErPackage.IDENTIFICATION_DEPENDENCY__WEAK_ENTITY:
				setWeakEntity((Entity)newValue);
				return;
			case ErPackage.IDENTIFICATION_DEPENDENCY__REGULAR_ENTITY:
				setRegularEntity((RegularEntity)newValue);
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
			case ErPackage.IDENTIFICATION_DEPENDENCY__WEAK_ENTITY:
				setWeakEntity((Entity)null);
				return;
			case ErPackage.IDENTIFICATION_DEPENDENCY__REGULAR_ENTITY:
				setRegularEntity((RegularEntity)null);
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
			case ErPackage.IDENTIFICATION_DEPENDENCY__WEAK_ENTITY:
				return weakEntity != null;
			case ErPackage.IDENTIFICATION_DEPENDENCY__REGULAR_ENTITY:
				return regularEntity != null;
		}
		return super.eIsSet(featureID);
	}

} //IdentificationDependencyImpl
