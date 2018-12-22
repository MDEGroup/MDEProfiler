/**
 */
package MM_uncertainty.impl;

import MM_uncertainty.MM_uncertaintyPackage;
import MM_uncertainty.Many;
import MM_uncertainty.UBoolean;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Many</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MM_uncertainty.impl.ManyImpl#getIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link MM_uncertainty.impl.ManyImpl#getIsDuplicated <em>Is Duplicated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManyImpl extends CardinalityImpl implements Many {
	/**
	 * The default value of the '{@link #getIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final UBoolean IS_ORDERED_EDEFAULT = UBoolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected UBoolean isOrdered = IS_ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsDuplicated() <em>Is Duplicated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDuplicated()
	 * @generated
	 * @ordered
	 */
	protected static final UBoolean IS_DUPLICATED_EDEFAULT = UBoolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsDuplicated() <em>Is Duplicated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDuplicated()
	 * @generated
	 * @ordered
	 */
	protected UBoolean isDuplicated = IS_DUPLICATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MM_uncertaintyPackage.Literals.MANY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UBoolean getIsOrdered() {
		return isOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrdered(UBoolean newIsOrdered) {
		UBoolean oldIsOrdered = isOrdered;
		isOrdered = newIsOrdered == null ? IS_ORDERED_EDEFAULT : newIsOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MM_uncertaintyPackage.MANY__IS_ORDERED, oldIsOrdered, isOrdered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UBoolean getIsDuplicated() {
		return isDuplicated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDuplicated(UBoolean newIsDuplicated) {
		UBoolean oldIsDuplicated = isDuplicated;
		isDuplicated = newIsDuplicated == null ? IS_DUPLICATED_EDEFAULT : newIsDuplicated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MM_uncertaintyPackage.MANY__IS_DUPLICATED, oldIsDuplicated, isDuplicated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MM_uncertaintyPackage.MANY__IS_ORDERED:
				return getIsOrdered();
			case MM_uncertaintyPackage.MANY__IS_DUPLICATED:
				return getIsDuplicated();
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
			case MM_uncertaintyPackage.MANY__IS_ORDERED:
				setIsOrdered((UBoolean)newValue);
				return;
			case MM_uncertaintyPackage.MANY__IS_DUPLICATED:
				setIsDuplicated((UBoolean)newValue);
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
			case MM_uncertaintyPackage.MANY__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case MM_uncertaintyPackage.MANY__IS_DUPLICATED:
				setIsDuplicated(IS_DUPLICATED_EDEFAULT);
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
			case MM_uncertaintyPackage.MANY__IS_ORDERED:
				return isOrdered != IS_ORDERED_EDEFAULT;
			case MM_uncertaintyPackage.MANY__IS_DUPLICATED:
				return isDuplicated != IS_DUPLICATED_EDEFAULT;
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
		result.append(" (isOrdered: ");
		result.append(isOrdered);
		result.append(", isDuplicated: ");
		result.append(isDuplicated);
		result.append(')');
		return result.toString();
	}

} //ManyImpl
