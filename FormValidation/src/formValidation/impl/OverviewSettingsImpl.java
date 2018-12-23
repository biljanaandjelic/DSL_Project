/**
 */
package formValidation.impl;

import formValidation.FormValidationPackage;
import formValidation.OverviewSettings;
import formValidation.TableOverview;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
	 * The cached value of the '{@link #getTableoverview() <em>Tableoverview</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableoverview()
	 * @generated
	 * @ordered
	 */
	protected TableOverview tableoverview;

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
	public TableOverview getTableoverview() {
		return tableoverview;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableoverview(TableOverview newTableoverview, NotificationChain msgs) {
		TableOverview oldTableoverview = tableoverview;
		tableoverview = newTableoverview;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormValidationPackage.OVERVIEW_SETTINGS__TABLEOVERVIEW, oldTableoverview, newTableoverview);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableoverview(TableOverview newTableoverview) {
		if (newTableoverview != tableoverview) {
			NotificationChain msgs = null;
			if (tableoverview != null)
				msgs = ((InternalEObject)tableoverview).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormValidationPackage.OVERVIEW_SETTINGS__TABLEOVERVIEW, null, msgs);
			if (newTableoverview != null)
				msgs = ((InternalEObject)newTableoverview).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormValidationPackage.OVERVIEW_SETTINGS__TABLEOVERVIEW, null, msgs);
			msgs = basicSetTableoverview(newTableoverview, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormValidationPackage.OVERVIEW_SETTINGS__TABLEOVERVIEW, newTableoverview, newTableoverview));
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
				return basicSetTableoverview(null, msgs);
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
				setTableoverview((TableOverview)newValue);
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
				setTableoverview((TableOverview)null);
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
				return tableoverview != null;
		}
		return super.eIsSet(featureID);
	}

} //OverviewSettingsImpl
