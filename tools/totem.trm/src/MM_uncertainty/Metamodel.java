/**
 */
package MM_uncertainty;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metamodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MM_uncertainty.Metamodel#getClasses <em>Classes</em>}</li>
 *   <li>{@link MM_uncertainty.Metamodel#getDataType <em>Data Type</em>}</li>
 * </ul>
 *
 * @see MM_uncertainty.MM_uncertaintyPackage#getMetamodel()
 * @model
 * @generated
 */
public interface Metamodel extends EObject {
	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link MM_uncertainty.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see MM_uncertainty.MM_uncertaintyPackage#getMetamodel_Classes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<MM_uncertainty.Class> getClasses();

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link MM_uncertainty.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' containment reference list.
	 * @see MM_uncertainty.MM_uncertaintyPackage#getMetamodel_DataType()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataType> getDataType();

} // Metamodel
