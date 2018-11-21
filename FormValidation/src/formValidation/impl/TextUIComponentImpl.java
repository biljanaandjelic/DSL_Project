/**
 */
package formValidation.impl;

import formValidation.FormValidationPackage;
import formValidation.TextUIComponent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text UI Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link formValidation.impl.TextUIComponentImpl#getPlaceHolder <em>Place Holder</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TextUIComponentImpl extends UIComponentImpl implements TextUIComponent {
	/**
	 * The default value of the '{@link #getPlaceHolder() <em>Place Holder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceHolder()
	 * @generated
	 * @ordered
	 */
	protected static final String PLACE_HOLDER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPlaceHolder() <em>Place Holder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceHolder()
	 * @generated
	 * @ordered
	 */
	protected String placeHolder = PLACE_HOLDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextUIComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormValidationPackage.Literals.TEXT_UI_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlaceHolder() {
		return placeHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlaceHolder(String newPlaceHolder) {
		String oldPlaceHolder = placeHolder;
		placeHolder = newPlaceHolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormValidationPackage.TEXT_UI_COMPONENT__PLACE_HOLDER, oldPlaceHolder, placeHolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FormValidationPackage.TEXT_UI_COMPONENT__PLACE_HOLDER:
				return getPlaceHolder();
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
			case FormValidationPackage.TEXT_UI_COMPONENT__PLACE_HOLDER:
				setPlaceHolder((String)newValue);
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
			case FormValidationPackage.TEXT_UI_COMPONENT__PLACE_HOLDER:
				setPlaceHolder(PLACE_HOLDER_EDEFAULT);
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
			case FormValidationPackage.TEXT_UI_COMPONENT__PLACE_HOLDER:
				return PLACE_HOLDER_EDEFAULT == null ? placeHolder != null : !PLACE_HOLDER_EDEFAULT.equals(placeHolder);
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
		result.append(" (placeHolder: ");
		result.append(placeHolder);
		result.append(')');
		return result.toString();
	}

} //TextUIComponentImpl
