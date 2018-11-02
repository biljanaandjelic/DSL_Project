/**
 */
package er.impl;

import er.Attribute;
import er.Entity;
import er.ErPackage;
import er.ISA;
import er.RegularEntity;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ISA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link er.impl.ISAImpl#getSupertype <em>Supertype</em>}</li>
 *   <li>{@link er.impl.ISAImpl#getSubtypes <em>Subtypes</em>}</li>
 *   <li>{@link er.impl.ISAImpl#getClassificationAttribute <em>Classification Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ISAImpl extends RelationshipConceptImpl implements ISA {
	/**
	 * The cached value of the '{@link #getSupertype() <em>Supertype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupertype()
	 * @generated
	 * @ordered
	 */
	protected RegularEntity supertype;

	/**
	 * The cached value of the '{@link #getSubtypes() <em>Subtypes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> subtypes;

	/**
	 * The cached value of the '{@link #getClassificationAttribute() <em>Classification Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute classificationAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErPackage.Literals.ISA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularEntity getSupertype() {
		return supertype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupertype(RegularEntity newSupertype, NotificationChain msgs) {
		RegularEntity oldSupertype = supertype;
		supertype = newSupertype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErPackage.ISA__SUPERTYPE, oldSupertype, newSupertype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupertype(RegularEntity newSupertype) {
		if (newSupertype != supertype) {
			NotificationChain msgs = null;
			if (supertype != null)
				msgs = ((InternalEObject)supertype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErPackage.ISA__SUPERTYPE, null, msgs);
			if (newSupertype != null)
				msgs = ((InternalEObject)newSupertype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErPackage.ISA__SUPERTYPE, null, msgs);
			msgs = basicSetSupertype(newSupertype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErPackage.ISA__SUPERTYPE, newSupertype, newSupertype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getSubtypes() {
		if (subtypes == null) {
			subtypes = new EObjectResolvingEList<Entity>(Entity.class, this, ErPackage.ISA__SUBTYPES);
		}
		return subtypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getClassificationAttribute() {
		if (classificationAttribute != null && classificationAttribute.eIsProxy()) {
			InternalEObject oldClassificationAttribute = (InternalEObject)classificationAttribute;
			classificationAttribute = (Attribute)eResolveProxy(oldClassificationAttribute);
			if (classificationAttribute != oldClassificationAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErPackage.ISA__CLASSIFICATION_ATTRIBUTE, oldClassificationAttribute, classificationAttribute));
			}
		}
		return classificationAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetClassificationAttribute() {
		return classificationAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassificationAttribute(Attribute newClassificationAttribute) {
		Attribute oldClassificationAttribute = classificationAttribute;
		classificationAttribute = newClassificationAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErPackage.ISA__CLASSIFICATION_ATTRIBUTE, oldClassificationAttribute, classificationAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErPackage.ISA__SUPERTYPE:
				return basicSetSupertype(null, msgs);
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
			case ErPackage.ISA__SUPERTYPE:
				return getSupertype();
			case ErPackage.ISA__SUBTYPES:
				return getSubtypes();
			case ErPackage.ISA__CLASSIFICATION_ATTRIBUTE:
				if (resolve) return getClassificationAttribute();
				return basicGetClassificationAttribute();
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
			case ErPackage.ISA__SUPERTYPE:
				setSupertype((RegularEntity)newValue);
				return;
			case ErPackage.ISA__SUBTYPES:
				getSubtypes().clear();
				getSubtypes().addAll((Collection<? extends Entity>)newValue);
				return;
			case ErPackage.ISA__CLASSIFICATION_ATTRIBUTE:
				setClassificationAttribute((Attribute)newValue);
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
			case ErPackage.ISA__SUPERTYPE:
				setSupertype((RegularEntity)null);
				return;
			case ErPackage.ISA__SUBTYPES:
				getSubtypes().clear();
				return;
			case ErPackage.ISA__CLASSIFICATION_ATTRIBUTE:
				setClassificationAttribute((Attribute)null);
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
			case ErPackage.ISA__SUPERTYPE:
				return supertype != null;
			case ErPackage.ISA__SUBTYPES:
				return subtypes != null && !subtypes.isEmpty();
			case ErPackage.ISA__CLASSIFICATION_ATTRIBUTE:
				return classificationAttribute != null;
		}
		return super.eIsSet(featureID);
	}

} //ISAImpl
