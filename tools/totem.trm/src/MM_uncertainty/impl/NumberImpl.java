/**
 */
package MM_uncertainty.impl;

import MM_uncertainty.MM_uncertaintyPackage;

import java.lang.Boolean;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MM_uncertainty.impl.NumberImpl#getValue <em>Value</em>}</li>
 *   <li>{@link MM_uncertainty.impl.NumberImpl#isAllowLess <em>Allow Less</em>}</li>
 *   <li>{@link MM_uncertainty.impl.NumberImpl#isAllowMore <em>Allow More</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NumberImpl extends CardinalityImpl implements MM_uncertainty.Number {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowLess() <em>Allow Less</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowLess()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_LESS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowLess() <em>Allow Less</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowLess()
	 * @generated
	 * @ordered
	 */
	protected boolean allowLess = ALLOW_LESS_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowMore() <em>Allow More</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowMore()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_MORE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowMore() <em>Allow More</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowMore()
	 * @generated
	 * @ordered
	 */
	protected boolean allowMore = ALLOW_MORE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MM_uncertaintyPackage.Literals.NUMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MM_uncertaintyPackage.NUMBER__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowLess() {
		return allowLess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowLess(boolean newAllowLess) {
		boolean oldAllowLess = allowLess;
		allowLess = newAllowLess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MM_uncertaintyPackage.NUMBER__ALLOW_LESS, oldAllowLess, allowLess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowMore() {
		return allowMore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowMore(boolean newAllowMore) {
		boolean oldAllowMore = allowMore;
		allowMore = newAllowMore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MM_uncertaintyPackage.NUMBER__ALLOW_MORE, oldAllowMore, allowMore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MM_uncertaintyPackage.NUMBER__VALUE:
				return getValue();
			case MM_uncertaintyPackage.NUMBER__ALLOW_LESS:
				return isAllowLess();
			case MM_uncertaintyPackage.NUMBER__ALLOW_MORE:
				return isAllowMore();
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
			case MM_uncertaintyPackage.NUMBER__VALUE:
				setValue((Integer)newValue);
				return;
			case MM_uncertaintyPackage.NUMBER__ALLOW_LESS:
				setAllowLess((Boolean)newValue);
				return;
			case MM_uncertaintyPackage.NUMBER__ALLOW_MORE:
				setAllowMore((Boolean)newValue);
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
			case MM_uncertaintyPackage.NUMBER__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case MM_uncertaintyPackage.NUMBER__ALLOW_LESS:
				setAllowLess(ALLOW_LESS_EDEFAULT);
				return;
			case MM_uncertaintyPackage.NUMBER__ALLOW_MORE:
				setAllowMore(ALLOW_MORE_EDEFAULT);
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
			case MM_uncertaintyPackage.NUMBER__VALUE:
				return value != VALUE_EDEFAULT;
			case MM_uncertaintyPackage.NUMBER__ALLOW_LESS:
				return allowLess != ALLOW_LESS_EDEFAULT;
			case MM_uncertaintyPackage.NUMBER__ALLOW_MORE:
				return allowMore != ALLOW_MORE_EDEFAULT;
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
		result.append(" (value: ");
		result.append(value);
		result.append(", allowLess: ");
		result.append(allowLess);
		result.append(", allowMore: ");
		result.append(allowMore);
		result.append(')');
		return result.toString();
	}

} //NumberImpl
