/**
 */
package MM_uncertainty;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MM_uncertainty.Feature#getName <em>Name</em>}</li>
 *   <li>{@link MM_uncertainty.Feature#getMin <em>Min</em>}</li>
 *   <li>{@link MM_uncertainty.Feature#getMax <em>Max</em>}</li>
 *   <li>{@link MM_uncertainty.Feature#getHasType <em>Has Type</em>}</li>
 * </ul>
 *
 * @see MM_uncertainty.MM_uncertaintyPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends ConstrainedElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see MM_uncertainty.MM_uncertaintyPackage#getFeature_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MM_uncertainty.Feature#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Min</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' containment reference.
	 * @see #setMin(Cardinality)
	 * @see MM_uncertainty.MM_uncertaintyPackage#getFeature_Min()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Cardinality getMin();

	/**
	 * Sets the value of the '{@link MM_uncertainty.Feature#getMin <em>Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' containment reference.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(Cardinality value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' containment reference.
	 * @see #setMax(Cardinality)
	 * @see MM_uncertainty.MM_uncertaintyPackage#getFeature_Max()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Cardinality getMax();

	/**
	 * Sets the value of the '{@link MM_uncertainty.Feature#getMax <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' containment reference.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(Cardinality value);

	/**
	 * Returns the value of the '<em><b>Has Type</b></em>' containment reference list.
	 * The list contents are of type {@link MM_uncertainty.FeatureType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Type</em>' containment reference list.
	 * @see MM_uncertainty.MM_uncertaintyPackage#getFeature_HasType()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeatureType> getHasType();

} // Feature
