/**
 */
package classDiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link classDiagram.Class#getFields <em>Fields</em>}</li>
 *   <li>{@link classDiagram.Class#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link classDiagram.Class#getSupertypes <em>Supertypes</em>}</li>
 *   <li>{@link classDiagram.Class#getSubtypes <em>Subtypes</em>}</li>
 *   <li>{@link classDiagram.Class#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link classDiagram.Class#getAccessModifier <em>Access Modifier</em>}</li>
 *   <li>{@link classDiagram.Class#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see classDiagram.ClassDiagramPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends Classifier {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link classDiagram.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see classDiagram.ClassDiagramPackage#getClass_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getFields();

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see classDiagram.ClassDiagramPackage#getClass_IsAbstract()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link classDiagram.Class#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Supertypes</b></em>' reference list.
	 * The list contents are of type {@link classDiagram.Class}.
	 * It is bidirectional and its opposite is '{@link classDiagram.Class#getSubtypes <em>Subtypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supertypes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supertypes</em>' reference list.
	 * @see classDiagram.ClassDiagramPackage#getClass_Supertypes()
	 * @see classDiagram.Class#getSubtypes
	 * @model opposite="subtypes"
	 * @generated
	 */
	EList<Class> getSupertypes();

	/**
	 * Returns the value of the '<em><b>Subtypes</b></em>' reference list.
	 * The list contents are of type {@link classDiagram.Class}.
	 * It is bidirectional and its opposite is '{@link classDiagram.Class#getSupertypes <em>Supertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtypes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtypes</em>' reference list.
	 * @see classDiagram.ClassDiagramPackage#getClass_Subtypes()
	 * @see classDiagram.Class#getSupertypes
	 * @model opposite="supertypes"
	 * @generated
	 */
	EList<Class> getSubtypes();

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
	 * @see classDiagram.ClassDiagramPackage#getClass_IsStatic()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsStatic();

	/**
	 * Sets the value of the '{@link classDiagram.Class#isIsStatic <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Static</em>' attribute.
	 * @see #isIsStatic()
	 * @generated
	 */
	void setIsStatic(boolean value);

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
	 * @see classDiagram.ClassDiagramPackage#getClass_AccessModifier()
	 * @model required="true"
	 * @generated
	 */
	AccessModifier getAccessModifier();

	/**
	 * Sets the value of the '{@link classDiagram.Class#getAccessModifier <em>Access Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Modifier</em>' attribute.
	 * @see classDiagram.AccessModifier
	 * @see #getAccessModifier()
	 * @generated
	 */
	void setAccessModifier(AccessModifier value);

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link classDiagram.Method}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see classDiagram.ClassDiagramPackage#getClass_Methods()
	 * @model containment="true"
	 * @generated
	 */
	EList<Method> getMethods();

} // Class
