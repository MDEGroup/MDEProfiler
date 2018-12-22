/**
 */
package VariabilityFM.impl;

import VariabilityFM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VariabilityFMFactoryImpl extends EFactoryImpl implements VariabilityFMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VariabilityFMFactory init() {
		try {
			VariabilityFMFactory theVariabilityFMFactory = (VariabilityFMFactory)EPackage.Registry.INSTANCE.getEFactory(VariabilityFMPackage.eNS_URI);
			if (theVariabilityFMFactory != null) {
				return theVariabilityFMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VariabilityFMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariabilityFMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case VariabilityFMPackage.VARIABILITY_MODEL: return createVariabilityModel();
			case VariabilityFMPackage.METAMODEL_VARIABILITY: return createMetamodelVariability();
			case VariabilityFMPackage.VARIABLE_FEATURE: return createVariableFeature();
			case VariabilityFMPackage.TRANSFORMATION_OPTIONS: return createTransformationOptions();
			case VariabilityFMPackage.ALLOW_UNRESOLVED_BINDINGS: return createAllowUnresolvedBindings();
			case VariabilityFMPackage.FEATURE_KIND_GROUP: return createFeatureKindGroup();
			case VariabilityFMPackage.ATT_OR_REFERENCE_EXCLUSIVE_CHOICE: return createAttOrReferenceExclusiveChoice();
			case VariabilityFMPackage.ATTRIBUTE_TYPE_GROUP: return createAttributeTypeGroup();
			case VariabilityFMPackage.REFERENCE_TYPE_GROUP: return createReferenceTypeGroup();
			case VariabilityFMPackage.FEATURE_CARDINALITY_GROUP: return createFeatureCardinalityGroup();
			case VariabilityFMPackage.REFERENCE_TYPE_CHOICE: return createReferenceTypeChoice();
			case VariabilityFMPackage.ATTRIBUTE_TYPE_CHOICE: return createAttributeTypeChoice();
			case VariabilityFMPackage.FEATURE_MIN_CARDINALITY_CHOICE: return createFeatureMinCardinalityChoice();
			case VariabilityFMPackage.FEATURE_MAX_CARDINALITY_CHOICE: return createFeatureMaxCardinalityChoice();
			case VariabilityFMPackage.OR_REQUIRES: return createOrRequires();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case VariabilityFMPackage.NODE_KIND:
				return createNodeKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case VariabilityFMPackage.NODE_KIND:
				return convertNodeKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariabilityModel createVariabilityModel() {
		VariabilityModelImpl variabilityModel = new VariabilityModelImpl();
		return variabilityModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelVariability createMetamodelVariability() {
		MetamodelVariabilityImpl metamodelVariability = new MetamodelVariabilityImpl();
		return metamodelVariability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableFeature createVariableFeature() {
		VariableFeatureImpl variableFeature = new VariableFeatureImpl();
		return variableFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationOptions createTransformationOptions() {
		TransformationOptionsImpl transformationOptions = new TransformationOptionsImpl();
		return transformationOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllowUnresolvedBindings createAllowUnresolvedBindings() {
		AllowUnresolvedBindingsImpl allowUnresolvedBindings = new AllowUnresolvedBindingsImpl();
		return allowUnresolvedBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureKindGroup createFeatureKindGroup() {
		FeatureKindGroupImpl featureKindGroup = new FeatureKindGroupImpl();
		return featureKindGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttOrReferenceExclusiveChoice createAttOrReferenceExclusiveChoice() {
		AttOrReferenceExclusiveChoiceImpl attOrReferenceExclusiveChoice = new AttOrReferenceExclusiveChoiceImpl();
		return attOrReferenceExclusiveChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeTypeGroup createAttributeTypeGroup() {
		AttributeTypeGroupImpl attributeTypeGroup = new AttributeTypeGroupImpl();
		return attributeTypeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceTypeGroup createReferenceTypeGroup() {
		ReferenceTypeGroupImpl referenceTypeGroup = new ReferenceTypeGroupImpl();
		return referenceTypeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureCardinalityGroup createFeatureCardinalityGroup() {
		FeatureCardinalityGroupImpl featureCardinalityGroup = new FeatureCardinalityGroupImpl();
		return featureCardinalityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceTypeChoice createReferenceTypeChoice() {
		ReferenceTypeChoiceImpl referenceTypeChoice = new ReferenceTypeChoiceImpl();
		return referenceTypeChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeTypeChoice createAttributeTypeChoice() {
		AttributeTypeChoiceImpl attributeTypeChoice = new AttributeTypeChoiceImpl();
		return attributeTypeChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMinCardinalityChoice createFeatureMinCardinalityChoice() {
		FeatureMinCardinalityChoiceImpl featureMinCardinalityChoice = new FeatureMinCardinalityChoiceImpl();
		return featureMinCardinalityChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMaxCardinalityChoice createFeatureMaxCardinalityChoice() {
		FeatureMaxCardinalityChoiceImpl featureMaxCardinalityChoice = new FeatureMaxCardinalityChoiceImpl();
		return featureMaxCardinalityChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrRequires createOrRequires() {
		OrRequiresImpl orRequires = new OrRequiresImpl();
		return orRequires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeKind createNodeKindFromString(EDataType eDataType, String initialValue) {
		NodeKind result = NodeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNodeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariabilityFMPackage getVariabilityFMPackage() {
		return (VariabilityFMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VariabilityFMPackage getPackage() {
		return VariabilityFMPackage.eINSTANCE;
	}

} //VariabilityFMFactoryImpl
