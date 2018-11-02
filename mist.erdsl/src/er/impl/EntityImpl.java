/**
 */
package er.impl;

import er.Attribute;
import er.Entity;
import er.ErPackage;
import er.Key;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link er.impl.EntityImpl#getEntityAttributes <em>Entity Attributes</em>}</li>
 *   <li>{@link er.impl.EntityImpl#getKeySet <em>Key Set</em>}</li>
 *   <li>{@link er.impl.EntityImpl#getPrimaryKey <em>Primary Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityImpl extends ModellingConceptImpl implements Entity {
	/**
	 * The cached value of the '{@link #getEntityAttributes() <em>Entity Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> entityAttributes;

	/**
	 * The cached value of the '{@link #getKeySet() <em>Key Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeySet()
	 * @generated
	 * @ordered
	 */
	protected EList<Key> keySet;

	/**
	 * The cached value of the '{@link #getPrimaryKey() <em>Primary Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected Key primaryKey;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getEntityAttributes() {
		if (entityAttributes == null) {
			entityAttributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, ErPackage.ENTITY__ENTITY_ATTRIBUTES);
		}
		return entityAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Key> getKeySet() {
		if (keySet == null) {
			keySet = new EObjectContainmentEList<Key>(Key.class, this, ErPackage.ENTITY__KEY_SET);
		}
		return keySet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Key getPrimaryKey() {
		if (primaryKey != null && primaryKey.eIsProxy()) {
			InternalEObject oldPrimaryKey = (InternalEObject)primaryKey;
			primaryKey = (Key)eResolveProxy(oldPrimaryKey);
			if (primaryKey != oldPrimaryKey) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErPackage.ENTITY__PRIMARY_KEY, oldPrimaryKey, primaryKey));
			}
		}
		return primaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Key basicGetPrimaryKey() {
		return primaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryKey(Key newPrimaryKey) {
		Key oldPrimaryKey = primaryKey;
		primaryKey = newPrimaryKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErPackage.ENTITY__PRIMARY_KEY, oldPrimaryKey, primaryKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErPackage.ENTITY__ENTITY_ATTRIBUTES:
				return ((InternalEList<?>)getEntityAttributes()).basicRemove(otherEnd, msgs);
			case ErPackage.ENTITY__KEY_SET:
				return ((InternalEList<?>)getKeySet()).basicRemove(otherEnd, msgs);
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
			case ErPackage.ENTITY__ENTITY_ATTRIBUTES:
				return getEntityAttributes();
			case ErPackage.ENTITY__KEY_SET:
				return getKeySet();
			case ErPackage.ENTITY__PRIMARY_KEY:
				if (resolve) return getPrimaryKey();
				return basicGetPrimaryKey();
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
			case ErPackage.ENTITY__ENTITY_ATTRIBUTES:
				getEntityAttributes().clear();
				getEntityAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case ErPackage.ENTITY__KEY_SET:
				getKeySet().clear();
				getKeySet().addAll((Collection<? extends Key>)newValue);
				return;
			case ErPackage.ENTITY__PRIMARY_KEY:
				setPrimaryKey((Key)newValue);
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
			case ErPackage.ENTITY__ENTITY_ATTRIBUTES:
				getEntityAttributes().clear();
				return;
			case ErPackage.ENTITY__KEY_SET:
				getKeySet().clear();
				return;
			case ErPackage.ENTITY__PRIMARY_KEY:
				setPrimaryKey((Key)null);
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
			case ErPackage.ENTITY__ENTITY_ATTRIBUTES:
				return entityAttributes != null && !entityAttributes.isEmpty();
			case ErPackage.ENTITY__KEY_SET:
				return keySet != null && !keySet.isEmpty();
			case ErPackage.ENTITY__PRIMARY_KEY:
				return primaryKey != null;
		}
		return super.eIsSet(featureID);
	}

} //EntityImpl
