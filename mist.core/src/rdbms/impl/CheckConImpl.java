/**
 */
package rdbms.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rdbms.CheckCon;
import rdbms.RdbmsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check Con</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rdbms.impl.CheckConImpl#getCheckCondition <em>Check Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CheckConImpl extends ConstraintsImpl implements CheckCon {
	/**
	 * The default value of the '{@link #getCheckCondition() <em>Check Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CHECK_CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCheckCondition() <em>Check Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckCondition()
	 * @generated
	 * @ordered
	 */
	protected String checkCondition = CHECK_CONDITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckConImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdbmsPackage.Literals.CHECK_CON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCheckCondition() {
		return checkCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckCondition(String newCheckCondition) {
		String oldCheckCondition = checkCondition;
		checkCondition = newCheckCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.CHECK_CON__CHECK_CONDITION, oldCheckCondition, checkCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RdbmsPackage.CHECK_CON__CHECK_CONDITION:
				return getCheckCondition();
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
			case RdbmsPackage.CHECK_CON__CHECK_CONDITION:
				setCheckCondition((String)newValue);
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
			case RdbmsPackage.CHECK_CON__CHECK_CONDITION:
				setCheckCondition(CHECK_CONDITION_EDEFAULT);
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
			case RdbmsPackage.CHECK_CON__CHECK_CONDITION:
				return CHECK_CONDITION_EDEFAULT == null ? checkCondition != null : !CHECK_CONDITION_EDEFAULT.equals(checkCondition);
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
		result.append(" (checkCondition: ");
		result.append(checkCondition);
		result.append(')');
		return result.toString();
	}

} //CheckConImpl
