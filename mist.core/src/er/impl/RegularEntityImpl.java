/**
 */
package er.impl;

import er.EntityConcept;
import er.ErPackage;
import er.MaxCardinality;
import er.MinCardinality;
import er.RegularEntity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regular Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link er.impl.RegularEntityImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link er.impl.RegularEntityImpl#getRole <em>Role</em>}</li>
 *   <li>{@link er.impl.RegularEntityImpl#getMin <em>Min</em>}</li>
 *   <li>{@link er.impl.RegularEntityImpl#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegularEntityImpl extends MinimalEObjectImpl.Container implements RegularEntity {
	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected EntityConcept entity;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final MinCardinality MIN_EDEFAULT = MinCardinality.ZERO;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected MinCardinality min = MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final MaxCardinality MAX_EDEFAULT = MaxCardinality.ONE;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected MaxCardinality max = MAX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegularEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErPackage.Literals.REGULAR_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityConcept getEntity() {
		if (entity != null && entity.eIsProxy()) {
			InternalEObject oldEntity = (InternalEObject)entity;
			entity = (EntityConcept)eResolveProxy(oldEntity);
			if (entity != oldEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErPackage.REGULAR_ENTITY__ENTITY, oldEntity, entity));
			}
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityConcept basicGetEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(EntityConcept newEntity) {
		EntityConcept oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErPackage.REGULAR_ENTITY__ENTITY, oldEntity, entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(String newRole) {
		String oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErPackage.REGULAR_ENTITY__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinCardinality getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(MinCardinality newMin) {
		MinCardinality oldMin = min;
		min = newMin == null ? MIN_EDEFAULT : newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErPackage.REGULAR_ENTITY__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxCardinality getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(MaxCardinality newMax) {
		MaxCardinality oldMax = max;
		max = newMax == null ? MAX_EDEFAULT : newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErPackage.REGULAR_ENTITY__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ErPackage.REGULAR_ENTITY__ENTITY:
				if (resolve) return getEntity();
				return basicGetEntity();
			case ErPackage.REGULAR_ENTITY__ROLE:
				return getRole();
			case ErPackage.REGULAR_ENTITY__MIN:
				return getMin();
			case ErPackage.REGULAR_ENTITY__MAX:
				return getMax();
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
			case ErPackage.REGULAR_ENTITY__ENTITY:
				setEntity((EntityConcept)newValue);
				return;
			case ErPackage.REGULAR_ENTITY__ROLE:
				setRole((String)newValue);
				return;
			case ErPackage.REGULAR_ENTITY__MIN:
				setMin((MinCardinality)newValue);
				return;
			case ErPackage.REGULAR_ENTITY__MAX:
				setMax((MaxCardinality)newValue);
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
			case ErPackage.REGULAR_ENTITY__ENTITY:
				setEntity((EntityConcept)null);
				return;
			case ErPackage.REGULAR_ENTITY__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case ErPackage.REGULAR_ENTITY__MIN:
				setMin(MIN_EDEFAULT);
				return;
			case ErPackage.REGULAR_ENTITY__MAX:
				setMax(MAX_EDEFAULT);
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
			case ErPackage.REGULAR_ENTITY__ENTITY:
				return entity != null;
			case ErPackage.REGULAR_ENTITY__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case ErPackage.REGULAR_ENTITY__MIN:
				return min != MIN_EDEFAULT;
			case ErPackage.REGULAR_ENTITY__MAX:
				return max != MAX_EDEFAULT;
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
		result.append(" (role: ");
		result.append(role);
		result.append(", min: ");
		result.append(min);
		result.append(", max: ");
		result.append(max);
		result.append(')');
		return result.toString();
	}

} //RegularEntityImpl
