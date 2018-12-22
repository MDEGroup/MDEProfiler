/**
 */
package VariabilityFM.impl;

import MM_uncertainty.MM_uncertaintyPackage;

import VariabilityFM.AllowUnresolvedBindings;
import VariabilityFM.AttOrReferenceExclusiveChoice;
import VariabilityFM.AttributeTypeChoice;
import VariabilityFM.AttributeTypeGroup;
import VariabilityFM.Compulsory;
import VariabilityFM.Constraint;
import VariabilityFM.ExclusiveChoice;
import VariabilityFM.FeatureCardinalityChoice;
import VariabilityFM.FeatureCardinalityGroup;
import VariabilityFM.FeatureKindGroup;
import VariabilityFM.FeatureMaxCardinalityChoice;
import VariabilityFM.FeatureMinCardinalityChoice;
import VariabilityFM.MetamodelVariability;
import VariabilityFM.Node;
import VariabilityFM.NodeKind;
import VariabilityFM.Optional;
import VariabilityFM.OrRequires;
import VariabilityFM.ReferenceTypeChoice;
import VariabilityFM.ReferenceTypeGroup;
import VariabilityFM.Require;
import VariabilityFM.SingleChoice;
import VariabilityFM.TransformationOptions;
import VariabilityFM.VariabilityFMFactory;
import VariabilityFM.VariabilityFMPackage;
import VariabilityFM.VariabilityModel;
import VariabilityFM.VariableFeature;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VariabilityFMPackageImpl extends EPackageImpl implements VariabilityFMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variabilityModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metamodelVariabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compulsoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exclusiveChoiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleChoiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allowUnresolvedBindingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureKindGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attOrReferenceExclusiveChoiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeTypeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceTypeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureCardinalityGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceTypeChoiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeTypeChoiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureCardinalityChoiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureMinCardinalityChoiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureMaxCardinalityChoiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orRequiresEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nodeKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see VariabilityFM.VariabilityFMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VariabilityFMPackageImpl() {
		super(eNS_URI, VariabilityFMFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link VariabilityFMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VariabilityFMPackage init() {
		if (isInited) return (VariabilityFMPackage)EPackage.Registry.INSTANCE.getEPackage(VariabilityFMPackage.eNS_URI);

		// Obtain or create and register package
		VariabilityFMPackageImpl theVariabilityFMPackage = (VariabilityFMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VariabilityFMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VariabilityFMPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MM_uncertaintyPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theVariabilityFMPackage.createPackageContents();

		// Initialize created meta-data
		theVariabilityFMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVariabilityFMPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VariabilityFMPackage.eNS_URI, theVariabilityFMPackage);
		return theVariabilityFMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariabilityModel() {
		return variabilityModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariabilityModel_Source() {
		return (EReference)variabilityModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariabilityModel_Target() {
		return (EReference)variabilityModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariabilityModel_Options() {
		return (EReference)variabilityModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetamodelVariability() {
		return metamodelVariabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetamodelVariability_Features() {
		return (EReference)metamodelVariabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompulsory() {
		return compulsoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptional() {
		return optionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExclusiveChoice() {
		return exclusiveChoiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleChoice() {
		return singleChoiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_UniqueId() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Name() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Children() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_NodeKind() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Constraints() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableFeature() {
		return variableFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableFeature_Feature() {
		return (EReference)variableFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableFeature_Kind() {
		return (EReference)variableFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableFeature_Cardinality() {
		return (EReference)variableFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformationOptions() {
		return transformationOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllowUnresolvedBindings() {
		return allowUnresolvedBindingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureKindGroup() {
		return featureKindGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureKindGroup_AttOrRef() {
		return (EReference)featureKindGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttOrReferenceExclusiveChoice() {
		return attOrReferenceExclusiveChoiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttOrReferenceExclusiveChoice_AttributeChoice() {
		return (EReference)attOrReferenceExclusiveChoiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttOrReferenceExclusiveChoice_ReferenceChoice() {
		return (EReference)attOrReferenceExclusiveChoiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeTypeGroup() {
		return attributeTypeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeTypeGroup_Choices() {
		return (EReference)attributeTypeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceTypeGroup() {
		return referenceTypeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceTypeGroup_Choices() {
		return (EReference)referenceTypeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureCardinalityGroup() {
		return featureCardinalityGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureCardinalityGroup_Min() {
		return (EReference)featureCardinalityGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureCardinalityGroup_Max() {
		return (EReference)featureCardinalityGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceTypeChoice() {
		return referenceTypeChoiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceTypeChoice_Klass() {
		return (EReference)referenceTypeChoiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeTypeChoice() {
		return attributeTypeChoiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeTypeChoice_Datatype_() {
		return (EReference)attributeTypeChoiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureCardinalityChoice() {
		return featureCardinalityChoiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureCardinalityChoice_Value() {
		return (EAttribute)featureCardinalityChoiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureMinCardinalityChoice() {
		return featureMinCardinalityChoiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureMaxCardinalityChoice() {
		return featureMaxCardinalityChoiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequire() {
		return requireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequire_Nodes() {
		return (EReference)requireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrRequires() {
		return orRequiresEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNodeKind() {
		return nodeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariabilityFMFactory getVariabilityFMFactory() {
		return (VariabilityFMFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		variabilityModelEClass = createEClass(VARIABILITY_MODEL);
		createEReference(variabilityModelEClass, VARIABILITY_MODEL__SOURCE);
		createEReference(variabilityModelEClass, VARIABILITY_MODEL__TARGET);
		createEReference(variabilityModelEClass, VARIABILITY_MODEL__OPTIONS);

		metamodelVariabilityEClass = createEClass(METAMODEL_VARIABILITY);
		createEReference(metamodelVariabilityEClass, METAMODEL_VARIABILITY__FEATURES);

		compulsoryEClass = createEClass(COMPULSORY);

		optionalEClass = createEClass(OPTIONAL);

		exclusiveChoiceEClass = createEClass(EXCLUSIVE_CHOICE);

		singleChoiceEClass = createEClass(SINGLE_CHOICE);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__UNIQUE_ID);
		createEAttribute(nodeEClass, NODE__NAME);
		createEReference(nodeEClass, NODE__CHILDREN);
		createEAttribute(nodeEClass, NODE__NODE_KIND);
		createEReference(nodeEClass, NODE__CONSTRAINTS);

		variableFeatureEClass = createEClass(VARIABLE_FEATURE);
		createEReference(variableFeatureEClass, VARIABLE_FEATURE__FEATURE);
		createEReference(variableFeatureEClass, VARIABLE_FEATURE__KIND);
		createEReference(variableFeatureEClass, VARIABLE_FEATURE__CARDINALITY);

		transformationOptionsEClass = createEClass(TRANSFORMATION_OPTIONS);

		allowUnresolvedBindingsEClass = createEClass(ALLOW_UNRESOLVED_BINDINGS);

		featureKindGroupEClass = createEClass(FEATURE_KIND_GROUP);
		createEReference(featureKindGroupEClass, FEATURE_KIND_GROUP__ATT_OR_REF);

		attOrReferenceExclusiveChoiceEClass = createEClass(ATT_OR_REFERENCE_EXCLUSIVE_CHOICE);
		createEReference(attOrReferenceExclusiveChoiceEClass, ATT_OR_REFERENCE_EXCLUSIVE_CHOICE__ATTRIBUTE_CHOICE);
		createEReference(attOrReferenceExclusiveChoiceEClass, ATT_OR_REFERENCE_EXCLUSIVE_CHOICE__REFERENCE_CHOICE);

		attributeTypeGroupEClass = createEClass(ATTRIBUTE_TYPE_GROUP);
		createEReference(attributeTypeGroupEClass, ATTRIBUTE_TYPE_GROUP__CHOICES);

		referenceTypeGroupEClass = createEClass(REFERENCE_TYPE_GROUP);
		createEReference(referenceTypeGroupEClass, REFERENCE_TYPE_GROUP__CHOICES);

		featureCardinalityGroupEClass = createEClass(FEATURE_CARDINALITY_GROUP);
		createEReference(featureCardinalityGroupEClass, FEATURE_CARDINALITY_GROUP__MIN);
		createEReference(featureCardinalityGroupEClass, FEATURE_CARDINALITY_GROUP__MAX);

		referenceTypeChoiceEClass = createEClass(REFERENCE_TYPE_CHOICE);
		createEReference(referenceTypeChoiceEClass, REFERENCE_TYPE_CHOICE__KLASS);

		attributeTypeChoiceEClass = createEClass(ATTRIBUTE_TYPE_CHOICE);
		createEReference(attributeTypeChoiceEClass, ATTRIBUTE_TYPE_CHOICE__DATATYPE_);

		featureCardinalityChoiceEClass = createEClass(FEATURE_CARDINALITY_CHOICE);
		createEAttribute(featureCardinalityChoiceEClass, FEATURE_CARDINALITY_CHOICE__VALUE);

		featureMinCardinalityChoiceEClass = createEClass(FEATURE_MIN_CARDINALITY_CHOICE);

		featureMaxCardinalityChoiceEClass = createEClass(FEATURE_MAX_CARDINALITY_CHOICE);

		constraintEClass = createEClass(CONSTRAINT);

		requireEClass = createEClass(REQUIRE);
		createEReference(requireEClass, REQUIRE__NODES);

		orRequiresEClass = createEClass(OR_REQUIRES);

		// Create enums
		nodeKindEEnum = createEEnum(NODE_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		MM_uncertaintyPackage theMM_uncertaintyPackage = (MM_uncertaintyPackage)EPackage.Registry.INSTANCE.getEPackage(MM_uncertaintyPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		metamodelVariabilityEClass.getESuperTypes().add(this.getNode());
		metamodelVariabilityEClass.getESuperTypes().add(this.getCompulsory());
		variableFeatureEClass.getESuperTypes().add(this.getCompulsory());
		variableFeatureEClass.getESuperTypes().add(this.getNode());
		transformationOptionsEClass.getESuperTypes().add(this.getCompulsory());
		transformationOptionsEClass.getESuperTypes().add(this.getNode());
		allowUnresolvedBindingsEClass.getESuperTypes().add(this.getOptional());
		allowUnresolvedBindingsEClass.getESuperTypes().add(this.getNode());
		featureKindGroupEClass.getESuperTypes().add(this.getNode());
		featureKindGroupEClass.getESuperTypes().add(this.getCompulsory());
		attOrReferenceExclusiveChoiceEClass.getESuperTypes().add(this.getNode());
		attOrReferenceExclusiveChoiceEClass.getESuperTypes().add(this.getExclusiveChoice());
		attributeTypeGroupEClass.getESuperTypes().add(this.getExclusiveChoice());
		attributeTypeGroupEClass.getESuperTypes().add(this.getNode());
		referenceTypeGroupEClass.getESuperTypes().add(this.getExclusiveChoice());
		referenceTypeGroupEClass.getESuperTypes().add(this.getNode());
		featureCardinalityGroupEClass.getESuperTypes().add(this.getExclusiveChoice());
		featureCardinalityGroupEClass.getESuperTypes().add(this.getNode());
		referenceTypeChoiceEClass.getESuperTypes().add(this.getSingleChoice());
		referenceTypeChoiceEClass.getESuperTypes().add(this.getNode());
		attributeTypeChoiceEClass.getESuperTypes().add(this.getSingleChoice());
		attributeTypeChoiceEClass.getESuperTypes().add(this.getNode());
		featureCardinalityChoiceEClass.getESuperTypes().add(this.getSingleChoice());
		featureCardinalityChoiceEClass.getESuperTypes().add(this.getNode());
		featureMinCardinalityChoiceEClass.getESuperTypes().add(this.getFeatureCardinalityChoice());
		featureMaxCardinalityChoiceEClass.getESuperTypes().add(this.getFeatureCardinalityChoice());
		requireEClass.getESuperTypes().add(this.getConstraint());
		orRequiresEClass.getESuperTypes().add(this.getRequire());

		// Initialize classes, features, and operations; add parameters
		initEClass(variabilityModelEClass, VariabilityModel.class, "VariabilityModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariabilityModel_Source(), this.getMetamodelVariability(), null, "source", null, 1, 1, VariabilityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariabilityModel_Target(), this.getMetamodelVariability(), null, "target", null, 1, 1, VariabilityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariabilityModel_Options(), this.getTransformationOptions(), null, "options", null, 1, 1, VariabilityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metamodelVariabilityEClass, MetamodelVariability.class, "MetamodelVariability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetamodelVariability_Features(), this.getVariableFeature(), null, "features", null, 0, -1, MetamodelVariability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compulsoryEClass, Compulsory.class, "Compulsory", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(optionalEClass, Optional.class, "Optional", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exclusiveChoiceEClass, ExclusiveChoice.class, "ExclusiveChoice", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(singleChoiceEClass, SingleChoice.class, "SingleChoice", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_UniqueId(), ecorePackage.getEString(), "uniqueId", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Name(), ecorePackage.getEString(), "name", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Children(), this.getNode(), null, "children", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_NodeKind(), this.getNodeKind(), "nodeKind", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Constraints(), this.getConstraint(), null, "constraints", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableFeatureEClass, VariableFeature.class, "VariableFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableFeature_Feature(), theMM_uncertaintyPackage.getFeature(), null, "feature", null, 1, 1, VariableFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableFeature_Kind(), this.getFeatureKindGroup(), null, "kind", null, 0, 1, VariableFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableFeature_Cardinality(), this.getFeatureCardinalityGroup(), null, "cardinality", null, 0, 1, VariableFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformationOptionsEClass, TransformationOptions.class, "TransformationOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(allowUnresolvedBindingsEClass, AllowUnresolvedBindings.class, "AllowUnresolvedBindings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureKindGroupEClass, FeatureKindGroup.class, "FeatureKindGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureKindGroup_AttOrRef(), this.getAttOrReferenceExclusiveChoice(), null, "attOrRef", null, 1, 1, FeatureKindGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attOrReferenceExclusiveChoiceEClass, AttOrReferenceExclusiveChoice.class, "AttOrReferenceExclusiveChoice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttOrReferenceExclusiveChoice_AttributeChoice(), this.getAttributeTypeGroup(), null, "attributeChoice", null, 0, 1, AttOrReferenceExclusiveChoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttOrReferenceExclusiveChoice_ReferenceChoice(), this.getReferenceTypeGroup(), null, "referenceChoice", null, 0, 1, AttOrReferenceExclusiveChoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeTypeGroupEClass, AttributeTypeGroup.class, "AttributeTypeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeTypeGroup_Choices(), this.getAttributeTypeChoice(), null, "choices", null, 0, -1, AttributeTypeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceTypeGroupEClass, ReferenceTypeGroup.class, "ReferenceTypeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceTypeGroup_Choices(), this.getReferenceTypeChoice(), null, "choices", null, 0, -1, ReferenceTypeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureCardinalityGroupEClass, FeatureCardinalityGroup.class, "FeatureCardinalityGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureCardinalityGroup_Min(), this.getFeatureMinCardinalityChoice(), null, "min", null, 0, -1, FeatureCardinalityGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureCardinalityGroup_Max(), this.getFeatureMaxCardinalityChoice(), null, "max", null, 0, -1, FeatureCardinalityGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceTypeChoiceEClass, ReferenceTypeChoice.class, "ReferenceTypeChoice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceTypeChoice_Klass(), ecorePackage.getEObject(), null, "klass", null, 1, 1, ReferenceTypeChoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeTypeChoiceEClass, AttributeTypeChoice.class, "AttributeTypeChoice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeTypeChoice_Datatype_(), ecorePackage.getEObject(), null, "datatype_", null, 1, 1, AttributeTypeChoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureCardinalityChoiceEClass, FeatureCardinalityChoice.class, "FeatureCardinalityChoice", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureCardinalityChoice_Value(), ecorePackage.getEInt(), "value", null, 1, 1, FeatureCardinalityChoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureMinCardinalityChoiceEClass, FeatureMinCardinalityChoice.class, "FeatureMinCardinalityChoice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureMaxCardinalityChoiceEClass, FeatureMaxCardinalityChoice.class, "FeatureMaxCardinalityChoice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constraintEClass, Constraint.class, "Constraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requireEClass, Require.class, "Require", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequire_Nodes(), this.getNode(), null, "nodes", null, 0, -1, Require.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orRequiresEClass, OrRequires.class, "OrRequires", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(nodeKindEEnum, NodeKind.class, "NodeKind");
		addEEnumLiteral(nodeKindEEnum, NodeKind.ROOT);
		addEEnumLiteral(nodeKindEEnum, NodeKind.COMPULSORY);
		addEEnumLiteral(nodeKindEEnum, NodeKind.EXCLUSIVE_CHOICE);
		addEEnumLiteral(nodeKindEEnum, NodeKind.OPTIONAL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "MM_uncertainty", "MM_uncertainty.ecore#/"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });
	}

} //VariabilityFMPackageImpl
