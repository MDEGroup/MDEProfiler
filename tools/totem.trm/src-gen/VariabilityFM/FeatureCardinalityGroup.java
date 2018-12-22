/**
 */
package VariabilityFM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Cardinality Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link VariabilityFM.FeatureCardinalityGroup#getMin <em>Min</em>}</li>
 *   <li>{@link VariabilityFM.FeatureCardinalityGroup#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @see VariabilityFM.VariabilityFMPackage#getFeatureCardinalityGroup()
 * @model
 * @generated
 */
public interface FeatureCardinalityGroup extends ExclusiveChoice, Node {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' containment reference list.
	 * The list contents are of type {@link VariabilityFM.FeatureMinCardinalityChoice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' containment reference list.
	 * @see VariabilityFM.VariabilityFMPackage#getFeatureCardinalityGroup_Min()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeatureMinCardinalityChoice> getMin();

	/**
	 * Returns the value of the '<em><b>Max</b></em>' containment reference list.
	 * The list contents are of type {@link VariabilityFM.FeatureMaxCardinalityChoice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' containment reference list.
	 * @see VariabilityFM.VariabilityFMPackage#getFeatureCardinalityGroup_Max()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeatureMaxCardinalityChoice> getMax();

} // FeatureCardinalityGroup
