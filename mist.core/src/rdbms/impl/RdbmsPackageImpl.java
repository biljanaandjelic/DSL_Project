/**
 */
package rdbms.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import rdbms.Action;
import rdbms.CheckCon;
import rdbms.Column;
import rdbms.Constraints;
import rdbms.DataType;
import rdbms.Database;
import rdbms.DeferrableAct;
import rdbms.DeferredAct;
import rdbms.ForeignKey;
import rdbms.ModelElement;
import rdbms.PKeyAndUnique;
import rdbms.PrimaryKeyCon;
import rdbms.RdbmsFactory;
import rdbms.RdbmsPackage;
import rdbms.ReferencingType;
import rdbms.SystemDataType;
import rdbms.Table;
import rdbms.UniqueCon;
import rdbms.UserDefinedDataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RdbmsPackageImpl extends EPackageImpl implements RdbmsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass foreignKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkConEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pKeyAndUniqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primaryKeyConEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uniqueConEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userDefinedDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deferrableActEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deferredActEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum referencingTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see rdbms.RdbmsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RdbmsPackageImpl() {
		super(eNS_URI, RdbmsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RdbmsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RdbmsPackage init() {
		if (isInited) return (RdbmsPackage)EPackage.Registry.INSTANCE.getEPackage(RdbmsPackage.eNS_URI);

		// Obtain or create and register package
		RdbmsPackageImpl theRdbmsPackage = (RdbmsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RdbmsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RdbmsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theRdbmsPackage.createPackageContents();

		// Initialize created meta-data
		theRdbmsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRdbmsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RdbmsPackage.eNS_URI, theRdbmsPackage);
		return theRdbmsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabase() {
		return databaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabase_UserDefinedDataTypes() {
		return (EReference)databaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabase_Tables() {
		return (EReference)databaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabase_DataTypes() {
		return (EReference)databaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_TableFKs() {
		return (EReference)tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_TablePK() {
		return (EReference)tableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_TableUQ() {
		return (EReference)tableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Columns() {
		return (EReference)tableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_TableCHs() {
		return (EReference)tableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumn() {
		return columnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Default() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumn_ColumnInPKandUQ() {
		return (EReference)columnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Nullable() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Precision() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Length() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumn_ColumnInFK() {
		return (EReference)columnEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumn_ColumnDataType() {
		return (EReference)columnEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForeignKey() {
		return foreignKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForeignKey_RhsKey() {
		return (EReference)foreignKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForeignKey_LhsAttr() {
		return (EReference)foreignKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForeignKey_RefersTo() {
		return (EReference)foreignKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForeignKey_DeleteActionRHS() {
		return (EAttribute)foreignKeyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForeignKey_UpdateActionRHS() {
		return (EAttribute)foreignKeyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForeignKey_FKTable() {
		return (EReference)foreignKeyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForeignKey_Match() {
		return (EAttribute)foreignKeyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForeignKey_InverseReferentialIntegrityCon() {
		return (EAttribute)foreignKeyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraints() {
		return constraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraints_Deferrable() {
		return (EAttribute)constraintsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraints_Deferred() {
		return (EAttribute)constraintsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckCon() {
		return checkConEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckCon_CheckCondition() {
		return (EAttribute)checkConEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPKeyAndUnique() {
		return pKeyAndUniqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPKeyAndUnique_PKandUQColumns() {
		return (EReference)pKeyAndUniqueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimaryKeyCon() {
		return primaryKeyConEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniqueCon() {
		return uniqueConEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemDataType() {
		return systemDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemDataType_PredefinedLength() {
		return (EAttribute)systemDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemDataType_PredefinedDecPlaces() {
		return (EAttribute)systemDataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelElement() {
		return modelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElement_Name() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserDefinedDataType() {
		return userDefinedDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserDefinedDataType_DataType() {
		return (EReference)userDefinedDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserDefinedDataType_Precision() {
		return (EAttribute)userDefinedDataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserDefinedDataType_Length() {
		return (EAttribute)userDefinedDataTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserDefinedDataType_DefaultValue() {
		return (EAttribute)userDefinedDataTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAction() {
		return actionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeferrableAct() {
		return deferrableActEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeferredAct() {
		return deferredActEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReferencingType() {
		return referencingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdbmsFactory getRdbmsFactory() {
		return (RdbmsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		databaseEClass = createEClass(DATABASE);
		createEReference(databaseEClass, DATABASE__USER_DEFINED_DATA_TYPES);
		createEReference(databaseEClass, DATABASE__TABLES);
		createEReference(databaseEClass, DATABASE__DATA_TYPES);

		tableEClass = createEClass(TABLE);
		createEReference(tableEClass, TABLE__TABLE_FKS);
		createEReference(tableEClass, TABLE__TABLE_PK);
		createEReference(tableEClass, TABLE__TABLE_UQ);
		createEReference(tableEClass, TABLE__COLUMNS);
		createEReference(tableEClass, TABLE__TABLE_CHS);

		columnEClass = createEClass(COLUMN);
		createEAttribute(columnEClass, COLUMN__DEFAULT);
		createEReference(columnEClass, COLUMN__COLUMN_IN_PKAND_UQ);
		createEAttribute(columnEClass, COLUMN__NULLABLE);
		createEAttribute(columnEClass, COLUMN__PRECISION);
		createEAttribute(columnEClass, COLUMN__LENGTH);
		createEReference(columnEClass, COLUMN__COLUMN_IN_FK);
		createEReference(columnEClass, COLUMN__COLUMN_DATA_TYPE);

		foreignKeyEClass = createEClass(FOREIGN_KEY);
		createEReference(foreignKeyEClass, FOREIGN_KEY__RHS_KEY);
		createEReference(foreignKeyEClass, FOREIGN_KEY__LHS_ATTR);
		createEReference(foreignKeyEClass, FOREIGN_KEY__REFERS_TO);
		createEAttribute(foreignKeyEClass, FOREIGN_KEY__DELETE_ACTION_RHS);
		createEAttribute(foreignKeyEClass, FOREIGN_KEY__UPDATE_ACTION_RHS);
		createEReference(foreignKeyEClass, FOREIGN_KEY__FK_TABLE);
		createEAttribute(foreignKeyEClass, FOREIGN_KEY__MATCH);
		createEAttribute(foreignKeyEClass, FOREIGN_KEY__INVERSE_REFERENTIAL_INTEGRITY_CON);

		constraintsEClass = createEClass(CONSTRAINTS);
		createEAttribute(constraintsEClass, CONSTRAINTS__DEFERRABLE);
		createEAttribute(constraintsEClass, CONSTRAINTS__DEFERRED);

		checkConEClass = createEClass(CHECK_CON);
		createEAttribute(checkConEClass, CHECK_CON__CHECK_CONDITION);

		pKeyAndUniqueEClass = createEClass(PKEY_AND_UNIQUE);
		createEReference(pKeyAndUniqueEClass, PKEY_AND_UNIQUE__PKAND_UQ_COLUMNS);

		primaryKeyConEClass = createEClass(PRIMARY_KEY_CON);

		uniqueConEClass = createEClass(UNIQUE_CON);

		systemDataTypeEClass = createEClass(SYSTEM_DATA_TYPE);
		createEAttribute(systemDataTypeEClass, SYSTEM_DATA_TYPE__PREDEFINED_LENGTH);
		createEAttribute(systemDataTypeEClass, SYSTEM_DATA_TYPE__PREDEFINED_DEC_PLACES);

		modelElementEClass = createEClass(MODEL_ELEMENT);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__NAME);

		userDefinedDataTypeEClass = createEClass(USER_DEFINED_DATA_TYPE);
		createEReference(userDefinedDataTypeEClass, USER_DEFINED_DATA_TYPE__DATA_TYPE);
		createEAttribute(userDefinedDataTypeEClass, USER_DEFINED_DATA_TYPE__PRECISION);
		createEAttribute(userDefinedDataTypeEClass, USER_DEFINED_DATA_TYPE__LENGTH);
		createEAttribute(userDefinedDataTypeEClass, USER_DEFINED_DATA_TYPE__DEFAULT_VALUE);

		dataTypeEClass = createEClass(DATA_TYPE);

		// Create enums
		actionEEnum = createEEnum(ACTION);
		deferrableActEEnum = createEEnum(DEFERRABLE_ACT);
		deferredActEEnum = createEEnum(DEFERRED_ACT);
		referencingTypeEEnum = createEEnum(REFERENCING_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		databaseEClass.getESuperTypes().add(this.getModelElement());
		tableEClass.getESuperTypes().add(this.getModelElement());
		columnEClass.getESuperTypes().add(this.getModelElement());
		foreignKeyEClass.getESuperTypes().add(this.getConstraints());
		constraintsEClass.getESuperTypes().add(this.getModelElement());
		checkConEClass.getESuperTypes().add(this.getConstraints());
		pKeyAndUniqueEClass.getESuperTypes().add(this.getConstraints());
		primaryKeyConEClass.getESuperTypes().add(this.getPKeyAndUnique());
		uniqueConEClass.getESuperTypes().add(this.getPKeyAndUnique());
		systemDataTypeEClass.getESuperTypes().add(this.getDataType());
		userDefinedDataTypeEClass.getESuperTypes().add(this.getDataType());
		dataTypeEClass.getESuperTypes().add(this.getModelElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(databaseEClass, Database.class, "Database", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatabase_UserDefinedDataTypes(), this.getUserDefinedDataType(), null, "userDefinedDataTypes", null, 0, -1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabase_Tables(), this.getTable(), null, "tables", null, 0, -1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabase_DataTypes(), this.getSystemDataType(), null, "dataTypes", null, 0, -1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTable_TableFKs(), this.getForeignKey(), this.getForeignKey_FKTable(), "tableFKs", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_TablePK(), this.getPrimaryKeyCon(), null, "tablePK", null, 1, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_TableUQ(), this.getUniqueCon(), null, "tableUQ", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Columns(), this.getColumn(), null, "columns", null, 1, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_TableCHs(), this.getCheckCon(), null, "tableCHs", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumn_Default(), ecorePackage.getEString(), "default", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColumn_ColumnInPKandUQ(), this.getPKeyAndUnique(), null, "columnInPKandUQ", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Nullable(), ecorePackage.getEBoolean(), "nullable", null, 1, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Precision(), ecorePackage.getEInt(), "precision", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Length(), ecorePackage.getEInt(), "length", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColumn_ColumnInFK(), this.getForeignKey(), null, "columnInFK", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColumn_ColumnDataType(), this.getDataType(), null, "columnDataType", null, 1, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(foreignKeyEClass, ForeignKey.class, "ForeignKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForeignKey_RhsKey(), this.getPKeyAndUnique(), null, "rhsKey", null, 1, 1, ForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForeignKey_LhsAttr(), this.getColumn(), null, "lhsAttr", null, 1, -1, ForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForeignKey_RefersTo(), this.getTable(), null, "refersTo", null, 1, 1, ForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForeignKey_DeleteActionRHS(), this.getAction(), "deleteActionRHS", null, 0, 1, ForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForeignKey_UpdateActionRHS(), this.getAction(), "updateActionRHS", null, 0, 1, ForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForeignKey_FKTable(), this.getTable(), this.getTable_TableFKs(), "FKTable", null, 1, 1, ForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForeignKey_Match(), this.getReferencingType(), "match", null, 0, 1, ForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForeignKey_InverseReferentialIntegrityCon(), ecorePackage.getEBoolean(), "inverseReferentialIntegrityCon", null, 0, 1, ForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintsEClass, Constraints.class, "Constraints", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstraints_Deferrable(), this.getDeferrableAct(), "deferrable", null, 0, 1, Constraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraints_Deferred(), this.getDeferredAct(), "deferred", null, 0, 1, Constraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkConEClass, CheckCon.class, "CheckCon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCheckCon_CheckCondition(), ecorePackage.getEString(), "checkCondition", null, 0, 1, CheckCon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pKeyAndUniqueEClass, PKeyAndUnique.class, "PKeyAndUnique", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPKeyAndUnique_PKandUQColumns(), this.getColumn(), null, "PKandUQColumns", null, 1, -1, PKeyAndUnique.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primaryKeyConEClass, PrimaryKeyCon.class, "PrimaryKeyCon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uniqueConEClass, UniqueCon.class, "UniqueCon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemDataTypeEClass, SystemDataType.class, "SystemDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemDataType_PredefinedLength(), ecorePackage.getEInt(), "predefinedLength", null, 0, 1, SystemDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemDataType_PredefinedDecPlaces(), ecorePackage.getEInt(), "predefinedDecPlaces", null, 0, 1, SystemDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelElementEClass, ModelElement.class, "ModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userDefinedDataTypeEClass, UserDefinedDataType.class, "UserDefinedDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserDefinedDataType_DataType(), this.getSystemDataType(), null, "dataType", null, 1, 1, UserDefinedDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserDefinedDataType_Precision(), ecorePackage.getEInt(), "precision", null, 0, 1, UserDefinedDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserDefinedDataType_Length(), ecorePackage.getEInt(), "length", null, 0, 1, UserDefinedDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserDefinedDataType_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, UserDefinedDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(actionEEnum, Action.class, "Action");
		addEEnumLiteral(actionEEnum, Action.RESTRICT);
		addEEnumLiteral(actionEEnum, Action.NO_ACTION);
		addEEnumLiteral(actionEEnum, Action.SET_NULL);
		addEEnumLiteral(actionEEnum, Action.SET_DEFAULT);
		addEEnumLiteral(actionEEnum, Action.CASCADE);

		initEEnum(deferrableActEEnum, DeferrableAct.class, "DeferrableAct");
		addEEnumLiteral(deferrableActEEnum, DeferrableAct.DEFFERABLE);
		addEEnumLiteral(deferrableActEEnum, DeferrableAct.NOT_DEFFERABLE);

		initEEnum(deferredActEEnum, DeferredAct.class, "DeferredAct");
		addEEnumLiteral(deferredActEEnum, DeferredAct.INITIALLY_IMMEDIATE);
		addEEnumLiteral(deferredActEEnum, DeferredAct.INITIALLY_DEFERRED);

		initEEnum(referencingTypeEEnum, ReferencingType.class, "ReferencingType");
		addEEnumLiteral(referencingTypeEEnum, ReferencingType.DEFAULT);
		addEEnumLiteral(referencingTypeEEnum, ReferencingType.PARTIAL);
		addEEnumLiteral(referencingTypeEEnum, ReferencingType.FULL);

		// Create resource
		createResource(eNS_URI);
	}

} //RdbmsPackageImpl
