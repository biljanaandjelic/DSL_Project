/**
 */
package classDiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link classDiagram.ElementType#isIsCollection <em>Is Collection</em>}</li>
 *   <li>{@link classDiagram.ElementType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see classDiagram.ClassDiagramPackage#getElementType()
 * @model
 * @generated
 */
public interface ElementType extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Collection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Collection</em>' attribute.
	 * @see #setIsCollection(boolean)
	 * @see classDiagram.ClassDiagramPackage#getElementType_IsCollection()
	 * @model
	 * @generated
	 */
	boolean isIsCollection();

	/**
	 * Sets the value of the '{@link classDiagram.ElementType#isIsCollection <em>Is Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Collection</em>' attribute.
	 * @see #isIsCollection()
	 * @generated
	 */
	void setIsCollection(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Classifier)
	 * @see classDiagram.ClassDiagramPackage#getElementType_Type()
	 * @model required="true"
	 * @generated
	 */
	Classifier getType();

	/**
	 * Sets the value of the '{@link classDiagram.ElementType#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Classifier value);

} // ElementType
