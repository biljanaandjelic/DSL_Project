/**
 */
package formValidation.tests;

import formValidation.FormValidationFactory;
import formValidation.NonPrimitiveDataType;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Non Primitive Data Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NonPrimitiveDataTypeTest extends AttributeDataTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NonPrimitiveDataTypeTest.class);
	}

	/**
	 * Constructs a new Non Primitive Data Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonPrimitiveDataTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Non Primitive Data Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NonPrimitiveDataType getFixture() {
		return (NonPrimitiveDataType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FormValidationFactory.eINSTANCE.createNonPrimitiveDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //NonPrimitiveDataTypeTest
