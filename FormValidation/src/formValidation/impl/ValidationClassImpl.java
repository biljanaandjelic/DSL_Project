/**
 */
package formValidation.impl;

import formValidation.ClassAttribute;
import formValidation.ClassRule;
import formValidation.FormValidationPackage;
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormValidationPackage.VALIDATION_CLASS__CLASSATTRIBUTE:
				return ((InternalEList<?>)getClassattribute()).basicRemove(otherEnd, msgs);
			case FormValidationPackage.VALIDATION_CLASS__CLASSRULE:
				return ((InternalEList<?>)getClassrule()).basicRemove(otherEnd, msgs);
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

} //ValidationClassImpl
