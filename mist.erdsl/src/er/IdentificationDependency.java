/**
 */
package er;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identification Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link er.IdentificationDependency#getWeakEntity <em>Weak Entity</em>}</li>
 *   <li>{@link er.IdentificationDependency#getRegularEntity <em>Regular Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see er.ErPackage#getIdentificationDependency()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='invalidWeakEntity'"
 *        annotation="gmf.node border.width='2' border.color='0,0,0'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot invalidWeakEntity='\n\t\tif(regularEntity.entity.oclIsTypeOf(Entity)) then\n\t\t\tregularEntity.entity.oclAsType(Entity) <> weakEntity\n\t\telse\n\t\t\tnot regularEntity.entity.oclIsTypeOf(Entity)\n\t\tendif'"
 * @generated
 */
public interface IdentificationDependency extends RelationshipConcept {
	/**
	 * Returns the value of the '<em><b>Weak Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weak Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weak Entity</em>' reference.
	 * @see #setWeakEntity(Entity)
	 * @see er.ErPackage#getIdentificationDependency_WeakEntity()
	 * @model required="true"
	 *        annotation="gmf.link label.text='weakEntity' target.decoration='arrow' style='solid' width='2' color='0,0,0'"
	 * @generated
	 */
	Entity getWeakEntity();

	/**
	 * Sets the value of the '{@link er.IdentificationDependency#getWeakEntity <em>Weak Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weak Entity</em>' reference.
	 * @see #getWeakEntity()
	 * @generated
	 */
	void setWeakEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Regular Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regular Entity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regular Entity</em>' containment reference.
	 * @see #setRegularEntity(RegularEntity)
	 * @see er.ErPackage#getIdentificationDependency_RegularEntity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RegularEntity getRegularEntity();

	/**
	 * Sets the value of the '{@link er.IdentificationDependency#getRegularEntity <em>Regular Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regular Entity</em>' containment reference.
	 * @see #getRegularEntity()
	 * @generated
	 */
	void setRegularEntity(RegularEntity value);

} // IdentificationDependency
