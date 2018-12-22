/**
 */
package VariabilityFM;

import MM_uncertainty.Feature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link VariabilityFM.VariableFeature#getFeature <em>Feature</em>}</li>
 *   <li>{@link VariabilityFM.VariableFeature#getKind <em>Kind</em>}</li>
 *   <li>{@link VariabilityFM.VariableFeature#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 *
 * @see VariabilityFM.VariabilityFMPackage#getVariableFeature()
 * @model
 * @generated
 */
public interface VariableFeature extends Compulsory, Node {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(Feature)
	 * @see VariabilityFM.VariabilityFMPackage#getVariableFeature_Feature()
	 * @model required="true"
	 * @generated
	 */
	Feature getFeature();

	/**
	 * Sets the value of the '{@link VariabilityFM.VariableFeature#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' containment reference.
	 * @see #setKind(FeatureKindGroup)
	 * @see VariabilityFM.VariabilityFMPackage#getVariableFeature_Kind()
	 * @model containment="true"
	 * @generated
	 */
	FeatureKindGroup getKind();

	/**
	 * Sets the value of the '{@link VariabilityFM.VariableFeature#getKind <em>Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' containment reference.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(FeatureKindGroup value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' containment reference.
	 * @see #setCardinality(FeatureCardinalityGroup)
	 * @see VariabilityFM.VariabilityFMPackage#getVariableFeature_Cardinality()
	 * @model containment="true"
	 * @generated
	 */
	FeatureCardinalityGroup getCardinality();

	/**
	 * Sets the value of the '{@link VariabilityFM.VariableFeature#getCardinality <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' containment reference.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(FeatureCardinalityGroup value);

} // VariableFeature
