/**
 */
package formValidation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ERequired Field</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see formValidation.FormValidationPackage#getERequiredField()
 * @model
 * @generated
 */
public enum ERequiredField implements Enumerator {
	/**
	 * The '<em><b>Asterix</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASTERIX_VALUE
	 * @generated
	 * @ordered
	 */
	ASTERIX(0, "Asterix", "Asterix"),

	/**
	 * The '<em><b>Highlighting</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGHLIGHTING_VALUE
	 * @generated
	 * @ordered
	 */
	HIGHLIGHTING(1, "Highlighting", "Highlighting");

	/**
	 * The '<em><b>Asterix</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Asterix</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASTERIX
	 * @model name="Asterix"
	 * @generated
	 * @ordered
	 */
	public static final int ASTERIX_VALUE = 0;

	/**
	 * The '<em><b>Highlighting</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Highlighting</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIGHLIGHTING
	 * @model name="Highlighting"
	 * @generated
	 * @ordered
	 */
	public static final int HIGHLIGHTING_VALUE = 1;

	/**
	 * An array of all the '<em><b>ERequired Field</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ERequiredField[] VALUES_ARRAY =
		new ERequiredField[] {
			ASTERIX,
			HIGHLIGHTING,
		};

	/**
	 * A public read-only list of all the '<em><b>ERequired Field</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ERequiredField> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ERequired Field</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ERequiredField get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ERequiredField result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ERequired Field</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ERequiredField getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ERequiredField result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ERequired Field</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ERequiredField get(int value) {
		switch (value) {
			case ASTERIX_VALUE: return ASTERIX;
			case HIGHLIGHTING_VALUE: return HIGHLIGHTING;
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
	private ERequiredField(int value, String name, String literal) {
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
	
} //ERequiredField
