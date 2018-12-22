/**
 */
package MM_uncertainty;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MM_uncertainty.Number#getValue <em>Value</em>}</li>
 *   <li>{@link MM_uncertainty.Number#isAllowLess <em>Allow Less</em>}</li>
 *   <li>{@link MM_uncertainty.Number#isAllowMore <em>Allow More</em>}</li>
 * </ul>
 *
 * @see MM_uncertainty.MM_uncertaintyPackage#getNumber()
 * @model
 * @generated
 */
public interface Number extends Cardinality {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see MM_uncertainty.MM_uncertaintyPackage#getNumber_Value()
	 * @model required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link MM_uncertainty.Number#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Allow Less</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Less</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Less</em>' attribute.
	 * @see #setAllowLess(boolean)
	 * @see MM_uncertainty.MM_uncertaintyPackage#getNumber_AllowLess()
	 * @model
	 * @generated
	 */
	boolean isAllowLess();

	/**
	 * Sets the value of the '{@link MM_uncertainty.Number#isAllowLess <em>Allow Less</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Less</em>' attribute.
	 * @see #isAllowLess()
	 * @generated
	 */
	void setAllowLess(boolean value);

	/**
	 * Returns the value of the '<em><b>Allow More</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow More</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow More</em>' attribute.
	 * @see #setAllowMore(boolean)
	 * @see MM_uncertainty.MM_uncertaintyPackage#getNumber_AllowMore()
	 * @model
	 * @generated
	 */
	boolean isAllowMore();

	/**
	 * Sets the value of the '{@link MM_uncertainty.Number#isAllowMore <em>Allow More</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow More</em>' attribute.
	 * @see #isAllowMore()
	 * @generated
	 */
	void setAllowMore(boolean value);

} // Number
