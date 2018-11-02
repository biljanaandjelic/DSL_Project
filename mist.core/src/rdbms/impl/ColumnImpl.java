/**
 */
package rdbms.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rdbms.Column;
import rdbms.DataType;
import rdbms.ForeignKey;
import rdbms.PKeyAndUnique;
import rdbms.RdbmsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rdbms.impl.ColumnImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link rdbms.impl.ColumnImpl#getColumnInPKandUQ <em>Column In PKand UQ</em>}</li>
 *   <li>{@link rdbms.impl.ColumnImpl#isNullable <em>Nullable</em>}</li>
 *   <li>{@link rdbms.impl.ColumnImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link rdbms.impl.ColumnImpl#getLength <em>Length</em>}</li>
 *   <li>{@link rdbms.impl.ColumnImpl#getColumnInFK <em>Column In FK</em>}</li>
 *   <li>{@link rdbms.impl.ColumnImpl#getColumnDataType <em>Column Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColumnImpl extends ModelElementImpl implements Column {
	/**
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected String default_ = DEFAULT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColumnInPKandUQ() <em>Column In PKand UQ</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnInPKandUQ()
	 * @generated
	 * @ordered
	 */
	protected PKeyAndUnique columnInPKandUQ;

	/**
	 * The default value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNullable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NULLABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNullable()
	 * @generated
	 * @ordered
	 */
	protected boolean nullable = NULLABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final int PRECISION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected int precision = PRECISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final int LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected int length = LENGTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColumnInFK() <em>Column In FK</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnInFK()
	 * @generated
	 * @ordered
	 */
	protected ForeignKey columnInFK;

	/**
	 * The cached value of the '{@link #getColumnDataType() <em>Column Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnDataType()
	 * @generated
	 * @ordered
	 */
	protected DataType columnDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdbmsPackage.Literals.COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(String newDefault) {
		String oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.COLUMN__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PKeyAndUnique getColumnInPKandUQ() {
		if (columnInPKandUQ != null && columnInPKandUQ.eIsProxy()) {
			InternalEObject oldColumnInPKandUQ = (InternalEObject)columnInPKandUQ;
			columnInPKandUQ = (PKeyAndUnique)eResolveProxy(oldColumnInPKandUQ);
			if (columnInPKandUQ != oldColumnInPKandUQ) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdbmsPackage.COLUMN__COLUMN_IN_PKAND_UQ, oldColumnInPKandUQ, columnInPKandUQ));
			}
		}
		return columnInPKandUQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PKeyAndUnique basicGetColumnInPKandUQ() {
		return columnInPKandUQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnInPKandUQ(PKeyAndUnique newColumnInPKandUQ) {
		PKeyAndUnique oldColumnInPKandUQ = columnInPKandUQ;
		columnInPKandUQ = newColumnInPKandUQ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.COLUMN__COLUMN_IN_PKAND_UQ, oldColumnInPKandUQ, columnInPKandUQ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNullable() {
		return nullable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullable(boolean newNullable) {
		boolean oldNullable = nullable;
		nullable = newNullable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.COLUMN__NULLABLE, oldNullable, nullable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrecision() {
		return precision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecision(int newPrecision) {
		int oldPrecision = precision;
		precision = newPrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.COLUMN__PRECISION, oldPrecision, precision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(int newLength) {
		int oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.COLUMN__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForeignKey getColumnInFK() {
		if (columnInFK != null && columnInFK.eIsProxy()) {
			InternalEObject oldColumnInFK = (InternalEObject)columnInFK;
			columnInFK = (ForeignKey)eResolveProxy(oldColumnInFK);
			if (columnInFK != oldColumnInFK) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdbmsPackage.COLUMN__COLUMN_IN_FK, oldColumnInFK, columnInFK));
			}
		}
		return columnInFK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForeignKey basicGetColumnInFK() {
		return columnInFK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnInFK(ForeignKey newColumnInFK) {
		ForeignKey oldColumnInFK = columnInFK;
		columnInFK = newColumnInFK;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.COLUMN__COLUMN_IN_FK, oldColumnInFK, columnInFK));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getColumnDataType() {
		if (columnDataType != null && columnDataType.eIsProxy()) {
			InternalEObject oldColumnDataType = (InternalEObject)columnDataType;
			columnDataType = (DataType)eResolveProxy(oldColumnDataType);
			if (columnDataType != oldColumnDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdbmsPackage.COLUMN__COLUMN_DATA_TYPE, oldColumnDataType, columnDataType));
			}
		}
		return columnDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetColumnDataType() {
		return columnDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnDataType(DataType newColumnDataType) {
		DataType oldColumnDataType = columnDataType;
		columnDataType = newColumnDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.COLUMN__COLUMN_DATA_TYPE, oldColumnDataType, columnDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RdbmsPackage.COLUMN__DEFAULT:
				return getDefault();
			case RdbmsPackage.COLUMN__COLUMN_IN_PKAND_UQ:
				if (resolve) return getColumnInPKandUQ();
				return basicGetColumnInPKandUQ();
			case RdbmsPackage.COLUMN__NULLABLE:
				return isNullable();
			case RdbmsPackage.COLUMN__PRECISION:
				return getPrecision();
			case RdbmsPackage.COLUMN__LENGTH:
				return getLength();
			case RdbmsPackage.COLUMN__COLUMN_IN_FK:
				if (resolve) return getColumnInFK();
				return basicGetColumnInFK();
			case RdbmsPackage.COLUMN__COLUMN_DATA_TYPE:
				if (resolve) return getColumnDataType();
				return basicGetColumnDataType();
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
			case RdbmsPackage.COLUMN__DEFAULT:
				setDefault((String)newValue);
				return;
			case RdbmsPackage.COLUMN__COLUMN_IN_PKAND_UQ:
				setColumnInPKandUQ((PKeyAndUnique)newValue);
				return;
			case RdbmsPackage.COLUMN__NULLABLE:
				setNullable((Boolean)newValue);
				return;
			case RdbmsPackage.COLUMN__PRECISION:
				setPrecision((Integer)newValue);
				return;
			case RdbmsPackage.COLUMN__LENGTH:
				setLength((Integer)newValue);
				return;
			case RdbmsPackage.COLUMN__COLUMN_IN_FK:
				setColumnInFK((ForeignKey)newValue);
				return;
			case RdbmsPackage.COLUMN__COLUMN_DATA_TYPE:
				setColumnDataType((DataType)newValue);
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
			case RdbmsPackage.COLUMN__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case RdbmsPackage.COLUMN__COLUMN_IN_PKAND_UQ:
				setColumnInPKandUQ((PKeyAndUnique)null);
				return;
			case RdbmsPackage.COLUMN__NULLABLE:
				setNullable(NULLABLE_EDEFAULT);
				return;
			case RdbmsPackage.COLUMN__PRECISION:
				setPrecision(PRECISION_EDEFAULT);
				return;
			case RdbmsPackage.COLUMN__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case RdbmsPackage.COLUMN__COLUMN_IN_FK:
				setColumnInFK((ForeignKey)null);
				return;
			case RdbmsPackage.COLUMN__COLUMN_DATA_TYPE:
				setColumnDataType((DataType)null);
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
			case RdbmsPackage.COLUMN__DEFAULT:
				return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
			case RdbmsPackage.COLUMN__COLUMN_IN_PKAND_UQ:
				return columnInPKandUQ != null;
			case RdbmsPackage.COLUMN__NULLABLE:
				return nullable != NULLABLE_EDEFAULT;
			case RdbmsPackage.COLUMN__PRECISION:
				return precision != PRECISION_EDEFAULT;
			case RdbmsPackage.COLUMN__LENGTH:
				return length != LENGTH_EDEFAULT;
			case RdbmsPackage.COLUMN__COLUMN_IN_FK:
				return columnInFK != null;
			case RdbmsPackage.COLUMN__COLUMN_DATA_TYPE:
				return columnDataType != null;
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
		result.append(" (default: ");
		result.append(default_);
		result.append(", nullable: ");
		result.append(nullable);
		result.append(", precision: ");
		result.append(precision);
		result.append(", length: ");
		result.append(length);
		result.append(')');
		return result.toString();
	}

} //ColumnImpl
