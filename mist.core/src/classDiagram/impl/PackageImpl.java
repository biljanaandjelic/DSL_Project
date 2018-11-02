/**
 */
package classDiagram.impl;

import classDiagram.ClassDiagramPackage;
import classDiagram.ModelingConcept;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link classDiagram.impl.PackageImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link classDiagram.impl.PackageImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link classDiagram.impl.PackageImpl#getSubpackages <em>Subpackages</em>}</li>
 *   <li>{@link classDiagram.impl.PackageImpl#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends ModelingConceptImpl implements classDiagram.Package {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelingConcept> elements;

	/**
	 * The cached value of the '{@link #getSubpackages() <em>Subpackages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubpackages()
	 * @generated
	 * @ordered
	 */
	protected EList<classDiagram.Package> subpackages;
	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<classDiagram.Class> classes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelingConcept> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<ModelingConcept>(ModelingConcept.class, this, ClassDiagramPackage.PACKAGE__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public classDiagram.Package getPackage() {
		if (eContainerFeatureID() != ClassDiagramPackage.PACKAGE__PACKAGE) return null;
		return (classDiagram.Package)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(classDiagram.Package newPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPackage, ClassDiagramPackage.PACKAGE__PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(classDiagram.Package newPackage) {
		if (newPackage != eInternalContainer() || (eContainerFeatureID() != ClassDiagramPackage.PACKAGE__PACKAGE && newPackage != null)) {
			if (EcoreUtil.isAncestor(this, newPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPackage != null)
				msgs = ((InternalEObject)newPackage).eInverseAdd(this, ClassDiagramPackage.PACKAGE__SUBPACKAGES, classDiagram.Package.class, msgs);
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.PACKAGE__PACKAGE, newPackage, newPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<classDiagram.Package> getSubpackages() {
		if (subpackages == null) {
			subpackages = new EObjectContainmentWithInverseEList<classDiagram.Package>(classDiagram.Package.class, this, ClassDiagramPackage.PACKAGE__SUBPACKAGES, ClassDiagramPackage.PACKAGE__PACKAGE);
		}
		return subpackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<classDiagram.Class> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentEList<classDiagram.Class>(classDiagram.Class.class, this, ClassDiagramPackage.PACKAGE__CLASSES);
		}
		return classes;
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
			case ClassDiagramPackage.PACKAGE__PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPackage((classDiagram.Package)otherEnd, msgs);
			case ClassDiagramPackage.PACKAGE__SUBPACKAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubpackages()).basicAdd(otherEnd, msgs);
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
			case ClassDiagramPackage.PACKAGE__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case ClassDiagramPackage.PACKAGE__PACKAGE:
				return basicSetPackage(null, msgs);
			case ClassDiagramPackage.PACKAGE__SUBPACKAGES:
				return ((InternalEList<?>)getSubpackages()).basicRemove(otherEnd, msgs);
			case ClassDiagramPackage.PACKAGE__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ClassDiagramPackage.PACKAGE__PACKAGE:
				return eInternalContainer().eInverseRemove(this, ClassDiagramPackage.PACKAGE__SUBPACKAGES, classDiagram.Package.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagramPackage.PACKAGE__ELEMENTS:
				return getElements();
			case ClassDiagramPackage.PACKAGE__PACKAGE:
				return getPackage();
			case ClassDiagramPackage.PACKAGE__SUBPACKAGES:
				return getSubpackages();
			case ClassDiagramPackage.PACKAGE__CLASSES:
				return getClasses();
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
			case ClassDiagramPackage.PACKAGE__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends ModelingConcept>)newValue);
				return;
			case ClassDiagramPackage.PACKAGE__PACKAGE:
				setPackage((classDiagram.Package)newValue);
				return;
			case ClassDiagramPackage.PACKAGE__SUBPACKAGES:
				getSubpackages().clear();
				getSubpackages().addAll((Collection<? extends classDiagram.Package>)newValue);
				return;
			case ClassDiagramPackage.PACKAGE__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends classDiagram.Class>)newValue);
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
			case ClassDiagramPackage.PACKAGE__ELEMENTS:
				getElements().clear();
				return;
			case ClassDiagramPackage.PACKAGE__PACKAGE:
				setPackage((classDiagram.Package)null);
				return;
			case ClassDiagramPackage.PACKAGE__SUBPACKAGES:
				getSubpackages().clear();
				return;
			case ClassDiagramPackage.PACKAGE__CLASSES:
				getClasses().clear();
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
			case ClassDiagramPackage.PACKAGE__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case ClassDiagramPackage.PACKAGE__PACKAGE:
				return getPackage() != null;
			case ClassDiagramPackage.PACKAGE__SUBPACKAGES:
				return subpackages != null && !subpackages.isEmpty();
			case ClassDiagramPackage.PACKAGE__CLASSES:
				return classes != null && !classes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PackageImpl
