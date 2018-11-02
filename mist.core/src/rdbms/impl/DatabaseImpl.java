/**
 */
package rdbms.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rdbms.Database;
import rdbms.RdbmsPackage;
import rdbms.SystemDataType;
import rdbms.Table;
import rdbms.UserDefinedDataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rdbms.impl.DatabaseImpl#getUserDefinedDataTypes <em>User Defined Data Types</em>}</li>
 *   <li>{@link rdbms.impl.DatabaseImpl#getTables <em>Tables</em>}</li>
 *   <li>{@link rdbms.impl.DatabaseImpl#getDataTypes <em>Data Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatabaseImpl extends ModelElementImpl implements Database {
	/**
	 * The cached value of the '{@link #getUserDefinedDataTypes() <em>User Defined Data Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDefinedDataTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<UserDefinedDataType> userDefinedDataTypes;

	/**
	 * The cached value of the '{@link #getTables() <em>Tables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTables()
	 * @generated
	 * @ordered
	 */
	protected EList<Table> tables;

	/**
	 * The cached value of the '{@link #getDataTypes() <em>Data Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemDataType> dataTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdbmsPackage.Literals.DATABASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserDefinedDataType> getUserDefinedDataTypes() {
		if (userDefinedDataTypes == null) {
			userDefinedDataTypes = new EObjectContainmentEList<UserDefinedDataType>(UserDefinedDataType.class, this, RdbmsPackage.DATABASE__USER_DEFINED_DATA_TYPES);
		}
		return userDefinedDataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Table> getTables() {
		if (tables == null) {
			tables = new EObjectContainmentEList<Table>(Table.class, this, RdbmsPackage.DATABASE__TABLES);
		}
		return tables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemDataType> getDataTypes() {
		if (dataTypes == null) {
			dataTypes = new EObjectContainmentEList<SystemDataType>(SystemDataType.class, this, RdbmsPackage.DATABASE__DATA_TYPES);
		}
		return dataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdbmsPackage.DATABASE__USER_DEFINED_DATA_TYPES:
				return ((InternalEList<?>)getUserDefinedDataTypes()).basicRemove(otherEnd, msgs);
			case RdbmsPackage.DATABASE__TABLES:
				return ((InternalEList<?>)getTables()).basicRemove(otherEnd, msgs);
			case RdbmsPackage.DATABASE__DATA_TYPES:
				return ((InternalEList<?>)getDataTypes()).basicRemove(otherEnd, msgs);
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
			case RdbmsPackage.DATABASE__USER_DEFINED_DATA_TYPES:
				return getUserDefinedDataTypes();
			case RdbmsPackage.DATABASE__TABLES:
				return getTables();
			case RdbmsPackage.DATABASE__DATA_TYPES:
				return getDataTypes();
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
			case RdbmsPackage.DATABASE__USER_DEFINED_DATA_TYPES:
				getUserDefinedDataTypes().clear();
				getUserDefinedDataTypes().addAll((Collection<? extends UserDefinedDataType>)newValue);
				return;
			case RdbmsPackage.DATABASE__TABLES:
				getTables().clear();
				getTables().addAll((Collection<? extends Table>)newValue);
				return;
			case RdbmsPackage.DATABASE__DATA_TYPES:
				getDataTypes().clear();
				getDataTypes().addAll((Collection<? extends SystemDataType>)newValue);
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
			case RdbmsPackage.DATABASE__USER_DEFINED_DATA_TYPES:
				getUserDefinedDataTypes().clear();
				return;
			case RdbmsPackage.DATABASE__TABLES:
				getTables().clear();
				return;
			case RdbmsPackage.DATABASE__DATA_TYPES:
				getDataTypes().clear();
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
			case RdbmsPackage.DATABASE__USER_DEFINED_DATA_TYPES:
				return userDefinedDataTypes != null && !userDefinedDataTypes.isEmpty();
			case RdbmsPackage.DATABASE__TABLES:
				return tables != null && !tables.isEmpty();
			case RdbmsPackage.DATABASE__DATA_TYPES:
				return dataTypes != null && !dataTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DatabaseImpl
