/**
 */
package formValidation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link formValidation.AttributeArray#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getAttributeArray()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='containDifferentAttributes'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot containDifferentAttributes='\n\t\tattributes -> forAll(a1: ClassAttribute, a2: ClassAttribute | \n\t\t\tif a1 <> a2 \n\t\t\tthen a1.name <> a2.name\n\t\t\telse true \n\t\t\tendif\n\t\t)'"
 * @generated
 */
public interface AttributeArray extends EObject {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference list.
	 * The list contents are of type {@link formValidation.ClassAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference list.
	 * @see formValidation.FormValidationPackage#getAttributeArray_Attributes()
	 * @model
	 * @generated
	 */
	EList<ClassAttribute> getAttributes();

} // AttributeArray
