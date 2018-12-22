/**
 */
package VariabilityFM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Kind Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link VariabilityFM.FeatureKindGroup#getAttOrRef <em>Att Or Ref</em>}</li>
 * </ul>
 *
 * @see VariabilityFM.VariabilityFMPackage#getFeatureKindGroup()
 * @model
 * @generated
 */
public interface FeatureKindGroup extends Node, Compulsory {
	/**
	 * Returns the value of the '<em><b>Att Or Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Att Or Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Att Or Ref</em>' containment reference.
	 * @see #setAttOrRef(AttOrReferenceExclusiveChoice)
	 * @see VariabilityFM.VariabilityFMPackage#getFeatureKindGroup_AttOrRef()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AttOrReferenceExclusiveChoice getAttOrRef();

	/**
	 * Sets the value of the '{@link VariabilityFM.FeatureKindGroup#getAttOrRef <em>Att Or Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Att Or Ref</em>' containment reference.
	 * @see #getAttOrRef()
	 * @generated
	 */
	void setAttOrRef(AttOrReferenceExclusiveChoice value);

} // FeatureKindGroup
