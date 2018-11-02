/**
 */
package rdbms.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rdbms.Constraints;
import rdbms.DeferrableAct;
import rdbms.DeferredAct;
import rdbms.RdbmsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rdbms.impl.ConstraintsImpl#getDeferrable <em>Deferrable</em>}</li>
 *   <li>{@link rdbms.impl.ConstraintsImpl#getDeferred <em>Deferred</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConstraintsImpl extends ModelElementImpl implements Constraints {
	/**
	 * The default value of the '{@link #getDeferrable() <em>Deferrable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeferrable()
	 * @generated
	 * @ordered
	 */
	protected static final DeferrableAct DEFERRABLE_EDEFAULT = DeferrableAct.DEFFERABLE;

	/**
	 * The cached value of the '{@link #getDeferrable() <em>Deferrable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeferrable()
	 * @generated
	 * @ordered
	 */
	protected DeferrableAct deferrable = DEFERRABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeferred() <em>Deferred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeferred()
	 * @generated
	 * @ordered
	 */
	protected static final DeferredAct DEFERRED_EDEFAULT = DeferredAct.INITIALLY_IMMEDIATE;

	/**
	 * The cached value of the '{@link #getDeferred() <em>Deferred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeferred()
	 * @generated
	 * @ordered
	 */
	protected DeferredAct deferred = DEFERRED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdbmsPackage.Literals.CONSTRAINTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeferrableAct getDeferrable() {
		return deferrable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeferrable(DeferrableAct newDeferrable) {
		DeferrableAct oldDeferrable = deferrable;
		deferrable = newDeferrable == null ? DEFERRABLE_EDEFAULT : newDeferrable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.CONSTRAINTS__DEFERRABLE, oldDeferrable, deferrable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeferredAct getDeferred() {
		return deferred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeferred(DeferredAct newDeferred) {
		DeferredAct oldDeferred = deferred;
		deferred = newDeferred == null ? DEFERRED_EDEFAULT : newDeferred;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.CONSTRAINTS__DEFERRED, oldDeferred, deferred));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RdbmsPackage.CONSTRAINTS__DEFERRABLE:
				return getDeferrable();
			case RdbmsPackage.CONSTRAINTS__DEFERRED:
				return getDeferred();
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
			case RdbmsPackage.CONSTRAINTS__DEFERRABLE:
				setDeferrable((DeferrableAct)newValue);
				return;
			case RdbmsPackage.CONSTRAINTS__DEFERRED:
				setDeferred((DeferredAct)newValue);
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
			case RdbmsPackage.CONSTRAINTS__DEFERRABLE:
				setDeferrable(DEFERRABLE_EDEFAULT);
				return;
			case RdbmsPackage.CONSTRAINTS__DEFERRED:
				setDeferred(DEFERRED_EDEFAULT);
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
			case RdbmsPackage.CONSTRAINTS__DEFERRABLE:
				return deferrable != DEFERRABLE_EDEFAULT;
			case RdbmsPackage.CONSTRAINTS__DEFERRED:
				return deferred != DEFERRED_EDEFAULT;
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
		result.append(" (deferrable: ");
		result.append(deferrable);
		result.append(", deferred: ");
		result.append(deferred);
		result.append(')');
		return result.toString();
	}

} //ConstraintsImpl
