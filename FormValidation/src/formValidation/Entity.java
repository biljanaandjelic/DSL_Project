/**
 */
package formValidation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link formValidation.Entity#getName <em>Name</em>}</li>
 *   <li>{@link formValidation.Entity#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link formValidation.Entity#getClassrule <em>Classrule</em>}</li>
 *   <li>{@link formValidation.Entity#getLabel <em>Label</em>}</li>
 *   <li>{@link formValidation.Entity#getFormlayout <em>Formlayout</em>}</li>
 *   <li>{@link formValidation.Entity#getAdditionalSettings <em>Additional Settings</em>}</li>
 *   <li>{@link formValidation.Entity#getOverviewsettings <em>Overviewsettings</em>}</li>
 *   <li>{@link formValidation.Entity#getAttr <em>Attr</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getEntity()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='differentClassAttributes nameFormat allLayoutsSameType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot differentClassAttributes='Tuple {\n\tmessage : String = \'All attributes should be different\',\n\tstatus : Boolean = \n\t\t attributes-> forAll(a1: Attribute, a2: Attribute | \n\t\t \tif a1<>a2 then a1.name <> a2.name else true endif\n\t\t )\n}.status' nameFormat='name.matches(\'[a-z][a-zA-Z0-9.]*\')' allLayoutsSameType='Tuple {\n\tmessage : String = \'At one level all attributes must be same type\',\n\tstatus : Boolean = \n\t\tformlayout -> forAll(fL1: FormLayout, fL2: FormLayout | \n\t\t\tif fL1.oclIsTypeOf(fL2.oclType()) then true else false endif )\n}.status'"
 * @generated
 */
public interface Entity extends EObject {
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
	 * @see formValidation.FormValidationPackage#getEntity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link formValidation.Entity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link formValidation.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see formValidation.FormValidationPackage#getEntity_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

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
	 * @see formValidation.FormValidationPackage#getEntity_Classrule()
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
	 * @see formValidation.FormValidationPackage#getEntity_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link formValidation.Entity#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Formlayout</b></em>' containment reference list.
	 * The list contents are of type {@link formValidation.FormLayout}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formlayout</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formlayout</em>' containment reference list.
	 * @see formValidation.FormValidationPackage#getEntity_Formlayout()
	 * @model containment="true"
	 * @generated
	 */
	EList<FormLayout> getFormlayout();

	/**
	 * Returns the value of the '<em><b>Additional Settings</b></em>' containment reference list.
	 * The list contents are of type {@link formValidation.AdditionalSettings}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Settings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Settings</em>' containment reference list.
	 * @see formValidation.FormValidationPackage#getEntity_AdditionalSettings()
	 * @model containment="true"
	 * @generated
	 */
	EList<AdditionalSettings> getAdditionalSettings();

	/**
	 * Returns the value of the '<em><b>Overviewsettings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overviewsettings</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overviewsettings</em>' containment reference.
	 * @see #setOverviewsettings(OverviewSettings)
	 * @see formValidation.FormValidationPackage#getEntity_Overviewsettings()
	 * @model containment="true"
	 * @generated
	 */
	OverviewSettings getOverviewsettings();

	/**
	 * Sets the value of the '{@link formValidation.Entity#getOverviewsettings <em>Overviewsettings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overviewsettings</em>' containment reference.
	 * @see #getOverviewsettings()
	 * @generated
	 */
	void setOverviewsettings(OverviewSettings value);

	/**
	 * Returns the value of the '<em><b>Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr</em>' attribute.
	 * @see #setAttr(String)
	 * @see formValidation.FormValidationPackage#getEntity_Attr()
	 * @model
	 * @generated
	 */
	String getAttr();

	/**
	 * Sets the value of the '{@link formValidation.Entity#getAttr <em>Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attr</em>' attribute.
	 * @see #getAttr()
	 * @generated
	 */
	void setAttr(String value);

} // Entity
