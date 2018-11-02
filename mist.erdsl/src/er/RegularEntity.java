/**
 */
package er;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regular Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link er.RegularEntity#getEntity <em>Entity</em>}</li>
 *   <li>{@link er.RegularEntity#getRole <em>Role</em>}</li>
 *   <li>{@link er.RegularEntity#getMin <em>Min</em>}</li>
 *   <li>{@link er.RegularEntity#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see er.ErPackage#getRegularEntity()
 * @model annotation="gmf.node label.placement='external' label='min,max' label.pattern='({0},{1})' label.icon='false' border.color='0,0,0' color='255,255,255' border.width='1' figure='ellipse' size='7,7'"
 * @generated
 */
public interface RegularEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(EntityConcept)
	 * @see er.ErPackage#getRegularEntity_Entity()
	 * @model required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='solid' color='0,0,0'"
	 * @generated
	 */
	EntityConcept getEntity();

	/**
	 * Sets the value of the '{@link er.RegularEntity#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(EntityConcept value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see er.ErPackage#getRegularEntity_Role()
	 * @model
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link er.RegularEntity#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * The literals are from the enumeration {@link er.MinCardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see er.MinCardinality
	 * @see #setMin(MinCardinality)
	 * @see er.ErPackage#getRegularEntity_Min()
	 * @model required="true"
	 * @generated
	 */
	MinCardinality getMin();

	/**
	 * Sets the value of the '{@link er.RegularEntity#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see er.MinCardinality
	 * @see #getMin()
	 * @generated
	 */
	void setMin(MinCardinality value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * The literals are from the enumeration {@link er.MaxCardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see er.MaxCardinality
	 * @see #setMax(MaxCardinality)
	 * @see er.ErPackage#getRegularEntity_Max()
	 * @model required="true"
	 * @generated
	 */
	MaxCardinality getMax();

	/**
	 * Sets the value of the '{@link er.RegularEntity#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see er.MaxCardinality
	 * @see #getMax()
	 * @generated
	 */
	void setMax(MaxCardinality value);

} // RegularEntity
