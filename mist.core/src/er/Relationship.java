/**
 */
package er;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link er.Relationship#getEntities <em>Entities</em>}</li>
 *   <li>{@link er.Relationship#getRelationshipAttributes <em>Relationship Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see er.ErPackage#getRelationship()
 * @model annotation="gmf.node border.width='1'"
 * @generated
 */
public interface Relationship extends RelationshipConcept {
	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link er.RegularEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see er.ErPackage#getRelationship_Entities()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<RegularEntity> getEntities();

	/**
	 * Returns the value of the '<em><b>Relationship Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link er.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Attributes</em>' containment reference list.
	 * @see er.ErPackage#getRelationship_RelationshipAttributes()
	 * @model containment="true"
	 *        annotation="gmf.link style='solid' color='0,0,0'"
	 * @generated
	 */
	EList<Attribute> getRelationshipAttributes();

} // Relationship
