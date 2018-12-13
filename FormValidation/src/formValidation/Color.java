/**
 */
package formValidation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link formValidation.Color#getRed <em>Red</em>}</li>
 *   <li>{@link formValidation.Color#getGreen <em>Green</em>}</li>
 *   <li>{@link formValidation.Color#getBlue <em>Blue</em>}</li>
 * </ul>
 *
 * @see formValidation.FormValidationPackage#getColor()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='RedComponentRange GreenComponetRange BlueComponetRange'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot RedComponentRange='Tuple {\n\tmessage : String = \'Red componet is out of range[0,255].\',\n\tstatus : Boolean = \n\t\t (red <= 255 and red >= 0)\n}.status' GreenComponetRange='Tuple {\n\tmessage : String = \'Green componet is out of range[0,255].\',\n\tstatus : Boolean = \n\t\t(green <= 255 and green >=0)\n}.status' BlueComponetRange='Tuple {\n\tmessage : String = \'Blue componet is out of range[0,255].\',\n\tstatus : Boolean = \n\t\t(blue <= 255 and blue >=0)\n}.status'"
 * @generated
 */
public interface Color extends EObject {
	/**
	 * Returns the value of the '<em><b>Red</b></em>' attribute.
	 * The default value is <code>"250"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Red</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Red</em>' attribute.
	 * @see #setRed(int)
	 * @see formValidation.FormValidationPackage#getColor_Red()
	 * @model default="250"
	 * @generated
	 */
	int getRed();

	/**
	 * Sets the value of the '{@link formValidation.Color#getRed <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Red</em>' attribute.
	 * @see #getRed()
	 * @generated
	 */
	void setRed(int value);

	/**
	 * Returns the value of the '<em><b>Green</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Green</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Green</em>' attribute.
	 * @see #setGreen(int)
	 * @see formValidation.FormValidationPackage#getColor_Green()
	 * @model default="0"
	 * @generated
	 */
	int getGreen();

	/**
	 * Sets the value of the '{@link formValidation.Color#getGreen <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Green</em>' attribute.
	 * @see #getGreen()
	 * @generated
	 */
	void setGreen(int value);

	/**
	 * Returns the value of the '<em><b>Blue</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blue</em>' attribute.
	 * @see #setBlue(int)
	 * @see formValidation.FormValidationPackage#getColor_Blue()
	 * @model default="0"
	 * @generated
	 */
	int getBlue();

	/**
	 * Sets the value of the '{@link formValidation.Color#getBlue <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blue</em>' attribute.
	 * @see #getBlue()
	 * @generated
	 */
	void setBlue(int value);

} // Color
