/**
 */
package MM_uncertainty;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MM_uncertainty.Class#getName <em>Name</em>}</li>
 *   <li>{@link MM_uncertainty.Class#getAncs <em>Ancs</em>}</li>
 *   <li>{@link MM_uncertainty.Class#getAntiancs <em>Antiancs</em>}</li>
 *   <li>{@link MM_uncertainty.Class#getFeats <em>Feats</em>}</li>
 *   <li>{@link MM_uncertainty.Class#isMandatoryAllowed <em>Mandatory Allowed</em>}</li>
 *   <li>{@link MM_uncertainty.Class#getIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link MM_uncertainty.Class#isSubsAllowed <em>Subs Allowed</em>}</li>
 * </ul>
 *
 * @see MM_uncertainty.MM_uncertaintyPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends ConstrainedElement {
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
	 * @see MM_uncertainty.MM_uncertaintyPackage#getClass_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MM_uncertainty.Class#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ancs</b></em>' reference list.
	 * The list contents are of type {@link MM_uncertainty.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ancs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ancs</em>' reference list.
	 * @see MM_uncertainty.MM_uncertaintyPackage#getClass_Ancs()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Class> getAncs();

	/**
	 * Returns the value of the '<em><b>Antiancs</b></em>' reference list.
	 * The list contents are of type {@link MM_uncertainty.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Antiancs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antiancs</em>' reference list.
	 * @see MM_uncertainty.MM_uncertaintyPackage#getClass_Antiancs()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Class> getAntiancs();

	/**
	 * Returns the value of the '<em><b>Feats</b></em>' containment reference list.
	 * The list contents are of type {@link MM_uncertainty.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feats</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feats</em>' containment reference list.
	 * @see MM_uncertainty.MM_uncertaintyPackage#getClass_Feats()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Feature> getFeats();

	/**
	 * Returns the value of the '<em><b>Mandatory Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mandatory Allowed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory Allowed</em>' attribute.
	 * @see #setMandatoryAllowed(boolean)
	 * @see MM_uncertainty.MM_uncertaintyPackage#getClass_MandatoryAllowed()
	 * @model
	 * @generated
	 */
	boolean isMandatoryAllowed();

	/**
	 * Sets the value of the '{@link MM_uncertainty.Class#isMandatoryAllowed <em>Mandatory Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory Allowed</em>' attribute.
	 * @see #isMandatoryAllowed()
	 * @generated
	 */
	void setMandatoryAllowed(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * The literals are from the enumeration {@link MM_uncertainty.UBoolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see MM_uncertainty.UBoolean
	 * @see #setIsAbstract(UBoolean)
	 * @see MM_uncertainty.MM_uncertaintyPackage#getClass_IsAbstract()
	 * @model
	 * @generated
	 */
	UBoolean getIsAbstract();

	/**
	 * Sets the value of the '{@link MM_uncertainty.Class#getIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see MM_uncertainty.UBoolean
	 * @see #getIsAbstract()
	 * @generated
	 */
	void setIsAbstract(UBoolean value);

	/**
	 * Returns the value of the '<em><b>Subs Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subs Allowed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subs Allowed</em>' attribute.
	 * @see #setSubsAllowed(boolean)
	 * @see MM_uncertainty.MM_uncertaintyPackage#getClass_SubsAllowed()
	 * @model
	 * @generated
	 */
	boolean isSubsAllowed();

	/**
	 * Sets the value of the '{@link MM_uncertainty.Class#isSubsAllowed <em>Subs Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subs Allowed</em>' attribute.
	 * @see #isSubsAllowed()
	 * @generated
	 */
	void setSubsAllowed(boolean value);

} // Class
