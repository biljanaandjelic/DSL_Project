/**
 */
package formValidation.impl;

import formValidation.AdditionalSettings;
import formValidation.Attribute;
import formValidation.ClassRule;
import formValidation.Entity;
import formValidation.FormLayout;
import formValidation.FormValidationPackage;
import formValidation.OverviewSettings;

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
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link formValidation.impl.EntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link formValidation.impl.EntityImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link formValidation.impl.EntityImpl#getClassrule <em>Classrule</em>}</li>
 *   <li>{@link formValidation.impl.EntityImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link formValidation.impl.EntityImpl#getFormlayout <em>Formlayout</em>}</li>
 *   <li>{@link formValidation.impl.EntityImpl#getAdditionalSettings <em>Additional Settings</em>}</li>
 *   <li>{@link formValidation.impl.EntityImpl#getOverviewsettings <em>Overviewsettings</em>}</li>
 *   <li>{@link formValidation.impl.EntityImpl#getAttr <em>Attr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends MinimalEObjectImpl.Container implements Entity {
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
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

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
	 * The cached value of the '{@link #getOverviewsettings() <em>Overviewsettings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverviewsettings()
	 * @generated
	 * @ordered
	 */
	protected OverviewSettings overviewsettings;

	/**
	 * The default value of the '{@link #getAttr() <em>Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttr()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttr() <em>Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttr()
	 * @generated
	 * @ordered
	 */
	protected String attr = ATTR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormValidationPackage.Literals.ENTITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormValidationPackage.ENTITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, FormValidationPackage.ENTITY__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassRule> getClassrule() {
		if (classrule == null) {
			classrule = new EObjectContainmentEList<ClassRule>(ClassRule.class, this, FormValidationPackage.ENTITY__CLASSRULE);
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormValidationPackage.ENTITY__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FormLayout> getFormlayout() {
		if (formlayout == null) {
			formlayout = new EObjectContainmentEList<FormLayout>(FormLayout.class, this, FormValidationPackage.ENTITY__FORMLAYOUT);
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
			additionalSettings = new EObjectContainmentEList<AdditionalSettings>(AdditionalSettings.class, this, FormValidationPackage.ENTITY__ADDITIONAL_SETTINGS);
		}
		return additionalSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverviewSettings getOverviewsettings() {
		return overviewsettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOverviewsettings(OverviewSettings newOverviewsettings, NotificationChain msgs) {
		OverviewSettings oldOverviewsettings = overviewsettings;
		overviewsettings = newOverviewsettings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormValidationPackage.ENTITY__OVERVIEWSETTINGS, oldOverviewsettings, newOverviewsettings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverviewsettings(OverviewSettings newOverviewsettings) {
		if (newOverviewsettings != overviewsettings) {
			NotificationChain msgs = null;
			if (overviewsettings != null)
				msgs = ((InternalEObject)overviewsettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormValidationPackage.ENTITY__OVERVIEWSETTINGS, null, msgs);
			if (newOverviewsettings != null)
				msgs = ((InternalEObject)newOverviewsettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormValidationPackage.ENTITY__OVERVIEWSETTINGS, null, msgs);
			msgs = basicSetOverviewsettings(newOverviewsettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormValidationPackage.ENTITY__OVERVIEWSETTINGS, newOverviewsettings, newOverviewsettings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttr() {
		return attr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttr(String newAttr) {
		String oldAttr = attr;
		attr = newAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormValidationPackage.ENTITY__ATTR, oldAttr, attr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormValidationPackage.ENTITY__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case FormValidationPackage.ENTITY__CLASSRULE:
				return ((InternalEList<?>)getClassrule()).basicRemove(otherEnd, msgs);
			case FormValidationPackage.ENTITY__FORMLAYOUT:
				return ((InternalEList<?>)getFormlayout()).basicRemove(otherEnd, msgs);
			case FormValidationPackage.ENTITY__ADDITIONAL_SETTINGS:
				return ((InternalEList<?>)getAdditionalSettings()).basicRemove(otherEnd, msgs);
			case FormValidationPackage.ENTITY__OVERVIEWSETTINGS:
				return basicSetOverviewsettings(null, msgs);
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
			case FormValidationPackage.ENTITY__NAME:
				return getName();
			case FormValidationPackage.ENTITY__ATTRIBUTES:
				return getAttributes();
			case FormValidationPackage.ENTITY__CLASSRULE:
				return getClassrule();
			case FormValidationPackage.ENTITY__LABEL:
				return getLabel();
			case FormValidationPackage.ENTITY__FORMLAYOUT:
				return getFormlayout();
			case FormValidationPackage.ENTITY__ADDITIONAL_SETTINGS:
				return getAdditionalSettings();
			case FormValidationPackage.ENTITY__OVERVIEWSETTINGS:
				return getOverviewsettings();
			case FormValidationPackage.ENTITY__ATTR:
				return getAttr();
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
			case FormValidationPackage.ENTITY__NAME:
				setName((String)newValue);
				return;
			case FormValidationPackage.ENTITY__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case FormValidationPackage.ENTITY__CLASSRULE:
				getClassrule().clear();
				getClassrule().addAll((Collection<? extends ClassRule>)newValue);
				return;
			case FormValidationPackage.ENTITY__LABEL:
				setLabel((String)newValue);
				return;
			case FormValidationPackage.ENTITY__FORMLAYOUT:
				getFormlayout().clear();
				getFormlayout().addAll((Collection<? extends FormLayout>)newValue);
				return;
			case FormValidationPackage.ENTITY__ADDITIONAL_SETTINGS:
				getAdditionalSettings().clear();
				getAdditionalSettings().addAll((Collection<? extends AdditionalSettings>)newValue);
				return;
			case FormValidationPackage.ENTITY__OVERVIEWSETTINGS:
				setOverviewsettings((OverviewSettings)newValue);
				return;
			case FormValidationPackage.ENTITY__ATTR:
				setAttr((String)newValue);
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
			case FormValidationPackage.ENTITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FormValidationPackage.ENTITY__ATTRIBUTES:
				getAttributes().clear();
				return;
			case FormValidationPackage.ENTITY__CLASSRULE:
				getClassrule().clear();
				return;
			case FormValidationPackage.ENTITY__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case FormValidationPackage.ENTITY__FORMLAYOUT:
				getFormlayout().clear();
				return;
			case FormValidationPackage.ENTITY__ADDITIONAL_SETTINGS:
				getAdditionalSettings().clear();
				return;
			case FormValidationPackage.ENTITY__OVERVIEWSETTINGS:
				setOverviewsettings((OverviewSettings)null);
				return;
			case FormValidationPackage.ENTITY__ATTR:
				setAttr(ATTR_EDEFAULT);
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
			case FormValidationPackage.ENTITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FormValidationPackage.ENTITY__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case FormValidationPackage.ENTITY__CLASSRULE:
				return classrule != null && !classrule.isEmpty();
			case FormValidationPackage.ENTITY__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case FormValidationPackage.ENTITY__FORMLAYOUT:
				return formlayout != null && !formlayout.isEmpty();
			case FormValidationPackage.ENTITY__ADDITIONAL_SETTINGS:
				return additionalSettings != null && !additionalSettings.isEmpty();
			case FormValidationPackage.ENTITY__OVERVIEWSETTINGS:
				return overviewsettings != null;
			case FormValidationPackage.ENTITY__ATTR:
				return ATTR_EDEFAULT == null ? attr != null : !ATTR_EDEFAULT.equals(attr);
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
		result.append(", attr: ");
		result.append(attr);
		result.append(')');
		return result.toString();
	}

} //EntityImpl
