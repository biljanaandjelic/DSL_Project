/**
 */
package classDiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link classDiagram.Attribute#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link classDiagram.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link classDiagram.Attribute#getAccessModifier <em>Access Modifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see classDiagram.ClassDiagramPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends ModelingConcept {
	/**
	 * Returns the value of the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Static</em>' attribute.
	 * @see #setIsStatic(boolean)
	 * @see classDiagram.ClassDiagramPackage#getAttribute_IsStatic()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsStatic();

	/**
	 * Sets the value of the '{@link classDiagram.Attribute#isIsStatic <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Static</em>' attribute.
	 * @see #isIsStatic()
	 * @generated
	 */
	void setIsStatic(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(ElementType)
	 * @see classDiagram.ClassDiagramPackage#getAttribute_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ElementType getType();

	/**
	 * Sets the value of the '{@link classDiagram.Attribute#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ElementType value);

	/**
	 * Returns the value of the '<em><b>Access Modifier</b></em>' attribute.
	 * The literals are from the enumeration {@link classDiagram.AccessModifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Modifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Modifier</em>' attribute.
	 * @see classDiagram.AccessModifier
	 * @see #setAccessModifier(AccessModifier)
	 * @see classDiagram.ClassDiagramPackage#getAttribute_AccessModifier()
	 * @model required="true"
	 * @generated
	 */
	AccessModifier getAccessModifier();

	/**
	 * Sets the value of the '{@link classDiagram.Attribute#getAccessModifier <em>Access Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Modifier</em>' attribute.
	 * @see classDiagram.AccessModifier
	 * @see #getAccessModifier()
	 * @generated
	 */
	void setAccessModifier(AccessModifier value);

} // Attribute
