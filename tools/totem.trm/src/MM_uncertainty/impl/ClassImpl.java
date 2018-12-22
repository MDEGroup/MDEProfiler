/**
 */
package MM_uncertainty.impl;

import MM_uncertainty.Feature;
import MM_uncertainty.MM_uncertaintyPackage;
import MM_uncertainty.UBoolean;

import java.lang.Boolean;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MM_uncertainty.impl.ClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link MM_uncertainty.impl.ClassImpl#getAncs <em>Ancs</em>}</li>
 *   <li>{@link MM_uncertainty.impl.ClassImpl#getAntiancs <em>Antiancs</em>}</li>
 *   <li>{@link MM_uncertainty.impl.ClassImpl#getFeats <em>Feats</em>}</li>
 *   <li>{@link MM_uncertainty.impl.ClassImpl#isMandatoryAllowed <em>Mandatory Allowed</em>}</li>
 *   <li>{@link MM_uncertainty.impl.ClassImpl#getIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link MM_uncertainty.impl.ClassImpl#isSubsAllowed <em>Subs Allowed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassImpl extends ConstrainedElementImpl implements MM_uncertainty.Class {
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
	 * The cached value of the '{@link #getAncs() <em>Ancs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAncs()
	 * @generated
	 * @ordered
	 */
	protected EList<MM_uncertainty.Class> ancs;

	/**
	 * The cached value of the '{@link #getAntiancs() <em>Antiancs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntiancs()
	 * @generated
	 * @ordered
	 */
	protected EList<MM_uncertainty.Class> antiancs;

	/**
	 * The cached value of the '{@link #getFeats() <em>Feats</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeats()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> feats;

	/**
	 * The default value of the '{@link #isMandatoryAllowed() <em>Mandatory Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatoryAllowed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANDATORY_ALLOWED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMandatoryAllowed() <em>Mandatory Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatoryAllowed()
	 * @generated
	 * @ordered
	 */
	protected boolean mandatoryAllowed = MANDATORY_ALLOWED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final UBoolean IS_ABSTRACT_EDEFAULT = UBoolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected UBoolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #isSubsAllowed() <em>Subs Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSubsAllowed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUBS_ALLOWED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSubsAllowed() <em>Subs Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSubsAllowed()
	 * @generated
	 * @ordered
	 */
	protected boolean subsAllowed = SUBS_ALLOWED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MM_uncertaintyPackage.Literals.CLASS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MM_uncertaintyPackage.CLASS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MM_uncertainty.Class> getAncs() {
		if (ancs == null) {
			ancs = new EObjectResolvingEList<MM_uncertainty.Class>(MM_uncertainty.Class.class, this, MM_uncertaintyPackage.CLASS__ANCS);
		}
		return ancs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MM_uncertainty.Class> getAntiancs() {
		if (antiancs == null) {
			antiancs = new EObjectResolvingEList<MM_uncertainty.Class>(MM_uncertainty.Class.class, this, MM_uncertaintyPackage.CLASS__ANTIANCS);
		}
		return antiancs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeats() {
		if (feats == null) {
			feats = new EObjectContainmentEList<Feature>(Feature.class, this, MM_uncertaintyPackage.CLASS__FEATS);
		}
		return feats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMandatoryAllowed() {
		return mandatoryAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMandatoryAllowed(boolean newMandatoryAllowed) {
		boolean oldMandatoryAllowed = mandatoryAllowed;
		mandatoryAllowed = newMandatoryAllowed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MM_uncertaintyPackage.CLASS__MANDATORY_ALLOWED, oldMandatoryAllowed, mandatoryAllowed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UBoolean getIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(UBoolean newIsAbstract) {
		UBoolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract == null ? IS_ABSTRACT_EDEFAULT : newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MM_uncertaintyPackage.CLASS__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSubsAllowed() {
		return subsAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubsAllowed(boolean newSubsAllowed) {
		boolean oldSubsAllowed = subsAllowed;
		subsAllowed = newSubsAllowed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MM_uncertaintyPackage.CLASS__SUBS_ALLOWED, oldSubsAllowed, subsAllowed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MM_uncertaintyPackage.CLASS__FEATS:
				return ((InternalEList<?>)getFeats()).basicRemove(otherEnd, msgs);
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
			case MM_uncertaintyPackage.CLASS__NAME:
				return getName();
			case MM_uncertaintyPackage.CLASS__ANCS:
				return getAncs();
			case MM_uncertaintyPackage.CLASS__ANTIANCS:
				return getAntiancs();
			case MM_uncertaintyPackage.CLASS__FEATS:
				return getFeats();
			case MM_uncertaintyPackage.CLASS__MANDATORY_ALLOWED:
				return isMandatoryAllowed();
			case MM_uncertaintyPackage.CLASS__IS_ABSTRACT:
				return getIsAbstract();
			case MM_uncertaintyPackage.CLASS__SUBS_ALLOWED:
				return isSubsAllowed();
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
			case MM_uncertaintyPackage.CLASS__NAME:
				setName((String)newValue);
				return;
			case MM_uncertaintyPackage.CLASS__ANCS:
				getAncs().clear();
				getAncs().addAll((Collection<? extends MM_uncertainty.Class>)newValue);
				return;
			case MM_uncertaintyPackage.CLASS__ANTIANCS:
				getAntiancs().clear();
				getAntiancs().addAll((Collection<? extends MM_uncertainty.Class>)newValue);
				return;
			case MM_uncertaintyPackage.CLASS__FEATS:
				getFeats().clear();
				getFeats().addAll((Collection<? extends Feature>)newValue);
				return;
			case MM_uncertaintyPackage.CLASS__MANDATORY_ALLOWED:
				setMandatoryAllowed((Boolean)newValue);
				return;
			case MM_uncertaintyPackage.CLASS__IS_ABSTRACT:
				setIsAbstract((UBoolean)newValue);
				return;
			case MM_uncertaintyPackage.CLASS__SUBS_ALLOWED:
				setSubsAllowed((Boolean)newValue);
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
			case MM_uncertaintyPackage.CLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MM_uncertaintyPackage.CLASS__ANCS:
				getAncs().clear();
				return;
			case MM_uncertaintyPackage.CLASS__ANTIANCS:
				getAntiancs().clear();
				return;
			case MM_uncertaintyPackage.CLASS__FEATS:
				getFeats().clear();
				return;
			case MM_uncertaintyPackage.CLASS__MANDATORY_ALLOWED:
				setMandatoryAllowed(MANDATORY_ALLOWED_EDEFAULT);
				return;
			case MM_uncertaintyPackage.CLASS__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case MM_uncertaintyPackage.CLASS__SUBS_ALLOWED:
				setSubsAllowed(SUBS_ALLOWED_EDEFAULT);
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
			case MM_uncertaintyPackage.CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MM_uncertaintyPackage.CLASS__ANCS:
				return ancs != null && !ancs.isEmpty();
			case MM_uncertaintyPackage.CLASS__ANTIANCS:
				return antiancs != null && !antiancs.isEmpty();
			case MM_uncertaintyPackage.CLASS__FEATS:
				return feats != null && !feats.isEmpty();
			case MM_uncertaintyPackage.CLASS__MANDATORY_ALLOWED:
				return mandatoryAllowed != MANDATORY_ALLOWED_EDEFAULT;
			case MM_uncertaintyPackage.CLASS__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case MM_uncertaintyPackage.CLASS__SUBS_ALLOWED:
				return subsAllowed != SUBS_ALLOWED_EDEFAULT;
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
		result.append(", mandatoryAllowed: ");
		result.append(mandatoryAllowed);
		result.append(", isAbstract: ");
		result.append(isAbstract);
		result.append(", subsAllowed: ");
		result.append(subsAllowed);
		result.append(')');
		return result.toString();
	}

} //ClassImpl
