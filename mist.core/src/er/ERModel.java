/**
 */
package er;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ER Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link er.ERModel#getEntities <em>Entities</em>}</li>
 *   <li>{@link er.ERModel#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link er.ERModel#getGerunds <em>Gerunds</em>}</li>
 *   <li>{@link er.ERModel#getDomains <em>Domains</em>}</li>
 * </ul>
 * </p>
 *
 * @see er.ErPackage#getERModel()
 * @model annotation="gmf.diagram model.extension='erdsl' diagram.extension='erdsldiag'"
 * @generated
 */
public interface ERModel extends ModellingConcept {
	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link er.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see er.ErPackage#getERModel_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * Returns the value of the '<em><b>Relationships</b></em>' containment reference list.
	 * The list contents are of type {@link er.RelationshipConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationships</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationships</em>' containment reference list.
	 * @see er.ErPackage#getERModel_Relationships()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelationshipConcept> getRelationships();

	/**
	 * Returns the value of the '<em><b>Gerunds</b></em>' containment reference list.
	 * The list contents are of type {@link er.Gerund}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gerunds</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gerunds</em>' containment reference list.
	 * @see er.ErPackage#getERModel_Gerunds()
	 * @model containment="true"
	 * @generated
	 */
	EList<Gerund> getGerunds();

	/**
	 * Returns the value of the '<em><b>Domains</b></em>' containment reference list.
	 * The list contents are of type {@link er.Domain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domains</em>' containment reference list.
	 * @see er.ErPackage#getERModel_Domains()
	 * @model containment="true"
	 * @generated
	 */
	EList<Domain> getDomains();

} // ERModel
