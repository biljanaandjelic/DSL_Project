/**
 */
package classDiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link classDiagram.ClassModel#getPackages <em>Packages</em>}</li>
 *   <li>{@link classDiagram.ClassModel#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see classDiagram.ClassDiagramPackage#getClassModel()
 * @model
 * @generated
 */
public interface ClassModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link classDiagram.Package}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see classDiagram.ClassDiagramPackage#getClassModel_Packages()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<classDiagram.Package> getPackages();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link classDiagram.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see classDiagram.ClassDiagramPackage#getClassModel_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getTypes();

} // ClassModel
