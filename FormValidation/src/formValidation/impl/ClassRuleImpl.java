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
 *   <li>{@link formValidation.impl.ClassRuleImpl#getClassRuleErrorMessage <em>Class Rule Error Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ClassRuleImpl extends MinimalEObjectImpl.Container implements ClassRule {
	/**
	 * The cached value of the '{@link #getClassRuleErrorMessage() <em>Class Rule Error Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassRuleErrorMessage()
	 * @generated
	 * @ordered
	 */
	protected ErrorMessage classRuleErrorMessage;

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
	public ErrorMessage getClassRuleErrorMessage() {
		return classRuleErrorMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassRuleErrorMessage(ErrorMessage newClassRuleErrorMessage, NotificationChain msgs) {
		ErrorMessage oldClassRuleErrorMessage = classRuleErrorMessage;
		classRuleErrorMessage = newClassRuleErrorMessage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormValidationPackage.CLASS_RULE__CLASS_RULE_ERROR_MESSAGE, oldClassRuleErrorMessage, newClassRuleErrorMessage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassRuleErrorMessage(ErrorMessage newClassRuleErrorMessage) {
		if (newClassRuleErrorMessage != classRuleErrorMessage) {
			NotificationChain msgs = null;
			if (classRuleErrorMessage != null)
				msgs = ((InternalEObject)classRuleErrorMessage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormValidationPackage.CLASS_RULE__CLASS_RULE_ERROR_MESSAGE, null, msgs);
			if (newClassRuleErrorMessage != null)
				msgs = ((InternalEObject)newClassRuleErrorMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormValidationPackage.CLASS_RULE__CLASS_RULE_ERROR_MESSAGE, null, msgs);
			msgs = basicSetClassRuleErrorMessage(newClassRuleErrorMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormValidationPackage.CLASS_RULE__CLASS_RULE_ERROR_MESSAGE, newClassRuleErrorMessage, newClassRuleErrorMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormValidationPackage.CLASS_RULE__CLASS_RULE_ERROR_MESSAGE:
				return basicSetClassRuleErrorMessage(null, msgs);
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
			case FormValidationPackage.CLASS_RULE__CLASS_RULE_ERROR_MESSAGE:
				return getClassRuleErrorMessage();
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
			case FormValidationPackage.CLASS_RULE__CLASS_RULE_ERROR_MESSAGE:
				setClassRuleErrorMessage((ErrorMessage)newValue);
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
			case FormValidationPackage.CLASS_RULE__CLASS_RULE_ERROR_MESSAGE:
				setClassRuleErrorMessage((ErrorMessage)null);
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
			case FormValidationPackage.CLASS_RULE__CLASS_RULE_ERROR_MESSAGE:
				return classRuleErrorMessage != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassRuleImpl
