/**
 */
package formValidation.impl;

import formValidation.AttributeRule;
import formValidation.AttributeType;
import formValidation.ClassAttribute;
import formValidation.FormValidationPackage;

import formValidation.UIComponent;
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
 * An implementation of the model object '<em><b>Class Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link formValidation.impl.ClassAttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link formValidation.impl.ClassAttributeImpl#getAttributetype <em>Attributetype</em>}</li>
 *   <li>{@link formValidation.impl.ClassAttributeImpl#getAttributerule <em>Attributerule</em>}</li>
 *   <li>{@link formValidation.impl.ClassAttributeImpl#getUicomponent <em>Uicomponent</em>}</li>
 *   <li>{@link formValidation.impl.ClassAttributeImpl#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassAttributeImpl extends MinimalEObjectImpl.Container implements ClassAttribute {
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
	 * The cached value of the '{@link #getAttributetype() <em>Attributetype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributetype()
	 * @generated
	 * @ordered
	 */
	protected AttributeType attributetype;

	/**
	 * The cached value of the '{@link #getAttributerule() <em>Attributerule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributerule()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeRule> attributerule;

	/**
	 * The cached value of the '{@link #getUicomponent() <em>Uicomponent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUicomponent()
	 * @generated
	 * @ordered
	 */
	protected UIComponent uicomponent;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormValidationPackage.Literals.CLASS_ATTRIBUTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormValidationPackage.CLASS_ATTRIBUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeType getAttributetype() {
		return attributetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributetype(AttributeType newAttributetype, NotificationChain msgs) {
		AttributeType oldAttributetype = attributetype;
		attributetype = newAttributetype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormValidationPackage.CLASS_ATTRIBUTE__ATTRIBUTETYPE, oldAttributetype, newAttributetype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributetype(AttributeType newAttributetype) {
		if (newAttributetype != attributetype) {
			NotificationChain msgs = null;
			if (attributetype != null)
				msgs = ((InternalEObject)attributetype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormValidationPackage.CLASS_ATTRIBUTE__ATTRIBUTETYPE, null, msgs);
			if (newAttributetype != null)
				msgs = ((InternalEObject)newAttributetype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormValidationPackage.CLASS_ATTRIBUTE__ATTRIBUTETYPE, null, msgs);
			msgs = basicSetAttributetype(newAttributetype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormValidationPackage.CLASS_ATTRIBUTE__ATTRIBUTETYPE, newAttributetype, newAttributetype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeRule> getAttributerule() {
		if (attributerule == null) {
			attributerule = new EObjectContainmentEList<AttributeRule>(AttributeRule.class, this, FormValidationPackage.CLASS_ATTRIBUTE__ATTRIBUTERULE);
		}
		return attributerule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIComponent getUicomponent() {
		return uicomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUicomponent(UIComponent newUicomponent, NotificationChain msgs) {
		UIComponent oldUicomponent = uicomponent;
		uicomponent = newUicomponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormValidationPackage.CLASS_ATTRIBUTE__UICOMPONENT, oldUicomponent, newUicomponent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUicomponent(UIComponent newUicomponent) {
		if (newUicomponent != uicomponent) {
			NotificationChain msgs = null;
			if (uicomponent != null)
				msgs = ((InternalEObject)uicomponent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormValidationPackage.CLASS_ATTRIBUTE__UICOMPONENT, null, msgs);
			if (newUicomponent != null)
				msgs = ((InternalEObject)newUicomponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormValidationPackage.CLASS_ATTRIBUTE__UICOMPONENT, null, msgs);
			msgs = basicSetUicomponent(newUicomponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormValidationPackage.CLASS_ATTRIBUTE__UICOMPONENT, newUicomponent, newUicomponent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormValidationPackage.CLASS_ATTRIBUTE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormValidationPackage.CLASS_ATTRIBUTE__ATTRIBUTETYPE:
				return basicSetAttributetype(null, msgs);
			case FormValidationPackage.CLASS_ATTRIBUTE__ATTRIBUTERULE:
				return ((InternalEList<?>)getAttributerule()).basicRemove(otherEnd, msgs);
			case FormValidationPackage.CLASS_ATTRIBUTE__UICOMPONENT:
				return basicSetUicomponent(null, msgs);
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
			case FormValidationPackage.CLASS_ATTRIBUTE__NAME:
				return getName();
			case FormValidationPackage.CLASS_ATTRIBUTE__ATTRIBUTETYPE:
				return getAttributetype();
			case FormValidationPackage.CLASS_ATTRIBUTE__ATTRIBUTERULE:
				return getAttributerule();
			case FormValidationPackage.CLASS_ATTRIBUTE__UICOMPONENT:
				return getUicomponent();
			case FormValidationPackage.CLASS_ATTRIBUTE__LABEL:
				return getLabel();
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
			case FormValidationPackage.CLASS_ATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case FormValidationPackage.CLASS_ATTRIBUTE__ATTRIBUTETYPE:
				setAttributetype((AttributeType)newValue);
				return;
			case FormValidationPackage.CLASS_ATTRIBUTE__ATTRIBUTERULE:
				getAttributerule().clear();
				getAttributerule().addAll((Collection<? extends AttributeRule>)newValue);
				return;
			case FormValidationPackage.CLASS_ATTRIBUTE__UICOMPONENT:
				setUicomponent((UIComponent)newValue);
				return;
			case FormValidationPackage.CLASS_ATTRIBUTE__LABEL:
				setLabel((String)newValue);
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
			case FormValidationPackage.CLASS_ATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FormValidationPackage.CLASS_ATTRIBUTE__ATTRIBUTETYPE:
				setAttributetype((AttributeType)null);
				return;
			case FormValidationPackage.CLASS_ATTRIBUTE__ATTRIBUTERULE:
				getAttributerule().clear();
				return;
			case FormValidationPackage.CLASS_ATTRIBUTE__UICOMPONENT:
				setUicomponent((UIComponent)null);
				return;
			case FormValidationPackage.CLASS_ATTRIBUTE__LABEL:
				setLabel(LABEL_EDEFAULT);
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
			case FormValidationPackage.CLASS_ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FormValidationPackage.CLASS_ATTRIBUTE__ATTRIBUTETYPE:
				return attributetype != null;
			case FormValidationPackage.CLASS_ATTRIBUTE__ATTRIBUTERULE:
				return attributerule != null && !attributerule.isEmpty();
			case FormValidationPackage.CLASS_ATTRIBUTE__UICOMPONENT:
				return uicomponent != null;
			case FormValidationPackage.CLASS_ATTRIBUTE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
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

} //ClassAttributeImpl
