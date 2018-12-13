/**
 */
package formValidation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EUI Number Component Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see formValidation.FormValidationPackage#getEUINumberComponentType()
 * @model
 * @generated
 */
public enum EUINumberComponentType implements Enumerator {
	/**
	 * The '<em><b>Number Scroller</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMBER_SCROLLER_VALUE
	 * @generated
	 * @ordered
	 */
	NUMBER_SCROLLER(0, "NumberScroller", "NumberScroller"),

	/**
	 * The '<em><b>Simple Input</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMPLE_INPUT_VALUE
	 * @generated
	 * @ordered
	 */
	SIMPLE_INPUT(1, "SimpleInput", "SimpleInput");

	/**
	 * The '<em><b>Number Scroller</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Number Scroller</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUMBER_SCROLLER
	 * @model name="NumberScroller"
	 * @generated
	 * @ordered
	 */
	public static final int NUMBER_SCROLLER_VALUE = 0;

	/**
	 * The '<em><b>Simple Input</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Simple Input</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIMPLE_INPUT
	 * @model name="SimpleInput"
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_INPUT_VALUE = 1;

	/**
	 * An array of all the '<em><b>EUI Number Component Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EUINumberComponentType[] VALUES_ARRAY =
		new EUINumberComponentType[] {
			NUMBER_SCROLLER,
			SIMPLE_INPUT,
		};

	/**
	 * A public read-only list of all the '<em><b>EUI Number Component Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EUINumberComponentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EUI Number Component Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EUINumberComponentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EUINumberComponentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EUI Number Component Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EUINumberComponentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EUINumberComponentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EUI Number Component Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EUINumberComponentType get(int value) {
		switch (value) {
			case NUMBER_SCROLLER_VALUE: return NUMBER_SCROLLER;
			case SIMPLE_INPUT_VALUE: return SIMPLE_INPUT;
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
	private EUINumberComponentType(int value, String name, String literal) {
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
	
} //EUINumberComponentType
