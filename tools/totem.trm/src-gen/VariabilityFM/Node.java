/**
 */
package VariabilityFM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link VariabilityFM.Node#getUniqueId <em>Unique Id</em>}</li>
 *   <li>{@link VariabilityFM.Node#getName <em>Name</em>}</li>
 *   <li>{@link VariabilityFM.Node#getChildren <em>Children</em>}</li>
 *   <li>{@link VariabilityFM.Node#getNodeKind <em>Node Kind</em>}</li>
 *   <li>{@link VariabilityFM.Node#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see VariabilityFM.VariabilityFMPackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique Id</em>' attribute.
	 * @see #setUniqueId(String)
	 * @see VariabilityFM.VariabilityFMPackage#getNode_UniqueId()
	 * @model required="true"
	 * @generated
	 */
	String getUniqueId();

	/**
	 * Sets the value of the '{@link VariabilityFM.Node#getUniqueId <em>Unique Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Id</em>' attribute.
	 * @see #getUniqueId()
	 * @generated
	 */
	void setUniqueId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see VariabilityFM.VariabilityFMPackage#getNode_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link VariabilityFM.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link VariabilityFM.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see VariabilityFM.VariabilityFMPackage#getNode_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getChildren();

	/**
	 * Returns the value of the '<em><b>Node Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link VariabilityFM.NodeKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Kind</em>' attribute.
	 * @see VariabilityFM.NodeKind
	 * @see #setNodeKind(NodeKind)
	 * @see VariabilityFM.VariabilityFMPackage#getNode_NodeKind()
	 * @model required="true"
	 * @generated
	 */
	NodeKind getNodeKind();

	/**
	 * Sets the value of the '{@link VariabilityFM.Node#getNodeKind <em>Node Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Kind</em>' attribute.
	 * @see VariabilityFM.NodeKind
	 * @see #getNodeKind()
	 * @generated
	 */
	void setNodeKind(NodeKind value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link VariabilityFM.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see VariabilityFM.VariabilityFMPackage#getNode_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraints();

} // Node
