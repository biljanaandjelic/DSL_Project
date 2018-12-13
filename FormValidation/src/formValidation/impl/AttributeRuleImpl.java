/**
 */
package formValidation.impl;

import formValidation.AttributeRule;
import formValidation.ErrorMessage;
import formValidation.FormValidationPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link formValidation.impl.AttributeRuleImpl#getAttributeRuleErrorMessage <em>Attribute Rule Error Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AttributeRuleImpl extends MinimalEObjectImpl.Container implements AttributeRule {
	/**
	 * The cached value of the '{@link #getAttributeRuleErrorMessage() <em>Attribute Rule Error Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeRuleErrorMessage()
	 * @generated
	 * @ordered
	 */
	protected ErrorMessage attributeRuleErrorMessage;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormValidationPackage.Literals.ATTRIBUTE_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorMessage getAttributeRuleErrorMessage() {
		return attributeRuleErrorMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributeRuleErrorMessage(ErrorMessage newAttributeRuleErrorMessage, NotificationChain msgs) {
		ErrorMessage oldAttributeRuleErrorMessage = attributeRuleErrorMessage;
		attributeRuleErrorMessage = newAttributeRuleErrorMessage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormValidationPackage.ATTRIBUTE_RULE__ATTRIBUTE_RULE_ERROR_MESSAGE, oldAttributeRuleErrorMessage, newAttributeRuleErrorMessage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeRuleErrorMessage(ErrorMessage newAttributeRuleErrorMessage) {
		if (newAttributeRuleErrorMessage != attributeRuleErrorMessage) {
			NotificationChain msgs = null;
			if (attributeRuleErrorMessage != null)
				msgs = ((InternalEObject)attributeRuleErrorMessage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormValidationPackage.ATTRIBUTE_RULE__ATTRIBUTE_RULE_ERROR_MESSAGE, null, msgs);
			if (newAttributeRuleErrorMessage != null)
				msgs = ((InternalEObject)newAttributeRuleErrorMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormValidationPackage.ATTRIBUTE_RULE__ATTRIBUTE_RULE_ERROR_MESSAGE, null, msgs);
			msgs = basicSetAttributeRuleErrorMessage(newAttributeRuleErrorMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormValidationPackage.ATTRIBUTE_RULE__ATTRIBUTE_RULE_ERROR_MESSAGE, newAttributeRuleErrorMessage, newAttributeRuleErrorMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormValidationPackage.ATTRIBUTE_RULE__ATTRIBUTE_RULE_ERROR_MESSAGE:
				return basicSetAttributeRuleErrorMessage(null, msgs);
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
			case FormValidationPackage.ATTRIBUTE_RULE__ATTRIBUTE_RULE_ERROR_MESSAGE:
				return getAttributeRuleErrorMessage();
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
			case FormValidationPackage.ATTRIBUTE_RULE__ATTRIBUTE_RULE_ERROR_MESSAGE:
				setAttributeRuleErrorMessage((ErrorMessage)newValue);
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
			case FormValidationPackage.ATTRIBUTE_RULE__ATTRIBUTE_RULE_ERROR_MESSAGE:
				setAttributeRuleErrorMessage((ErrorMessage)null);
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
			case FormValidationPackage.ATTRIBUTE_RULE__ATTRIBUTE_RULE_ERROR_MESSAGE:
				return attributeRuleErrorMessage != null;
		}
		return super.eIsSet(featureID);
	}

} //AttributeRuleImpl
