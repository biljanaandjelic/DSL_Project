/**
 */
package rdbms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Deferred Act</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rdbms.RdbmsPackage#getDeferredAct()
 * @model
 * @generated
 */
public enum DeferredAct implements Enumerator {
	/**
	 * The '<em><b>INITIALLY IMMEDIATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INITIALLY_IMMEDIATE_VALUE
	 * @generated
	 * @ordered
	 */
	INITIALLY_IMMEDIATE(0, "INITIALLY_IMMEDIATE", "INITIALLY_IMMEDIATE"),

	/**
	 * The '<em><b>INITIALLY DEFERRED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INITIALLY_DEFERRED_VALUE
	 * @generated
	 * @ordered
	 */
	INITIALLY_DEFERRED(1, "INITIALLY_DEFERRED", "INITIALLY_DEFERRED");

	/**
	 * The '<em><b>INITIALLY IMMEDIATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INITIALLY IMMEDIATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INITIALLY_IMMEDIATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INITIALLY_IMMEDIATE_VALUE = 0;

	/**
	 * The '<em><b>INITIALLY DEFERRED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INITIALLY DEFERRED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INITIALLY_DEFERRED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INITIALLY_DEFERRED_VALUE = 1;

	/**
	 * An array of all the '<em><b>Deferred Act</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DeferredAct[] VALUES_ARRAY =
		new DeferredAct[] {
			INITIALLY_IMMEDIATE,
			INITIALLY_DEFERRED,
		};

	/**
	 * A public read-only list of all the '<em><b>Deferred Act</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DeferredAct> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Deferred Act</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeferredAct get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeferredAct result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Deferred Act</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeferredAct getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeferredAct result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Deferred Act</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeferredAct get(int value) {
		switch (value) {
			case INITIALLY_IMMEDIATE_VALUE: return INITIALLY_IMMEDIATE;
			case INITIALLY_DEFERRED_VALUE: return INITIALLY_DEFERRED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DeferredAct(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //DeferredAct
