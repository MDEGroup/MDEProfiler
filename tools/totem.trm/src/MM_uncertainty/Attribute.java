/**
 */
package MM_uncertainty;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MM_uncertainty.Attribute#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see MM_uncertainty.MM_uncertaintyPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends FeatureType {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference list.
	 * The list contents are of type {@link MM_uncertainty.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference list.
	 * @see MM_uncertainty.MM_uncertaintyPackage#getAttribute_Type()
	 * @model
	 * @generated
	 */
	EList<DataType> getType();

} // Attribute
