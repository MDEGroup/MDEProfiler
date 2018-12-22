/**
 */
package VariabilityFM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metamodel Variability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link VariabilityFM.MetamodelVariability#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see VariabilityFM.VariabilityFMPackage#getMetamodelVariability()
 * @model
 * @generated
 */
public interface MetamodelVariability extends Node, Compulsory {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link VariabilityFM.VariableFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see VariabilityFM.VariabilityFMPackage#getMetamodelVariability_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableFeature> getFeatures();

} // MetamodelVariability
