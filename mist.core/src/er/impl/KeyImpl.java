/**
 */
package er.impl;

import er.Attribute;
import er.ErPackage;
import er.Key;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link er.impl.KeyImpl#getKeyAttributes <em>Key Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KeyImpl extends ModellingConceptImpl implements Key {
	/**
	 * The cached value of the '{@link #getKeyAttributes() <em>Key Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> keyAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErPackage.Literals.KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getKeyAttributes() {
		if (keyAttributes == null) {
			keyAttributes = new EObjectResolvingEList<Attribute>(Attribute.class, this, ErPackage.KEY__KEY_ATTRIBUTES);
		}
		return keyAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ErPackage.KEY__KEY_ATTRIBUTES:
				return getKeyAttributes();
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
			case ErPackage.KEY__KEY_ATTRIBUTES:
				getKeyAttributes().clear();
				getKeyAttributes().addAll((Collection<? extends Attribute>)newValue);
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
			case ErPackage.KEY__KEY_ATTRIBUTES:
				getKeyAttributes().clear();
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
			case ErPackage.KEY__KEY_ATTRIBUTES:
				return keyAttributes != null && !keyAttributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //KeyImpl
