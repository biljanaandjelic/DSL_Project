/**
 */
package formValidation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pagination</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link formValidation.Pagination#getPossibleNumberOfShownRows <em>Possible Number Of Shown Rows</em>}</li>
 *   <li>{@link formValidation.Pagination#getDefaultNumberOfShownRows <em>Default Number Of Shown Rows</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getPagination()
 * @model annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='Description'"
 * @generated
 */
public interface Pagination extends EObject {
	/**
	 * Returns the value of the '<em><b>Possible Number Of Shown Rows</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Possible Number Of Shown Rows</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Possible Number Of Shown Rows</em>' attribute list.
	 * @see formValidation.FormValidationPackage#getPagination_PossibleNumberOfShownRows()
	 * @model
	 * @generated
	 */
	EList<Integer> getPossibleNumberOfShownRows();

	/**
	 * Returns the value of the '<em><b>Default Number Of Shown Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Number Of Shown Rows</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Number Of Shown Rows</em>' attribute.
	 * @see #setDefaultNumberOfShownRows(int)
	 * @see formValidation.FormValidationPackage#getPagination_DefaultNumberOfShownRows()
	 * @model
	 * @generated
	 */
	int getDefaultNumberOfShownRows();

	/**
	 * Sets the value of the '{@link formValidation.Pagination#getDefaultNumberOfShownRows <em>Default Number Of Shown Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Number Of Shown Rows</em>' attribute.
	 * @see #getDefaultNumberOfShownRows()
	 * @generated
	 */
	void setDefaultNumberOfShownRows(int value);

} // Pagination
