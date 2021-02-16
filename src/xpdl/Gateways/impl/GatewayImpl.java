/**
 */
package xpdl.Gateways.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import xpdl.FlowObject;

import xpdl.Gateways.Gateway;
import xpdl.Gateways.GatewaysPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xpdl.Gateways.impl.GatewayImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link xpdl.Gateways.impl.GatewayImpl#getName <em>Name</em>}</li>
 *   <li>{@link xpdl.Gateways.impl.GatewayImpl#isSplit <em>Split</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GatewayImpl extends MinimalEObjectImpl.Container implements Gateway {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<FlowObject> target;

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
	 * The default value of the '{@link #isSplit() <em>Split</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSplit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SPLIT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSplit() <em>Split</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSplit()
	 * @generated
	 * @ordered
	 */
	protected boolean split = SPLIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GatewaysPackage.Literals.GATEWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FlowObject> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<FlowObject>(FlowObject.class, this, GatewaysPackage.GATEWAY__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GatewaysPackage.GATEWAY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSplit() {
		return split;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSplit(boolean newSplit) {
		boolean oldSplit = split;
		split = newSplit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GatewaysPackage.GATEWAY__SPLIT, oldSplit, split));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GatewaysPackage.GATEWAY__TARGET:
				return getTarget();
			case GatewaysPackage.GATEWAY__NAME:
				return getName();
			case GatewaysPackage.GATEWAY__SPLIT:
				return isSplit();
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
			case GatewaysPackage.GATEWAY__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends FlowObject>)newValue);
				return;
			case GatewaysPackage.GATEWAY__NAME:
				setName((String)newValue);
				return;
			case GatewaysPackage.GATEWAY__SPLIT:
				setSplit((Boolean)newValue);
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
			case GatewaysPackage.GATEWAY__TARGET:
				getTarget().clear();
				return;
			case GatewaysPackage.GATEWAY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GatewaysPackage.GATEWAY__SPLIT:
				setSplit(SPLIT_EDEFAULT);
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
			case GatewaysPackage.GATEWAY__TARGET:
				return target != null && !target.isEmpty();
			case GatewaysPackage.GATEWAY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GatewaysPackage.GATEWAY__SPLIT:
				return split != SPLIT_EDEFAULT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(", Split: ");
		result.append(split);
		result.append(')');
		return result.toString();
	}

} //GatewayImpl
