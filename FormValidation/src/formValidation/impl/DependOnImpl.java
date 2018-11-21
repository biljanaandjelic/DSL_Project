/**
 */
package formValidation.impl;

import formValidation.AttributeArray;
import formValidation.DependOn;
import formValidation.FormValidationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Depend On</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link formValidation.impl.DependOnImpl#getIndependent <em>Independent</em>}</li>
 *   <li>{@link formValidation.impl.DependOnImpl#getDependent <em>Dependent</em>}</li>
 *   <li>{@link formValidation.impl.DependOnImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependOnImpl extends MinimalEObjectImpl.Container implements DependOn {
	/**
	 * The cached value of the '{@link #getIndependent() <em>Independent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndependent()
	 * @generated
	 * @ordered
	 */
	protected AttributeArray independent;

	/**
	 * The cached value of the '{@link #getDependent() <em>Dependent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependent()
	 * @generated
	 * @ordered
	 */
	protected AttributeArray dependent;

	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependOnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormValidationPackage.Literals.DEPEND_ON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeArray getIndependent() {
		if (independent != null && independent.eIsProxy()) {
			InternalEObject oldIndependent = (InternalEObject)independent;
			independent = (AttributeArray)eResolveProxy(oldIndependent);
			if (independent != oldIndependent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormValidationPackage.DEPEND_ON__INDEPENDENT, oldIndependent, independent));
			}
		}
		return independent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeArray basicGetIndependent() {
		return independent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndependent(AttributeArray newIndependent) {
		AttributeArray oldIndependent = independent;
		independent = newIndependent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormValidationPackage.DEPEND_ON__INDEPENDENT, oldIndependent, independent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeArray getDependent() {
		if (dependent != null && dependent.eIsProxy()) {
			InternalEObject oldDependent = (InternalEObject)dependent;
			dependent = (AttributeArray)eResolveProxy(oldDependent);
			if (dependent != oldDependent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormValidationPackage.DEPEND_ON__DEPENDENT, oldDependent, dependent));
			}
		}
		return dependent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeArray basicGetDependent() {
		return dependent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependent(AttributeArray newDependent) {
		AttributeArray oldDependent = dependent;
		dependent = newDependent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormValidationPackage.DEPEND_ON__DEPENDENT, oldDependent, dependent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormValidationPackage.DEPEND_ON__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FormValidationPackage.DEPEND_ON__INDEPENDENT:
				if (resolve) return getIndependent();
				return basicGetIndependent();
			case FormValidationPackage.DEPEND_ON__DEPENDENT:
				if (resolve) return getDependent();
				return basicGetDependent();
			case FormValidationPackage.DEPEND_ON__CONDITION:
				return getCondition();
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
			case FormValidationPackage.DEPEND_ON__INDEPENDENT:
				setIndependent((AttributeArray)newValue);
				return;
			case FormValidationPackage.DEPEND_ON__DEPENDENT:
				setDependent((AttributeArray)newValue);
				return;
			case FormValidationPackage.DEPEND_ON__CONDITION:
				setCondition((String)newValue);
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
			case FormValidationPackage.DEPEND_ON__INDEPENDENT:
				setIndependent((AttributeArray)null);
				return;
			case FormValidationPackage.DEPEND_ON__DEPENDENT:
				setDependent((AttributeArray)null);
				return;
			case FormValidationPackage.DEPEND_ON__CONDITION:
				setCondition(CONDITION_EDEFAULT);
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
			case FormValidationPackage.DEPEND_ON__INDEPENDENT:
				return independent != null;
			case FormValidationPackage.DEPEND_ON__DEPENDENT:
				return dependent != null;
			case FormValidationPackage.DEPEND_ON__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
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
		result.append(" (condition: ");
		result.append(condition);
		result.append(')');
		return result.toString();
	}

} //DependOnImpl
