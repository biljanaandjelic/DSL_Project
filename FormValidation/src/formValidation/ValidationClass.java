/**
 */
package formValidation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validation Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link formValidation.ValidationClass#getName <em>Name</em>}</li>
 *   <li>{@link formValidation.ValidationClass#getClassattribute <em>Classattribute</em>}</li>
 *   <li>{@link formValidation.ValidationClass#getClassrule <em>Classrule</em>}</li>
 *   <li>{@link formValidation.ValidationClass#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getValidationClass()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='differentClassAttributes'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot differentClassAttributes='Tuple {\n\tmessage : String = \'All attributes should be different\',\n\tstatus : Boolean = \n\t\t classattribute-> forAll(a1: ClassAttribute, a2: ClassAttribute | \n\t\t \tif a1<>a2 then a1.name <> a2.name else true endif\n\t\t )\n}.status'"
 * @generated
 */
public interface ValidationClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see formValidation.FormValidationPackage#getValidationClass_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link formValidation.ValidationClass#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Classattribute</b></em>' containment reference list.
	 * The list contents are of type {@link formValidation.ClassAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classattribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classattribute</em>' containment reference list.
	 * @see formValidation.FormValidationPackage#getValidationClass_Classattribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassAttribute> getClassattribute();

	/**
	 * Returns the value of the '<em><b>Classrule</b></em>' containment reference list.
	 * The list contents are of type {@link formValidation.ClassRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classrule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classrule</em>' containment reference list.
	 * @see formValidation.FormValidationPackage#getValidationClass_Classrule()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassRule> getClassrule();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see formValidation.FormValidationPackage#getValidationClass_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link formValidation.ValidationClass#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

} // ValidationClass
