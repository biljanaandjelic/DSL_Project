/**
 */
package er;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Categories</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link er.Categories#getEntities <em>Entities</em>}</li>
 *   <li>{@link er.Categories#getMin <em>Min</em>}</li>
 *   <li>{@link er.Categories#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see er.ErPackage#getCategories()
 * @model annotation="gmf.node label.placement='external' label='min,max' label.pattern='({0},{1})' label.icon='false' border.color='0,0,0' color='255,255,255' border.width='1' figure='ellipse' size='7,7'"
 * @generated
 */
public interface Categories extends EObject {
	/**
	 * Returns the value of the '<em><b>Entities</b></em>' reference list.
	 * The list contents are of type {@link er.EntityConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' reference list.
	 * @see er.ErPackage#getCategories_Entities()
	 * @model lower="2"
	 *        annotation="gmf.link target.decoration='arrow' style='solid' color='0,0,0' border.width='2'"
	 * @generated
	 */
	EList<EntityConcept> getEntities();

	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * The literals are from the enumeration {@link er.MinCardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see er.MinCardinality
	 * @see #setMin(MinCardinality)
	 * @see er.ErPackage#getCategories_Min()
	 * @model required="true"
	 * @generated
	 */
	MinCardinality getMin();

	/**
	 * Sets the value of the '{@link er.Categories#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see er.MinCardinality
	 * @see #getMin()
	 * @generated
	 */
	void setMin(MinCardinality value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * The literals are from the enumeration {@link er.MaxCardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see er.MaxCardinality
	 * @see #setMax(MaxCardinality)
	 * @see er.ErPackage#getCategories_Max()
	 * @model required="true"
	 * @generated
	 */
	MaxCardinality getMax();

	/**
	 * Sets the value of the '{@link er.Categories#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see er.MaxCardinality
	 * @see #getMax()
	 * @generated
	 */
	void setMax(MaxCardinality value);

} // Categories
