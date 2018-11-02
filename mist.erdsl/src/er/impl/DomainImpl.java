/**
 */
package er.impl;

import er.Domain;
import er.ErPackage;
import er.PrimitiveDomain;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link er.impl.DomainImpl#getPrimitiveDomain <em>Primitive Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainImpl extends ModellingConceptImpl implements Domain {
	/**
	 * The default value of the '{@link #getPrimitiveDomain() <em>Primitive Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveDomain()
	 * @generated
	 * @ordered
	 */
	protected static final PrimitiveDomain PRIMITIVE_DOMAIN_EDEFAULT = PrimitiveDomain.INTEGER;

	/**
	 * The cached value of the '{@link #getPrimitiveDomain() <em>Primitive Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveDomain()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveDomain primitiveDomain = PRIMITIVE_DOMAIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErPackage.Literals.DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveDomain getPrimitiveDomain() {
		return primitiveDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimitiveDomain(PrimitiveDomain newPrimitiveDomain) {
		PrimitiveDomain oldPrimitiveDomain = primitiveDomain;
		primitiveDomain = newPrimitiveDomain == null ? PRIMITIVE_DOMAIN_EDEFAULT : newPrimitiveDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErPackage.DOMAIN__PRIMITIVE_DOMAIN, oldPrimitiveDomain, primitiveDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ErPackage.DOMAIN__PRIMITIVE_DOMAIN:
				return getPrimitiveDomain();
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
			case ErPackage.DOMAIN__PRIMITIVE_DOMAIN:
				setPrimitiveDomain((PrimitiveDomain)newValue);
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
			case ErPackage.DOMAIN__PRIMITIVE_DOMAIN:
				setPrimitiveDomain(PRIMITIVE_DOMAIN_EDEFAULT);
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
			case ErPackage.DOMAIN__PRIMITIVE_DOMAIN:
				return primitiveDomain != PRIMITIVE_DOMAIN_EDEFAULT;
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
		result.append(" (primitiveDomain: ");
		result.append(primitiveDomain);
		result.append(')');
		return result.toString();
	}

} //DomainImpl
