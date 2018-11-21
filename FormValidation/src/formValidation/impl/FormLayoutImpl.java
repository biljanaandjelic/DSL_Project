/**
 */
package formValidation.impl;

import formValidation.ClassAttribute;
import formValidation.FormLayout;
import formValidation.FormValidationPackage;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link formValidation.impl.FormLayoutImpl#getClassattribute <em>Classattribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FormLayoutImpl extends MinimalEObjectImpl.Container implements FormLayout {
	/**
	 * The cached value of the '{@link #getClassattribute() <em>Classattribute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassattribute()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassAttribute> classattribute;

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
	public EList<ClassAttribute> getClassattribute() {
		if (classattribute == null) {
			classattribute = new EObjectResolvingEList<ClassAttribute>(ClassAttribute.class, this, FormValidationPackage.FORM_LAYOUT__CLASSATTRIBUTE);
		}
		return classattribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FormValidationPackage.FORM_LAYOUT__CLASSATTRIBUTE:
				return getClassattribute();
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
			case FormValidationPackage.FORM_LAYOUT__CLASSATTRIBUTE:
				getClassattribute().clear();
				getClassattribute().addAll((Collection<? extends ClassAttribute>)newValue);
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
			case FormValidationPackage.FORM_LAYOUT__CLASSATTRIBUTE:
				getClassattribute().clear();
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
			case FormValidationPackage.FORM_LAYOUT__CLASSATTRIBUTE:
				return classattribute != null && !classattribute.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FormLayoutImpl
