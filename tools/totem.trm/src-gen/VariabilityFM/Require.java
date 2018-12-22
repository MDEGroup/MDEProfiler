/**
 */
package VariabilityFM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Require</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link VariabilityFM.Require#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @see VariabilityFM.VariabilityFMPackage#getRequire()
 * @model abstract="true"
 * @generated
 */
public interface Require extends Constraint {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' reference list.
	 * The list contents are of type {@link VariabilityFM.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' reference list.
	 * @see VariabilityFM.VariabilityFMPackage#getRequire_Nodes()
	 * @model
	 * @generated
	 */
	EList<Node> getNodes();

} // Require
