/**
 */
package MM_uncertainty;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Many</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MM_uncertainty.Many#getIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link MM_uncertainty.Many#getIsDuplicated <em>Is Duplicated</em>}</li>
 * </ul>
 *
 * @see MM_uncertainty.MM_uncertaintyPackage#getMany()
 * @model
 * @generated
 */
public interface Many extends Cardinality {
	/**
	 * Returns the value of the '<em><b>Is Ordered</b></em>' attribute.
	 * The literals are from the enumeration {@link MM_uncertainty.UBoolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Ordered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Ordered</em>' attribute.
	 * @see MM_uncertainty.UBoolean
	 * @see #setIsOrdered(UBoolean)
	 * @see MM_uncertainty.MM_uncertaintyPackage#getMany_IsOrdered()
	 * @model
	 * @generated
	 */
	UBoolean getIsOrdered();

	/**
	 * Sets the value of the '{@link MM_uncertainty.Many#getIsOrdered <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Ordered</em>' attribute.
	 * @see MM_uncertainty.UBoolean
	 * @see #getIsOrdered()
	 * @generated
	 */
	void setIsOrdered(UBoolean value);

	/**
	 * Returns the value of the '<em><b>Is Duplicated</b></em>' attribute.
	 * The literals are from the enumeration {@link MM_uncertainty.UBoolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Duplicated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Duplicated</em>' attribute.
	 * @see MM_uncertainty.UBoolean
	 * @see #setIsDuplicated(UBoolean)
	 * @see MM_uncertainty.MM_uncertaintyPackage#getMany_IsDuplicated()
	 * @model
	 * @generated
	 */
	UBoolean getIsDuplicated();

	/**
	 * Sets the value of the '{@link MM_uncertainty.Many#getIsDuplicated <em>Is Duplicated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Duplicated</em>' attribute.
	 * @see MM_uncertainty.UBoolean
	 * @see #getIsDuplicated()
	 * @generated
	 */
	void setIsDuplicated(UBoolean value);

} // Many
