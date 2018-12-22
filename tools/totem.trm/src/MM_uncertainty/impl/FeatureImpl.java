/**
 */
package MM_uncertainty.impl;

import MM_uncertainty.Cardinality;
import MM_uncertainty.Feature;
import MM_uncertainty.FeatureType;
import MM_uncertainty.MM_uncertaintyPackage;

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
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MM_uncertainty.impl.FeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link MM_uncertainty.impl.FeatureImpl#getMin <em>Min</em>}</li>
 *   <li>{@link MM_uncertainty.impl.FeatureImpl#getMax <em>Max</em>}</li>
 *   <li>{@link MM_uncertainty.impl.FeatureImpl#getHasType <em>Has Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureImpl extends ConstrainedElementImpl implements Feature {
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
	 * The cached value of the '{@link #getMin() <em>Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected Cardinality min;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected Cardinality max;

	/**
	 * The cached value of the '{@link #getHasType() <em>Has Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasType()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureType> hasType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MM_uncertaintyPackage.Literals.FEATURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MM_uncertaintyPackage.FEATURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMin(Cardinality newMin, NotificationChain msgs) {
		Cardinality oldMin = min;
		min = newMin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MM_uncertaintyPackage.FEATURE__MIN, oldMin, newMin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(Cardinality newMin) {
		if (newMin != min) {
			NotificationChain msgs = null;
			if (min != null)
				msgs = ((InternalEObject)min).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MM_uncertaintyPackage.FEATURE__MIN, null, msgs);
			if (newMin != null)
				msgs = ((InternalEObject)newMin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MM_uncertaintyPackage.FEATURE__MIN, null, msgs);
			msgs = basicSetMin(newMin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MM_uncertaintyPackage.FEATURE__MIN, newMin, newMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMax(Cardinality newMax, NotificationChain msgs) {
		Cardinality oldMax = max;
		max = newMax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MM_uncertaintyPackage.FEATURE__MAX, oldMax, newMax);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(Cardinality newMax) {
		if (newMax != max) {
			NotificationChain msgs = null;
			if (max != null)
				msgs = ((InternalEObject)max).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MM_uncertaintyPackage.FEATURE__MAX, null, msgs);
			if (newMax != null)
				msgs = ((InternalEObject)newMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MM_uncertaintyPackage.FEATURE__MAX, null, msgs);
			msgs = basicSetMax(newMax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MM_uncertaintyPackage.FEATURE__MAX, newMax, newMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureType> getHasType() {
		if (hasType == null) {
			hasType = new EObjectContainmentEList<FeatureType>(FeatureType.class, this, MM_uncertaintyPackage.FEATURE__HAS_TYPE);
		}
		return hasType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MM_uncertaintyPackage.FEATURE__MIN:
				return basicSetMin(null, msgs);
			case MM_uncertaintyPackage.FEATURE__MAX:
				return basicSetMax(null, msgs);
			case MM_uncertaintyPackage.FEATURE__HAS_TYPE:
				return ((InternalEList<?>)getHasType()).basicRemove(otherEnd, msgs);
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
			case MM_uncertaintyPackage.FEATURE__NAME:
				return getName();
			case MM_uncertaintyPackage.FEATURE__MIN:
				return getMin();
			case MM_uncertaintyPackage.FEATURE__MAX:
				return getMax();
			case MM_uncertaintyPackage.FEATURE__HAS_TYPE:
				return getHasType();
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
			case MM_uncertaintyPackage.FEATURE__NAME:
				setName((String)newValue);
				return;
			case MM_uncertaintyPackage.FEATURE__MIN:
				setMin((Cardinality)newValue);
				return;
			case MM_uncertaintyPackage.FEATURE__MAX:
				setMax((Cardinality)newValue);
				return;
			case MM_uncertaintyPackage.FEATURE__HAS_TYPE:
				getHasType().clear();
				getHasType().addAll((Collection<? extends FeatureType>)newValue);
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
			case MM_uncertaintyPackage.FEATURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MM_uncertaintyPackage.FEATURE__MIN:
				setMin((Cardinality)null);
				return;
			case MM_uncertaintyPackage.FEATURE__MAX:
				setMax((Cardinality)null);
				return;
			case MM_uncertaintyPackage.FEATURE__HAS_TYPE:
				getHasType().clear();
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
			case MM_uncertaintyPackage.FEATURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MM_uncertaintyPackage.FEATURE__MIN:
				return min != null;
			case MM_uncertaintyPackage.FEATURE__MAX:
				return max != null;
			case MM_uncertaintyPackage.FEATURE__HAS_TYPE:
				return hasType != null && !hasType.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FeatureImpl
