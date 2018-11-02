/**
 */
package rdbms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Deferrable Act</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rdbms.RdbmsPackage#getDeferrableAct()
 * @model
 * @generated
 */
public enum DeferrableAct implements Enumerator {
	/**
	 * The '<em><b>DEFFERABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFFERABLE_VALUE
	 * @generated
	 * @ordered
	 */
	DEFFERABLE(0, "DEFFERABLE", "DEFFERABLE"),

	/**
	 * The '<em><b>NOT DEFFERABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_DEFFERABLE_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_DEFFERABLE(1, "NOT_DEFFERABLE", "NOT_DEFFERABLE");

	/**
	 * The '<em><b>DEFFERABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEFFERABLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEFFERABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEFFERABLE_VALUE = 0;

	/**
	 * The '<em><b>NOT DEFFERABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOT DEFFERABLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_DEFFERABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOT_DEFFERABLE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Deferrable Act</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DeferrableAct[] VALUES_ARRAY =
		new DeferrableAct[] {
			DEFFERABLE,
			NOT_DEFFERABLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Deferrable Act</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DeferrableAct> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Deferrable Act</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeferrableAct get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeferrableAct result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Deferrable Act</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeferrableAct getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeferrableAct result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Deferrable Act</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeferrableAct get(int value) {
		switch (value) {
			case DEFFERABLE_VALUE: return DEFFERABLE;
			case NOT_DEFFERABLE_VALUE: return NOT_DEFFERABLE;
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
	private DeferrableAct(int value, String name, String literal) {
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
	
} //DeferrableAct
