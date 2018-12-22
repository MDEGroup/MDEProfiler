/**
 */
package VariabilityFM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Type Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link VariabilityFM.AttributeTypeGroup#getChoices <em>Choices</em>}</li>
 * </ul>
 *
 * @see VariabilityFM.VariabilityFMPackage#getAttributeTypeGroup()
 * @model
 * @generated
 */
public interface AttributeTypeGroup extends ExclusiveChoice, Node {
	/**
	 * Returns the value of the '<em><b>Choices</b></em>' containment reference list.
	 * The list contents are of type {@link VariabilityFM.AttributeTypeChoice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choices</em>' containment reference list.
	 * @see VariabilityFM.VariabilityFMPackage#getAttributeTypeGroup_Choices()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeTypeChoice> getChoices();

} // AttributeTypeGroup
