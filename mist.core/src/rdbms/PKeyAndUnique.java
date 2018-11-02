/**
 */
package rdbms;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PKey And Unique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rdbms.PKeyAndUnique#getPKandUQColumns <em>PKand UQ Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see rdbms.RdbmsPackage#getPKeyAndUnique()
 * @model abstract="true"
 * @generated
 */
public interface PKeyAndUnique extends Constraints {
	/**
	 * Returns the value of the '<em><b>PKand UQ Columns</b></em>' reference list.
	 * The list contents are of type {@link rdbms.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PKand UQ Columns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PKand UQ Columns</em>' reference list.
	 * @see rdbms.RdbmsPackage#getPKeyAndUnique_PKandUQColumns()
	 * @model required="true"
	 * @generated
	 */
	EList<Column> getPKandUQColumns();

} // PKeyAndUnique
