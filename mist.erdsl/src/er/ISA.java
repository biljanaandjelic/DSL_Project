/**
 */
package er;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ISA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link er.ISA#getSupertype <em>Supertype</em>}</li>
 *   <li>{@link er.ISA#getSubtypes <em>Subtypes</em>}</li>
 *   <li>{@link er.ISA#getClassificationAttribute <em>Classification Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see er.ErPackage#getISA()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='invalidClassificationAtrtibute SubTypeExistsAsSuperType duplicateSybtype'"
 *        annotation="gmf.node label.text='IS-A' label.style='bold' border.width='2' figure='polygon' polygon.x='0 15 30' polygon.y='15 0 15'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot invalidClassificationAtrtibute='\n\t\tif supertype.entity.oclIsTypeOf(Entity) then\n\t\t\tsupertype.entity.oclAsType(Entity).entityAttributes->includes(classificationAttribute) \n\t\telse \n\t\t\tsupertype.entity.oclAsType(Gerund).relationship.relationshipAttributes->includes(classificationAttribute) \t\n\t\tendif' SubTypeExistsAsSuperType='\n\t\tif(supertype.entity.oclIsTypeOf(Entity)) then \n\t\t\tsubtypes->excludes(supertype.entity.oclAsType(Entity))\n\t\telse\n\t\t\tnot supertype.entity.oclIsTypeOf(Entity)\n\t\tendif' duplicateSybtype='\n\t\t\tISA.allInstances().subtypes->forAll(e1:Entity | ISA.allInstances().subtypes->select(e2 | e1.name=e2.name)->size()<2)'"
 * @generated
 */
public interface ISA extends RelationshipConcept {
	/**
	 * Returns the value of the '<em><b>Supertype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supertype</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supertype</em>' containment reference.
	 * @see #setSupertype(RegularEntity)
	 * @see er.ErPackage#getISA_Supertype()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RegularEntity getSupertype();

	/**
	 * Sets the value of the '{@link er.ISA#getSupertype <em>Supertype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supertype</em>' containment reference.
	 * @see #getSupertype()
	 * @generated
	 */
	void setSupertype(RegularEntity value);

	/**
	 * Returns the value of the '<em><b>Subtypes</b></em>' reference list.
	 * The list contents are of type {@link er.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtypes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtypes</em>' reference list.
	 * @see er.ErPackage#getISA_Subtypes()
	 * @model lower="2"
	 *        annotation="gmf.link target.decoration='arrow' style='solid' color='0,0,0' border.width='5'"
	 * @generated
	 */
	EList<Entity> getSubtypes();

	/**
	 * Returns the value of the '<em><b>Classification Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Attribute</em>' reference.
	 * @see #setClassificationAttribute(Attribute)
	 * @see er.ErPackage#getISA_ClassificationAttribute()
	 * @model required="true"
	 *        annotation="gmf.link label.text='classificationAttribute' target.decoration='arrow' style='dash' color='0,0,0'"
	 * @generated
	 */
	Attribute getClassificationAttribute();

	/**
	 * Sets the value of the '{@link er.ISA#getClassificationAttribute <em>Classification Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Attribute</em>' reference.
	 * @see #getClassificationAttribute()
	 * @generated
	 */
	void setClassificationAttribute(Attribute value);

} // ISA
