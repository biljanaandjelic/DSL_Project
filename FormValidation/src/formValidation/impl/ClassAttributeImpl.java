/**
 */
package formValidation.impl;

import formValidation.AttributeRule;
import formValidation.AttributeType;
import formValidation.ClassAttribute;
import formValidation.FormValidationPackage;
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
 *   <li>{@link formValidation.impl.ClassAttributeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link formValidation.impl.ClassAttributeImpl#isMaster <em>Master</em>}</li>
 *   <li>{@link formValidation.impl.ClassAttributeImpl#isIsClassRepresenting <em>Is Class Representing</em>}</li>
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
	 * The default value of the '{@link #isMaster() <em>Master</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaster()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MASTER_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isMaster() <em>Master</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaster()
	 * @generated
	 * @ordered
	 */
	protected boolean master = MASTER_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsClassRepresenting() <em>Is Class Representing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsClassRepresenting()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CLASS_REPRESENTING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsClassRepresenting() <em>Is Class Representing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsClassRepresenting()
	 * @generated
	 * @ordered
	 */
	protected boolean isClassRepresenting = IS_CLASS_REPRESENTING_EDEFAULT;

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
	public boolean isMaster() {
		return master;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaster(boolean newMaster) {
		boolean oldMaster = master;
		master = newMaster;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormValidationPackage.CLASS_ATTRIBUTE__MASTER, oldMaster, master));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsClassRepresenting() {
		return isClassRepresenting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsClassRepresenting(boolean newIsClassRepresenting) {
		boolean oldIsClassRepresenting = isClassRepresenting;
		isClassRepresenting = newIsClassRepresenting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormValidationPackage.CLASS_ATTRIBUTE__IS_CLASS_REPRESENTING, oldIsClassRepresenting, isClassRepresenting));
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
			case FormValidationPackage.CLASS_ATTRIBUTE__LABEL:
				return getLabel();
			case FormValidationPackage.CLASS_ATTRIBUTE__MASTER:
				return isMaster();
			case FormValidationPackage.CLASS_ATTRIBUTE__IS_CLASS_REPRESENTING:
				return isIsClassRepresenting();
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
			case FormValidationPackage.CLASS_ATTRIBUTE__LABEL:
				setLabel((String)newValue);
				return;
			case FormValidationPackage.CLASS_ATTRIBUTE__MASTER:
				setMaster((Boolean)newValue);
				return;
			case FormValidationPackage.CLASS_ATTRIBUTE__IS_CLASS_REPRESENTING:
				setIsClassRepresenting((Boolean)newValue);
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
			case FormValidationPackage.CLASS_ATTRIBUTE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case FormValidationPackage.CLASS_ATTRIBUTE__MASTER:
				setMaster(MASTER_EDEFAULT);
				return;
			case FormValidationPackage.CLASS_ATTRIBUTE__IS_CLASS_REPRESENTING:
				setIsClassRepresenting(IS_CLASS_REPRESENTING_EDEFAULT);
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
			case FormValidationPackage.CLASS_ATTRIBUTE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case FormValidationPackage.CLASS_ATTRIBUTE__MASTER:
				return master != MASTER_EDEFAULT;
			case FormValidationPackage.CLASS_ATTRIBUTE__IS_CLASS_REPRESENTING:
				return isClassRepresenting != IS_CLASS_REPRESENTING_EDEFAULT;
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
		result.append(", master: ");
		result.append(master);
		result.append(", isClassRepresenting: ");
		result.append(isClassRepresenting);
		result.append(')');
		return result.toString();
	}

} //ClassAttributeImpl
