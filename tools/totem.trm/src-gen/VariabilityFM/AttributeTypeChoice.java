/**
 */
package VariabilityFM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Type Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link VariabilityFM.AttributeTypeChoice#getDatatype_ <em>Datatype </em>}</li>
 * </ul>
 *
 * @see VariabilityFM.VariabilityFMPackage#getAttributeTypeChoice()
 * @model
 * @generated
 */
public interface AttributeTypeChoice extends SingleChoice, Node {
	/**
	 * Returns the value of the '<em><b>Datatype </b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype </em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype </em>' reference.
	 * @see #setDatatype_(EObject)
	 * @see VariabilityFM.VariabilityFMPackage#getAttributeTypeChoice_Datatype_()
	 * @model required="true"
	 * @generated
	 */
	EObject getDatatype_();

	/**
	 * Sets the value of the '{@link VariabilityFM.AttributeTypeChoice#getDatatype_ <em>Datatype </em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype </em>' reference.
	 * @see #getDatatype_()
	 * @generated
	 */
	void setDatatype_(EObject value);

} // AttributeTypeChoice
