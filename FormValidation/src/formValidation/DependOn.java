/**
 */
package formValidation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Depend On</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link formValidation.DependOn#getIndependent <em>Independent</em>}</li>
 *   <li>{@link formValidation.DependOn#getDependent <em>Dependent</em>}</li>
 *   <li>{@link formValidation.DependOn#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getDependOn()
 * @model
 * @generated
 */
public interface DependOn extends EObject {
	/**
	 * Returns the value of the '<em><b>Independent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Independent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Independent</em>' reference.
	 * @see #setIndependent(AttributeArray)
	 * @see formValidation.FormValidationPackage#getDependOn_Independent()
	 * @model
	 * @generated
	 */
	AttributeArray getIndependent();

	/**
	 * Sets the value of the '{@link formValidation.DependOn#getIndependent <em>Independent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Independent</em>' reference.
	 * @see #getIndependent()
	 * @generated
	 */
	void setIndependent(AttributeArray value);

	/**
	 * Returns the value of the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent</em>' reference.
	 * @see #setDependent(AttributeArray)
	 * @see formValidation.FormValidationPackage#getDependOn_Dependent()
	 * @model
	 * @generated
	 */
	AttributeArray getDependent();

	/**
	 * Sets the value of the '{@link formValidation.DependOn#getDependent <em>Dependent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependent</em>' reference.
	 * @see #getDependent()
	 * @generated
	 */
	void setDependent(AttributeArray value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see formValidation.FormValidationPackage#getDependOn_Condition()
	 * @model
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link formValidation.DependOn#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

} // DependOn
