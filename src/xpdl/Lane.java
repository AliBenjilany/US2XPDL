/**
 */
package xpdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xpdl.Lane#getName <em>Name</em>}</li>
 *   <li>{@link xpdl.Lane#getFlowobject <em>Flowobject</em>}</li>
 * </ul>
 *
 * @see xpdl.XpdlPackage#getLane()
 * @model
 * @generated
 */
public interface Lane extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see xpdl.XpdlPackage#getLane_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link xpdl.Lane#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Flowobject</b></em>' containment reference list.
	 * The list contents are of type {@link xpdl.FlowObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flowobject</em>' containment reference list.
	 * @see xpdl.XpdlPackage#getLane_Flowobject()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<FlowObject> getFlowobject();

} // Lane
