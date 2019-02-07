/**
 */
package formValidation.impl;

import formValidation.ClassRule;
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
 * An implementation of the model object '<em><b>Class Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link formValidation.impl.ClassRuleImpl#getErrorMessage <em>Error Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ClassRuleImpl extends MinimalEObjectImpl.Container implements ClassRule {
	/**
	 * The cached value of the '{@link #getErrorMessage() <em>Error Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorMessage()
	 * @generated
	 * @ordered
	 */
	protected ErrorMessage errorMessage;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormValidationPackage.Literals.CLASS_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorMessage getErrorMessage() {
		return errorMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErrorMessage(ErrorMessage newErrorMessage, NotificationChain msgs) {
		ErrorMessage oldErrorMessage = errorMessage;
		errorMessage = newErrorMessage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormValidationPackage.CLASS_RULE__ERROR_MESSAGE, oldErrorMessage, newErrorMessage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorMessage(ErrorMessage newErrorMessage) {
		if (newErrorMessage != errorMessage) {
			NotificationChain msgs = null;
			if (errorMessage != null)
				msgs = ((InternalEObject)errorMessage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormValidationPackage.CLASS_RULE__ERROR_MESSAGE, null, msgs);
			if (newErrorMessage != null)
				msgs = ((InternalEObject)newErrorMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormValidationPackage.CLASS_RULE__ERROR_MESSAGE, null, msgs);
			msgs = basicSetErrorMessage(newErrorMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormValidationPackage.CLASS_RULE__ERROR_MESSAGE, newErrorMessage, newErrorMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormValidationPackage.CLASS_RULE__ERROR_MESSAGE:
				return basicSetErrorMessage(null, msgs);
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
			case FormValidationPackage.CLASS_RULE__ERROR_MESSAGE:
				return getErrorMessage();
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
			case FormValidationPackage.CLASS_RULE__ERROR_MESSAGE:
				setErrorMessage((ErrorMessage)newValue);
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
			case FormValidationPackage.CLASS_RULE__ERROR_MESSAGE:
				setErrorMessage((ErrorMessage)null);
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
			case FormValidationPackage.CLASS_RULE__ERROR_MESSAGE:
				return errorMessage != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassRuleImpl
