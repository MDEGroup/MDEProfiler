/**
 */
package VariabilityFM.impl;

import VariabilityFM.Constraint;
import VariabilityFM.Node;
import VariabilityFM.NodeKind;
import VariabilityFM.ReferenceTypeChoice;
import VariabilityFM.VariabilityFMPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Type Choice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link VariabilityFM.impl.ReferenceTypeChoiceImpl#getUniqueId <em>Unique Id</em>}</li>
 *   <li>{@link VariabilityFM.impl.ReferenceTypeChoiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link VariabilityFM.impl.ReferenceTypeChoiceImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link VariabilityFM.impl.ReferenceTypeChoiceImpl#getNodeKind <em>Node Kind</em>}</li>
 *   <li>{@link VariabilityFM.impl.ReferenceTypeChoiceImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link VariabilityFM.impl.ReferenceTypeChoiceImpl#getKlass <em>Klass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceTypeChoiceImpl extends SingleChoiceImpl implements ReferenceTypeChoice {
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
	 * The cached value of the '{@link #getKlass() <em>Klass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKlass()
	 * @generated
	 * @ordered
	 */
	protected EObject klass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceTypeChoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariabilityFMPackage.Literals.REFERENCE_TYPE_CHOICE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityFMPackage.REFERENCE_TYPE_CHOICE__UNIQUE_ID, oldUniqueId, uniqueId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityFMPackage.REFERENCE_TYPE_CHOICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<Node>(Node.class, this, VariabilityFMPackage.REFERENCE_TYPE_CHOICE__CHILDREN);
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
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityFMPackage.REFERENCE_TYPE_CHOICE__NODE_KIND, oldNodeKind, nodeKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, VariabilityFMPackage.REFERENCE_TYPE_CHOICE__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getKlass() {
		if (klass != null && klass.eIsProxy()) {
			InternalEObject oldKlass = (InternalEObject)klass;
			klass = eResolveProxy(oldKlass);
			if (klass != oldKlass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VariabilityFMPackage.REFERENCE_TYPE_CHOICE__KLASS, oldKlass, klass));
			}
		}
		return klass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetKlass() {
		return klass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKlass(EObject newKlass) {
		EObject oldKlass = klass;
		klass = newKlass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityFMPackage.REFERENCE_TYPE_CHOICE__KLASS, oldKlass, klass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VariabilityFMPackage.REFERENCE_TYPE_CHOICE__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case VariabilityFMPackage.REFERENCE_TYPE_CHOICE__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
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
			case VariabilityFMPackage.REFERENCE_TYPE_CHOICE__UNIQUE_ID:
				return getUniqueId();
			case VariabilityFMPackage.REFERENCE_TYPE_CHOICE__NAME:
				return getName();
			case VariabilityFMPackage.REFERENCE_TYPE_CHOICE__CHILDREN:
				return getChildren();
			case VariabilityFMPackage.REFERENCE_TYPE_CHOICE__NODE_KIND:
				return getNodeKind();
			case VariabilityFMPackage.REFERENCE_TYPE_CHOICE__CONSTRAINTS:
				return getConstraints();
			case VariabilityFMPackage.REFERENCE_TYPE_CHOICE__KLASS:
				if (resolve) return getKlass();
				return basicGetKlass();
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
			case VariabilityFMPackage.REFERENCE_TYPE_CHOICE__UNIQUE_ID:
				setUniqueId((String)newValue);
				return;
			case VariabilityFMPackage.REFERENCE_TYPE_CHOICE__NAME:
				setName((String)newValue);
				return;
			case VariabilityFMPackage.REFERENCE_TYPE_CHOICE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Node>)newValue);
				return;
			case VariabilityFMPackage.REFERENCE_TYPE_CHOICE__NODE_KIND:
				setNodeKind((NodeKind)newValue);
				return;
			case VariabilityFMPackage.REFERENCE_TYPE_CHOICE__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends Constraint>)newValue);
				return;
			case VariabilityFMPackage.REFERENCE_TYPE_CHOICE__KLASS:
				setKlass((EObject)newValue);
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
			case VariabilityFMPackage.REFERENCE_TYPE_CHOICE__UNIQUE_ID:
				setUniqueId(UNIQUE_ID_EDEFAULT);
				return;
			case VariabilityFMPackage.REFERENCE_TYPE_CHOICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VariabilityFMPackage.REFERENCE_TYPE_CHOICE__CHILDREN:
				getChildren().clear();
				return;
			case VariabilityFMPackage.REFERENCE_TYPE_CHOICE__NODE_KIND:
				setNodeKind(NODE_KIND_EDEFAULT);
				return;
			case VariabilityFMPackage.REFERENCE_TYPE_CHOICE__CONSTRAINTS:
				getConstraints().clear();
				return;
			case VariabilityFMPackage.REFERENCE_TYPE_CHOICE__KLASS:
				setKlass((EObject)null);
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
			case VariabilityFMPackage.REFERENCE_TYPE_CHOICE__UNIQUE_ID:
				return UNIQUE_ID_EDEFAULT == null ? uniqueId != null : !UNIQUE_ID_EDEFAULT.equals(uniqueId);
			case VariabilityFMPackage.REFERENCE_TYPE_CHOICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VariabilityFMPackage.REFERENCE_TYPE_CHOICE__CHILDREN:
				return children != null && !children.isEmpty();
			case VariabilityFMPackage.REFERENCE_TYPE_CHOICE__NODE_KIND:
				return nodeKind != NODE_KIND_EDEFAULT;
			case VariabilityFMPackage.REFERENCE_TYPE_CHOICE__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case VariabilityFMPackage.REFERENCE_TYPE_CHOICE__KLASS:
				return klass != null;
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
				case VariabilityFMPackage.REFERENCE_TYPE_CHOICE__UNIQUE_ID: return VariabilityFMPackage.NODE__UNIQUE_ID;
				case VariabilityFMPackage.REFERENCE_TYPE_CHOICE__NAME: return VariabilityFMPackage.NODE__NAME;
				case VariabilityFMPackage.REFERENCE_TYPE_CHOICE__CHILDREN: return VariabilityFMPackage.NODE__CHILDREN;
				case VariabilityFMPackage.REFERENCE_TYPE_CHOICE__NODE_KIND: return VariabilityFMPackage.NODE__NODE_KIND;
				case VariabilityFMPackage.REFERENCE_TYPE_CHOICE__CONSTRAINTS: return VariabilityFMPackage.NODE__CONSTRAINTS;
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
				case VariabilityFMPackage.NODE__UNIQUE_ID: return VariabilityFMPackage.REFERENCE_TYPE_CHOICE__UNIQUE_ID;
				case VariabilityFMPackage.NODE__NAME: return VariabilityFMPackage.REFERENCE_TYPE_CHOICE__NAME;
				case VariabilityFMPackage.NODE__CHILDREN: return VariabilityFMPackage.REFERENCE_TYPE_CHOICE__CHILDREN;
				case VariabilityFMPackage.NODE__NODE_KIND: return VariabilityFMPackage.REFERENCE_TYPE_CHOICE__NODE_KIND;
				case VariabilityFMPackage.NODE__CONSTRAINTS: return VariabilityFMPackage.REFERENCE_TYPE_CHOICE__CONSTRAINTS;
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

} //ReferenceTypeChoiceImpl
