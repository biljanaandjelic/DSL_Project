/**
 */
package er;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gerund</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link er.Gerund#getRelationship <em>Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @see er.ErPackage#getGerund()
 * @model annotation="gmf.node label.placement='none' label.icon='false' border.width='1' border.color='0,0,0' figure='polygon' polygon.x='0 0 60 60' polygon.y='60 0 0 60'"
 * @generated
 */
public interface Gerund extends EntityConcept {
	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference.
	 * @see #setRelationship(Relationship)
	 * @see er.ErPackage#getGerund_Relationship()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	Relationship getRelationship();

	/**
	 * Sets the value of the '{@link er.Gerund#getRelationship <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' containment reference.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(Relationship value);

} // Gerund
