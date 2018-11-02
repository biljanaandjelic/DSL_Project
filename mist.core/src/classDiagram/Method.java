/**
 */
package classDiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link classDiagram.Method#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link classDiagram.Method#getParameters <em>Parameters</em>}</li>
 *   <li>{@link classDiagram.Method#getAccessModifier <em>Access Modifier</em>}</li>
 *   <li>{@link classDiagram.Method#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link classDiagram.Method#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link classDiagram.Method#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see classDiagram.ClassDiagramPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends ModelingConcept {
	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' containment reference.
	 * @see #setReturnType(ElementType)
	 * @see classDiagram.ClassDiagramPackage#getMethod_ReturnType()
	 * @model containment="true"
	 * @generated
	 */
	ElementType getReturnType();

	/**
	 * Sets the value of the '{@link classDiagram.Method#getReturnType <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' containment reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(ElementType value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link classDiagram.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see classDiagram.ClassDiagramPackage#getMethod_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getParameters();

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
	 * @see classDiagram.ClassDiagramPackage#getMethod_AccessModifier()
	 * @model required="true"
	 * @generated
	 */
	AccessModifier getAccessModifier();

	/**
	 * Sets the value of the '{@link classDiagram.Method#getAccessModifier <em>Access Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Modifier</em>' attribute.
	 * @see classDiagram.AccessModifier
	 * @see #getAccessModifier()
	 * @generated
	 */
	void setAccessModifier(AccessModifier value);

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
	 * @see classDiagram.ClassDiagramPackage#getMethod_IsStatic()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsStatic();

	/**
	 * Sets the value of the '{@link classDiagram.Method#isIsStatic <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Static</em>' attribute.
	 * @see #isIsStatic()
	 * @generated
	 */
	void setIsStatic(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see classDiagram.ClassDiagramPackage#getMethod_IsAbstract()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link classDiagram.Method#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see classDiagram.ClassDiagramPackage#getMethod_Body()
	 * @model
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link classDiagram.Method#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

} // Method
