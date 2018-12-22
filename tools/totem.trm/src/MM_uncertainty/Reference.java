/**
 */
package MM_uncertainty;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MM_uncertainty.Reference#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see MM_uncertainty.MM_uncertaintyPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends FeatureType {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link MM_uncertainty.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see MM_uncertainty.MM_uncertaintyPackage#getReference_Target()
	 * @model
	 * @generated
	 */
	EList<MM_uncertainty.Class> getTarget();

} // Reference
