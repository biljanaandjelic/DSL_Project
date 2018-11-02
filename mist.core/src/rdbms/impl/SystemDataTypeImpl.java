/**
 */
package rdbms.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rdbms.RdbmsPackage;
import rdbms.SystemDataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rdbms.impl.SystemDataTypeImpl#getPredefinedLength <em>Predefined Length</em>}</li>
 *   <li>{@link rdbms.impl.SystemDataTypeImpl#getPredefinedDecPlaces <em>Predefined Dec Places</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemDataTypeImpl extends DataTypeImpl implements SystemDataType {
	/**
	 * The default value of the '{@link #getPredefinedLength() <em>Predefined Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedLength()
	 * @generated
	 * @ordered
	 */
	protected static final int PREDEFINED_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPredefinedLength() <em>Predefined Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedLength()
	 * @generated
	 * @ordered
	 */
	protected int predefinedLength = PREDEFINED_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPredefinedDecPlaces() <em>Predefined Dec Places</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedDecPlaces()
	 * @generated
	 * @ordered
	 */
	protected static final int PREDEFINED_DEC_PLACES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPredefinedDecPlaces() <em>Predefined Dec Places</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedDecPlaces()
	 * @generated
	 * @ordered
	 */
	protected int predefinedDecPlaces = PREDEFINED_DEC_PLACES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdbmsPackage.Literals.SYSTEM_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPredefinedLength() {
		return predefinedLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedLength(int newPredefinedLength) {
		int oldPredefinedLength = predefinedLength;
		predefinedLength = newPredefinedLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.SYSTEM_DATA_TYPE__PREDEFINED_LENGTH, oldPredefinedLength, predefinedLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPredefinedDecPlaces() {
		return predefinedDecPlaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedDecPlaces(int newPredefinedDecPlaces) {
		int oldPredefinedDecPlaces = predefinedDecPlaces;
		predefinedDecPlaces = newPredefinedDecPlaces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.SYSTEM_DATA_TYPE__PREDEFINED_DEC_PLACES, oldPredefinedDecPlaces, predefinedDecPlaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RdbmsPackage.SYSTEM_DATA_TYPE__PREDEFINED_LENGTH:
				return getPredefinedLength();
			case RdbmsPackage.SYSTEM_DATA_TYPE__PREDEFINED_DEC_PLACES:
				return getPredefinedDecPlaces();
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
			case RdbmsPackage.SYSTEM_DATA_TYPE__PREDEFINED_LENGTH:
				setPredefinedLength((Integer)newValue);
				return;
			case RdbmsPackage.SYSTEM_DATA_TYPE__PREDEFINED_DEC_PLACES:
				setPredefinedDecPlaces((Integer)newValue);
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
			case RdbmsPackage.SYSTEM_DATA_TYPE__PREDEFINED_LENGTH:
				setPredefinedLength(PREDEFINED_LENGTH_EDEFAULT);
				return;
			case RdbmsPackage.SYSTEM_DATA_TYPE__PREDEFINED_DEC_PLACES:
				setPredefinedDecPlaces(PREDEFINED_DEC_PLACES_EDEFAULT);
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
			case RdbmsPackage.SYSTEM_DATA_TYPE__PREDEFINED_LENGTH:
				return predefinedLength != PREDEFINED_LENGTH_EDEFAULT;
			case RdbmsPackage.SYSTEM_DATA_TYPE__PREDEFINED_DEC_PLACES:
				return predefinedDecPlaces != PREDEFINED_DEC_PLACES_EDEFAULT;
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
		result.append(" (predefinedLength: ");
		result.append(predefinedLength);
		result.append(", predefinedDecPlaces: ");
		result.append(predefinedDecPlaces);
		result.append(')');
		return result.toString();
	}

} //SystemDataTypeImpl
