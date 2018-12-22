/**
 */
package MM_uncertainty.impl;

import MM_uncertainty.Attribute;
import MM_uncertainty.Boolean_;
import MM_uncertainty.Constraint;
import MM_uncertainty.Feature;
import MM_uncertainty.Integer_;
import MM_uncertainty.Literal;
import MM_uncertainty.MM_uncertaintyFactory;
import MM_uncertainty.MM_uncertaintyPackage;
import MM_uncertainty.Many;
import MM_uncertainty.Metamodel;
import MM_uncertainty.Real_;
import MM_uncertainty.Reference;
import MM_uncertainty.String_;
import MM_uncertainty.UBoolean;
import MM_uncertainty.UnknowClass;
import MM_uncertainty.UnknownCardinality;
import MM_uncertainty.UnknownType;

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
public class MM_uncertaintyFactoryImpl extends EFactoryImpl implements MM_uncertaintyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MM_uncertaintyFactory init() {
		try {
			MM_uncertaintyFactory theMM_uncertaintyFactory = (MM_uncertaintyFactory)EPackage.Registry.INSTANCE.getEFactory(MM_uncertaintyPackage.eNS_URI);
			if (theMM_uncertaintyFactory != null) {
				return theMM_uncertaintyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MM_uncertaintyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MM_uncertaintyFactoryImpl() {
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
			case MM_uncertaintyPackage.METAMODEL: return createMetamodel();
			case MM_uncertaintyPackage.CLASS: return createClass();
			case MM_uncertaintyPackage.FEATURE: return createFeature();
			case MM_uncertaintyPackage.REFERENCE: return createReference();
			case MM_uncertaintyPackage.ATTRIBUTE: return createAttribute();
			case MM_uncertaintyPackage.UNKNOWN_CARDINALITY: return createUnknownCardinality();
			case MM_uncertaintyPackage.MANY: return createMany();
			case MM_uncertaintyPackage.NUMBER: return createNumber();
			case MM_uncertaintyPackage.UNKNOWN_TYPE: return createUnknownType();
			case MM_uncertaintyPackage.REAL_: return createReal_();
			case MM_uncertaintyPackage.INTEGER_: return createInteger_();
			case MM_uncertaintyPackage.STRING_: return createString_();
			case MM_uncertaintyPackage.ENUM: return createEnum();
			case MM_uncertaintyPackage.LITERAL: return createLiteral();
			case MM_uncertaintyPackage.CONSTRAINT: return createConstraint();
			case MM_uncertaintyPackage.UNKNOW_CLASS: return createUnknowClass();
			case MM_uncertaintyPackage.BOOLEAN_: return createBoolean_();
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
			case MM_uncertaintyPackage.UBOOLEAN:
				return createUBooleanFromString(eDataType, initialValue);
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
			case MM_uncertaintyPackage.UBOOLEAN:
				return convertUBooleanToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodel createMetamodel() {
		MetamodelImpl metamodel = new MetamodelImpl();
		return metamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MM_uncertainty.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnknownCardinality createUnknownCardinality() {
		UnknownCardinalityImpl unknownCardinality = new UnknownCardinalityImpl();
		return unknownCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Many createMany() {
		ManyImpl many = new ManyImpl();
		return many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MM_uncertainty.Number createNumber() {
		NumberImpl number = new NumberImpl();
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnknownType createUnknownType() {
		UnknownTypeImpl unknownType = new UnknownTypeImpl();
		return unknownType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Real_ createReal_() {
		Real_Impl real_ = new Real_Impl();
		return real_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer_ createInteger_() {
		Integer_Impl integer_ = new Integer_Impl();
		return integer_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String_ createString_() {
		String_Impl string_ = new String_Impl();
		return string_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MM_uncertainty.Enum createEnum() {
		EnumImpl enum_ = new EnumImpl();
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal createLiteral() {
		LiteralImpl literal = new LiteralImpl();
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnknowClass createUnknowClass() {
		UnknowClassImpl unknowClass = new UnknowClassImpl();
		return unknowClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean_ createBoolean_() {
		Boolean_Impl boolean_ = new Boolean_Impl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UBoolean createUBooleanFromString(EDataType eDataType, String initialValue) {
		UBoolean result = UBoolean.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUBooleanToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MM_uncertaintyPackage getMM_uncertaintyPackage() {
		return (MM_uncertaintyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MM_uncertaintyPackage getPackage() {
		return MM_uncertaintyPackage.eINSTANCE;
	}

} //MM_uncertaintyFactoryImpl
