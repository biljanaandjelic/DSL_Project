/**
 */
package formValidation.impl;

import formValidation.AttributeArray;
import formValidation.ClassAttribute;
import formValidation.FormValidationPackage;
import formValidation.LessThan;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Less Than</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link formValidation.impl.LessThanImpl#getClassattribute <em>Classattribute</em>}</li>
 *   <li>{@link formValidation.impl.LessThanImpl#getAttributearray <em>Attributearray</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LessThanImpl extends ClassRuleImpl implements LessThan {
	/**
	 * The cached value of the '{@link #getClassattribute() <em>Classattribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassattribute()
	 * @generated
	 * @ordered
	 */
	protected ClassAttribute classattribute;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LessThanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormValidationPackage.Literals.LESS_THAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassAttribute getClassattribute() {
		if (classattribute != null && classattribute.eIsProxy()) {
			InternalEObject oldClassattribute = (InternalEObject)classattribute;
			classattribute = (ClassAttribute)eResolveProxy(oldClassattribute);
			if (classattribute != oldClassattribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormValidationPackage.LESS_THAN__CLASSATTRIBUTE, oldClassattribute, classattribute));
			}
		}
		return classattribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassAttribute basicGetClassattribute() {
		return classattribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassattribute(ClassAttribute newClassattribute) {
		ClassAttribute oldClassattribute = classattribute;
		classattribute = newClassattribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormValidationPackage.LESS_THAN__CLASSATTRIBUTE, oldClassattribute, classattribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeArray> getAttributearray() {
		if (attributearray == null) {
			attributearray = new EObjectContainmentEList<AttributeArray>(AttributeArray.class, this, FormValidationPackage.LESS_THAN__ATTRIBUTEARRAY);
		}
		return attributearray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormValidationPackage.LESS_THAN__ATTRIBUTEARRAY:
				return ((InternalEList<?>)getAttributearray()).basicRemove(otherEnd, msgs);
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
			case FormValidationPackage.LESS_THAN__CLASSATTRIBUTE:
				if (resolve) return getClassattribute();
				return basicGetClassattribute();
			case FormValidationPackage.LESS_THAN__ATTRIBUTEARRAY:
				return getAttributearray();
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
			case FormValidationPackage.LESS_THAN__CLASSATTRIBUTE:
				setClassattribute((ClassAttribute)newValue);
				return;
			case FormValidationPackage.LESS_THAN__ATTRIBUTEARRAY:
				getAttributearray().clear();
				getAttributearray().addAll((Collection<? extends AttributeArray>)newValue);
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
			case FormValidationPackage.LESS_THAN__CLASSATTRIBUTE:
				setClassattribute((ClassAttribute)null);
				return;
			case FormValidationPackage.LESS_THAN__ATTRIBUTEARRAY:
				getAttributearray().clear();
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
			case FormValidationPackage.LESS_THAN__CLASSATTRIBUTE:
				return classattribute != null;
			case FormValidationPackage.LESS_THAN__ATTRIBUTEARRAY:
				return attributearray != null && !attributearray.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LessThanImpl
