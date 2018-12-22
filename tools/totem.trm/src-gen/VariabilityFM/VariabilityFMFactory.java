/**
 */
package VariabilityFM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see VariabilityFM.VariabilityFMPackage
 * @generated
 */
public interface VariabilityFMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VariabilityFMFactory eINSTANCE = VariabilityFM.impl.VariabilityFMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Variability Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variability Model</em>'.
	 * @generated
	 */
	VariabilityModel createVariabilityModel();

	/**
	 * Returns a new object of class '<em>Metamodel Variability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metamodel Variability</em>'.
	 * @generated
	 */
	MetamodelVariability createMetamodelVariability();

	/**
	 * Returns a new object of class '<em>Variable Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Feature</em>'.
	 * @generated
	 */
	VariableFeature createVariableFeature();

	/**
	 * Returns a new object of class '<em>Transformation Options</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation Options</em>'.
	 * @generated
	 */
	TransformationOptions createTransformationOptions();

	/**
	 * Returns a new object of class '<em>Allow Unresolved Bindings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allow Unresolved Bindings</em>'.
	 * @generated
	 */
	AllowUnresolvedBindings createAllowUnresolvedBindings();

	/**
	 * Returns a new object of class '<em>Feature Kind Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Kind Group</em>'.
	 * @generated
	 */
	FeatureKindGroup createFeatureKindGroup();

	/**
	 * Returns a new object of class '<em>Att Or Reference Exclusive Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Att Or Reference Exclusive Choice</em>'.
	 * @generated
	 */
	AttOrReferenceExclusiveChoice createAttOrReferenceExclusiveChoice();

	/**
	 * Returns a new object of class '<em>Attribute Type Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Type Group</em>'.
	 * @generated
	 */
	AttributeTypeGroup createAttributeTypeGroup();

	/**
	 * Returns a new object of class '<em>Reference Type Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Type Group</em>'.
	 * @generated
	 */
	ReferenceTypeGroup createReferenceTypeGroup();

	/**
	 * Returns a new object of class '<em>Feature Cardinality Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Cardinality Group</em>'.
	 * @generated
	 */
	FeatureCardinalityGroup createFeatureCardinalityGroup();

	/**
	 * Returns a new object of class '<em>Reference Type Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Type Choice</em>'.
	 * @generated
	 */
	ReferenceTypeChoice createReferenceTypeChoice();

	/**
	 * Returns a new object of class '<em>Attribute Type Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Type Choice</em>'.
	 * @generated
	 */
	AttributeTypeChoice createAttributeTypeChoice();

	/**
	 * Returns a new object of class '<em>Feature Min Cardinality Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Min Cardinality Choice</em>'.
	 * @generated
	 */
	FeatureMinCardinalityChoice createFeatureMinCardinalityChoice();

	/**
	 * Returns a new object of class '<em>Feature Max Cardinality Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Max Cardinality Choice</em>'.
	 * @generated
	 */
	FeatureMaxCardinalityChoice createFeatureMaxCardinalityChoice();

	/**
	 * Returns a new object of class '<em>Or Requires</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Requires</em>'.
	 * @generated
	 */
	OrRequires createOrRequires();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VariabilityFMPackage getVariabilityFMPackage();

} //VariabilityFMFactory
