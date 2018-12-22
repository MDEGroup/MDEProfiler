/**
 */
package VariabilityFM.impl;

import VariabilityFM.AttOrReferenceExclusiveChoice;
import VariabilityFM.AttributeTypeGroup;
import VariabilityFM.ReferenceTypeGroup;
import VariabilityFM.VariabilityFMPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Att Or Reference Exclusive Choice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link VariabilityFM.impl.AttOrReferenceExclusiveChoiceImpl#getAttributeChoice <em>Attribute Choice</em>}</li>
 *   <li>{@link VariabilityFM.impl.AttOrReferenceExclusiveChoiceImpl#getReferenceChoice <em>Reference Choice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttOrReferenceExclusiveChoiceImpl extends NodeImpl implements AttOrReferenceExclusiveChoice {
	/**
	 * The cached value of the '{@link #getAttributeChoice() <em>Attribute Choice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeChoice()
	 * @generated
	 * @ordered
	 */
	protected AttributeTypeGroup attributeChoice;

	/**
	 * The cached value of the '{@link #getReferenceChoice() <em>Reference Choice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceChoice()
	 * @generated
	 * @ordered
	 */
	protected ReferenceTypeGroup referenceChoice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttOrReferenceExclusiveChoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariabilityFMPackage.Literals.ATT_OR_REFERENCE_EXCLUSIVE_CHOICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeTypeGroup getAttributeChoice() {
		return attributeChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributeChoice(AttributeTypeGroup newAttributeChoice, NotificationChain msgs) {
		AttributeTypeGroup oldAttributeChoice = attributeChoice;
		attributeChoice = newAttributeChoice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariabilityFMPackage.ATT_OR_REFERENCE_EXCLUSIVE_CHOICE__ATTRIBUTE_CHOICE, oldAttributeChoice, newAttributeChoice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeChoice(AttributeTypeGroup newAttributeChoice) {
		if (newAttributeChoice != attributeChoice) {
			NotificationChain msgs = null;
			if (attributeChoice != null)
				msgs = ((InternalEObject)attributeChoice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariabilityFMPackage.ATT_OR_REFERENCE_EXCLUSIVE_CHOICE__ATTRIBUTE_CHOICE, null, msgs);
			if (newAttributeChoice != null)
				msgs = ((InternalEObject)newAttributeChoice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariabilityFMPackage.ATT_OR_REFERENCE_EXCLUSIVE_CHOICE__ATTRIBUTE_CHOICE, null, msgs);
			msgs = basicSetAttributeChoice(newAttributeChoice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityFMPackage.ATT_OR_REFERENCE_EXCLUSIVE_CHOICE__ATTRIBUTE_CHOICE, newAttributeChoice, newAttributeChoice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceTypeGroup getReferenceChoice() {
		return referenceChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceChoice(ReferenceTypeGroup newReferenceChoice, NotificationChain msgs) {
		ReferenceTypeGroup oldReferenceChoice = referenceChoice;
		referenceChoice = newReferenceChoice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariabilityFMPackage.ATT_OR_REFERENCE_EXCLUSIVE_CHOICE__REFERENCE_CHOICE, oldReferenceChoice, newReferenceChoice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceChoice(ReferenceTypeGroup newReferenceChoice) {
		if (newReferenceChoice != referenceChoice) {
			NotificationChain msgs = null;
			if (referenceChoice != null)
				msgs = ((InternalEObject)referenceChoice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariabilityFMPackage.ATT_OR_REFERENCE_EXCLUSIVE_CHOICE__REFERENCE_CHOICE, null, msgs);
			if (newReferenceChoice != null)
				msgs = ((InternalEObject)newReferenceChoice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariabilityFMPackage.ATT_OR_REFERENCE_EXCLUSIVE_CHOICE__REFERENCE_CHOICE, null, msgs);
			msgs = basicSetReferenceChoice(newReferenceChoice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityFMPackage.ATT_OR_REFERENCE_EXCLUSIVE_CHOICE__REFERENCE_CHOICE, newReferenceChoice, newReferenceChoice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VariabilityFMPackage.ATT_OR_REFERENCE_EXCLUSIVE_CHOICE__ATTRIBUTE_CHOICE:
				return basicSetAttributeChoice(null, msgs);
			case VariabilityFMPackage.ATT_OR_REFERENCE_EXCLUSIVE_CHOICE__REFERENCE_CHOICE:
				return basicSetReferenceChoice(null, msgs);
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
			case VariabilityFMPackage.ATT_OR_REFERENCE_EXCLUSIVE_CHOICE__ATTRIBUTE_CHOICE:
				return getAttributeChoice();
			case VariabilityFMPackage.ATT_OR_REFERENCE_EXCLUSIVE_CHOICE__REFERENCE_CHOICE:
				return getReferenceChoice();
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
			case VariabilityFMPackage.ATT_OR_REFERENCE_EXCLUSIVE_CHOICE__ATTRIBUTE_CHOICE:
				setAttributeChoice((AttributeTypeGroup)newValue);
				return;
			case VariabilityFMPackage.ATT_OR_REFERENCE_EXCLUSIVE_CHOICE__REFERENCE_CHOICE:
				setReferenceChoice((ReferenceTypeGroup)newValue);
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
			case VariabilityFMPackage.ATT_OR_REFERENCE_EXCLUSIVE_CHOICE__ATTRIBUTE_CHOICE:
				setAttributeChoice((AttributeTypeGroup)null);
				return;
			case VariabilityFMPackage.ATT_OR_REFERENCE_EXCLUSIVE_CHOICE__REFERENCE_CHOICE:
				setReferenceChoice((ReferenceTypeGroup)null);
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
			case VariabilityFMPackage.ATT_OR_REFERENCE_EXCLUSIVE_CHOICE__ATTRIBUTE_CHOICE:
				return attributeChoice != null;
			case VariabilityFMPackage.ATT_OR_REFERENCE_EXCLUSIVE_CHOICE__REFERENCE_CHOICE:
				return referenceChoice != null;
		}
		return super.eIsSet(featureID);
	}

} //AttOrReferenceExclusiveChoiceImpl
