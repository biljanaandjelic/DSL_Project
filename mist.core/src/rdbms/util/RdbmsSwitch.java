/**
 */
package rdbms.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import rdbms.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see rdbms.RdbmsPackage
 * @generated
 */
public class RdbmsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RdbmsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdbmsSwitch() {
		if (modelPackage == null) {
			modelPackage = RdbmsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RdbmsPackage.DATABASE: {
				Database database = (Database)theEObject;
				T result = caseDatabase(database);
				if (result == null) result = caseModelElement(database);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdbmsPackage.TABLE: {
				Table table = (Table)theEObject;
				T result = caseTable(table);
				if (result == null) result = caseModelElement(table);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdbmsPackage.COLUMN: {
				Column column = (Column)theEObject;
				T result = caseColumn(column);
				if (result == null) result = caseModelElement(column);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdbmsPackage.FOREIGN_KEY: {
				ForeignKey foreignKey = (ForeignKey)theEObject;
				T result = caseForeignKey(foreignKey);
				if (result == null) result = caseConstraints(foreignKey);
				if (result == null) result = caseModelElement(foreignKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdbmsPackage.CONSTRAINTS: {
				Constraints constraints = (Constraints)theEObject;
				T result = caseConstraints(constraints);
				if (result == null) result = caseModelElement(constraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdbmsPackage.CHECK_CON: {
				CheckCon checkCon = (CheckCon)theEObject;
				T result = caseCheckCon(checkCon);
				if (result == null) result = caseConstraints(checkCon);
				if (result == null) result = caseModelElement(checkCon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdbmsPackage.PKEY_AND_UNIQUE: {
				PKeyAndUnique pKeyAndUnique = (PKeyAndUnique)theEObject;
				T result = casePKeyAndUnique(pKeyAndUnique);
				if (result == null) result = caseConstraints(pKeyAndUnique);
				if (result == null) result = caseModelElement(pKeyAndUnique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdbmsPackage.PRIMARY_KEY_CON: {
				PrimaryKeyCon primaryKeyCon = (PrimaryKeyCon)theEObject;
				T result = casePrimaryKeyCon(primaryKeyCon);
				if (result == null) result = casePKeyAndUnique(primaryKeyCon);
				if (result == null) result = caseConstraints(primaryKeyCon);
				if (result == null) result = caseModelElement(primaryKeyCon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdbmsPackage.UNIQUE_CON: {
				UniqueCon uniqueCon = (UniqueCon)theEObject;
				T result = caseUniqueCon(uniqueCon);
				if (result == null) result = casePKeyAndUnique(uniqueCon);
				if (result == null) result = caseConstraints(uniqueCon);
				if (result == null) result = caseModelElement(uniqueCon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdbmsPackage.SYSTEM_DATA_TYPE: {
				SystemDataType systemDataType = (SystemDataType)theEObject;
				T result = caseSystemDataType(systemDataType);
				if (result == null) result = caseDataType(systemDataType);
				if (result == null) result = caseModelElement(systemDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdbmsPackage.MODEL_ELEMENT: {
				ModelElement modelElement = (ModelElement)theEObject;
				T result = caseModelElement(modelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdbmsPackage.USER_DEFINED_DATA_TYPE: {
				UserDefinedDataType userDefinedDataType = (UserDefinedDataType)theEObject;
				T result = caseUserDefinedDataType(userDefinedDataType);
				if (result == null) result = caseDataType(userDefinedDataType);
				if (result == null) result = caseModelElement(userDefinedDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdbmsPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = caseModelElement(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabase(Database object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTable(Table object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumn(Column object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Foreign Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Foreign Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForeignKey(ForeignKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraints(Constraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Check Con</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Check Con</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckCon(CheckCon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PKey And Unique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PKey And Unique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePKeyAndUnique(PKeyAndUnique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primary Key Con</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primary Key Con</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimaryKeyCon(PrimaryKeyCon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unique Con</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unique Con</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniqueCon(UniqueCon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemDataType(SystemDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Defined Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Defined Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserDefinedDataType(UserDefinedDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RdbmsSwitch
