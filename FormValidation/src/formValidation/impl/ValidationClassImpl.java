/**
 */
package formValidation.impl;

import formValidation.AdditionalSettings;
import formValidation.ClassAttribute;
import formValidation.ClassRule;
import formValidation.FormLayout;
import formValidation.FormValidationPackage;
import formValidation.OverviewSettings;
import formValidation.ValidationClass;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Validation Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link formValidation.impl.ValidationClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link formValidation.impl.ValidationClassImpl#getClassattribute <em>Classattribute</em>}</li>
 *   <li>{@link formValidation.impl.ValidationClassImpl#getClassrule <em>Classrule</em>}</li>
 *   <li>{@link formValidation.impl.ValidationClassImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link formValidation.impl.ValidationClassImpl#getFormlayout <em>Formlayout</em>}</li>
 *   <li>{@link formValidation.impl.ValidationClassImpl#getAdditionalSettings <em>Additional Settings</em>}</li>
 *   <li>{@link formValidation.impl.ValidationClassImpl#getOverviewsettings <em>Overviewsettings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValidationClassImpl extends MinimalEObjectImpl.Container implements ValidationClass {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClassattribute() <em>Classattribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassattribute()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassAttribute> classattribute;

	/**
	 * The cached value of the '{@link #getClassrule() <em>Classrule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassrule()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassRule> classrule;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFormlayout() <em>Formlayout</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormlayout()
	 * @generated
	 * @ordered
	 */
	protected EList<FormLayout> formlayout;

	/**
	 * The cached value of the '{@link #getAdditionalSettings() <em>Additional Settings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalSettings()
	 * @generated
	 * @ordered
	 */
	protected EList<AdditionalSettings> additionalSettings;

	/**
	 * The cached value of the '{@link #getOverviewsettings() <em>Overviewsettings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverviewsettings()
	 * @generated
	 * @ordered
	 */
	protected EList<OverviewSettings> overviewsettings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidationClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormValidationPackage.Literals.VALIDATION_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormValidationPackage.VALIDATION_CLASS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassAttribute> getClassattribute() {
		if (classattribute == null) {
			classattribute = new EObjectContainmentEList<ClassAttribute>(ClassAttribute.class, this, FormValidationPackage.VALIDATION_CLASS__CLASSATTRIBUTE);
		}
		return classattribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassRule> getClassrule() {
		if (classrule == null) {
			classrule = new EObjectContainmentEList<ClassRule>(ClassRule.class, this, FormValidationPackage.VALIDATION_CLASS__CLASSRULE);
		}
		return classrule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormValidationPackage.VALIDATION_CLASS__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FormLayout> getFormlayout() {
		if (formlayout == null) {
			formlayout = new EObjectContainmentEList<FormLayout>(FormLayout.class, this, FormValidationPackage.VALIDATION_CLASS__FORMLAYOUT);
		}
		return formlayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdditionalSettings> getAdditionalSettings() {
		if (additionalSettings == null) {
			additionalSettings = new EObjectContainmentEList<AdditionalSettings>(AdditionalSettings.class, this, FormValidationPackage.VALIDATION_CLASS__ADDITIONAL_SETTINGS);
		}
		return additionalSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OverviewSettings> getOverviewsettings() {
		if (overviewsettings == null) {
			overviewsettings = new EObjectContainmentEList<OverviewSettings>(OverviewSettings.class, this, FormValidationPackage.VALIDATION_CLASS__OVERVIEWSETTINGS);
		}
		return overviewsettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormValidationPackage.VALIDATION_CLASS__CLASSATTRIBUTE:
				return ((InternalEList<?>)getClassattribute()).basicRemove(otherEnd, msgs);
			case FormValidationPackage.VALIDATION_CLASS__CLASSRULE:
				return ((InternalEList<?>)getClassrule()).basicRemove(otherEnd, msgs);
			case FormValidationPackage.VALIDATION_CLASS__FORMLAYOUT:
				return ((InternalEList<?>)getFormlayout()).basicRemove(otherEnd, msgs);
			case FormValidationPackage.VALIDATION_CLASS__ADDITIONAL_SETTINGS:
				return ((InternalEList<?>)getAdditionalSettings()).basicRemove(otherEnd, msgs);
			case FormValidationPackage.VALIDATION_CLASS__OVERVIEWSETTINGS:
				return ((InternalEList<?>)getOverviewsettings()).basicRemove(otherEnd, msgs);
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
			case FormValidationPackage.VALIDATION_CLASS__NAME:
				return getName();
			case FormValidationPackage.VALIDATION_CLASS__CLASSATTRIBUTE:
				return getClassattribute();
			case FormValidationPackage.VALIDATION_CLASS__CLASSRULE:
				return getClassrule();
			case FormValidationPackage.VALIDATION_CLASS__LABEL:
				return getLabel();
			case FormValidationPackage.VALIDATION_CLASS__FORMLAYOUT:
				return getFormlayout();
			case FormValidationPackage.VALIDATION_CLASS__ADDITIONAL_SETTINGS:
				return getAdditionalSettings();
			case FormValidationPackage.VALIDATION_CLASS__OVERVIEWSETTINGS:
				return getOverviewsettings();
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
			case FormValidationPackage.VALIDATION_CLASS__NAME:
				setName((String)newValue);
				return;
			case FormValidationPackage.VALIDATION_CLASS__CLASSATTRIBUTE:
				getClassattribute().clear();
				getClassattribute().addAll((Collection<? extends ClassAttribute>)newValue);
				return;
			case FormValidationPackage.VALIDATION_CLASS__CLASSRULE:
				getClassrule().clear();
				getClassrule().addAll((Collection<? extends ClassRule>)newValue);
				return;
			case FormValidationPackage.VALIDATION_CLASS__LABEL:
				setLabel((String)newValue);
				return;
			case FormValidationPackage.VALIDATION_CLASS__FORMLAYOUT:
				getFormlayout().clear();
				getFormlayout().addAll((Collection<? extends FormLayout>)newValue);
				return;
			case FormValidationPackage.VALIDATION_CLASS__ADDITIONAL_SETTINGS:
				getAdditionalSettings().clear();
				getAdditionalSettings().addAll((Collection<? extends AdditionalSettings>)newValue);
				return;
			case FormValidationPackage.VALIDATION_CLASS__OVERVIEWSETTINGS:
				getOverviewsettings().clear();
				getOverviewsettings().addAll((Collection<? extends OverviewSettings>)newValue);
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
			case FormValidationPackage.VALIDATION_CLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FormValidationPackage.VALIDATION_CLASS__CLASSATTRIBUTE:
				getClassattribute().clear();
				return;
			case FormValidationPackage.VALIDATION_CLASS__CLASSRULE:
				getClassrule().clear();
				return;
			case FormValidationPackage.VALIDATION_CLASS__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case FormValidationPackage.VALIDATION_CLASS__FORMLAYOUT:
				getFormlayout().clear();
				return;
			case FormValidationPackage.VALIDATION_CLASS__ADDITIONAL_SETTINGS:
				getAdditionalSettings().clear();
				return;
			case FormValidationPackage.VALIDATION_CLASS__OVERVIEWSETTINGS:
				getOverviewsettings().clear();
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
			case FormValidationPackage.VALIDATION_CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FormValidationPackage.VALIDATION_CLASS__CLASSATTRIBUTE:
				return classattribute != null && !classattribute.isEmpty();
			case FormValidationPackage.VALIDATION_CLASS__CLASSRULE:
				return classrule != null && !classrule.isEmpty();
			case FormValidationPackage.VALIDATION_CLASS__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case FormValidationPackage.VALIDATION_CLASS__FORMLAYOUT:
				return formlayout != null && !formlayout.isEmpty();
			case FormValidationPackage.VALIDATION_CLASS__ADDITIONAL_SETTINGS:
				return additionalSettings != null && !additionalSettings.isEmpty();
			case FormValidationPackage.VALIDATION_CLASS__OVERVIEWSETTINGS:
				return overviewsettings != null && !overviewsettings.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //ValidationClassImpl
