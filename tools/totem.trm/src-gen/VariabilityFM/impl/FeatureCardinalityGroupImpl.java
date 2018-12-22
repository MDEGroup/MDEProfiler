/**
 */
package VariabilityFM.impl;

import VariabilityFM.Constraint;
import VariabilityFM.FeatureCardinalityGroup;
import VariabilityFM.FeatureMaxCardinalityChoice;
import VariabilityFM.FeatureMinCardinalityChoice;
import VariabilityFM.Node;
import VariabilityFM.NodeKind;
import VariabilityFM.VariabilityFMPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Cardinality Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link VariabilityFM.impl.FeatureCardinalityGroupImpl#getUniqueId <em>Unique Id</em>}</li>
 *   <li>{@link VariabilityFM.impl.FeatureCardinalityGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link VariabilityFM.impl.FeatureCardinalityGroupImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link VariabilityFM.impl.FeatureCardinalityGroupImpl#getNodeKind <em>Node Kind</em>}</li>
 *   <li>{@link VariabilityFM.impl.FeatureCardinalityGroupImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link VariabilityFM.impl.FeatureCardinalityGroupImpl#getMin <em>Min</em>}</li>
 *   <li>{@link VariabilityFM.impl.FeatureCardinalityGroupImpl#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureCardinalityGroupImpl extends ExclusiveChoiceImpl implements FeatureCardinalityGroup {
	/**
	 * The default value of the '{@link #getUniqueId() <em>Unique Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueId()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIQUE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUniqueId() <em>Unique Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueId()
	 * @generated
	 * @ordered
	 */
	protected String uniqueId = UNIQUE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> children;

	/**
	 * The default value of the '{@link #getNodeKind() <em>Node Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeKind()
	 * @generated
	 * @ordered
	 */
	protected static final NodeKind NODE_KIND_EDEFAULT = NodeKind.ROOT;

	/**
	 * The cached value of the '{@link #getNodeKind() <em>Node Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeKind()
	 * @generated
	 * @ordered
	 */
	protected NodeKind nodeKind = NODE_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraints;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureMinCardinalityChoice> min;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureMaxCardinalityChoice> max;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureCardinalityGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariabilityFMPackage.Literals.FEATURE_CARDINALITY_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUniqueId() {
		return uniqueId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniqueId(String newUniqueId) {
		String oldUniqueId = uniqueId;
		uniqueId = newUniqueId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__UNIQUE_ID, oldUniqueId, uniqueId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<Node>(Node.class, this, VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeKind getNodeKind() {
		return nodeKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeKind(NodeKind newNodeKind) {
		NodeKind oldNodeKind = nodeKind;
		nodeKind = newNodeKind == null ? NODE_KIND_EDEFAULT : newNodeKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__NODE_KIND, oldNodeKind, nodeKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureMinCardinalityChoice> getMin() {
		if (min == null) {
			min = new EObjectContainmentEList<FeatureMinCardinalityChoice>(FeatureMinCardinalityChoice.class, this, VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__MIN);
		}
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureMaxCardinalityChoice> getMax() {
		if (max == null) {
			max = new EObjectContainmentEList<FeatureMaxCardinalityChoice>(FeatureMaxCardinalityChoice.class, this, VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__MAX);
		}
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
			case VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__MIN:
				return ((InternalEList<?>)getMin()).basicRemove(otherEnd, msgs);
			case VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__MAX:
				return ((InternalEList<?>)getMax()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__UNIQUE_ID:
				return getUniqueId();
			case VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__NAME:
				return getName();
			case VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__CHILDREN:
				return getChildren();
			case VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__NODE_KIND:
				return getNodeKind();
			case VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__CONSTRAINTS:
				return getConstraints();
			case VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__MIN:
				return getMin();
			case VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__MAX:
				return getMax();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__UNIQUE_ID:
				setUniqueId((String)newValue);
				return;
			case VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__NAME:
				setName((String)newValue);
				return;
			case VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Node>)newValue);
				return;
			case VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__NODE_KIND:
				setNodeKind((NodeKind)newValue);
				return;
			case VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends Constraint>)newValue);
				return;
			case VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__MIN:
				getMin().clear();
				getMin().addAll((Collection<? extends FeatureMinCardinalityChoice>)newValue);
				return;
			case VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__MAX:
				getMax().clear();
				getMax().addAll((Collection<? extends FeatureMaxCardinalityChoice>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__UNIQUE_ID:
				setUniqueId(UNIQUE_ID_EDEFAULT);
				return;
			case VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__CHILDREN:
				getChildren().clear();
				return;
			case VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__NODE_KIND:
				setNodeKind(NODE_KIND_EDEFAULT);
				return;
			case VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__CONSTRAINTS:
				getConstraints().clear();
				return;
			case VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__MIN:
				getMin().clear();
				return;
			case VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__MAX:
				getMax().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__UNIQUE_ID:
				return UNIQUE_ID_EDEFAULT == null ? uniqueId != null : !UNIQUE_ID_EDEFAULT.equals(uniqueId);
			case VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__CHILDREN:
				return children != null && !children.isEmpty();
			case VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__NODE_KIND:
				return nodeKind != NODE_KIND_EDEFAULT;
			case VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__MIN:
				return min != null && !min.isEmpty();
			case VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__MAX:
				return max != null && !max.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Node.class) {
			switch (derivedFeatureID) {
				case VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__UNIQUE_ID: return VariabilityFMPackage.NODE__UNIQUE_ID;
				case VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__NAME: return VariabilityFMPackage.NODE__NAME;
				case VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__CHILDREN: return VariabilityFMPackage.NODE__CHILDREN;
				case VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__NODE_KIND: return VariabilityFMPackage.NODE__NODE_KIND;
				case VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__CONSTRAINTS: return VariabilityFMPackage.NODE__CONSTRAINTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Node.class) {
			switch (baseFeatureID) {
				case VariabilityFMPackage.NODE__UNIQUE_ID: return VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__UNIQUE_ID;
				case VariabilityFMPackage.NODE__NAME: return VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__NAME;
				case VariabilityFMPackage.NODE__CHILDREN: return VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__CHILDREN;
				case VariabilityFMPackage.NODE__NODE_KIND: return VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__NODE_KIND;
				case VariabilityFMPackage.NODE__CONSTRAINTS: return VariabilityFMPackage.FEATURE_CARDINALITY_GROUP__CONSTRAINTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (uniqueId: ");
		result.append(uniqueId);
		result.append(", name: ");
		result.append(name);
		result.append(", nodeKind: ");
		result.append(nodeKind);
		result.append(')');
		return result.toString();
	}

} //FeatureCardinalityGroupImpl
