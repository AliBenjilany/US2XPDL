/**
 */
package xpdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xpdl.Process#getPool <em>Pool</em>}</li>
 * </ul>
 *
 * @see xpdl.XpdlPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends EObject {
	/**
	 * Returns the value of the '<em><b>Pool</b></em>' containment reference list.
	 * The list contents are of type {@link xpdl.Pool}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pool</em>' containment reference list.
	 * @see xpdl.XpdlPackage#getProcess_Pool()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pool> getPool();

} // Process
