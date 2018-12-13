/**
 */
package formValidation.impl;

import formValidation.FormValidationPackage;
import formValidation.Pagination;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pagination</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link formValidation.impl.PaginationImpl#getPossibleNumberOfShownRows <em>Possible Number Of Shown Rows</em>}</li>
 *   <li>{@link formValidation.impl.PaginationImpl#getDefaultNumOfShownRows <em>Default Num Of Shown Rows</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaginationImpl extends MinimalEObjectImpl.Container implements Pagination {
	/**
	 * The cached value of the '{@link #getPossibleNumberOfShownRows() <em>Possible Number Of Shown Rows</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibleNumberOfShownRows()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> possibleNumberOfShownRows;

	/**
	 * The default value of the '{@link #getDefaultNumOfShownRows() <em>Default Num Of Shown Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultNumOfShownRows()
	 * @generated
	 * @ordered
	 */
	protected static final int DEFAULT_NUM_OF_SHOWN_ROWS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDefaultNumOfShownRows() <em>Default Num Of Shown Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultNumOfShownRows()
	 * @generated
	 * @ordered
	 */
	protected int defaultNumOfShownRows = DEFAULT_NUM_OF_SHOWN_ROWS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaginationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormValidationPackage.Literals.PAGINATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getPossibleNumberOfShownRows() {
		if (possibleNumberOfShownRows == null) {
			possibleNumberOfShownRows = new EDataTypeUniqueEList<Integer>(Integer.class, this, FormValidationPackage.PAGINATION__POSSIBLE_NUMBER_OF_SHOWN_ROWS);
		}
		return possibleNumberOfShownRows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDefaultNumOfShownRows() {
		return defaultNumOfShownRows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultNumOfShownRows(int newDefaultNumOfShownRows) {
		int oldDefaultNumOfShownRows = defaultNumOfShownRows;
		defaultNumOfShownRows = newDefaultNumOfShownRows;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormValidationPackage.PAGINATION__DEFAULT_NUM_OF_SHOWN_ROWS, oldDefaultNumOfShownRows, defaultNumOfShownRows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FormValidationPackage.PAGINATION__POSSIBLE_NUMBER_OF_SHOWN_ROWS:
				return getPossibleNumberOfShownRows();
			case FormValidationPackage.PAGINATION__DEFAULT_NUM_OF_SHOWN_ROWS:
				return getDefaultNumOfShownRows();
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
			case FormValidationPackage.PAGINATION__POSSIBLE_NUMBER_OF_SHOWN_ROWS:
				getPossibleNumberOfShownRows().clear();
				getPossibleNumberOfShownRows().addAll((Collection<? extends Integer>)newValue);
				return;
			case FormValidationPackage.PAGINATION__DEFAULT_NUM_OF_SHOWN_ROWS:
				setDefaultNumOfShownRows((Integer)newValue);
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
			case FormValidationPackage.PAGINATION__POSSIBLE_NUMBER_OF_SHOWN_ROWS:
				getPossibleNumberOfShownRows().clear();
				return;
			case FormValidationPackage.PAGINATION__DEFAULT_NUM_OF_SHOWN_ROWS:
				setDefaultNumOfShownRows(DEFAULT_NUM_OF_SHOWN_ROWS_EDEFAULT);
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
			case FormValidationPackage.PAGINATION__POSSIBLE_NUMBER_OF_SHOWN_ROWS:
				return possibleNumberOfShownRows != null && !possibleNumberOfShownRows.isEmpty();
			case FormValidationPackage.PAGINATION__DEFAULT_NUM_OF_SHOWN_ROWS:
				return defaultNumOfShownRows != DEFAULT_NUM_OF_SHOWN_ROWS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (possibleNumberOfShownRows: ");
		result.append(possibleNumberOfShownRows);
		result.append(", defaultNumOfShownRows: ");
		result.append(defaultNumOfShownRows);
		result.append(')');
		return result.toString();
	}

} //PaginationImpl
