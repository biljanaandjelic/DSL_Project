/**
 */
package formValidation.impl;

import formValidation.FormValidationPackage;
import formValidation.LoadValues;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link formValidation.impl.LoadValuesImpl#isIsMultiSelect <em>Is Multi Select</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadValuesImpl extends SelectingUIComponentImpl implements LoadValues {
	/**
	 * The default value of the '{@link #isIsMultiSelect() <em>Is Multi Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMultiSelect()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MULTI_SELECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMultiSelect() <em>Is Multi Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMultiSelect()
	 * @generated
	 * @ordered
	 */
	protected boolean isMultiSelect = IS_MULTI_SELECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadValuesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormValidationPackage.Literals.LOAD_VALUES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMultiSelect() {
		return isMultiSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMultiSelect(boolean newIsMultiSelect) {
		boolean oldIsMultiSelect = isMultiSelect;
		isMultiSelect = newIsMultiSelect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormValidationPackage.LOAD_VALUES__IS_MULTI_SELECT, oldIsMultiSelect, isMultiSelect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FormValidationPackage.LOAD_VALUES__IS_MULTI_SELECT:
				return isIsMultiSelect();
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
			case FormValidationPackage.LOAD_VALUES__IS_MULTI_SELECT:
				setIsMultiSelect((Boolean)newValue);
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
			case FormValidationPackage.LOAD_VALUES__IS_MULTI_SELECT:
				setIsMultiSelect(IS_MULTI_SELECT_EDEFAULT);
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
			case FormValidationPackage.LOAD_VALUES__IS_MULTI_SELECT:
				return isMultiSelect != IS_MULTI_SELECT_EDEFAULT;
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
		result.append(" (isMultiSelect: ");
		result.append(isMultiSelect);
		result.append(')');
		return result.toString();
	}

} //LoadValuesImpl
