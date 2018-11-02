/**
 */
package rdbms;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see rdbms.RdbmsFactory
 * @model kind="package"
 * @generated
 */
public interface RdbmsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rdbms";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://rdbms/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RdbmsPackage eINSTANCE = rdbms.impl.RdbmsPackageImpl.init();

	/**
	 * The meta object id for the '{@link rdbms.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdbms.impl.ModelElementImpl
	 * @see rdbms.impl.RdbmsPackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rdbms.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdbms.impl.DatabaseImpl
	 * @see rdbms.impl.RdbmsPackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>User Defined Data Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__USER_DEFINED_DATA_TYPES = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__TABLES = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__DATA_TYPES = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rdbms.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdbms.impl.TableImpl
	 * @see rdbms.impl.RdbmsPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Table FKs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TABLE_FKS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table PK</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TABLE_PK = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Table UQ</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TABLE_UQ = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLUMNS = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Table CHs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TABLE_CHS = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rdbms.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdbms.impl.ColumnImpl
	 * @see rdbms.impl.RdbmsPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__DEFAULT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column In PKand UQ</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__COLUMN_IN_PKAND_UQ = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NULLABLE = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__PRECISION = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__LENGTH = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Column In FK</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__COLUMN_IN_FK = MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Column Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__COLUMN_DATA_TYPE = MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rdbms.impl.ConstraintsImpl <em>Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdbms.impl.ConstraintsImpl
	 * @see rdbms.impl.RdbmsPackageImpl#getConstraints()
	 * @generated
	 */
	int CONSTRAINTS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Deferrable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS__DEFERRABLE = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Deferred</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS__DEFERRED = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rdbms.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdbms.impl.ForeignKeyImpl
	 * @see rdbms.impl.RdbmsPackageImpl#getForeignKey()
	 * @generated
	 */
	int FOREIGN_KEY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__NAME = CONSTRAINTS__NAME;

	/**
	 * The feature id for the '<em><b>Deferrable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__DEFERRABLE = CONSTRAINTS__DEFERRABLE;

	/**
	 * The feature id for the '<em><b>Deferred</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__DEFERRED = CONSTRAINTS__DEFERRED;

	/**
	 * The feature id for the '<em><b>Rhs Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__RHS_KEY = CONSTRAINTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lhs Attr</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__LHS_ATTR = CONSTRAINTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__REFERS_TO = CONSTRAINTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Delete Action RHS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__DELETE_ACTION_RHS = CONSTRAINTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Update Action RHS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__UPDATE_ACTION_RHS = CONSTRAINTS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>FK Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__FK_TABLE = CONSTRAINTS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__MATCH = CONSTRAINTS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Inverse Referential Integrity Con</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__INVERSE_REFERENTIAL_INTEGRITY_CON = CONSTRAINTS_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_FEATURE_COUNT = CONSTRAINTS_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_OPERATION_COUNT = CONSTRAINTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rdbms.impl.CheckConImpl <em>Check Con</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdbms.impl.CheckConImpl
	 * @see rdbms.impl.RdbmsPackageImpl#getCheckCon()
	 * @generated
	 */
	int CHECK_CON = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CON__NAME = CONSTRAINTS__NAME;

	/**
	 * The feature id for the '<em><b>Deferrable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CON__DEFERRABLE = CONSTRAINTS__DEFERRABLE;

	/**
	 * The feature id for the '<em><b>Deferred</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CON__DEFERRED = CONSTRAINTS__DEFERRED;

	/**
	 * The feature id for the '<em><b>Check Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CON__CHECK_CONDITION = CONSTRAINTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Check Con</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CON_FEATURE_COUNT = CONSTRAINTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Check Con</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CON_OPERATION_COUNT = CONSTRAINTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rdbms.impl.PKeyAndUniqueImpl <em>PKey And Unique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdbms.impl.PKeyAndUniqueImpl
	 * @see rdbms.impl.RdbmsPackageImpl#getPKeyAndUnique()
	 * @generated
	 */
	int PKEY_AND_UNIQUE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PKEY_AND_UNIQUE__NAME = CONSTRAINTS__NAME;

	/**
	 * The feature id for the '<em><b>Deferrable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PKEY_AND_UNIQUE__DEFERRABLE = CONSTRAINTS__DEFERRABLE;

	/**
	 * The feature id for the '<em><b>Deferred</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PKEY_AND_UNIQUE__DEFERRED = CONSTRAINTS__DEFERRED;

	/**
	 * The feature id for the '<em><b>PKand UQ Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PKEY_AND_UNIQUE__PKAND_UQ_COLUMNS = CONSTRAINTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PKey And Unique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PKEY_AND_UNIQUE_FEATURE_COUNT = CONSTRAINTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PKey And Unique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PKEY_AND_UNIQUE_OPERATION_COUNT = CONSTRAINTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rdbms.impl.PrimaryKeyConImpl <em>Primary Key Con</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdbms.impl.PrimaryKeyConImpl
	 * @see rdbms.impl.RdbmsPackageImpl#getPrimaryKeyCon()
	 * @generated
	 */
	int PRIMARY_KEY_CON = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_CON__NAME = PKEY_AND_UNIQUE__NAME;

	/**
	 * The feature id for the '<em><b>Deferrable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_CON__DEFERRABLE = PKEY_AND_UNIQUE__DEFERRABLE;

	/**
	 * The feature id for the '<em><b>Deferred</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_CON__DEFERRED = PKEY_AND_UNIQUE__DEFERRED;

	/**
	 * The feature id for the '<em><b>PKand UQ Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_CON__PKAND_UQ_COLUMNS = PKEY_AND_UNIQUE__PKAND_UQ_COLUMNS;

	/**
	 * The number of structural features of the '<em>Primary Key Con</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_CON_FEATURE_COUNT = PKEY_AND_UNIQUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primary Key Con</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_CON_OPERATION_COUNT = PKEY_AND_UNIQUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rdbms.impl.UniqueConImpl <em>Unique Con</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdbms.impl.UniqueConImpl
	 * @see rdbms.impl.RdbmsPackageImpl#getUniqueCon()
	 * @generated
	 */
	int UNIQUE_CON = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CON__NAME = PKEY_AND_UNIQUE__NAME;

	/**
	 * The feature id for the '<em><b>Deferrable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CON__DEFERRABLE = PKEY_AND_UNIQUE__DEFERRABLE;

	/**
	 * The feature id for the '<em><b>Deferred</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CON__DEFERRED = PKEY_AND_UNIQUE__DEFERRED;

	/**
	 * The feature id for the '<em><b>PKand UQ Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CON__PKAND_UQ_COLUMNS = PKEY_AND_UNIQUE__PKAND_UQ_COLUMNS;

	/**
	 * The number of structural features of the '<em>Unique Con</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CON_FEATURE_COUNT = PKEY_AND_UNIQUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unique Con</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CON_OPERATION_COUNT = PKEY_AND_UNIQUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rdbms.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdbms.impl.DataTypeImpl
	 * @see rdbms.impl.RdbmsPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rdbms.impl.SystemDataTypeImpl <em>System Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdbms.impl.SystemDataTypeImpl
	 * @see rdbms.impl.RdbmsPackageImpl#getSystemDataType()
	 * @generated
	 */
	int SYSTEM_DATA_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DATA_TYPE__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Predefined Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DATA_TYPE__PREDEFINED_LENGTH = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Predefined Dec Places</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DATA_TYPE__PREDEFINED_DEC_PLACES = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>System Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DATA_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>System Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DATA_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rdbms.impl.UserDefinedDataTypeImpl <em>User Defined Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdbms.impl.UserDefinedDataTypeImpl
	 * @see rdbms.impl.RdbmsPackageImpl#getUserDefinedDataType()
	 * @generated
	 */
	int USER_DEFINED_DATA_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_DATA_TYPE__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_DATA_TYPE__DATA_TYPE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_DATA_TYPE__PRECISION = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_DATA_TYPE__LENGTH = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_DATA_TYPE__DEFAULT_VALUE = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>User Defined Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_DATA_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>User Defined Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_DATA_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rdbms.Action <em>Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdbms.Action
	 * @see rdbms.impl.RdbmsPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 13;

	/**
	 * The meta object id for the '{@link rdbms.DeferrableAct <em>Deferrable Act</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdbms.DeferrableAct
	 * @see rdbms.impl.RdbmsPackageImpl#getDeferrableAct()
	 * @generated
	 */
	int DEFERRABLE_ACT = 14;

	/**
	 * The meta object id for the '{@link rdbms.DeferredAct <em>Deferred Act</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdbms.DeferredAct
	 * @see rdbms.impl.RdbmsPackageImpl#getDeferredAct()
	 * @generated
	 */
	int DEFERRED_ACT = 15;

	/**
	 * The meta object id for the '{@link rdbms.ReferencingType <em>Referencing Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdbms.ReferencingType
	 * @see rdbms.impl.RdbmsPackageImpl#getReferencingType()
	 * @generated
	 */
	int REFERENCING_TYPE = 16;


	/**
	 * Returns the meta object for class '{@link rdbms.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see rdbms.Database
	 * @generated
	 */
	EClass getDatabase();

	/**
	 * Returns the meta object for the containment reference list '{@link rdbms.Database#getUserDefinedDataTypes <em>User Defined Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User Defined Data Types</em>'.
	 * @see rdbms.Database#getUserDefinedDataTypes()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_UserDefinedDataTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link rdbms.Database#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see rdbms.Database#getTables()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_Tables();

	/**
	 * Returns the meta object for the containment reference list '{@link rdbms.Database#getDataTypes <em>Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Types</em>'.
	 * @see rdbms.Database#getDataTypes()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_DataTypes();

	/**
	 * Returns the meta object for class '{@link rdbms.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see rdbms.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference list '{@link rdbms.Table#getTableFKs <em>Table FKs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table FKs</em>'.
	 * @see rdbms.Table#getTableFKs()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_TableFKs();

	/**
	 * Returns the meta object for the containment reference '{@link rdbms.Table#getTablePK <em>Table PK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table PK</em>'.
	 * @see rdbms.Table#getTablePK()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_TablePK();

	/**
	 * Returns the meta object for the containment reference list '{@link rdbms.Table#getTableUQ <em>Table UQ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table UQ</em>'.
	 * @see rdbms.Table#getTableUQ()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_TableUQ();

	/**
	 * Returns the meta object for the containment reference list '{@link rdbms.Table#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see rdbms.Table#getColumns()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Columns();

	/**
	 * Returns the meta object for the containment reference list '{@link rdbms.Table#getTableCHs <em>Table CHs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table CHs</em>'.
	 * @see rdbms.Table#getTableCHs()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_TableCHs();

	/**
	 * Returns the meta object for class '{@link rdbms.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see rdbms.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link rdbms.Column#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see rdbms.Column#getDefault()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Default();

	/**
	 * Returns the meta object for the reference '{@link rdbms.Column#getColumnInPKandUQ <em>Column In PKand UQ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Column In PKand UQ</em>'.
	 * @see rdbms.Column#getColumnInPKandUQ()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_ColumnInPKandUQ();

	/**
	 * Returns the meta object for the attribute '{@link rdbms.Column#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see rdbms.Column#isNullable()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link rdbms.Column#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see rdbms.Column#getPrecision()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Precision();

	/**
	 * Returns the meta object for the attribute '{@link rdbms.Column#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see rdbms.Column#getLength()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Length();

	/**
	 * Returns the meta object for the reference '{@link rdbms.Column#getColumnInFK <em>Column In FK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Column In FK</em>'.
	 * @see rdbms.Column#getColumnInFK()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_ColumnInFK();

	/**
	 * Returns the meta object for the reference '{@link rdbms.Column#getColumnDataType <em>Column Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Column Data Type</em>'.
	 * @see rdbms.Column#getColumnDataType()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_ColumnDataType();

	/**
	 * Returns the meta object for class '{@link rdbms.ForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foreign Key</em>'.
	 * @see rdbms.ForeignKey
	 * @generated
	 */
	EClass getForeignKey();

	/**
	 * Returns the meta object for the reference '{@link rdbms.ForeignKey#getRhsKey <em>Rhs Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rhs Key</em>'.
	 * @see rdbms.ForeignKey#getRhsKey()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_RhsKey();

	/**
	 * Returns the meta object for the reference list '{@link rdbms.ForeignKey#getLhsAttr <em>Lhs Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lhs Attr</em>'.
	 * @see rdbms.ForeignKey#getLhsAttr()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_LhsAttr();

	/**
	 * Returns the meta object for the reference '{@link rdbms.ForeignKey#getRefersTo <em>Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refers To</em>'.
	 * @see rdbms.ForeignKey#getRefersTo()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_RefersTo();

	/**
	 * Returns the meta object for the attribute '{@link rdbms.ForeignKey#getDeleteActionRHS <em>Delete Action RHS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delete Action RHS</em>'.
	 * @see rdbms.ForeignKey#getDeleteActionRHS()
	 * @see #getForeignKey()
	 * @generated
	 */
	EAttribute getForeignKey_DeleteActionRHS();

	/**
	 * Returns the meta object for the attribute '{@link rdbms.ForeignKey#getUpdateActionRHS <em>Update Action RHS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Action RHS</em>'.
	 * @see rdbms.ForeignKey#getUpdateActionRHS()
	 * @see #getForeignKey()
	 * @generated
	 */
	EAttribute getForeignKey_UpdateActionRHS();

	/**
	 * Returns the meta object for the container reference '{@link rdbms.ForeignKey#getFKTable <em>FK Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>FK Table</em>'.
	 * @see rdbms.ForeignKey#getFKTable()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_FKTable();

	/**
	 * Returns the meta object for the attribute '{@link rdbms.ForeignKey#getMatch <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Match</em>'.
	 * @see rdbms.ForeignKey#getMatch()
	 * @see #getForeignKey()
	 * @generated
	 */
	EAttribute getForeignKey_Match();

	/**
	 * Returns the meta object for the attribute '{@link rdbms.ForeignKey#isInverseReferentialIntegrityCon <em>Inverse Referential Integrity Con</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inverse Referential Integrity Con</em>'.
	 * @see rdbms.ForeignKey#isInverseReferentialIntegrityCon()
	 * @see #getForeignKey()
	 * @generated
	 */
	EAttribute getForeignKey_InverseReferentialIntegrityCon();

	/**
	 * Returns the meta object for class '{@link rdbms.Constraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraints</em>'.
	 * @see rdbms.Constraints
	 * @generated
	 */
	EClass getConstraints();

	/**
	 * Returns the meta object for the attribute '{@link rdbms.Constraints#getDeferrable <em>Deferrable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deferrable</em>'.
	 * @see rdbms.Constraints#getDeferrable()
	 * @see #getConstraints()
	 * @generated
	 */
	EAttribute getConstraints_Deferrable();

	/**
	 * Returns the meta object for the attribute '{@link rdbms.Constraints#getDeferred <em>Deferred</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deferred</em>'.
	 * @see rdbms.Constraints#getDeferred()
	 * @see #getConstraints()
	 * @generated
	 */
	EAttribute getConstraints_Deferred();

	/**
	 * Returns the meta object for class '{@link rdbms.CheckCon <em>Check Con</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Con</em>'.
	 * @see rdbms.CheckCon
	 * @generated
	 */
	EClass getCheckCon();

	/**
	 * Returns the meta object for the attribute '{@link rdbms.CheckCon#getCheckCondition <em>Check Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Condition</em>'.
	 * @see rdbms.CheckCon#getCheckCondition()
	 * @see #getCheckCon()
	 * @generated
	 */
	EAttribute getCheckCon_CheckCondition();

	/**
	 * Returns the meta object for class '{@link rdbms.PKeyAndUnique <em>PKey And Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PKey And Unique</em>'.
	 * @see rdbms.PKeyAndUnique
	 * @generated
	 */
	EClass getPKeyAndUnique();

	/**
	 * Returns the meta object for the reference list '{@link rdbms.PKeyAndUnique#getPKandUQColumns <em>PKand UQ Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>PKand UQ Columns</em>'.
	 * @see rdbms.PKeyAndUnique#getPKandUQColumns()
	 * @see #getPKeyAndUnique()
	 * @generated
	 */
	EReference getPKeyAndUnique_PKandUQColumns();

	/**
	 * Returns the meta object for class '{@link rdbms.PrimaryKeyCon <em>Primary Key Con</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Key Con</em>'.
	 * @see rdbms.PrimaryKeyCon
	 * @generated
	 */
	EClass getPrimaryKeyCon();

	/**
	 * Returns the meta object for class '{@link rdbms.UniqueCon <em>Unique Con</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unique Con</em>'.
	 * @see rdbms.UniqueCon
	 * @generated
	 */
	EClass getUniqueCon();

	/**
	 * Returns the meta object for class '{@link rdbms.SystemDataType <em>System Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Data Type</em>'.
	 * @see rdbms.SystemDataType
	 * @generated
	 */
	EClass getSystemDataType();

	/**
	 * Returns the meta object for the attribute '{@link rdbms.SystemDataType#getPredefinedLength <em>Predefined Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Predefined Length</em>'.
	 * @see rdbms.SystemDataType#getPredefinedLength()
	 * @see #getSystemDataType()
	 * @generated
	 */
	EAttribute getSystemDataType_PredefinedLength();

	/**
	 * Returns the meta object for the attribute '{@link rdbms.SystemDataType#getPredefinedDecPlaces <em>Predefined Dec Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Predefined Dec Places</em>'.
	 * @see rdbms.SystemDataType#getPredefinedDecPlaces()
	 * @see #getSystemDataType()
	 * @generated
	 */
	EAttribute getSystemDataType_PredefinedDecPlaces();

	/**
	 * Returns the meta object for class '{@link rdbms.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see rdbms.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the attribute '{@link rdbms.ModelElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rdbms.ModelElement#getName()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Name();

	/**
	 * Returns the meta object for class '{@link rdbms.UserDefinedDataType <em>User Defined Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Defined Data Type</em>'.
	 * @see rdbms.UserDefinedDataType
	 * @generated
	 */
	EClass getUserDefinedDataType();

	/**
	 * Returns the meta object for the reference '{@link rdbms.UserDefinedDataType#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see rdbms.UserDefinedDataType#getDataType()
	 * @see #getUserDefinedDataType()
	 * @generated
	 */
	EReference getUserDefinedDataType_DataType();

	/**
	 * Returns the meta object for the attribute '{@link rdbms.UserDefinedDataType#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see rdbms.UserDefinedDataType#getPrecision()
	 * @see #getUserDefinedDataType()
	 * @generated
	 */
	EAttribute getUserDefinedDataType_Precision();

	/**
	 * Returns the meta object for the attribute '{@link rdbms.UserDefinedDataType#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see rdbms.UserDefinedDataType#getLength()
	 * @see #getUserDefinedDataType()
	 * @generated
	 */
	EAttribute getUserDefinedDataType_Length();

	/**
	 * Returns the meta object for the attribute '{@link rdbms.UserDefinedDataType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see rdbms.UserDefinedDataType#getDefaultValue()
	 * @see #getUserDefinedDataType()
	 * @generated
	 */
	EAttribute getUserDefinedDataType_DefaultValue();

	/**
	 * Returns the meta object for class '{@link rdbms.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see rdbms.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for enum '{@link rdbms.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action</em>'.
	 * @see rdbms.Action
	 * @generated
	 */
	EEnum getAction();

	/**
	 * Returns the meta object for enum '{@link rdbms.DeferrableAct <em>Deferrable Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Deferrable Act</em>'.
	 * @see rdbms.DeferrableAct
	 * @generated
	 */
	EEnum getDeferrableAct();

	/**
	 * Returns the meta object for enum '{@link rdbms.DeferredAct <em>Deferred Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Deferred Act</em>'.
	 * @see rdbms.DeferredAct
	 * @generated
	 */
	EEnum getDeferredAct();

	/**
	 * Returns the meta object for enum '{@link rdbms.ReferencingType <em>Referencing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Referencing Type</em>'.
	 * @see rdbms.ReferencingType
	 * @generated
	 */
	EEnum getReferencingType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RdbmsFactory getRdbmsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link rdbms.impl.DatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdbms.impl.DatabaseImpl
		 * @see rdbms.impl.RdbmsPackageImpl#getDatabase()
		 * @generated
		 */
		EClass DATABASE = eINSTANCE.getDatabase();

		/**
		 * The meta object literal for the '<em><b>User Defined Data Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__USER_DEFINED_DATA_TYPES = eINSTANCE.getDatabase_UserDefinedDataTypes();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__TABLES = eINSTANCE.getDatabase_Tables();

		/**
		 * The meta object literal for the '<em><b>Data Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__DATA_TYPES = eINSTANCE.getDatabase_DataTypes();

		/**
		 * The meta object literal for the '{@link rdbms.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdbms.impl.TableImpl
		 * @see rdbms.impl.RdbmsPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Table FKs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__TABLE_FKS = eINSTANCE.getTable_TableFKs();

		/**
		 * The meta object literal for the '<em><b>Table PK</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__TABLE_PK = eINSTANCE.getTable_TablePK();

		/**
		 * The meta object literal for the '<em><b>Table UQ</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__TABLE_UQ = eINSTANCE.getTable_TableUQ();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLUMNS = eINSTANCE.getTable_Columns();

		/**
		 * The meta object literal for the '<em><b>Table CHs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__TABLE_CHS = eINSTANCE.getTable_TableCHs();

		/**
		 * The meta object literal for the '{@link rdbms.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdbms.impl.ColumnImpl
		 * @see rdbms.impl.RdbmsPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__DEFAULT = eINSTANCE.getColumn_Default();

		/**
		 * The meta object literal for the '<em><b>Column In PKand UQ</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__COLUMN_IN_PKAND_UQ = eINSTANCE.getColumn_ColumnInPKandUQ();

		/**
		 * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__NULLABLE = eINSTANCE.getColumn_Nullable();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__PRECISION = eINSTANCE.getColumn_Precision();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__LENGTH = eINSTANCE.getColumn_Length();

		/**
		 * The meta object literal for the '<em><b>Column In FK</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__COLUMN_IN_FK = eINSTANCE.getColumn_ColumnInFK();

		/**
		 * The meta object literal for the '<em><b>Column Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__COLUMN_DATA_TYPE = eINSTANCE.getColumn_ColumnDataType();

		/**
		 * The meta object literal for the '{@link rdbms.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdbms.impl.ForeignKeyImpl
		 * @see rdbms.impl.RdbmsPackageImpl#getForeignKey()
		 * @generated
		 */
		EClass FOREIGN_KEY = eINSTANCE.getForeignKey();

		/**
		 * The meta object literal for the '<em><b>Rhs Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__RHS_KEY = eINSTANCE.getForeignKey_RhsKey();

		/**
		 * The meta object literal for the '<em><b>Lhs Attr</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__LHS_ATTR = eINSTANCE.getForeignKey_LhsAttr();

		/**
		 * The meta object literal for the '<em><b>Refers To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__REFERS_TO = eINSTANCE.getForeignKey_RefersTo();

		/**
		 * The meta object literal for the '<em><b>Delete Action RHS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOREIGN_KEY__DELETE_ACTION_RHS = eINSTANCE.getForeignKey_DeleteActionRHS();

		/**
		 * The meta object literal for the '<em><b>Update Action RHS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOREIGN_KEY__UPDATE_ACTION_RHS = eINSTANCE.getForeignKey_UpdateActionRHS();

		/**
		 * The meta object literal for the '<em><b>FK Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__FK_TABLE = eINSTANCE.getForeignKey_FKTable();

		/**
		 * The meta object literal for the '<em><b>Match</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOREIGN_KEY__MATCH = eINSTANCE.getForeignKey_Match();

		/**
		 * The meta object literal for the '<em><b>Inverse Referential Integrity Con</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOREIGN_KEY__INVERSE_REFERENTIAL_INTEGRITY_CON = eINSTANCE.getForeignKey_InverseReferentialIntegrityCon();

		/**
		 * The meta object literal for the '{@link rdbms.impl.ConstraintsImpl <em>Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdbms.impl.ConstraintsImpl
		 * @see rdbms.impl.RdbmsPackageImpl#getConstraints()
		 * @generated
		 */
		EClass CONSTRAINTS = eINSTANCE.getConstraints();

		/**
		 * The meta object literal for the '<em><b>Deferrable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINTS__DEFERRABLE = eINSTANCE.getConstraints_Deferrable();

		/**
		 * The meta object literal for the '<em><b>Deferred</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINTS__DEFERRED = eINSTANCE.getConstraints_Deferred();

		/**
		 * The meta object literal for the '{@link rdbms.impl.CheckConImpl <em>Check Con</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdbms.impl.CheckConImpl
		 * @see rdbms.impl.RdbmsPackageImpl#getCheckCon()
		 * @generated
		 */
		EClass CHECK_CON = eINSTANCE.getCheckCon();

		/**
		 * The meta object literal for the '<em><b>Check Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_CON__CHECK_CONDITION = eINSTANCE.getCheckCon_CheckCondition();

		/**
		 * The meta object literal for the '{@link rdbms.impl.PKeyAndUniqueImpl <em>PKey And Unique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdbms.impl.PKeyAndUniqueImpl
		 * @see rdbms.impl.RdbmsPackageImpl#getPKeyAndUnique()
		 * @generated
		 */
		EClass PKEY_AND_UNIQUE = eINSTANCE.getPKeyAndUnique();

		/**
		 * The meta object literal for the '<em><b>PKand UQ Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PKEY_AND_UNIQUE__PKAND_UQ_COLUMNS = eINSTANCE.getPKeyAndUnique_PKandUQColumns();

		/**
		 * The meta object literal for the '{@link rdbms.impl.PrimaryKeyConImpl <em>Primary Key Con</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdbms.impl.PrimaryKeyConImpl
		 * @see rdbms.impl.RdbmsPackageImpl#getPrimaryKeyCon()
		 * @generated
		 */
		EClass PRIMARY_KEY_CON = eINSTANCE.getPrimaryKeyCon();

		/**
		 * The meta object literal for the '{@link rdbms.impl.UniqueConImpl <em>Unique Con</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdbms.impl.UniqueConImpl
		 * @see rdbms.impl.RdbmsPackageImpl#getUniqueCon()
		 * @generated
		 */
		EClass UNIQUE_CON = eINSTANCE.getUniqueCon();

		/**
		 * The meta object literal for the '{@link rdbms.impl.SystemDataTypeImpl <em>System Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdbms.impl.SystemDataTypeImpl
		 * @see rdbms.impl.RdbmsPackageImpl#getSystemDataType()
		 * @generated
		 */
		EClass SYSTEM_DATA_TYPE = eINSTANCE.getSystemDataType();

		/**
		 * The meta object literal for the '<em><b>Predefined Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_DATA_TYPE__PREDEFINED_LENGTH = eINSTANCE.getSystemDataType_PredefinedLength();

		/**
		 * The meta object literal for the '<em><b>Predefined Dec Places</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_DATA_TYPE__PREDEFINED_DEC_PLACES = eINSTANCE.getSystemDataType_PredefinedDecPlaces();

		/**
		 * The meta object literal for the '{@link rdbms.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdbms.impl.ModelElementImpl
		 * @see rdbms.impl.RdbmsPackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__NAME = eINSTANCE.getModelElement_Name();

		/**
		 * The meta object literal for the '{@link rdbms.impl.UserDefinedDataTypeImpl <em>User Defined Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdbms.impl.UserDefinedDataTypeImpl
		 * @see rdbms.impl.RdbmsPackageImpl#getUserDefinedDataType()
		 * @generated
		 */
		EClass USER_DEFINED_DATA_TYPE = eINSTANCE.getUserDefinedDataType();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_DEFINED_DATA_TYPE__DATA_TYPE = eINSTANCE.getUserDefinedDataType_DataType();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_DEFINED_DATA_TYPE__PRECISION = eINSTANCE.getUserDefinedDataType_Precision();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_DEFINED_DATA_TYPE__LENGTH = eINSTANCE.getUserDefinedDataType_Length();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_DEFINED_DATA_TYPE__DEFAULT_VALUE = eINSTANCE.getUserDefinedDataType_DefaultValue();

		/**
		 * The meta object literal for the '{@link rdbms.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdbms.impl.DataTypeImpl
		 * @see rdbms.impl.RdbmsPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link rdbms.Action <em>Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdbms.Action
		 * @see rdbms.impl.RdbmsPackageImpl#getAction()
		 * @generated
		 */
		EEnum ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link rdbms.DeferrableAct <em>Deferrable Act</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdbms.DeferrableAct
		 * @see rdbms.impl.RdbmsPackageImpl#getDeferrableAct()
		 * @generated
		 */
		EEnum DEFERRABLE_ACT = eINSTANCE.getDeferrableAct();

		/**
		 * The meta object literal for the '{@link rdbms.DeferredAct <em>Deferred Act</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdbms.DeferredAct
		 * @see rdbms.impl.RdbmsPackageImpl#getDeferredAct()
		 * @generated
		 */
		EEnum DEFERRED_ACT = eINSTANCE.getDeferredAct();

		/**
		 * The meta object literal for the '{@link rdbms.ReferencingType <em>Referencing Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdbms.ReferencingType
		 * @see rdbms.impl.RdbmsPackageImpl#getReferencingType()
		 * @generated
		 */
		EEnum REFERENCING_TYPE = eINSTANCE.getReferencingType();

	}

} //RdbmsPackage
