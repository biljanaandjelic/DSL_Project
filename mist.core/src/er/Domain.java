/**
 */
package er;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link er.Domain#getPrimitiveDomain <em>Primitive Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see er.ErPackage#getDomain()
 * @model annotation="gmf.node border.width='1'"
 * @generated
 */
public interface Domain extends ModellingConcept {
	/**
	 * Returns the value of the '<em><b>Primitive Domain</b></em>' attribute.
	 * The literals are from the enumeration {@link er.PrimitiveDomain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitive Domain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Domain</em>' attribute.
	 * @see er.PrimitiveDomain
	 * @see #setPrimitiveDomain(PrimitiveDomain)
	 * @see er.ErPackage#getDomain_PrimitiveDomain()
	 * @model required="true"
	 * @generated
	 */
	PrimitiveDomain getPrimitiveDomain();

	/**
	 * Sets the value of the '{@link er.Domain#getPrimitiveDomain <em>Primitive Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive Domain</em>' attribute.
	 * @see er.PrimitiveDomain
	 * @see #getPrimitiveDomain()
	 * @generated
	 */
	void setPrimitiveDomain(PrimitiveDomain value);

} // Domain
