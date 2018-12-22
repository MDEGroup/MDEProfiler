/**
 */
package VariabilityFM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variability Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link VariabilityFM.VariabilityModel#getSource <em>Source</em>}</li>
 *   <li>{@link VariabilityFM.VariabilityModel#getTarget <em>Target</em>}</li>
 *   <li>{@link VariabilityFM.VariabilityModel#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see VariabilityFM.VariabilityFMPackage#getVariabilityModel()
 * @model
 * @generated
 */
public interface VariabilityModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(MetamodelVariability)
	 * @see VariabilityFM.VariabilityFMPackage#getVariabilityModel_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MetamodelVariability getSource();

	/**
	 * Sets the value of the '{@link VariabilityFM.VariabilityModel#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(MetamodelVariability value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(MetamodelVariability)
	 * @see VariabilityFM.VariabilityFMPackage#getVariabilityModel_Target()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MetamodelVariability getTarget();

	/**
	 * Sets the value of the '{@link VariabilityFM.VariabilityModel#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(MetamodelVariability value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference.
	 * @see #setOptions(TransformationOptions)
	 * @see VariabilityFM.VariabilityFMPackage#getVariabilityModel_Options()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TransformationOptions getOptions();

	/**
	 * Sets the value of the '{@link VariabilityFM.VariabilityModel#getOptions <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options</em>' containment reference.
	 * @see #getOptions()
	 * @generated
	 */
	void setOptions(TransformationOptions value);

} // VariabilityModel
