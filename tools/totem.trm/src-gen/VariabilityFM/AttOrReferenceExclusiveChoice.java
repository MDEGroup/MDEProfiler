/**
 */
package VariabilityFM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Att Or Reference Exclusive Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link VariabilityFM.AttOrReferenceExclusiveChoice#getAttributeChoice <em>Attribute Choice</em>}</li>
 *   <li>{@link VariabilityFM.AttOrReferenceExclusiveChoice#getReferenceChoice <em>Reference Choice</em>}</li>
 * </ul>
 *
 * @see VariabilityFM.VariabilityFMPackage#getAttOrReferenceExclusiveChoice()
 * @model
 * @generated
 */
public interface AttOrReferenceExclusiveChoice extends Node, ExclusiveChoice {
	/**
	 * Returns the value of the '<em><b>Attribute Choice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Choice</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Choice</em>' containment reference.
	 * @see #setAttributeChoice(AttributeTypeGroup)
	 * @see VariabilityFM.VariabilityFMPackage#getAttOrReferenceExclusiveChoice_AttributeChoice()
	 * @model containment="true"
	 * @generated
	 */
	AttributeTypeGroup getAttributeChoice();

	/**
	 * Sets the value of the '{@link VariabilityFM.AttOrReferenceExclusiveChoice#getAttributeChoice <em>Attribute Choice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Choice</em>' containment reference.
	 * @see #getAttributeChoice()
	 * @generated
	 */
	void setAttributeChoice(AttributeTypeGroup value);

	/**
	 * Returns the value of the '<em><b>Reference Choice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Choice</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Choice</em>' containment reference.
	 * @see #setReferenceChoice(ReferenceTypeGroup)
	 * @see VariabilityFM.VariabilityFMPackage#getAttOrReferenceExclusiveChoice_ReferenceChoice()
	 * @model containment="true"
	 * @generated
	 */
	ReferenceTypeGroup getReferenceChoice();

	/**
	 * Sets the value of the '{@link VariabilityFM.AttOrReferenceExclusiveChoice#getReferenceChoice <em>Reference Choice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Choice</em>' containment reference.
	 * @see #getReferenceChoice()
	 * @generated
	 */
	void setReferenceChoice(ReferenceTypeGroup value);

} // AttOrReferenceExclusiveChoice
