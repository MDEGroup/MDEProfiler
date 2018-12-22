/**
 */
package MM_uncertainty;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constrained Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MM_uncertainty.ConstrainedElement#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see MM_uncertainty.MM_uncertaintyPackage#getConstrainedElement()
 * @model abstract="true"
 * @generated
 */
public interface ConstrainedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link MM_uncertainty.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see MM_uncertainty.MM_uncertaintyPackage#getConstrainedElement_Constraints()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Constraint> getConstraints();

} // ConstrainedElement
