/**
 */
package formValidation.impl;

import formValidation.EGridOrder;
import formValidation.FormValidationPackage;
import formValidation.Grid;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link formValidation.impl.GridImpl#getNumOfColumns <em>Num Of Columns</em>}</li>
 *   <li>{@link formValidation.impl.GridImpl#getNumOfRows <em>Num Of Rows</em>}</li>
 *   <li>{@link formValidation.impl.GridImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link formValidation.impl.GridImpl#isExpandLast <em>Expand Last</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GridImpl extends FormLayoutImpl implements Grid {
	/**
	 * The default value of the '{@link #getNumOfColumns() <em>Num Of Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOfColumns()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_OF_COLUMNS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumOfColumns() <em>Num Of Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOfColumns()
	 * @generated
	 * @ordered
	 */
	protected int numOfColumns = NUM_OF_COLUMNS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumOfRows() <em>Num Of Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOfRows()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_OF_ROWS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumOfRows() <em>Num Of Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOfRows()
	 * @generated
	 * @ordered
	 */
	protected int numOfRows = NUM_OF_ROWS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final EGridOrder ORDER_EDEFAULT = EGridOrder.FIRST_ROW;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected EGridOrder order = ORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #isExpandLast() <em>Expand Last</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExpandLast()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXPAND_LAST_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isExpandLast() <em>Expand Last</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExpandLast()
	 * @generated
	 * @ordered
	 */
	protected boolean expandLast = EXPAND_LAST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GridImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormValidationPackage.Literals.GRID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumOfColumns() {
		return numOfColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumOfColumns(int newNumOfColumns) {
		int oldNumOfColumns = numOfColumns;
		numOfColumns = newNumOfColumns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormValidationPackage.GRID__NUM_OF_COLUMNS, oldNumOfColumns, numOfColumns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumOfRows() {
		return numOfRows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumOfRows(int newNumOfRows) {
		int oldNumOfRows = numOfRows;
		numOfRows = newNumOfRows;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormValidationPackage.GRID__NUM_OF_ROWS, oldNumOfRows, numOfRows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGridOrder getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(EGridOrder newOrder) {
		EGridOrder oldOrder = order;
		order = newOrder == null ? ORDER_EDEFAULT : newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormValidationPackage.GRID__ORDER, oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExpandLast() {
		return expandLast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpandLast(boolean newExpandLast) {
		boolean oldExpandLast = expandLast;
		expandLast = newExpandLast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormValidationPackage.GRID__EXPAND_LAST, oldExpandLast, expandLast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FormValidationPackage.GRID__NUM_OF_COLUMNS:
				return getNumOfColumns();
			case FormValidationPackage.GRID__NUM_OF_ROWS:
				return getNumOfRows();
			case FormValidationPackage.GRID__ORDER:
				return getOrder();
			case FormValidationPackage.GRID__EXPAND_LAST:
				return isExpandLast();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FormValidationPackage.GRID__NUM_OF_COLUMNS:
				setNumOfColumns((Integer)newValue);
				return;
			case FormValidationPackage.GRID__NUM_OF_ROWS:
				setNumOfRows((Integer)newValue);
				return;
			case FormValidationPackage.GRID__ORDER:
				setOrder((EGridOrder)newValue);
				return;
			case FormValidationPackage.GRID__EXPAND_LAST:
				setExpandLast((Boolean)newValue);
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
			case FormValidationPackage.GRID__NUM_OF_COLUMNS:
				setNumOfColumns(NUM_OF_COLUMNS_EDEFAULT);
				return;
			case FormValidationPackage.GRID__NUM_OF_ROWS:
				setNumOfRows(NUM_OF_ROWS_EDEFAULT);
				return;
			case FormValidationPackage.GRID__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case FormValidationPackage.GRID__EXPAND_LAST:
				setExpandLast(EXPAND_LAST_EDEFAULT);
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
			case FormValidationPackage.GRID__NUM_OF_COLUMNS:
				return numOfColumns != NUM_OF_COLUMNS_EDEFAULT;
			case FormValidationPackage.GRID__NUM_OF_ROWS:
				return numOfRows != NUM_OF_ROWS_EDEFAULT;
			case FormValidationPackage.GRID__ORDER:
				return order != ORDER_EDEFAULT;
			case FormValidationPackage.GRID__EXPAND_LAST:
				return expandLast != EXPAND_LAST_EDEFAULT;
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
		result.append(" (numOfColumns: ");
		result.append(numOfColumns);
		result.append(", numOfRows: ");
		result.append(numOfRows);
		result.append(", order: ");
		result.append(order);
		result.append(", expandLast: ");
		result.append(expandLast);
		result.append(')');
		return result.toString();
	}

} //GridImpl
