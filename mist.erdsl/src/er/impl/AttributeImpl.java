/**
 */
package er.impl;

import er.Attribute;
import er.AttributeDomain;
import er.ErPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link er.impl.AttributeImpl#getAttributeDomain <em>Attribute Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeImpl extends ModellingConceptImpl implements Attribute {
	/**
	 * The cached value of the '{@link #getAttributeDomain() <em>Attribute Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeDomain()
	 * @generated
	 * @ordered
	 */
	protected AttributeDomain attributeDomain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDomain getAttributeDomain() {
		return attributeDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributeDomain(AttributeDomain newAttributeDomain, NotificationChain msgs) {
		AttributeDomain oldAttributeDomain = attributeDomain;
		attributeDomain = newAttributeDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErPackage.ATTRIBUTE__ATTRIBUTE_DOMAIN, oldAttributeDomain, newAttributeDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeDomain(AttributeDomain newAttributeDomain) {
		if (newAttributeDomain != attributeDomain) {
			NotificationChain msgs = null;
			if (attributeDomain != null)
				msgs = ((InternalEObject)attributeDomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErPackage.ATTRIBUTE__ATTRIBUTE_DOMAIN, null, msgs);
			if (newAttributeDomain != null)
				msgs = ((InternalEObject)newAttributeDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErPackage.ATTRIBUTE__ATTRIBUTE_DOMAIN, null, msgs);
			msgs = basicSetAttributeDomain(newAttributeDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErPackage.ATTRIBUTE__ATTRIBUTE_DOMAIN, newAttributeDomain, newAttributeDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErPackage.ATTRIBUTE__ATTRIBUTE_DOMAIN:
				return basicSetAttributeDomain(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ErPackage.ATTRIBUTE__ATTRIBUTE_DOMAIN:
				return getAttributeDomain();
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
			case ErPackage.ATTRIBUTE__ATTRIBUTE_DOMAIN:
				setAttributeDomain((AttributeDomain)newValue);
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
			case ErPackage.ATTRIBUTE__ATTRIBUTE_DOMAIN:
				setAttributeDomain((AttributeDomain)null);
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
			case ErPackage.ATTRIBUTE__ATTRIBUTE_DOMAIN:
				return attributeDomain != null;
		}
		return super.eIsSet(featureID);
	}

} //AttributeImpl
