/**
 */
package xpdl.Activities.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import xpdl.Activities.ActivitiesPackage;
import xpdl.Activities.SubProcess;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xpdl.Activities.impl.SubProcessImpl#getSubProcess <em>Sub Process</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubProcessImpl extends ActivityImpl implements SubProcess {
	/**
	 * The cached value of the '{@link #getSubProcess() <em>Sub Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubProcess()
	 * @generated
	 * @ordered
	 */
	protected xpdl.Process subProcess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitiesPackage.Literals.SUB_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public xpdl.Process getSubProcess() {
		if (subProcess != null && subProcess.eIsProxy()) {
			InternalEObject oldSubProcess = (InternalEObject)subProcess;
			subProcess = (xpdl.Process)eResolveProxy(oldSubProcess);
			if (subProcess != oldSubProcess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitiesPackage.SUB_PROCESS__SUB_PROCESS, oldSubProcess, subProcess));
			}
		}
		return subProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public xpdl.Process basicGetSubProcess() {
		return subProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubProcess(xpdl.Process newSubProcess) {
		xpdl.Process oldSubProcess = subProcess;
		subProcess = newSubProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.SUB_PROCESS__SUB_PROCESS, oldSubProcess, subProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivitiesPackage.SUB_PROCESS__SUB_PROCESS:
				if (resolve) return getSubProcess();
				return basicGetSubProcess();
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
			case ActivitiesPackage.SUB_PROCESS__SUB_PROCESS:
				setSubProcess((xpdl.Process)newValue);
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
			case ActivitiesPackage.SUB_PROCESS__SUB_PROCESS:
				setSubProcess((xpdl.Process)null);
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
			case ActivitiesPackage.SUB_PROCESS__SUB_PROCESS:
				return subProcess != null;
		}
		return super.eIsSet(featureID);
	}

} //SubProcessImpl
