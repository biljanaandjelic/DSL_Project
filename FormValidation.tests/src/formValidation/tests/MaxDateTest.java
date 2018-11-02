/**
 */
package formValidation.tests;

import formValidation.FormValidationFactory;
import formValidation.MaxDate;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Max Date</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MaxDateTest extends MaxTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MaxDateTest.class);
	}

	/**
	 * Constructs a new Max Date test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxDateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Max Date test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MaxDate getFixture() {
		return (MaxDate)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FormValidationFactory.eINSTANCE.createMaxDate());
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

} //MaxDateTest
