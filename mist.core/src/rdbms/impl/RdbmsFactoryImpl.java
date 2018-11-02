/**
 */
package rdbms.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import rdbms.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RdbmsFactoryImpl extends EFactoryImpl implements RdbmsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RdbmsFactory init() {
		try {
			RdbmsFactory theRdbmsFactory = (RdbmsFactory)EPackage.Registry.INSTANCE.getEFactory(RdbmsPackage.eNS_URI);
			if (theRdbmsFactory != null) {
				return theRdbmsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RdbmsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdbmsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RdbmsPackage.DATABASE: return createDatabase();
			case RdbmsPackage.TABLE: return createTable();
			case RdbmsPackage.COLUMN: return createColumn();
			case RdbmsPackage.FOREIGN_KEY: return createForeignKey();
			case RdbmsPackage.CHECK_CON: return createCheckCon();
			case RdbmsPackage.PRIMARY_KEY_CON: return createPrimaryKeyCon();
			case RdbmsPackage.UNIQUE_CON: return createUniqueCon();
			case RdbmsPackage.SYSTEM_DATA_TYPE: return createSystemDataType();
			case RdbmsPackage.USER_DEFINED_DATA_TYPE: return createUserDefinedDataType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RdbmsPackage.ACTION:
				return createActionFromString(eDataType, initialValue);
			case RdbmsPackage.DEFERRABLE_ACT:
				return createDeferrableActFromString(eDataType, initialValue);
			case RdbmsPackage.DEFERRED_ACT:
				return createDeferredActFromString(eDataType, initialValue);
			case RdbmsPackage.REFERENCING_TYPE:
				return createReferencingTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RdbmsPackage.ACTION:
				return convertActionToString(eDataType, instanceValue);
			case RdbmsPackage.DEFERRABLE_ACT:
				return convertDeferrableActToString(eDataType, instanceValue);
			case RdbmsPackage.DEFERRED_ACT:
				return convertDeferredActToString(eDataType, instanceValue);
			case RdbmsPackage.REFERENCING_TYPE:
				return convertReferencingTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database createDatabase() {
		DatabaseImpl database = new DatabaseImpl();
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column createColumn() {
		ColumnImpl column = new ColumnImpl();
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForeignKey createForeignKey() {
		ForeignKeyImpl foreignKey = new ForeignKeyImpl();
		return foreignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckCon createCheckCon() {
		CheckConImpl checkCon = new CheckConImpl();
		return checkCon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKeyCon createPrimaryKeyCon() {
		PrimaryKeyConImpl primaryKeyCon = new PrimaryKeyConImpl();
		return primaryKeyCon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniqueCon createUniqueCon() {
		UniqueConImpl uniqueCon = new UniqueConImpl();
		return uniqueCon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemDataType createSystemDataType() {
		SystemDataTypeImpl systemDataType = new SystemDataTypeImpl();
		return systemDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserDefinedDataType createUserDefinedDataType() {
		UserDefinedDataTypeImpl userDefinedDataType = new UserDefinedDataTypeImpl();
		return userDefinedDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createActionFromString(EDataType eDataType, String initialValue) {
		Action result = Action.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeferrableAct createDeferrableActFromString(EDataType eDataType, String initialValue) {
		DeferrableAct result = DeferrableAct.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeferrableActToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeferredAct createDeferredActFromString(EDataType eDataType, String initialValue) {
		DeferredAct result = DeferredAct.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeferredActToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencingType createReferencingTypeFromString(EDataType eDataType, String initialValue) {
		ReferencingType result = ReferencingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferencingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdbmsPackage getRdbmsPackage() {
		return (RdbmsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RdbmsPackage getPackage() {
		return RdbmsPackage.eINSTANCE;
	}

} //RdbmsFactoryImpl
