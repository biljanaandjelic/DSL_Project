/**
 */
package formValidation.impl;

import formValidation.Attribute;
import formValidation.AttributeArray;
import formValidation.FormValidationPackage;
import formValidation.GreaterThan;

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
 * An implementation of the model object '<em><b>Greater Than</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link formValidation.impl.GreaterThanImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link formValidation.impl.GreaterThanImpl#getAttributearray <em>Attributearray</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GreaterThanImpl extends ClassRuleImpl implements GreaterThan {
	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute attribute;

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
	protected GreaterThanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormValidationPackage.Literals.GREATER_THAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getAttribute() {
		if (attribute != null && attribute.eIsProxy()) {
			InternalEObject oldAttribute = (InternalEObject)attribute;
			attribute = (Attribute)eResolveProxy(oldAttribute);
			if (attribute != oldAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormValidationPackage.GREATER_THAN__ATTRIBUTE, oldAttribute, attribute));
			}
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(Attribute newAttribute) {
		Attribute oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormValidationPackage.GREATER_THAN__ATTRIBUTE, oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeArray> getAttributearray() {
		if (attributearray == null) {
			attributearray = new EObjectContainmentEList<AttributeArray>(AttributeArray.class, this, FormValidationPackage.GREATER_THAN__ATTRIBUTEARRAY);
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
			case FormValidationPackage.GREATER_THAN__ATTRIBUTEARRAY:
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
			case FormValidationPackage.GREATER_THAN__ATTRIBUTE:
				if (resolve) return getAttribute();
				return basicGetAttribute();
			case FormValidationPackage.GREATER_THAN__ATTRIBUTEARRAY:
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
			case FormValidationPackage.GREATER_THAN__ATTRIBUTE:
				setAttribute((Attribute)newValue);
				return;
			case FormValidationPackage.GREATER_THAN__ATTRIBUTEARRAY:
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
			case FormValidationPackage.GREATER_THAN__ATTRIBUTE:
				setAttribute((Attribute)null);
				return;
			case FormValidationPackage.GREATER_THAN__ATTRIBUTEARRAY:
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
			case FormValidationPackage.GREATER_THAN__ATTRIBUTE:
				return attribute != null;
			case FormValidationPackage.GREATER_THAN__ATTRIBUTEARRAY:
				return attributearray != null && !attributearray.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GreaterThanImpl
