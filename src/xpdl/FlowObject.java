/**
 */
package xpdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xpdl.FlowObject#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see xpdl.XpdlPackage#getFlowObject()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface FlowObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link xpdl.FlowObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see xpdl.XpdlPackage#getFlowObject_Target()
	 * @model
	 * @generated
	 */
	EList<FlowObject> getTarget();

} // FlowObject
