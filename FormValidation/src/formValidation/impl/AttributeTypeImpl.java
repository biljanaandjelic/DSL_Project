/**
 */
package formValidation.impl;

import formValidation.AttributeDataType;
import formValidation.AttributeType;
import formValidation.FormValidationPackage;

import formValidation.UIComponent;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link formValidation.impl.AttributeTypeImpl#getUiComponent <em>Ui Component</em>}</li>
 *   <li>{@link formValidation.impl.AttributeTypeImpl#getAttributeDataType <em>Attribute Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeTypeImpl extends MinimalEObjectImpl.Container implements AttributeType {
	/**
	 * The cached value of the '{@link #getUiComponent() <em>Ui Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUiComponent()
	 * @generated
	 * @ordered
	 */
	protected UIComponent uiComponent;

	/**
	 * The cached value of the '{@link #getAttributeDataType() <em>Attribute Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeDataType()
	 * @generated
	 * @ordered
	 */
	protected AttributeDataType attributeDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormValidationPackage.Literals.ATTRIBUTE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIComponent getUiComponent() {
		return uiComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUiComponent(UIComponent newUiComponent, NotificationChain msgs) {
		UIComponent oldUiComponent = uiComponent;
		uiComponent = newUiComponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormValidationPackage.ATTRIBUTE_TYPE__UI_COMPONENT, oldUiComponent, newUiComponent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUiComponent(UIComponent newUiComponent) {
		if (newUiComponent != uiComponent) {
			NotificationChain msgs = null;
			if (uiComponent != null)
				msgs = ((InternalEObject)uiComponent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormValidationPackage.ATTRIBUTE_TYPE__UI_COMPONENT, null, msgs);
			if (newUiComponent != null)
				msgs = ((InternalEObject)newUiComponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormValidationPackage.ATTRIBUTE_TYPE__UI_COMPONENT, null, msgs);
			msgs = basicSetUiComponent(newUiComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormValidationPackage.ATTRIBUTE_TYPE__UI_COMPONENT, newUiComponent, newUiComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDataType getAttributeDataType() {
		return attributeDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributeDataType(AttributeDataType newAttributeDataType, NotificationChain msgs) {
		AttributeDataType oldAttributeDataType = attributeDataType;
		attributeDataType = newAttributeDataType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormValidationPackage.ATTRIBUTE_TYPE__ATTRIBUTE_DATA_TYPE, oldAttributeDataType, newAttributeDataType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeDataType(AttributeDataType newAttributeDataType) {
		if (newAttributeDataType != attributeDataType) {
			NotificationChain msgs = null;
			if (attributeDataType != null)
				msgs = ((InternalEObject)attributeDataType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormValidationPackage.ATTRIBUTE_TYPE__ATTRIBUTE_DATA_TYPE, null, msgs);
			if (newAttributeDataType != null)
				msgs = ((InternalEObject)newAttributeDataType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormValidationPackage.ATTRIBUTE_TYPE__ATTRIBUTE_DATA_TYPE, null, msgs);
			msgs = basicSetAttributeDataType(newAttributeDataType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormValidationPackage.ATTRIBUTE_TYPE__ATTRIBUTE_DATA_TYPE, newAttributeDataType, newAttributeDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormValidationPackage.ATTRIBUTE_TYPE__UI_COMPONENT:
				return basicSetUiComponent(null, msgs);
			case FormValidationPackage.ATTRIBUTE_TYPE__ATTRIBUTE_DATA_TYPE:
				return basicSetAttributeDataType(null, msgs);
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
			case FormValidationPackage.ATTRIBUTE_TYPE__UI_COMPONENT:
				return getUiComponent();
			case FormValidationPackage.ATTRIBUTE_TYPE__ATTRIBUTE_DATA_TYPE:
				return getAttributeDataType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FormValidationPackage.ATTRIBUTE_TYPE__UI_COMPONENT:
				setUiComponent((UIComponent)newValue);
				return;
			case FormValidationPackage.ATTRIBUTE_TYPE__ATTRIBUTE_DATA_TYPE:
				setAttributeDataType((AttributeDataType)newValue);
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
			case FormValidationPackage.ATTRIBUTE_TYPE__UI_COMPONENT:
				setUiComponent((UIComponent)null);
				return;
			case FormValidationPackage.ATTRIBUTE_TYPE__ATTRIBUTE_DATA_TYPE:
				setAttributeDataType((AttributeDataType)null);
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
			case FormValidationPackage.ATTRIBUTE_TYPE__UI_COMPONENT:
				return uiComponent != null;
			case FormValidationPackage.ATTRIBUTE_TYPE__ATTRIBUTE_DATA_TYPE:
				return attributeDataType != null;
		}
		return super.eIsSet(featureID);
	}

} //AttributeTypeImpl
