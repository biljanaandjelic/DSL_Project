/**
 */
package er.impl;

import er.Attribute;
import er.ErPackage;
import er.RegularEntity;
import er.Relationship;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link er.impl.RelationshipImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link er.impl.RelationshipImpl#getRelationshipAttributes <em>Relationship Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationshipImpl extends RelationshipConceptImpl implements Relationship {
	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<RegularEntity> entities;

	/**
	 * The cached value of the '{@link #getRelationshipAttributes() <em>Relationship Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> relationshipAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErPackage.Literals.RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegularEntity> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentEList<RegularEntity>(RegularEntity.class, this, ErPackage.RELATIONSHIP__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getRelationshipAttributes() {
		if (relationshipAttributes == null) {
			relationshipAttributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, ErPackage.RELATIONSHIP__RELATIONSHIP_ATTRIBUTES);
		}
		return relationshipAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErPackage.RELATIONSHIP__ENTITIES:
				return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
			case ErPackage.RELATIONSHIP__RELATIONSHIP_ATTRIBUTES:
				return ((InternalEList<?>)getRelationshipAttributes()).basicRemove(otherEnd, msgs);
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
			case ErPackage.RELATIONSHIP__ENTITIES:
				return getEntities();
			case ErPackage.RELATIONSHIP__RELATIONSHIP_ATTRIBUTES:
				return getRelationshipAttributes();
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
			case ErPackage.RELATIONSHIP__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends RegularEntity>)newValue);
				return;
			case ErPackage.RELATIONSHIP__RELATIONSHIP_ATTRIBUTES:
				getRelationshipAttributes().clear();
				getRelationshipAttributes().addAll((Collection<? extends Attribute>)newValue);
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
			case ErPackage.RELATIONSHIP__ENTITIES:
				getEntities().clear();
				return;
			case ErPackage.RELATIONSHIP__RELATIONSHIP_ATTRIBUTES:
				getRelationshipAttributes().clear();
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
			case ErPackage.RELATIONSHIP__ENTITIES:
				return entities != null && !entities.isEmpty();
			case ErPackage.RELATIONSHIP__RELATIONSHIP_ATTRIBUTES:
				return relationshipAttributes != null && !relationshipAttributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RelationshipImpl
