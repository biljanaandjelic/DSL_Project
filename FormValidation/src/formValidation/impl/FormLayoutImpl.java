/**
 */
package formValidation.impl;

import formValidation.AttributeArray;
import formValidation.FormLayout;
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
 * An implementation of the model object '<em><b>Form Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link formValidation.impl.FormLayoutImpl#getAttributearray <em>Attributearray</em>}</li>
 *   <li>{@link formValidation.impl.FormLayoutImpl#getFormlayout <em>Formlayout</em>}</li>
 *   <li>{@link formValidation.impl.FormLayoutImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FormLayoutImpl extends MinimalEObjectImpl.Container implements FormLayout {
	/**
	 * The cached value of the '{@link #getAttributearray() <em>Attributearray</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributearray()
	 * @generated
	 * @ordered
	 */
	protected AttributeArray attributearray;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormLayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormValidationPackage.Literals.FORM_LAYOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeArray getAttributearray() {
		return attributearray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributearray(AttributeArray newAttributearray, NotificationChain msgs) {
		AttributeArray oldAttributearray = attributearray;
		attributearray = newAttributearray;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormValidationPackage.FORM_LAYOUT__ATTRIBUTEARRAY, oldAttributearray, newAttributearray);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributearray(AttributeArray newAttributearray) {
		if (newAttributearray != attributearray) {
			NotificationChain msgs = null;
			if (attributearray != null)
				msgs = ((InternalEObject)attributearray).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormValidationPackage.FORM_LAYOUT__ATTRIBUTEARRAY, null, msgs);
			if (newAttributearray != null)
				msgs = ((InternalEObject)newAttributearray).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormValidationPackage.FORM_LAYOUT__ATTRIBUTEARRAY, null, msgs);
			msgs = basicSetAttributearray(newAttributearray, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormValidationPackage.FORM_LAYOUT__ATTRIBUTEARRAY, newAttributearray, newAttributearray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FormLayout> getFormlayout() {
		if (formlayout == null) {
			formlayout = new EObjectContainmentEList<FormLayout>(FormLayout.class, this, FormValidationPackage.FORM_LAYOUT__FORMLAYOUT);
		}
		return formlayout;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormValidationPackage.FORM_LAYOUT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormValidationPackage.FORM_LAYOUT__ATTRIBUTEARRAY:
				return basicSetAttributearray(null, msgs);
			case FormValidationPackage.FORM_LAYOUT__FORMLAYOUT:
				return ((InternalEList<?>)getFormlayout()).basicRemove(otherEnd, msgs);
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
			case FormValidationPackage.FORM_LAYOUT__ATTRIBUTEARRAY:
				return getAttributearray();
			case FormValidationPackage.FORM_LAYOUT__FORMLAYOUT:
				return getFormlayout();
			case FormValidationPackage.FORM_LAYOUT__NAME:
				return getName();
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
			case FormValidationPackage.FORM_LAYOUT__ATTRIBUTEARRAY:
				setAttributearray((AttributeArray)newValue);
				return;
			case FormValidationPackage.FORM_LAYOUT__FORMLAYOUT:
				getFormlayout().clear();
				getFormlayout().addAll((Collection<? extends FormLayout>)newValue);
				return;
			case FormValidationPackage.FORM_LAYOUT__NAME:
				setName((String)newValue);
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
			case FormValidationPackage.FORM_LAYOUT__ATTRIBUTEARRAY:
				setAttributearray((AttributeArray)null);
				return;
			case FormValidationPackage.FORM_LAYOUT__FORMLAYOUT:
				getFormlayout().clear();
				return;
			case FormValidationPackage.FORM_LAYOUT__NAME:
				setName(NAME_EDEFAULT);
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
			case FormValidationPackage.FORM_LAYOUT__ATTRIBUTEARRAY:
				return attributearray != null;
			case FormValidationPackage.FORM_LAYOUT__FORMLAYOUT:
				return formlayout != null && !formlayout.isEmpty();
			case FormValidationPackage.FORM_LAYOUT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(')');
		return result.toString();
	}

} //FormLayoutImpl
