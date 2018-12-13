/**
 */
package formValidation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Overview Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link formValidation.OverviewSettings#getTableoverview <em>Tableoverview</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getOverviewSettings()
 * @model
 * @generated
 */
public interface OverviewSettings extends EObject {
	/**
	 * Returns the value of the '<em><b>Tableoverview</b></em>' containment reference list.
	 * The list contents are of type {@link formValidation.TableOverview}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tableoverview</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tableoverview</em>' containment reference list.
	 * @see formValidation.FormValidationPackage#getOverviewSettings_Tableoverview()
	 * @model containment="true"
	 * @generated
	 */
	EList<TableOverview> getTableoverview();

} // OverviewSettings
