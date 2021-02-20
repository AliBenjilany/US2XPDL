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
 *   <li>{@link xpdl.Process#getObjective <em>Objective</em>}</li>
 *   <li>{@link xpdl.Process#getPool <em>Pool</em>}</li>
 * </ul>
 *
 * @see xpdl.XpdlPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends EObject {
	/**
	 * Returns the value of the '<em><b>Objective</b></em>' attribute.
	 * The default value is <code>"No objective set for this process"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objective</em>' attribute.
	 * @see #setObjective(String)
	 * @see xpdl.XpdlPackage#getProcess_Objective()
	 * @model default="No objective set for this process" required="true"
	 * @generated
	 */
	String getObjective();

	/**
	 * Sets the value of the '{@link xpdl.Process#getObjective <em>Objective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objective</em>' attribute.
	 * @see #getObjective()
	 * @generated
	 */
	void setObjective(String value);

	/**
	 * Returns the value of the '<em><b>Pool</b></em>' containment reference list.
	 * The list contents are of type {@link xpdl.Pool}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pool</em>' containment reference list.
	 * @see xpdl.XpdlPackage#getProcess_Pool()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Pool> getPool();

} // Process
