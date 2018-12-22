/**
 */
package VariabilityFM.impl;

import MM_uncertainty.Feature;

import VariabilityFM.Constraint;
import VariabilityFM.FeatureCardinalityGroup;
import VariabilityFM.FeatureKindGroup;
import VariabilityFM.Node;
import VariabilityFM.NodeKind;
import VariabilityFM.VariabilityFMPackage;
import VariabilityFM.VariableFeature;

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
 * An implementation of the model object '<em><b>Variable Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link VariabilityFM.impl.VariableFeatureImpl#getUniqueId <em>Unique Id</em>}</li>
 *   <li>{@link VariabilityFM.impl.VariableFeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link VariabilityFM.impl.VariableFeatureImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link VariabilityFM.impl.VariableFeatureImpl#getNodeKind <em>Node Kind</em>}</li>
 *   <li>{@link VariabilityFM.impl.VariableFeatureImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link VariabilityFM.impl.VariableFeatureImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link VariabilityFM.impl.VariableFeatureImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link VariabilityFM.impl.VariableFeatureImpl#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableFeatureImpl extends CompulsoryImpl implements VariableFeature {
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
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature feature;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected FeatureKindGroup kind;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected FeatureCardinalityGroup cardinality;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariabilityFMPackage.Literals.VARIABLE_FEATURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityFMPackage.VARIABLE_FEATURE__UNIQUE_ID, oldUniqueId, uniqueId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityFMPackage.VARIABLE_FEATURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<Node>(Node.class, this, VariabilityFMPackage.VARIABLE_FEATURE__CHILDREN);
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
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityFMPackage.VARIABLE_FEATURE__NODE_KIND, oldNodeKind, nodeKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, VariabilityFMPackage.VARIABLE_FEATURE__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getFeature() {
		if (feature != null && feature.eIsProxy()) {
			InternalEObject oldFeature = (InternalEObject)feature;
			feature = (Feature)eResolveProxy(oldFeature);
			if (feature != oldFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VariabilityFMPackage.VARIABLE_FEATURE__FEATURE, oldFeature, feature));
			}
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(Feature newFeature) {
		Feature oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityFMPackage.VARIABLE_FEATURE__FEATURE, oldFeature, feature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureKindGroup getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKind(FeatureKindGroup newKind, NotificationChain msgs) {
		FeatureKindGroup oldKind = kind;
		kind = newKind;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariabilityFMPackage.VARIABLE_FEATURE__KIND, oldKind, newKind);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(FeatureKindGroup newKind) {
		if (newKind != kind) {
			NotificationChain msgs = null;
			if (kind != null)
				msgs = ((InternalEObject)kind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariabilityFMPackage.VARIABLE_FEATURE__KIND, null, msgs);
			if (newKind != null)
				msgs = ((InternalEObject)newKind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariabilityFMPackage.VARIABLE_FEATURE__KIND, null, msgs);
			msgs = basicSetKind(newKind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityFMPackage.VARIABLE_FEATURE__KIND, newKind, newKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureCardinalityGroup getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCardinality(FeatureCardinalityGroup newCardinality, NotificationChain msgs) {
		FeatureCardinalityGroup oldCardinality = cardinality;
		cardinality = newCardinality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariabilityFMPackage.VARIABLE_FEATURE__CARDINALITY, oldCardinality, newCardinality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(FeatureCardinalityGroup newCardinality) {
		if (newCardinality != cardinality) {
			NotificationChain msgs = null;
			if (cardinality != null)
				msgs = ((InternalEObject)cardinality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariabilityFMPackage.VARIABLE_FEATURE__CARDINALITY, null, msgs);
			if (newCardinality != null)
				msgs = ((InternalEObject)newCardinality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariabilityFMPackage.VARIABLE_FEATURE__CARDINALITY, null, msgs);
			msgs = basicSetCardinality(newCardinality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityFMPackage.VARIABLE_FEATURE__CARDINALITY, newCardinality, newCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VariabilityFMPackage.VARIABLE_FEATURE__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case VariabilityFMPackage.VARIABLE_FEATURE__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
			case VariabilityFMPackage.VARIABLE_FEATURE__KIND:
				return basicSetKind(null, msgs);
			case VariabilityFMPackage.VARIABLE_FEATURE__CARDINALITY:
				return basicSetCardinality(null, msgs);
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
			case VariabilityFMPackage.VARIABLE_FEATURE__UNIQUE_ID:
				return getUniqueId();
			case VariabilityFMPackage.VARIABLE_FEATURE__NAME:
				return getName();
			case VariabilityFMPackage.VARIABLE_FEATURE__CHILDREN:
				return getChildren();
			case VariabilityFMPackage.VARIABLE_FEATURE__NODE_KIND:
				return getNodeKind();
			case VariabilityFMPackage.VARIABLE_FEATURE__CONSTRAINTS:
				return getConstraints();
			case VariabilityFMPackage.VARIABLE_FEATURE__FEATURE:
				if (resolve) return getFeature();
				return basicGetFeature();
			case VariabilityFMPackage.VARIABLE_FEATURE__KIND:
				return getKind();
			case VariabilityFMPackage.VARIABLE_FEATURE__CARDINALITY:
				return getCardinality();
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
			case VariabilityFMPackage.VARIABLE_FEATURE__UNIQUE_ID:
				setUniqueId((String)newValue);
				return;
			case VariabilityFMPackage.VARIABLE_FEATURE__NAME:
				setName((String)newValue);
				return;
			case VariabilityFMPackage.VARIABLE_FEATURE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Node>)newValue);
				return;
			case VariabilityFMPackage.VARIABLE_FEATURE__NODE_KIND:
				setNodeKind((NodeKind)newValue);
				return;
			case VariabilityFMPackage.VARIABLE_FEATURE__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends Constraint>)newValue);
				return;
			case VariabilityFMPackage.VARIABLE_FEATURE__FEATURE:
				setFeature((Feature)newValue);
				return;
			case VariabilityFMPackage.VARIABLE_FEATURE__KIND:
				setKind((FeatureKindGroup)newValue);
				return;
			case VariabilityFMPackage.VARIABLE_FEATURE__CARDINALITY:
				setCardinality((FeatureCardinalityGroup)newValue);
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
			case VariabilityFMPackage.VARIABLE_FEATURE__UNIQUE_ID:
				setUniqueId(UNIQUE_ID_EDEFAULT);
				return;
			case VariabilityFMPackage.VARIABLE_FEATURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VariabilityFMPackage.VARIABLE_FEATURE__CHILDREN:
				getChildren().clear();
				return;
			case VariabilityFMPackage.VARIABLE_FEATURE__NODE_KIND:
				setNodeKind(NODE_KIND_EDEFAULT);
				return;
			case VariabilityFMPackage.VARIABLE_FEATURE__CONSTRAINTS:
				getConstraints().clear();
				return;
			case VariabilityFMPackage.VARIABLE_FEATURE__FEATURE:
				setFeature((Feature)null);
				return;
			case VariabilityFMPackage.VARIABLE_FEATURE__KIND:
				setKind((FeatureKindGroup)null);
				return;
			case VariabilityFMPackage.VARIABLE_FEATURE__CARDINALITY:
				setCardinality((FeatureCardinalityGroup)null);
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
			case VariabilityFMPackage.VARIABLE_FEATURE__UNIQUE_ID:
				return UNIQUE_ID_EDEFAULT == null ? uniqueId != null : !UNIQUE_ID_EDEFAULT.equals(uniqueId);
			case VariabilityFMPackage.VARIABLE_FEATURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VariabilityFMPackage.VARIABLE_FEATURE__CHILDREN:
				return children != null && !children.isEmpty();
			case VariabilityFMPackage.VARIABLE_FEATURE__NODE_KIND:
				return nodeKind != NODE_KIND_EDEFAULT;
			case VariabilityFMPackage.VARIABLE_FEATURE__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case VariabilityFMPackage.VARIABLE_FEATURE__FEATURE:
				return feature != null;
			case VariabilityFMPackage.VARIABLE_FEATURE__KIND:
				return kind != null;
			case VariabilityFMPackage.VARIABLE_FEATURE__CARDINALITY:
				return cardinality != null;
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
				case VariabilityFMPackage.VARIABLE_FEATURE__UNIQUE_ID: return VariabilityFMPackage.NODE__UNIQUE_ID;
				case VariabilityFMPackage.VARIABLE_FEATURE__NAME: return VariabilityFMPackage.NODE__NAME;
				case VariabilityFMPackage.VARIABLE_FEATURE__CHILDREN: return VariabilityFMPackage.NODE__CHILDREN;
				case VariabilityFMPackage.VARIABLE_FEATURE__NODE_KIND: return VariabilityFMPackage.NODE__NODE_KIND;
				case VariabilityFMPackage.VARIABLE_FEATURE__CONSTRAINTS: return VariabilityFMPackage.NODE__CONSTRAINTS;
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
				case VariabilityFMPackage.NODE__UNIQUE_ID: return VariabilityFMPackage.VARIABLE_FEATURE__UNIQUE_ID;
				case VariabilityFMPackage.NODE__NAME: return VariabilityFMPackage.VARIABLE_FEATURE__NAME;
				case VariabilityFMPackage.NODE__CHILDREN: return VariabilityFMPackage.VARIABLE_FEATURE__CHILDREN;
				case VariabilityFMPackage.NODE__NODE_KIND: return VariabilityFMPackage.VARIABLE_FEATURE__NODE_KIND;
				case VariabilityFMPackage.NODE__CONSTRAINTS: return VariabilityFMPackage.VARIABLE_FEATURE__CONSTRAINTS;
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

} //VariableFeatureImpl
