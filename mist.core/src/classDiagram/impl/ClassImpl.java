/**
 */
package classDiagram.impl;

import classDiagram.AccessModifier;
import classDiagram.Attribute;
import classDiagram.ClassDiagramPackage;
import classDiagram.Method;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link classDiagram.impl.ClassImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link classDiagram.impl.ClassImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link classDiagram.impl.ClassImpl#getSupertypes <em>Supertypes</em>}</li>
 *   <li>{@link classDiagram.impl.ClassImpl#getSubtypes <em>Subtypes</em>}</li>
 *   <li>{@link classDiagram.impl.ClassImpl#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link classDiagram.impl.ClassImpl#getAccessModifier <em>Access Modifier</em>}</li>
 *   <li>{@link classDiagram.impl.ClassImpl#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends ClassifierImpl implements classDiagram.Class {
	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> fields;

	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupertypes() <em>Supertypes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupertypes()
	 * @generated
	 * @ordered
	 */
	protected EList<classDiagram.Class> supertypes;

	/**
	 * The cached value of the '{@link #getSubtypes() <em>Subtypes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtypes()
	 * @generated
	 * @ordered
	 */
	protected EList<classDiagram.Class> subtypes;

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
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Method> methods;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<Attribute>(Attribute.class, this, ClassDiagramPackage.CLASS__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.CLASS__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<classDiagram.Class> getSupertypes() {
		if (supertypes == null) {
			supertypes = new EObjectWithInverseResolvingEList.ManyInverse<classDiagram.Class>(classDiagram.Class.class, this, ClassDiagramPackage.CLASS__SUPERTYPES, ClassDiagramPackage.CLASS__SUBTYPES);
		}
		return supertypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<classDiagram.Class> getSubtypes() {
		if (subtypes == null) {
			subtypes = new EObjectWithInverseResolvingEList.ManyInverse<classDiagram.Class>(classDiagram.Class.class, this, ClassDiagramPackage.CLASS__SUBTYPES, ClassDiagramPackage.CLASS__SUPERTYPES);
		}
		return subtypes;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.CLASS__IS_STATIC, oldIsStatic, isStatic));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.CLASS__ACCESS_MODIFIER, oldAccessModifier, accessModifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Method> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentEList<Method>(Method.class, this, ClassDiagramPackage.CLASS__METHODS);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClassDiagramPackage.CLASS__SUPERTYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSupertypes()).basicAdd(otherEnd, msgs);
			case ClassDiagramPackage.CLASS__SUBTYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubtypes()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClassDiagramPackage.CLASS__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
			case ClassDiagramPackage.CLASS__SUPERTYPES:
				return ((InternalEList<?>)getSupertypes()).basicRemove(otherEnd, msgs);
			case ClassDiagramPackage.CLASS__SUBTYPES:
				return ((InternalEList<?>)getSubtypes()).basicRemove(otherEnd, msgs);
			case ClassDiagramPackage.CLASS__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
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
			case ClassDiagramPackage.CLASS__FIELDS:
				return getFields();
			case ClassDiagramPackage.CLASS__IS_ABSTRACT:
				return isIsAbstract();
			case ClassDiagramPackage.CLASS__SUPERTYPES:
				return getSupertypes();
			case ClassDiagramPackage.CLASS__SUBTYPES:
				return getSubtypes();
			case ClassDiagramPackage.CLASS__IS_STATIC:
				return isIsStatic();
			case ClassDiagramPackage.CLASS__ACCESS_MODIFIER:
				return getAccessModifier();
			case ClassDiagramPackage.CLASS__METHODS:
				return getMethods();
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
			case ClassDiagramPackage.CLASS__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends Attribute>)newValue);
				return;
			case ClassDiagramPackage.CLASS__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case ClassDiagramPackage.CLASS__SUPERTYPES:
				getSupertypes().clear();
				getSupertypes().addAll((Collection<? extends classDiagram.Class>)newValue);
				return;
			case ClassDiagramPackage.CLASS__SUBTYPES:
				getSubtypes().clear();
				getSubtypes().addAll((Collection<? extends classDiagram.Class>)newValue);
				return;
			case ClassDiagramPackage.CLASS__IS_STATIC:
				setIsStatic((Boolean)newValue);
				return;
			case ClassDiagramPackage.CLASS__ACCESS_MODIFIER:
				setAccessModifier((AccessModifier)newValue);
				return;
			case ClassDiagramPackage.CLASS__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends Method>)newValue);
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
			case ClassDiagramPackage.CLASS__FIELDS:
				getFields().clear();
				return;
			case ClassDiagramPackage.CLASS__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case ClassDiagramPackage.CLASS__SUPERTYPES:
				getSupertypes().clear();
				return;
			case ClassDiagramPackage.CLASS__SUBTYPES:
				getSubtypes().clear();
				return;
			case ClassDiagramPackage.CLASS__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case ClassDiagramPackage.CLASS__ACCESS_MODIFIER:
				setAccessModifier(ACCESS_MODIFIER_EDEFAULT);
				return;
			case ClassDiagramPackage.CLASS__METHODS:
				getMethods().clear();
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
			case ClassDiagramPackage.CLASS__FIELDS:
				return fields != null && !fields.isEmpty();
			case ClassDiagramPackage.CLASS__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case ClassDiagramPackage.CLASS__SUPERTYPES:
				return supertypes != null && !supertypes.isEmpty();
			case ClassDiagramPackage.CLASS__SUBTYPES:
				return subtypes != null && !subtypes.isEmpty();
			case ClassDiagramPackage.CLASS__IS_STATIC:
				return isStatic != IS_STATIC_EDEFAULT;
			case ClassDiagramPackage.CLASS__ACCESS_MODIFIER:
				return accessModifier != ACCESS_MODIFIER_EDEFAULT;
			case ClassDiagramPackage.CLASS__METHODS:
				return methods != null && !methods.isEmpty();
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
		result.append(" (isAbstract: ");
		result.append(isAbstract);
		result.append(", isStatic: ");
		result.append(isStatic);
		result.append(", accessModifier: ");
		result.append(accessModifier);
		result.append(')');
		return result.toString();
	}

} //ClassImpl
