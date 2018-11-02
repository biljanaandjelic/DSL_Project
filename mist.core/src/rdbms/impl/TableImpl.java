/**
 */
package rdbms.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rdbms.CheckCon;
import rdbms.Column;
import rdbms.ForeignKey;
import rdbms.PrimaryKeyCon;
import rdbms.RdbmsPackage;
import rdbms.Table;
import rdbms.UniqueCon;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rdbms.impl.TableImpl#getTableFKs <em>Table FKs</em>}</li>
 *   <li>{@link rdbms.impl.TableImpl#getTablePK <em>Table PK</em>}</li>
 *   <li>{@link rdbms.impl.TableImpl#getTableUQ <em>Table UQ</em>}</li>
 *   <li>{@link rdbms.impl.TableImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link rdbms.impl.TableImpl#getTableCHs <em>Table CHs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableImpl extends ModelElementImpl implements Table {
	/**
	 * The cached value of the '{@link #getTableFKs() <em>Table FKs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableFKs()
	 * @generated
	 * @ordered
	 */
	protected EList<ForeignKey> tableFKs;

	/**
	 * The cached value of the '{@link #getTablePK() <em>Table PK</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTablePK()
	 * @generated
	 * @ordered
	 */
	protected PrimaryKeyCon tablePK;

	/**
	 * The cached value of the '{@link #getTableUQ() <em>Table UQ</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableUQ()
	 * @generated
	 * @ordered
	 */
	protected EList<UniqueCon> tableUQ;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> columns;

	/**
	 * The cached value of the '{@link #getTableCHs() <em>Table CHs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableCHs()
	 * @generated
	 * @ordered
	 */
	protected EList<CheckCon> tableCHs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdbmsPackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForeignKey> getTableFKs() {
		if (tableFKs == null) {
			tableFKs = new EObjectContainmentWithInverseEList<ForeignKey>(ForeignKey.class, this, RdbmsPackage.TABLE__TABLE_FKS, RdbmsPackage.FOREIGN_KEY__FK_TABLE);
		}
		return tableFKs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKeyCon getTablePK() {
		return tablePK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTablePK(PrimaryKeyCon newTablePK, NotificationChain msgs) {
		PrimaryKeyCon oldTablePK = tablePK;
		tablePK = newTablePK;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdbmsPackage.TABLE__TABLE_PK, oldTablePK, newTablePK);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTablePK(PrimaryKeyCon newTablePK) {
		if (newTablePK != tablePK) {
			NotificationChain msgs = null;
			if (tablePK != null)
				msgs = ((InternalEObject)tablePK).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RdbmsPackage.TABLE__TABLE_PK, null, msgs);
			if (newTablePK != null)
				msgs = ((InternalEObject)newTablePK).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RdbmsPackage.TABLE__TABLE_PK, null, msgs);
			msgs = basicSetTablePK(newTablePK, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.TABLE__TABLE_PK, newTablePK, newTablePK));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UniqueCon> getTableUQ() {
		if (tableUQ == null) {
			tableUQ = new EObjectContainmentEList<UniqueCon>(UniqueCon.class, this, RdbmsPackage.TABLE__TABLE_UQ);
		}
		return tableUQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getColumns() {
		if (columns == null) {
			columns = new EObjectContainmentEList<Column>(Column.class, this, RdbmsPackage.TABLE__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CheckCon> getTableCHs() {
		if (tableCHs == null) {
			tableCHs = new EObjectContainmentEList<CheckCon>(CheckCon.class, this, RdbmsPackage.TABLE__TABLE_CHS);
		}
		return tableCHs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdbmsPackage.TABLE__TABLE_FKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTableFKs()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdbmsPackage.TABLE__TABLE_FKS:
				return ((InternalEList<?>)getTableFKs()).basicRemove(otherEnd, msgs);
			case RdbmsPackage.TABLE__TABLE_PK:
				return basicSetTablePK(null, msgs);
			case RdbmsPackage.TABLE__TABLE_UQ:
				return ((InternalEList<?>)getTableUQ()).basicRemove(otherEnd, msgs);
			case RdbmsPackage.TABLE__COLUMNS:
				return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
			case RdbmsPackage.TABLE__TABLE_CHS:
				return ((InternalEList<?>)getTableCHs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RdbmsPackage.TABLE__TABLE_FKS:
				return getTableFKs();
			case RdbmsPackage.TABLE__TABLE_PK:
				return getTablePK();
			case RdbmsPackage.TABLE__TABLE_UQ:
				return getTableUQ();
			case RdbmsPackage.TABLE__COLUMNS:
				return getColumns();
			case RdbmsPackage.TABLE__TABLE_CHS:
				return getTableCHs();
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
			case RdbmsPackage.TABLE__TABLE_FKS:
				getTableFKs().clear();
				getTableFKs().addAll((Collection<? extends ForeignKey>)newValue);
				return;
			case RdbmsPackage.TABLE__TABLE_PK:
				setTablePK((PrimaryKeyCon)newValue);
				return;
			case RdbmsPackage.TABLE__TABLE_UQ:
				getTableUQ().clear();
				getTableUQ().addAll((Collection<? extends UniqueCon>)newValue);
				return;
			case RdbmsPackage.TABLE__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends Column>)newValue);
				return;
			case RdbmsPackage.TABLE__TABLE_CHS:
				getTableCHs().clear();
				getTableCHs().addAll((Collection<? extends CheckCon>)newValue);
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
			case RdbmsPackage.TABLE__TABLE_FKS:
				getTableFKs().clear();
				return;
			case RdbmsPackage.TABLE__TABLE_PK:
				setTablePK((PrimaryKeyCon)null);
				return;
			case RdbmsPackage.TABLE__TABLE_UQ:
				getTableUQ().clear();
				return;
			case RdbmsPackage.TABLE__COLUMNS:
				getColumns().clear();
				return;
			case RdbmsPackage.TABLE__TABLE_CHS:
				getTableCHs().clear();
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
			case RdbmsPackage.TABLE__TABLE_FKS:
				return tableFKs != null && !tableFKs.isEmpty();
			case RdbmsPackage.TABLE__TABLE_PK:
				return tablePK != null;
			case RdbmsPackage.TABLE__TABLE_UQ:
				return tableUQ != null && !tableUQ.isEmpty();
			case RdbmsPackage.TABLE__COLUMNS:
				return columns != null && !columns.isEmpty();
			case RdbmsPackage.TABLE__TABLE_CHS:
				return tableCHs != null && !tableCHs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TableImpl
