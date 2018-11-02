/**
 */
package classDiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link classDiagram.Package#getElements <em>Elements</em>}</li>
 *   <li>{@link classDiagram.Package#getPackage <em>Package</em>}</li>
 *   <li>{@link classDiagram.Package#getSubpackages <em>Subpackages</em>}</li>
 *   <li>{@link classDiagram.Package#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see classDiagram.ClassDiagramPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends ModelingConcept {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link classDiagram.ModelingConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see classDiagram.ClassDiagramPackage#getPackage_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelingConcept> getElements();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link classDiagram.Package#getSubpackages <em>Subpackages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' container reference.
	 * @see #setPackage(Package)
	 * @see classDiagram.ClassDiagramPackage#getPackage_Package()
	 * @see classDiagram.Package#getSubpackages
	 * @model opposite="subpackages" transient="false"
	 * @generated
	 */
	Package getPackage();

	/**
	 * Sets the value of the '{@link classDiagram.Package#getPackage <em>Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' container reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(Package value);

	/**
	 * Returns the value of the '<em><b>Subpackages</b></em>' containment reference list.
	 * The list contents are of type {@link classDiagram.Package}.
	 * It is bidirectional and its opposite is '{@link classDiagram.Package#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subpackages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subpackages</em>' containment reference list.
	 * @see classDiagram.ClassDiagramPackage#getPackage_Subpackages()
	 * @see classDiagram.Package#getPackage
	 * @model opposite="package" containment="true"
	 * @generated
	 */
	EList<Package> getSubpackages();

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link classDiagram.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see classDiagram.ClassDiagramPackage#getPackage_Classes()
	 * @model containment="true"
	 * @generated
	 */
	EList<classDiagram.Class> getClasses();

} // Package
