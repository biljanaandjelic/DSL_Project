/**
 */
package rdbms.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import rdbms.Column;
import rdbms.PKeyAndUnique;
import rdbms.RdbmsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PKey And Unique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rdbms.impl.PKeyAndUniqueImpl#getPKandUQColumns <em>PKand UQ Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PKeyAndUniqueImpl extends ConstraintsImpl implements PKeyAndUnique {
	/**
	 * The cached value of the '{@link #getPKandUQColumns() <em>PKand UQ Columns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPKandUQColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> pKandUQColumns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PKeyAndUniqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdbmsPackage.Literals.PKEY_AND_UNIQUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getPKandUQColumns() {
		if (pKandUQColumns == null) {
			pKandUQColumns = new EObjectResolvingEList<Column>(Column.class, this, RdbmsPackage.PKEY_AND_UNIQUE__PKAND_UQ_COLUMNS);
		}
		return pKandUQColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RdbmsPackage.PKEY_AND_UNIQUE__PKAND_UQ_COLUMNS:
				return getPKandUQColumns();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RdbmsPackage.PKEY_AND_UNIQUE__PKAND_UQ_COLUMNS:
				getPKandUQColumns().clear();
				getPKandUQColumns().addAll((Collection<? extends Column>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RdbmsPackage.PKEY_AND_UNIQUE__PKAND_UQ_COLUMNS:
				getPKandUQColumns().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RdbmsPackage.PKEY_AND_UNIQUE__PKAND_UQ_COLUMNS:
				return pKandUQColumns != null && !pKandUQColumns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PKeyAndUniqueImpl
