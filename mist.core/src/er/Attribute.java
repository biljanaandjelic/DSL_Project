/**
 */
package er;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link er.Attribute#getAttributeDomain <em>Attribute Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see er.ErPackage#getAttribute()
 * @model annotation="gmf.node border.width='1' phantom='true' size='50,5'"
 * @generated
 */
public interface Attribute extends ModellingConcept {
	/**
	 * Returns the value of the '<em><b>Attribute Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Domain</em>' containment reference.
	 * @see #setAttributeDomain(AttributeDomain)
	 * @see er.ErPackage#getAttribute_AttributeDomain()
	 * @model containment="true"
	 * @generated
	 */
	AttributeDomain getAttributeDomain();

	/**
	 * Sets the value of the '{@link er.Attribute#getAttributeDomain <em>Attribute Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Domain</em>' containment reference.
	 * @see #getAttributeDomain()
	 * @generated
	 */
	void setAttributeDomain(AttributeDomain value);

} // Attribute
