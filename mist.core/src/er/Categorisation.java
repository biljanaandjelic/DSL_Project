/**
 */
package er;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Categorisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link er.Categorisation#getCategorisationEntities <em>Categorisation Entities</em>}</li>
 *   <li>{@link er.Categorisation#isIsPartial <em>Is Partial</em>}</li>
 *   <li>{@link er.Categorisation#getCategorisedEntity <em>Categorised Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see er.ErPackage#getCategorisation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='invalidCategory'"
 *        annotation="gmf.node label.text='EX-OR' border.width='2' figure='polygon' polygon.x='0 15 30' polygon.y='0 15 0'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot invalidCategory='\n\t\t\tcategorisationEntities.entities->excludes(categorisedEntity) and categorisationEntities.entities->\n\t\t\tforAll(e1:EntityConcept, e2:EntityConcept | \n\t\t\t\t\t\tif(e1.oclIsTypeOf(Entity) and  e2.oclIsTypeOf(Entity)) then\n\t\t\t\t\t\t\te1.oclAsType(Entity).name = e2.oclAsType(Entity).name implies e1 = e2\n\t\t\t\t\t\telse if(e1.oclIsTypeOf(Gerund) and  e2.oclIsTypeOf(Gerund)) then\n\t\t\t\t\t\t\t\te1.oclAsType(Gerund).relationship.name = e2.oclAsType(Gerund).relationship.name implies e1 = e2\n\t\t\t\t\t\t\t else\n\t\t\t\t\t\t\t \ttrue\n\t\t\t\t\t\t\t endif\n\t\t\t\t\t\tendif\n\t\t\t\t\t)'"
 * @generated
 */
public interface Categorisation extends RelationshipConcept {
	/**
	 * Returns the value of the '<em><b>Categorisation Entities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorisation Entities</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorisation Entities</em>' containment reference.
	 * @see #setCategorisationEntities(Categories)
	 * @see er.ErPackage#getCategorisation_CategorisationEntities()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Categories getCategorisationEntities();

	/**
	 * Sets the value of the '{@link er.Categorisation#getCategorisationEntities <em>Categorisation Entities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorisation Entities</em>' containment reference.
	 * @see #getCategorisationEntities()
	 * @generated
	 */
	void setCategorisationEntities(Categories value);

	/**
	 * Returns the value of the '<em><b>Is Partial</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Partial</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Partial</em>' attribute.
	 * @see #setIsPartial(boolean)
	 * @see er.ErPackage#getCategorisation_IsPartial()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsPartial();

	/**
	 * Sets the value of the '{@link er.Categorisation#isIsPartial <em>Is Partial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Partial</em>' attribute.
	 * @see #isIsPartial()
	 * @generated
	 */
	void setIsPartial(boolean value);

	/**
	 * Returns the value of the '<em><b>Categorised Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorised Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorised Entity</em>' reference.
	 * @see #setCategorisedEntity(EntityConcept)
	 * @see er.ErPackage#getCategorisation_CategorisedEntity()
	 * @model required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='solid' color='0,0,0'"
	 * @generated
	 */
	EntityConcept getCategorisedEntity();

	/**
	 * Sets the value of the '{@link er.Categorisation#getCategorisedEntity <em>Categorised Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorised Entity</em>' reference.
	 * @see #getCategorisedEntity()
	 * @generated
	 */
	void setCategorisedEntity(EntityConcept value);

} // Categorisation
