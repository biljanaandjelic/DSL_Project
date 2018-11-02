/**
 */
package formValidation.tests;

import formValidation.FormValidationFactory;
import formValidation.MaxNumber;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Max Number</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MaxNumberTest extends MaxTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MaxNumberTest.class);
	}

	/**
	 * Constructs a new Max Number test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxNumberTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Max Number test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MaxNumber getFixture() {
		return (MaxNumber)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FormValidationFactory.eINSTANCE.createMaxNumber());
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

} //MaxNumberTest
