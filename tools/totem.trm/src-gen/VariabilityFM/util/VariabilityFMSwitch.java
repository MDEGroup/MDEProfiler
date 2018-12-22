/**
 */
package VariabilityFM.util;

import VariabilityFM.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see VariabilityFM.VariabilityFMPackage
 * @generated
 */
public class VariabilityFMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VariabilityFMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariabilityFMSwitch() {
		if (modelPackage == null) {
			modelPackage = VariabilityFMPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case VariabilityFMPackage.VARIABILITY_MODEL: {
				VariabilityModel variabilityModel = (VariabilityModel)theEObject;
				T result = caseVariabilityModel(variabilityModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityFMPackage.METAMODEL_VARIABILITY: {
				MetamodelVariability metamodelVariability = (MetamodelVariability)theEObject;
				T result = caseMetamodelVariability(metamodelVariability);
				if (result == null) result = caseNode(metamodelVariability);
				if (result == null) result = caseCompulsory(metamodelVariability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityFMPackage.COMPULSORY: {
				Compulsory compulsory = (Compulsory)theEObject;
				T result = caseCompulsory(compulsory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityFMPackage.OPTIONAL: {
				Optional optional = (Optional)theEObject;
				T result = caseOptional(optional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityFMPackage.EXCLUSIVE_CHOICE: {
				ExclusiveChoice exclusiveChoice = (ExclusiveChoice)theEObject;
				T result = caseExclusiveChoice(exclusiveChoice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityFMPackage.SINGLE_CHOICE: {
				SingleChoice singleChoice = (SingleChoice)theEObject;
				T result = caseSingleChoice(singleChoice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityFMPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityFMPackage.VARIABLE_FEATURE: {
				VariableFeature variableFeature = (VariableFeature)theEObject;
				T result = caseVariableFeature(variableFeature);
				if (result == null) result = caseCompulsory(variableFeature);
				if (result == null) result = caseNode(variableFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityFMPackage.TRANSFORMATION_OPTIONS: {
				TransformationOptions transformationOptions = (TransformationOptions)theEObject;
				T result = caseTransformationOptions(transformationOptions);
				if (result == null) result = caseCompulsory(transformationOptions);
				if (result == null) result = caseNode(transformationOptions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityFMPackage.ALLOW_UNRESOLVED_BINDINGS: {
				AllowUnresolvedBindings allowUnresolvedBindings = (AllowUnresolvedBindings)theEObject;
				T result = caseAllowUnresolvedBindings(allowUnresolvedBindings);
				if (result == null) result = caseOptional(allowUnresolvedBindings);
				if (result == null) result = caseNode(allowUnresolvedBindings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityFMPackage.FEATURE_KIND_GROUP: {
				FeatureKindGroup featureKindGroup = (FeatureKindGroup)theEObject;
				T result = caseFeatureKindGroup(featureKindGroup);
				if (result == null) result = caseNode(featureKindGroup);
				if (result == null) result = caseCompulsory(featureKindGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityFMPackage.ATT_OR_REFERENCE_EXCLUSIVE_CHOICE: {
				AttOrReferenceExclusiveChoice attOrReferenceExclusiveChoice = (AttOrReferenceExclusiveChoice)theEObject;
				T result = caseAttOrReferenceExclusiveChoice(attOrReferenceExclusiveChoice);
				if (result == null) result = caseNode(attOrReferenceExclusiveChoice);
				if (result == null) result = caseExclusiveChoice(attOrReferenceExclusiveChoice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityFMPackage.ATTRIBUTE_TYPE_GROUP: {
				AttributeTypeGroup attributeTypeGroup = (AttributeTypeGroup)theEObject;
				T result = caseAttributeTypeGroup(attributeTypeGroup);
				if (result == null) result = caseExclusiveChoice(attributeTypeGroup);
				if (result == null) result = caseNode(attributeTypeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityFMPackage.REFERENCE_TYPE_GROUP: {
				ReferenceTypeGroup referenceTypeGroup = (ReferenceTypeGroup)theEObject;
				T result = caseReferenceTypeGroup(referenceTypeGroup);
				if (result == null) result = caseExclusiveChoice(referenceTypeGroup);
				if (result == null) result = caseNode(referenceTypeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityFMPackage.FEATURE_CARDINALITY_GROUP: {
				FeatureCardinalityGroup featureCardinalityGroup = (FeatureCardinalityGroup)theEObject;
				T result = caseFeatureCardinalityGroup(featureCardinalityGroup);
				if (result == null) result = caseExclusiveChoice(featureCardinalityGroup);
				if (result == null) result = caseNode(featureCardinalityGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityFMPackage.REFERENCE_TYPE_CHOICE: {
				ReferenceTypeChoice referenceTypeChoice = (ReferenceTypeChoice)theEObject;
				T result = caseReferenceTypeChoice(referenceTypeChoice);
				if (result == null) result = caseSingleChoice(referenceTypeChoice);
				if (result == null) result = caseNode(referenceTypeChoice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityFMPackage.ATTRIBUTE_TYPE_CHOICE: {
				AttributeTypeChoice attributeTypeChoice = (AttributeTypeChoice)theEObject;
				T result = caseAttributeTypeChoice(attributeTypeChoice);
				if (result == null) result = caseSingleChoice(attributeTypeChoice);
				if (result == null) result = caseNode(attributeTypeChoice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityFMPackage.FEATURE_CARDINALITY_CHOICE: {
				FeatureCardinalityChoice featureCardinalityChoice = (FeatureCardinalityChoice)theEObject;
				T result = caseFeatureCardinalityChoice(featureCardinalityChoice);
				if (result == null) result = caseSingleChoice(featureCardinalityChoice);
				if (result == null) result = caseNode(featureCardinalityChoice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityFMPackage.FEATURE_MIN_CARDINALITY_CHOICE: {
				FeatureMinCardinalityChoice featureMinCardinalityChoice = (FeatureMinCardinalityChoice)theEObject;
				T result = caseFeatureMinCardinalityChoice(featureMinCardinalityChoice);
				if (result == null) result = caseFeatureCardinalityChoice(featureMinCardinalityChoice);
				if (result == null) result = caseSingleChoice(featureMinCardinalityChoice);
				if (result == null) result = caseNode(featureMinCardinalityChoice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityFMPackage.FEATURE_MAX_CARDINALITY_CHOICE: {
				FeatureMaxCardinalityChoice featureMaxCardinalityChoice = (FeatureMaxCardinalityChoice)theEObject;
				T result = caseFeatureMaxCardinalityChoice(featureMaxCardinalityChoice);
				if (result == null) result = caseFeatureCardinalityChoice(featureMaxCardinalityChoice);
				if (result == null) result = caseSingleChoice(featureMaxCardinalityChoice);
				if (result == null) result = caseNode(featureMaxCardinalityChoice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityFMPackage.CONSTRAINT: {
				Constraint constraint = (Constraint)theEObject;
				T result = caseConstraint(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityFMPackage.REQUIRE: {
				Require require = (Require)theEObject;
				T result = caseRequire(require);
				if (result == null) result = caseConstraint(require);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityFMPackage.OR_REQUIRES: {
				OrRequires orRequires = (OrRequires)theEObject;
				T result = caseOrRequires(orRequires);
				if (result == null) result = caseRequire(orRequires);
				if (result == null) result = caseConstraint(orRequires);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variability Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variability Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariabilityModel(VariabilityModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metamodel Variability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metamodel Variability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetamodelVariability(MetamodelVariability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compulsory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compulsory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompulsory(Compulsory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptional(Optional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclusive Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclusive Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExclusiveChoice(ExclusiveChoice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleChoice(SingleChoice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableFeature(VariableFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformationOptions(TransformationOptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allow Unresolved Bindings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allow Unresolved Bindings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllowUnresolvedBindings(AllowUnresolvedBindings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Kind Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Kind Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureKindGroup(FeatureKindGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Att Or Reference Exclusive Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Att Or Reference Exclusive Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttOrReferenceExclusiveChoice(AttOrReferenceExclusiveChoice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Type Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Type Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeTypeGroup(AttributeTypeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Type Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Type Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceTypeGroup(ReferenceTypeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Cardinality Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Cardinality Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureCardinalityGroup(FeatureCardinalityGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Type Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Type Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceTypeChoice(ReferenceTypeChoice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Type Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Type Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeTypeChoice(AttributeTypeChoice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Cardinality Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Cardinality Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureCardinalityChoice(FeatureCardinalityChoice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Min Cardinality Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Min Cardinality Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureMinCardinalityChoice(FeatureMinCardinalityChoice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Max Cardinality Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Max Cardinality Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureMaxCardinalityChoice(FeatureMaxCardinalityChoice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Require</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Require</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequire(Require object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Requires</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Requires</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrRequires(OrRequires object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //VariabilityFMSwitch
