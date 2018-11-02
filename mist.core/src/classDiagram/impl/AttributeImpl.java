/**
 */
package classDiagram.impl;

import classDiagram.AccessModifier;
import classDiagram.Attribute;
import classDiagram.ClassDiagramPackage;
import classDiagram.ElementType;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link classDiagram.impl.AttributeImpl#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link classDiagram.impl.AttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link classDiagram.impl.AttributeImpl#getAccessModifier <em>Access Modifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeImpl extends ModelingConceptImpl implements Attribute {
	/**
	 * The default value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStatic()
	 * @generated
	 * @ordered
	 */
	protected boolean isStatic = IS_STATIC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ElementType type;

	/**
	 * The default value of the '{@link #getAccessModifier() <em>Access Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessModifier()
	 * @generated
	 * @ordered
	 */
	protected static final AccessModifier ACCESS_MODIFIER_EDEFAULT = AccessModifier.DEFAULT;

	/**
	 * The cached value of the '{@link #getAccessModifier() <em>Access Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessModifier()
	 * @generated
	 * @ordered
	 */
	protected AccessModifier accessModifier = ACCESS_MODIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsStatic() {
		return isStatic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStatic(boolean newIsStatic) {
		boolean oldIsStatic = isStatic;
		isStatic = newIsStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.ATTRIBUTE__IS_STATIC, oldIsStatic, isStatic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(ElementType newType, NotificationChain msgs) {
		ElementType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.ATTRIBUTE__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ElementType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ClassDiagramPackage.ATTRIBUTE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ClassDiagramPackage.ATTRIBUTE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.ATTRIBUTE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessModifier getAccessModifier() {
		return accessModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessModifier(AccessModifier newAccessModifier) {
		AccessModifier oldAccessModifier = accessModifier;
		accessModifier = newAccessModifier == null ? ACCESS_MODIFIER_EDEFAULT : newAccessModifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.ATTRIBUTE__ACCESS_MODIFIER, oldAccessModifier, accessModifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClassDiagramPackage.ATTRIBUTE__TYPE:
				return basicSetType(null, msgs);
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
			case ClassDiagramPackage.ATTRIBUTE__IS_STATIC:
				return isIsStatic();
			case ClassDiagramPackage.ATTRIBUTE__TYPE:
				return getType();
			case ClassDiagramPackage.ATTRIBUTE__ACCESS_MODIFIER:
				return getAccessModifier();
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
			case ClassDiagramPackage.ATTRIBUTE__IS_STATIC:
				setIsStatic((Boolean)newValue);
				return;
			case ClassDiagramPackage.ATTRIBUTE__TYPE:
				setType((ElementType)newValue);
				return;
			case ClassDiagramPackage.ATTRIBUTE__ACCESS_MODIFIER:
				setAccessModifier((AccessModifier)newValue);
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
			case ClassDiagramPackage.ATTRIBUTE__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case ClassDiagramPackage.ATTRIBUTE__TYPE:
				setType((ElementType)null);
				return;
			case ClassDiagramPackage.ATTRIBUTE__ACCESS_MODIFIER:
				setAccessModifier(ACCESS_MODIFIER_EDEFAULT);
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
			case ClassDiagramPackage.ATTRIBUTE__IS_STATIC:
				return isStatic != IS_STATIC_EDEFAULT;
			case ClassDiagramPackage.ATTRIBUTE__TYPE:
				return type != null;
			case ClassDiagramPackage.ATTRIBUTE__ACCESS_MODIFIER:
				return accessModifier != ACCESS_MODIFIER_EDEFAULT;
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
		result.append(" (isStatic: ");
		result.append(isStatic);
		result.append(", accessModifier: ");
		result.append(accessModifier);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
