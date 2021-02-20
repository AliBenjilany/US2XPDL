/**
 */
package xpdl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import xpdl.Pool;
import xpdl.XpdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xpdl.impl.ProcessImpl#getObjective <em>Objective</em>}</li>
 *   <li>{@link xpdl.impl.ProcessImpl#getPool <em>Pool</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessImpl extends MinimalEObjectImpl.Container implements xpdl.Process {
	/**
	 * The default value of the '{@link #getObjective() <em>Objective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjective()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECTIVE_EDEFAULT = "No objective set for this process";

	/**
	 * The cached value of the '{@link #getObjective() <em>Objective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjective()
	 * @generated
	 * @ordered
	 */
	protected String objective = OBJECTIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPool() <em>Pool</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPool()
	 * @generated
	 * @ordered
	 */
	protected EList<Pool> pool;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XpdlPackage.Literals.PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getObjective() {
		return objective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObjective(String newObjective) {
		String oldObjective = objective;
		objective = newObjective;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XpdlPackage.PROCESS__OBJECTIVE, oldObjective, objective));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Pool> getPool() {
		if (pool == null) {
			pool = new EObjectContainmentEList<Pool>(Pool.class, this, XpdlPackage.PROCESS__POOL);
		}
		return pool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XpdlPackage.PROCESS__POOL:
				return ((InternalEList<?>)getPool()).basicRemove(otherEnd, msgs);
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
			case XpdlPackage.PROCESS__OBJECTIVE:
				return getObjective();
			case XpdlPackage.PROCESS__POOL:
				return getPool();
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
			case XpdlPackage.PROCESS__OBJECTIVE:
				setObjective((String)newValue);
				return;
			case XpdlPackage.PROCESS__POOL:
				getPool().clear();
				getPool().addAll((Collection<? extends Pool>)newValue);
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
			case XpdlPackage.PROCESS__OBJECTIVE:
				setObjective(OBJECTIVE_EDEFAULT);
				return;
			case XpdlPackage.PROCESS__POOL:
				getPool().clear();
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
			case XpdlPackage.PROCESS__OBJECTIVE:
				return OBJECTIVE_EDEFAULT == null ? objective != null : !OBJECTIVE_EDEFAULT.equals(objective);
			case XpdlPackage.PROCESS__POOL:
				return pool != null && !pool.isEmpty();
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
		result.append(" (objective: ");
		result.append(objective);
		result.append(')');
		return result.toString();
	}

} //ProcessImpl
