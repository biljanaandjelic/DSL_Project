/**
 */
package er;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link er.Key#getKeyAttributes <em>Key Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see er.ErPackage#getKey()
 * @model annotation="gmf.node border.width='1' size='50,25'"
 * @generated
 */
public interface Key extends ModellingConcept {
	/**
	 * Returns the value of the '<em><b>Key Attributes</b></em>' reference list.
	 * The list contents are of type {@link er.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Attributes</em>' reference list.
	 * @see er.ErPackage#getKey_KeyAttributes()
	 * @model required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash' color='180,180,180'"
	 * @generated
	 */
	EList<Attribute> getKeyAttributes();

} // Key
