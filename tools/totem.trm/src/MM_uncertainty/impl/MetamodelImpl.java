/**
 */
package MM_uncertainty.impl;

import MM_uncertainty.DataType;
import MM_uncertainty.MM_uncertaintyPackage;
import MM_uncertainty.Metamodel;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metamodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MM_uncertainty.impl.MetamodelImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link MM_uncertainty.impl.MetamodelImpl#getDataType <em>Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetamodelImpl extends MinimalEObjectImpl.Container implements Metamodel {
	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<MM_uncertainty.Class> classes;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> dataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetamodelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MM_uncertaintyPackage.Literals.METAMODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MM_uncertainty.Class> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentEList<MM_uncertainty.Class>(MM_uncertainty.Class.class, this, MM_uncertaintyPackage.METAMODEL__CLASSES);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataType> getDataType() {
		if (dataType == null) {
			dataType = new EObjectContainmentEList<DataType>(DataType.class, this, MM_uncertaintyPackage.METAMODEL__DATA_TYPE);
		}
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MM_uncertaintyPackage.METAMODEL__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
			case MM_uncertaintyPackage.METAMODEL__DATA_TYPE:
				return ((InternalEList<?>)getDataType()).basicRemove(otherEnd, msgs);
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
			case MM_uncertaintyPackage.METAMODEL__CLASSES:
				return getClasses();
			case MM_uncertaintyPackage.METAMODEL__DATA_TYPE:
				return getDataType();
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
			case MM_uncertaintyPackage.METAMODEL__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends MM_uncertainty.Class>)newValue);
				return;
			case MM_uncertaintyPackage.METAMODEL__DATA_TYPE:
				getDataType().clear();
				getDataType().addAll((Collection<? extends DataType>)newValue);
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
			case MM_uncertaintyPackage.METAMODEL__CLASSES:
				getClasses().clear();
				return;
			case MM_uncertaintyPackage.METAMODEL__DATA_TYPE:
				getDataType().clear();
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
			case MM_uncertaintyPackage.METAMODEL__CLASSES:
				return classes != null && !classes.isEmpty();
			case MM_uncertaintyPackage.METAMODEL__DATA_TYPE:
				return dataType != null && !dataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MetamodelImpl
