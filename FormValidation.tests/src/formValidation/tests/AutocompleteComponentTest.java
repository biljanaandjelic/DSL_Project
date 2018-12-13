/**
 */
package formValidation.tests;

import formValidation.AutocompleteComponent;
import formValidation.FormValidationFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Autocomplete Component</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AutocompleteComponentTest extends UIComponentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AutocompleteComponentTest.class);
	}

	/**
	 * Constructs a new Autocomplete Component test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutocompleteComponentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Autocomplete Component test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AutocompleteComponent getFixture() {
		return (AutocompleteComponent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FormValidationFactory.eINSTANCE.createAutocompleteComponent());
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

} //AutocompleteComponentTest
