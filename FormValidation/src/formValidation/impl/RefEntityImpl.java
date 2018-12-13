/**
 */
package formValidation.impl;

import formValidation.FormValidationPackage;
import formValidation.RefEntity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link formValidation.impl.RefEntityImpl#isIsSingeValue <em>Is Singe Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefEntityImpl extends UIComponentImpl implements RefEntity {
	/**
	 * The default value of the '{@link #isIsSingeValue() <em>Is Singe Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSingeValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SINGE_VALUE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsSingeValue() <em>Is Singe Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSingeValue()
	 * @generated
	 * @ordered
	 */
	protected boolean isSingeValue = IS_SINGE_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormValidationPackage.Literals.REF_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSingeValue() {
		return isSingeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSingeValue(boolean newIsSingeValue) {
		boolean oldIsSingeValue = isSingeValue;
		isSingeValue = newIsSingeValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormValidationPackage.REF_ENTITY__IS_SINGE_VALUE, oldIsSingeValue, isSingeValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FormValidationPackage.REF_ENTITY__IS_SINGE_VALUE:
				return isIsSingeValue();
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
			case FormValidationPackage.REF_ENTITY__IS_SINGE_VALUE:
				setIsSingeValue((Boolean)newValue);
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
			case FormValidationPackage.REF_ENTITY__IS_SINGE_VALUE:
				setIsSingeValue(IS_SINGE_VALUE_EDEFAULT);
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
			case FormValidationPackage.REF_ENTITY__IS_SINGE_VALUE:
				return isSingeValue != IS_SINGE_VALUE_EDEFAULT;
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
		result.append(" (isSingeValue: ");
		result.append(isSingeValue);
		result.append(')');
		return result.toString();
	}

} //RefEntityImpl
