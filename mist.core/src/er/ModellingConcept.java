/**
 */
package er;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modelling Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link er.ModellingConcept#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see er.ErPackage#getModellingConcept()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='existedName'"
 *        annotation="gmf.node label='name' label.icon='false' border.color='0,0,0'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot existedName='\n\t\t\tModellingConcept.allInstances()->symmetricDifference(Gerund.allInstances())->forAll(m1:ModellingConcept, m2:ModellingConcept | m1.name = m2.name implies m1=m2)'"
 * @generated
 */
public interface ModellingConcept extends EObject {
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
	 * @see er.ErPackage#getModellingConcept_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link er.ModellingConcept#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ModellingConcept
