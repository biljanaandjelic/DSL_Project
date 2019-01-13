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
 *   <li>{@link formValidation.impl.FormLayoutImpl#getLayouts <em>Layouts</em>}</li>
 *   <li>{@link formValidation.impl.FormLayoutImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FormLayoutImpl extends MinimalEObjectImpl.Container implements FormLayout {
	/**
	 * The cached value of the '{@link #getAttributearray() <em>Attributearray</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributearray()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeArray> attributearray;
	/**
	 * The cached value of the '{@link #getLayouts() <em>Layouts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayouts()
	 * @generated
	 * @ordered
	 */
	protected EList<FormLayout> layouts;
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
	public EList<AttributeArray> getAttributearray() {
		if (attributearray == null) {
			attributearray = new EObjectContainmentEList<AttributeArray>(AttributeArray.class, this, FormValidationPackage.FORM_LAYOUT__ATTRIBUTEARRAY);
		}
		return attributearray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FormLayout> getLayouts() {
		if (layouts == null) {
			layouts = new EObjectContainmentEList<FormLayout>(FormLayout.class, this, FormValidationPackage.FORM_LAYOUT__LAYOUTS);
		}
		return layouts;
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
				return ((InternalEList<?>)getAttributearray()).basicRemove(otherEnd, msgs);
			case FormValidationPackage.FORM_LAYOUT__LAYOUTS:
				return ((InternalEList<?>)getLayouts()).basicRemove(otherEnd, msgs);
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
			case FormValidationPackage.FORM_LAYOUT__LAYOUTS:
				return getLayouts();
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
				getAttributearray().clear();
				getAttributearray().addAll((Collection<? extends AttributeArray>)newValue);
				return;
			case FormValidationPackage.FORM_LAYOUT__LAYOUTS:
				getLayouts().clear();
				getLayouts().addAll((Collection<? extends FormLayout>)newValue);
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
				getAttributearray().clear();
				return;
			case FormValidationPackage.FORM_LAYOUT__LAYOUTS:
				getLayouts().clear();
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
				return attributearray != null && !attributearray.isEmpty();
			case FormValidationPackage.FORM_LAYOUT__LAYOUTS:
				return layouts != null && !layouts.isEmpty();
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
