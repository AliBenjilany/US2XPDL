/**
 */
package xpdl.Activities;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xpdl.Activities.SubProcess#getSubProcess <em>Sub Process</em>}</li>
 * </ul>
 *
 * @see xpdl.Activities.ActivitiesPackage#getSubProcess()
 * @model
 * @generated
 */
public interface SubProcess extends Activity {
	/**
	 * Returns the value of the '<em><b>Sub Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Process</em>' reference.
	 * @see #setSubProcess(xpdl.Process)
	 * @see xpdl.Activities.ActivitiesPackage#getSubProcess_SubProcess()
	 * @model required="true"
	 * @generated
	 */
	xpdl.Process getSubProcess();

	/**
	 * Sets the value of the '{@link xpdl.Activities.SubProcess#getSubProcess <em>Sub Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Process</em>' reference.
	 * @see #getSubProcess()
	 * @generated
	 */
	void setSubProcess(xpdl.Process value);

} // SubProcess
