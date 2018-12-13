/**
 */
package formValidation.impl;

import formValidation.FormValidationPackage;
import formValidation.OverviewSettings;
import formValidation.TableOverview;

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
 * An implementation of the model object '<em><b>Overview Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link formValidation.impl.OverviewSettingsImpl#getTableoverview <em>Tableoverview</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OverviewSettingsImpl extends MinimalEObjectImpl.Container implements OverviewSettings {
	/**
	 * The cached value of the '{@link #getTableoverview() <em>Tableoverview</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableoverview()
	 * @generated
	 * @ordered
	 */
	protected EList<TableOverview> tableoverview;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OverviewSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormValidationPackage.Literals.OVERVIEW_SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableOverview> getTableoverview() {
		if (tableoverview == null) {
			tableoverview = new EObjectContainmentEList<TableOverview>(TableOverview.class, this, FormValidationPackage.OVERVIEW_SETTINGS__TABLEOVERVIEW);
		}
		return tableoverview;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormValidationPackage.OVERVIEW_SETTINGS__TABLEOVERVIEW:
				return ((InternalEList<?>)getTableoverview()).basicRemove(otherEnd, msgs);
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
			case FormValidationPackage.OVERVIEW_SETTINGS__TABLEOVERVIEW:
				return getTableoverview();
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
			case FormValidationPackage.OVERVIEW_SETTINGS__TABLEOVERVIEW:
				getTableoverview().clear();
				getTableoverview().addAll((Collection<? extends TableOverview>)newValue);
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
			case FormValidationPackage.OVERVIEW_SETTINGS__TABLEOVERVIEW:
				getTableoverview().clear();
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
			case FormValidationPackage.OVERVIEW_SETTINGS__TABLEOVERVIEW:
				return tableoverview != null && !tableoverview.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OverviewSettingsImpl
