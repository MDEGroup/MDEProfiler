/**
 */
package VariabilityFM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Type Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link VariabilityFM.ReferenceTypeChoice#getKlass <em>Klass</em>}</li>
 * </ul>
 *
 * @see VariabilityFM.VariabilityFMPackage#getReferenceTypeChoice()
 * @model
 * @generated
 */
public interface ReferenceTypeChoice extends SingleChoice, Node {
	/**
	 * Returns the value of the '<em><b>Klass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Klass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Klass</em>' reference.
	 * @see #setKlass(EObject)
	 * @see VariabilityFM.VariabilityFMPackage#getReferenceTypeChoice_Klass()
	 * @model required="true"
	 * @generated
	 */
	EObject getKlass();

	/**
	 * Sets the value of the '{@link VariabilityFM.ReferenceTypeChoice#getKlass <em>Klass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Klass</em>' reference.
	 * @see #getKlass()
	 * @generated
	 */
	void setKlass(EObject value);

} // ReferenceTypeChoice
