/**
 */
package VariabilityFM.util;

import VariabilityFM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see VariabilityFM.VariabilityFMPackage
 * @generated
 */
public class VariabilityFMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VariabilityFMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariabilityFMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = VariabilityFMPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariabilityFMSwitch<Adapter> modelSwitch =
		new VariabilityFMSwitch<Adapter>() {
			@Override
			public Adapter caseVariabilityModel(VariabilityModel object) {
				return createVariabilityModelAdapter();
			}
			@Override
			public Adapter caseMetamodelVariability(MetamodelVariability object) {
				return createMetamodelVariabilityAdapter();
			}
			@Override
			public Adapter caseCompulsory(Compulsory object) {
				return createCompulsoryAdapter();
			}
			@Override
			public Adapter caseOptional(Optional object) {
				return createOptionalAdapter();
			}
			@Override
			public Adapter caseExclusiveChoice(ExclusiveChoice object) {
				return createExclusiveChoiceAdapter();
			}
			@Override
			public Adapter caseSingleChoice(SingleChoice object) {
				return createSingleChoiceAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseVariableFeature(VariableFeature object) {
				return createVariableFeatureAdapter();
			}
			@Override
			public Adapter caseTransformationOptions(TransformationOptions object) {
				return createTransformationOptionsAdapter();
			}
			@Override
			public Adapter caseAllowUnresolvedBindings(AllowUnresolvedBindings object) {
				return createAllowUnresolvedBindingsAdapter();
			}
			@Override
			public Adapter caseFeatureKindGroup(FeatureKindGroup object) {
				return createFeatureKindGroupAdapter();
			}
			@Override
			public Adapter caseAttOrReferenceExclusiveChoice(AttOrReferenceExclusiveChoice object) {
				return createAttOrReferenceExclusiveChoiceAdapter();
			}
			@Override
			public Adapter caseAttributeTypeGroup(AttributeTypeGroup object) {
				return createAttributeTypeGroupAdapter();
			}
			@Override
			public Adapter caseReferenceTypeGroup(ReferenceTypeGroup object) {
				return createReferenceTypeGroupAdapter();
			}
			@Override
			public Adapter caseFeatureCardinalityGroup(FeatureCardinalityGroup object) {
				return createFeatureCardinalityGroupAdapter();
			}
			@Override
			public Adapter caseReferenceTypeChoice(ReferenceTypeChoice object) {
				return createReferenceTypeChoiceAdapter();
			}
			@Override
			public Adapter caseAttributeTypeChoice(AttributeTypeChoice object) {
				return createAttributeTypeChoiceAdapter();
			}
			@Override
			public Adapter caseFeatureCardinalityChoice(FeatureCardinalityChoice object) {
				return createFeatureCardinalityChoiceAdapter();
			}
			@Override
			public Adapter caseFeatureMinCardinalityChoice(FeatureMinCardinalityChoice object) {
				return createFeatureMinCardinalityChoiceAdapter();
			}
			@Override
			public Adapter caseFeatureMaxCardinalityChoice(FeatureMaxCardinalityChoice object) {
				return createFeatureMaxCardinalityChoiceAdapter();
			}
			@Override
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			@Override
			public Adapter caseRequire(Require object) {
				return createRequireAdapter();
			}
			@Override
			public Adapter caseOrRequires(OrRequires object) {
				return createOrRequiresAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link VariabilityFM.VariabilityModel <em>Variability Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VariabilityFM.VariabilityModel
	 * @generated
	 */
	public Adapter createVariabilityModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VariabilityFM.MetamodelVariability <em>Metamodel Variability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VariabilityFM.MetamodelVariability
	 * @generated
	 */
	public Adapter createMetamodelVariabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VariabilityFM.Compulsory <em>Compulsory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VariabilityFM.Compulsory
	 * @generated
	 */
	public Adapter createCompulsoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VariabilityFM.Optional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VariabilityFM.Optional
	 * @generated
	 */
	public Adapter createOptionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VariabilityFM.ExclusiveChoice <em>Exclusive Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VariabilityFM.ExclusiveChoice
	 * @generated
	 */
	public Adapter createExclusiveChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VariabilityFM.SingleChoice <em>Single Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VariabilityFM.SingleChoice
	 * @generated
	 */
	public Adapter createSingleChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VariabilityFM.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VariabilityFM.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VariabilityFM.VariableFeature <em>Variable Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VariabilityFM.VariableFeature
	 * @generated
	 */
	public Adapter createVariableFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VariabilityFM.TransformationOptions <em>Transformation Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VariabilityFM.TransformationOptions
	 * @generated
	 */
	public Adapter createTransformationOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VariabilityFM.AllowUnresolvedBindings <em>Allow Unresolved Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VariabilityFM.AllowUnresolvedBindings
	 * @generated
	 */
	public Adapter createAllowUnresolvedBindingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VariabilityFM.FeatureKindGroup <em>Feature Kind Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VariabilityFM.FeatureKindGroup
	 * @generated
	 */
	public Adapter createFeatureKindGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VariabilityFM.AttOrReferenceExclusiveChoice <em>Att Or Reference Exclusive Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VariabilityFM.AttOrReferenceExclusiveChoice
	 * @generated
	 */
	public Adapter createAttOrReferenceExclusiveChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VariabilityFM.AttributeTypeGroup <em>Attribute Type Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VariabilityFM.AttributeTypeGroup
	 * @generated
	 */
	public Adapter createAttributeTypeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VariabilityFM.ReferenceTypeGroup <em>Reference Type Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VariabilityFM.ReferenceTypeGroup
	 * @generated
	 */
	public Adapter createReferenceTypeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VariabilityFM.FeatureCardinalityGroup <em>Feature Cardinality Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VariabilityFM.FeatureCardinalityGroup
	 * @generated
	 */
	public Adapter createFeatureCardinalityGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VariabilityFM.ReferenceTypeChoice <em>Reference Type Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VariabilityFM.ReferenceTypeChoice
	 * @generated
	 */
	public Adapter createReferenceTypeChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VariabilityFM.AttributeTypeChoice <em>Attribute Type Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VariabilityFM.AttributeTypeChoice
	 * @generated
	 */
	public Adapter createAttributeTypeChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VariabilityFM.FeatureCardinalityChoice <em>Feature Cardinality Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VariabilityFM.FeatureCardinalityChoice
	 * @generated
	 */
	public Adapter createFeatureCardinalityChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VariabilityFM.FeatureMinCardinalityChoice <em>Feature Min Cardinality Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VariabilityFM.FeatureMinCardinalityChoice
	 * @generated
	 */
	public Adapter createFeatureMinCardinalityChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VariabilityFM.FeatureMaxCardinalityChoice <em>Feature Max Cardinality Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VariabilityFM.FeatureMaxCardinalityChoice
	 * @generated
	 */
	public Adapter createFeatureMaxCardinalityChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VariabilityFM.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VariabilityFM.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VariabilityFM.Require <em>Require</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VariabilityFM.Require
	 * @generated
	 */
	public Adapter createRequireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VariabilityFM.OrRequires <em>Or Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VariabilityFM.OrRequires
	 * @generated
	 */
	public Adapter createOrRequiresAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //VariabilityFMAdapterFactory
