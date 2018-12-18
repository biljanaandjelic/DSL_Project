/**
 */
package formValidation.impl;

import formValidation.BusinessModel;
import formValidation.FormValidationPackage;
import formValidation.ValidationClass;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link formValidation.impl.BusinessModelImpl#getValidationclasses <em>Validationclasses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusinessModelImpl extends MinimalEObjectImpl.Container implements BusinessModel {
	/**
	 * The cached value of the '{@link #getValidationclasses() <em>Validationclasses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationclasses()
	 * @generated
	 * @ordered
	 */
	protected EList<ValidationClass> validationclasses;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormValidationPackage.Literals.BUSINESS_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValidationClass> getValidationclasses() {
		if (validationclasses == null) {
			validationclasses = new EObjectContainmentEList<ValidationClass>(ValidationClass.class, this, FormValidationPackage.BUSINESS_MODEL__VALIDATIONCLASSES);
		}
		return validationclasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormValidationPackage.BUSINESS_MODEL__VALIDATIONCLASSES:
				return ((InternalEList<?>)getValidationclasses()).basicRemove(otherEnd, msgs);
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
			case FormValidationPackage.BUSINESS_MODEL__VALIDATIONCLASSES:
				return getValidationclasses();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FormValidationPackage.BUSINESS_MODEL__VALIDATIONCLASSES:
				getValidationclasses().clear();
				getValidationclasses().addAll((Collection<? extends ValidationClass>)newValue);
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
			case FormValidationPackage.BUSINESS_MODEL__VALIDATIONCLASSES:
				getValidationclasses().clear();
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
			case FormValidationPackage.BUSINESS_MODEL__VALIDATIONCLASSES:
				return validationclasses != null && !validationclasses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BusinessModelImpl
