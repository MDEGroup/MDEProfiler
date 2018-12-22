/**
 */
package VariabilityFM.impl;

import VariabilityFM.AttOrReferenceExclusiveChoice;
import VariabilityFM.FeatureKindGroup;
import VariabilityFM.VariabilityFMPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Kind Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link VariabilityFM.impl.FeatureKindGroupImpl#getAttOrRef <em>Att Or Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureKindGroupImpl extends NodeImpl implements FeatureKindGroup {
	/**
	 * The cached value of the '{@link #getAttOrRef() <em>Att Or Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttOrRef()
	 * @generated
	 * @ordered
	 */
	protected AttOrReferenceExclusiveChoice attOrRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureKindGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariabilityFMPackage.Literals.FEATURE_KIND_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttOrReferenceExclusiveChoice getAttOrRef() {
		return attOrRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttOrRef(AttOrReferenceExclusiveChoice newAttOrRef, NotificationChain msgs) {
		AttOrReferenceExclusiveChoice oldAttOrRef = attOrRef;
		attOrRef = newAttOrRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariabilityFMPackage.FEATURE_KIND_GROUP__ATT_OR_REF, oldAttOrRef, newAttOrRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttOrRef(AttOrReferenceExclusiveChoice newAttOrRef) {
		if (newAttOrRef != attOrRef) {
			NotificationChain msgs = null;
			if (attOrRef != null)
				msgs = ((InternalEObject)attOrRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariabilityFMPackage.FEATURE_KIND_GROUP__ATT_OR_REF, null, msgs);
			if (newAttOrRef != null)
				msgs = ((InternalEObject)newAttOrRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariabilityFMPackage.FEATURE_KIND_GROUP__ATT_OR_REF, null, msgs);
			msgs = basicSetAttOrRef(newAttOrRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityFMPackage.FEATURE_KIND_GROUP__ATT_OR_REF, newAttOrRef, newAttOrRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VariabilityFMPackage.FEATURE_KIND_GROUP__ATT_OR_REF:
				return basicSetAttOrRef(null, msgs);
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
			case VariabilityFMPackage.FEATURE_KIND_GROUP__ATT_OR_REF:
				return getAttOrRef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VariabilityFMPackage.FEATURE_KIND_GROUP__ATT_OR_REF:
				setAttOrRef((AttOrReferenceExclusiveChoice)newValue);
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
			case VariabilityFMPackage.FEATURE_KIND_GROUP__ATT_OR_REF:
				setAttOrRef((AttOrReferenceExclusiveChoice)null);
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
			case VariabilityFMPackage.FEATURE_KIND_GROUP__ATT_OR_REF:
				return attOrRef != null;
		}
		return super.eIsSet(featureID);
	}

} //FeatureKindGroupImpl
