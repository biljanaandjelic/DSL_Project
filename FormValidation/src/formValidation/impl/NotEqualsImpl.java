/**
 */
package formValidation.impl;

import formValidation.AttributeArray;
import formValidation.FormValidationPackage;
import formValidation.NotEquals;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not Equals</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link formValidation.impl.NotEqualsImpl#getAttributearray <em>Attributearray</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotEqualsImpl extends ClassRuleImpl implements NotEquals {
	/**
	 * The cached value of the '{@link #getAttributearray() <em>Attributearray</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributearray()
	 * @generated
	 * @ordered
	 */
	protected AttributeArray attributearray;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotEqualsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormValidationPackage.Literals.NOT_EQUALS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeArray getAttributearray() {
		return attributearray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributearray(AttributeArray newAttributearray, NotificationChain msgs) {
		AttributeArray oldAttributearray = attributearray;
		attributearray = newAttributearray;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormValidationPackage.NOT_EQUALS__ATTRIBUTEARRAY, oldAttributearray, newAttributearray);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributearray(AttributeArray newAttributearray) {
		if (newAttributearray != attributearray) {
			NotificationChain msgs = null;
			if (attributearray != null)
				msgs = ((InternalEObject)attributearray).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormValidationPackage.NOT_EQUALS__ATTRIBUTEARRAY, null, msgs);
			if (newAttributearray != null)
				msgs = ((InternalEObject)newAttributearray).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormValidationPackage.NOT_EQUALS__ATTRIBUTEARRAY, null, msgs);
			msgs = basicSetAttributearray(newAttributearray, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormValidationPackage.NOT_EQUALS__ATTRIBUTEARRAY, newAttributearray, newAttributearray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormValidationPackage.NOT_EQUALS__ATTRIBUTEARRAY:
				return basicSetAttributearray(null, msgs);
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
			case FormValidationPackage.NOT_EQUALS__ATTRIBUTEARRAY:
				return getAttributearray();
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
			case FormValidationPackage.NOT_EQUALS__ATTRIBUTEARRAY:
				setAttributearray((AttributeArray)newValue);
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
			case FormValidationPackage.NOT_EQUALS__ATTRIBUTEARRAY:
				setAttributearray((AttributeArray)null);
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
			case FormValidationPackage.NOT_EQUALS__ATTRIBUTEARRAY:
				return attributearray != null;
		}
		return super.eIsSet(featureID);
	}

} //NotEqualsImpl
