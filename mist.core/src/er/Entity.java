/**
 */
package er;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link er.Entity#getEntityAttributes <em>Entity Attributes</em>}</li>
 *   <li>{@link er.Entity#getKeySet <em>Key Set</em>}</li>
 *   <li>{@link er.Entity#getPrimaryKey <em>Primary Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see er.ErPackage#getEntity()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='existedKey invalidPrimaryKey invalidAttributInKey'"
 *        annotation="gmf.node border.width='1' figure='polygon' polygon.x='0 30 30 0' polygon.y='0 0 30 30'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot existedKey='\n\t\t\tkeySet->forAll(k1:Key, k2:Key | k1.keyAttributes->intersection(k2.keyAttributes)->includesAll(k1.keyAttributes) and k1.keyAttributes->symmetricDifference(k2.keyAttributes)->isEmpty() implies k1=k2)' existedKey$message='\'The key with attribute set already exists\'' invalidPrimaryKey='\n\t\t\tif(keySet->notEmpty()) then\n\t\t\t\tif(not primaryKey->oclIsUndefined()) then\n\t\t\t\t\tkeySet->includes(primaryKey)\n\t\t\t\telse\n\t\t\t\t\tnot primaryKey->oclIsUndefined()\n\t\t\t\tendif\n\t\t\telse\n\t\t\t\tkeySet->isEmpty()\n\t\t\tendif' invalidAttributInKey='\n\t\t\t\tif(not keySet.keyAttributes->isEmpty()) then\n\t\t\t\t\tif(entityAttributes->notEmpty()) then\n\t\t\t\t\t\tentityAttributes->includesAll(keySet.keyAttributes)\n\t\t\t\t\telse\n\t\t\t\t\t\tentityAttributes->notEmpty()\n\t\t\t\t\tendif\n\t\t\t\telse\n\t\t\t\t\tkeySet.keyAttributes->isEmpty()\n\t\t\t\tendif'"
 * @generated
 */
public interface Entity extends ModellingConcept, EntityConcept {
	/**
	 * Returns the value of the '<em><b>Entity Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link er.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Attributes</em>' containment reference list.
	 * @see er.ErPackage#getEntity_EntityAttributes()
	 * @model containment="true"
	 *        annotation="gmf.link style='solid' color='0,0,0' width='0'"
	 * @generated
	 */
	EList<Attribute> getEntityAttributes();

	/**
	 * Returns the value of the '<em><b>Key Set</b></em>' containment reference list.
	 * The list contents are of type {@link er.Key}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Set</em>' containment reference list.
	 * @see er.ErPackage#getEntity_KeySet()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<Key> getKeySet();

	/**
	 * Returns the value of the '<em><b>Primary Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Key</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key</em>' reference.
	 * @see #setPrimaryKey(Key)
	 * @see er.ErPackage#getEntity_PrimaryKey()
	 * @model annotation="gmf.link label.text='primaryKey' target.decoration='arrow' style='dash' color='0,0,0'"
	 * @generated
	 */
	Key getPrimaryKey();

	/**
	 * Sets the value of the '{@link er.Entity#getPrimaryKey <em>Primary Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Key</em>' reference.
	 * @see #getPrimaryKey()
	 * @generated
	 */
	void setPrimaryKey(Key value);

} // Entity
