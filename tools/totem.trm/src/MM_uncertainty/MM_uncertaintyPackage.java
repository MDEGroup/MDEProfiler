/**
 */
package MM_uncertainty;

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
 * @see MM_uncertainty.MM_uncertaintyFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface MM_uncertaintyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MM_uncertainty";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "MM_uncertainty";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MM_uncertainty";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MM_uncertaintyPackage eINSTANCE = MM_uncertainty.impl.MM_uncertaintyPackageImpl.init();

	/**
	 * The meta object id for the '{@link MM_uncertainty.impl.MetamodelImpl <em>Metamodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MM_uncertainty.impl.MetamodelImpl
	 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getMetamodel()
	 * @generated
	 */
	int METAMODEL = 0;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__CLASSES = 0;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__DATA_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MM_uncertainty.impl.ConstrainedElementImpl <em>Constrained Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MM_uncertainty.impl.ConstrainedElementImpl
	 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getConstrainedElement()
	 * @generated
	 */
	int CONSTRAINED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINED_ELEMENT__CONSTRAINTS = 0;

	/**
	 * The number of structural features of the '<em>Constrained Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Constrained Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MM_uncertainty.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MM_uncertainty.impl.ClassImpl
	 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 2;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CONSTRAINTS = CONSTRAINED_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = CONSTRAINED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ancs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ANCS = CONSTRAINED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Antiancs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ANTIANCS = CONSTRAINED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Feats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__FEATS = CONSTRAINED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mandatory Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__MANDATORY_ALLOWED = CONSTRAINED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_ABSTRACT = CONSTRAINED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Subs Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SUBS_ALLOWED = CONSTRAINED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = CONSTRAINED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = CONSTRAINED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MM_uncertainty.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MM_uncertainty.impl.FeatureImpl
	 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 3;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CONSTRAINTS = CONSTRAINED_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = CONSTRAINED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__MIN = CONSTRAINED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__MAX = CONSTRAINED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Has Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__HAS_TYPE = CONSTRAINED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = CONSTRAINED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = CONSTRAINED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MM_uncertainty.impl.FeatureTypeImpl <em>Feature Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MM_uncertainty.impl.FeatureTypeImpl
	 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getFeatureType()
	 * @generated
	 */
	int FEATURE_TYPE = 4;

	/**
	 * The number of structural features of the '<em>Feature Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Feature Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MM_uncertainty.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MM_uncertainty.impl.ReferenceImpl
	 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__TARGET = FEATURE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = FEATURE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = FEATURE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MM_uncertainty.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MM_uncertainty.impl.AttributeImpl
	 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = FEATURE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = FEATURE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = FEATURE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MM_uncertainty.impl.CardinalityImpl <em>Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MM_uncertainty.impl.CardinalityImpl
	 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getCardinality()
	 * @generated
	 */
	int CARDINALITY = 7;

	/**
	 * The number of structural features of the '<em>Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MM_uncertainty.impl.UnknownCardinalityImpl <em>Unknown Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MM_uncertainty.impl.UnknownCardinalityImpl
	 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getUnknownCardinality()
	 * @generated
	 */
	int UNKNOWN_CARDINALITY = 8;

	/**
	 * The number of structural features of the '<em>Unknown Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_CARDINALITY_FEATURE_COUNT = CARDINALITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unknown Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_CARDINALITY_OPERATION_COUNT = CARDINALITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MM_uncertainty.impl.ManyImpl <em>Many</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MM_uncertainty.impl.ManyImpl
	 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getMany()
	 * @generated
	 */
	int MANY = 9;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY__IS_ORDERED = CARDINALITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Duplicated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY__IS_DUPLICATED = CARDINALITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Many</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_FEATURE_COUNT = CARDINALITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Many</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_OPERATION_COUNT = CARDINALITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MM_uncertainty.impl.NumberImpl <em>Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MM_uncertainty.impl.NumberImpl
	 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getNumber()
	 * @generated
	 */
	int NUMBER = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__VALUE = CARDINALITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Allow Less</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__ALLOW_LESS = CARDINALITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Allow More</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__ALLOW_MORE = CARDINALITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FEATURE_COUNT = CARDINALITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATION_COUNT = CARDINALITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MM_uncertainty.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MM_uncertainty.impl.DataTypeImpl
	 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 11;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MM_uncertainty.impl.UnknownTypeImpl <em>Unknown Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MM_uncertainty.impl.UnknownTypeImpl
	 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getUnknownType()
	 * @generated
	 */
	int UNKNOWN_TYPE = 12;

	/**
	 * The number of structural features of the '<em>Unknown Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unknown Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MM_uncertainty.impl.NumericImpl <em>Numeric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MM_uncertainty.impl.NumericImpl
	 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getNumeric()
	 * @generated
	 */
	int NUMERIC = 13;

	/**
	 * The number of structural features of the '<em>Numeric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Numeric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MM_uncertainty.impl.Real_Impl <em>Real </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MM_uncertainty.impl.Real_Impl
	 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getReal_()
	 * @generated
	 */
	int REAL_ = 14;

	/**
	 * The number of structural features of the '<em>Real </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL__FEATURE_COUNT = NUMERIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Real </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL__OPERATION_COUNT = NUMERIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MM_uncertainty.impl.Integer_Impl <em>Integer </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MM_uncertainty.impl.Integer_Impl
	 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getInteger_()
	 * @generated
	 */
	int INTEGER_ = 15;

	/**
	 * The number of structural features of the '<em>Integer </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__FEATURE_COUNT = NUMERIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__OPERATION_COUNT = NUMERIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MM_uncertainty.impl.String_Impl <em>String </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MM_uncertainty.impl.String_Impl
	 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getString_()
	 * @generated
	 */
	int STRING_ = 16;

	/**
	 * The number of structural features of the '<em>String </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>String </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MM_uncertainty.impl.EnumImpl <em>Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MM_uncertainty.impl.EnumImpl
	 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getEnum()
	 * @generated
	 */
	int ENUM = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__NAME = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__LITERALS = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MM_uncertainty.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MM_uncertainty.impl.LiteralImpl
	 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__NAME = 0;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MM_uncertainty.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MM_uncertainty.impl.ConstraintImpl
	 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 19;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CONSTRAINT = 0;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MM_uncertainty.impl.UnknowClassImpl <em>Unknow Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MM_uncertainty.impl.UnknowClassImpl
	 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getUnknowClass()
	 * @generated
	 */
	int UNKNOW_CLASS = 20;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOW_CLASS__CONSTRAINTS = CLASS__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOW_CLASS__NAME = CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Ancs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOW_CLASS__ANCS = CLASS__ANCS;

	/**
	 * The feature id for the '<em><b>Antiancs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOW_CLASS__ANTIANCS = CLASS__ANTIANCS;

	/**
	 * The feature id for the '<em><b>Feats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOW_CLASS__FEATS = CLASS__FEATS;

	/**
	 * The feature id for the '<em><b>Mandatory Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOW_CLASS__MANDATORY_ALLOWED = CLASS__MANDATORY_ALLOWED;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOW_CLASS__IS_ABSTRACT = CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Subs Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOW_CLASS__SUBS_ALLOWED = CLASS__SUBS_ALLOWED;

	/**
	 * The number of structural features of the '<em>Unknow Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOW_CLASS_FEATURE_COUNT = CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unknow Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOW_CLASS_OPERATION_COUNT = CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MM_uncertainty.impl.Boolean_Impl <em>Boolean </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MM_uncertainty.impl.Boolean_Impl
	 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getBoolean_()
	 * @generated
	 */
	int BOOLEAN_ = 21;

	/**
	 * The number of structural features of the '<em>Boolean </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MM_uncertainty.UBoolean <em>UBoolean</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MM_uncertainty.UBoolean
	 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getUBoolean()
	 * @generated
	 */
	int UBOOLEAN = 22;


	/**
	 * Returns the meta object for class '{@link MM_uncertainty.Metamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel</em>'.
	 * @see MM_uncertainty.Metamodel
	 * @generated
	 */
	EClass getMetamodel();

	/**
	 * Returns the meta object for the containment reference list '{@link MM_uncertainty.Metamodel#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see MM_uncertainty.Metamodel#getClasses()
	 * @see #getMetamodel()
	 * @generated
	 */
	EReference getMetamodel_Classes();

	/**
	 * Returns the meta object for the containment reference list '{@link MM_uncertainty.Metamodel#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Type</em>'.
	 * @see MM_uncertainty.Metamodel#getDataType()
	 * @see #getMetamodel()
	 * @generated
	 */
	EReference getMetamodel_DataType();

	/**
	 * Returns the meta object for class '{@link MM_uncertainty.ConstrainedElement <em>Constrained Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constrained Element</em>'.
	 * @see MM_uncertainty.ConstrainedElement
	 * @generated
	 */
	EClass getConstrainedElement();

	/**
	 * Returns the meta object for the containment reference list '{@link MM_uncertainty.ConstrainedElement#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see MM_uncertainty.ConstrainedElement#getConstraints()
	 * @see #getConstrainedElement()
	 * @generated
	 */
	EReference getConstrainedElement_Constraints();

	/**
	 * Returns the meta object for class '{@link MM_uncertainty.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see MM_uncertainty.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the attribute '{@link MM_uncertainty.Class#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MM_uncertainty.Class#getName()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Name();

	/**
	 * Returns the meta object for the reference list '{@link MM_uncertainty.Class#getAncs <em>Ancs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ancs</em>'.
	 * @see MM_uncertainty.Class#getAncs()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Ancs();

	/**
	 * Returns the meta object for the reference list '{@link MM_uncertainty.Class#getAntiancs <em>Antiancs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Antiancs</em>'.
	 * @see MM_uncertainty.Class#getAntiancs()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Antiancs();

	/**
	 * Returns the meta object for the containment reference list '{@link MM_uncertainty.Class#getFeats <em>Feats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feats</em>'.
	 * @see MM_uncertainty.Class#getFeats()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Feats();

	/**
	 * Returns the meta object for the attribute '{@link MM_uncertainty.Class#isMandatoryAllowed <em>Mandatory Allowed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory Allowed</em>'.
	 * @see MM_uncertainty.Class#isMandatoryAllowed()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_MandatoryAllowed();

	/**
	 * Returns the meta object for the attribute '{@link MM_uncertainty.Class#getIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see MM_uncertainty.Class#getIsAbstract()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_IsAbstract();

	/**
	 * Returns the meta object for the attribute '{@link MM_uncertainty.Class#isSubsAllowed <em>Subs Allowed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subs Allowed</em>'.
	 * @see MM_uncertainty.Class#isSubsAllowed()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_SubsAllowed();

	/**
	 * Returns the meta object for class '{@link MM_uncertainty.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see MM_uncertainty.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link MM_uncertainty.Feature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MM_uncertainty.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Name();

	/**
	 * Returns the meta object for the containment reference '{@link MM_uncertainty.Feature#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min</em>'.
	 * @see MM_uncertainty.Feature#getMin()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Min();

	/**
	 * Returns the meta object for the containment reference '{@link MM_uncertainty.Feature#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max</em>'.
	 * @see MM_uncertainty.Feature#getMax()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Max();

	/**
	 * Returns the meta object for the containment reference list '{@link MM_uncertainty.Feature#getHasType <em>Has Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Type</em>'.
	 * @see MM_uncertainty.Feature#getHasType()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_HasType();

	/**
	 * Returns the meta object for class '{@link MM_uncertainty.FeatureType <em>Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Type</em>'.
	 * @see MM_uncertainty.FeatureType
	 * @generated
	 */
	EClass getFeatureType();

	/**
	 * Returns the meta object for class '{@link MM_uncertainty.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see MM_uncertainty.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the reference list '{@link MM_uncertainty.Reference#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see MM_uncertainty.Reference#getTarget()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Target();

	/**
	 * Returns the meta object for class '{@link MM_uncertainty.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see MM_uncertainty.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the reference list '{@link MM_uncertainty.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type</em>'.
	 * @see MM_uncertainty.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Type();

	/**
	 * Returns the meta object for class '{@link MM_uncertainty.Cardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cardinality</em>'.
	 * @see MM_uncertainty.Cardinality
	 * @generated
	 */
	EClass getCardinality();

	/**
	 * Returns the meta object for class '{@link MM_uncertainty.UnknownCardinality <em>Unknown Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unknown Cardinality</em>'.
	 * @see MM_uncertainty.UnknownCardinality
	 * @generated
	 */
	EClass getUnknownCardinality();

	/**
	 * Returns the meta object for class '{@link MM_uncertainty.Many <em>Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Many</em>'.
	 * @see MM_uncertainty.Many
	 * @generated
	 */
	EClass getMany();

	/**
	 * Returns the meta object for the attribute '{@link MM_uncertainty.Many#getIsOrdered <em>Is Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ordered</em>'.
	 * @see MM_uncertainty.Many#getIsOrdered()
	 * @see #getMany()
	 * @generated
	 */
	EAttribute getMany_IsOrdered();

	/**
	 * Returns the meta object for the attribute '{@link MM_uncertainty.Many#getIsDuplicated <em>Is Duplicated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Duplicated</em>'.
	 * @see MM_uncertainty.Many#getIsDuplicated()
	 * @see #getMany()
	 * @generated
	 */
	EAttribute getMany_IsDuplicated();

	/**
	 * Returns the meta object for class '{@link MM_uncertainty.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number</em>'.
	 * @see MM_uncertainty.Number
	 * @generated
	 */
	EClass getNumber();

	/**
	 * Returns the meta object for the attribute '{@link MM_uncertainty.Number#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see MM_uncertainty.Number#getValue()
	 * @see #getNumber()
	 * @generated
	 */
	EAttribute getNumber_Value();

	/**
	 * Returns the meta object for the attribute '{@link MM_uncertainty.Number#isAllowLess <em>Allow Less</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Less</em>'.
	 * @see MM_uncertainty.Number#isAllowLess()
	 * @see #getNumber()
	 * @generated
	 */
	EAttribute getNumber_AllowLess();

	/**
	 * Returns the meta object for the attribute '{@link MM_uncertainty.Number#isAllowMore <em>Allow More</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow More</em>'.
	 * @see MM_uncertainty.Number#isAllowMore()
	 * @see #getNumber()
	 * @generated
	 */
	EAttribute getNumber_AllowMore();

	/**
	 * Returns the meta object for class '{@link MM_uncertainty.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see MM_uncertainty.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link MM_uncertainty.UnknownType <em>Unknown Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unknown Type</em>'.
	 * @see MM_uncertainty.UnknownType
	 * @generated
	 */
	EClass getUnknownType();

	/**
	 * Returns the meta object for class '{@link MM_uncertainty.Numeric <em>Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric</em>'.
	 * @see MM_uncertainty.Numeric
	 * @generated
	 */
	EClass getNumeric();

	/**
	 * Returns the meta object for class '{@link MM_uncertainty.Real_ <em>Real </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real </em>'.
	 * @see MM_uncertainty.Real_
	 * @generated
	 */
	EClass getReal_();

	/**
	 * Returns the meta object for class '{@link MM_uncertainty.Integer_ <em>Integer </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer </em>'.
	 * @see MM_uncertainty.Integer_
	 * @generated
	 */
	EClass getInteger_();

	/**
	 * Returns the meta object for class '{@link MM_uncertainty.String_ <em>String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String </em>'.
	 * @see MM_uncertainty.String_
	 * @generated
	 */
	EClass getString_();

	/**
	 * Returns the meta object for class '{@link MM_uncertainty.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum</em>'.
	 * @see MM_uncertainty.Enum
	 * @generated
	 */
	EClass getEnum();

	/**
	 * Returns the meta object for the attribute '{@link MM_uncertainty.Enum#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MM_uncertainty.Enum#getName()
	 * @see #getEnum()
	 * @generated
	 */
	EAttribute getEnum_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link MM_uncertainty.Enum#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see MM_uncertainty.Enum#getLiterals()
	 * @see #getEnum()
	 * @generated
	 */
	EReference getEnum_Literals();

	/**
	 * Returns the meta object for class '{@link MM_uncertainty.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see MM_uncertainty.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the attribute '{@link MM_uncertainty.Literal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MM_uncertainty.Literal#getName()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Name();

	/**
	 * Returns the meta object for class '{@link MM_uncertainty.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see MM_uncertainty.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link MM_uncertainty.Constraint#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see MM_uncertainty.Constraint#getConstraint()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Constraint();

	/**
	 * Returns the meta object for class '{@link MM_uncertainty.UnknowClass <em>Unknow Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unknow Class</em>'.
	 * @see MM_uncertainty.UnknowClass
	 * @generated
	 */
	EClass getUnknowClass();

	/**
	 * Returns the meta object for class '{@link MM_uncertainty.Boolean_ <em>Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean </em>'.
	 * @see MM_uncertainty.Boolean_
	 * @generated
	 */
	EClass getBoolean_();

	/**
	 * Returns the meta object for enum '{@link MM_uncertainty.UBoolean <em>UBoolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>UBoolean</em>'.
	 * @see MM_uncertainty.UBoolean
	 * @generated
	 */
	EEnum getUBoolean();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MM_uncertaintyFactory getMM_uncertaintyFactory();

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
		 * The meta object literal for the '{@link MM_uncertainty.impl.MetamodelImpl <em>Metamodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MM_uncertainty.impl.MetamodelImpl
		 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getMetamodel()
		 * @generated
		 */
		EClass METAMODEL = eINSTANCE.getMetamodel();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL__CLASSES = eINSTANCE.getMetamodel_Classes();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL__DATA_TYPE = eINSTANCE.getMetamodel_DataType();

		/**
		 * The meta object literal for the '{@link MM_uncertainty.impl.ConstrainedElementImpl <em>Constrained Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MM_uncertainty.impl.ConstrainedElementImpl
		 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getConstrainedElement()
		 * @generated
		 */
		EClass CONSTRAINED_ELEMENT = eINSTANCE.getConstrainedElement();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINED_ELEMENT__CONSTRAINTS = eINSTANCE.getConstrainedElement_Constraints();

		/**
		 * The meta object literal for the '{@link MM_uncertainty.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MM_uncertainty.impl.ClassImpl
		 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__NAME = eINSTANCE.getClass_Name();

		/**
		 * The meta object literal for the '<em><b>Ancs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__ANCS = eINSTANCE.getClass_Ancs();

		/**
		 * The meta object literal for the '<em><b>Antiancs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__ANTIANCS = eINSTANCE.getClass_Antiancs();

		/**
		 * The meta object literal for the '<em><b>Feats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__FEATS = eINSTANCE.getClass_Feats();

		/**
		 * The meta object literal for the '<em><b>Mandatory Allowed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__MANDATORY_ALLOWED = eINSTANCE.getClass_MandatoryAllowed();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__IS_ABSTRACT = eINSTANCE.getClass_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Subs Allowed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__SUBS_ALLOWED = eINSTANCE.getClass_SubsAllowed();

		/**
		 * The meta object literal for the '{@link MM_uncertainty.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MM_uncertainty.impl.FeatureImpl
		 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__MIN = eINSTANCE.getFeature_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__MAX = eINSTANCE.getFeature_Max();

		/**
		 * The meta object literal for the '<em><b>Has Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__HAS_TYPE = eINSTANCE.getFeature_HasType();

		/**
		 * The meta object literal for the '{@link MM_uncertainty.impl.FeatureTypeImpl <em>Feature Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MM_uncertainty.impl.FeatureTypeImpl
		 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getFeatureType()
		 * @generated
		 */
		EClass FEATURE_TYPE = eINSTANCE.getFeatureType();

		/**
		 * The meta object literal for the '{@link MM_uncertainty.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MM_uncertainty.impl.ReferenceImpl
		 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__TARGET = eINSTANCE.getReference_Target();

		/**
		 * The meta object literal for the '{@link MM_uncertainty.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MM_uncertainty.impl.AttributeImpl
		 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '{@link MM_uncertainty.impl.CardinalityImpl <em>Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MM_uncertainty.impl.CardinalityImpl
		 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getCardinality()
		 * @generated
		 */
		EClass CARDINALITY = eINSTANCE.getCardinality();

		/**
		 * The meta object literal for the '{@link MM_uncertainty.impl.UnknownCardinalityImpl <em>Unknown Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MM_uncertainty.impl.UnknownCardinalityImpl
		 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getUnknownCardinality()
		 * @generated
		 */
		EClass UNKNOWN_CARDINALITY = eINSTANCE.getUnknownCardinality();

		/**
		 * The meta object literal for the '{@link MM_uncertainty.impl.ManyImpl <em>Many</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MM_uncertainty.impl.ManyImpl
		 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getMany()
		 * @generated
		 */
		EClass MANY = eINSTANCE.getMany();

		/**
		 * The meta object literal for the '<em><b>Is Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANY__IS_ORDERED = eINSTANCE.getMany_IsOrdered();

		/**
		 * The meta object literal for the '<em><b>Is Duplicated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANY__IS_DUPLICATED = eINSTANCE.getMany_IsDuplicated();

		/**
		 * The meta object literal for the '{@link MM_uncertainty.impl.NumberImpl <em>Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MM_uncertainty.impl.NumberImpl
		 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getNumber()
		 * @generated
		 */
		EClass NUMBER = eINSTANCE.getNumber();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER__VALUE = eINSTANCE.getNumber_Value();

		/**
		 * The meta object literal for the '<em><b>Allow Less</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER__ALLOW_LESS = eINSTANCE.getNumber_AllowLess();

		/**
		 * The meta object literal for the '<em><b>Allow More</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER__ALLOW_MORE = eINSTANCE.getNumber_AllowMore();

		/**
		 * The meta object literal for the '{@link MM_uncertainty.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MM_uncertainty.impl.DataTypeImpl
		 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link MM_uncertainty.impl.UnknownTypeImpl <em>Unknown Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MM_uncertainty.impl.UnknownTypeImpl
		 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getUnknownType()
		 * @generated
		 */
		EClass UNKNOWN_TYPE = eINSTANCE.getUnknownType();

		/**
		 * The meta object literal for the '{@link MM_uncertainty.impl.NumericImpl <em>Numeric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MM_uncertainty.impl.NumericImpl
		 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getNumeric()
		 * @generated
		 */
		EClass NUMERIC = eINSTANCE.getNumeric();

		/**
		 * The meta object literal for the '{@link MM_uncertainty.impl.Real_Impl <em>Real </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MM_uncertainty.impl.Real_Impl
		 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getReal_()
		 * @generated
		 */
		EClass REAL_ = eINSTANCE.getReal_();

		/**
		 * The meta object literal for the '{@link MM_uncertainty.impl.Integer_Impl <em>Integer </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MM_uncertainty.impl.Integer_Impl
		 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getInteger_()
		 * @generated
		 */
		EClass INTEGER_ = eINSTANCE.getInteger_();

		/**
		 * The meta object literal for the '{@link MM_uncertainty.impl.String_Impl <em>String </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MM_uncertainty.impl.String_Impl
		 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getString_()
		 * @generated
		 */
		EClass STRING_ = eINSTANCE.getString_();

		/**
		 * The meta object literal for the '{@link MM_uncertainty.impl.EnumImpl <em>Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MM_uncertainty.impl.EnumImpl
		 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getEnum()
		 * @generated
		 */
		EClass ENUM = eINSTANCE.getEnum();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM__NAME = eINSTANCE.getEnum_Name();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM__LITERALS = eINSTANCE.getEnum_Literals();

		/**
		 * The meta object literal for the '{@link MM_uncertainty.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MM_uncertainty.impl.LiteralImpl
		 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__NAME = eINSTANCE.getLiteral_Name();

		/**
		 * The meta object literal for the '{@link MM_uncertainty.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MM_uncertainty.impl.ConstraintImpl
		 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__CONSTRAINT = eINSTANCE.getConstraint_Constraint();

		/**
		 * The meta object literal for the '{@link MM_uncertainty.impl.UnknowClassImpl <em>Unknow Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MM_uncertainty.impl.UnknowClassImpl
		 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getUnknowClass()
		 * @generated
		 */
		EClass UNKNOW_CLASS = eINSTANCE.getUnknowClass();

		/**
		 * The meta object literal for the '{@link MM_uncertainty.impl.Boolean_Impl <em>Boolean </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MM_uncertainty.impl.Boolean_Impl
		 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getBoolean_()
		 * @generated
		 */
		EClass BOOLEAN_ = eINSTANCE.getBoolean_();

		/**
		 * The meta object literal for the '{@link MM_uncertainty.UBoolean <em>UBoolean</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MM_uncertainty.UBoolean
		 * @see MM_uncertainty.impl.MM_uncertaintyPackageImpl#getUBoolean()
		 * @generated
		 */
		EEnum UBOOLEAN = eINSTANCE.getUBoolean();

	}

} //MM_uncertaintyPackage
