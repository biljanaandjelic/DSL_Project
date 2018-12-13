/**
 */
package formValidation.impl;

import formValidation.EPosition;
import formValidation.FileInput;
import formValidation.FormValidationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link formValidation.impl.FileInputImpl#getButtonPosition <em>Button Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileInputImpl extends UIComponentImpl implements FileInput {
	/**
	 * The default value of the '{@link #getButtonPosition() <em>Button Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButtonPosition()
	 * @generated
	 * @ordered
	 */
	protected static final EPosition BUTTON_POSITION_EDEFAULT = EPosition.RIGHT;

	/**
	 * The cached value of the '{@link #getButtonPosition() <em>Button Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButtonPosition()
	 * @generated
	 * @ordered
	 */
	protected EPosition buttonPosition = BUTTON_POSITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormValidationPackage.Literals.FILE_INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPosition getButtonPosition() {
		return buttonPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setButtonPosition(EPosition newButtonPosition) {
		EPosition oldButtonPosition = buttonPosition;
		buttonPosition = newButtonPosition == null ? BUTTON_POSITION_EDEFAULT : newButtonPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormValidationPackage.FILE_INPUT__BUTTON_POSITION, oldButtonPosition, buttonPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FormValidationPackage.FILE_INPUT__BUTTON_POSITION:
				return getButtonPosition();
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
			case FormValidationPackage.FILE_INPUT__BUTTON_POSITION:
				setButtonPosition((EPosition)newValue);
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
			case FormValidationPackage.FILE_INPUT__BUTTON_POSITION:
				setButtonPosition(BUTTON_POSITION_EDEFAULT);
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
			case FormValidationPackage.FILE_INPUT__BUTTON_POSITION:
				return buttonPosition != BUTTON_POSITION_EDEFAULT;
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
		result.append(" (buttonPosition: ");
		result.append(buttonPosition);
		result.append(')');
		return result.toString();
	}

} //FileInputImpl
