/**
 */
package formValidation.impl;

import formValidation.AttributeType;
import formValidation.EVrsta;
import formValidation.FormValidationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link formValidation.impl.AttributeTypeImpl#getVrsta <em>Vrsta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeTypeImpl extends MinimalEObjectImpl.Container implements AttributeType {
	/**
	 * The default value of the '{@link #getVrsta() <em>Vrsta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVrsta()
	 * @generated
	 * @ordered
	 */
	protected static final EVrsta VRSTA_EDEFAULT = EVrsta.STRING;

	/**
	 * The cached value of the '{@link #getVrsta() <em>Vrsta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVrsta()
	 * @generated
	 * @ordered
	 */
	protected EVrsta vrsta = VRSTA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormValidationPackage.Literals.ATTRIBUTE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EVrsta getVrsta() {
		return vrsta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVrsta(EVrsta newVrsta) {
		EVrsta oldVrsta = vrsta;
		vrsta = newVrsta == null ? VRSTA_EDEFAULT : newVrsta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormValidationPackage.ATTRIBUTE_TYPE__VRSTA, oldVrsta, vrsta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FormValidationPackage.ATTRIBUTE_TYPE__VRSTA:
				return getVrsta();
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
			case FormValidationPackage.ATTRIBUTE_TYPE__VRSTA:
				setVrsta((EVrsta)newValue);
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
			case FormValidationPackage.ATTRIBUTE_TYPE__VRSTA:
				setVrsta(VRSTA_EDEFAULT);
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
			case FormValidationPackage.ATTRIBUTE_TYPE__VRSTA:
				return vrsta != VRSTA_EDEFAULT;
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
		result.append(" (vrsta: ");
		result.append(vrsta);
		result.append(')');
		return result.toString();
	}

} //AttributeTypeImpl
