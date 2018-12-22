/**
 */
package VariabilityFM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see VariabilityFM.VariabilityFMFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import MM_uncertainty='MM_uncertainty.ecore#/'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface VariabilityFMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "VariabilityFM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "VariabilityFM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "VariabilityFM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VariabilityFMPackage eINSTANCE = VariabilityFM.impl.VariabilityFMPackageImpl.init();

	/**
	 * The meta object id for the '{@link VariabilityFM.impl.VariabilityModelImpl <em>Variability Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VariabilityFM.impl.VariabilityModelImpl
	 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getVariabilityModel()
	 * @generated
	 */
	int VARIABILITY_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY_MODEL__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY_MODEL__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY_MODEL__OPTIONS = 2;

	/**
	 * The number of structural features of the '<em>Variability Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Variability Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link VariabilityFM.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VariabilityFM.impl.NodeImpl
	 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 6;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__UNIQUE_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CHILDREN = 2;

	/**
	 * The feature id for the '<em><b>Node Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NODE_KIND = 3;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CONSTRAINTS = 4;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link VariabilityFM.impl.MetamodelVariabilityImpl <em>Metamodel Variability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VariabilityFM.impl.MetamodelVariabilityImpl
	 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getMetamodelVariability()
	 * @generated
	 */
	int METAMODEL_VARIABILITY = 1;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_VARIABILITY__UNIQUE_ID = NODE__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_VARIABILITY__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_VARIABILITY__CHILDREN = NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Node Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_VARIABILITY__NODE_KIND = NODE__NODE_KIND;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_VARIABILITY__CONSTRAINTS = NODE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_VARIABILITY__FEATURES = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Metamodel Variability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_VARIABILITY_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Metamodel Variability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_VARIABILITY_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link VariabilityFM.impl.CompulsoryImpl <em>Compulsory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VariabilityFM.impl.CompulsoryImpl
	 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getCompulsory()
	 * @generated
	 */
	int COMPULSORY = 2;

	/**
	 * The number of structural features of the '<em>Compulsory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPULSORY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Compulsory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPULSORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link VariabilityFM.impl.OptionalImpl <em>Optional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VariabilityFM.impl.OptionalImpl
	 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getOptional()
	 * @generated
	 */
	int OPTIONAL = 3;

	/**
	 * The number of structural features of the '<em>Optional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Optional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link VariabilityFM.impl.ExclusiveChoiceImpl <em>Exclusive Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VariabilityFM.impl.ExclusiveChoiceImpl
	 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getExclusiveChoice()
	 * @generated
	 */
	int EXCLUSIVE_CHOICE = 4;

	/**
	 * The number of structural features of the '<em>Exclusive Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_CHOICE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Exclusive Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_CHOICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link VariabilityFM.impl.SingleChoiceImpl <em>Single Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VariabilityFM.impl.SingleChoiceImpl
	 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getSingleChoice()
	 * @generated
	 */
	int SINGLE_CHOICE = 5;

	/**
	 * The number of structural features of the '<em>Single Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CHOICE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Single Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CHOICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link VariabilityFM.impl.VariableFeatureImpl <em>Variable Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VariabilityFM.impl.VariableFeatureImpl
	 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getVariableFeature()
	 * @generated
	 */
	int VARIABLE_FEATURE = 7;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE__UNIQUE_ID = COMPULSORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE__NAME = COMPULSORY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE__CHILDREN = COMPULSORY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Node Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE__NODE_KIND = COMPULSORY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE__CONSTRAINTS = COMPULSORY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE__FEATURE = COMPULSORY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE__KIND = COMPULSORY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE__CARDINALITY = COMPULSORY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Variable Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_FEATURE_COUNT = COMPULSORY_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Variable Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_OPERATION_COUNT = COMPULSORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link VariabilityFM.impl.TransformationOptionsImpl <em>Transformation Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VariabilityFM.impl.TransformationOptionsImpl
	 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getTransformationOptions()
	 * @generated
	 */
	int TRANSFORMATION_OPTIONS = 8;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OPTIONS__UNIQUE_ID = COMPULSORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OPTIONS__NAME = COMPULSORY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OPTIONS__CHILDREN = COMPULSORY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Node Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OPTIONS__NODE_KIND = COMPULSORY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OPTIONS__CONSTRAINTS = COMPULSORY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Transformation Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OPTIONS_FEATURE_COUNT = COMPULSORY_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Transformation Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OPTIONS_OPERATION_COUNT = COMPULSORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link VariabilityFM.impl.AllowUnresolvedBindingsImpl <em>Allow Unresolved Bindings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VariabilityFM.impl.AllowUnresolvedBindingsImpl
	 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getAllowUnresolvedBindings()
	 * @generated
	 */
	int ALLOW_UNRESOLVED_BINDINGS = 9;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOW_UNRESOLVED_BINDINGS__UNIQUE_ID = OPTIONAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOW_UNRESOLVED_BINDINGS__NAME = OPTIONAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOW_UNRESOLVED_BINDINGS__CHILDREN = OPTIONAL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Node Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOW_UNRESOLVED_BINDINGS__NODE_KIND = OPTIONAL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOW_UNRESOLVED_BINDINGS__CONSTRAINTS = OPTIONAL_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Allow Unresolved Bindings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOW_UNRESOLVED_BINDINGS_FEATURE_COUNT = OPTIONAL_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Allow Unresolved Bindings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOW_UNRESOLVED_BINDINGS_OPERATION_COUNT = OPTIONAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link VariabilityFM.impl.FeatureKindGroupImpl <em>Feature Kind Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VariabilityFM.impl.FeatureKindGroupImpl
	 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getFeatureKindGroup()
	 * @generated
	 */
	int FEATURE_KIND_GROUP = 10;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_KIND_GROUP__UNIQUE_ID = NODE__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_KIND_GROUP__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_KIND_GROUP__CHILDREN = NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Node Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_KIND_GROUP__NODE_KIND = NODE__NODE_KIND;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_KIND_GROUP__CONSTRAINTS = NODE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Att Or Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_KIND_GROUP__ATT_OR_REF = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Kind Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_KIND_GROUP_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Feature Kind Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_KIND_GROUP_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link VariabilityFM.impl.AttOrReferenceExclusiveChoiceImpl <em>Att Or Reference Exclusive Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VariabilityFM.impl.AttOrReferenceExclusiveChoiceImpl
	 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getAttOrReferenceExclusiveChoice()
	 * @generated
	 */
	int ATT_OR_REFERENCE_EXCLUSIVE_CHOICE = 11;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATT_OR_REFERENCE_EXCLUSIVE_CHOICE__UNIQUE_ID = NODE__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATT_OR_REFERENCE_EXCLUSIVE_CHOICE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATT_OR_REFERENCE_EXCLUSIVE_CHOICE__CHILDREN = NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Node Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATT_OR_REFERENCE_EXCLUSIVE_CHOICE__NODE_KIND = NODE__NODE_KIND;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATT_OR_REFERENCE_EXCLUSIVE_CHOICE__CONSTRAINTS = NODE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Attribute Choice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATT_OR_REFERENCE_EXCLUSIVE_CHOICE__ATTRIBUTE_CHOICE = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference Choice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATT_OR_REFERENCE_EXCLUSIVE_CHOICE__REFERENCE_CHOICE = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Att Or Reference Exclusive Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATT_OR_REFERENCE_EXCLUSIVE_CHOICE_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Att Or Reference Exclusive Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATT_OR_REFERENCE_EXCLUSIVE_CHOICE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link VariabilityFM.impl.AttributeTypeGroupImpl <em>Attribute Type Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VariabilityFM.impl.AttributeTypeGroupImpl
	 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getAttributeTypeGroup()
	 * @generated
	 */
	int ATTRIBUTE_TYPE_GROUP = 12;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_GROUP__UNIQUE_ID = EXCLUSIVE_CHOICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_GROUP__NAME = EXCLUSIVE_CHOICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_GROUP__CHILDREN = EXCLUSIVE_CHOICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Node Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_GROUP__NODE_KIND = EXCLUSIVE_CHOICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_GROUP__CONSTRAINTS = EXCLUSIVE_CHOICE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Choices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_GROUP__CHOICES = EXCLUSIVE_CHOICE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Attribute Type Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_GROUP_FEATURE_COUNT = EXCLUSIVE_CHOICE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Attribute Type Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_GROUP_OPERATION_COUNT = EXCLUSIVE_CHOICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link VariabilityFM.impl.ReferenceTypeGroupImpl <em>Reference Type Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VariabilityFM.impl.ReferenceTypeGroupImpl
	 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getReferenceTypeGroup()
	 * @generated
	 */
	int REFERENCE_TYPE_GROUP = 13;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE_GROUP__UNIQUE_ID = EXCLUSIVE_CHOICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE_GROUP__NAME = EXCLUSIVE_CHOICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE_GROUP__CHILDREN = EXCLUSIVE_CHOICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Node Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE_GROUP__NODE_KIND = EXCLUSIVE_CHOICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE_GROUP__CONSTRAINTS = EXCLUSIVE_CHOICE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Choices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE_GROUP__CHOICES = EXCLUSIVE_CHOICE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Reference Type Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE_GROUP_FEATURE_COUNT = EXCLUSIVE_CHOICE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Reference Type Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE_GROUP_OPERATION_COUNT = EXCLUSIVE_CHOICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link VariabilityFM.impl.FeatureCardinalityGroupImpl <em>Feature Cardinality Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VariabilityFM.impl.FeatureCardinalityGroupImpl
	 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getFeatureCardinalityGroup()
	 * @generated
	 */
	int FEATURE_CARDINALITY_GROUP = 14;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CARDINALITY_GROUP__UNIQUE_ID = EXCLUSIVE_CHOICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CARDINALITY_GROUP__NAME = EXCLUSIVE_CHOICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CARDINALITY_GROUP__CHILDREN = EXCLUSIVE_CHOICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Node Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CARDINALITY_GROUP__NODE_KIND = EXCLUSIVE_CHOICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CARDINALITY_GROUP__CONSTRAINTS = EXCLUSIVE_CHOICE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CARDINALITY_GROUP__MIN = EXCLUSIVE_CHOICE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Max</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CARDINALITY_GROUP__MAX = EXCLUSIVE_CHOICE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Feature Cardinality Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CARDINALITY_GROUP_FEATURE_COUNT = EXCLUSIVE_CHOICE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Feature Cardinality Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CARDINALITY_GROUP_OPERATION_COUNT = EXCLUSIVE_CHOICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link VariabilityFM.impl.ReferenceTypeChoiceImpl <em>Reference Type Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VariabilityFM.impl.ReferenceTypeChoiceImpl
	 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getReferenceTypeChoice()
	 * @generated
	 */
	int REFERENCE_TYPE_CHOICE = 15;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE_CHOICE__UNIQUE_ID = SINGLE_CHOICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE_CHOICE__NAME = SINGLE_CHOICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE_CHOICE__CHILDREN = SINGLE_CHOICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Node Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE_CHOICE__NODE_KIND = SINGLE_CHOICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE_CHOICE__CONSTRAINTS = SINGLE_CHOICE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Klass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE_CHOICE__KLASS = SINGLE_CHOICE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Reference Type Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE_CHOICE_FEATURE_COUNT = SINGLE_CHOICE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Reference Type Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE_CHOICE_OPERATION_COUNT = SINGLE_CHOICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link VariabilityFM.impl.AttributeTypeChoiceImpl <em>Attribute Type Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VariabilityFM.impl.AttributeTypeChoiceImpl
	 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getAttributeTypeChoice()
	 * @generated
	 */
	int ATTRIBUTE_TYPE_CHOICE = 16;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_CHOICE__UNIQUE_ID = SINGLE_CHOICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_CHOICE__NAME = SINGLE_CHOICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_CHOICE__CHILDREN = SINGLE_CHOICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Node Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_CHOICE__NODE_KIND = SINGLE_CHOICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_CHOICE__CONSTRAINTS = SINGLE_CHOICE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Datatype </b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_CHOICE__DATATYPE_ = SINGLE_CHOICE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Attribute Type Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_CHOICE_FEATURE_COUNT = SINGLE_CHOICE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Attribute Type Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_CHOICE_OPERATION_COUNT = SINGLE_CHOICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link VariabilityFM.impl.FeatureCardinalityChoiceImpl <em>Feature Cardinality Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VariabilityFM.impl.FeatureCardinalityChoiceImpl
	 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getFeatureCardinalityChoice()
	 * @generated
	 */
	int FEATURE_CARDINALITY_CHOICE = 17;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CARDINALITY_CHOICE__UNIQUE_ID = SINGLE_CHOICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CARDINALITY_CHOICE__NAME = SINGLE_CHOICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CARDINALITY_CHOICE__CHILDREN = SINGLE_CHOICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Node Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CARDINALITY_CHOICE__NODE_KIND = SINGLE_CHOICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CARDINALITY_CHOICE__CONSTRAINTS = SINGLE_CHOICE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CARDINALITY_CHOICE__VALUE = SINGLE_CHOICE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Feature Cardinality Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CARDINALITY_CHOICE_FEATURE_COUNT = SINGLE_CHOICE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Feature Cardinality Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CARDINALITY_CHOICE_OPERATION_COUNT = SINGLE_CHOICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link VariabilityFM.impl.FeatureMinCardinalityChoiceImpl <em>Feature Min Cardinality Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VariabilityFM.impl.FeatureMinCardinalityChoiceImpl
	 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getFeatureMinCardinalityChoice()
	 * @generated
	 */
	int FEATURE_MIN_CARDINALITY_CHOICE = 18;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MIN_CARDINALITY_CHOICE__UNIQUE_ID = FEATURE_CARDINALITY_CHOICE__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MIN_CARDINALITY_CHOICE__NAME = FEATURE_CARDINALITY_CHOICE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MIN_CARDINALITY_CHOICE__CHILDREN = FEATURE_CARDINALITY_CHOICE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Node Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MIN_CARDINALITY_CHOICE__NODE_KIND = FEATURE_CARDINALITY_CHOICE__NODE_KIND;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MIN_CARDINALITY_CHOICE__CONSTRAINTS = FEATURE_CARDINALITY_CHOICE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MIN_CARDINALITY_CHOICE__VALUE = FEATURE_CARDINALITY_CHOICE__VALUE;

	/**
	 * The number of structural features of the '<em>Feature Min Cardinality Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MIN_CARDINALITY_CHOICE_FEATURE_COUNT = FEATURE_CARDINALITY_CHOICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Feature Min Cardinality Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MIN_CARDINALITY_CHOICE_OPERATION_COUNT = FEATURE_CARDINALITY_CHOICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link VariabilityFM.impl.FeatureMaxCardinalityChoiceImpl <em>Feature Max Cardinality Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VariabilityFM.impl.FeatureMaxCardinalityChoiceImpl
	 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getFeatureMaxCardinalityChoice()
	 * @generated
	 */
	int FEATURE_MAX_CARDINALITY_CHOICE = 19;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAX_CARDINALITY_CHOICE__UNIQUE_ID = FEATURE_CARDINALITY_CHOICE__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAX_CARDINALITY_CHOICE__NAME = FEATURE_CARDINALITY_CHOICE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAX_CARDINALITY_CHOICE__CHILDREN = FEATURE_CARDINALITY_CHOICE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Node Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAX_CARDINALITY_CHOICE__NODE_KIND = FEATURE_CARDINALITY_CHOICE__NODE_KIND;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAX_CARDINALITY_CHOICE__CONSTRAINTS = FEATURE_CARDINALITY_CHOICE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAX_CARDINALITY_CHOICE__VALUE = FEATURE_CARDINALITY_CHOICE__VALUE;

	/**
	 * The number of structural features of the '<em>Feature Max Cardinality Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAX_CARDINALITY_CHOICE_FEATURE_COUNT = FEATURE_CARDINALITY_CHOICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Feature Max Cardinality Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAX_CARDINALITY_CHOICE_OPERATION_COUNT = FEATURE_CARDINALITY_CHOICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link VariabilityFM.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VariabilityFM.impl.ConstraintImpl
	 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 20;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link VariabilityFM.impl.RequireImpl <em>Require</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VariabilityFM.impl.RequireImpl
	 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getRequire()
	 * @generated
	 */
	int REQUIRE = 21;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE__NODES = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Require</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Require</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link VariabilityFM.impl.OrRequiresImpl <em>Or Requires</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VariabilityFM.impl.OrRequiresImpl
	 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getOrRequires()
	 * @generated
	 */
	int OR_REQUIRES = 22;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_REQUIRES__NODES = REQUIRE__NODES;

	/**
	 * The number of structural features of the '<em>Or Requires</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_REQUIRES_FEATURE_COUNT = REQUIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or Requires</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_REQUIRES_OPERATION_COUNT = REQUIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link VariabilityFM.NodeKind <em>Node Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VariabilityFM.NodeKind
	 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getNodeKind()
	 * @generated
	 */
	int NODE_KIND = 23;


	/**
	 * Returns the meta object for class '{@link VariabilityFM.VariabilityModel <em>Variability Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variability Model</em>'.
	 * @see VariabilityFM.VariabilityModel
	 * @generated
	 */
	EClass getVariabilityModel();

	/**
	 * Returns the meta object for the containment reference '{@link VariabilityFM.VariabilityModel#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see VariabilityFM.VariabilityModel#getSource()
	 * @see #getVariabilityModel()
	 * @generated
	 */
	EReference getVariabilityModel_Source();

	/**
	 * Returns the meta object for the containment reference '{@link VariabilityFM.VariabilityModel#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see VariabilityFM.VariabilityModel#getTarget()
	 * @see #getVariabilityModel()
	 * @generated
	 */
	EReference getVariabilityModel_Target();

	/**
	 * Returns the meta object for the containment reference '{@link VariabilityFM.VariabilityModel#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Options</em>'.
	 * @see VariabilityFM.VariabilityModel#getOptions()
	 * @see #getVariabilityModel()
	 * @generated
	 */
	EReference getVariabilityModel_Options();

	/**
	 * Returns the meta object for class '{@link VariabilityFM.MetamodelVariability <em>Metamodel Variability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel Variability</em>'.
	 * @see VariabilityFM.MetamodelVariability
	 * @generated
	 */
	EClass getMetamodelVariability();

	/**
	 * Returns the meta object for the containment reference list '{@link VariabilityFM.MetamodelVariability#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see VariabilityFM.MetamodelVariability#getFeatures()
	 * @see #getMetamodelVariability()
	 * @generated
	 */
	EReference getMetamodelVariability_Features();

	/**
	 * Returns the meta object for class '{@link VariabilityFM.Compulsory <em>Compulsory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compulsory</em>'.
	 * @see VariabilityFM.Compulsory
	 * @generated
	 */
	EClass getCompulsory();

	/**
	 * Returns the meta object for class '{@link VariabilityFM.Optional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optional</em>'.
	 * @see VariabilityFM.Optional
	 * @generated
	 */
	EClass getOptional();

	/**
	 * Returns the meta object for class '{@link VariabilityFM.ExclusiveChoice <em>Exclusive Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclusive Choice</em>'.
	 * @see VariabilityFM.ExclusiveChoice
	 * @generated
	 */
	EClass getExclusiveChoice();

	/**
	 * Returns the meta object for class '{@link VariabilityFM.SingleChoice <em>Single Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Choice</em>'.
	 * @see VariabilityFM.SingleChoice
	 * @generated
	 */
	EClass getSingleChoice();

	/**
	 * Returns the meta object for class '{@link VariabilityFM.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see VariabilityFM.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link VariabilityFM.Node#getUniqueId <em>Unique Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Id</em>'.
	 * @see VariabilityFM.Node#getUniqueId()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_UniqueId();

	/**
	 * Returns the meta object for the attribute '{@link VariabilityFM.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see VariabilityFM.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link VariabilityFM.Node#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see VariabilityFM.Node#getChildren()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Children();

	/**
	 * Returns the meta object for the attribute '{@link VariabilityFM.Node#getNodeKind <em>Node Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Kind</em>'.
	 * @see VariabilityFM.Node#getNodeKind()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_NodeKind();

	/**
	 * Returns the meta object for the containment reference list '{@link VariabilityFM.Node#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see VariabilityFM.Node#getConstraints()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Constraints();

	/**
	 * Returns the meta object for class '{@link VariabilityFM.VariableFeature <em>Variable Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Feature</em>'.
	 * @see VariabilityFM.VariableFeature
	 * @generated
	 */
	EClass getVariableFeature();

	/**
	 * Returns the meta object for the reference '{@link VariabilityFM.VariableFeature#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see VariabilityFM.VariableFeature#getFeature()
	 * @see #getVariableFeature()
	 * @generated
	 */
	EReference getVariableFeature_Feature();

	/**
	 * Returns the meta object for the containment reference '{@link VariabilityFM.VariableFeature#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kind</em>'.
	 * @see VariabilityFM.VariableFeature#getKind()
	 * @see #getVariableFeature()
	 * @generated
	 */
	EReference getVariableFeature_Kind();

	/**
	 * Returns the meta object for the containment reference '{@link VariabilityFM.VariableFeature#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cardinality</em>'.
	 * @see VariabilityFM.VariableFeature#getCardinality()
	 * @see #getVariableFeature()
	 * @generated
	 */
	EReference getVariableFeature_Cardinality();

	/**
	 * Returns the meta object for class '{@link VariabilityFM.TransformationOptions <em>Transformation Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation Options</em>'.
	 * @see VariabilityFM.TransformationOptions
	 * @generated
	 */
	EClass getTransformationOptions();

	/**
	 * Returns the meta object for class '{@link VariabilityFM.AllowUnresolvedBindings <em>Allow Unresolved Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allow Unresolved Bindings</em>'.
	 * @see VariabilityFM.AllowUnresolvedBindings
	 * @generated
	 */
	EClass getAllowUnresolvedBindings();

	/**
	 * Returns the meta object for class '{@link VariabilityFM.FeatureKindGroup <em>Feature Kind Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Kind Group</em>'.
	 * @see VariabilityFM.FeatureKindGroup
	 * @generated
	 */
	EClass getFeatureKindGroup();

	/**
	 * Returns the meta object for the containment reference '{@link VariabilityFM.FeatureKindGroup#getAttOrRef <em>Att Or Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Att Or Ref</em>'.
	 * @see VariabilityFM.FeatureKindGroup#getAttOrRef()
	 * @see #getFeatureKindGroup()
	 * @generated
	 */
	EReference getFeatureKindGroup_AttOrRef();

	/**
	 * Returns the meta object for class '{@link VariabilityFM.AttOrReferenceExclusiveChoice <em>Att Or Reference Exclusive Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Att Or Reference Exclusive Choice</em>'.
	 * @see VariabilityFM.AttOrReferenceExclusiveChoice
	 * @generated
	 */
	EClass getAttOrReferenceExclusiveChoice();

	/**
	 * Returns the meta object for the containment reference '{@link VariabilityFM.AttOrReferenceExclusiveChoice#getAttributeChoice <em>Attribute Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attribute Choice</em>'.
	 * @see VariabilityFM.AttOrReferenceExclusiveChoice#getAttributeChoice()
	 * @see #getAttOrReferenceExclusiveChoice()
	 * @generated
	 */
	EReference getAttOrReferenceExclusiveChoice_AttributeChoice();

	/**
	 * Returns the meta object for the containment reference '{@link VariabilityFM.AttOrReferenceExclusiveChoice#getReferenceChoice <em>Reference Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference Choice</em>'.
	 * @see VariabilityFM.AttOrReferenceExclusiveChoice#getReferenceChoice()
	 * @see #getAttOrReferenceExclusiveChoice()
	 * @generated
	 */
	EReference getAttOrReferenceExclusiveChoice_ReferenceChoice();

	/**
	 * Returns the meta object for class '{@link VariabilityFM.AttributeTypeGroup <em>Attribute Type Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Type Group</em>'.
	 * @see VariabilityFM.AttributeTypeGroup
	 * @generated
	 */
	EClass getAttributeTypeGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link VariabilityFM.AttributeTypeGroup#getChoices <em>Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Choices</em>'.
	 * @see VariabilityFM.AttributeTypeGroup#getChoices()
	 * @see #getAttributeTypeGroup()
	 * @generated
	 */
	EReference getAttributeTypeGroup_Choices();

	/**
	 * Returns the meta object for class '{@link VariabilityFM.ReferenceTypeGroup <em>Reference Type Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Type Group</em>'.
	 * @see VariabilityFM.ReferenceTypeGroup
	 * @generated
	 */
	EClass getReferenceTypeGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link VariabilityFM.ReferenceTypeGroup#getChoices <em>Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Choices</em>'.
	 * @see VariabilityFM.ReferenceTypeGroup#getChoices()
	 * @see #getReferenceTypeGroup()
	 * @generated
	 */
	EReference getReferenceTypeGroup_Choices();

	/**
	 * Returns the meta object for class '{@link VariabilityFM.FeatureCardinalityGroup <em>Feature Cardinality Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Cardinality Group</em>'.
	 * @see VariabilityFM.FeatureCardinalityGroup
	 * @generated
	 */
	EClass getFeatureCardinalityGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link VariabilityFM.FeatureCardinalityGroup#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Min</em>'.
	 * @see VariabilityFM.FeatureCardinalityGroup#getMin()
	 * @see #getFeatureCardinalityGroup()
	 * @generated
	 */
	EReference getFeatureCardinalityGroup_Min();

	/**
	 * Returns the meta object for the containment reference list '{@link VariabilityFM.FeatureCardinalityGroup#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Max</em>'.
	 * @see VariabilityFM.FeatureCardinalityGroup#getMax()
	 * @see #getFeatureCardinalityGroup()
	 * @generated
	 */
	EReference getFeatureCardinalityGroup_Max();

	/**
	 * Returns the meta object for class '{@link VariabilityFM.ReferenceTypeChoice <em>Reference Type Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Type Choice</em>'.
	 * @see VariabilityFM.ReferenceTypeChoice
	 * @generated
	 */
	EClass getReferenceTypeChoice();

	/**
	 * Returns the meta object for the reference '{@link VariabilityFM.ReferenceTypeChoice#getKlass <em>Klass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Klass</em>'.
	 * @see VariabilityFM.ReferenceTypeChoice#getKlass()
	 * @see #getReferenceTypeChoice()
	 * @generated
	 */
	EReference getReferenceTypeChoice_Klass();

	/**
	 * Returns the meta object for class '{@link VariabilityFM.AttributeTypeChoice <em>Attribute Type Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Type Choice</em>'.
	 * @see VariabilityFM.AttributeTypeChoice
	 * @generated
	 */
	EClass getAttributeTypeChoice();

	/**
	 * Returns the meta object for the reference '{@link VariabilityFM.AttributeTypeChoice#getDatatype_ <em>Datatype </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype </em>'.
	 * @see VariabilityFM.AttributeTypeChoice#getDatatype_()
	 * @see #getAttributeTypeChoice()
	 * @generated
	 */
	EReference getAttributeTypeChoice_Datatype_();

	/**
	 * Returns the meta object for class '{@link VariabilityFM.FeatureCardinalityChoice <em>Feature Cardinality Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Cardinality Choice</em>'.
	 * @see VariabilityFM.FeatureCardinalityChoice
	 * @generated
	 */
	EClass getFeatureCardinalityChoice();

	/**
	 * Returns the meta object for the attribute '{@link VariabilityFM.FeatureCardinalityChoice#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see VariabilityFM.FeatureCardinalityChoice#getValue()
	 * @see #getFeatureCardinalityChoice()
	 * @generated
	 */
	EAttribute getFeatureCardinalityChoice_Value();

	/**
	 * Returns the meta object for class '{@link VariabilityFM.FeatureMinCardinalityChoice <em>Feature Min Cardinality Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Min Cardinality Choice</em>'.
	 * @see VariabilityFM.FeatureMinCardinalityChoice
	 * @generated
	 */
	EClass getFeatureMinCardinalityChoice();

	/**
	 * Returns the meta object for class '{@link VariabilityFM.FeatureMaxCardinalityChoice <em>Feature Max Cardinality Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Max Cardinality Choice</em>'.
	 * @see VariabilityFM.FeatureMaxCardinalityChoice
	 * @generated
	 */
	EClass getFeatureMaxCardinalityChoice();

	/**
	 * Returns the meta object for class '{@link VariabilityFM.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see VariabilityFM.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for class '{@link VariabilityFM.Require <em>Require</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Require</em>'.
	 * @see VariabilityFM.Require
	 * @generated
	 */
	EClass getRequire();

	/**
	 * Returns the meta object for the reference list '{@link VariabilityFM.Require#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nodes</em>'.
	 * @see VariabilityFM.Require#getNodes()
	 * @see #getRequire()
	 * @generated
	 */
	EReference getRequire_Nodes();

	/**
	 * Returns the meta object for class '{@link VariabilityFM.OrRequires <em>Or Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Requires</em>'.
	 * @see VariabilityFM.OrRequires
	 * @generated
	 */
	EClass getOrRequires();

	/**
	 * Returns the meta object for enum '{@link VariabilityFM.NodeKind <em>Node Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Node Kind</em>'.
	 * @see VariabilityFM.NodeKind
	 * @generated
	 */
	EEnum getNodeKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VariabilityFMFactory getVariabilityFMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link VariabilityFM.impl.VariabilityModelImpl <em>Variability Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VariabilityFM.impl.VariabilityModelImpl
		 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getVariabilityModel()
		 * @generated
		 */
		EClass VARIABILITY_MODEL = eINSTANCE.getVariabilityModel();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABILITY_MODEL__SOURCE = eINSTANCE.getVariabilityModel_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABILITY_MODEL__TARGET = eINSTANCE.getVariabilityModel_Target();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABILITY_MODEL__OPTIONS = eINSTANCE.getVariabilityModel_Options();

		/**
		 * The meta object literal for the '{@link VariabilityFM.impl.MetamodelVariabilityImpl <em>Metamodel Variability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VariabilityFM.impl.MetamodelVariabilityImpl
		 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getMetamodelVariability()
		 * @generated
		 */
		EClass METAMODEL_VARIABILITY = eINSTANCE.getMetamodelVariability();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL_VARIABILITY__FEATURES = eINSTANCE.getMetamodelVariability_Features();

		/**
		 * The meta object literal for the '{@link VariabilityFM.impl.CompulsoryImpl <em>Compulsory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VariabilityFM.impl.CompulsoryImpl
		 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getCompulsory()
		 * @generated
		 */
		EClass COMPULSORY = eINSTANCE.getCompulsory();

		/**
		 * The meta object literal for the '{@link VariabilityFM.impl.OptionalImpl <em>Optional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VariabilityFM.impl.OptionalImpl
		 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getOptional()
		 * @generated
		 */
		EClass OPTIONAL = eINSTANCE.getOptional();

		/**
		 * The meta object literal for the '{@link VariabilityFM.impl.ExclusiveChoiceImpl <em>Exclusive Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VariabilityFM.impl.ExclusiveChoiceImpl
		 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getExclusiveChoice()
		 * @generated
		 */
		EClass EXCLUSIVE_CHOICE = eINSTANCE.getExclusiveChoice();

		/**
		 * The meta object literal for the '{@link VariabilityFM.impl.SingleChoiceImpl <em>Single Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VariabilityFM.impl.SingleChoiceImpl
		 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getSingleChoice()
		 * @generated
		 */
		EClass SINGLE_CHOICE = eINSTANCE.getSingleChoice();

		/**
		 * The meta object literal for the '{@link VariabilityFM.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VariabilityFM.impl.NodeImpl
		 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Unique Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__UNIQUE_ID = eINSTANCE.getNode_UniqueId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__CHILDREN = eINSTANCE.getNode_Children();

		/**
		 * The meta object literal for the '<em><b>Node Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NODE_KIND = eINSTANCE.getNode_NodeKind();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__CONSTRAINTS = eINSTANCE.getNode_Constraints();

		/**
		 * The meta object literal for the '{@link VariabilityFM.impl.VariableFeatureImpl <em>Variable Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VariabilityFM.impl.VariableFeatureImpl
		 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getVariableFeature()
		 * @generated
		 */
		EClass VARIABLE_FEATURE = eINSTANCE.getVariableFeature();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_FEATURE__FEATURE = eINSTANCE.getVariableFeature_Feature();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_FEATURE__KIND = eINSTANCE.getVariableFeature_Kind();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_FEATURE__CARDINALITY = eINSTANCE.getVariableFeature_Cardinality();

		/**
		 * The meta object literal for the '{@link VariabilityFM.impl.TransformationOptionsImpl <em>Transformation Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VariabilityFM.impl.TransformationOptionsImpl
		 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getTransformationOptions()
		 * @generated
		 */
		EClass TRANSFORMATION_OPTIONS = eINSTANCE.getTransformationOptions();

		/**
		 * The meta object literal for the '{@link VariabilityFM.impl.AllowUnresolvedBindingsImpl <em>Allow Unresolved Bindings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VariabilityFM.impl.AllowUnresolvedBindingsImpl
		 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getAllowUnresolvedBindings()
		 * @generated
		 */
		EClass ALLOW_UNRESOLVED_BINDINGS = eINSTANCE.getAllowUnresolvedBindings();

		/**
		 * The meta object literal for the '{@link VariabilityFM.impl.FeatureKindGroupImpl <em>Feature Kind Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VariabilityFM.impl.FeatureKindGroupImpl
		 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getFeatureKindGroup()
		 * @generated
		 */
		EClass FEATURE_KIND_GROUP = eINSTANCE.getFeatureKindGroup();

		/**
		 * The meta object literal for the '<em><b>Att Or Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_KIND_GROUP__ATT_OR_REF = eINSTANCE.getFeatureKindGroup_AttOrRef();

		/**
		 * The meta object literal for the '{@link VariabilityFM.impl.AttOrReferenceExclusiveChoiceImpl <em>Att Or Reference Exclusive Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VariabilityFM.impl.AttOrReferenceExclusiveChoiceImpl
		 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getAttOrReferenceExclusiveChoice()
		 * @generated
		 */
		EClass ATT_OR_REFERENCE_EXCLUSIVE_CHOICE = eINSTANCE.getAttOrReferenceExclusiveChoice();

		/**
		 * The meta object literal for the '<em><b>Attribute Choice</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATT_OR_REFERENCE_EXCLUSIVE_CHOICE__ATTRIBUTE_CHOICE = eINSTANCE.getAttOrReferenceExclusiveChoice_AttributeChoice();

		/**
		 * The meta object literal for the '<em><b>Reference Choice</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATT_OR_REFERENCE_EXCLUSIVE_CHOICE__REFERENCE_CHOICE = eINSTANCE.getAttOrReferenceExclusiveChoice_ReferenceChoice();

		/**
		 * The meta object literal for the '{@link VariabilityFM.impl.AttributeTypeGroupImpl <em>Attribute Type Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VariabilityFM.impl.AttributeTypeGroupImpl
		 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getAttributeTypeGroup()
		 * @generated
		 */
		EClass ATTRIBUTE_TYPE_GROUP = eINSTANCE.getAttributeTypeGroup();

		/**
		 * The meta object literal for the '<em><b>Choices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_TYPE_GROUP__CHOICES = eINSTANCE.getAttributeTypeGroup_Choices();

		/**
		 * The meta object literal for the '{@link VariabilityFM.impl.ReferenceTypeGroupImpl <em>Reference Type Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VariabilityFM.impl.ReferenceTypeGroupImpl
		 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getReferenceTypeGroup()
		 * @generated
		 */
		EClass REFERENCE_TYPE_GROUP = eINSTANCE.getReferenceTypeGroup();

		/**
		 * The meta object literal for the '<em><b>Choices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_TYPE_GROUP__CHOICES = eINSTANCE.getReferenceTypeGroup_Choices();

		/**
		 * The meta object literal for the '{@link VariabilityFM.impl.FeatureCardinalityGroupImpl <em>Feature Cardinality Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VariabilityFM.impl.FeatureCardinalityGroupImpl
		 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getFeatureCardinalityGroup()
		 * @generated
		 */
		EClass FEATURE_CARDINALITY_GROUP = eINSTANCE.getFeatureCardinalityGroup();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_CARDINALITY_GROUP__MIN = eINSTANCE.getFeatureCardinalityGroup_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_CARDINALITY_GROUP__MAX = eINSTANCE.getFeatureCardinalityGroup_Max();

		/**
		 * The meta object literal for the '{@link VariabilityFM.impl.ReferenceTypeChoiceImpl <em>Reference Type Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VariabilityFM.impl.ReferenceTypeChoiceImpl
		 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getReferenceTypeChoice()
		 * @generated
		 */
		EClass REFERENCE_TYPE_CHOICE = eINSTANCE.getReferenceTypeChoice();

		/**
		 * The meta object literal for the '<em><b>Klass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_TYPE_CHOICE__KLASS = eINSTANCE.getReferenceTypeChoice_Klass();

		/**
		 * The meta object literal for the '{@link VariabilityFM.impl.AttributeTypeChoiceImpl <em>Attribute Type Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VariabilityFM.impl.AttributeTypeChoiceImpl
		 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getAttributeTypeChoice()
		 * @generated
		 */
		EClass ATTRIBUTE_TYPE_CHOICE = eINSTANCE.getAttributeTypeChoice();

		/**
		 * The meta object literal for the '<em><b>Datatype </b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_TYPE_CHOICE__DATATYPE_ = eINSTANCE.getAttributeTypeChoice_Datatype_();

		/**
		 * The meta object literal for the '{@link VariabilityFM.impl.FeatureCardinalityChoiceImpl <em>Feature Cardinality Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VariabilityFM.impl.FeatureCardinalityChoiceImpl
		 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getFeatureCardinalityChoice()
		 * @generated
		 */
		EClass FEATURE_CARDINALITY_CHOICE = eINSTANCE.getFeatureCardinalityChoice();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_CARDINALITY_CHOICE__VALUE = eINSTANCE.getFeatureCardinalityChoice_Value();

		/**
		 * The meta object literal for the '{@link VariabilityFM.impl.FeatureMinCardinalityChoiceImpl <em>Feature Min Cardinality Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VariabilityFM.impl.FeatureMinCardinalityChoiceImpl
		 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getFeatureMinCardinalityChoice()
		 * @generated
		 */
		EClass FEATURE_MIN_CARDINALITY_CHOICE = eINSTANCE.getFeatureMinCardinalityChoice();

		/**
		 * The meta object literal for the '{@link VariabilityFM.impl.FeatureMaxCardinalityChoiceImpl <em>Feature Max Cardinality Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VariabilityFM.impl.FeatureMaxCardinalityChoiceImpl
		 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getFeatureMaxCardinalityChoice()
		 * @generated
		 */
		EClass FEATURE_MAX_CARDINALITY_CHOICE = eINSTANCE.getFeatureMaxCardinalityChoice();

		/**
		 * The meta object literal for the '{@link VariabilityFM.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VariabilityFM.impl.ConstraintImpl
		 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '{@link VariabilityFM.impl.RequireImpl <em>Require</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VariabilityFM.impl.RequireImpl
		 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getRequire()
		 * @generated
		 */
		EClass REQUIRE = eINSTANCE.getRequire();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRE__NODES = eINSTANCE.getRequire_Nodes();

		/**
		 * The meta object literal for the '{@link VariabilityFM.impl.OrRequiresImpl <em>Or Requires</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VariabilityFM.impl.OrRequiresImpl
		 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getOrRequires()
		 * @generated
		 */
		EClass OR_REQUIRES = eINSTANCE.getOrRequires();

		/**
		 * The meta object literal for the '{@link VariabilityFM.NodeKind <em>Node Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VariabilityFM.NodeKind
		 * @see VariabilityFM.impl.VariabilityFMPackageImpl#getNodeKind()
		 * @generated
		 */
		EEnum NODE_KIND = eINSTANCE.getNodeKind();

	}

} //VariabilityFMPackage
