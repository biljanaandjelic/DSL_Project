/**
 */
package formValidation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link formValidation.BusinessModel#getValidationclasses <em>Validationclasses</em>}</li>
 *   <li>{@link formValidation.BusinessModel#getLabel <em>Label</em>}</li>
 *   <li>{@link formValidation.BusinessModel#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getBusinessModel()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueClassName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot uniqueClassName='Tuple {\n\tmessage : String = \'\',\n\tstatus : Boolean = \n\t\tvalidationclasses -> forAll(vC1: ValidationClass, vC2: ValidationClass | if vC1 <> vC2 then\n\t\t\t vC1.name <> vC2.name else true endif)\n}.status'"
 * @generated
 */
public interface BusinessModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Validationclasses</b></em>' containment reference list.
	 * The list contents are of type {@link formValidation.ValidationClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validationclasses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validationclasses</em>' containment reference list.
	 * @see formValidation.FormValidationPackage#getBusinessModel_Validationclasses()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValidationClass> getValidationclasses();

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
	 * @see formValidation.FormValidationPackage#getBusinessModel_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link formValidation.BusinessModel#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see formValidation.FormValidationPackage#getBusinessModel_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link formValidation.BusinessModel#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // BusinessModel
